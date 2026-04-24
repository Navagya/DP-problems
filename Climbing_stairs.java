import java.util.*;

// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

//basic recursion:
public class Climbing_stairs {

    public  static int climb(int n){
        if(n==0 || n==1) return 1;

        return climb(n-1)+climb(n-2);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println("Distinct ways: "+climb(n));
        
    }
}
