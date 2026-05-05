import java.util.*;
public class daysix {

    public static void main(String[] args) { // bubble sort
        int array[]={9,8,6,3,33,31};
        int sort;
         for(int i=0;i<array.length;i++){

            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    
                   sort=array[j];
                   array[j]=array[j+1];
                   array[j+1]=sort;
                }
            }
            
        }
         for(int j=0;j<array.length;j++){
            System.out.println(array[j]);
         }

    }
}