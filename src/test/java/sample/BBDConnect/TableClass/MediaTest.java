package sample.BBDConnect.TableClass;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {
    @Test
    public void testGetType() throws Exception {
        Media media = new Media("0111","le ptit prince", "conte");

        Assert.assertEquals(media.getType(),"0111");
    }

    @Test
    public void testGetTitre() throws Exception {
        Media media = new Media("0111","le ptit prince", "conte");
        Assert.assertEquals(media.getTitre(), "le ptit prince");
    }

    @Test
    public void testGetGenre() throws Exception {
        Media media = new Media("0111","le ptit prince", "conte");
        Assert.assertEquals(media.getGenre(), "conte");
    }

    @Test
    public void setIdMedia() throws Exception {
        Media mediaSet = new Media("titre",0);
        mediaSet.setIdMedia(123);
        Assert.assertEquals(mediaSet.getIdMedia(),123);
    }

    @Test
    public void setType() throws Exception {
        Media mediaSet = new Media("titre",0);
        mediaSet.setType("conte");
        Assert.assertEquals(mediaSet.getType(), "conte");
    }

    @Test
    public void testAllGetters() throws Exception {
        Media mediaAll = new Media("type", "titre", "genre", 12, 504, 1, 0001);
        Assert.assertEquals(mediaAll.getType(), "type");
        Assert.assertEquals(mediaAll.getTitre(), "titre");
        Assert.assertEquals(mediaAll.getGenre(), "genre");
        Assert.assertEquals(mediaAll.getNbExemplaires(), 12);
        Assert.assertEquals(mediaAll.getEmplacement(), 504);
        Assert.assertEquals(mediaAll.getDisponible(), 1);
        Assert.assertEquals(mediaAll.getIdMedia(), 0001);
    }

    @Test
    public void testAllSetters() throws Exception {
        Media mediaAll = new Media("type", "titre", "genre", 12, 504, 1, 0001);
        mediaAll.setType("test");
        mediaAll.setTitre("test");
        mediaAll.setGenre("test");
        mediaAll.setNbExemplaires(1);
        mediaAll.setEmplacement(1);
        mediaAll.setIdMedia(0001);
        Assert.assertEquals(mediaAll.getType(), "test");
        Assert.assertEquals(mediaAll.getTitre(), "test");
        Assert.assertEquals(mediaAll.getGenre(), "test");
        Assert.assertEquals(mediaAll.getNbExemplaires(), 1);
        Assert.assertEquals(mediaAll.getEmplacement(), 1);
        Assert.assertEquals(mediaAll.getIdMedia(), 0001);

    }
}