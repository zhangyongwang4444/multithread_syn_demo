public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        // 每个线程都会同时调用这个方法
        synchronized (target) {
            target.call(msg);
        }
    }
}