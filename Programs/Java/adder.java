import javax.swing.*;

class adder {
    JButton b;

    adder() {
        JFrame f = new JFrame("Adder");
        JButton b = new JButton("ok");
        b.setBounds(100, 170, 100, 30);
        f.add(b); // Button1
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new adder();
    }
}