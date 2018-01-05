package main;

public class Main {
    public static void main(String[] args) {
        
        Model      model      = new Model();
        GUI       view       = new GUI();
        Controller controller = new Controller(view, model);
        
        //view.setVisible(true);
    }
}
