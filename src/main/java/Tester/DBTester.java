package Tester;

import Programs.HibernateService;
import Programs.UserService;
import Structures.User;

public class DBTester {
    public static void main(String[] args){
        UserService userService = new UserService(HibernateService.getSessionFactory().getCurrentSession());
        User user = new User(1, "user", "password", "Demo",
                "abc@123.com", "8561234567");
        System.out.print(userService.addEntity(user));
    }
}
