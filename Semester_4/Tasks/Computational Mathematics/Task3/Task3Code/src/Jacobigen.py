file = open('JacobiMatrix.java', 'w')

for i in range(10):
    for j in range(10):
        file.write('jacobiMatrix.setEntry(' + str(i) + ', ' + str(j) + ', Allfunc.cg' + str(i) + str(j) + '(currentApprox));\n')

file.close()
