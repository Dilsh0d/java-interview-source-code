package uz.dilsh0d.interview.classloader;

import com.sun.javafx.util.Logging;

import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * If the last child class loader isn't able to load the class either,
 * it throws java.lang.NoClassDefFoundError or java.lang.ClassNotFoundException.
 *
 * NoClassDefFoundError, LinkageError, ClassNotFoundException, NoSuchMethodError, ClassCastException
 *
 * @author Tadjiev Dilshod
 */
public class LoaderMain {
    public static void main(String[] args) {
        System.out.println("LoaderMain class loader = " + LoaderMain.class.getClassLoader()); // sun.misc.Launcher.AppClassLoader
        System.out.println("LoaderMain class loader all load resources urls = " + Arrays.toString(((URLClassLoader)LoaderMain.class.getClassLoader()).getURLs())); // java.net.URLClassLoader
        System.out.println("Logging class loader = " + Logging.class.getClassLoader()); // sun.misc.Launcher.ExtClassLoader
        System.out.println("ArrayList class loader = " + ArrayList.class.getClassLoader()); //  java.lang.ClassLoader  libraries located in $JAVA_HOME/jre/lib directory
    }
}
