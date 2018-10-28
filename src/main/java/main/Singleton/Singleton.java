package main.Singleton;

public class Singleton {

    private static Singleton instance = null;
    public String name;

    private Singleton(){
        System.out.println("Singleton created");
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
