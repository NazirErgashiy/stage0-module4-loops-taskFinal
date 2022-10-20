package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i <= cathetusLength; i++) {
            if (i == 0) continue;

            for (int s = 0; s < cathetusLength - i; s++) {
                System.out.print(" ");
            }
            for (int d = 0; d < i; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
