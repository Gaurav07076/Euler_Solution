public class Ques4 {
    public static boolean palindrome(int num) {

        int rev=0;
        int x=num;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        if(rev==x) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int max=Integer.MIN_VALUE;
        for(int i=100;i<=998;i++) {    
            for(int j=i+1;j<=999;j++) {
                if(palindrome(i*j)) {  
                    max=Math.max(max, i*j); 
                }
            }
        }
        System.out.println(max);
    }
}
