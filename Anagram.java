import java.util.*;
public class Anagram
{

    public static void main(String []args )
    {

        String s1 ="AmmA";
        String s2 ="MaMM";

        boolean result =isAnagram(s1,s2);

        if(result){
                 System.out.println("Is a Anagram");
        }
        else{
             System.out.println("Its Not ");
        }

    }

    public static boolean isAnagram(String s1,String s2)
    {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
       
       char a[] =s1.toCharArray();
       char b[]=s2.toCharArray();

       Arrays.sort(a);
       Arrays.sort(b);

       boolean result  =Arrays.equals(a,b);

       return result;

       
    }
}

/*
  amma 
  mama

  listen
  silent
*/