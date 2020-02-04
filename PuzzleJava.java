import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public static void main(String[] args) {
    //     int sum = 0;
    //     int[] myArray = {3,5,1,2,7,9,8,13,25,32};
    //     for(int i: myArray){
    //         if(myArray[i] > 10){
    //             System.out.println(myArray[i]);
    //         }
    //         sum = sum + myArray[i];
    //     }
    //     System.out.println(sum);
    // }
        ArrayList<String> nameArray = new ArrayList<String>();
        nameArray.add("Nancy");
        nameArray.add("Jinichi");
        nameArray.add("Fujibayashi");
        nameArray.add("Momochi");
        nameArray.add("Ishikawa");
        Collections.shuffle(nameArray);
        System.out.println(nameArray);
}
}