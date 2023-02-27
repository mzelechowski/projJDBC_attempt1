import java.util.Scanner;

public class MenuProvider {

    public void start() {
        Scanner in = new Scanner(System.in);
        int m=100;
        while(m!=0){
            headerPrinter();
            try {
                m = Integer.parseInt(in.nextLine());
                menuExecutor(m);
            } catch (NumberFormatException e) {
                System.out.println("Podaj wybor w postaci liczby całkowietej.");
                m=100;
            }
        }
    }

    public void  menuExecutor(int m){
        switch (m){
            case 1:
                System.out.println("Wyswietlam wszystkie rekordy bazy danych");
                QueryExecutor.printQuerySeleet("SELECT * FROM users;");
                break;
            case 2:
                System.out.println("Dodaje nowy rekord w postaic zapytania SQL");
                QueryExecutor.enterNewRecord();
                break;
            case 3:
                System.out.println("Usuwam rekord poprzez ID");
                QueryExecutor.dropRecord();
                break;
            case 0:
                System.out.println("Wybrales 0 - konczę program Milego dnia. Bye");
                break;

            default:
                System.out.printf("Nie ma takiej opcji. Podaj jeszcze raz co chesz zrobic: ");
                break;
        }
    }


    public void headerPrinter(){
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *                 MENU                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Wyswietl cala baze EMPLOYEE");
        System.out.println("     2. Dodaj rekord");
        System.out.println("     3. Usun rekord");
        System.out.println("     0. Zakoncz program");

        System.out.printf("     Dokonaj wyboru Neo: " );
    }
}
