package main;

public class Main {
    public static void main(String[] args) {
        
        Model      model      = new Model();
        Controller controller = new Controller(model);
        //GUI       view       = new GUI(controller, model);
        GUI.start(controller, model);
    }
}
