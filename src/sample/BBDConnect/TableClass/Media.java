package sample.BBDConnect.TableClass;

public class Media {
    private String type;
    private String titre;
    private String genre;
    private int nbExemplaires;
    private int emplacement;
    private int idMedia;
    private int disponible;

    public Media(String type,String titre,String genre,int nbExemplaires,int emplacement){
        this.type = type;
        this.titre = titre;
        this.genre = genre;
        this.nbExemplaires = nbExemplaires;
        this.emplacement = emplacement;
    }
    public Media(String type,String titre,String genre,int nbExemplaires,int emplacement,int disponible, int idMedia){
        this.type = type;
        this.titre = titre;
        this.genre = genre;
        this.nbExemplaires = nbExemplaires;
        this.emplacement = emplacement;
        this.disponible = disponible;
        this.idMedia = idMedia;
    }
    public Media(String titre,int idMedia){

        this.titre = titre;
        this.idMedia = idMedia;
    }
    public Media(String type,String titre,String genre){

        this.type = type;
        this.titre = titre;
        this.genre = genre;
    }
    public Media(int idMedia){

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

    public void printAll(){
        System.out.println(type);
        System.out.println(titre);
        System.out.println(genre);
        System.out.println(nbExemplaires);
        System.out.println(emplacement);
        System.out.println(idMedia);
        System.out.println(disponible);
    }
}
