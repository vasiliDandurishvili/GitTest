public class Problem_42 {
    public static void main(String[] args) {
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

        // Add "you win" message using red bricks
        String message = "you win";
        int xStart = (width - message.length()) / 2;
        int yStart = height / 2;

        // ASCII art representation of red bricks
        String brick = "\u001B[31m#\u001B[0m"; // \u001B[31m is ANSI escape code for red color

        for (int i = 0; i < message.length(); i++) {
            canvas[yStart][xStart + i] = brick.charAt(0);
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
