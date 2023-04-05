import java.util.Scanner;

/* Задачи со звездочкой:
        1) Реализовать консольную игру "Камень, ножницы бумага" в версии человек против человека
        2) Реализовать консольную игру "Камень, ножницы бумага" в версии человек против компьютера
        3) Реализовать консольную игру "Камень, ножницы бумага" в версии компьютер против компьютера
        4) Сделать возможность выбора между режимами игры */
public class RockPaperScissors {
    static Scanner sc = new Scanner(System.in);

    public static void startGame() throws InterruptedException {
        int gameMode;
        System.out.println("Приветствуем Вас в игре 'Камень-Ножницы-Бумага'");
        System.out.println("Выберите режим:\n" +
                "1 - человек против человека\n" +
                "2 - человек против компьютера\n" +
                "3 - компьютер против компьютера\n" +
                "4 - выйти из игры");
        gameMode = sc.nextInt();
        //gameMode = changeMod();
        while (true) {
            switch (gameMode) {
                case 1:
                    manAgainstMan();
                    gameMode = changeMod(gameMode);
                    break;
                case 2:
                    manAgainstComp();
                    gameMode = changeMod(gameMode);
                    break;
                case 3:
                    CompAgainstComp();
                    gameMode = changeMod(gameMode);
                    break;
                case 4:
                    System.out.println("До свидания!");
                    return;
            }
        }

    }

    public static int changeMod(int gameMod) {
        System.out.println("Хотите продолжить игру в этом же режиме?\n 1 - да\n 2 - нет");
        int answer = sc.nextInt();
        if (answer == 2) {
            System.out.println("Выберите режим:\n" +
                    "1 - человек против человека\n" +
                    "2 - человек против компьютера\n" +
                    "3 - компьютер против компьютера\n" +
                    "4 - выйти из игры");
            gameMod = sc.nextInt();
        }
        return gameMod;
    }

    static public String enterValue() {
        while (true) {
            String value = sc.next().toLowerCase();
            if (value.equals("камень") || value.equals("ножницы") || value.equals("бумага")) {
                return value;
            } else {
                System.out.println("Введите значение заново (Камень, Ножницы или Бумага)");
            }
        }
    }
    public static void manAgainstMan() {
        System.out.println("Учавствуют два игрока. Каждый игрок должен выбрать 'камень', 'ножницы' или 'бумага'.");
        System.out.print("Игрок 1: ");
        String player1 = enterValue();//sc.next();
        System.out.print("Игрок 2: ");
        String player2 = enterValue();//sc.next();
        int winner = checkWinners(player1, player2);
        if (winner == 0) {
            System.out.println("Ничья");
        } else {
            System.out.println("Выиграл игрок " + winner);
        }

    }

    public static void manAgainstComp() {
        System.out.println("Учавствуют один игрок и компьютер. Выберите 'камень', 'ножницы' или 'бумага'.");
        System.out.print("Игрок: ");
        String player1 = enterValue();//sc.next();
        String player2 = getValue();
        System.out.println("Компьютер: " + player2);
        int winner = checkWinners(player1, player2);
        switch (winner) {
            case 0:
                System.out.println("Ничья");
                break;
            case 1:
                System.out.println("Выиграл игрок");
                break;
            case 2:
                System.out.println("Выиграл компьютер");
                break;
        }
    }

    public static void CompAgainstComp() throws InterruptedException {
        System.out.println("В игре учавствует только компьютер. Автоматически будут выбраны значения 'камень', 'ножницы' или 'бумага'.");
        Thread.sleep(2000);
        String player1 = getValue();
        System.out.println("Компьютер 1: " + player1);
        Thread.sleep(2000);
        String player2 = getValue();
        System.out.println("Компьютер 2: " + player2);
        Thread.sleep(2000);
        int winner = checkWinners(player1, player2);
        switch (winner) {
            case 0:
                System.out.println("Ничья");
                break;
            case 1:
                System.out.println("Выиграл компьютер 1");
                break;
            case 2:
                System.out.println("Выиграл компьютер 2");
                break;
        }
        Thread.sleep(2000);
    }

    public static String getValue() {
        String setOfValues[] = new String[] {"камень", "ножницы", "бумага"};
        return setOfValues[(int) (Math.random() * 3)];
    }
    public static int checkWinners(String value1, String value2) {
        int result = 0;
        if (value1.equals("камень")) {
            if (value2.equals("камень")) {
                result = 0;
            }
            if (value2.equals("ножницы")) {
                result = 1;
            }
            if (value2.equals("бумага")) {
                result = 2;
            }
        }
        if (value1.equals("ножницы")) {
            if (value2.equals("камень")) {
                result = 2;
            }
            if (value2.equals("ножницы")) {
                result = 0;
            }
            if (value2.equals("бумага")) {
                result = 1;
            }
        }
        if (value1.equals("бумага")) {
            if (value2.equals("камень")) {
                result = 1;
            }
            if (value2.equals("ножницы")) {
                result = 2;
            }
            if (value2.equals("бумага")) {
                result = 0;
            }
        } //*/
        // почему-то без общего return в конце выдавал ошибку. Изначально хотела сделать return
        // без объявления переменной result. Это из-за того, что return находился в условии, и не обязательно
        // могло быть выполнено?
        return result;
    }
}
