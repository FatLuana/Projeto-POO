package br.com.farmcontrol.model.dao;

import br.com.farmcontrol.connection.ConnectionFactory;
import br.com.farmcontrol.model.vo.Ovo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class OvoDao {
    
    public void create(Ovo o){
        
        Connection con = ConnectionFactory.getConnection();
        String sql = "INSERT INTO ovos(idanimal,valor_unidade,quantidade,data_ovo) "
                + "VALUES(?,?,?,?)";
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, o.lote.getId_animal());
            stmt.setDouble(2, o.getValor_unidade());
            stmt.setInt(3, o.getQtd_ovos());
            stmt.setDate(4, (Date) o.getData_producao());
            stmt.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, " Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    
}
