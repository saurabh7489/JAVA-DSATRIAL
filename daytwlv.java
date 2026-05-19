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

// import java.util.*;
// public class daytwlv {
//     static int Array1[]={1,2,3,4,5};
    
    
//     public static void revArray(int s,int n){
//         if(s>=n){System.out.print("[");
//        for(int i=0;i<=Array1.length-1;i++){
//         System.out.print(Array1[i]+",");
//        }
//        System.out.println("]");
//         return;}

//        int temp = Array1[s];
//        Array1[s]=Array1[n];
//        Array1[n]=temp;
//        revArray(s+1, n-1);
//     }
//     public static void main(String[] args) {
//         revArray(0, Array1.length-1);
       
//     }
// }

// import java.util.*;
// public class daytwlv {


//     public boolean isPalindrome(String s) {

//         // remove non-alphanumeric characters
//         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

//         return check(s, 0);
//     }

//     public boolean check(String s, int st) {

//         if (st >= s.length() / 2)
//             return true;

//         if (s.charAt(st) != s.charAt(s.length() - st - 1))
//             return false;

//         return check(s, st + 1);
//     }


//     public static void main(String[] args) {
//          daytwlv obj = new daytwlv();
//     System.out.println(obj.isPalindrome("MADAM"));
//     }
// }

import java.util.*;
public class daytwlv{
   
   
   
    public static int f(int n){
        if(n<=1)
        return n;
        
        int last=f(n-1);
int sLast=f(n-2);
        return last+sLast;

    }
    public static void main(String[] args) {
        System.out.println(f(1));
    }
}