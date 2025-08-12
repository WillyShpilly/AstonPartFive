package ChainOfResponsibility;

public class Request {
    private String levelAccess;

    public Request(String levelAccess) {
        this.levelAccess = levelAccess;
    }

    public String getLevelAccess() {
        return levelAccess;
    }
}
