import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Database {
    private String databaseURL;
    private Connection connection;

    Database() throws SQLException {
        databaseURL = "jdbc:ucanaccess://db.mdb";
        connection = DriverManager.getConnection(databaseURL);
    }
    public ResultSet getTable(String tableName) throws java.sql.SQLException{
        String sql  = "SELECT * FROM ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(0, tableName);
        return preparedStatement.executeQuery(sql);
    }
    public ResultSet getData(String tableName, String condition) throws java.sql.SQLException{
        String sql = "SELECT * FROM " + tableName + " " +  condition;
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

    public Boolean verifyuser(String username, char[] password) throws java.sql.SQLException{
        String sql = "SELECT * FROM user WHERE Username=? AND Password=?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, String.valueOf(password));
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }
}
