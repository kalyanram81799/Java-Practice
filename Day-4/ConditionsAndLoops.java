class ConditionsAndLoops1 {

    // 1. If condition
    void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    // 2. Even or Odd
    void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    // 3. Grade calculation
    void calculateGrade(int marks) {
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }

    // 4. Switch example
    void printDay(int day) {
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            default: System.out.println("Invalid day");
        }
    }

    // 5. For loop
    void forLoopExample() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop i = " + i);
        }
    }

    // 6. While loop
    void whileLoopExample() {
        int i = 1;
        while (i <= 5) {
            System.out.println("While Loop i = " + i);
            i++;
        }
    }

    // 7. Do-While loop
    void doWhileLoopExample() {
        int i = 1;
        do {
            System.out.println("Do-While Loop i = " + i);
            i++;
        } while (i <= 5);
    }

    // 8. Enhanced for loop
    void enhancedForLoop() {
        int[] arr = {10, 20, 30, 40};

        for (int value : arr) {
            System.out.println("Value = " + value);
        }
    }

    // 9. Break & Continue
    void breakAndContinueExample() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
public class ConditionsAndLoops{

    public static void main(String[] args) {

        // Object creation
        ConditionsAndLoops1 obj = new ConditionsAndLoops1();

        // Method calls with initialization
        obj.checkVotingEligibility(20);
        obj.checkEvenOdd(15);
        obj.calculateGrade(82);
        obj.printDay(3);

        obj.forLoopExample();
        obj.whileLoopExample();
        obj.doWhileLoopExample();
        obj.enhancedForLoop();
        obj.breakAndContinueExample();
    }
}
