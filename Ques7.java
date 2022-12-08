public class Ques7{

    public static void main(String[] args) {
        int n=2;
        int x=3;
        int y=3;
        while(n<=10001)
        {
            if(isprime(x))
                n++;
            y=x;
            x+=2;

        }
        System.out.println("10001st prime number="+y);
    }
    public static boolean isprime(int t)
    {
        for(int i=3;i<=Math.sqrt(t);i+=2)
            if(t%i==0)
                return false;
        return true;
    }

}
