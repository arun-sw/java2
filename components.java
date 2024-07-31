import java.awt.*;
public class components {
    components(){

    Frame frame=new Frame("Arunkumar");
    Button but = new Button("save");
        but.setBounds(100,150,100,20);
    Label save=new Label("save file");
        save.setBounds(100,50,100,20);


        Label label=new Label(" NAME :");
        label.setBounds(50,50,40,20);
        TextField text=new TextField("|");
        text.setBounds(100,50,75,20);

        Label labelone=new Label(" AGE :");
        labelone.setBounds(50,70,50,20);
        TextField num=new TextField("");
        num.setBounds(100,70,50,20);

        Label label2=new Label(" GENTER :");
        label2.setBounds(30,90,75,20);

        Checkbox che=new Checkbox("male");
        che.setBounds(125,90,40,20);
        Checkbox che1=new Checkbox("female");
        che1.setBounds(170,90,50,20);

        Label label3=new Label(" COUNTRY :");
        label3.setBounds(30,120,75,20);
        Choice country=new Choice();
        country.setBounds(125,120,50,20);
        country.add("india");
        country.add("china");
        country.add("america");

    frame.add(label);
    frame.add(text);
    frame.add(labelone);
    frame.add(num);
    frame.add(label2);
    frame.add(che);
    frame.add(che1);
    frame.add(label3);
    frame.add(country);
    frame.add(but);

//    frame.add(save);


   frame.setLayout(null);
   frame.setVisible(true);
   frame.setSize(400,300);

}
public static void main(String[] args) {
        new components();
}
}
