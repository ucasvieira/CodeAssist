package conexao;

/**
 *
 * @author Thainá Ferreira
 */

import javax.swing.JOptionPane;
import java.sql.*;

public class Conexao {
    final private String driver = "com.mysql.cj.jdbc.Driver"; 
    final private String url = "jdbc:mysql://localhost/projeto";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
public boolean conecta(){
    boolean result = true;
    try{
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, usuario, senha);
        
    }catch(ClassNotFoundException Driver){
       
        result = false;
    }catch (SQLException Fonte){
        
        result = false;
    }
    return result;
} 
public void desconecta(){
    try{
        conexao.close();
        JOptionPane.showMessageDialog(null, "Conexão com o banco fechada", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE); 
    }catch(SQLException fecha){
        
    }
}
    public void executaSQL(String sql){
        try{
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }catch(SQLException excecao){
            JOptionPane.showMessageDialog(null,"erro no comando SQL! \n Erro: " + excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
