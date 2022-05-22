package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();

        userDao.saveUser("Ivan", "Ivanov", (byte) 20);
        System.out.println("User с именем Ivan Ivanov добавлен в базу данных");
        userDao.saveUser("Vladimir", "Andreev", (byte) 25);
        System.out.println("User с именем Vladimir Andreev добавлен в базу данных");
        userDao.saveUser("Maxim", "Popov", (byte) 31);
        System.out.println("User с именем Maxim Popov добавлен в базу данных");
        userDao.saveUser("Elena", "Novikova", (byte) 38);
        System.out.println("User с именем Elena Novikova добавлен в базу данных");

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}