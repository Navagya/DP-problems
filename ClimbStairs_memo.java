import java.util.*;

public class ClimbStairs_memo {

    public static int memo(int n, int [] dp){
        if(n==0 ||n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        dp[n]= memo(n-1,dp)+memo(n-2,dp);
        return dp[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        int ans = memo(n,dp);
        System.out.println("Ways:"+ans);
    }
}
