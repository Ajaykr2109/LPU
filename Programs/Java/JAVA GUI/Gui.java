import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Gui {
    JButton b;
    JTextField t1,t2;
    Jlabel l1;
    
    Gui(){

        JFrame f = new JFrame("Adder");
        JButton b = new JButton("Calculate");
        
        t1=new JTextField();
        t1.setBounds(90,50,100,30);
        t2=new JTextField();    
        t2.setBounds(90,80,100,30);
        l1=new JLabel("Result");
        l1.setBounds(90,130,100,30);
        b.setBounds(100,170,100,30);
        f.add(b);
        f.add(t1);
        f.add(t2);
        f.add(l1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

        b.getActionListeners(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int n1=Integer.parseInt(t1.getText());
                int n2=Integer.parseInt(t2.getText());
                int res=n1+n2;
                l1.setText(String.valueOf("Summation: "+res));
            }
        });

        

    }
    public static void main(String[] args)
    {

    }
}
