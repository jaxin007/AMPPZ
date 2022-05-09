import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.*;

public class CreateFrameExample {
    public static void main(String args[]) {
        JFrame frame = new JFrame("BILOZOR AMPPZ №1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container content = frame.getContentPane();
        content.setLayout(new GridLayout(0, 1));

        content.add(new JLabel("Перший рядок"));
        JTextField textFieldOne = new JTextField("Пришёл увидел победил");
        content.add(textFieldOne);

        content.add(new JLabel("Другий рядок"));
        JTextField textFieldTwo = new JTextField("Пришёл увидел не победил");
        content.add(textFieldTwo);

        JButton button = new JButton("Пошук спільних літер");
        frame.add(button);

        content.add(new JLabel("Спільні символи:"));
        JTextField matches = new JTextField();
        content.add(matches);

        content.add(new JLabel("Лабораторна робота №1 з дисципліни 'Архітектура моделювання та програмування ПЗ'"));
        content.add(new JLabel("Виконав: студент гр. ПЗС-1944 Білозор Д.О."));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String firstFieldValue = textFieldOne.getText();
                String secondFieldValue = textFieldTwo.getText();

                String[] firstArrField = firstFieldValue.split(" ");
                String[] secondArrField = secondFieldValue.split(" ");

                int i = 0;

                Stack<String> res = new Stack<>();

                for (String word : firstArrField) {
                    String wordToCompare = secondArrField[i];

                    System.out.println(wordToCompare + " " + word);

                    if (word.equals(wordToCompare)) {
                        res.push(word);
                    }

                    i++;
                }

                if (res.size() > 0) {
                    matches.setText(res.toString());
                }
            }
        });

        frame.setSize(600, 200);
        frame.setVisible(true);
    }
}