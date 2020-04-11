package bai_tap;

public class b2a_StopWatch {
    private long startTime = System.currentTimeMillis(), endTime;

    public b2a_StopWatch() {
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
