package Task1;

public class Circle {
    private double radius;
    private String color;

    public Circle() { 
        this.radius = 1.0;
        this.color = "merah";
    }

    public Circle(double r) { 
        this.radius = r;
        this.color = "merah";
    }

    public Circle(double r, String c) { 
        this.radius = r;
        this.color = c;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}

