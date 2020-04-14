package bai_tap.b2_xay_dung_lop_StopWatch;

public class StopWatch {
    private long startTime = System.currentTimeMillis(), endTime;

    public StopWatch() {
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
