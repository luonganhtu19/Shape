package StopWtach;
import java.sql.Time;
import java.util.Date;

public class StopWatch {
    private long startTime, endTime;


    public long getStartTime() {
        startTime=System.currentTimeMillis();
        return startTime;
    }

    public long getEndTime() {
        endTime=System.currentTimeMillis();
        return endTime;
    }
    public long getElapsedTime(){
        return (endTime-startTime);
    }
}
