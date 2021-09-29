package com.dz;

public class Plate extends Dish{
    int radius;
    int deep;
    double volume;
    boolean pattern;

    public Plate(int radius, int deep, boolean pattern) {
        this.radius = radius;
        this.deep = deep;
        calcVolume();
        this.pattern = pattern;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getDeep() {
        return deep;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }

    public void calcVolume() {
        volume = radius * deep;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public boolean isPattern() {
        return pattern;
    }
    @Override
    public void wash() {
        super.wash();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getMaterial() {
        return super.getMaterial();
    }

    @Override
    public void setMaterial(String material) {
        super.setMaterial(material);
    }

    @Override
    public boolean isPollution() {
        return super.isPollution();
    }

    @Override
    public void setPollution(boolean pollution) {
        super.setPollution(pollution);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", pollution=" + pollution +
                ", radius=" + radius +
                ", deep=" + deep +
                ", volume=" + volume +
                ", pattern=" + pattern +
                '}';
    }
}
