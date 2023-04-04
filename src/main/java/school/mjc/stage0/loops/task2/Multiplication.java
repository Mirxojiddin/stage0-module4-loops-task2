package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int son = 0;
        while (son<=multiplyByAndToInclusive)
            System.out.println(multiplyByAndToInclusive*son++);
    }
}
