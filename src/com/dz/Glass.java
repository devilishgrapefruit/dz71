package com.dz;

public class Glass extends Dish{
    double volume;

    public Glass(double volume) {
        this.volume = volume;
        material = "glass";
        color = "transparent";
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void drink(){
        System.out.println("*drinking*");
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
        return "Glass{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", pollution=" + pollution +
                ", volume=" + volume +
                '}';
    }
}
