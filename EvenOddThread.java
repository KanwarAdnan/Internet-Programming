public class EvenOddThread extends Thread {
    private final int valueRange;

    public EvenOddThread(String name , int valueRange) {
        super(name);
        this.valueRange = valueRange;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 1; i <= valueRange; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
            System.out.println(" Message from " + threadName);
        }
    }

    public static void main(String[] args) {
        int valueRange = 1000;
        EvenOddThread thread1 = new EvenOddThread("T1",valueRange);
        EvenOddThread thread2 = new EvenOddThread("T2",valueRange);
        thread1.start();
        thread2.start();

    }
}
