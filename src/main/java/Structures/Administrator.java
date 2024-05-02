package Structures;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "admin")
public class Administrator extends User{
    public Administrator(int userID, String userName, String password, String name, String email, String phone) {
        super(userID, userName, password, name, email, phone);
    }
}
