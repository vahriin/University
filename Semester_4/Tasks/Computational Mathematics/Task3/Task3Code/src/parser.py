file = open('Allfunc.java', 'w')
file.write('import java.math.*;\n\n')
file.write('public class Allfunc {\n')

megastring = '''cg[0][0] = -sin(x1 * x2) * x2;
cg[0][1] = -sin(x1 * x2) * x1;
cg[0][2] = 3. * exp(- (3 * x3));
cg[0][3] = x5 * x5;
cg[0][4] = 2 * x4 * x5;
cg[0][5] = -1;
cg[0][6] = 0;
cg[0][7] = -2. * cosh( (2 * x8)) * x9;
cg[0][8] = -sinh( (2 * x8));
cg[0][9] = 2;
cg[1][0] = cos(x1 * x2) * x2;
cg[1][1] = cos(x1 * x2) * x1;
cg[1][2] = x9 * x7;
cg[1][3] = 0;
cg[1][4] = 6 * x5;
cg[1][5] = -exp(-x10 + x6) -  x8 - 0.1e1;
cg[1][6] =  x3 * x9;
cg[1][7] = -x6;
cg[1][8] =  x3 * x7;
cg[1][9] = exp(-x10 + x6);
cg[2][0] = 1;
cg[2][1] = -1;
cg[2][2] = 1;
cg[2][3] = -1;
cg[2][4] = 1;
cg[2][5] = -1;
cg[2][6] = 1;
cg[2][7] = -1;
cg[2][8] = 1;
cg[2][9] = -1;
cg[3][0] = - x5 * pow( x3 + x1, -2.);
cg[3][1] = -2. * cos(x2 * x2) * x2;
cg[3][2] = - x5 * pow( x3 + x1, -2.);
cg[3][3] = -2. * sin(-x9 +  x4);
cg[3][4] = 1. / ( x3 + x1);
cg[3][5] = 0;
cg[3][6] = -2. * cos(x7 * x10) * sin(x7 * x10) * x10;
cg[3][7] = -1;
cg[3][8] = 2. * sin(-x9 +  x4);
cg[3][9] = -2. * cos(x7 * x10) * sin(x7 * x10) * x7;
cg[4][0] = 2 * x8;
cg[4][1] = -2. * sin(x2);
cg[4][2] = 2 * x8;
cg[4][3] = pow(-x9 +  x4, -2.);
cg[4][4] = cos( x5);
cg[4][5] = x7 * exp(-x7 * (-x10 + x6));
cg[4][6] = -(x10 - x6) * exp(-x7 * (-x10 + x6));
cg[4][7] =  (2 * x3) + 2. * x1;
cg[4][8] = -pow(-x9 +  x4, -2.);
cg[4][9] = -x7 * exp(-x7 * (-x10 + x6));
cg[5][0] = exp(x1 -  x4 - x9);
cg[5][1] = -3. / 2. * sin(3. * x10 * x2) * x10;
cg[5][2] = -x6;
cg[5][3] = -exp(x1 -  x4 - x9);
cg[5][4] = 2 * x5 / x8;
cg[5][5] = -x3;
cg[5][6] = 0;
cg[5][7] = -x5 * x5 *  pow( x8,  (-2));
cg[5][8] = -exp(x1 -  x4 - x9);
cg[5][9] = -3. / 2. * sin(3. * x10 * x2) * x2;
cg[6][0] = cos( x4);
cg[6][1] = 3. * x2 * x2 * x7;
cg[6][2] = 1;
cg[6][3] = -(x1 - x6) * sin( x4);
cg[6][4] = cos(x10 /  x5 +  x8) * x10 *   pow( x5,  (-2));
cg[6][5] = -cos( x4);
cg[6][6] = pow(x2, 3.);
cg[6][7] = -cos(x10 /  x5 +  x8);
cg[6][8] = 0;
cg[6][9] = -cos(x10 /  x5 +  x8) /  x5;
cg[7][0] = 2. *  x5 * (x1 - 2. * x6);
cg[7][1] = -x7 * exp(x2 * x7 + x10);
cg[7][2] = -2. * cos(-x9 +  x3);
cg[7][3] = 0.15e1;
cg[7][4] = pow(x1 - 2. * x6, 2.);
cg[7][5] = -4. *  x5 * (x1 - 2. * x6);
cg[7][6] = -x2 * exp(x2 * x7 + x10);
cg[7][7] = 0;
cg[7][8] = 2. * cos(-x9 +  x3);
cg[7][9] = -exp(x2 * x7 + x10);
cg[8][0] = -3;
cg[8][1] = -2. *  x8 * x10 * x7;
cg[8][2] = 0;
cg[8][3] = exp( (x5 + x4));
cg[8][4] = exp( (x5 + x4));
cg[8][5] = -0.7e1 * pow(x6, -2.);
cg[8][6] = -2. * x2 *  x8 * x10;
cg[8][7] = -2. * x2 * x10 * x7;
cg[8][8] = 3;
cg[8][9] = -2. * x2 *  x8 * x7;
cg[9][0] = x10;
cg[9][1] = x9;
cg[9][2] = -x8;
cg[9][3] = cos( x4 +  x5 + x6) * x7;
cg[9][4] = cos( x4 +  x5 + x6) * x7;
cg[9][5] = cos( x4 +  x5 + x6) * x7;
cg[9][6] = sin( x4 +  x5 + x6);
cg[9][7] = -x3;
cg[9][8] = x2;
cg[9][9] = x1'''

argums = '(double[] x)'


megastring = megastring.replace('sin', 'Math.sin').replace('exp', 'Math.exp').replace('pow', 'Math.pow').replace('cos', 'Math.cos')
funcarray = megastring.split(';\n')
for func in funcarray:
    spfucn = func.split(' = ')
    name = spfucn[0].replace('[', '').replace(']', '')
    function = spfucn[1]
    for i in range(10, 0, -1):
        function = function.replace('x' + str(i), 'x[' + str(i-1) + ']')
    file.write('    public static double ' + name + argums + ' {\n')
    file.write('        return ' + function + ';\n    }\n\n')

file.write('}')
file.close()
