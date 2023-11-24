import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player();
    }

    @Test
    public void testSetBalance() {
        player.setBalance(100);
        assertEquals(100, player.getBalance());
    }

    @Test
    public void testCancelBooking() {
        player.Bookedslots.add(new ArrayList<>());
        player.Bookedslots.get(0).add("PlaygroundName");
        player.CancelBooking("PlaygroundName", "10:00");
        assertEquals(0, player.Bookedslots.size());
    }

    @Test
    public void testBookingSlots() {
        player.bookingSlots("10:00", "PlaygroundName");
        assertEquals("10:00", player.Bookedslots.get(0).get(1));
        assertEquals("PlaygroundName", player.Bookedslots.get(0).get(2));
    }

    @Test
    public void testCreateTeam() {
        Player teammate = new Player();
        player.createTeam(teammate);
        assertTrue(player.team.contains(teammate));
    }

    @Test
    public void testEditPlayerInfo() {
        // Set up the input stream for the test
        InputStream in = new ByteArrayInputStream("1\nNewFirstName\n".getBytes());
        System.setIn(in);

        player.editPlayerinfo();

        assertEquals("NewFirstName", player.getFName());
    }

    // Add more test methods for other functions in Player class

}
