package com.bilt.emapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.blit.models.Employee;
import com.mysql.cj.jdbc.JdbcConnection;

public abstract class  EmployeeDaoImpl implements EmployeeDao {



    @Override
    public void createEmployee(Employee emp) {
    	
    	try (Connection conn = JDBCconnection.getConnection()) {


        String query = "INSERT INTO employee VALUES (?, ?, ?, ?)";

            PreparedStatement pstm = conn.prepareStatement(query);

            pstm.setInt(1, emp.getId());
            pstm.setString(2, emp.getName());
            pstm.setDouble(3, emp.getSalary());
            pstm.setInt(4, emp.getId());

            int cnt = pstm.executeUpdate();

            if (cnt != 0)
                System.out.println("Employee Inserted Successfully!!!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }



	@Override
    public void showAllEmployee() {
		
		try (Connection conn = JDBCconnection.getConnection()) {
   

        String query = "SELECT * FROM employee";
        System.out.println("Employee Details:");
        System.out.println("------------------------------------------------------------------------------");
        System.out.format("%-5s%-20s%-10s%-5s\n", "Id", "Name", "Salary", "Age");
        System.out.println("------------------------------------------------------------------------------");

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                System.out.format("%-5d%-20s%-10.2f%-5d\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getDouble(3),
                        result.getInt(4));
            }
            System.out.println("------------------------------------------------------------------------------");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void showEmployeeBasedOnID(int id) {
    	try (Connection conn = JDBCconnection.getConnection()) {

        String query = "SELECT * FROM employee WHERE id=" + id;

       
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                System.out.format("%-5d%-20s%-10.2f%-5d\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getDouble(3),
                        result.getInt(4));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int id, String name) {
    	try (Connection conn = JDBCconnection.getConnection()) {

        String query = "UPDATE employee SET name = ? WHERE id=?";

       
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, name);
            pstm.setInt(2, id);
            int cnt = pstm.executeUpdate();
            if (cnt != 0)
                System.out.println("Employee Details updated successfully");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
    	try (Connection conn = JDBCconnection.getConnection()) {

        String query = "DELETE FROM employee WHERE id=?";

      
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, id);
            int cnt = pstm.executeUpdate();
            if (cnt != 0)
                System.out.println("Employee Details deleted successfully" + id);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}