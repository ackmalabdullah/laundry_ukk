
package apk_laundry_ukk;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    private String url = "jdbc:mysql://localhost/laundry_ukk";
    private String user = "root";
    private String pass = "";
    private Connection Con;
    
    public void connect(){
        try{
            Con = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi database berhasil!!");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
public Connection getCon() {
        Connection con = null;
        try {
            // Lakukan inisialisasi dan pengambilan koneksi ke database di sini
            con = DriverManager.getConnection("jdbc:mysql://localhost/laundry_ukk", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
}

//ngoding ukk laundry vid 6 
//kanan 0:15:47
