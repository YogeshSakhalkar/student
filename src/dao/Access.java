package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.student;

public class Access
{
	public ArrayList<student> getstudents(Connection con) throws SQLException
	{
	ArrayList<student> studentList = new ArrayList<student>();
	PreparedStatement stmt = con.prepareStatement("SELECT * FROM student");
	ResultSet rs = stmt.executeQuery();
	try
	{
	while(rs.next())
	{
	student studentObj = new student();
	studentObj.setId(rs.getInt("id"));
	studentObj.setName(rs.getString("name"));
	studentObj.setDob(rs.getString("dob"));
	studentObj.setDoj(rs.getString("doj"));
	studentList.add(studentObj);
	}
	} catch (SQLException e)
	{
	e.printStackTrace();
	}
	return studentList;
	
	}


}
