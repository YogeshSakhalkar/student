package webService;


import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import model.AccessManager;
import model.student;

@Path("/studentService")
public class StudentService
	{
	@GET
	@Path("/students")
	@Produces("application/json")
	public String students()
		{
		String students = null;
		ArrayList<student> studentList = new ArrayList<student>();
		try
			{
			studentList = new AccessManager().getstudents();
			Gson gson = new Gson();
			students = gson.toJson(studentList);
			} catch (Exception e)
			{
			e.printStackTrace();
			}
			return students;
		}
}
