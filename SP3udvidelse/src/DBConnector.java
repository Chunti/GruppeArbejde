import java.sql.*;
import java.util.ArrayList;

public class DBConnector {

    // database URL
    static final String DB_URL = "jdbc:mysql://localhost/SP3";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "Hej12345";


    public String[] readFieldData() {
        String[] field_data = new String[40];
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            // Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();


            String sql = "SELECT * FROM Teams";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                String team = rs.getString("TeamName");
                String player1 = rs.getString("Player1");
                String player2 = rs.getString("Player2");

                field_data[id-1]=id+","+team+","+player1+","+player2;

            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try


        return field_data;
    }

    /*public void saveGameData(ArrayList<Tournament> tournaments ){
        Connection conn = null;
        String sql = "insert into Player(id,name,balance,position,isNext)) "
                + "VALUES (?,?,?,?,?) ON DUPLICATE KEY UPDATE balance=?,position=?,isNext=?";

        try{
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            for (int i = 0; i < tournaments.size(); i++) {
                Tournament t = tournaments.get(i);
                pstmt.setInt(1,);

                pstmt.executeUpdate();
            }
            pstmt.close();

        }catch (SQLException se){


        }
    }*/
}