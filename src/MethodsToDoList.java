import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MethodsToDoList {
    Scanner scanner;

    public MethodsToDoList() {
        this.scanner = new Scanner(System.in);
    }

    public void add(List<Case> list) {
        Case userCase = new Case();
        System.out.println("Добавьте название задачи");
        userCase.setTitle(this.scanner.nextLine().toLowerCase());
        System.out.println("Добавьте описание задачи");
        userCase.setDescription(this.scanner.nextLine().toLowerCase());
        System.out.println("Выберите приоритет задачи: критично , средне , неважно");
        userCase.setImportance(Importance.getByName(this.scanner.nextLine()));
        list.add(userCase);
    }

    public void toPrint(List<Case> list) {
        int num = 1;

        for(Iterator var3 = list.iterator(); var3.hasNext(); ++num) {
            Case userCase = (Case)var3.next();
            System.out.println(num + " " + userCase.toString());
        }

    }

    public void delete(List<Case> list) {
        this.toPrint(list);
        list.remove(new Case(this.scannerToDelete()));
    }

    public void toComplete(List<Case> list) {
        this.toPrint(list);
        int userValue = this.scannerToComplete();
        ((Case)list.get(userValue)).setStatus(true);
    }

    public void toPrintComplete(List<Case> list) {
        Iterator var2 = list.iterator();

        while(var2.hasNext()) {
            Case userCase = (Case)var2.next();
            if (userCase.getStatus()) {
                System.out.println(userCase);
            }
        }

    }

    public int scannerToComplete() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите номер дела");
        int value = scanner1.nextInt() - 1;
        return value;
    }

    public String scannerToDelete() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите название дела");
        String value = scanner2.nextLine().toLowerCase(Locale.ROOT);
        return value;
    }
}