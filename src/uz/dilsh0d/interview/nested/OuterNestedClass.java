package uz.dilsh0d.interview.nested;

/**
 * @author Tadjiev Dilshod
 *
 * Why Use Nested Classes?
 * Compelling reasons for using nested classes include the following:
 *
 * It is a way of logically grouping classes that are only used in one place: If a class is useful to only one other class,
 * then it is logical to embed it in that class and keep the two together. Nesting such "helper classes" makes their package more streamlined.
 *
 * It increases encapsulation: Consider two top-level classes, A and B, where B needs access to members of A that would otherwise be declared private.
 * By hiding class B within class A, A's members can be declared private and B can access them. In addition, B itself can be hidden from the outside world.
 *
 * It can lead to more readable and maintainable code: Nesting small classes within top-level classes places the code closer to where it is used.
 */
public class OuterNestedClass {

    private static String printText = "Hello dynamic World!";
    private boolean isRunning = false;

    public OuterNestedClass() {
        this.isRunning = true;
    }


    class NestedClass {

        private int callCount = 0;

        void action(){
            callCount++;
            System.out.println(String.format("METHOD CALL COUNT = %s",callCount));
            System.out.println(printText);
            System.out.println(String.format("Is running outer class = %s",isRunning));
        }

        public void getCallCount() {
            System.out.println("-------------------------------------");
            System.out.println("-------------------------------------");
            System.out.println(String.format("METHOD CALL COUNT = %s",callCount));
            System.out.println("-------------------------------------");
            System.out.println("-------------------------------------");
        }
    }

    public static void main(String[] args) {
        OuterNestedClass outerClass = new OuterNestedClass();
        OuterNestedClass.NestedClass nestedClass = outerClass.new NestedClass();
        nestedClass.action();
        nestedClass.action();
        nestedClass.action();
        nestedClass.action();
        nestedClass.getCallCount();
    }
}
