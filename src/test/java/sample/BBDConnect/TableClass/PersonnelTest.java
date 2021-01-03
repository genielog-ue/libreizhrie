package sample.BBDConnect.TableClass;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonnelTest {

    @Test
    public void testGetNom() {
        Personnel personnel = new Personnel("Le Talour", "Romain", 21703904, "romMdp56", "romainlt");
        Assert.assertEquals(personnel.getNom(), "Le Talour");
    }

    @Test
    public void testGetPrenom() {
        Personnel personnel = new Personnel("Le Talour", "Romain", 21703904, "romMdp56", "romainlt");
        Assert.assertEquals(personnel.getPrenom(), "Romain");

    }

    @Test
    public void testGetIdPerso() {
        Personnel personnel = new Personnel("Le Talour", "Romain", 21703904, "romMdp56", "romainlt");
        Assert.assertEquals(personnel.getIdPerso(), 21703904);
    }

    @Test
    public void testGetMdp() {
        Personnel personnel = new Personnel("Le Talour", "Romain", 21703904, "romMdp56", "romainlt");
        Assert.assertEquals(personnel.getMdp(), "romMdp56");
    }

    @Test
    public void testGetCompte() {
        Personnel personnel = new Personnel("Le Talour", "Romain", 21703904, "romMdp56", "romainlt");
        Assert.assertEquals(personnel.getCompte(), "romainlt");
    }

    @Test
    public void testSetCompte() {
        Personnel personnel = new Personnel("Le Talour", "Romain", 21703904, "romMdp56", "");
        personnel.setCompte("romainltTest");
        Assert.assertEquals(personnel.getCompte(), "romainltTest");
    }
}