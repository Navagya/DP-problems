import java.util.*;

//do it by dp:- memo
public class Fibonacci_memo {

    public static int fib(int n,int [] memo){
        if(n==0 || n==1) return n;
        if(memo[n]!=-1) return memo[n];
        memo[n]= fib(n-1,memo)+fib(n-2,memo);
        return memo[n];
    } 
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int memo [] = new int [n+1];
        Arrays.fill(memo,-1);
        int ans = fib(n,memo);
        System.out.println(ans);
    
    }
}
