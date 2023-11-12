
import acm.program.GraphicsProgram;

public class Problem_42 extends GraphicsProgram {
	public void run(){
		        // Set canvas size
		        int width = 40;
		        int height = 8;

		        // Create canvas
		        char[][] canvas = new char[height][width];

		        // Initialize canvas with spaces
		        for (int i = 0; i < height; i++) {
		            for (int j = 0; j < width; j++) {
		                canvas[i][j] = ' ';
		            }
		        }

		        // Add "you win" message using bricks
		        String message = "you win";
		        int xStart = (width - message.length()) / 2;
		        int yStart = height / 2;

		        for (int i = 0; i < message.length(); i++) {
		            canvas[yStart][xStart + i] = message.charAt(i);
		        }

		        // Print the canvas
		        for (int i = 0; i < height; i++) {
		            for (int j = 0; j < width; j++) {
		                System.out.print(canvas[i][j]);
		            }
		            System.out.println(); // Move to the next line after each row
		        }
		    }
		}
