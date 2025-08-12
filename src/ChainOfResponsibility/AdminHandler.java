package ChainOfResponsibility;

public class AdminHandler extends Handler{
    @Override
    public void handleRequest(Request request) {
        if ("Admin".equals(request.getLevelAccess())) {
            System.out.println("Запрос обработан администратором.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request); // Передача запроса дальше
        } else {
            System.out.println("Никто не смог обработать запрос.");
        }
    }
}
