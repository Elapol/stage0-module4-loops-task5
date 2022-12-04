package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void main(String[] args) {
        printHourglassOfGivenSize(3);
    }

    public static void printHourglassOfGivenSize(int height) {

        for (int x = 0; x < height / 2; x++) {
            for (int y = height - x; y < height; y++) {
                System.out.print(" ");
            }
            for (int z = 0; z < (height - 2 * x); z++) {
                System.out.print("8");
            }

            System.out.println();
        }


        if (height % 2 == 0) {
            for (int x = height / 2 - 1; x >= 0; x--) {

                for (int y = height - x; y < height; y++) { //2

                    System.out.print(" ");
                }
                for (int z = 0; z < height - (x * 2); z++) {
                    System.out.print("8");
                }
                System.out.println();
            }
        } else {
            for (int x = height / 2; x >= 0; x--) {

                for (int y = height - x; y < height; y++) { //2

                    System.out.print(" ");
                }
                for (int z = 0; z < height - (x * 2); z++) {
                    System.out.print("8");
                }
                System.out.println();
            }
        }
    }
}





