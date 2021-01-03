package sample.BBDConnect.TableClass;

public class Personnel {
    /**
     * Classe afin de stocker les données récupérées d'un personnel dans la BDD
     * Méthodes : getter et setter pour chaque variable
     */
    private String nom;
    private String prenom;
    private int idPerso;
    private String mdp;
    private String compte;

    public Personnel(String nom, String prenom, int idPerso, String mdp, String compte) {
        this.nom = nom;
        this.prenom = prenom;
        this.idPerso = idPerso;
        this.mdp = mdp;
        this.compte = compte;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getIdPerso() {
        return idPerso;
    }

    public String getMdp() {
        return mdp;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }
}
