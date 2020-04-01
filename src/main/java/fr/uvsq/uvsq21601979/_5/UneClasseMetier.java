package fr.uvsq.uvsq21601979._5;

import java.time.LocalDateTime;
/**
 * @author Tanguy
 */
public class UneClasseMetier {
    /**
     * methode qui affiche des information dans le
     * terminal avec la bilbiothèque slf4j.
     * @param l logger
     */
    public static void uneMethodeMetier(final org.slf4j.Logger l) {
        l.info(LocalDateTime.now() + "début de uneMethodeMetier");
        l.info(LocalDateTime.now() + "fin de uneMethodeMetier");
    }
}
