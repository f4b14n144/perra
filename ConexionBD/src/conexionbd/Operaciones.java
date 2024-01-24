/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionbd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author fabia
 */
public class Operaciones 
{
    Connection con;
    Statement mistatement;
    public void conectar()
    {
        try {
         con= DriverManager.getConnection("jdbc:mysql://localhost:3306/editorial","root","mbfa.10895");
             mistatement=con.createStatement();
            System.out.println("Conexion Exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean agregarEmpleado(String nombre, String cedula,String apellido,String telefono,int codigoSucursal)
    {
        PreparedStatement sentencia;
        try {
            sentencia = con.prepareStatement("INSERT INTO Empleado values(?,?,?,?,?)");
            sentencia.setString(1, nombre);
            sentencia.setString(2, cedula);
            sentencia.setString(3, apellido);
            sentencia.setString(4, telefono);
            sentencia.setInt(5,codigoSucursal);
            
            sentencia.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ResultSet listarEmpleado()
    {
        try {
            ResultSet listado=mistatement.executeQuery("SELECT * from Empleado");
            return listado;
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
}
