package org.example;

import java.util.Objects;

public class Rectangle {
    private int w, h;

    @Override
    public String toString() {
        return "Rectangle{" +
                "w=" + w +
                ", h=" + h +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        if (w == rectangle.h && h == rectangle.w) return true;
        return w == rectangle.w && h == rectangle.h;
    }

    @Override
    public int hashCode() {
        return Objects.hash(w + h);
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int getArea() {
        return w * h;
    }
}
