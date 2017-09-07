package com.moondeuk;

import javax.validation.constraints.NotNull;

public class Car {

    @NotNull
    private String pono;
    private String model;
    private String color;
    private String type;
    private String year;

    public Car() {
    }

    public Car(String pono, String model, String color, String type, String year) {
        this.pono = pono;
        this.model = model;
        this.color = color;
        this.type = type;
        this.year = year;
    }

    public String getPono() {
        return pono;
    }
    public void setPono(String pono) {
        this.pono = pono;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("pono='").append(pono).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", year='").append(year).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
