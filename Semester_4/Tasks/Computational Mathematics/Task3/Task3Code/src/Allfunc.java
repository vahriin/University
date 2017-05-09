public class Allfunc {
    public static double eq0(double[] x) {
        return Math.cos(x[0] * x[1]) - Math.exp(-3 * x[2]) + x[3] * x[4] *x[4] - x[5] - Math.sinh(2 * x[7]) * x[8] + 2 * x[9] + 2.0004339741653854440;
    }

    public static double eq1(double[] x) {
        return Math.sin(x[0] * x[1]) + x[2] * x[8] * x[6] - Math.exp(-x[9] + x[5]) + 3 * x[4] * x[4] - x[5] * (x[7] + 1) + 10.886272036407019994;
    }

    public static double eq2(double[] x) {
        return x[0] - x[1] + x[2] - x[3] + x[4] - x[5] + x[6] - x[7] + x[8] - x[9] - 3.1361904761904761904;
    }

    public static double eq3(double[] x) {
        return 2 * Math.cos(-x[8] + x[3]) + x[4] / (x[2] + x[0]) - Math.sin(x[1] * x[1]) + Math.pow(Math.cos(x[6] * x[9]), 2) - x[7] - 0.1707472705022304757;
    }

    public static double eq4(double[] x) {
        return Math.sin(x[4]) + 2 * x[7] * (x[2] + x[0]) - Math.exp(-x[6] * (-x[9] + x[5])) + 2 * Math.cos(x[1]) - 1 / (x[3] - x[8]) - 0.3685896273101277862;
    }

    public static double eq5(double[] x) {
        return Math.exp(x[0] - x[3] - x[8]) + (x[4] * x[4]) / x[7] + Math.cos(3 * x[9] * x[1]) / 2 - x[5] * x[2] + 2.0491086016771875115;
    }

    public static double eq6(double[] x) {
        return Math.pow(x[1], 3) * x[6] - Math.sin(x[9] / x[4] + x[7]) + (x[0] - x[5]) * Math.cos(x[3]) + x[2] - 0.7380430076202798014;
    }

    public static double eq7(double[] x) {
        return x[4] * Math.pow((x[0] - 2 * x[5]), 2) - 2 * Math.sin(-x[8] + x[2]) + 1.5 * x[3] - Math.exp(x[1] * x[6] + x[9]) + 3.5668321989693809040;
    }

    public static double eq8(double[] x) {
        return 7 / x[5] + Math.exp(x[4] + x[3]) - 2 * x[1] * x[7] * x[9] * x[6] + 3 * x[8] - 3 * x[0] - 8.4394734508383257499;
    }

    public static double eq9(double[] x) {
        return x[9] * x[0] + x[8] * x[1] - x[7] * x[2] + Math.sin(x[3] + x[4] + x[5]) * x[6] - 0.78238095238095238096;
    }


    public static double cg00(double[] x) {
        return -Math.sin(x[0] * x[1]) * x[1];
    }

    public static double cg01(double[] x) {
        return -Math.sin(x[0] * x[1]) * x[0];
    }

    public static double cg02(double[] x) {
        return 3. * Math.exp(- (3 * x[2]));
    }

    public static double cg03(double[] x) {
        return x[4] * x[4];
    }

    public static double cg04(double[] x) {
        return 2 * x[3] * x[4];
    }

    public static double cg05(double[] x) {
        return -1;
    }

    public static double cg06(double[] x) {
        return 0;
    }

    public static double cg07(double[] x) {
        return -2. * Math.cosh( (2 * x[7])) * x[8];
    }

    public static double cg08(double[] x) {
        return -Math.sinh( (2 * x[7]));
    }

    public static double cg09(double[] x) {
        return 2;
    }

    public static double cg10(double[] x) {
        return Math.cos(x[0] * x[1]) * x[1];
    }

    public static double cg11(double[] x) {
        return Math.cos(x[0] * x[1]) * x[0];
    }

    public static double cg12(double[] x) {
        return x[8] * x[6];
    }

    public static double cg13(double[] x) {
        return 0;
    }

    public static double cg14(double[] x) {
        return 6 * x[4];
    }

    public static double cg15(double[] x) {
        return -Math.exp(-x[9] + x[5]) -  x[7] - 0.1e1;
    }

    public static double cg16(double[] x) {
        return  x[2] * x[8];
    }

    public static double cg17(double[] x) {
        return -x[5];
    }

    public static double cg18(double[] x) {
        return  x[2] * x[6];
    }

    public static double cg19(double[] x) {
        return Math.exp(-x[9] + x[5]);
    }

    public static double cg20(double[] x) {
        return 1;
    }

    public static double cg21(double[] x) {
        return -1;
    }

    public static double cg22(double[] x) {
        return 1;
    }

    public static double cg23(double[] x) {
        return -1;
    }

    public static double cg24(double[] x) {
        return 1;
    }

    public static double cg25(double[] x) {
        return -1;
    }

    public static double cg26(double[] x) {
        return 1;
    }

    public static double cg27(double[] x) {
        return -1;
    }

    public static double cg28(double[] x) {
        return 1;
    }

    public static double cg29(double[] x) {
        return -1;
    }

    public static double cg30(double[] x) {
        return - x[4] * Math.pow( x[2] + x[0], -2.);
    }

    public static double cg31(double[] x) {
        return -2. * Math.cos(x[1] * x[1]) * x[1];
    }

    public static double cg32(double[] x) {
        return - x[4] * Math.pow( x[2] + x[0], -2.);
    }

    public static double cg33(double[] x) {
        return -2. * Math.sin(-x[8] +  x[3]);
    }

    public static double cg34(double[] x) {
        return 1. / ( x[2] + x[0]);
    }

    public static double cg35(double[] x) {
        return 0;
    }

    public static double cg36(double[] x) {
        return -2. * Math.cos(x[6] * x[9]) * Math.sin(x[6] * x[9]) * x[9];
    }

    public static double cg37(double[] x) {
        return -1;
    }

    public static double cg38(double[] x) {
        return 2. * Math.sin(-x[8] +  x[3]);
    }

    public static double cg39(double[] x) {
        return -2. * Math.cos(x[6] * x[9]) * Math.sin(x[6] * x[9]) * x[6];
    }

    public static double cg40(double[] x) {
        return 2 * x[7];
    }

    public static double cg41(double[] x) {
        return -2. * Math.sin(x[1]);
    }

    public static double cg42(double[] x) {
        return 2 * x[7];
    }

    public static double cg43(double[] x) {
        return Math.pow(-x[8] +  x[3], -2.);
    }

    public static double cg44(double[] x) {
        return Math.cos( x[4]);
    }

    public static double cg45(double[] x) {
        return x[6] * Math.exp(-x[6] * (-x[9] + x[5]));
    }

    public static double cg46(double[] x) {
        return -(x[9] - x[5]) * Math.exp(-x[6] * (-x[9] + x[5]));
    }

    public static double cg47(double[] x) {
        return  (2 * x[2]) + 2. * x[0];
    }

    public static double cg48(double[] x) {
        return -Math.pow(-x[8] +  x[3], -2.);
    }

    public static double cg49(double[] x) {
        return -x[6] * Math.exp(-x[6] * (-x[9] + x[5]));
    }

    public static double cg50(double[] x) {
        return Math.exp(x[0] -  x[3] - x[8]);
    }

    public static double cg51(double[] x) {
        return -3. / 2. * Math.sin(3. * x[9] * x[1]) * x[9];
    }

    public static double cg52(double[] x) {
        return -x[5];
    }

    public static double cg53(double[] x) {
        return -Math.exp(x[0] -  x[3] - x[8]);
    }

    public static double cg54(double[] x) {
        return 2 * x[4] / x[7];
    }

    public static double cg55(double[] x) {
        return -x[2];
    }

    public static double cg56(double[] x) {
        return 0;
    }

    public static double cg57(double[] x) {
        return -x[4] * x[4] *  Math.pow( x[7],  (-2));
    }

    public static double cg58(double[] x) {
        return -Math.exp(x[0] -  x[3] - x[8]);
    }

    public static double cg59(double[] x) {
        return -3. / 2. * Math.sin(3. * x[9] * x[1]) * x[1];
    }

    public static double cg60(double[] x) {
        return Math.cos( x[3]);
    }

    public static double cg61(double[] x) {
        return 3. * x[1] * x[1] * x[6];
    }

    public static double cg62(double[] x) {
        return 1;
    }

    public static double cg63(double[] x) {
        return -(x[0] - x[5]) * Math.sin( x[3]);
    }

    public static double cg64(double[] x) {
        return Math.cos(x[9] /  x[4] +  x[7]) * x[9] *   Math.pow( x[4],  (-2));
    }

    public static double cg65(double[] x) {
        return -Math.cos( x[3]);
    }

    public static double cg66(double[] x) {
        return Math.pow(x[1], 3.);
    }

    public static double cg67(double[] x) {
        return -Math.cos(x[9] /  x[4] +  x[7]);
    }

    public static double cg68(double[] x) {
        return 0;
    }

    public static double cg69(double[] x) {
        return -Math.cos(x[9] /  x[4] +  x[7]) /  x[4];
    }

    public static double cg70(double[] x) {
        return 2. *  x[4] * (x[0] - 2. * x[5]);
    }

    public static double cg71(double[] x) {
        return -x[6] * Math.exp(x[1] * x[6] + x[9]);
    }

    public static double cg72(double[] x) {
        return -2. * Math.cos(-x[8] +  x[2]);
    }

    public static double cg73(double[] x) {
        return 0.15e1;
    }

    public static double cg74(double[] x) {
        return Math.pow(x[0] - 2. * x[5], 2.);
    }

    public static double cg75(double[] x) {
        return -4. *  x[4] * (x[0] - 2. * x[5]);
    }

    public static double cg76(double[] x) {
        return -x[1] * Math.exp(x[1] * x[6] + x[9]);
    }

    public static double cg77(double[] x) {
        return 0;
    }

    public static double cg78(double[] x) {
        return 2. * Math.cos(-x[8] +  x[2]);
    }

    public static double cg79(double[] x) {
        return -Math.exp(x[1] * x[6] + x[9]);
    }

    public static double cg80(double[] x) {
        return -3;
    }

    public static double cg81(double[] x) {
        return -2. *  x[7] * x[9] * x[6];
    }

    public static double cg82(double[] x) {
        return 0;
    }

    public static double cg83(double[] x) {
        return Math.exp( (x[4] + x[3]));
    }

    public static double cg84(double[] x) {
        return Math.exp( (x[4] + x[3]));
    }

    public static double cg85(double[] x) {
        return -0.7e1 * Math.pow(x[5], -2.);
    }

    public static double cg86(double[] x) {
        return -2. * x[1] *  x[7] * x[9];
    }

    public static double cg87(double[] x) {
        return -2. * x[1] * x[9] * x[6];
    }

    public static double cg88(double[] x) {
        return 3;
    }

    public static double cg89(double[] x) {
        return -2. * x[1] *  x[7] * x[6];
    }

    public static double cg90(double[] x) {
        return x[9];
    }

    public static double cg91(double[] x) {
        return x[8];
    }

    public static double cg92(double[] x) {
        return -x[7];
    }

    public static double cg93(double[] x) {
        return Math.cos( x[3] +  x[4] + x[5]) * x[6];
    }

    public static double cg94(double[] x) {
        return Math.cos( x[3] +  x[4] + x[5]) * x[6];
    }

    public static double cg95(double[] x) {
        return Math.cos( x[3] +  x[4] + x[5]) * x[6];
    }

    public static double cg96(double[] x) {
        return Math.sin( x[3] +  x[4] + x[5]);
    }

    public static double cg97(double[] x) {
        return -x[2];
    }

    public static double cg98(double[] x) {
        return x[1];
    }

    public static double cg99(double[] x) {
        return x[0];
    }

}