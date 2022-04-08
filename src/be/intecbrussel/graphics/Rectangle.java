package be.intecbrussel.graphics;


public class Rectangle{
    private int height;
    private int width;
    private int x;
    private int y;

    public Rectangle() {
        this(1,1);
    }

    public Rectangle(int height, int width) {
        setHeight(height);
        setWidth(width);
        setX(50);
        setY(50);
    }

    public void setHeight(int height) {
        if (height < 0) {
            this.height = -height;
        } else {
            this.height = height;
        }
    }

    public void setWidth(int width) {
        this.width = Math.abs(width);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getArea() {
        return height * width;
    }

    public int getPerimeter() {
        return doubleHeight() + doubleWidth();
    }

    private int doubleHeight() {
        return 2 * height;
    }

    private int doubleWidth() {
        return 2 * width;
    }

    public void grow(int d) {
        if (d > 0) {
            this.height += d;
            this.width += d;
        }
    }


}
