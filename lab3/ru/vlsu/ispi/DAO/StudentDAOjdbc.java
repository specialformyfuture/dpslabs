package ru.vlsu.ispi.DAO;

import ru.vlsu.ispi.beans.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDAOjdbc implements StudentDAOImpl{
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    public StudentDAOjdbc() {

        try {
            Class.forName("com.MySQL.jdbc.Driver");
            String userName = "root";
            String password = "root";
            String url = "jdbc:MySQL://127.0.0.1:3306/";
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database Connection Established...");
        } catch (Exception ex) {
            System.err.println("Cannot connect to database server");
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    System.out.println("n***** Let terminate the Connection *****");
                    conn.close();
                    System.out.println("Database connection terminated... ");
                } catch (Exception ex) {
                    System.out.println("Error in connection termination!");
                }
            }
        }
    }
    public void create(Student student) {
        try {
            String sql = "INSERT INTO Students VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1,student.getId());
            ps.setString(2,student.getName());
            ps.setDate(3, (Date) student.getBirthdate());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Student student) {
        try {
            String sql = "INSERT INTO Students VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1,student.getId());
            ps.setString(2,student.getName());
            ps.setDate(3, (Date) student.getBirthdate());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(long id) {
        try {
            String sql = "DELETE FROM Students WHERE id = (?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Student getById(long id) {
        Student s = new Student();
        try {
            String sql = "SELECT id, name, birthdate FROM Students WHERE id = '+ id +'";
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                s.setId(id);
                s.setName(rs.getString("name"));
                s.setBirthdate(rs.getDate("birthdate"));
            }
            return s;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Student> getAll() {
        List<Student> StList = new ArrayList<Student>();
        try {
            String sql = "SELECT * FROM Students WHERE id = '+ id +'";
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Student s = new Student();
                s.setId(rs.getLong("id"));
                s.setName(rs.getString("name"));
                s.setBirthdate(rs.getDate("birthdate"));
                StList.add(s);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return StList;
    }
}
