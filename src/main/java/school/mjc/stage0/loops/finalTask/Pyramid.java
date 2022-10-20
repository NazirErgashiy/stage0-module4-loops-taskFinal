package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        for (int i = 0; i <= cathetusLength; i++) {
            if (i==0)continue;

            for (int s = 0; s < cathetusLength - i; s++) {
                System.out.print(" ");
            }
            for (int d = 0; d < i; d++) {
                System.out.print(i - d);
            }
            for (int d = 1; d < i; d++) {
                System.out.print(d+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
