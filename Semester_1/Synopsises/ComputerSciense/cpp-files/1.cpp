#include <iostream>

int main()
{
    float M[100];
    int i, imax;
    
    float max = M[0];
    
    for (i = 1; i < 100; i++)
    {
        if (M[i] > max)
        {
            max = M[i];
            imax = i;
        }
    } 
}