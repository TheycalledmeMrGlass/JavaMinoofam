/*
 * Created by JFormDesigner on Sat Jun 06 22:23:45 IRDT 2020
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Farzad
 */
public class Form {
    public Form() {
        initComponents();
MainFrame.setVisible(true);
    }

    private void NamefieldMouseClicked(MouseEvent e) {
if(Namefield.getText().equals("Name:")){
    Namefield.setText("");
}
    }

    private void FamilyFieldMouseClicked(MouseEvent e) {
        if(FamilyField.getText().equals("FamilyName:")){
            FamilyField.setText("");
        }
    }

    private void FatherFieldMouseClicked(MouseEvent e) {
        if(FatherField.getText().equals("FatherName")){
            FatherField.setText("");
        }
    }

    private void DoneButtonMouseClicked(MouseEvent e) {
if(Namefield.getText().equals("")||Namefield.getText().equals("Name :")){
FailedText.setText("cannot be empty");
Failed.setVisible(true);
}
else if(FamilyField.getText().equals("")||FamilyField.getText().equals("FamilyName:")){
    FailedText.setText("cannot be empty");
    Failed.setVisible(true);
}
else if(FatherField.getText().equals("")||FatherField.getText().equals("FatherName")){
FatherField.setText("cannot be empty");
Failed.setVisible(true);
}
else {
    Controller controller=new Controller();
controller.name=Namefield.getText();
controller.familyname=FamilyField.getText();
controller.fathername=FatherField.getText();
Thread thread1=new Thread(){
    @Override
    public void run(){ controller.save();}
};
thread1.start();
File file=new File();
Thread thread2=new Thread(){
@Override
    public void run(){file.write();}
};
thread2.start();
SuccessText.setText("completed");
MainFrame.setVisible(false);
    Success.setVisible(true);


}
    }

    private void closeButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void SaveButtonMouseClicked(MouseEvent e) {
SaveFrame.setVisible(true);
MainFrame.setVisible(false);
    }

