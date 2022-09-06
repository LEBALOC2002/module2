package practice_Creating_Threads_Runnable;

public class Main {
    public static void main(String[] args) {
        Runnable_demo runnableDemo1 = new Runnable_demo("Thread-1-HR-Database");
        runnableDemo1.start();

        Runnable_demo runnableDemo2 = new Runnable_demo("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("Main thread stopped!!! ");
    }
    }

