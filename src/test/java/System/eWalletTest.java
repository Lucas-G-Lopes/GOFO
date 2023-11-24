package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class eWalletTest {
    private eWallet eWallet;

    @BeforeEach
    void setUp() {
        eWallet = new eWallet();
    }

    @Test
    void setBalance() {
        eWallet.setBalance(900);
        assertEquals(1000,eWallet.getBalance());
    }

    @Test
    void deposit() {
        eWallet.setBalance(1000);
        eWallet.deposit(500);
        assertEquals(1500,eWallet.getBalance());
    }

    @Test
    void withdraw() {
        eWallet.setBalance(1000);
        eWallet.withdraw(500);
        assertEquals(500,eWallet.getBalance());
    }

    @Test
    void getBalance() {
        eWallet.setBalance(1000);
        assertEquals(1000,eWallet.getBalance());
    }
}