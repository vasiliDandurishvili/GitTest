import acm.program.ConsoleProgram;


//aaabbbbbccd -> a3b4c2d1 

public class Final_2022_1 extends ConsoleProgram {
    public void run() {
        String line = readLine();
        String compressed = manipString(line);

        if (line.length() > compressed.length()) {
            println(compressed);
        } else {
            println(line);
        }
    }

    private String manipString(String line) {
        if (line.length() == 1) {
            return line.charAt(0) + "" + 1;
        }
        int sames = 1;
        String result = "";

        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) != line.charAt(i + 1)) {
                result += line.charAt(i) + "" + sames;
                sames = 1;
            } else {
                sames += 1;
            }
        }

        // Handle the last character in the string
        if (line.charAt(line.length() - 1) != line.charAt(line.length() - 2)) {
            result += line.charAt(line.length() - 1) + "" + 1;
        } else {
            result += line.charAt(line.length() - 1) + "" + sames;
        }

        return result;
    }
}
