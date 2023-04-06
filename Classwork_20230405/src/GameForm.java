import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class GameForm extends JFrame {
    private JLabel labelPlayer1;
    private JTextField fieldPlayer1;
    private JLabel labelPlayer2;
    private JTextField fieldPlayer2;
    private JButton buttonCheckWinner;
    private JButton buttonGenerateValue1;
    private JButton buttonGenerateValue2;
    private JLabel labelWinner;
    private int gameMode; //1 - человек-человек, 2 - человек-компьютер, 3 - компьютер-компьютер


    public GameForm() {
        super("Камень, ножницы, бумага");
        createForm();
        changeForm("Человек VS Человек");
    }

    public void createForm() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel labelChooseMode = new JLabel("Режим игры:"); // создание подписи для поля
        labelChooseMode.setBounds(10, 10, 90, 30); // размеры подписи
        add(labelChooseMode); // выводим подпись на форму

        String[] modes = {
                "Человек VS Человек",
                "Человек VS Компьютер",
                "Компьютер VS Компьютер"
        };
        JComboBox comboBoxModes = new JComboBox(modes);
        comboBoxModes.setBounds(100, 10, 200, 30);
        add(comboBoxModes);
        ActionListener comboBoxModesActionListener = new GameForm.comboBoxModesActionListener();
        comboBoxModes.addActionListener(comboBoxModesActionListener);

        JLabel labelTitle = new JLabel("Значения игроков: 'камень', 'ножницы', 'бумага':"); // создание подписи для поля
        labelTitle.setBounds(10, 50, 300, 30); // размеры подписи
        add(labelTitle); // выводим подпись на форму

        labelPlayer1 = new JLabel(""); // создание подписи для поля
        labelPlayer1.setBounds(10, 90, 90, 30); // размеры подписи
        add(labelPlayer1); // выводим подпись на форму

        fieldPlayer1 = new JTextField(""); // создание поля ввода
        fieldPlayer1.setBounds(100, 90, 200, 30); // размеры поля ввода
        add(fieldPlayer1); // выводим поле ввода на форму

        buttonGenerateValue1 = new JButton("Сгенерировать");
        buttonGenerateValue1.setBounds(310, 90, 150, 30);
        add(buttonGenerateValue1);

        buttonGenerateValue2 = new JButton("Сгенерировать");
        buttonGenerateValue2.setBounds(310, 130, 150, 30);
        add(buttonGenerateValue2);
        ActionListener buttonGenerateValue1ActionListener = new GameForm.buttonGenerateValue1ActionListener();
        buttonGenerateValue1.addActionListener(buttonGenerateValue1ActionListener);
        ActionListener buttonGenerateValue2ActionListener = new GameForm.buttonGenerateValue2ActionListener();
        buttonGenerateValue2.addActionListener(buttonGenerateValue2ActionListener);

        labelPlayer2 = new JLabel(""); // создание подписи для поля
        labelPlayer2.setBounds(10, 130, 90, 30); // размеры подписи
        add(labelPlayer2); // выводим подпись на форму

        fieldPlayer2 = new JTextField("");
        fieldPlayer2.setBounds(100, 130, 200, 30);
        add(fieldPlayer2);

        buttonCheckWinner = new JButton("Узнать победителя");
        buttonCheckWinner.setBounds(100, 170, 200, 30);
        add(buttonCheckWinner);

        ActionListener buttonCheckWinnerActionListener = new GameForm.ButtonCheckWinnerActionListener();
        buttonCheckWinner.addActionListener(buttonCheckWinnerActionListener);

        labelWinner = new JLabel("");
        labelWinner.setBounds(10, 210, 290, 30); // размеры подписи
        add(labelWinner); // выводим подпись на форму

        setSize(485, 300);
        setLayout(null);
        setVisible(true);
    }

    public class comboBoxModesActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JComboBox boxMode = (JComboBox) e.getSource();
            String mode = (String) boxMode.getSelectedItem();
            changeForm(mode);
        }
    }

    private void changeForm(String mode) {
        if (mode.equals("Человек VS Человек")) {
            gameMode = 1;
            labelPlayer1.setText("Игрок 1:");
            fieldPlayer1.setText("");
            fieldPlayer1.setEnabled(true);
            labelPlayer2.setText("Игрок 2:");
            fieldPlayer2.setText("");
            fieldPlayer2.setEnabled(true);
            buttonGenerateValue1.setVisible(false);
            buttonGenerateValue2.setVisible(false);
        } else if (mode.equals("Человек VS Компьютер")) {
            gameMode = 2;
            labelPlayer1.setText("Игрок:");
            fieldPlayer1.setText("");
            fieldPlayer1.setEnabled(true);
            labelPlayer2.setText("Компьютер:");
            fieldPlayer2.setText("");
            fieldPlayer2.setEnabled(false);
            buttonGenerateValue1.setVisible(false);
            buttonGenerateValue2.setVisible(true);
        } else {
            gameMode = 3;
            labelPlayer1.setText("Компьютер 1:");
            fieldPlayer1.setText("");
            fieldPlayer1.setEnabled(false);
            labelPlayer2.setText("Компьютер 2:");
            fieldPlayer2.setText("");
            fieldPlayer2.setEnabled(false);
            buttonGenerateValue1.setVisible(true);
            buttonGenerateValue2.setVisible(true);
        }
    }

    public class ButtonCheckWinnerActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String player1 = fieldPlayer1.getText().toLowerCase();
            String player2 = fieldPlayer2.getText().toLowerCase();
            String result = "";
            RockPaperScissors objRockPaperScissors = new RockPaperScissors(player1, player2);
            if (gameMode == 1) {
                ArrayList<String> arrayOfErrors = new ArrayList<String>();
                arrayOfErrors = objRockPaperScissors.checkPlayersValues(player1, player2);
                if (arrayOfErrors.size() == 0) {
                    int winner = objRockPaperScissors.checkWinner();
                    switch (winner) {
                        case 0:
                            result = "Ничья";
                            break;
                        case 1:
                            result = "Победил игрок 1";
                            break;
                        case 2:
                            result = "Победил игрок 2";
                            break;
                        default:
                            result = "Ошибка в процессе игры";
                    }
                } else {
                    result += "<html>"; // Чтобы вывести сообщение в две строки
                    for (int i = 0; i < arrayOfErrors.size(); i++) {
                        result += arrayOfErrors.get(i) + "<br>";
                    }
                    result += "</html>";
                }
            } else if (gameMode == 2) {
                ArrayList<String> arrayOfErrors = new ArrayList<String>();
                arrayOfErrors = objRockPaperScissors.checkPlayersValues(player1);
                if (arrayOfErrors.size() == 0) {
                    int winner = objRockPaperScissors.checkWinner();
                    switch (winner) {
                        case 0:
                            result = "Ничья";
                            break;
                        case 1:
                            result = "Победил игрок";
                            break;
                        case 2:
                            result = "Победил компьютер";
                            break;
                        default:
                            result = "Ошибка в процессе игры";
                    }
                } else {
                    result += "<html>"; // Чтобы вывести сообщение в две строки
                    for (int i = 0; i < arrayOfErrors.size(); i++) {
                        result += arrayOfErrors.get(i) + "<br>";
                    }
                    result += "</html>";
                }

            } else { // gameMode == 3
                int winner = objRockPaperScissors.checkWinner();
                switch (winner) {
                    case 0:
                        result = "Ничья";
                        break;
                    case 1:
                        result = "Победил компьютер 1";
                        break;
                    case 2:
                        result = "Победил компьютер 2";
                        break;
                    default:
                        result = "Ошибка в процессе игры";
                }
            }
            labelWinner.setText(result);
        }
    }
    public class buttonGenerateValue1ActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            fieldPlayer1.setText(RockPaperScissors.generateValue());
        }
    }
    public class buttonGenerateValue2ActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            fieldPlayer2.setText(RockPaperScissors.generateValue());
        }
    }
}
