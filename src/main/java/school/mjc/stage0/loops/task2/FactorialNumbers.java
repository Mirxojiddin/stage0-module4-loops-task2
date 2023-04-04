package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int son = 0;
        int factaral=1;
        if (printToInclusive>=0)
           System.out.println(1);
        while (son<printToInclusive){
            factaral*=++son;
            System.out.println(factaral);
        }
    }
    public static void main(String[] args) {
        FactorialNumbers factorialNumbers = new FactorialNumbers();
        factorialNumbers.printFactorialRow(7);
    }
}
