package main.Singleton;

public class MainSingleton {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton2 s3 = Singleton2.INSTANCE;
        Singleton2 s4 = Singleton2.INSTANCE;

        s1.name = "Sylwester";
        s2.name = "Frodo";

        System.out.println(s1.name);
        System.out.println(s1.name);

        s3.name = "Pterodaktyl";
        s4.name = "Welociraptoor";

        System.out.println(s3.name);
        System.out.println(s4.name);
    }
}
