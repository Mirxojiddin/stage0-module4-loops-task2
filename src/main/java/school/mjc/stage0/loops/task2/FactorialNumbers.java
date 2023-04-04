package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int son = 1;
        int factaral=1;
        if (printToInclusive==0 || printToInclusive==1)
            System.out.println(1);
        else {
            System.out.println(1);
            while (son<printToInclusive){
                factaral*=++son;
                System.out.println(factaral);
            }
        }
    }
}
