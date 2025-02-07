import javax.swing.*;
import java.awt.*;

public class ProfilSayfası {

    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JLabel imagelabel = new JLabel();
    JLabel açıklamalabel = new JLabel();

    public ProfilSayfası(){

        label.setText("İsim : Fatih Sultan Mehmet");
        label.setFont(new Font(null,Font.PLAIN,25));

        ImageIcon imageIcon = new ImageIcon("fatihsultanmehmet.jpg");
        Image newimage = imageIcon.getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimage);
        imagelabel.setIcon(image);

        açıklamalabel.setText("Açıklama : Fatih Sultan Mehmet İstanbul'u fetih ederek çağ açıp çağ kapatmıştır.");

        frame.add(label);
        frame.add(imagelabel);
        frame.add(açıklamalabel);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Profil Sayfası");
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
    }
}
