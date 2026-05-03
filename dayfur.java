// import java.util.*;
// public class dayfur {
//     public static void main(String[] args) {
//         String name="saurabh";
//         System.out.println(name);
//     }
// }

// import java.util.*;
// public class dayfur {
//     public static void main(String[] args) {
//         StringBuilder name=new StringBuilder("sourabh");
//         name.setCharAt(0,'S');
//         System.out.println(name);
//   

import java.util.*;
public class dayfur {

    public static boolean isPalindrome(int x) {
     
int original = x;
int palin = 0;

while(x > 0){
    int rem = x % 10;
    palin = palin * 10 + rem;
    x = x / 10;
}

return palin == original;
    
}
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}