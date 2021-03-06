package com.dz;


public class Pan  extends  Dish{
    protected int radius;
    protected int deep;
    protected double volume;

    public Pan(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
        material = "cast iron";
        color = "gray";
    }

    public void calcVolume() {
        volume =  radius* deep* 10;
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

    public void makeBorsh(){
        System.out.println("Borsh svaren");
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
        return "Pan{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", pollution=" + pollution +
                ", radius=" + radius +
                ", deep=" + deep +
                ", volume=" + volume +
                '}';
    }
}