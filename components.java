import java.awt.*;
public class components {
    components(){


    Frame frame=new Frame("Arunkumar");
    Button but = new Button("save");
    Label save=new Label("save file");
    TextField text=new TextField("enter name");
    TextArea textarea=new TextArea("enter text");
    Checkbox che=new Checkbox("male");
    Choice country=new Choice();
    country.add("india");
        country.add("china");
        country.add("america");

    frame.add(che);
    frame.add(but);
    frame.add(textarea);
    frame.add(country);

   frame.setLayout(new FlowLayout());
   frame.setVisible(true);
   frame.setSize(400,300);

}
public static void main(String[] args) {
        new components();
}
}
