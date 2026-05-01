import java.util.*;
public class MajorityElement{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int arr [] = new int [n];
        System.out.println("Enter elements");
        for (int i= 0;  i< n; i++) {
            arr[i]=sc.nextInt();  
        }

        //boyer moore algorithm 

        int candidate = arr[0];
        int count = 1;

        for(int i=1;i<n;i++){
            if(count==0){
                candidate=arr[i];
                count =1;
            }
            if(candidate==arr[i]){
                count++;
            }else{
                count--;
            }
        }

        System.out.println("Majority element:"+candidate);
    }
}