void exch (int * xx, int * yy)

    int r = *xx;
    *yy = *xx;
    *xx = r;
    
exch (&x, &y)