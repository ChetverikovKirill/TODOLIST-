public class App {

    public static void main(String[] args) {
        Menu menu = new Menu();

        WriteToFile write = new WriteToFile();

        ReadsFromFile readsFromFile = new ReadsFromFile();
        readsFromFile.readFromFile("C:\\Users\\Кирилл\\IdeaProjects\\TODO\\Save2.txt");

        menu.toStartMenu(readsFromFile.getCaseList());

        write.writesToFile(readsFromFile.getCaseList(), "Save2.txt");
    }
}
