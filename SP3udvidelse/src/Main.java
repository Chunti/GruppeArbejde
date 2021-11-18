public class Main {

    public static void main(String[] args) {
        DBConnector connector = new DBConnector();

        String[] data = connector.readFieldData();

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        UI ui = new UI();
        ui.mainMenu();
    }
}
