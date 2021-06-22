package uz.dilsh0d.interview.nested;

import uz.dilsh0d.interview.nested.simple.SimpleAbstractClass;
import uz.dilsh0d.interview.nested.simple.SimpleInterfaceClass;

/**
 * @author Tadjiev Dilshod
 */
public class AnonymousClass {

    void runAnonymousClasses(){
        SimpleAbstractClass simpleAbstractClass = new SimpleAbstractClass() {
            public void start(){
                System.out.println("Call SimpleAbstractClass Anonymous class="+ this.getClass().getSimpleName());
                System.out.println("Call SimpleAbstractClass Anonymous class="+ this.getClass().getName());
            }
        };
        simpleAbstractClass.start();

        SimpleInterfaceClass simpleInterfaceClass = new SimpleInterfaceClass() {
            @Override
            public void start() {
                System.out.println("Call SimpleInterfaceClass Anonymous class="+ this.getClass().getSimpleName());
                System.out.println("Call SimpleInterfaceClass Anonymous class="+ this.getClass().getName());
            }
        };

        simpleInterfaceClass.start();
    }

    public static void main(String[] args) {
        AnonymousClass anonymousClass = new AnonymousClass();
        anonymousClass.runAnonymousClasses();
    }
}
