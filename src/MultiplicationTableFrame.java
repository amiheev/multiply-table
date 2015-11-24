import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by Alexey on 20.11.2015.
 */
public class MultiplicationTableFrame extends JFrame {
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MultiplicationTableFrame frame = new MultiplicationTableFrame();
                    frame.setVisible(true);
                    frame.pack();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MultiplicationTableFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBounds(100, 100, 600, 500);
        setSize(480, 360);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new GridBagLayout());
        setContentPane(contentPane);
        Controller controller = new Controller();
        UserEnterButton btnNewButton = new UserEnterButton(controller);
        controller.setEnter(btnNewButton);
        UserResult result = new UserResult();
        controller.setTextResult(result);
        Summary summary = new Summary();
        controller.setSummary(summary);
        summary.setText("Press Refresh");
        Summary answer = new Summary();
        controller.setAnwser(answer);
        RefreshButton startButton = new RefreshButton(controller);
        controller.setStartButton(startButton);

        contentPane.add(summary, new GridBagConstraints(0,0,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0,0));
        contentPane.add(startButton, new GridBagConstraints(1,1,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0,0));

        contentPane.add(btnNewButton, new GridBagConstraints(0,1,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 25,0));

        contentPane.add(result, new GridBagConstraints(0,2,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0,0));

        contentPane.add(answer, new GridBagConstraints(1,2,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,15,1,1), 0,0));
    }
}
