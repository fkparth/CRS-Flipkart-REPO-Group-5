package com.flipkart.dao;
import com.flipkart.bean.*;
import com.flipkart.constants.SQLQueriesConstants;
import com.flipkart.entity.CourseCatalogEntity;
import com.flipkart.entity.GenericResponse;
import com.flipkart.entity.StudentListEntity;
import com.flipkart.exceptions.*;
import com.flipkart.utils.DBConnection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class ProfessorDAOoperation implements ProfessorDAO {
    private PreparedStatement statement = null;
    /**
     * Function for professor to choose course to teach from course catalogue.
     *
     * @param id
     * @return
     * @throws CourseAlreadyTakenException
     * @throws SQLException
     */
    @Override

    public GenericResponse chooseCourse(int id, int courseid) throws SQLException, CourseNotAssignedToProfException {

        Connection connection = DBConnection.getConnection();

        try {
            String sql = SQLQueriesConstants.VIEW_STUDENT_LIST_COURSEID;
            statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            //System.out.println("Here are list of available Courses:");

            while (rs.next()) {
                int checkCourseId = (rs.getInt("id"));
                if(checkCourseId == courseid) {
                    GenericResponse res = new GenericResponse(false, "Course already assigned!");
                    return res;
                }
            }

            int ccode = courseid;

            sql = SQLQueriesConstants.CHOOSE_COURSE_PROF_SELECT;
            statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            statement.setInt(2,ccode);
            statement.executeUpdate();
            System.out.println("Chosen Course ID:"+ccode);

            GenericResponse res = new GenericResponse(true, "Course assigned successfully.");
            return res;
        } catch(Exception se) {
            //throw new CourseNotAssignedToProfException();
            System.out.println(se.getMessage());

            GenericResponse res = new GenericResponse(false, "Some error occurred!");
            return res;
        }



    }
    /**
     * Function to fetch professor data when he logs into CRSApplication
     * @param id
     * @throws UserNotFoundException
     * @throws SQLException
     */
    @Override
    public Professor fetchProfessorData(int id) throws SQLException, UserNotFoundException {
        Connection connection = DBConnection.getConnection();
        System.out.println("Done");

        try {
            Professor prof = new Professor();
            String sql = SQLQueriesConstants.GET_USER_BY_ID;
            statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            boolean flag = false;
            while (rs.next()) {
                prof.setUserId(rs.getInt("id"));
                prof.setName(rs.getString("name"));
                prof.setType(rs.getInt("type"));
                prof.setPassword(rs.getString("password"));
                flag = true;
            }
            if(!flag){
                throw new UserNotFoundException(id);
            }
            return prof;
        } catch (SQLException se) {
            throw new UserNotFoundException(id);
        }

    }

    /**
     * Function for professor to view students list registered to the course he chose.
     * @param id
     * @throws NoStudentRegisteredException
     * @throws SQLException
     */
    @Override
    public ArrayList<StudentListEntity> viewStudentsList(int id) throws SQLException, NoStudentRegisteredException {
        Connection connection = DBConnection.getConnection();

        int courseid = -1;

        try {
            String sql = SQLQueriesConstants.VIEW_STUDENT_LIST_COURSEID;
            statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            //System.out.println("Here are list of available Courses:");

            while (rs.next()) {
                courseid = (rs.getInt("id"));
                //System.out.println(courseid+"c");
            }

            if (courseid == -1) {
                throw new CourseNotAssignedToProfException();
            }

            sql = SQLQueriesConstants.VIEW_STUDENT_LIST_STUDENTID;
            PreparedStatement statement2=connection.prepareStatement(sql);
            statement2.setInt(1,courseid);
            rs = statement2.executeQuery();
            int studid = -1;
            String studname = "datta";
            System.out.println("StudentID : StudentName");
            ArrayList<StudentListEntity> res = new ArrayList<StudentListEntity>();
            while (rs.next()){
                studid = rs.getInt("student_id");
                //System.out.println(studid+"hi");
                String sql2 = SQLQueriesConstants.VIEW_STUDENT_LIST_STUDENTNAME;
                PreparedStatement statement3=connection.prepareStatement(sql2);
                statement3.setInt(1,studid);
                ResultSet rs2 = statement3.executeQuery();
                while (rs2.next()){
                    studname = rs2.getString("name");
                }
                StudentListEntity en = new StudentListEntity(studname, studid);
                res.add(en);
                System.out.println(studid+"     "+studname);
            }
            if(studid == -1) {
                throw new NoStudentRegisteredException(courseid);
            }
            return res;
        } catch (SQLException se) {
            throw new NoStudentRegisteredException(courseid);
        } catch (CourseNotAssignedToProfException e) {
            System.out.println(e.getMessage());
        } catch (NoStudentRegisteredException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    /**
     * Function for professor to assign grade to students registered to the course he chose.
     * @param id
     * @throws GradeNotAddedException
     * @throws SQLException
     */
    @Override
    public GenericResponse assignGrade(int id,String grade, int studId) throws SQLException, GradeNotAddedException {
        Connection connection = DBConnection.getConnection();

        try {
            String sql = SQLQueriesConstants.VIEW_STUDENT_LIST_COURSEID;
            statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            //System.out.println("Here are list of available Courses:");
            int courseid = -1;
            while (rs.next()) {
                courseid  = (rs.getInt("id"));
                //System.out.println(courseid+"c");
            }

            if (courseid   == -1) {
                GenericResponse res = new GenericResponse(false, "Course not assigned to professor!");
                return res;
                //throw new CourseNotAssignedToProfException();
            }

            sql = SQLQueriesConstants.VIEW_STUDENT_LIST_STUDENTID;
            PreparedStatement statement2=connection.prepareStatement(sql);
            statement2.setInt(1,courseid);
            rs = statement2.executeQuery();
//            int studid = -1;
            String studname = "datta";
            System.out.println("StudentID : StudentName");
            while (rs.next()){
                //studid = rs.getInt("student_id");
                //System.out.println(studid+"hi");
                String sql2 = SQLQueriesConstants.VIEW_STUDENT_LIST_STUDENTNAME;
                PreparedStatement statement3=connection.prepareStatement(sql2);
                statement3.setInt(1,studId);
                ResultSet rs2 = statement3.executeQuery();
                while (rs2.next()){
                    studname = rs2.getString("name");
                }
                System.out.println(studId+"     "+studname);
                //System.out.print("Enter Grade- ");
                //Scanner sc = new Scanner(System.in);
                //String grade = sc.nextLine();

                String sql3 = SQLQueriesConstants.GIVE_GRADE;
                PreparedStatement statement4=connection.prepareStatement(sql3);
                statement4.setString(1,grade);
                statement4.setInt(2,courseid);
                statement4.setInt(3,studId);
                statement4.executeUpdate();
            }

            if(studId == -1) {
                GenericResponse res = new GenericResponse(false, "No Registered Student");
                return res;
                //throw new NoStudentRegisteredException(courseid);
            }

            GenericResponse res = new GenericResponse(true, "Grade assigned!");
            return res;

        } catch (Exception se) {
            GenericResponse res = new GenericResponse(false, "Error Occured!");
            return res;
            //throw new GradeNotAddedException();
        }
//        catch (CourseNotAssignedToProfException e) {
//            throw new RuntimeException(e);
//        } catch (NoStudentRegisteredException e) {
//            throw new RuntimeException(e);
//        }

    }
}
