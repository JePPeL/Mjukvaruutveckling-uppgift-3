package main;

public class Main {
    public static void main(String[] args) {
        
        GUI       view       = new GUI();
        Model      model      = new Model(view);
        Controller controller = new Controller(view, model);
        
        //view.setVisible(true);
    }
}
