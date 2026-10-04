package org.example;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

    public class StudentDAO {

        // CREATE: write a new student in the notebook
        public void addStudent(String name, String email, String course) {
            String sql = "INSERT INTO students (name, email, course) VALUES (?, ?, ?)";
            try (Connection con = DBConnection.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, course);
                ps.executeUpdate();
                System.out.println("Student added!");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // READ: get everyone from the notebook
        public List<Student> getAllStudents() {
            List<Student> list = new ArrayList<>();
            String sql = "SELECT * FROM students";
            try (Connection con = DBConnection.getConnection();
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery(sql)) {
                while (rs.next()) {
                    list.add(new Student(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("course")));
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
            return list;
        }

        // UPDATE: change a student's course
        public void updateCourse(int id, String newCourse) {
            String sql = "UPDATE students SET course = ? WHERE id = ?";
            try (Connection con = DBConnection.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, newCourse);
                ps.setInt(2, id);
                int rows = ps.executeUpdate();
                System.out.println(rows > 0 ? "Updated!" : "No student with that id.");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // DELETE: remove a student
        public void deleteStudent(int id) {
            String sql = "DELETE FROM students WHERE id = ?";
            try (Connection con = DBConnection.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, id);
                int rows = ps.executeUpdate();
                System.out.println(rows > 0 ? "Deleted!" : "No student with that id.");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

