package Programs;

import Interfaces.UserRepository;
import Structures.DatabaseEntity;
import Structures.User;
import org.hibernate.Session;

import java.util.List;

/**
 * Data Access Object (DAO) used to issue requests to a database handling users of a POS System.
 */
public class UserService extends EntityService implements UserRepository {
    /**
     * Additionally hashes sensitive user information before adding the entity to the database.
     * @param aUser the user to add
     * @return true if the entity was added, false if connection fails.
     */
    public boolean addEntity(User aUser) {
        HashGenerator userPassHash = new HashGenerator();
        //hash user password before committing new entity to table
        userPassHash.generateHash(aUser);
        aUser.setPassword(userPassHash.getHashedPass());
        return super.addEntity(aUser);
    }

    /**
     * get the non-secure info for a user entity from the database.
     * @param aUser the user to search for.
     * @return the information if the entity exists.
     */
    public String getDetails(User aUser){
        List<DatabaseEntity> users = super.getDetails(aUser);
        if(users == null){
            return "Database error.";
        }
        else {
            StringBuilder str = new StringBuilder();
            for (DatabaseEntity d : users) {
                if (d.equals(aUser)) {
                    User u = (User) d;
                    str.append(u.getCustomerName()).append(", ").append(u.getEmail())
                            .append(", ").append(u.getPhoneNumber());
                }
            }
            if (str.isEmpty()) {
                str.append("User not found.");
            }
            return str.toString();
        }
    }

    /**
     * log in to the web app using the provided credentials. password is authenticated using
     * the stored hash.
     * @param aUserName the username
     * @param aPassword the password
     * @return true if the login is successful.
     */
    @Override
    public boolean login(String aUserName, String aPassword) {
        return false;
    }

    /**
     * end the current session of the web app.
     * @return true if logout is successful.
     */
    @Override
    public boolean logout() {
        return false;
    }

    /**
     * invoke the hashing algorithm method(s) in use to check a submitted credential against the stored hash.
     * @param credential the credential to check.
     * @return true if the hashes match.
     */
    @Override
    public boolean authenticate(String credential) {
        return false;
    }

    /**
     * allow an operation to continue if authentication was successful.
     * @return true if the associated authentication passes.
     */
    @Override
    public boolean authorize() {
        return false;
    }

    public UserService(Session theSession){
        super(theSession);
    }

}
