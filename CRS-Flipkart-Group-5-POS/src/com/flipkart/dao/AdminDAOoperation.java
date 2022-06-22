package com.flipkart.dao;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.constants.SQLQueriesConstants;
import com.flipkart.utils.DBConnection;

import java.sql.*;
import java.util.Scanner;


public class AdminDAOoperation implements AdminDAO {

    private PreparedStatement statement = null;

    @Override
    public Admin fetchAdminData(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        System.out.println("Done");
        Admin ad=new Admin();
        String sql = SQLQueriesConstants.GET_USER_BY_ID;
        statement=connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            ad.setUserId(rs.getInt("id"));
            ad.setName(rs.getString("name"));
            ad.setType(rs.getInt("type"));
            ad.setPassword(rs.getString("password"));


        }

        return ad;

    }

    @Override
    public void approveStudent() throws SQLException {
        Connection connection = DBConnection.getConnection();
        Student stud=new Student();
        String sql = SQLQueriesConstants.GET_STUDENT_TO_APPROVE;

        statement=connection.prepareStatement(sql);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            int id=rs.getInt("id");
            System.out.println(id+"to be approved");
            String postsql=SQLQueriesConstants.APPROVE_STUDENT_BY_ID;

            statement=connection.prepareStatement(postsql);
            statement.setInt(1,id);
            statement.executeUpdate();
            System.out.println(id+"approved");
        }
        sql = SQLQueriesConstants.GET_STUDENT_TO_APPROVE;
        st = connection.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            int id=rs.getInt("id");
            System.out.println(id+"not approved");
        }
    }

    @Override
    public void generateReportCard() {

    }

    @Override
    public void addProfessor() throws SQLException{
        Scanner sc = new Scanner(System.in);
        Professor prof = new Professor();
        System.out.println("Enter userid for new professor");
        int profid = sc.nextInt();
        prof.setUserId(profid);
        System.out.println("Enter new Professor Name");
        String profname = sc.next();
        System.out.println("Enter new Professor Dept ID");
        int deptid = sc.nextInt();
        int profrole = 2;
        String pass = "1234";
        Connection connection = DBConnection.getConnection();
        String sql = SQLQueriesConstants.ADD_PROFESSOR_SET_USER;

        PreparedStatement stmt=connection.prepareStatement(sql);
        stmt.setInt(1,profid);
        stmt.setString(2,pass);
        stmt.setString(3,profname);
        stmt.setInt(4,profrole);
        stmt.executeUpdate();

        sql = SQLQueriesConstants.ADD_PROFESSOR_SET_PROF;
        PreparedStatement stmt2=connection.prepareStatement(sql);
        stmt2.setInt(1,profid);
        stmt2.setInt(2,deptid);
        stmt2.executeUpdate();
    }

    @Override
    public void updateCatalogue(int addOrdrop) throws SQLException {
        Scanner sc = new Scanner(System.in);
        switch (addOrdrop) {
            case 1:
                System.out.println("Enter Course Details for adding course");
                System.out.println("Enter Course ID");
                int cida = sc.nextInt();
                System.out.println("Enter Course Name");
                String cnamea = sc.next();
                Connection connection = DBConnection.getConnection();
                String sql = SQLQueriesConstants.ADD_COURSE_ADMIN;

                PreparedStatement stmt=connection.prepareStatement(sql);
                stmt.setInt(1,cida);
                stmt.setString(2,cnamea);

                stmt.execute();

                break;
            case 2:
                System.out.println("Enter Course Details for dropping course");
                System.out.println("Enter Course ID");
                int cidd = sc.nextInt();
                connection = DBConnection.getConnection();
                sql = SQLQueriesConstants.DELETE_COURSE_ADMIN;

                stmt=connection.prepareStatement(sql);
                stmt.setInt(1,cidd);


                stmt.execute();

                break;
        }
    }

    @Override
    public void assignCourseToStudent() {

    }
}
