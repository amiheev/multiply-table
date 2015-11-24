import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexey on 20.11.2015.
 */
public class UserEnterButton extends JButton implements IEnterButton, ActionListener {
    private IEnterActionListener listener;
    public UserEnterButton(IEnterActionListener listener){
        super("enter");
        init(listener);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        listener.action();
    }

    @Override
    public void init(IEnterActionListener listener) {
        this.listener = listener;
        addActionListener(this);
    }


}
