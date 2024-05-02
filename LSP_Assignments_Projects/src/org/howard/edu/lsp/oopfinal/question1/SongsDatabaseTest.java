package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @Before
    public void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
        db.addSong("Rap", "Gin and Juice");
    }

    @Test
    public void testAddSong() {
        db.addSong("Pop", "Blinding Lights");
        assertTrue(db.getSongs("Pop").contains("Blinding Lights"));
    }

    @Test
    public void testGetGenreOfSong() {
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Nonexistent Song"));
    }

    @Test
    public void testGetSongs() {
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"));
        assertTrue(rapSongs.contains("Gin and Juice"));
        assertEquals(2, rapSongs.size());
    }
}
