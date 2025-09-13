
import java.util.Random;

public class Lab1 {

    public static double f1(double x1) {
        double v1 = (((3.0 / 4.0 + x1) / 2.0) / 3.0);
        double v2 = 1.0 - Math.pow(v1, 3);
        double v3 = (1.0 / 4.0) / v2;
        double v4 = Math.pow(v3, 3);
        double v5 = Math.cos(x1);
        double v6 = Math.pow(Math.E, x1) / 2.0;
        double v7 = Math.pow(v5, v6);
        double v8 = (2.0 / 3.0) / v7;
        double v = Math.pow(v4, v8);
        return v;
    }

    public static double f2(double x1) {
        double v1 = Math.log(Math.acos((x1 - 2.5) / (21.0)));
        double v2 = 1.0 - Math.cos(Math.pow(0.25 * x1, 2));
        double v3 = Math.tan(Math.pow((x1 * (x1 + 2)), x1));
        double v4 = Math.pow(v2, v3);
        double v = v1 * v4;
        return v;
    }

    public static double f3(double x1) {
        double v1 = Math.pow((0.5 * (Math.log(Math.pow(Math.sin(x1), 2)) - 0.25)), 3);
        double v2 = 1 - Math.pow(Math.E, Math.tan(Math.log(Math.abs(x1))));
        double v3 = v1 * v2;
        double v4 = (Math.sin(x1) * (3.0 / 4.0) * Math.asin((x1 - 2.5) / 21.0) - 4) / 2.0;
        double v = Math.pow(v3, v4);
        return v;
    }

    public static void PrintMatrix(double[][] s) {
        for (double[] row : s) {
            for (double v : row) {
                System.out.printf("%-12.3f ", v, "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        long[] l = new long[7];
        for (int i = 6; i >= 0; i--) {
            l[i] = (i + 1) * 2 + 2;
        }

        // for (int i = 0; i < 7; i++) {
        //     System.out.println(l[i]);
        // }
        double[] x = new double[18];
        for (int i = 0; i < 18; i++) {
            double randomDouble = random.nextDouble(-13.0, 8.0);
            x[i] = randomDouble;
        }

        // for (int i = 0; i < 18; i++) {
        //     System.out.println(x[i]);
        // }
        double[][] s = new double[7][18];
        for (int i = 0; i < 7; i++) {
            if (l[i] == 14) {
                for (int j = 0; j < 18; j++) {
                    double x1 = x[j];
                    double v = f1(x1);
                    s[i][j] = v;
                }
            } else {
                if ((l[i] == 6) || (l[i] == 8) || (l[i] == 16)) {
                    for (int j = 0; j < 18; j++) {
                        double x1 = x[j];
                        double v = f2(x1);
                        s[i][j] = v;
                    }

                } else {
                    for (int j = 0; j < 18; j++) {
                        double x1 = x[j];
                        double v = f3(x1);
                        s[i][j] = v;
                    }
                }
            }

        }
        PrintMatrix(s);
    }
}
