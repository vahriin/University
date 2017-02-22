/**
 * Created by vahriin on 2/18/17.
 */
public class Module {
    public static double trueFunc (double x) {
        return Math.cos(2.8 * x + Math.sqrt(1 + x)) * Math.atan(1.5 * x + 0.2);
    }

    public static double calcSqrt(double value, double accuracy) {
        double wlast = 0;
        double wnext = 1;
        while (Math.abs(wnext - wlast) > accuracy) {
            wlast = wnext;
            wnext = (wlast + value / wlast) / 2; //Heron form
        }
        return wnext;
    }

    public static double calcArctan(double value, double accuracy) {
        int k = 0;
        double summ = 0;
        double next = 1;
        double val = value;
        while (Math.abs(next) > accuracy) {
            next = (k % 2 == 0 ? 1 : -1) * val / (2 * k + 1);
            val *= (value * value); // увеличиваем степень на 2
            summ += next;
            ++k;
        }
        return summ;
    }

    public static double calcCos(double value, double accuracy) {
        int k = 0;
        double summ = 0;
        double next = 1;
        double val = 1;
        long fac = 1;
        while (Math.abs(next) > accuracy) {
            next = (k % 4 == 0 ? 1 : -1) * val / (fac);
            val *= (value * value); // увеличиваем степень на 2
            summ += next;
            k += 2;
            if (fac == 1) { // колдуем с факториалом
                fac = 2;
            } else {
                fac *= k * (k-1);
            }
        }
        return summ;
    }

    private static double setFunc(double x) {
        return calcCos(2.8*x + calcSqrt(1 + x, 10E-6 / 1.5), 10E-6 / 3) *
                calcArctan(1.5 * x + 0.2, 10E-6 / 0.6);
    }

    public static void picTable(double begin, double end, double step) {
        System.out.println("| x  |       f(x)       |      true f(x)    |ac|");
        for (int t = (int)(begin / step); t <= (int)(end / step); ++t) {
            double b = t * step;
            System.out.print("|");
            System.out.print(b);
            System.out.print("|");
            double myResult = setFunc(b);
            System.out.print(myResult);
            System.out.print("|");
            double trueResult = trueFunc(b);
            System.out.print(trueResult);
            System.out.print("|");
            System.out.print(Math.abs(trueResult - myResult) < 10E-6 ? "OK" : "FD");
            System.out.println("|");
        }

    }


    public static void main(String[] args) {
        picTable(0.1, 0.2, 0.01);
        //System.out.println(calcCos(0.2, 10E-6));
    }
}
