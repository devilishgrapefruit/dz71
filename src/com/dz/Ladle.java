package com.dz;

public class Ladle extends Dish{
    protected int radius;
    protected int deep;
    protected double volume;

    public Ladle(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
        calcVolume();
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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void calcVolume() {
        volume = radius * deep * 5;
    }
    public void boilEggs(){
        System.out.println("Eggs are boiled");
        setPollution(true);
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
        return "Ladle{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", pollution=" + pollution +
                ", radius=" + radius +
                ", deep=" + deep +
                ", volume=" + volume +
                '}';
    }
}
