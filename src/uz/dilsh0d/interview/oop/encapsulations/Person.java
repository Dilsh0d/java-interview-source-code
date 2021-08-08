package uz.dilsh0d.interview.oop.encapsulations;

/**
 * @author Tadjiev Dilshod
 */
public class Person {

    private int age;
    private boolean health = true;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }
}
