package uz.dilsh0d.interview.classes;

import uz.dilsh0d.interview.classes.sample.Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * @author Tadjiev Dilshod
 */
public class CreateObject5Ways {

    public static void main(String[] args) throws Exception {
        // 1. Using new keyword  -- Constructor call involved
        Employee emp1 = new Employee();
        emp1.setName("Employee 1");

        // 2. Using Class class's newInstance() method -- Constructor call involved
        Employee emp2 = Employee.class.newInstance();
        emp2.setName("Employee 2");

        // 3. Using Constructor class's newInstance() method
        Constructor<Employee> constructor = Employee.class.getConstructor();
        Employee emp3 = constructor.newInstance();
        emp3.setName("Employee 3");

        // 4. Using clone() method -- Constructor call not involved
        Employee emp4 = (Employee) emp3.clone();
        emp4.setName("Employee 4");

        // 5. Using Deserialization -- Constructor call not involved
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
        out.writeObject(emp4);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
        Employee emp5 = (Employee) in.readObject();
        emp5.setName("Employee 5");

        System.out.println(emp1+", hashcode : "+emp1.hashCode());
        System.out.println(emp2+", hashcode : "+emp2.hashCode());
        System.out.println(emp3+", hashcode : "+emp3.hashCode());
        System.out.println(emp4+", hashcode : "+emp4.hashCode());
        System.out.println(emp5+", hashcode : "+emp5.hashCode());
    }
}
