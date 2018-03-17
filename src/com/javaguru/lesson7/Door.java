package com.javaguru.lesson7;

import java.util.Objects;

class Door {

    private String color;
    private String material;
    private String size;
    private String manufacturer;

    public Door() {
    }

    Door(String color, String material, String size, String manufacturer) {
        this.color = color;
        this.material = material;
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Door{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return Objects.equals(color, door.color) &&
                Objects.equals(material, door.material) &&
                Objects.equals(size, door.size) &&
                Objects.equals(manufacturer, door.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, material, size, manufacturer);
    }
}
