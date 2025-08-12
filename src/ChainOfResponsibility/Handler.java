package ChainOfResponsibility;

abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }


    public abstract void handleRequest(Request request);
}
