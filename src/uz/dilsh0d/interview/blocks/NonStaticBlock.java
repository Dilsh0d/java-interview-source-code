package uz.dilsh0d.interview.blocks;

/**
 * @author Tadjiev Dilshod
 */
public class NonStaticBlock {
    private int t =0;

    {
        t = 10;
        System.out.println("First Non_static block");
    }
    {
        System.out.println("Second Non_static block");
    }

    public NonStaticBlock() {
        System.out.println("Constructor block");
    }

    public static void main(String[] args) {
        NonStaticBlock nonStaticBlock = new NonStaticBlock();
    }
}
