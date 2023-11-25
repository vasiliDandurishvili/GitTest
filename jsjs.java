import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

public class jsjs extends GraphicsProgram {
    private GRect[][] bricks;
    private int numRows = 10;
    private int numCols = 10;

    public void run() {
        addMouseListeners();
        createGrects();
    }

    private void createGrects() {
        bricks = new GRect[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                GRect brick = new GRect(40, 30);
                brick.setFilled(true);
                brick.setColor(Color.BLACK);
                double x = j * 40 + j * 5;
                double y = i * 30 + i * 5;
                add(brick, x, y);
                bricks[i][j] = brick; // Store the brick in the array
            }
        }
    }

    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (getElementAt(e.getX(), e.getY()) == bricks[i][j]) {
                    bricks[i][j].setColor(Color.RED);
                }
            }
        }
    }
}
