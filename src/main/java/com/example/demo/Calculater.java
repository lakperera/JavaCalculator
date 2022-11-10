package com.example.demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculater {

    private JPanel contentPane;
    private JButton a0Button;
    private JButton a1Button;
    private JButton button4;
    private JButton button5;
    private JButton button7;
    private JButton a7Button;
    private JButton button9;
    private JButton button10;
    private JButton a4Button;
    private JButton button12;
    private JButton cButton;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button20;
    private JButton button21;
    private JButton a6Button;
    private JButton button23;
    private JTextField textField;
    private JPanel Calculator;

    double a,b,result;
    String op;
    public Calculater() {
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() +a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + a0Button.getText());
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().contains("."))
                {
                    textField.setText(textField.getText() + button20);
                }
            }
        });

        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().contains(".")){
                    double pm=Double.parseDouble(textField.getText());
                    pm = pm*-1;
                    textField.setText(String.valueOf(pm));
                }
                else{
                    long pm = Long.parseLong(textField.getText());
                    pm=pm*-1;
                    textField.setText(String.valueOf(pm));
                }
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().contains("."))
                {
                    textField.setText(textField.getText() + button20.getText());
                }
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(textField.getText());
                op="+";
                textField.setText("");
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(textField.getText());
                op="-";
                textField.setText("");
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(textField.getText());
                op="*";
                textField.setText("");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(textField.getText());
                op="/";
                textField.setText("");
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace=null;
                if (textField.getText().length() > 0){
                    StringBuilder strB=new StringBuilder(textField.getText());
                    strB.deleteCharAt(textField.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    textField.setText(backspace);
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b= Double.parseDouble(textField.getText());
              if (op=="+"){
                  result=a+b;
                  textField.setText(String.valueOf(result));
              } else if (op=="-") {
                  result=a-b;
                  textField.setText(String.valueOf(result));
              }else if (op=="*") {
                  result=a*b;
                  textField.setText(String.valueOf(result));
              }else if (op=="/") {
                  result=a/b;
                  textField.setText(String.valueOf(result));
              }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculater().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
