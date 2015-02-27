package main.java.com.localisation.lab2.model;

/**
 * Created by Zalila on 2015-02-27.
 */
public class PtRC extends PtReseau {

    private String type_R;//type du reseau cellulaire
    private String mmc;//Mobile Country Code
    private String MNC;//Mobile Network Code
    private String cell_id;//identifiant de la cellule d'attache
    private String lac;//Location Area Code
    private int niv_sig_sb;//niveau du signal de la station de base
    private Coord coord_sb;//coordonnees de la station de base
}
