package edu.mum.fantastic.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bipin
 */
public class DateHelper {

    static SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public static Date formatDate(String dateVal) {

        try {
            return dateFormat.parse(dateVal);
        } catch (ParseException ex) {
            Logger.getLogger(DateHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Date();
    }
    
    public static String dateToString(Date date){
        return dateFormat.format(date);
    }
}
