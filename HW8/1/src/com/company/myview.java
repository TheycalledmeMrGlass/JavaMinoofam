/*
 * Created by JFormDesigner on Fri Jun 05 14:37:18 IRDT 2020
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Farzad
 */
public class myview {
    public myview() {
        initComponents();
       form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form.setVisible(true);

    }

    private void namefieldMouseClicked(MouseEvent e) {
        if(namefield.getText().equals("name:")){
namefield.setText("");
        }
    }

    private void agefieldMouseClicked(MouseEvent e) {
        if(agefield.getText().equals("age:")){
            agefield.setText("");
        }
        // TODO add your code here
    }

    private void fathernameFieldMouseClicked(MouseEvent e) {
        if(fathernameField.getText().equals("fathername:")){
            fathernameField.setText("");
        }
        // TODO add your code here
    }

    private void CityFieldMouseClicked(MouseEvent e) {
        if(CityField.getText().equals("city:")){
            CityField.setText("");
        }
    }

    private void TakhasosFieldMouseClicked(MouseEvent e) {
        if(TakhasosField.getText().equals("Takhasos:")){
            TakhasosField.setText("");
        }
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void DoneButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void SuccessButtonMouseClicked(MouseEvent e) { System.exit(0);}

    private void formButtonMouseClicked(MouseEvent e) {
if(namefield.getText().equals("")||namefield.getText().equals("name:")){
    error("name please");
}
else if(agefield.getText().equals("")||agefield.getText().equals("age")){
    error("age please");
}
else if(fathernameField.getText().equals("")||fathernameField.getText().equals("age")){
    error("fathername please");
}
else if(CityField.getText().equals("")||CityField.getText().equals("fathername")){
    error("cityfield please");
}
else if(TakhasosField.getText().equals("")||TakhasosField.getText().equals("Takhasos")){
    error("Takhasos please");
}
else{
try{
Service.getInstance().save(new Entity().setId(1).setName(namefield.getText()).setFathername(fathernameField.getText()).setAge(Integer.parseInt(agefield.getText())).setCity(CityField.getText()).setTakhasos(TakhasosField.getText()));
}catch (Exception ez){
    System.out.println("couldnt save"+ez.getMessage());
}
form.setVisible(false);
errordialog.setVisible(true);
}


    }

    private void error(String s) {
        errortext.setText("this cannot be empty"+s);
        errordialog.setVisible(true);
    }






    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Farzad
        form = new JFrame();
        namefield = new JTextField();
        agefield = new JTextField();
        fathernameField = new JTextField();
        CityField = new JTextField();
        TakhasosField = new JTextField();
        formButton = new JButton();
        Successdialog = new JFrame();
        SuccessText = new JLabel();
        SuccessButton = new JButton();
        errordialog = new JDialog();
        errortext = new JLabel();

        //======== form ========
        {
            var formContentPane = form.getContentPane();
            formContentPane.setLayout(null);

            //---- namefield ----
            namefield.setText("name:");
            namefield.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    namefieldMouseClicked(e);
                }
            });
            formContentPane.add(namefield);
            namefield.setBounds(30, 10, 110, 40);

            //---- agefield ----
            agefield.setText("age:");
            agefield.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    agefieldMouseClicked(e);
                }
            });
            formContentPane.add(agefield);
            agefield.setBounds(35, 60, 120, 35);

            //---- fathernameField ----
            fathernameField.setText("fathername:");
            fathernameField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    fathernameFieldMouseClicked(e);
                }
            });
            formContentPane.add(fathernameField);
            fathernameField.setBounds(40, 110, 115, fathernameField.getPreferredSize().height);

            //---- CityField ----
            CityField.setText("city:");
            CityField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    CityFieldMouseClicked(e);
                }
            });
            formContentPane.add(CityField);
            CityField.setBounds(40, 155, 135, CityField.getPreferredSize().height);

            //---- TakhasosField ----
            TakhasosField.setText("takhasos:");
            TakhasosField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    TakhasosFieldMouseClicked(e);
                }
            });
            formContentPane.add(TakhasosField);
            TakhasosField.setBounds(45, 205, 139, TakhasosField.getPreferredSize().height);

            //---- formButton ----
            formButton.setText("Done");
            formButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                    DoneButtonMouseClicked(e);
                    formButtonMouseClicked(e);
                }
            });
            formContentPane.add(formButton);
            formButton.setBounds(255, 50, 113, 105);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < formContentPane.getComponentCount(); i++) {
                    Rectangle bounds = formContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = formContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                formContentPane.setMinimumSize(preferredSize);
                formContentPane.setPreferredSize(preferredSize);
            }
            form.pack();
            form.setLocationRelativeTo(form.getOwner());
        }

        //======== Successdialog ========
        {
            var SuccessdialogContentPane = Successdialog.getContentPane();
            SuccessdialogContentPane.setLayout(null);

            //---- SuccessText ----
            SuccessText.setText("Finishing");
            SuccessdialogContentPane.add(SuccessText);
            SuccessText.setBounds(30, 30, 154, 75);

            //---- SuccessButton ----
            SuccessButton.setText("Done");
            SuccessButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    SuccessButtonMouseClicked(e);
                }
            });
            SuccessdialogContentPane.add(SuccessButton);
            SuccessButton.setBounds(50, 155, 163, 45);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < SuccessdialogContentPane.getComponentCount(); i++) {
                    Rectangle bounds = SuccessdialogContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = SuccessdialogContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                SuccessdialogContentPane.setMinimumSize(preferredSize);
                SuccessdialogContentPane.setPreferredSize(preferredSize);
            }
            Successdialog.pack();
            Successdialog.setLocationRelativeTo(Successdialog.getOwner());
        }

        //======== errordialog ========
        {
            var errordialogContentPane = errordialog.getContentPane();
            errordialogContentPane.setLayout(null);

            //---- errortext ----
            errortext.setText("Thank you");
            errordialogContentPane.add(errortext);
            errortext.setBounds(90, 50, 190, 65);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < errordialogContentPane.getComponentCount(); i++) {
                    Rectangle bounds = errordialogContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = errordialogContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                errordialogContentPane.setMinimumSize(preferredSize);
                errordialogContentPane.setPreferredSize(preferredSize);
            }
            errordialog.pack();
            errordialog.setLocationRelativeTo(errordialog.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Farzad
    private JFrame form;
    private JTextField namefield;
    private JTextField agefield;
    private JTextField fathernameField;
    private JTextField CityField;
    private JTextField TakhasosField;
    private JButton formButton;
    private JFrame Successdialog;
    private JLabel SuccessText;
    private JButton SuccessButton;
    private JDialog errordialog;
    private JLabel errortext;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
