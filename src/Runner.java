import java.util.Calendar;
import java.util.GregorianCalendar;

public class Runner {

    public static void main(String[] args) {
        System.out.println(GregorianCalendar.getInstance().get(Calendar.YEAR));

        Car car1 = new Car("Toyota", "Camry", 2009, "Black", 15000.0, "AI 12 12 FR");
        Car car2 = new Car("Nissan", "Juk", 2010, "White", 18000.0, "AI 34 13 TT");
        Car car3 = new Car("Mazda", "3", 2011, "Red", 20000.0, "AI 55 13 TT");
        Car car4 = new Car("Toyota", "Camry", 2006, "Yellow", 10000.0, "AI 09 12 TT");
        Car car5 = new Car("Toyota", "Camry", 2015, "White", 30000.0, "AI 12 11 TT");
        Car car6 = new Car("Nissan", "Juk", 2011, "White", 10000.0, "AI 12 87 TT");
        Car car7 = new Car("Nissan", "Juk", 2016, "Red", 20000.0, "AI 10 00 TT");
        Car car8 = new Car("Mazda", "3", 2010, "White", 18000.0, "AI 77 13 TT");
        Car car9 = new Car("Mazda", "3", 2012, "Green", 20000.0, "AI 98 13 TT");
        Car car10 = new Car("Mazda", "3", 2015, "Blue", 25000.0, "AI 61 83 TT");

        System.out.println(car1);

        Controller controller1 = Controller.createController("First", 0);
        System.out.println(controller1);
        System.out.println();

        Controller controller2 = Controller.createController("First", 10);
        System.out.println(controller2);
        System.out.println();

        System.out.println(controller2.addCar(car1));
        System.out.println(controller2.addCar(car2));
        System.out.println(controller2.addCar(car3));
        System.out.println(controller2.addCar(car4));
        System.out.println(controller2.addCar(car5));
        System.out.println(controller2.addCar(car6));
        System.out.println(controller2.addCar(car7));
        System.out.println(controller2.addCar(car8));
        System.out.println(controller2.addCar(car9));
        System.out.println(controller2.addCar(car10));
        System.out.println(controller2);

        System.out.println("Method getCarListByBrand");
        System.out.println(controller2.getCarListByBrand("sfdef"));
        System.out.println(controller2.getCarListByBrand("Mazda"));
        System.out.println();

        System.out.println("Method getCarListByModelAndYears");
        System.out.println(controller2.getCarListByModelAndYears("3", 6));

        System.out.println("Method getCarListByYearAndPrice");
        System.out.println(controller2.getCarListByYearAndPrice(2010, 10000));
    }
}
