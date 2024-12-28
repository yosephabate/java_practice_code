package chapter15;

import chapter14.B;

import java.io.*;
import java.util.StringTokenizer;

public class FileOperation {
    public static void readFileCharByChar(String filePath) {
        try (FileReader fr = new FileReader(filePath)) {
            int ch = fr.read();
            int count = 0;
            while (ch != -1) {
                count++;
                System.out.print((char)ch);
                ch = fr.read();
            }
            System.out.println("Count : " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }

    public static void readFileLineByLine(String filePath) {
        try (
                FileReader fr = new FileReader(filePath);
                BufferedReader br = new BufferedReader(fr)
                ) {
            String line = br.readLine();
            int count = 0;
            while (line != null) {
                count++;
                System.out.println(line);
                line = br.readLine();
            }
            System.out.println("Count : " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }

    public static void copyFileContents(String source, String destination) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(source));
                BufferedWriter bw = new BufferedWriter(new FileWriter(destination))
                ) {

            String line = br.readLine();
            while (line != null) {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("File I/O exception!");
        }
    }

    public static void readFromKeyboard() {
        try (
                InputStreamReader stream = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(stream)
                ) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Keyboard error!");
        }
    }

    public static void printNamesFromFile(String filePath) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath))
                ) {

            String line = br.readLine();
            while (line != null) {
                StringTokenizer st = new StringTokenizer(line, "#");
                while (st.hasMoreTokens()) {
                    System.out.println(st.nextToken());
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("File I/O exception!");
        }
    }

    public static void printNumbers(String filePath) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath))
                ) {

            String line = br.readLine();
            while (line != null) {
                StringTokenizer st = new StringTokenizer(line, "#");
                while (st.hasMoreTokens()) {
                    System.out.println(Integer.parseInt(st.nextToken()) + 10);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("File error!");
        }
    }

    public static void main(String[] args) {
        //readFileCharByChar("/Users/yosephabate/products.txt");
        //readFileLineByLine("/Users/yosephabate/products.txt");
        //copyFileContents("/Users/yosephabate/original.txt",
        //        "/Users/yosephabate/newcontent.txt");
        //printNamesFromFile("/Users/yosephabate/namesofstudents.txt");
        printNumbers("/Users/yosephabate/numbers.txt");
    }
}
