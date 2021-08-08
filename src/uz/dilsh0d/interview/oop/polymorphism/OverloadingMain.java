package uz.dilsh0d.interview.opp.polymorphism;

public class OverloadingMain {
    public static void main(String[] args) {
        Shape myShape = new Shape();  // Create a Shapes object

        myShape.area();
        myShape.area(5);
        myShape.area(6.0,1.2);
        myShape.area(6,2);
    }
}
