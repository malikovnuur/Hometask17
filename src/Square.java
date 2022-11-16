public class Square extends Shape{
    private int side1;

    public Square(int side1) {
        this.side1 = side1;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    @Override
    public double getPerimeter() {
        return 4*side1;
    }
}
