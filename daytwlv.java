// import java.util.*;
// public class daytwlv {
// public static void revArray(int arr[],int s,int e){
    
//     if(s>=e)
//         return;
   

//     int count = arr[s];
//     arr[s]=arr[e];
//     arr[e]=count;
//     revArray(arr, s++, e--);
// }
  
    
//     public static void main(String[] args) {
//         int arr1[]={1,2,3,4,5};
//         revArray(arr1, 0, arr1.length-1);
//         System.out.println(arr1);
//     }
// }

import java.util.*;
public class daytwlv {
    static int Array1[]={1,2,3,4,5};
    
    
    public static void revArray(int s,int n){
        if(s>=n){System.out.print("[");
       for(int i=0;i<=Array1.length-1;i++){
        System.out.print(Array1[i]+",");
       }
       System.out.println("]");
        return;}

       int temp = Array1[s];
       Array1[s]=Array1[n];
       Array1[n]=temp;
       revArray(s+1, n-1);
    }
    public static void main(String[] args) {
        revArray(0, Array1.length-1);
       
    }
}