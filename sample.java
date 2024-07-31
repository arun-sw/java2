import java.awt.*;
public class sample{
  sample() {
      Frame frame =new Frame("ARUNKUMAR");
      Button but = new Button("Click Me");
     frame.add(but);
     frame.setLayout(new FlowLayout());
      frame.setVisible(true);
      frame.setSize(400, 300);
  }
  public static void main(String[] args) {
      new sample();
  }

}
