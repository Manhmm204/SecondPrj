/*
 * @(#) Rectangle.java    1.0     01/09/2024
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.se;

/*
 * @description
 * @author Do Duc Manh
 * @version 1.0
 * @date 01/09/2024
 */

public class Rectangle {
    private double length;
    private double width;
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }
    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        if (width < 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Tính diện tích hình chữ nhật.
     *
     * @return diện tích
     */
    public double getArea() {
        return length * width;
    }
    /**
     * Tính chu vi hình chữ nhật.
     *
     * @return chu vi
     */
    public double getPerimeter() {
        return (length + width) * 2;
    }
    @Override
    public String toString() {
        return String.format("HCN chieu dai = %.2f cm , chieu rong = %.2f cm  va co dien tich = %.2f cm^2, chu vi = %.2f cm", length, width, getArea(), getPerimeter());
    }

}
