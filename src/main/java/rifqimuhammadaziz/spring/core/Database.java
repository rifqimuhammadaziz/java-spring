package rifqimuhammadaziz.spring.core;

public class Database {

    private static Database database;

    // singleton
    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    private Database() {

    }
}
