package uz.dilsh0d.interview.classloader;

/**
 * Get more info follow the link
 * https://javarevisited.blogspot.com/2012/12/how-classloader-works-in-java.html#axzz6zB6sNyFr
 *
 * @author Tadjiev Dilshod
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        try {
            //printing ClassLoader of this class
            System.out.println("ClassLoaderTest.getClass().getClassLoader() : " + ClassLoaderTest.class.getClassLoader());


            //trying to explicitly load this class again using Extension class loader
            Class.forName("uz.dilsh0d.interview.classloader.ClassLoaderTest", true, ClassLoaderTest.class.getClassLoader().getParent());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
