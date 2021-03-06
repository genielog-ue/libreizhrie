package sample.BBDConnect.TableClass;

public class Media {
    /**
     * Classe Media utilisée pour stocker les données récupérées dans la BDD
     * Méthodes : Setters et Getters pour chaque variable
     */
    private String type;
    private String titre;
    private String genre;
    private int nbExemplaires;
    private int emplacement;
    private int idMedia;
    private int disponible;

    public Media(String type, String titre, String genre, int nbExemplaires, int emplacement) {
        this.type = type;
        this.titre = titre;
        this.genre = genre;
        this.nbExemplaires = nbExemplaires;
        this.emplacement = emplacement;
    }

    public Media(String type, String titre, String genre, int nbExemplaires, int emplacement, int disponible, int idMedia) {
        this.type = type;
        this.titre = titre;
        this.genre = genre;
        this.nbExemplaires = nbExemplaires;
        this.emplacement = emplacement;
        this.disponible = disponible;
        this.idMedia = idMedia;
    }

    public Media(String type, String titre, String genre) {

        this.type = type;
        this.titre = titre;
        this.genre = genre;
    }

    public Media(String titre, int idMedia) {

        this.titre = titre;
        this.idMedia = idMedia;
    }

    public Media(int nbExemplaires, int idMedia) {

        this.nbExemplaires = nbExemplaires;
        this.idMedia = idMedia;
    }

    public Media(int idMedia) {

        this.idMedia = idMedia;
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

    public int getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(int idMedia) {
        this.idMedia = idMedia;
    }

    public int getDisponible() {
        return disponible;
    }

}
