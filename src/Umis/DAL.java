package Umis;

import java.sql.*;
import javax.swing.JOptionPane;

public class DAL {

    public Connection con;
    public Statement st;
    public ResultSet rs;

    private final String connect = "jdbc:mysql://localhost/umis";
    private final String username = "root";
    private final String password = null;

    public void showMsg(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void connect() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connect, username, password);
            st = con.createStatement();

        } catch (Exception e) {
            showMsg("No connection to database, try again!");
        }
    }

    public boolean login(String username, String password) {

        try {

            rs = st.executeQuery("SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "' ");
            rs.last();
            if (rs.getRow() > 0) {
                return true;
            } else {
                showMsg("Incorrect Username or Password!");
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

    public void insert(String query) {

        try {

            st.execute(query);

        } catch (Exception e) {

        }
    }

    public void delete(String query) {

        try {

            st.execute(query);

        } catch (Exception e) {

        }
    }

    public void update(String query) {

        try {

            st.execute(query);

        } catch (Exception e) {

        }
    }

    public String[][] select(String query) {

        try {

            rs = st.executeQuery(query);
            rs.last();

            int row = rs.getRow();
            rs.beforeFirst();
            int col = rs.getMetaData().getColumnCount();

            String[][] data = new String[row][col];

            int r = 0;
            while (rs.next()) {
                for (int c = 0; c < col; c++) {
                    data[r][c] = rs.getString(c + 1);
                }
                r++;
            }
            return data;

        } catch (Exception e) {
            return null;
        }
    }

}
