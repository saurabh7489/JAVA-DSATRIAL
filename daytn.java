// import java.util.*;
// public class daytn {
//     public static void main(String[] args) {
//         int n=37;
//         int sum=0;
//         int proxi=n;
//         while(n>0){
//             int lD=n%10;
//             n=n/10;
//             sum=sum+(lD*lD*lD);
//         }
//         if(sum==proxi){
//             System.out.println("Arimstrong");
//         }
//         else{
//             System.out.println("NotArmstrong");
//         }
//     }
// }

// import java.util.*;
// public class daytn {

//     public static void main(String[] args) {
//         int n=12;
//         int count=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 count=i;
            
//             System.out.print(i+" ");}
//         }
//         // System.out.println(count);
//     }
// }

// import java.util.*;
// public class daytn {

//     public static void main(String[] args) {
//         int n=6;
//         int count=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 count=count+i;
//             }

//         }
//         if(count==n+1){
//             System.err.println("Number is prime");
//         }
//         else{
//             System.out.println("number is not prime");
//         }
//     }
// }

import java.util.*;
public class daytn {

    public static void main(String[] args) {
        int n=2;
        int n1=12;
        for(int i=1;i<=n;i++){
            if(n%i==0 && n1%i==0){
                System.out.println(i);
            }
        }
    }
}