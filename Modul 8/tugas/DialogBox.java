public class DialogBox extends Window {
    private DataController controller; // association: dialog berhubungan dengan controller

    public void setController(DataController controller) {
        this.controller = controller;
    }

    public DataController getController() {
        return controller;
    }
}
