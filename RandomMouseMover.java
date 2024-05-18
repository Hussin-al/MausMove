import java.awt.Robot;
import java.awt.AWTException;
import java.util.Random;

public class RandomMouseMover {
    public static void main(String[] args) throws AWTException, InterruptedException {
        try {
            Robot robot = new Robot();
            Random random = new Random();

            while (true) {
                int x = random.nextInt(101) + 600;  // Range from 600 to 700 (inclusive)
                int y = random.nextInt(401) + 200;  // Range from 200 to 600 (inclusive)

                robot.mouseMove(x, y);
                Thread.sleep(2000); // Sleep for 2 seconds
            }
        } catch (AWTException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
