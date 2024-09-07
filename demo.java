public class demo
{

    public static void main(String[] args) {
        double a=20.00;
        double b=80.00;
        double c=(a+b)*100.00;
        double d =c%40.00;
        Boolean f = (d==0.00)?true:false;
        System.out.println(f);
        if(!f)
        {
            System.out.println("got some remainder");
        }
    }
}