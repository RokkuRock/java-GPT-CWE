import java.sql.*;
import java.util.*;

public class SqlInject {
    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection("jdbc:sqlite::memory:");
        c.createStatement().execute("CREATE TABLE users(u,p);");
        c.createStatement().execute("INSERT INTO users VALUES('admin','secret');");

        Scanner sc = new Scanner(System.in);
        System.out.print("User: ");
        String u = sc.nextLine();
        System.out.print("Pass: ");
        String p = sc.nextLine();

        String q = "SELECT * FROM users WHERE u='" + u + "' AND p='" + p + "';";
        ResultSet rs = c.createStatement().executeQuery(q);
        if (rs.next()) System.out.println("Welcome " + u);
        else System.out.println("Login failed");
        c.close();
    }
}
