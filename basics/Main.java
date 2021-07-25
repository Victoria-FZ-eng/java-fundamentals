public class Main {
    public static void main (String[] args){
        System.out.println("Hello from lab01");

        pluralize("dog", 1);
        pluralize("cat", 0);
        pluralize("bird", 5);
        flipNHeads(5);
    }

    public static void pluralize(String word , int num){
        if (num == 0 || num > 1){
            System.out.println(num +" "+ word + "s");
        }
        else {
           System.out.println(num +" "+ word );
        }
    }
    public static void flipNHeads (int num){
        int countHeads=0;
        int countFips=0;
        do {
            countFips++;
            double randomNum = Math.random();
            if (randomNum < 0.5){
                System.out.println("tails");
            }
            else {
                countHeads++;
                System.out.println("heads");
                if(num == countHeads){
                    System.out.println("It took "+countFips+" flips to flip "+ num+" heads in a row");
                }
            }
        }
        while (num != countHeads);


    }

}

