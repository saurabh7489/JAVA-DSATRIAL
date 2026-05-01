// linear search

// import java.util.*;
// public class daytri {

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int size=  sc.nextInt();
//         int arr[]=new int[size];
//         int x=3;
//          for(int i=0;i<size;i++){
//         arr[i]= sc.nextInt();
//          }
//          for(int i=0;i<size;i++){
//             if(x == arr[i]){
// System.out.println("the valu at index:- "+ i);
//             }
            
//          }
        
//     }
// }

// 2D arrays 

// import java.util.*;
// public class daytri {

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int r =sc.nextInt();
//         int c=sc.nextInt();
//         int num[][]= new int[r][c];

//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 num[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print(num[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class daytri {

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int r = sc.nextInt();
//         int c =sc.nextInt();
//         System.out.println("enter nth value to find");
//         int n = sc.nextInt();

//         int num[][]= new int[r][c];

//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 num[i][j]= sc.nextInt(); //input of matrix
//             }
//         }
//         for(int i=0;i<r;i++){  //
//             for(int j=0;j<c;j++){
//                 if( n==num[i][j]){ // compare the nth value with matrix
//                     System.out.print("the value is in index (" + i +","+ j + ")");
                    
//                 }
                
//             }
           
//         }
//     }
// }

import java.util.*;
public class daytri {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int target= sc.nextInt();
        int Array[] = new int[size];
        for(int i=0;i<size;i++){
            Array[i] = sc.nextInt();
        }
   for(int i=0;i<size;i++){
    for(int j=1;j<size;j++){
        if(target==Array[i]+Array[j]){
System.out.println("["+i+","+j+"]");
        }
    }
   }

    }
}