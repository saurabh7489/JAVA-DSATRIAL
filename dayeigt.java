// import java.util.*;
// public class dayeigt {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int count=0;
//        while(n>0){
//         int lastDigit=n%10;
//         n=n/10; //decrinsing the value from last
//         count++;
//        }
// System.out.print(count+"");

import java.util.*;
public class dayeigt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
        int collect=0;
        while(n>0){
            int lastDigit=n%10;
            n=n/10;
            collect=lastDigit+collect*10;
        }
        System.out.println(collect);
    }
}
