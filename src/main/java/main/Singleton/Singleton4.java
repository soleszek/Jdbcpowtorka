package main.Singleton;

public class Singleton4 {
    private static Singleton4 instance = null;

    private Singleton4(){};

    public Singleton4 getInstance() {
        if(instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
