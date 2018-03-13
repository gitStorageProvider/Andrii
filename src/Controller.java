import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

public class Controller {

    private String name;
    private Set<Car> carSet = new HashSet<>();
    private int capacity;
    private final StringBuilder stringBuilder = new StringBuilder();

    private Controller(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public static Controller createController(String name, int capacity) {
        Controller controller;
        if (name == null || capacity < 1) {
            controller = null;
            System.out.println("Wrong arguments! Create null object");
        } else {
            controller = new Controller(name, capacity);
            System.out.println("Controller created");
        }
        return controller;
    }

    public boolean addCar(Car car) {
        boolean b = false;
        if (car != null && carSet.size() < capacity) {
            carSet.add(car);
            b = true;
        }
        return b;
    }

    public boolean deleteCar(Car car) {
        boolean b = false;
        if (carSet != null && carSet.contains(car)) {
            carSet.remove(car);
            b = true;
        }
        return b;
    }

    public String getCarListByBrand(String brand) {
        if (capacity == 0 || carSet.isEmpty()) {
            stringBuilder.append("Cars lot is empty");
        } else {
            for (Car car : carSet) {
                if (car.getBrand().equals(brand)) {
                    stringBuilder.append("\t");
                    stringBuilder.append(car);
                    stringBuilder.append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }

    public String getCarListByModelAndYears(String model, int years) {
        if (capacity == 0 || carSet.isEmpty()) {
            stringBuilder.append("Cars lot is empty");
        } else {
            for (Car car : carSet) {
                if (car.getModel().equals(model) && GregorianCalendar.getInstance().get(Calendar.YEAR) - car.getYearOfRelease() > years) {
                    stringBuilder.append("\t");
                    stringBuilder.append(car);
                    stringBuilder.append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }

    public String getCarListByYearAndPrice(int year, double price) {
        if (capacity == 0 || carSet.isEmpty()) {
            stringBuilder.append("Cars lot is empty");
        } else {
            for (Car car : carSet) {
                if (car.getYearOfRelease().equals(year) && car.getPrice() > price) {
                    stringBuilder.append("\t");
                    stringBuilder.append(car);
                    stringBuilder.append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Controller that = (Controller) o;

        if (capacity != that.capacity) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + capacity;
        return result;
    }

    @Override
    public String toString() {
        stringBuilder.append("Controller ");
        stringBuilder.append(name);
        stringBuilder.append(", capacity: ");
        stringBuilder.append(capacity);
        stringBuilder.append(", amount of cars: ");
        stringBuilder.append(carSet.size());
        stringBuilder.append("\n");
        stringBuilder.append("Car's list: ");
        stringBuilder.append("\n");
        for (Car car : carSet){
            stringBuilder.append("\t");
            stringBuilder.append(car);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
