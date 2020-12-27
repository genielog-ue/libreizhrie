/**
* Classe Usager, utilisée lors de la création de l'usager à la borne
* Un Usager correspond à un abonné à la médiathèque
*/


public class Usager
{
    private String m_nom;
    private String m_prenom;
    private int m_age;
    private int m_idUsager;
    private String m_adresse;
    private int m_phoneNumber;
    private int m_dateInscription;
    private int m_compteurEmprunt;
    private int m_mdp;
    
    /**
     * Constructeur de la classe Usager
     */
    public Usager(String nom, String prenom, int age, String adresse, int phoneNumber, int mdp)
    {
        m_nom = nom;
        m_prenom = prenom;
        m_age = age;
        m_adresse = adresse;
        m_phoneNumber = phoneNumber;
        m_mdp = mdp;
    }

    /**
     * Méthode pour creer un ID usager
     * Communique avec la BDD
     */
    public int createID() { //TODO
        int id = 0;
        return id;
    }

    /**
     * Mutateur dateInscription
     * Communique avec la BDD
     */
    public void setDateInscription(int dateInscription) {
        dateInscription = m_dateInscription;
    }

    /**
     * Méthode pour déterminer si l'age de l'usager est conforme à l'abonnement requis
     * Communique avec la BDD
     */
    public int ageValide() { //TODO
        return;
    }

    /**
     * Méthode pour savoir quel livre est emprunté par qui
     * Communique avec la BDD
     */
    public boolean empruntLivre(int compteurEmprunt, int dateInscription, int age) { //TODO
        return;
    }

}