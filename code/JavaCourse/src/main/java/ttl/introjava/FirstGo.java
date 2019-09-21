package ttl.introjava;

/**
 * @author whynot
 */
public class FirstGo {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Here we go with " + args[0]);
        }

        arrays();

    }

    public static void primitives() {

        boolean bool = true;

        byte b = 12;
        short s = 12345;

        char c = 'a';
        int i = 255555;
        long l = 28282828L;

        //float f = 23.4F;
        float f = 23.4F;
        float g = 34.5F;
        double d = 255.666;

        var v = 22;
        var fv = 23.4F;

        System.out.println("byte is " + b);

    }


    public static void arrays() {
        int x = 1;
        int y = x;

        int [] iarr = new int[10];
        int [] otherArray = iarr;

        iarr[0] = 1000;

        otherArray[1] = 383838383;

        System.out.println("iarr[0] " + otherArray[0]);
        System.out.println("iarr[1] " + iarr[1]);

        for(int i = 0; i < iarr.length; i++) {
            iarr[i] = 255;
        }
    }


}
