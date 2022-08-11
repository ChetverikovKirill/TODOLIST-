import java.util.List;
import java.util.Scanner;

public class Menu {
    MethodsToDoList methodsToDoList = new MethodsToDoList();
    Scanner scanner;
    private int userValue;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public int mainStr() {
        System.out.println("ToDo List");
        System.out.println("1.Добавить дело");
        System.out.println("2.Удалить дело");
        System.out.println("3.Пометить как выполненное");
        System.out.println("4.Показать список всех дел");
        System.out.println("5.Показать список всех выполненных дел");
        System.out.println("6.Выйти");
        System.out.println();
        System.out.print("Выберите действие: ");
        int userValue = this.scanner.nextInt();
        return userValue;
    }

    public void toStartMenu(List<Case> userList) {
        while(this.userValue != 6) {
            this.userValue = this.mainStr();
            switch (this.userValue) {
                case 1:
                    this.methodsToDoList.add(userList);
                    break;
                case 2:
                    this.methodsToDoList.delete(userList);
                    break;
                case 3:
                    this.methodsToDoList.toComplete(userList);
                    break;
                case 4:
                    this.methodsToDoList.toPrint(userList);
                    break;
                case 5:
                    this.methodsToDoList.toPrintComplete(userList);
                case 6:
                    break;
                default:
                    System.out.println("Нету такого пункта");
            }
        }

    }
}
