package Proxy;

public class ProxyObject {
    private HeavyObject heavyObject;

    public void doSomething() {
        if (heavyObject == null) {
            heavyObject = new HeavyObject();
        }
        heavyObject.doSomething();
    }
}
