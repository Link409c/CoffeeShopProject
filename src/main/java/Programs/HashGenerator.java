package Programs;

import Structures.User;
import com.password4j.Hash;
import com.password4j.Password;

/**
 * Object implementing password4j for User Credential protection.
 */
public class HashGenerator {

    public void generateHash(User aUser){
        //get password plaintext
        String plaintext = aUser.getPassword();
        //make a new Hash object and generate the hash
        Hash theHash = Password.hash(plaintext)
                .addPepper("secret-ingredient")
                .addRandomSalt(64)
                .withScrypt();
        //set the global variable
        this.hashedPass = theHash.getResult();
    }

    public HashGenerator(){
        this.hashedPass = "Nice Try.";
    }

    public String getHashedPass() {
        return hashedPass;
    }

    private String hashedPass;
}
