package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int son=0;
        while (son<=lastPrinted)
        System.out.println(son++);
    }
    public static void main(String[] args) {
        NaturalNumbers naturalNumbers =new NaturalNumbers();
        naturalNumbers.naturalNumbersPrinter(15);
    }

}
