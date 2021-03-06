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

        System.out.println("First part of Lab03 ..... ");
        weather(givenArray);
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        tally(votes);
    }

    // lab02 methods
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

    // lab03 p1 methods
    public static ArrayList<String> weather(int[][] arr){
        HashSet<Integer> temps = new HashSet<Integer>();
        ArrayList<Integer> minArr = new ArrayList<Integer>();
        ArrayList<Integer> maxArr = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> eachArr = new ArrayList<Integer>();
            for (int i1 : arr[i]) {
                eachArr.add(i1);
                temps.add(i1);
            }
            int minEach= Collections.min(eachArr);
            minArr.add(minEach);
        }
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> eachArr = new ArrayList<Integer>();
            for (int i1 : arr[i]) {
                eachArr.add(i1);
            }
            int maxEach= Collections.max(eachArr);
            maxArr.add(maxEach);
        }

        int minVal = Collections.min(minArr);
        int maxVal = Collections.max(maxArr);
       // System.out.println("High: "+ maxVal);
       // System.out.println("Low: "+ minVal);

        ArrayList<String> neverSaw = new ArrayList<String>();
        for (int i = minVal; i <= maxVal ; i++) {
            if (!temps.contains(i)){
                String s = "Never saw temperature: "+ i;
               // System.out.println(s);
                neverSaw.add(s);
            }
        }
        ArrayList<String> result = new ArrayList<String>();
        result.add("High: "+ maxVal);
        result.add("Low: "+ minVal);
        result.addAll(neverSaw);
        System.out.println(result);
        return result;
    }
    public static String tally(List<String> list){
        HashSet<String> elements = new HashSet<String>();
        HashMap<String, Integer> votings = new HashMap<String, Integer>();
        elements.addAll(list);

        for (String i : elements) {
            int xInteger = Collections.frequency(list, i);
            votings.put(i, xInteger);
        }
       int maxVote = Collections.max(votings.values());
        String winner = " ";
        for (String key : votings.keySet()) {
            if(votings.get(key) == maxVote){
                winner = key +" received the most votes!";
            }
        }
        System.out.println(winner);
        return  winner;
    }

}
