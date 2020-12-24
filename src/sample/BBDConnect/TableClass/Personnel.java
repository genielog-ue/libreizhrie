package sample.BBDConnect.TableClass;

public class Personnel {
    private String nom;
    private String prenom;
    private int idPerso;
    private String mdp;

    public Personnel(String nom, String prenom, int idPerso, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.idPerso = idPerso;
        this.mdp = mdp;
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
}
