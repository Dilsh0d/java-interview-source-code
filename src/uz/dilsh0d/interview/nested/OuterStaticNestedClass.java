package uz.dilsh0d.interview.nested;

/**
 * @author Tadjiev Dilshod
 */
public class OuterStaticNestedClass {
    private static String printText = "Hello static World!";
    private boolean isRunning = false;

    public OuterStaticNestedClass() {
        this.isRunning = true;
    }

    public void isRunning() {
        System.out.println(String.format("Is running outer class = %s",isRunning));
    }

    static class NestedStaticClass {

        private int callCount = 0;

        void action(){
            callCount++;
            System.out.println(String.format("METHOD CALL COUNT = %s",callCount));
            System.out.println(printText);
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
        OuterStaticNestedClass outerStaticClass = new OuterStaticNestedClass();
        outerStaticClass.isRunning();
        NestedStaticClass nestedStaticClass = new NestedStaticClass();
        nestedStaticClass.action();
        nestedStaticClass.action();
        nestedStaticClass.action();
        nestedStaticClass.action();
        nestedStaticClass.getCallCount();
    }
}
