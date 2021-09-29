package com.dz;

public class Cup extends Dish{
    String print;
    double volume;

    public Cup(String print, double volume) {
        this.print = print;
        this.volume = volume;
        material = "ceramics";
    }

    public String getPrint() {
        return print;
    }

    public void setPrint(String print) {
        this.print = print;
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
    public void wash() {
        super.wash();
    }
    @Override
    public String toString() {
        return "Cup{" +
                "print='" + print + '\'' +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", pollution=" + pollution +
                '}';
    }
}
