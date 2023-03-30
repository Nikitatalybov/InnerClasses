package bank;


import client.Client;

import java.util.Scanner;

import static client.Client.cardBalance;

public class ATM implements ATMFunction {


    Scanner scanner = new Scanner(System.in);

    Bank bank = new Bank();

    Client client = new Client();


    private void workATM() {
        System.out.println("Выберите действие" + "\n" + "посмотреть баланс - 1" + "\n"
                + "снять наличные - 2 " + "\n" + "пополнить баланс - 3" +
                "\n" + "выйти - 4");

        String inputAct = scanner.nextLine();

        if (inputAct.equals("1")) {
            checkBalance();
        }
        if (inputAct.equals("2")) {
            cashWithdrawal();
        }
        if (inputAct.equals("3")) {
            refilling();
        }
    }

    @Override
    public void checkBalance() {

        System.out.println("Ваш баланс - " + cardBalance);
    }

    @Override
    public void refilling() {
        System.out.println("Введите сумму пополнения");

        double addMoney = scanner.nextDouble();
        double balancePlus = addMoney + bank.cardBalance;

        System.out.println("Ваш баланс пополнен на - " + addMoney + " и составляет - " + bank.cardBalance);
        workATM();


    }

    @Override
    public void cashWithdrawal() {
        System.out.println("Введите сумму для снятия");
        double outMoney = scanner.nextDouble();

        double balanceMinus = bank.cardBalance - outMoney;

        System.out.println("Вы сняли - " + outMoney + " ваш баланс составляет - " + balanceMinus);
        workATM();

    }

    public class DataClient {
        public void enterCard() {

            System.out.println("Введите пин-код");

            String inputCode = scanner.nextLine();

            for (int x = 0; x < client.code.length; x++) {


                if (inputCode.equals(client.code[x])) {
                    workATM();
                    break;
                }
            }
            System.out.println("Пинк-код неверен");
        }

        public void output() {
            bank.checkAvailableClient();
            enterCard();
            workATM();

        }


    }
}
