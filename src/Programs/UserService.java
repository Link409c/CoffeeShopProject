package Programs;

import Interfaces.UserRepository;
/**
 * A class used to issue requests to a database handling users of a POS System.
 */
public class UserService implements UserRepository {

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

}
