package ru.zvezdov.ocprof.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Dmitry on 26.06.2017.
 */
public class H2 {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        // add application code here
        conn.close();
    }
}
