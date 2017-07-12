package br.edu.ifpb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws SQLException {
        
        Connection connection = DriverManager.getConnection("jdbc:h2:./banco.h2;" +
                "INIT=RUNSCRIPT FROM './src/main/resources/create_schema.sql'\\;", "sa", "");
        
        String sql = "SELECT * FROM USUARIO";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        List<Usuario> usuarios = new ArrayList<Usuario>();
        while(rs.next()){
            Usuario usuario = new Usuario();
            usuario.setId(rs.getInt(1));
            usuario.setName(rs.getString(2));
            usuario.setEmail(rs.getString(3));
            usuarios.add(usuario);
        }
        
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
        
    }
}
