/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab.dao;

import br.com.lab.util.CripografiatUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.lab.util.DbUtil;
/**
 *
 * @author Giovani
 */
public class FuncionarioDAO {
    
    	private static final String AUTENTICAR_FUNCIONARIO = 
                                            "select count(*) as total "
                                            + "from funcionario "
                                            + " where "
                                            + " login_funcionario = ? and "
                                            + " senha_funcionario = ?";
   
        public boolean getAutenticacao(String nome, String senha){
            Connection conn = DbUtil.getConnection();
            PreparedStatement statement = null;
            ResultSet result = null;
            int numReg = 0;
            boolean autenticado = false;
                try{
                    statement = conn.prepareStatement(AUTENTICAR_FUNCIONARIO);
                    statement.setString(1, nome);
                    statement.setString(2, CripografiatUtil.encripta(senha));
                    result = statement.executeQuery();
                    if(result.next()){
                        numReg = result.getInt("total");
                    }
                }catch(SQLException e){
                    e.getMessage();
                }finally{
                    DbUtil.close(conn, statement, result);
                }
                
                if(numReg == 1){
                        return autenticado = true;
                }

            return autenticado;			
        }
}
                

