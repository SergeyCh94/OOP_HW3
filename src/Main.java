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

        System.out.println(ladaCar);
        System.out.println(audiCar);
        System.out.println(bmwCar);
        System.out.println(kiaCar);
        System.out.println(hyundaiCar);
        System.out.println(ladaCar);

    }
}