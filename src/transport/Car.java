package transport;


import java.time.LocalDate;

import java.util.Objects;

public class Car extends Transport{
    private double engineVolume;
    private String color;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTiers;


    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, сборка в " + getCountry() + ", " +
                getColor() + " цвет кузова, обьем двигателя " + getEngineVolume() + " - л." + "\n" + "Коробка передач " + getTransmission() +
                ", Тип кузова " + getBodyType() + ", Регистрационный номер " + getRegistrationNumber() + ", Количество мест " +
                getNumberOfSeats() + ", Тип резины летняя " + summerTiers;
    }

    public void changeTiers(int month) {
        if (month <= 0 || month > 12){
            System.out.println("Такого месяца нет");
        } else {
            summerTiers = month >= 5 && month < 9;
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats, boolean summerTiers) {

        super(brand, model, country, year);

        if (numberOfSeats <= 0){
            this.numberOfSeats = 1;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        if (registrationNumber == null || registrationNumber.isEmpty()){
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (bodyType == null || bodyType.isEmpty()){
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (transmission == null || transmission.isEmpty()){
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color == "") {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        this.summerTiers = summerTiers;
    }

    public class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {

            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;

        }
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public class Insurance {
        private final LocalDate validityPeriod;
        private final double cost;
        private final String number;

        public Insurance(LocalDate validityPeriod, double cost, String number) {
            this.validityPeriod = Objects.requireNonNullElseGet(validityPeriod, LocalDate::now);
            if (cost >= 0) {
                this.cost = cost;
            } else {
                this.cost = 0;
            }
            if (number == null || number.isEmpty()) {
                this.number = "default";
            } else {
                this.number = number;
            }
        }

        public void checkExpirationDate() {
            if (validityPeriod.isBefore(LocalDate.now().minusDays(365))) {
                System.out.println("Нужно менять страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Неверный номер");
            }
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTiers() {
        return summerTiers;
    }

    public void setSummerTiers(boolean summerTiers) {
        this.summerTiers = summerTiers;
    }
}