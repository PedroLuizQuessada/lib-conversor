package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConversorUtil {
    public static String getDateToString(Calendar calendar, String formato) {
        SimpleDateFormat s = new SimpleDateFormat(formato);
        return s.format(calendar.getTime());
    }

    public static Double getStringToDouble(String texto) {
        return Double.valueOf(texto);
    }
}
