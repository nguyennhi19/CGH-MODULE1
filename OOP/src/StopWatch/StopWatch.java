package StopWatch;

public class StopWatch {
    private long startTime=0;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void StartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long  getElapsedTime(){
        long elapsed;
        elapsed = (endTime - startTime);
        return elapsed;
    }
}
