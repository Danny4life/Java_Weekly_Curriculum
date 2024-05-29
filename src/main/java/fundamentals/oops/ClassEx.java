package fundamentals.oops;

public class ClassEx {
    int rectangle;

    public ClassEx(int rectangle) {
        this.rectangle = rectangle;
    }

    public int getRectangle() {
        return rectangle;
    }

    public void setRectangle(int rectangle) {
        this.rectangle = rectangle;
    }

    public void display(){
        System.out.println("Area of a rectangle is : " + rectangle);
    }
}
