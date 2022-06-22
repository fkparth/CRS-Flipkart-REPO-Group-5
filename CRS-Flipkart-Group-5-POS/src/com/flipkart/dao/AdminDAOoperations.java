package com.flipkart.dao;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Student;
import com.flipkart.constants.SQLQueriesConstants;
import com.flipkart.utils.DBConnection;

import java.sql.*;


public class AdminDAOoperations implements AdminDAO {

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
        System.out.println("Done");
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
    public void addProfessor() {

    }

    @Override
    public void updateCatalogue(int addOrDrop) {

    }

    @Override
    public void assignCourseToStudent() {

    }
}
