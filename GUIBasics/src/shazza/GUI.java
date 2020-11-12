package shazza;

import javax.swing.*;

public class GUI {
    private JPanel mainPanel;
    private JLabel messageLabel;
    private JPanel buttonPanel;
    private JButton startButton;
    private JButton stopButton;
    private JLabel tickLabel;
    private JButton helloButton;
    private Timer timer;

    public GUI() {
        stopButton.setEnabled( false );

        startButton.addActionListener( e -> start() );
        stopButton.addActionListener( e -> stop() );

        timer = new Timer( 1000, e -> tick() );
        tickLabel.setText( " " );

        helloButton.addActionListener( e -> sayHello() );
    }

    private void start() {
        messageLabel.setText( "You pressed START!" );
        startButton.setEnabled( false );
        stopButton.setEnabled( true );
        timer.start();
    }

    private void stop() {
        messageLabel.setText( "You pressed STOP!" );
        startButton.setEnabled( true );
        stopButton.setEnabled( false );
        timer.stop();
    }

    private void tick() {
        if( tickLabel.getText().equals( "Tick" ) ) tickLabel.setText( "Tock" );
        else tickLabel.setText( "Tick" );
    }

    private void sayHello() {
        Hello dialog = new Hello();
        dialog.pack();
        dialog.setResizable( false );
        dialog.setLocationRelativeTo( null );
        dialog.setVisible( true );
    }

    public static void main( String[] args ) {
        JFrame frame = new JFrame( "My First GUI" );
        frame.setContentPane( new GUI().mainPanel );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setResizable( false );
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
    }
}
