package uz.dilsh0d.interview.oop.abstraction;

/**
 * As abstraction is one of the core principles of Object-oriented programming practices and
 * Java following all OOPs principles, abstraction is one of the major building blocks of java language.
 *
 * In java, abstraction is achieved by interfaces and abstract classes.
 * Interfaces allows you to abstract the implemetation completely while
 * abstract classes allow partial abstraction as well.
 *
 * Data abstraction spans from creating simple data objects to
 * complex collection implementations such as HashMap or HashSet.
 */
public abstract class Vehicle {
    protected boolean start = false;
    protected boolean stop = false;
    protected boolean drive = false;
    protected int changeGear = 0;
    protected boolean reverse = false;

    public Vehicle(boolean start) {
        this.start = start;
    }

    protected abstract void start();
    protected abstract void stop();
    protected abstract void drive();
    protected abstract void changeGear();
    protected abstract void reverse();

    // standard getters and setters
}
