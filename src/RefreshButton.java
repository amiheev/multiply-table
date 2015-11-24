import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexey on 21.11.2015.
 */
public class RefreshButton extends JButton implements IRefreshButton, ActionListener {
    private IRefreshActionListner listener;
    public RefreshButton(IRefreshActionListner listener){
        super("refresh");
        init(listener);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        listener.refresh();
    }

    @Override
    public void init(IRefreshActionListner listener) {
        this.listener = listener;
        addActionListener(this);
    }


}
