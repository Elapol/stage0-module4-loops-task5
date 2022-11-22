package school.mjc.stage0.loops.task5;

public class Cross {
    public static void main(String[] args) {
        printCross(8);
    }

    public static void printCross(int sideLength) {
        for (int x = 0; x <= sideLength; x++) {
            for (int y = 0; y <= sideLength; y++) {
                if (x == y || x+y==sideLength) {
                    System.out.print("8");
                } else {

                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
