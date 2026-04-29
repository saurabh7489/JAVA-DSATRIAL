// import java.util.*;
// public class dayone {
//     public static int freq(){
//     int a=9;
//     int b=9;
//     int sum = a+b;
//     return sum;

//     }
//    public static void main(String[] args) {
//     for(int i=1;i<=5;i++){
//         for(int j=i;j<=4;j++){  //inner loop for spacing
//             System.out.print(" ");
//         }
//    for(int j=i;j>=1;j--){
//     System.out.print(j); // inner loop for left half 
//    }
//    for(int j=2;j<=i;j++){ // inner loop for right half 
//     System.out.print(j);
//    }
//    System.out.println(); // for next line 
//     }
// System.out.println(freq());
//    } 
// }

// for(int i= 1;i<=4;i++){
//     for(int j=i;j<=3;j++){
//         System.out.print(" "); // for spaceing
//     }
//     for(int j=1;j<=i;j++){ // loop for left half 
//         System.out.print("*");
//     }
// for(int j=2;j<=i;j++){
//     System.out.print("*"); // for right half 
// }


// System.out.println();
// }


// for(int i=4;i>=1;i--){
//     for(int j=i;j<=4;j++){
// System.out.print("+");
//     }
//     for(int j=i;j>=1;j--){
//     System.out.print("*");
// }
//     for(int j=2;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


//    }}

// public class daytwo {
// public static int Product(int a,int b){
//     int mult=a*b;
//     return mult;
// }
//     public static void main(String[] args) {
//         System.out.println(Product(3,4));
//     }
// }
import java.util.*;
public class dayone{
    public static void factorial(int n){
         int j=1;
        for(int i=1;i<=n;i++){
           
            j=j*i;}
            System.out.println(j);
        
        return;
    }
    public static void main(String[] args) {
        factorial(3);
    }

}