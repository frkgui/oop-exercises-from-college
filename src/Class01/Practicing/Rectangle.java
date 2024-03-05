package Class01.Practicing;

public class Rectangle {

    int base;
    int height;
    int rectangleArea;

    public int getRectangleArea(int base, int height){
        this.rectangleArea = base * height;
        return rectangleArea;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
