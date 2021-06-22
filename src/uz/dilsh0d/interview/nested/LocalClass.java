package uz.dilsh0d.interview.nested;

/**
 * @author Tadjiev Dilshod
 */
public class LocalClass {

    private static boolean isFire = false;
    private String car;

    public LocalClass() {
        this.car = "Fire fighting";
        isFire = false;
    }


    public void turnOfFiring() {
        System.out.println(String.format("What is car type=%s",car));
        class Water {
            int liter;

            Water(int liter) {
                this.liter = liter;
            }

            public int getLiter() {
                return liter;
            }

            void pour() {
                this.liter = 0;
            }
        }

        Water water = new Water(1000);
        System.out.println(String.format("Capacity of %s car in liter=%s",car,water.getLiter()));
        water.pour();
        System.out.println(String.format("Capacity of %s car in liter=%s after pour water",car,water.getLiter()));
    }

    public static void main(String[] args) {
        LocalClass localClass = new LocalClass();
        localClass.turnOfFiring();
    }
}
