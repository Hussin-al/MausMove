import java.awt.Robot;
import java.awt.AWTException;
import java.util.Random;

public class RandomMouseMover {
    public static void main(String[] args) throws AWTException, InterruptedException {
        try {
            Robot robot = new Robot();
            Random random = new Random();

            while (true) {
                int x = random.nextInt(101) + 600;
                int y = random.nextInt(401) + 200;

                robot.mouseMove(x, y);
                Thread.sleep(2000);
            }
        } catch (AWTException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}