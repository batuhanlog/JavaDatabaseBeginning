import java.sql.*;
public class DBConnect {
    public static final String DB_URL = "jdbc:mysql://localhost/employees";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            st = conn.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM employee");
            while (resultSet.next()) {
                System.out.println("🪪ID : " + resultSet.getInt("employee_id"));
                System.out.println("Adı : " + resultSet.getString("employees_name"));
                System.out.println("Pozisyonu : " + resultSet.getString("employees_position"));
                System.out.println("💸Maaşı : " + resultSet.getInt("employees_salary"));
                System.out.println("🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

}