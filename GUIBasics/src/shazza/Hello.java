package shazza;

import javax.swing.*;

public class Hello extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;

    public Hello() {
        setContentPane( contentPane );
        setModal( true );
        getRootPane().setDefaultButton( buttonOK );

        buttonOK.addActionListener( e -> onOK() );
    }

    private void onOK() {
        // add your code here
        dispose();
    }
}
