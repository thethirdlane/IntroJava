package ttl.introjava.bank.app;

/**
 * @author whynot
 */
public class StaticDemo {

    private static int counter = 0;

    public StaticDemo() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}

class App {
    int i;

    public static void main(String[] args) {

        App app = new App();
        app.recursiveMethod(10);

        for (int i = 0; i < 10; i++) {
            app.recursiveMethod(i);
        }

        /*
        System.out.println("Intances of StaticDemo: " + StaticDemo.getCounter());

        StaticDemo sd = new StaticDemo();
        StaticDemo sd2 = new StaticDemo();
        StaticDemo sd4 = new StaticDemo();
        StaticDemo sd5 = new StaticDemo();
        StaticDemo sd6 = new StaticDemo();

        System.out.println("Intances of StaticDemo: " + StaticDemo.getCounter());

         */
    }

    public void recursiveMethod(int i) {
        if (i == 0) {
            return;
        }
        recursiveMethod(i - 1);
        System.out.println("returning with " + i);

    }
}
