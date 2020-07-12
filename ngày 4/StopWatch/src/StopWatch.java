import java.util.Date;

public class StopWatch {
   private Date startTime;
   private Date endTime;
   public long count;
   public long count1;


    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {

        return endTime;
    }

    public void start(){
        Date nowTime = new Date();
        this.startTime= nowTime;
         count = System.currentTimeMillis();

    }

    public void stop(){
        this.endTime = new Date();
         count1 = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return count1- count;

    }


    public static void main(String[] args) {
        StopWatch b = new StopWatch();
        b.start();
        System.out.println("Bắt đầu lúc"+b.startTime);
        for(long i=0;i<100000;i++){
            System.out.println(i);
        }
        b.stop();
        System.out.println("Kết thúc lúc "+b.endTime);
        System.out.println("Hết "+b.getElapsedTime()+ " miliseconds");

    }
}
