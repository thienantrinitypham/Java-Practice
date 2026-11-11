public class LittleMonkeys {
    public static void main(String[] args) {
        int monkeyCount = 3;
        boolean jumping = true;   

        String state = jumping ? "jumping on the bed!" : "resting quietly.";

        System.out.println( monkeyCount + " little monkeys are " + state);

        if (jumping == true && monkeyCount > 0) {
            System.out.println("One fell off and bumped their head!");
            System.out.println("Mama called the doctor, and the doctor said:");
            System.out.println("\"No more monkets jumping on the bed!\"");
        }
        else {
            System.out.println("No monkeys are jumping on the bed!");
        }

        switch (monkeyCount) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
        }
    }
}
