package DSA.OOPS;

public class MethodOverloading {
    
    public int area(int side){
        return side*side;
    }

    public int area(int length, int breadth){
        return length*breadth;
    }

    public double area(double height, int base){
        return 0.5*height*base;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        int squareArea = obj.area(5);
        int rectangleArea = obj.area(3, 6);
        double rightAngleTriangle = obj.area(4.5, 6);
        System.out.println("Area of square: " + squareArea);
        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Area of right angle triangle: " + rightAngleTriangle);
    }
}
