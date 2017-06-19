package ru.zvezdov.ocprof.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Dmitry Zvezdov
 *         07.06.17.
 */
public class TestDao {

    private static final String SELECT_ALL_SQL = "SELECT * FROM myTable;";
    private static final Logger logger = Logger.getLogger(TestDao.class.getName());

    public List<String> selectAll() throws SQLException {
        List<String> result = new ArrayList<>();
        Connection connection = JdbcUtils.getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SELECT_ALL_SQL);
            while (resultSet.next()) {
                result.add(resultSet.getString(1));
            }
            connection.commit();
            return result;
        } catch (SQLException e) {
            logger.log(Level.INFO, "Exception while executing method selectAll()");
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    logger.log(Level.INFO, "Exception while rollback", ex);
                }
            }
            logger.log(Level.INFO, "Error during execution: ", e);
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return result;
    }

    public void insertString(String str) {
        Connection connection = JdbcUtils.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            connection.setAutoCommit(false);
            statement = connection.prepareStatement("", Statement.RETURN_GENERATED_KEYS);
            statement.executeBatch();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                int newId = rs.getInt(1);
            }
        } catch (SQLException e) {
            logger.log(Level.INFO, "", e);
        }

    }
}
