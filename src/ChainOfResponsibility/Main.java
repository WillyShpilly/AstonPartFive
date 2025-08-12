package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler userHandler = new UserHandler();
        Handler adminHandler = new AdminHandler();
        Handler superadminHandler = new SuperadminHandler();

        userHandler.setNextHandler(adminHandler);
        adminHandler.setNextHandler(superadminHandler);

        Request req1 = new Request("User");
        userHandler.handleRequest(req1);

        Request req2 = new Request("Admin");
        userHandler.handleRequest(req2);

        Request req3 = new Request("Superadmin");
        userHandler.handleRequest(req3);

        Request req4 = new Request("Guest");
        userHandler.handleRequest(req4);
    }
}