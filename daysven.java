// import java.util.*;
// public class daysven {

//     public static void main(String[] args) {
          
//         // insertion sort
//         int sort[]={7,8,3,1,2};
//         for(int i=1;i<sort.length;i++){
//             int current=sort[i];
//             int j=i-1;
//             while(j>=0 && current<sort[j]){
//                 sort[j+1]=sort[j];
//                 j--;

//             }
//             sort[j+1]=current;
            
//         }
//         for(int i=0;i<sort.length;i++){
//         System.out.println(sort[i]);}
//     }
// }

import java.util.*;
public class daysven {
public  static void printNumber(int n){
if(n==0){
    return;}
    System.out.println(n);
printNumber(n-1);
}
   public static void main(String[] args) {
    int n=5;
    printNumber(n);
   }
}