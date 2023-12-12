public class MethodWithReturn
{
    public static void main(String args[])
    {    int diameter=1234;
          int circleRadius =circleDiameter(diameter);
          System.out.println("Circle radius is :"+circleRadius);  
    }
   public static int circleDiameter(int diameter)
   {
       return diameter/(int)2.8;
   }
}

/* Circle radius  */