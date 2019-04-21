public class Main {
    public static void main(String[] args) {
        System.out.println(1);
        Database database = Database.getDatabase();
        Database database1 = Database.getDatabase();
        System.out.println(database == database1);
    }
}
