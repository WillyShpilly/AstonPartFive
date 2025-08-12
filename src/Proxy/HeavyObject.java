package Proxy;

public class HeavyObject {
    public HeavyObject() {
        simulateLongOperation();
    }

    public void doSomething() {
        System.out.println("Выполняем тяжёлую операцию");
    }

    private void simulateLongOperation() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
