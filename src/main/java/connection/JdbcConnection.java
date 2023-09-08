package connection;

import model.User;
import repository.UserRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    public static void main(String[] args) throws SQLException {


        UserRepository usee =new UserRepository();
        User user = new User (null,"samyar","147865","2023-02-04");
        User user1 = new User (null,"Hosein","167865","2020-02-04");

        usee.save(user);
        usee.save(user1);
        usee.Update(user1);
        // usee.Delete(user1);

        User user3=usee.loadAll();
        System.out.println(user3);



        }

    }
