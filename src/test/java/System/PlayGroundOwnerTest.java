package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class PlaygroundOwnerTest {

    private PlaygroundOwner playgroundOwner;

    @BeforeEach
    public void setUp() {
        playgroundOwner = new PlaygroundOwner();
    }

    @Test
    public void testAddPlayground() {
        Playground playground = new Playground();
        playgroundOwner.addPlayground(playground);
        assertTrue(playgroundOwner.listOfPlayground.contains(playground));
    }

    @Test
    public void testExistPlayground() {
        Playground playground = new Playground();
        playground.setName("TestPlayground");
        playgroundOwner.addPlayground(playground);
        assertTrue(playgroundOwner.existPlayground("TestPlayground"));
        assertFalse(playgroundOwner.existPlayground("NonexistentPlayground"));
    }

    @Test
    public void testUpdatePlaygroundName() {
        Playground playground = new Playground();
        playground.setName("OldName");
        playgroundOwner.addPlayground(playground);

        // Set up the input stream for the test
        InputStream in = new ByteArrayInputStream("1\nNewName\n".getBytes());
        System.setIn(in);

        playgroundOwner.updatePlaygroundName("OldName");

        assertEquals("NewName", playgroundOwner.listOfPlayground.get(0).getName());
    }

}
