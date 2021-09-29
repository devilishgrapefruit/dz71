package com.dz;


public abstract class Dish {
    String color = "white";
    String material = "aluminum";
    boolean pollution = false;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isPollution() {
        return pollution;
    }

    public void setPollution(boolean pollution) {
        this.pollution = pollution;
    }
    public void wash() {
        setPollution(false);
    }
    @Override
    public String toString() {
        return "Dish{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", pollution=" + pollution +
                '}';
    }
}
