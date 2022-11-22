package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void main(String[] args) {
        printHourglassOfGivenSize(5);
    }

    public static void printHourglassOfGivenSize(int height) {
        for (int x = 1; x < height; x++) {
            for (int y = 1; y < x; y++) {
                System.out.print(" ");
            }
            for (int z = height; z >= x; z--) {
                System.out.print("8 ");
            }

            System.out.println();
        }
            for (int x = 0; x < height; x++) {
                for (int y = height - 1; y > x; y--) {

                    System.out.print(" ");
                }
                for (int z = 0; z <= x; z++) {
                    System.out.print("8 ");
                }
                System.out.println();
            }
        }
    }




