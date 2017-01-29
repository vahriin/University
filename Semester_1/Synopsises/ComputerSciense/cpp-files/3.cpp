int f(int);
int f1(float);

int f(int x)
{
    return x;
}
float f1(float y)
{
    return y;
}

float q(int, float, int(x)(int), float(x)(float));

float q(int i, float r, int (*ff)(int), float(*f1f)(float)) //*ff - параметр. 
{
    return ff(i) + f1f(r);
}

int main()
{
    print(q(2, 2.14, f, f1))
}