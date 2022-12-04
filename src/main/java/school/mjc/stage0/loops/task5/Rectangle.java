package school.mjc.stage0.loops.task5;

public class Rectangle {
    public static void main(String[] args){
        printRectangleFrom8s(3,2);
    }
    public static void printRectangleFrom8s(int length, int height){
        for (int x = 1; x <= height; x++) {
            for (int y = 1; y <= length; y++) {
                if (x == 1 || y == 1 || x == height || y == length) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }
}


