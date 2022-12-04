package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void main(String[] args) {
        printHourglassOfGivenSize(4);
    }

    public static void printHourglassOfGivenSize(int height) {
        for (int x = 0; x < height/2; x++) {
            for (int y = 0; y < x; y++) {
                System.out.print(" ");
            }
            for (int z =0; z<=(height-x*2)-1; z++) {
                System.out.print("8");
            }

            System.out.println();
        }
            for (int x = 1; x <= height/2; x++) { //1
                for (int y = height; y > x; y--) { //2

                    System.out.print(" ");
                }
                for (int z = 0; z <(x*2)-1; z++) {
                    System.out.print("8");
                }
                System.out.println();
            }
        }
    }




