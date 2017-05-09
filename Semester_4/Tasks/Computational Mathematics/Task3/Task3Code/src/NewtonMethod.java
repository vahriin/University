import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

/**
 * Created by vahriin on 5/8/17.
 */
public class NewtonMethod {
    public NewtonMethod() {
        jacobiMatrix = MatrixUtils.createRealMatrix(10, 10);
        equationSystem = jacobiMatrix.getColumnVector(0);
    }

    public void setJacobiMatrix(double[] currentApprox) {
        jacobiMatrix.setEntry(0, 0, Allfunc.cg00(currentApprox));
        jacobiMatrix.setEntry(0, 1, Allfunc.cg01(currentApprox));
        jacobiMatrix.setEntry(0, 2, Allfunc.cg02(currentApprox));
        jacobiMatrix.setEntry(0, 3, Allfunc.cg03(currentApprox));
        jacobiMatrix.setEntry(0, 4, Allfunc.cg04(currentApprox));
        jacobiMatrix.setEntry(0, 5, Allfunc.cg05(currentApprox));
        jacobiMatrix.setEntry(0, 6, Allfunc.cg06(currentApprox));
        jacobiMatrix.setEntry(0, 7, Allfunc.cg07(currentApprox));
        jacobiMatrix.setEntry(0, 8, Allfunc.cg08(currentApprox));
        jacobiMatrix.setEntry(0, 9, Allfunc.cg09(currentApprox));
        jacobiMatrix.setEntry(1, 0, Allfunc.cg10(currentApprox));
        jacobiMatrix.setEntry(1, 1, Allfunc.cg11(currentApprox));
        jacobiMatrix.setEntry(1, 2, Allfunc.cg12(currentApprox));
        jacobiMatrix.setEntry(1, 3, Allfunc.cg13(currentApprox));
        jacobiMatrix.setEntry(1, 4, Allfunc.cg14(currentApprox));
        jacobiMatrix.setEntry(1, 5, Allfunc.cg15(currentApprox));
        jacobiMatrix.setEntry(1, 6, Allfunc.cg16(currentApprox));
        jacobiMatrix.setEntry(1, 7, Allfunc.cg17(currentApprox));
        jacobiMatrix.setEntry(1, 8, Allfunc.cg18(currentApprox));
        jacobiMatrix.setEntry(1, 9, Allfunc.cg19(currentApprox));
        jacobiMatrix.setEntry(2, 0, Allfunc.cg20(currentApprox));
        jacobiMatrix.setEntry(2, 1, Allfunc.cg21(currentApprox));
        jacobiMatrix.setEntry(2, 2, Allfunc.cg22(currentApprox));
        jacobiMatrix.setEntry(2, 3, Allfunc.cg23(currentApprox));
        jacobiMatrix.setEntry(2, 4, Allfunc.cg24(currentApprox));
        jacobiMatrix.setEntry(2, 5, Allfunc.cg25(currentApprox));
        jacobiMatrix.setEntry(2, 6, Allfunc.cg26(currentApprox));
        jacobiMatrix.setEntry(2, 7, Allfunc.cg27(currentApprox));
        jacobiMatrix.setEntry(2, 8, Allfunc.cg28(currentApprox));
        jacobiMatrix.setEntry(2, 9, Allfunc.cg29(currentApprox));
        jacobiMatrix.setEntry(3, 0, Allfunc.cg30(currentApprox));
        jacobiMatrix.setEntry(3, 1, Allfunc.cg31(currentApprox));
        jacobiMatrix.setEntry(3, 2, Allfunc.cg32(currentApprox));
        jacobiMatrix.setEntry(3, 3, Allfunc.cg33(currentApprox));
        jacobiMatrix.setEntry(3, 4, Allfunc.cg34(currentApprox));
        jacobiMatrix.setEntry(3, 5, Allfunc.cg35(currentApprox));
        jacobiMatrix.setEntry(3, 6, Allfunc.cg36(currentApprox));
        jacobiMatrix.setEntry(3, 7, Allfunc.cg37(currentApprox));
        jacobiMatrix.setEntry(3, 8, Allfunc.cg38(currentApprox));
        jacobiMatrix.setEntry(3, 9, Allfunc.cg39(currentApprox));
        jacobiMatrix.setEntry(4, 0, Allfunc.cg40(currentApprox));
        jacobiMatrix.setEntry(4, 1, Allfunc.cg41(currentApprox));
        jacobiMatrix.setEntry(4, 2, Allfunc.cg42(currentApprox));
        jacobiMatrix.setEntry(4, 3, Allfunc.cg43(currentApprox));
        jacobiMatrix.setEntry(4, 4, Allfunc.cg44(currentApprox));
        jacobiMatrix.setEntry(4, 5, Allfunc.cg45(currentApprox));
        jacobiMatrix.setEntry(4, 6, Allfunc.cg46(currentApprox));
        jacobiMatrix.setEntry(4, 7, Allfunc.cg47(currentApprox));
        jacobiMatrix.setEntry(4, 8, Allfunc.cg48(currentApprox));
        jacobiMatrix.setEntry(4, 9, Allfunc.cg49(currentApprox));
        jacobiMatrix.setEntry(5, 0, Allfunc.cg50(currentApprox));
        jacobiMatrix.setEntry(5, 1, Allfunc.cg51(currentApprox));
        jacobiMatrix.setEntry(5, 2, Allfunc.cg52(currentApprox));
        jacobiMatrix.setEntry(5, 3, Allfunc.cg53(currentApprox));
        jacobiMatrix.setEntry(5, 4, Allfunc.cg54(currentApprox));
        jacobiMatrix.setEntry(5, 5, Allfunc.cg55(currentApprox));
        jacobiMatrix.setEntry(5, 6, Allfunc.cg56(currentApprox));
        jacobiMatrix.setEntry(5, 7, Allfunc.cg57(currentApprox));
        jacobiMatrix.setEntry(5, 8, Allfunc.cg58(currentApprox));
        jacobiMatrix.setEntry(5, 9, Allfunc.cg59(currentApprox));
        jacobiMatrix.setEntry(6, 0, Allfunc.cg60(currentApprox));
        jacobiMatrix.setEntry(6, 1, Allfunc.cg61(currentApprox));
        jacobiMatrix.setEntry(6, 2, Allfunc.cg62(currentApprox));
        jacobiMatrix.setEntry(6, 3, Allfunc.cg63(currentApprox));
        jacobiMatrix.setEntry(6, 4, Allfunc.cg64(currentApprox));
        jacobiMatrix.setEntry(6, 5, Allfunc.cg65(currentApprox));
        jacobiMatrix.setEntry(6, 6, Allfunc.cg66(currentApprox));
        jacobiMatrix.setEntry(6, 7, Allfunc.cg67(currentApprox));
        jacobiMatrix.setEntry(6, 8, Allfunc.cg68(currentApprox));
        jacobiMatrix.setEntry(6, 9, Allfunc.cg69(currentApprox));
        jacobiMatrix.setEntry(7, 0, Allfunc.cg70(currentApprox));
        jacobiMatrix.setEntry(7, 1, Allfunc.cg71(currentApprox));
        jacobiMatrix.setEntry(7, 2, Allfunc.cg72(currentApprox));
        jacobiMatrix.setEntry(7, 3, Allfunc.cg73(currentApprox));
        jacobiMatrix.setEntry(7, 4, Allfunc.cg74(currentApprox));
        jacobiMatrix.setEntry(7, 5, Allfunc.cg75(currentApprox));
        jacobiMatrix.setEntry(7, 6, Allfunc.cg76(currentApprox));
        jacobiMatrix.setEntry(7, 7, Allfunc.cg77(currentApprox));
        jacobiMatrix.setEntry(7, 8, Allfunc.cg78(currentApprox));
        jacobiMatrix.setEntry(7, 9, Allfunc.cg79(currentApprox));
        jacobiMatrix.setEntry(8, 0, Allfunc.cg80(currentApprox));
        jacobiMatrix.setEntry(8, 1, Allfunc.cg81(currentApprox));
        jacobiMatrix.setEntry(8, 2, Allfunc.cg82(currentApprox));
        jacobiMatrix.setEntry(8, 3, Allfunc.cg83(currentApprox));
        jacobiMatrix.setEntry(8, 4, Allfunc.cg84(currentApprox));
        jacobiMatrix.setEntry(8, 5, Allfunc.cg85(currentApprox));
        jacobiMatrix.setEntry(8, 6, Allfunc.cg86(currentApprox));
        jacobiMatrix.setEntry(8, 7, Allfunc.cg87(currentApprox));
        jacobiMatrix.setEntry(8, 8, Allfunc.cg88(currentApprox));
        jacobiMatrix.setEntry(8, 9, Allfunc.cg89(currentApprox));
        jacobiMatrix.setEntry(9, 0, Allfunc.cg90(currentApprox));
        jacobiMatrix.setEntry(9, 1, Allfunc.cg91(currentApprox));
        jacobiMatrix.setEntry(9, 2, Allfunc.cg92(currentApprox));
        jacobiMatrix.setEntry(9, 3, Allfunc.cg93(currentApprox));
        jacobiMatrix.setEntry(9, 4, Allfunc.cg94(currentApprox));
        jacobiMatrix.setEntry(9, 5, Allfunc.cg95(currentApprox));
        jacobiMatrix.setEntry(9, 6, Allfunc.cg96(currentApprox));
        jacobiMatrix.setEntry(9, 7, Allfunc.cg97(currentApprox));
        jacobiMatrix.setEntry(9, 8, Allfunc.cg98(currentApprox));
        jacobiMatrix.setEntry(9, 9, Allfunc.cg99(currentApprox));
    }

    public void setEquationSystem(double[] currentApprox) {
        equationSystem.setEntry(0, Allfunc.eq0(currentApprox));
        equationSystem.setEntry(1, Allfunc.eq0(currentApprox));
        equationSystem.setEntry(2, Allfunc.eq0(currentApprox));
        equationSystem.setEntry(3, Allfunc.eq0(currentApprox));
        equationSystem.setEntry(4, Allfunc.eq0(currentApprox));
        equationSystem.setEntry(5, Allfunc.eq0(currentApprox));
        equationSystem.setEntry(6, Allfunc.eq0(currentApprox));
        equationSystem.setEntry(7, Allfunc.eq0(currentApprox));
        equationSystem.setEntry(8, Allfunc.eq0(currentApprox));
        equationSystem.setEntry(9, Allfunc.eq0(currentApprox));
    }


    public RealVector simplyNewtonMultiply() {
        return new LUDecomposition(jacobiMatrix).getSolver().getInverse().
                operate(equationSystem).mapMultiply(-1);
    }

    public RealVector modifyNewtonMultiply() {
        return new LUDecomposition(jacobiMatrix).getSolver().solve(equationSystem.mapMultiply(-1));
    }

    private RealMatrix jacobiMatrix;
    private RealVector equationSystem;
}
