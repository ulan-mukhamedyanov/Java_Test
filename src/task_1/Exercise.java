package task_1;

import java.util.Random;

public class Exercise {

    private static Random rnd = new Random();

    public void start() throws Exception {
        if (rnd.nextInt(101) > 25) {
            System.out.println("Exercise run");
        }
        else throw new Exception("Error starting the exercise!");
    }

    public void execute() throws Exception {
        if (rnd.nextInt(101) > 25) {
            System.out.println("Exercise executed");
        }
        else throw new Exception("Error starting the exercise!");
    }

    public void addNegativePoints() {
        System.out.println("Negative points added");
    }

    public void end() {
        System.out.println("Exercise ended");
    }
}