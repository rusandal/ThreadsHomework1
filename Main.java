public class Main {
    public static void main(String[] args) throws InterruptedException{
        ThreadGroup group1 =new ThreadGroup("my group");
        MyThread myThread1 = new MyThread(group1, "поток 1");
        MyThread myThread2 = new MyThread(group1, "поток 2");
        MyThread myThread3 = new MyThread(group1, "поток 3");
        MyThread myThread4 = new MyThread(group1, "поток 4");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        Thread.sleep(15000);
        group1.interrupt();
    }
}
