
//  * Assignment #5 - Problem 3. *class LinearEquation*

class LinearEquation {
    private double a, b, c, d, e, f;
    
    public LinearEquation(double a, double b, double c, double d, double e, double f) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        
    }
    public double getA()
    {
        return a;
        
    }
     public double getB()
    {
        return b;
        
    }
      public double getC()
    {
        return c;
        
    }
       public double getD()
    {
        return d;
        
    }
        public double getE()
    {
        return e;
        
    }
         public double getF()
    {
        return f;
        
    }
         public boolean isSolvable()
         {
             double result = (a * d) - (b * c);
             
             return (result != 0);
         }
    public double getX()
    {
        double x = ((e * d)- (b * f )) / ((a * d ) - (b * c));
        
        return x;
    }
    
    public double getY()
    {
        double y = ((a * f)- (e * c )) / ((a * d ) - (b * c));
        
        return y;
    }
}
