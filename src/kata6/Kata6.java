package kata6;

import java.sql.DriverManager;

public class Kata6 {

    public static void main(String[] args) {
        DriverManager.registerDriver(new OracleDriver());
        String username = "system";
        String password = "orcl";
        String url = "jdbc:oracle:thin:@" + "10.22.146.229:1521:orcl";
    
        
}
