package sample.BBDConnect.TableClass;

public class Usager {
    private String nom;
    private String prenom;
    private int age;
    private int idUsager;
    private String adresse;
    private String telephone;
    private int cntEmpLivre;
    private int cntEmpMedia;

    public Usager(String nom, String prenom, int age, int idUsager, String adresse, String telephone, int cntEmpLivre, int cntEmpMedia) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.idUsager = idUsager;
        this.adresse = adresse;
        this.telephone = telephone;
        this.cntEmpLivre = cntEmpLivre;
        this.cntEmpMedia = cntEmpMedia;

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public int getIdUsager() {
        return idUsager;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getCntEmpLivre() {
        return cntEmpLivre;
    }

    public int getCntEmpMedia() {
        return cntEmpMedia;
    }
}
