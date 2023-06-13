import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField TextField1 = new JTextField("",10);
    private JTextField TextField2 = new JTextField("",10);
    private JTextField TextField3 = new JTextField("",10);
    private JLabel Label = new JLabel("Complete This Task");
    private JLabel Label1 = new JLabel("Choose the right word \nMy mum ... every marning");
    private JLabel Label2 = new JLabel("Input:");
    private JLabel Label3 = new JLabel("Input:");

    private JRadioButton RadioButton1  = new JRadioButton("Select");
    private JRadioButton RadioButton2  = new JRadioButton("Select");
    private JCheckBox Check = new JCheckBox("Check");
    public GUI(){
        super("задание 1");
        this.setBounds(250,250,500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(Label);
        container.add(Label1);

        ButtonGroup group =new ButtonGroup();
        group.add(RadioButton1);
        group.add(RadioButton2);
        container.add(RadioButton1);
        RadioButton1.setSelected(true);
        container.add(RadioButton2);


        container.add(Label2);
        container.add(TextField2);
        container.add(Label3);
        container.add(TextField3);
    }
}
