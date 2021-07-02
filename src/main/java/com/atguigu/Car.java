package com.atguigu;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/1 10:48
 */
public class Car {
    private String carName;
    private String color;
    private Integer price;

    public Car(String carName, String color, Integer price) {
        this.carName = carName;
        this.color = color;
        this.price = price;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
