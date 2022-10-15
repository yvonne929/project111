package ch2;

import javax.swing.*;
import java.util.Locale;

public class Vaccines {
    //疫苗種類查詢
    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(BNT、Moderna、AZ、Janssen、MVC):");
        //輸入的字串存入vaccine
        vaccine = vaccine.toLowerCase();

        if (vaccine.equals("az")) {
            JOptionPane.showInputDialog(null, "AZ \n 研發國家:英國/瑞典 \n 腺病毒疫苗 \n 保護力:81%");
        }
        else if (vaccine.equals("bnt")){
            JOptionPane.showInputDialog(null, "BNT \n 研發國家:德國/美國 \n mRNA疫苗 \n 保護力:95%");
        }
        else if (vaccine.equals("moderna")){
            JOptionPane.showInputDialog(null, "莫德納 \n 研發國家:美國 \n mRNA疫苗 \n 保護力:94%");
        }
        else if (vaccine.equals("janssen")){
            JOptionPane.showInputDialog(null, "嬌生 \n 研發國家:美國/比利時 \n 腺病毒疫苗 \n 保護力:66%");
        }
        else if (vaccine.equals("mvc")){
            JOptionPane.showInputDialog(null, "高端 \n 研發國家:國產 \n 重組棘蛋白疫苗 \n 保護力:未說明");
        }
        else{
            JOptionPane.showInputDialog(null, "無法辨識你的輸入，請重新輸入選項(不可含有中文字或空白鍵)");
        }
    }
}
