// import java.util.*;
// public class dayelvn {
//     static int count=0;
//     public static void  Num(){
        
//         if(count==7)
//             return;
//         System.out.println(count);
//         count++;
//         Num();
//     }
//     public static void main(String[] args) {
//         Num();
//     }
// }

import java.util.*;
public class dayelvn {
   static Scanner sc=new Scanner(System.in);
    static int count= 1;
    static int n=sc.nextInt();
    public static void Name(){
        if(count==n+1)
            return;
        System.out.println(count+".Sourabh");
            count++;
            Name();
    }
    public static void main(String[] args) {
        Name();
    }
}