    private void doneButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void ShowButtonMouseClicked(MouseEvent e) {
Controller controller=new Controller();
Thread thread3=new Thread(){
@Override
    public void run(){
    for(Entity s:controller.show()){
ShowText.setText(String.valueOf(s));
    }
}
};
thread3.start();
MainFrame.setVisible(false);
Show.setVisible(true);

    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Farzad
        SaveFrame = new JFrame();
        Namefield = new JTextField();
        FamilyField = new JTextField();
        FatherField = new JTextField();
        DoneButton = new JButton();
        Failed = new JDialog();
        FailedText = new JLabel();
        MainFrame = new JDialog();
        SaveButton = new JButton();
        ShowButton = new JButton();
        Success = new JDialog();
        SuccessText = new JLabel();
        CloseButton = new JButton();
        closeButton = new JButton();
        Show = new JDialog();
        ShowText = new JLabel();
        doneButton = new JButton();

        //======== SaveFrame ========
        {
            var SaveFrameContentPane = SaveFrame.getContentPane();
            SaveFrameContentPane.setLayout(null);

            //---- Namefield ----
            Namefield.setText("Name:");
            Namefield.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    NamefieldMouseClicked(e);
                }
            });
            SaveFrameContentPane.add(Namefield);
            Namefield.setBounds(20, 20, 164, Namefield.getPreferredSize().height);

            //---- FamilyField ----
            FamilyField.setText("FamilyName:");
            FamilyField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    FamilyFieldMouseClicked(e);
                }
            });
            SaveFrameContentPane.add(FamilyField);
            FamilyField.setBounds(15, 80, 155, FamilyField.getPreferredSize().height);

            //---- FatherField ----
            FatherField.setText("Fathername:");
            FatherField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    FatherFieldMouseClicked(e);
                }
            });
            SaveFrameContentPane.add(FatherField);
            FatherField.setBounds(10, 145, 175, FatherField.getPreferredSize().height);

            //---- DoneButton ----
            DoneButton.setText("Done");
            DoneButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    DoneButtonMouseClicked(e);
                }
            });
            SaveFrameContentPane.add(DoneButton);
            DoneButton.setBounds(110, 235, 108, DoneButton.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < SaveFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = SaveFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = SaveFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                SaveFrameContentPane.setMinimumSize(preferredSize);
                SaveFrameContentPane.setPreferredSize(preferredSize);
            }
            SaveFrame.pack();
            SaveFrame.setLocationRelativeTo(SaveFrame.getOwner());
        }

        //======== Failed ========
        {
            var FailedContentPane = Failed.getContentPane();
            FailedContentPane.setLayout(null);
            FailedContentPane.add(FailedText);
            FailedText.setBounds(20, 30, 130, 65);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < FailedContentPane.getComponentCount(); i++) {
                    Rectangle bounds = FailedContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = FailedContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                FailedContentPane.setMinimumSize(preferredSize);
                FailedContentPane.setPreferredSize(preferredSize);
            }
            Failed.pack();
            Failed.setLocationRelativeTo(Failed.getOwner());
        }

        //======== MainFrame ========
        {
            var MainFrameContentPane = MainFrame.getContentPane();
            MainFrameContentPane.setLayout(null);

            //---- SaveButton ----
            SaveButton.setText("Save");
            SaveButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    SaveButtonMouseClicked(e);
                }
            });
            MainFrameContentPane.add(SaveButton);
            SaveButton.setBounds(35, 40, 118, SaveButton.getPreferredSize().height);

            //---- ShowButton ----
            ShowButton.setText("Show");
            ShowButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ShowButtonMouseClicked(e);
                }
            });
            MainFrameContentPane.add(ShowButton);
            ShowButton.setBounds(35, 105, 138, ShowButton.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < MainFrameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = MainFrameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = MainFrameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                MainFrameContentPane.setMinimumSize(preferredSize);
                MainFrameContentPane.setPreferredSize(preferredSize);
            }
            MainFrame.pack();
            MainFrame.setLocationRelativeTo(MainFrame.getOwner());
        }

        //======== Success ========
        {
            var SuccessContentPane = Success.getContentPane();
            SuccessContentPane.setLayout(null);

            //---- SuccessText ----
            SuccessText.setText("text");
            SuccessContentPane.add(SuccessText);
            SuccessText.setBounds(25, 5, 120, 50);

            //---- CloseButton ----
            CloseButton.setText("Close");
            SuccessContentPane.add(CloseButton);
            CloseButton.setBounds(50, 135, 133, CloseButton.getPreferredSize().height);

            //---- closeButton ----
            closeButton.setText("close");
            closeButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    closeButtonMouseClicked(e);
                }
            });
            SuccessContentPane.add(closeButton);
            closeButton.setBounds(45, 80, 103, closeButton.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < SuccessContentPane.getComponentCount(); i++) {
                    Rectangle bounds = SuccessContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = SuccessContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                SuccessContentPane.setMinimumSize(preferredSize);
                SuccessContentPane.setPreferredSize(preferredSize);
            }
            Success.pack();
            Success.setLocationRelativeTo(Success.getOwner());
        }

        //======== Show ========
        {
            var ShowContentPane = Show.getContentPane();
            ShowContentPane.setLayout(null);
            ShowContentPane.add(ShowText);
            ShowText.setBounds(10, 10, 175, 40);

            //---- doneButton ----
            doneButton.setText("Done");
            doneButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    doneButtonMouseClicked(e);
                }
            });
            ShowContentPane.add(doneButton);
            doneButton.setBounds(55, 85, 123, doneButton.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < ShowContentPane.getComponentCount(); i++) {
                    Rectangle bounds = ShowContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = ShowContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                ShowContentPane.setMinimumSize(preferredSize);
                ShowContentPane.setPreferredSize(preferredSize);
            }
            Show.pack();
            Show.setLocationRelativeTo(Show.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Farzad
    private JFrame SaveFrame;
    private JTextField Namefield;
    private JTextField FamilyField;
    private JTextField FatherField;
    private JButton DoneButton;
    private JDialog Failed;
    private JLabel FailedText;
    private JDialog MainFrame;
    private JButton SaveButton;
    private JButton ShowButton;
    private JDialog Success;
    private JLabel SuccessText;
    private JButton CloseButton;
    private JButton closeButton;
    private JDialog Show;
    private JLabel ShowText;
    private JButton doneButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
