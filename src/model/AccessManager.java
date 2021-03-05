package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.Access;
import dao.Database;


public class AccessManager
{
	public ArrayList<student> getstudents() throws Exception
	{
	ArrayList<student> studentList = new ArrayList<student>();
	Database db = new Database();
	Connection con = db.getConnection();
	Access access = new Access();
	studentList = access.getstudents(con);
	return studentList;
	}
}
