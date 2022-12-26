package JavaProblems.Advanced.Singleton;

public class Singleton {

    public static String str ;

    private Singleton() {
    }

    static Singleton getSingleInstance() {
        return new Singleton();
    }
}
