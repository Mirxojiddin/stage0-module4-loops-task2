package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int son = 0;
        if (multiplyByAndToInclusive>0)
            while (son<multiplyByAndToInclusive)
                System.out.println(multiplyByAndToInclusive*son++);
        else 
            if (multiplyByAndToInclusive<0)
                while (son<=multiplyByAndToInclusive*-1)
                    System.out.println(multiplyByAndToInclusive*son++);
        
    }  
}
