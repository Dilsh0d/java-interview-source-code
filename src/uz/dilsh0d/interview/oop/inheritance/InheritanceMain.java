package uz.dilsh0d.interview.oop.inheritance;

/**
 * @author Tadjiev Dilshod
 *
 * Types of Inheritance in Java
 * The different types of Inheritance are:
 *
 * Single Inheritance
 * Multiple Inheritance
 * Multi-Level Inheritance
 * Hierarchical Inheritance
 * Hybrid Inheritance
 */
public class InheritanceMain {

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.print();

        SubClass subClass = new SubClass();
        subClass.print();
        subClass.byeBye();
    }
}
