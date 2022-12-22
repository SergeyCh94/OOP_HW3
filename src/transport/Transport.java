package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, String country, int year) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()){
            this.model = "default";
        } else {
            this.model = model;
        }

        if (country == null || country.isEmpty() || country.isBlank()){
            this.country = "default";
        } else {
            this.country = country;
        }

        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()){
            this.color = color;
        } else {
            this.color = "default";
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0){
            this.maxSpeed = maxSpeed;
        }  else {
            this.maxSpeed = 1;
        }
    }
}
