import javax.swing.JOptionPane;
import java.awt.AWTException;
import java.awt.event.MouseEvent;
import java.awt.Robot;

public class TestBot {
    private static Robot teste=null;

    public static void main(String[] args) {
        try {
            teste = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
        clicker(1000, 950);
    }

    public static void clicker(int x, int y){
        teste.mouseMove(x, y);
        teste.delay(2);
        teste.mousePress(MouseEvent.BUTTON1_MASK);
        teste.mouseRelease(MouseEvent.BUTTON1_MASK);
    }
}
