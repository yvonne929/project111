import javax.swing.*;
import java.util.Locale;

public class Vaccines {
    //疫苗種類查詢
    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(BNT、Moderna、AZ、Janssen、MVC):");
        vaccine = vaccine.toLowerCase();

        if (vaccine.equals("az")) {
            JOptionPane.showInputDialog(null, "AZ \n 研發國家:英國/瑞典 \n 腺病毒疫苗 \n 保護力:81%");
        }
    }
}
