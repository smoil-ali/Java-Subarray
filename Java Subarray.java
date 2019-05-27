import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        String[] arr1=sc.nextLine().split(" ");
        int size=arr1.length;
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=Integer.parseInt(arr1[i]);
        }

        int start=0;
        int end=1;
        int temp=end;
        int count=0;
        int sum=0;
        int sec=num;
        for(int i=0;i<num;i++){
            for(int j=0;j<sec;j++){
                int[] slice=new int[end-start];
                for(int k=0;k<slice.length;k++){
                    slice[k]=arr2[start+k];
                }
                for(int l=0;l<slice.length;l++){
                    sum+=slice[l];
                }
                if(sum<0){
                    count++;
                }
                start++;
                end++;
                sum=0;
            }
            sec--;
            sum=0;
            start=0;
            end=temp;
            temp=++end;

        }

     System.out.println(count);
    }
}

