package chapter14;

public class LineTest {
    public static void main(String[] args) {
        Line line1 = new Line(1, -1);
        Line line2 = new Line(-1, 2);
        Line line3 = new Line(1, 0);

        try {
            System.out.println(Line.getXIntersect(line1, line2));
            System.out.println(Line.getXIntersect(line2, line3));
            System.out.println(Line.getXIntersect(line1, line3));
        } catch (ParallelLinesException e) {
            System.out.println(e.getMessage());
        }

    }
}
