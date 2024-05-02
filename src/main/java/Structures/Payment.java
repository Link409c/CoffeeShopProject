package Structures;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

/**
 * Represents a saved payment option. Has foreign key referencing the User Primary Key.
 */
@Table(name = "payment")
public class Payment extends DatabaseEntity{
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "custID", nullable = false)
    private int custID;
    @Column(name = "card holder", nullable = false)
    private String holderName;
    @Column(name = "number", nullable = false)
    private String cardNum;
    @Column(name = "expiration", nullable = false)
    private String expDate;
    @Column(name = "security code", nullable = false)
    private String securityCode;
}
