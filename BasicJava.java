import java.util.ArrayList;
public class BasicJava{
    public static void main(final String[] args){
        // int i = 0;
        // while(i < 256){
        //     System.out.println(i);
        //     i++;
        // }
        // int j = 0;
        // while(j < 256){
        //     if(j%2 != 0){
        //         System.out.println(j);
        //     }
        //     j++;
        // }
        // int k = 0;
        // int sum = 0;
        // while(k < 256){
        //     sum = k + sum;
        //     System.out.println("New number: "+k+" Sum: "+sum);
        //     k++;
        // }
        int[] myArray = {1,3,5,7,9,13};
        for(int i: myArray){
            System.out.println(i);
        }
        // int[] newArray = {1,3,5,7,9,13};
        // for(int j: newArray){
        //     int max = 0;
        //     int min = 0;
        //     int sum = 0;
        //     if(j > max){
        //         max = j;
        //     }
        //     if(j < min){
        //         min = j;
        //     }
        //     sum += newArray[j];
        //     int avg = sum/newArray.length;
        //     System.out.println(max);
        //     System.out.println(min);
        //     System.out.println(avg);
        // }
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        int o = 0;
        while(o < 256){
            if(o%2 != 0){
                oddArray.add(o);
            }
            o++;
        }
        System.out.println(oddArray);
        int[] squareArray = {1,5,10,-25};
    for(int b: squareArray){
        int sqb = b*b;
        System.out.println(sqb);
    }
    int[] negArray = {1,5,10,-25};
    for(int l: negArray){
        if(negArray[l] < 0){
            negArray[l] = 0;
        }
    }
    System.out.println(negArray);
    }
}