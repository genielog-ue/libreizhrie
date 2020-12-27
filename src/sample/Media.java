import java.sql.Time;

/**
 * Classe Media, classifie les médias de la médiathèque
 * Borne de vérification de livre et indicateur de localisation
 * L'abonné 
 */

public class Media {
    private int m_type;
    private String m_titre;
    private boolean m_dispo;
    private String m_loc; // localisation du livre dans la médiathèque
    private int m_tempMaxEmprunt;
    private int m_limiteAge;
    private int m_idMedia;

    /**
     * Constructeur de la classe Media
     */
    Media(int type, String titre, String lieu, boolean dispo, int tempMaxEmprunt, int limiteAge) {
        m_type = type;
        m_titre = titre;
        m_dispo = dispo;
        m_tempMaxEmprunt = tempMaxEmprunt;
        m_limiteAge = limiteAge;
    }

    /**
     * Methode pour créer un ID de livre a partir de son type et de son lieu
     * Communique avec la BDD
     */
    public int createID(int type, String lieu) { //TODO
        int idMedia = 0;
        return idMedia;
    }

    /**
     * Accesseur pour m_dispo
     * Retourne un boolean pour savoir si un média est dispo (true si dispo, false sinon)
     */
    public boolean getDispo() {
        return m_dispo;
    }

    public int getID() {
        return m_idMedia;
    }

    /**
     * Methode pour retourner le lieu du media dans la médiathèque
     * Communique avec la BDD
     */
    public String indiqueLocalisation() { //TODO
        
    }
    

}
