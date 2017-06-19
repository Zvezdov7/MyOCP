package ru.zvezdov.ocprof.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Dmitry Zvezdov
 *         07.06.17.
 */
public class JdbcUtils {
    private static final Logger logger = Logger.getLogger(JdbcUtils.class.getName());
    private static final String JDBC_URL = "";
    private static final String USER = "";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        logger.log(Level.INFO, "Calling getConnection method for jdbc url: " + JDBC_URL);
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        } catch (SQLException e) {
            logger.log(Level.INFO, "Exception: ", e);
        }
        return connection;
    }
}
