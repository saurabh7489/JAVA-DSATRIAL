import java.util.*;
public class hello{
public static void main(String[] args) {
//   System.out.println("*");
//    System.out.println("**");
//    System.out.println("***");
//    System.out.println("****");
//veriable
// int a=20;
// int b=10;
// int sum=a+b;
// int min=a-b;
// System.out.println(sum);
// System.out.println(min);

// for(int i =1;i<=4;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println("^");
// }
// for(int i=1;i<=3;i++){
//     for(int j=i;j<=3;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// }
// }
//    Scanner sc=new Scanner(System.in);
//    System.out.println("enter the number a");
//    int a= sc.nextInt();
//    System.out.println("enter the number b");
//    int b= sc.nextInt();
//    int sum=a+b;
//    System.out.println("this is the sum of your number and b ");
//    System.out.println(sum);
//     }
// }
// for(int i=1;i<=4;i++){
//     for(int j=1;j<=5;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int i=1;i<=4;i++){
//     for(int j=1;j<=5;j++){
//      if(i==1||j==1||i==4||j==5){
//      System.out.print("*");
//      }  
//      else{
//         System.out.print(" ");
//      }
//     }
//   System.out.println();
// }
// print right anglr tri
// for(int i=1;i<=4;i++){//for row
//     for(int j=1;j<=i;j++){//for colum
// System.out.print("*");
//     }
//     System.out.println();// for next line
// }
// inverse pyramid
//nexted loop
// for(int i=1;i<=4;i++){//outer loop 
//     for(int j=i;j<=4;j++){//iner loop
//         System.out.print("*");//print star
//     }
//     System.out.println();//for next line 
// }

// for(int i=1;i<=4;i++){//for line
//     for(int j=i;j<=3;j++){
//         System.out.print(" ");//for spacing
//     }
//     for(int k=1;k<=i;k++){
//         System.out.print("*");//for printing star
//     }
// System.out.println();//for next line
// }

//half pyramid with number
// for(int i =1;i<=5;i++){ //for printing rows or 5line
//     for(int j=1;j<=i;j++){//inner loop -> for number
//         System.out.print(j);//printing j
//     }
//     System.out.println();//next line
// }

//inverted half pyramid number 
// for(int i=5;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

//floyd's triangle
// int n=0;
// int k=1;
// for(int i=0;i<=4;i++){
//     n=n+i+1;
//     k=k+i;
//     for(int j=k;j<=n;j++){
//         System.out.print(j);
//     }
    
//     System.out.println();
// }
//floyd's triangle
// int number=1;
// for(int i=1;i<=5;i++){ //outer loop for rows
// for(int j=1;j<=i;j++){ //iner loop for column
//     System.out.print(number); //inner loop run until column is full
//     number++; 
// }

// System.out.println();
// }

// for(int i=1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//       int k=  i+j;
//         if(k%2!=0){
//             System.out.print("0");
//         }
//         else{
//             System.out.print("1");
//         }
//     }
//     System.out.println();
// }
// for(int i=1;i<=4;i++){ //outer loop for row
//     for(int j=1;j<=i;j++){ //inner loop for colum
//         System.out.print("*");
//     } 
//     for(int j=i+i-1;j<=6;j++){ //inner loop for spacing
//         System.out.print(" ");
        
//     }
//     for(int k=1;k<=i;k++){ //for opposit column or pankh
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int i=4;i>=1;i--){ //outer loop for lower row 
//     for(int j=1;j<=i;j++){ //inner loop for column
//         System.out.print("*");
//     }
//     for(int j=i+i-1;j<=6;j++){ //inner loop for spacing
//         System.out.print(" ");
//     }
//     for(int k=1;k<=i;k++){
//         System.out.print("*"); // inner loop for lower opposite column or pankh
//     }
//     System.out.println();
// }

// for(int i=1;i<=5;i++){
//     for(int j=i;j<=4;j++){
//         System.out.print(" "); //for space 
//     }
//     for(int j=1;j<=5;j++){ //for stars
//         System.out.print("*");
//     }
//     System.out.println();
    
// }

for(int i =1;i<=5;i++){
    for(int j=i;j<=5;j++){
System.out.print("+");
    }
    for(int j=1;j<=i;j++){
        System.out.print(i);
    }
    System.out.println();
}

}}