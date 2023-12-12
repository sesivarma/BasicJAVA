public class Student {
    static String institute="jSpiders";
   String  name;
   double  tenPercentage;
   double  interPer;
   double  btech;
   double  mtech;

   public Student(String name,double tenPercentage,double interPer,double btech)
   {
       this.name=name;
       this. tenPercentage=tenPercentage;
       this. interPer=interPer;
       this. btech=btech;
   } 

   public Student(String name,double tenPercentage,double interPer,double btech,double mtech){
        this(name, tenPercentage, interPer, btech);
       this.mtech=mtech;
   }

   public void studentDetails()
   {
      System.out.println("***********Student Details*************");
      System.out.println("Name : "+name);
      System.out.println("10 th % : "+tenPercentage);
      System.out.println("Inter % : "+interPer);
      System.out.println("B.Tech : "+btech);
      if(mtech!=0.0)
      System.out.println("M.Tech % : "+mtech);
      System.out.println("Institute : "+institute);
      System.out.println("***************************"+"");   
   }
   


}

