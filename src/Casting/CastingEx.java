package Casting;

public class CastingEx {

    public void wideningCasting(){
      int a = 5;
        System.out.println("Before Casting:" +a);

        float b = a;

        System.out.println("After Casting :" +b);

    }

   public void NarrowingCasting(){
     float f = 5.6f;
       System.out.println("Before casting:"+f);

       int a = (int) f;
       System.out.println("After casting:" +a);


   }
}
