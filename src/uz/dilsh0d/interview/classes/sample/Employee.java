package uz.dilsh0d.interview.classes.sample;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Tadjiev Dilshod
 */
public class Employee implements Cloneable, Serializable {

    private static final long serialVersionUID = 2L;

    private String name;

    public Employee() {
        System.out.println("Employee constructor involved!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return Objects.equals(name, employee.name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return String.format("Employee=[name='%s']",name);
    }
}
