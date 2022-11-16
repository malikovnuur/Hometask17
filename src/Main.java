public class Main {
    public static void main(String[] args){

        Rectangle rectangle=new Rectangle(8,4,8,4);
        System.out.println("Perimeter of Rectangle" +"="+ rectangle.getPerimeter());

        System.out.println("`````````````````````````````");

        Square square=new Square(4);
        System.out.println("Perimeter of Square" +"="+ square .getPerimeter());

        System.out.println("`````````````````````````````");

        Circle circle=new Circle(6);
        System.out.println("Perimeter of Circle" +"="+circle.getPerimeter());

        System.out.println("`````````````````````````````");

        Triangle triangle=new Triangle(3,2,4);
        System.out.println("Perimeter of Triangle" +"="+triangle.getPerimeter());

        System.out.println("`````````````````````````````");

        Pentagon pentagon=new Pentagon(1,3,4,7,9);
        System.out.println("Perimeter of Pentagon" +"=" +pentagon.getPerimeter());





    }
}