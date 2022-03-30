package Assessment;

public class FiboPrime {
    public boolean isPrime(int val)
    {
        for(int i=2;i<=val/2;i++)
        {
            if(val%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        FiboPrime fibo=new FiboPrime();
        int i,first=0,second=1,third;
        System.out.println("The prime numbers in the first 10 fibonacci numbers are : ");
       // System.out.println(first+"\n"+second);
        for(i=2;i<10;i++)
        {
            //System.out.println(third=first+second);
            third=first+second;
            first=second;
            second=third;
            if(third>1 && fibo.isPrime(third))
                System.out.println(third);
        }
    }
}
