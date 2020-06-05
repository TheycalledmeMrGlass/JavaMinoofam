/*
 * Created by JFormDesigner on Fri Jun 05 21:43:42 IRDT 2020
 */

package com.company;

import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 * @author Farzad
 */
public class Myform extends JFrame {
    public int index;
    public Myform() {
        initComponents();
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
logFrame.setVisible(true);

    }
    private void userFieldMouseClicked(MouseEvent e) {
        if (userField.getText().equals("Enter Username"))
            userField.setText("");
    }
    private void passFieldMouseClicked(MouseEvent e) {
        if (passField.getText().equals("Enter Password"))
            passField.setText("");
    }
    private void uNameFieldMouseClicked(MouseEvent e) {
        if (uNameField.getText().equals("Enter New Name"))
            uNameField.setText("");
    }
    private void uUserFieldMouseClicked(MouseEvent e) {
        if (uUserField.getText().equals("Enter New Username"))
            uUserField.setText("");
    }
    private void uPassFieldMouseClicked(MouseEvent e) {
        if (uPassField.getText().equals("Enter New Password"))
            uPassField.setText("");
    }
    private void uEmailFieldMouseClicked(MouseEvent e) {
        if (uEmailField.getText().equals("Enter New Email"))
            uEmailField.setText("");
    }
    private void logButtonMouseClicked(MouseEvent e) {
        if (userField.getText().equals("") || userField.getText().equals("Enter Username")) {
            logErrorText.setText("Username can't be empty");
            logErrorDialog.setVisible(true);
        }
        else if (passField.getText().equals("") || passField.getText().equals("Enter Password")) {
            logErrorText.setText("Password can't be empty");
            logErrorDialog.setVisible(true);
        }
        else {
            if (Repository.users.contains(userField.getText()) == false) {
                logErrorText.setText("User doesn't exist");
                logErrorDialog.setVisible(true);
            }
            else {
                index = Repository.users.indexOf(userField.getText());
                String pass = Repository.passes.get(index);
                if (passField.getText().equals(pass)) {
                    logFrame.setVisible(false);
                    updateFrame.setVisible(true);
                }
                else {
                    logErrorText.setText("Wrong password");
                    logErrorDialog.setVisible(true);
                }
            }
        }
    }
    private void updateButtonMouseClicked(MouseEvent e) {
        if (uNameField.getText().equals("Enter New Name"))
            uNameField.setText("");
        if (uUserField.getText().equals("Enter New Username"))
            uUserField.setText("");
        if (uPassField.getText().equals("Enter New Password"))
            uPassField.setText("");
        if (uEmailField.getText().equals("Enter New Email"))
            uEmailField.setText("");
        String un=null, uu=null, up=null, ue=null;
        if (!uNameField.getText().equals(""))
            un = uNameField.getText();
        else try {
            un = Service.getInstance().report().get(index).getName();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (!uUserField.getText().equals(""))
            uu = uUserField.getText();
        else try {
            uu = Service.getInstance().report().get(index).getUsername();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (!uPassField.getText().equals(""))
            up = uPassField.getText();
        else try {
            up = Service.getInstance().report().get(index).getPassword();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (!uEmailField.getText().equals(""))
            ue = uEmailField.getText();
        else try {
            ue = Service.getInstance().report().get(index).getEmail();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            Service.getInstance().edit(new Entity().setId(index + 1).setName(un).setUsername(uu).setPassword(up).setEmail(ue));
        } catch (Exception ex) {
            System.out.println("failed to update " + ex.getMessage());
        }
        updateFrame.setVisible(false);
        successDialog.setVisible(true);
    }
    private void successButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Farzad
        logFrame = new JFrame();
        userField = new JTextField();
        passField = new JTextField();
        logbutton = new JButton();
        updateFrame = new JFrame();
        uNameField = new JTextField();
        uUserField = new JTextField();
        uPassField = new JTextField();
        uEmailField = new JTextField();
        UpdateButton = new JButton();
        logErrorDialog = new JDialog();
        logErrorText = new JTextField();
        successDialog = new JDialog();
        label1 = new JLabel();
        Successbutton = new JButton();

        //======== logFrame ========
        {
            var logFrameContentPane = logFrame.getContentPane();
            logFrameContentPane.setLayout(null);

            //---- userField ----
            userField.setText("username:");
            logFrameContentPane.add(userField);
            userField.setBounds(35, 20, 174, 50);

            //---- passField ----
            passField.setText("password:");
            logFrameContentPane.add(passField);
            passField.setBounds(30, 100, 184, 65);

            //---- logbutton ----
            logbutton.setText("Log in");
            logFrameContentPane.add(logbutton);
            logbutton.setBounds(60, 215, 133, 40);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < logFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = logFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = logFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                logFrameContentPane.setMinimumSize(preferredSize);
                logFrameContentPane.setPreferredSize(preferredSize);
            }
            logFrame.pack();
            logFrame.setLocationRelativeTo(logFrame.getOwner());
        }

        //======== updateFrame ========
        {
            var updateFrameContentPane = updateFrame.getContentPane();
            updateFrameContentPane.setLayout(null);

            //---- uNameField ----
            uNameField.setText("New Name:");
            updateFrameContentPane.add(uNameField);
            uNameField.setBounds(15, 10, 114, uNameField.getPreferredSize().height);

            //---- uUserField ----
            uUserField.setText("New Username:");
            updateFrameContentPane.add(uUserField);
            uUserField.setBounds(25, 55, 104, uUserField.getPreferredSize().height);

            //---- uPassField ----
            uPassField.setText("New Password:");
            updateFrameContentPane.add(uPassField);
            uPassField.setBounds(20, 95, 114, uPassField.getPreferredSize().height);

            //---- uEmailField ----
            uEmailField.setText("New Email:");
            updateFrameContentPane.add(uEmailField);
            uEmailField.setBounds(35, 140, 105, uEmailField.getPreferredSize().height);

            //---- UpdateButton ----
            UpdateButton.setText("Done");
            updateFrameContentPane.add(UpdateButton);
            UpdateButton.setBounds(50, 185, 113, UpdateButton.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < updateFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = updateFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = updateFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                updateFrameContentPane.setMinimumSize(preferredSize);
                updateFrameContentPane.setPreferredSize(preferredSize);
            }
            updateFrame.pack();
            updateFrame.setLocationRelativeTo(updateFrame.getOwner());
        }

        //======== logErrorDialog ========
        {
            var logErrorDialogContentPane = logErrorDialog.getContentPane();
            logErrorDialogContentPane.setLayout(null);
            logErrorDialogContentPane.add(logErrorText);
            logErrorText.setBounds(65, 65, 149, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < logErrorDialogContentPane.getComponentCount(); i++) {
                    Rectangle bounds = logErrorDialogContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = logErrorDialogContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                logErrorDialogContentPane.setMinimumSize(preferredSize);
                logErrorDialogContentPane.setPreferredSize(preferredSize);
            }
            logErrorDialog.pack();
            logErrorDialog.setLocationRelativeTo(logErrorDialog.getOwner());
        }

        //======== successDialog ========
        {
            var successDialogContentPane = successDialog.getContentPane();
            successDialogContentPane.setLayout(null);

            //---- label1 ----
            label1.setText("Update Successful");
            successDialogContentPane.add(label1);
            label1.setBounds(70, 25, 145, 50);

            //---- Successbutton ----
            Successbutton.setText("Close");
            successDialogContentPane.add(Successbutton);
            Successbutton.setBounds(95, 110, 153, 40);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < successDialogContentPane.getComponentCount(); i++) {
                    Rectangle bounds = successDialogContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = successDialogContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                successDialogContentPane.setMinimumSize(preferredSize);
                successDialogContentPane.setPreferredSize(preferredSize);
            }
            successDialog.pack();
            successDialog.setLocationRelativeTo(successDialog.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Farzad
    private JFrame logFrame;
    private JTextField userField;
    private JTextField passField;
    private JButton logbutton;
    private JFrame updateFrame;
    private JTextField uNameField;
    private JTextField uUserField;
    private JTextField uPassField;
    private JTextField uEmailField;
    private JButton UpdateButton;
    private JDialog logErrorDialog;
    private JTextField logErrorText;
    private JDialog successDialog;
    private JLabel label1;
    private JButton Successbutton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
