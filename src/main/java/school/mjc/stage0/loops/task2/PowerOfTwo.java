package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int son = 0,power2=1;
        if (power<0)
            System.out.println("too much power");
        else {
            System.out.println(1);
            while(son<power){
                power2*=2;
                System.out.println(power2);
                son++;
            }
        }
    }
}
