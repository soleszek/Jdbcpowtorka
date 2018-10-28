package main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Main {
    static Connection connection = JdbcUtils.getInstance().getConnection();
    public static void main(String[] args) throws SQLException {
        insertRun(1l, "Bieg po złote runo", "Malawa", new java.util.Date(), new java.util.Date(), 100);
    }

    private static void insertRun(Long id, String name, String place, java.util.Date startDate, java.util.Date startTime, int membersLimit) throws SQLException {
        PreparedStatement statement = connection
                .prepareStatement("insert into runs(id, name, place, start_date, start_time, members_limit) values (?, ?, ?, ?, ?, ?)");

        statement.setLong(1, id);
        statement.setString(2, name);
        statement.setString(3, place);

        java.sql.Date sqlStartDate = new Date(startDate.getTime());
        java.sql.Date sqlStartTime = new Date(startTime.getTime());

        statement.setDate(4, sqlStartDate);
        statement.setDate(5, sqlStartTime);
        statement.setInt(6, membersLimit);

        statement.executeUpdate();
    }
}
