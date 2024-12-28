package chapter15;

import java.io.*;

public class MyScanner {
    private InputStream stream;
    private InputStreamReader reader;

    public MyScanner(InputStream stream) {
        this.stream = stream;
        this.reader = new InputStreamReader(stream);
    }

    public char nextChar() {
        try {
            int ch = reader.read();
            return (char) ch;
        } catch (IOException e) {
            System.out.println("Error!");
        }
        return (char)0;
    }

    public String next() {
        try (
                BufferedReader br = new BufferedReader(reader)
                ) {
            String line = br.readLine();
            return line;
        } catch (IOException e) {
            System.out.println("Error!");
        }

        return "";
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }


}
