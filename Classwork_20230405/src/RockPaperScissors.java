import java.util.ArrayList;

/*
 можно ли прям в конструкторе вызвать метод проверки победителя. Или лучше вызывать его из объекта?
*/
public class RockPaperScissors {
    private String player1;
    private String player2;
    private int winner;

    public static String generateValue() {
        String setOfValues[] = new String[] {"камень", "ножницы", "бумага"};
        return setOfValues[(int) (Math.random() * 3)];
    }

    public RockPaperScissors(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    public int checkWinner() {
        winner = -1;
        if (player1.equals("камень")) {
            if (player2.equals("камень")) {
                winner = 0;
            }
            if (player2.equals("ножницы")) {
                winner = 1;
            }
            if (player2.equals("бумага")) {
                winner = 2;
            }
        }
        if (player1.equals("ножницы")) {
            if (player2.equals("камень")) {
                winner = 2;
            }
            if (player2.equals("ножницы")) {
                winner = 0;
            }
            if (player2.equals("бумага")) {
                winner = 1;
            }
        }
        if (player1.equals("бумага")) {
            if (player2.equals("камень")) {
                winner = 1;
            }
            if (player2.equals("ножницы")) {
                winner = 2;
            }
            if (player2.equals("бумага")) {
                winner = 0;
            }
        } //*/
        // почему-то без общего return в конце выдавал ошибку. Изначально хотела сделать return
        // без объявления переменной result. Это из-за того, что return находился в условии, и не обязательно
        // могло быть выполнено?
        return winner;
    }
    private boolean checkValue(String value) {
        return (value.equals("камень") || value.equals("ножницы") || value.equals("бумага"));
    }
    public ArrayList<String> checkPlayersValues(String player1, String player2) {
        ArrayList<String> arrayOfErrors = new ArrayList<String>();
        if (!checkValue(player1)) {
            arrayOfErrors.add("Игрок 1 ввел неверное значение.");
        }
        if (!checkValue(player2)) {
            arrayOfErrors.add("Игрок 2 ввел неверное значение.");
        }
        return arrayOfErrors;
    }
    public ArrayList<String> checkPlayersValues(String player1) {
        ArrayList<String> arrayOfErrors = new ArrayList<String>();
        if (!checkValue(player1)) {
            arrayOfErrors.add("Игрок ввел неверное значение.");
        }
        return arrayOfErrors;
    }

}
