//Factorial Digit Sum

public class Ques20 {

        public static int factorial(int n){
            int f=1;
            
            for(int i=1;i<=n;i++){
                f=f*i;
                
            }
            
            
            return f;
        }
        public static void main(String[] args) {
            int n=factorial(100);
            int s=0;
            int k=0;
            while(n>0){
                k=n%10;
                s=s+k;
                n=n/10;}
            System.out.println(s);
        }
        
    }
