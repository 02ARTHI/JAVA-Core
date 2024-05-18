 class Calculator {
      
    public int add(int a, int b)
    {
       // System.out.println(a+b);
        return a+b;
    }
}

public class demo
{
   public static void main(String[] args) {
    Calculator c = new Calculator();
    
    System.out.println(c.add(10,20));
   }
}
