package com.dz;

public class Fork extends Dish{
    String type = "dinner";

    public Fork(String type) {
        this.type = type;
        material = "silver";
        color = "silver";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void eat(){
        System.out.println("yum-yum");
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
        return "Fork{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", pollution=" + pollution +
                ", type='" + type + '\'' +
                '}';
    }
}
