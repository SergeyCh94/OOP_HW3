import transport.Bus;
import transport.Car;


public class Main {
    public static void main(String[] args) {
        Car ladaCar = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия", "Автомат", "Седан",
                "1234-IH3", 5, true);
        Car audiCar = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия", "Автомат",
                "Универсал", "1212 - IH3", 5, false);
        Car bmwCar = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия", "Автомат",
                "Универсал", "1212 - IH3", 5, true);
        Car kiaCar = new Car("KIA", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея", "Автомат",
                "Универсал", "1212 - IH3", 5, true);
        Car hyundaiCar = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2015, "Южная Корея", "Автомат",
                "Универсал", "1212 - IH3", 5, false);

        Bus MAZ1 = new Bus("MAZ", "203", "Belarus", 2015, "Зеленый");
        Bus MAZ2= new Bus("MAZ", "205", "Belarus", 2016, "Желтый");
        Bus MAZ3 = new Bus("MAZ", "206", "Belarus", 2017, "Красный");

        System.out.println(MAZ1);
        System.out.println(MAZ2);
        System.out.println(MAZ3);
    }
}