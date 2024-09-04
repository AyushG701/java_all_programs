package lab10;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
//List in java
import javax.swing.JList;
import java.awt.FlowLayout;

public class Main {
   
public static void main(String[] args) {
     // JList <String> list1 = new JList<String>();
    // JList <Integer> list2 = new JList<Integer>();
     
    // String myString = new String();
    // Integer myint = new Integer();
    JFrame myFrame =  new JFrame();

    myFrame.setVisible(true);
    myFrame.setSize(300, 200);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.setLayout(new FlowLayout(FlowLayout.LEADING));


    DefaultListModel<String> lm  = new DefaultListModel<>();
    // DefaultListModel<Integer> lm1  = new DefaultListModel<>();
    lm.addElement("car");
    lm.addElement("bike");
    lm.addElement("bicycle");

    JList<String> L1 =  new JList<>(lm);
    myFrame.add(L1);

    // int[] num={1,2,3,4,5};
    // JList<Integer> L2 = new JList<>(num);
  

}
    

    
}
