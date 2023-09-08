package repository;

import model.User;

import java.sql.*;

public class UserRepository {
    private Connection connection;


    public UserRepository() {
        try {
            this.connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "173725Hrm");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public int save(User user) throws SQLException {
        String add = "INSERT INTO users( username, password, signup_date) values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(add);
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getPassword());
        statement.setString(3, user.getSignup_date());
        int result = statement.executeUpdate();

        return result;

    }

    public int Update(User user) throws SQLException {
        String add = "UPDATE users set username='shayan' where username ='Hosein'";
        PreparedStatement statement = connection.prepareStatement(add);
        int result = statement.executeUpdate();
        return result;
    }

    public int Delete(User user) throws SQLException {
        String add = " DELETE FROM users WHERE username='samyar'";
        PreparedStatement statement = connection.prepareStatement(add);
        int result = statement.executeUpdate();
        return result;
    }

    public User[] loadAll() throws SQLException {
        String add = "SELECT * FROM users";
        PreparedStatement statement = connection.prepareStatement(add);
        ResultSet result = statement.executeQuery();
        User[] u = new User[7];
        User user = new User();
        int i = 0;

        while (result.next()) {
            u[i] = new User(result.getInt(1),
                    result.getString(2),
                    result.getString(3),
                    result.getString(4));
            i++;
        }
        return u;
    }
    public User[] saveAll(User[] user) throws SQLException{
        String add="INSERT INTO users(username, password, signup_date) values (?,?,?)";
        PreparedStatement statement=connection.prepareStatement(add);

        for (User users : user) {

            statement.setString(1, users.getUsername());
            statement.setString(2, users.getPassword());
            statement.setString(3, users.getSignup_date());
            statement.addBatch();


        }
        statement.executeBatch();

        return user;
    }


}
