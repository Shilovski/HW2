import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {

        // ch1: ex 2
        System.out.println(normalize(-1));
        System.out.println(Math.floorMod(-1,360));
        System.out.println("*******************");

        // ch1: ex 6
        System.out.println(factorialUsingBI(1000));
        System.out.println("*******************");

        // ch1: ex 8
        String str = "qwerty";
        subString(str, str.length());
        System.out.println("*******************");

        // ch1: ex 13
        lottery();
        System.out.println("*******************");

        // ch2: ex 5
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);
        System.out.println("*******************");

        //ch2: ex 9
        Car car = new Car(10,20,50,10);
        System.out.println(car);
        car.drive(210);
        System.out.println(car);

        car.addGas(20);
        System.out.println(car);
    }

    // ch1: ex 2
    public static int normalize(int angle) {
        angle = angle % 360;
        if (angle < 0)
            angle = angle + 360;
        return angle;
    }

    // ch1: ex 6
    public static BigInteger factorialUsingBI(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    // ch1: ex 8
    public static void subString(String str, int n) {
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                System.out.println(str.substring(i, j));
    }

    // ch1: ex 13
    public static void lottery() {

        int n = 49;
        int[] a = new int[n];

        for (int i = 1; i <= n; i++)
            a[i-1] = i;

        for (int j = 0; j < 7; j++) {
            n--;
            int index = (int) (Math.random() * n) + 1;
            for (int i = 0; i < n; i++) {
                if (i == index)
                    for (int k = i; k < n; k++)
                        a[k] = a[k + 1];
                if (j == 6)
                    System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}
