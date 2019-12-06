package util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author renato.lopes
 * @date 06/12/2019
 */
public class NumberFormatter {

  private static NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));

  public static Long stringToLong(String number) {

    Long newValue = 0L;

    try {
      newValue = nf.parse(number).longValue();
    } catch (ParseException e) {
      e.printStackTrace();
    }

    return newValue;
  }

}
