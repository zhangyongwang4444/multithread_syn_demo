public class CallerQ2 extends Thread {

    Q q;

    int n = 666;

    CallerQ2(Q target) {
        q = target;
        start();
    }

    public void run() {
        q.put(n);
    }
}
