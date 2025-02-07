import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anasayfa implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("Profile Göster");

    public Anasayfa(){
        button.addActionListener(this);
        button.setBounds(200,200,100,50);
        frame.add(button);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Anasayfa");
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
