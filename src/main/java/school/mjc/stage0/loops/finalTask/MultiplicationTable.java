package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {

        for (int i = 1; i < 11; i++) {
            int answer = i * numberTableToPrint;
            System.out.println(i + " x " + numberTableToPrint + " = " + answer);
        }
    }
}
