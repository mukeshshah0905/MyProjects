package main;

import java.math.BigDecimal;

public class TestBigDecimal {
public static void main(String[] args) {
    TestBigDecimal tbd = new TestBigDecimal();
    System.out.println(tbd.removeDecimalPlaceFromSV104(new Float(1.2)));
}

public static Object removeDecimalPlaceFromSV104(Object value) {
    System.out.println("value:"+value);
    if (value != null && value instanceof BigDecimal) {
        try {
            BigDecimal bd = (BigDecimal) value;
/*                int decimalPlaces = 2;
            bd = bd.setScale(decimalPlaces);*/
            if (bd.compareTo(new BigDecimal(bd.longValue())) == 0 ) {
                // remove leading Zero
                String regex = "^0*";
                return bd.toString().replaceAll(regex, "");
            }
            return value;
        } catch (NumberFormatException ne) {
            return value;
        }
    }
    return value;
}
}

