import java.util.*;

public class Longest_palindrome_substring {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        //print longest palindrome substring
        String ans = "";
        int n=s.length();

        //base cases
        if(n==0){
            System.out.println("null");
        } 

        if(n==1){
            System.out.println(s);
        }

        int low, high = 0;
        for(int i=1;i<n;i++){
            //for odd length substring
            low=i;
            high=i;
            while(low>=0 && high <n && s.charAt(low)==s.charAt(high) ){
                low--;
                high++;
            }
            String pal = s.substring(low+1,high);
            if(pal.length() > ans.length()){
                ans=pal;
            }

            //for even length
            low =i-1;
            high = i;
            while(low>=0 && high <n && s.charAt(low)==s.charAt(high) ){
                low--;
                high++;
            }
            pal = s.substring(low+1,high);
            if(pal.length() > ans.length()){
                ans=pal;
            }

        }

        System.out.println("Longest palindrome substring is : " + ans);
    }
}
