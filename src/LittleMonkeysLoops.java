public class LittleMonkeysLoops {
    public static void main(String[] args) {
        int initialMonkeyCount = 4;

        for (int i = initialMonkeyCount; i >= 1; i--) {
            System.out.println(i + " little monkeys jumping on the bed,");
            System.out.println("One fell off and bumped their head!");
            System.out.println("Mama called the doctor and the doctor said,");
            System.out.println("\"No more monkeys jumping on the bed!\"");
            System.out.println(); 
        }

        int checkupCounter = 1;

        while (checkupCounter <= initialMonkeyCount) {
            System.out.println("Doctor is examining monkey #" + checkupCounter + "... All cleared!");
            checkupCounter++;
        }
        System.out.println(); 

        int bedtimeCounter = initialMonkeyCount;
        
        do {
            System.out.println("Tucking in monkey #" + bedtimeCounter + "... Fast asleep!");
            bedtimeCounter--;
        } while (bedtimeCounter >= 1);
    }
}
