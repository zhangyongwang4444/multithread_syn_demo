public class Sync2 {
    public static void main(String args[]) {

        Q target = new Q();  // 这是被多线程共享的目标资源

        CallerQ1 obj1 = new CallerQ1(target);
        CallerQ2 obj2 = new CallerQ2(target);

        // 主线程逻辑
        System.out.println("This is the logic of Main Thread !");
    }
}


