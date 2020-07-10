import java.util.Date;

public class StopWatch {
   private long startTime;
   private long endTime;

    public long getStartTime() {
        return startTime;
    }
    
    public long getEndTime() {
        return endTime;
    }
    public static void start(){
        Date c = new Date();
        System.out.println(c);
    }

    public static void main(String[] args) {
        StopWatch.start();
    }
}
