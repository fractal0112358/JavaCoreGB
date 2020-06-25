import javafx.scene.input.KeyCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ClientWindow extends JFrame {

    JTextArea textArea;
    JTextField textField;


    public ClientWindow() {
        setTitle("Chat");
        setBounds(800, 300, 400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel center = new JPanel();
        add(center, BorderLayout.CENTER);
        center.setLayout(new BorderLayout());

        JPanel bottom = new JPanel();
        add(bottom, BorderLayout.SOUTH);
        bottom.setPreferredSize(new Dimension(1, 40));
        bottom.setLayout(new BorderLayout());

        JButton send = new JButton("➤");
        bottom.add(send, BorderLayout.EAST);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        center.add(scrollPane, BorderLayout.CENTER);
        textArea.setEditable(false);

        textField = new JTextField();
        bottom.add(textField, BorderLayout.CENTER);

        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addText();
            }
        });


        setVisible(true);

    }
    void addText() {
        textArea.append(textField.getText()+"\n");
        textField.setText(""); // чистем поле после
    }
}
