/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import MODEL.Patient.Person;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author Karlo
 */
public class SqlRepo implements IRepo{
    private static final String INSERT_PERSON = "{ CALL InsertPerson (?,?,?,?) }";

    @Override
    public int insertPerson(Person p) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_PERSON)) {
            stmt.setString(1,p.getFirstName());
            stmt.setString(2,p.getMidleName());
            stmt.setString(3,p.getSurname());
            stmt.registerOutParameter(4, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(4);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
}
