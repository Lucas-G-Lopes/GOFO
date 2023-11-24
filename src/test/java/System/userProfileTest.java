package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class userProfileTest {
    private userProfile userProfile;

    @BeforeEach
    void setUp() {
        userProfile = new userProfile();
    }

    @Test
    void setFName() {
        String fName = "Lucas";
        userProfile.setFName(fName);
        String FullName = userProfile.getFullName();
        assertEquals(FullName.substring(0,5),fName);

    }

    @Test
    void setLName() {
        String fName = "Lucas";
        String lName = "Medeiros";
        userProfile.setFName(fName);
        userProfile.setLName(lName);
        String FullName = userProfile.getFullName();
        assertEquals(lName,FullName.substring(6));
    }

    @Test
    void setID() {
        int ID = 99;
        userProfile.setID(ID);
        assertEquals(ID,userProfile.getID());
    }

    @Test
    void setEmail() {
        String email = "lucasmedeiros@.com";
        userProfile.setEmail(email);
        assertEquals(email,userProfile.getEmail());
    }

    @Test
    void setPassword() {
        String  pass = "1245";
        userProfile.setPassword(pass);
        assertEquals(pass,userProfile.getPassword());

    }

    @Test
    void setPhone() {
        int phone = 1249081;
        userProfile.setPhone(phone);
        assertEquals(phone,userProfile.getPhone());
    }

    @Test
    void setRule() {
        String rul = "xamuscas";
        userProfile.setRule(rul);
        assertEquals(rul,userProfile.getRule());
    }
}