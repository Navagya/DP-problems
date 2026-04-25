import java.util.*;

public class Longest_consecutive_sequence {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []  nums = new int [n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        HashSet <Integer> hs = new HashSet<>();

        for(int val:nums){
            hs.add(val);
        }
        
        int maxLen = 0;
        for(int num:hs){
            //head of sequence
            if(!hs.contains(num-1)){
               int currNum = num;
               int len=1;
               while(hs.contains(currNum+1)){
                len++;
                currNum++;
               }
               maxLen = Math.max(len,maxLen);
            }
        }
    System.out.println("Longest Consecutive Sequence is : " + maxLen);

    }
}
