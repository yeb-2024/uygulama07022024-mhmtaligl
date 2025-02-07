import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anasayfa implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("Profil Göster");

    public Anasayfa(){
        button.addActionListener(this);
        button.setBounds(200,200,200,50);
        frame.add(button);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Anasayfa");
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            frame.dispose();
            ProfilSayfası profilSayfası = new ProfilSayfası();
        }
    }
}
