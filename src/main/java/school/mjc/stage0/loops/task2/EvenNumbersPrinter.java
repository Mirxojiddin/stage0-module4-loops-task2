package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int son=0;
        while (son<=printTillInclusive)
        if (son%2==0)
            System.out.println(son++);
        else
            son++;
        }
    public static void main(String[] args) {
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();
        evenNumbersPrinter.printEvenNumbers(18);
    }
}
