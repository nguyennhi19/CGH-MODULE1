package StopWatch;

public class Test {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        System.out.printf("Start: %d\n", watch.getStartTime());
        watch.stop();
        System.out.printf("End: %d\n", watch.getEndTime());
        System.out.printf("Elapsed Time: %d", watch.getElapsedTime());

    }
}
