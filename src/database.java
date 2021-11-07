import java.sql.*;

public class database {
    private String databaseURL;
    private Connection connection;

    database() throws SQLException {
        databaseURL = "jdbc:ucanaccess://db.mdb";
        Connection connection = DriverManager.getConnection(databaseURL);
    }
    public ResultSet getTable(String tableName) throws java.sql.SQLException{
        String sql  = "SELECT * FROM ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(0, tableName);
        return preparedStatement.executeQuery(sql);
    }
}
