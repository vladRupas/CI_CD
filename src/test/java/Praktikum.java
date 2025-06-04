public class Praktikum {

    public static void main(String[] args) {

        String testName = "Тимоти Шаламе";
        Account account = new Account(testName);

        if (account.checkNameToEmboss()) {
            System.out.println("Имя и фамилия подходят для печати на карте.");
        } else {
            System.out.println("Имя и фамилия не подходят для печати на карте.");
        }
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }

}