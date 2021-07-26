import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello from lab02");
        System.out.println("Rolling the dice: "+ roll(4));
       // roll(4);
        int []test = {1,5,5,8,7,8,9,4};
        System.out.println("Duplicates: "+ containsDuplicates(test));
        System.out.println("Average = " + averageCalc(test));
        int[][] givenArray = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println("Minimum Value is: "+avgForMultArr(givenArray));
    }
    public static ArrayList<Integer> roll(int n){
        int []dice={1, 2, 3, 4, 5, 6};
        ArrayList<Integer> rollingDice=new ArrayList<Integer>();
        for (int i =0; i < n ; i++){
            rollingDice.add(new Random().nextInt(dice.length));
        }
//        for (Integer i: rollingDice
//             ) {
//            System.out.println(i);
//        }
       // System.out.println(rollingDice);
        return(rollingDice);
    }
    public static boolean containsDuplicates(int[] arr){
        boolean x;
        Set<Integer> setArr = new HashSet<Integer>();
        for (int i : arr) {
            setArr.add(i);
        }
       // System.out.println(setArr);
        if (setArr.size() == arr.length){
            x = false;
        }
        else{
            x= true;
        }
        return x;
    }
    public static double averageCalc(int[] arr){
        double sum =0;
        for (int i : arr) {
            sum= sum+ i;
        }
        double avg = sum/(arr.length);
        return avg;
    }
    public static double avgForMultArr(int[][] arr){
        ArrayList<Double> avgs = new ArrayList<Double>();
        for (int i = 0; i < arr.length; i++) {
            double avg = averageCalc(arr[i]);
            avgs.add(avg);
        }
       // System.out.println(avgs);
        double minimum= Collections.min(avgs);
        return minimum;
    }

}
