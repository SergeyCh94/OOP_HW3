package transport;

public class Bus extends Transport{

    private String color;

    @Override
    public String toString() {
        return "Модель" + getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, сборка в " + getCountry() + ", " +
                getColor() + " цвет кузова.";
    }

    public Bus(String brand, String model, String country, int year, String color) {
        super(brand, model, country, year);


        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
