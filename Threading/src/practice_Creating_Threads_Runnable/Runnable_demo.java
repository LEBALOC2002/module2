package practice_Creating_Threads_Runnable;

public class Runnable_demo implements Runnable {
    private Thread t;
    private final String threadName  ;

    public Runnable_demo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0 ; i--) {
                System.out.println("Thread: " + threadName + " "+ i);
                //dừng vòng lặp  trong 50 ms
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted");
        }
        System.out.println("Thread " + threadName + " exiting");
    }
    public void start (){
        System.out.println( "Starting " + threadName
        );
        if (t == null) {
            t = new Thread(this,threadName);
            t.start();
        }
    }
}
