public class CallerQ1 extends Thread {

    Q q;


    CallerQ1(Q target) {
        q = target;
        start();
    }

    public void run() {
        q.get();
    }
}
