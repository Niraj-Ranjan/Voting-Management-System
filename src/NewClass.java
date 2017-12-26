import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
 
public class NewClass extends JPanel implements ActionListener
{
    private JLabel timeLabel;
 
    public NewClass()
    {
        timeLabel = new JLabel( new Date().toString() );
        add( timeLabel );
 
        Timer timer = new Timer(1000, this);
        timer.setInitialDelay(1);
        timer.start();
    }
 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //System.out.println(e.getSource());
        timeLabel.setText( new Date().toString() );
    }
 
    private static void createAndShowUI()
    {
        JFrame frame = new JFrame("TimerTime");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( new NewClass() );
        frame.setLocationByPlatform( true );
        frame.pack();
        frame.setVisible( true );
    }
 
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowUI();
            }
        });
    }
}