import java.math.BigDecimal;
import java.sql.Timestamp;

public class TestEvento {
    public static void main(String[] args) {
        Timestamp ts = Timestamp.valueOf("2023-01-01 00:00:00");
        System.out.println(ts);

        Evento e = new Evento();
        e.setRecaudacion(new BigDecimal(654654654.21354687436654879584));
    }

}

