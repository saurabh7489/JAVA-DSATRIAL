// import java.util.*;
// public class daysix {

//     public static void main(String[] args) { // bubble sort
//         int array[]={9,8,6,3,33,31};
//         int sort;
//          for(int i=0;i<array.length;i++){

//             for(int j=0;j<array.length-1;j++){
//                 if(array[j]>array[j+1]){
                    
//                    sort=array[j];
//                    array[j]=array[j+1];
//                    array[j+1]=sort;
//                 }
//             }
            
//         }
//          for(int j=0;j<array.length;j++){
//             System.out.println(array[j]);
//          }

//     }
// }

// selection sort
import java.util.*;
public class daysix {

    public static void main(String[] args) {
        int array[]={36,78,3,64,35,1};
        int comp;
        int arrang;
        for(int i=0;i<array.length;i++){
            comp=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[comp]){
                    comp=j;
                    
                }

            }
            arrang=array[i];
            array[i]=array[comp];
            array[comp]=arrang;

        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}