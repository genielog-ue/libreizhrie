package sample.BBDConnect.TableClass;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsagerTest {

    @Test
    public void getNom() {
        Usager user = new Usager("Le Talour", "Romain", 21, 21703904, "rue de l'ubs", "02 95 21 23 12", 2, 0);
        Assert.assertEquals(user.getNom(), "Le Talour");
    }

    @Test
    public void getPrenom() {
        Usager user = new Usager("Le Talour", "Romain", 21, 21703904, "rue de l'ubs", "02 95 21 23 12", 2, 0);
        Assert.assertEquals(user.getPrenom(), "Romain");
    }

    @Test
    public void getAge() {
        Usager user = new Usager("Le Talour", "Romain", 21, 21703904, "rue de l'ubs", "02 95 21 23 12", 2, 0);
        Assert.assertEquals(user.getAge(), 21);
    }

    @Test
    public void getIdUsager() {
        Usager user = new Usager("Le Talour", "Romain", 21, 21703904, "rue de l'ubs", "02 95 21 23 12", 2, 0);
        Assert.assertEquals(user.getIdUsager(), 21703904);
    }

    @Test
    public void getAdresse() {
        Usager user = new Usager("Le Talour", "Romain", 21, 21703904, "rue de l'ubs", "02 95 21 23 12", 2, 0);
        Assert.assertEquals(user.getAdresse(), "rue de l'ubs");
    }

    @Test
    public void getTelephone() {
        Usager user = new Usager("Le Talour", "Romain", 21, 21703904, "rue de l'ubs", "02 95 21 23 12", 2, 0);
        Assert.assertEquals(user.getTelephone(), "02 95 21 23 12");
    }

    @Test
    public void getCntEmpLivre() {
        Usager user = new Usager("Le Talour", "Romain", 21, 21703904, "rue de l'ubs", "02 95 21 23 12", 2, 0);
        Assert.assertEquals(user.getCntEmpLivre(), 2);
    }

    @Test
    public void getCntEmpMedia() {
        Usager user = new Usager("Le Talour", "Romain", 21, 21703904, "rue de l'ubs", "02 95 21 23 12", 2, 0);
        Assert.assertEquals(user.getCntEmpMedia(), 0);
    }
}