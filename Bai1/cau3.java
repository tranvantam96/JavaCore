import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cau3 {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("HH:mm  dd/MM/yyyy");
        String myFormatDateTime = current.format(myFormat);
        System.out.println(myFormatDateTime);
    }
    
}
