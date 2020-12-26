package sample.BBDConnect.TableClass;

public class Media {
    private String type;
    private String titre;
    private String genre;
    private int nbExemplaires;
    private int emplacement;

    public Media(String type,String titre,String genre,int nbExemplaires,int emplacement){
        this.type = type;
        this.titre = titre;
        this.genre = genre;
        this.nbExemplaires = nbExemplaires;
        this.emplacement = emplacement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNbExemplaires() {
        return nbExemplaires;
    }

    public void setNbExemplaires(int nbExemplaires) {
        this.nbExemplaires = nbExemplaires;
    }

    public int getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(int emplacement) {
        this.emplacement = emplacement;
    }
}
