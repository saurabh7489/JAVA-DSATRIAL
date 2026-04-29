import java.util.*;
public class daytwo {
   public static void main(String[] args) {
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
//    } 
// }

for(int i= 1;i<=4;i++){
    for(int j=i;j<=3;j++){
        System.out.print(" "); // for spaceing
    }
    for(int j=1;j<=i;j++){ // loop for left half 
        System.out.print("*");
    }
for(int j=2;j<=i;j++){
    System.out.print("*"); // for right half 
}


System.out.println();
}


for(int i=4;i>=1;i--){
    for(int j=i;j<=4;j++){
System.out.print("+");
    }
    for(int j=i;j>=1;j--){
    System.out.print("*");
}
    for(int j=2;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}


   }}
