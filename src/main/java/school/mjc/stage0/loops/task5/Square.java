package school.mjc.stage0.loops.task5;

public class Square {
    public static void main(String[] args) {
        printSquareFrom8s(2);
    }

    public static void printSquareFrom8s(int sideLength) {
        for (int x = 1; x <= sideLength; x++) {
            for (int y = 1; y <= sideLength; y++) {
                if (x == 1 || y == 1 || x == sideLength || y == sideLength) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }
}
