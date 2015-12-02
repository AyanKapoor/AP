package RishiApp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RishiiMain
 */
@WebServlet("/RishiiMain")
public class RishiMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RishiMain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html><body><form method='post'><table>");
		writer.println("<h1>Application Form</h1>");
		writer.println("<tr><td>Email*</td>");
		writer.println("<td><textarea name='emmail'cols='40' rows='1'></textarea></td>");
		
		writer.println("<tr><td>Name*</td>");
		writer.println("<td><textarea name = 'name' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Enrollment Number*</td>");
		writer.println("<td><textarea name = 'enroll' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Address of Correspondance*</td>");
		writer.println("<td><textarea name = 'add_co' cols = '40' rows = '3'></textarea></td>");
		
		writer.println("<tr><td>Mobile*</td>");
		writer.println("<td><textarea name = 'mobile' cols = '40' rows = '1'></textarea></td>");
		
		
		writer.println("<tr><td>Phd Stream*</td>");
		writer.println("<td><input type=\"radio\" name=\"phdStrm\" value=\"Computer Science\">Computer Science");
		writer.println("<input type=\"radio\" name=\"phdStrm\" value=\"Electronics and Communication\">Electronics and Communication");
		writer.println("<input type=\"radio\" name=\"phdStrm\" value=\"Computational Biology\">Computational Biology</td></tr>");
		
		writer.println("<tr><td>PhD Area Preference 1*</td><td><select name=\"area1\"><option value=\"Artificial Intelligence and Robotics - CSE\">Artificial Intelligence and Robotics - CSE</option> <option value=\"Compilers - CSE\">Compilers - CSE</option><option value=\"Computer Architecture and Systems Design - CSE\">Computer Architecture and Systems Design - CSE</option><option value=\"Wireless Networks - CSE\">Computer Architecture and Systems Design - CSE</option></select></td></tr>");
		writer.println("<tr><td>PhD Area Preference 2*</td><td><select name=\"area2\"><option value=\"\">All</option> <option value=\"SC\">SC</option><option value=\"ST\">ST</option><option value=\"General\">General</option></select></td></tr>");
		writer.println("<tr><td>PhD Area Preference 3*</td><td><select name=\"area3\"><option value=\"All\">All</option> <option value=\"SC\">SC</option><option value=\"ST\">ST</option><option value=\"General\">General</option></select></td></tr>");
		
		writer.println("<tr><td>Gender*</td>");
		writer.println("<td><input type=\"radio\" name=\"gender\" value=\"Male\">Male");
		writer.println("<input type=\"radio\" name=\"gender\" value=\"Female\">Female</td></tr>");
		
		writer.println("<tr><td>Category*</td>");
		writer.println("<td><input type=\"radio\" name=\"category\" value=\"General\">General");
		writer.println("<input type=\"radio\" name=\"category\" value=\"SC\">SC");
		writer.println("<input type=\"radio\" name=\"category\" value=\"ST\">ST");
		writer.println("<input type=\"radio\" name=\"category\" value=\"OBC\">OBC</td></tr>");
		
		writer.println("<tr><td>Physically Disabled*</td>");
		writer.println("<td><input type=\"radio\" name=\"phydis\" value=\"Yes\">Yes");
		writer.println("<input type=\"radio\" name=\"phydis\" value=\"No\">No</td></tr>");
		
		//DOB
		writer.println("<tr><td>Date of Birth</td><td><input type=\"date\" name=\"dob\"></td></tr>");
		
		writer.println("<tr><td>Children/War Widows of Defence Personnel killed/Disabled in Action*</td>");
		writer.println("<td><input type=\"radio\" name=\"war\" value=\"Yes\">Yes");
		writer.println("<input type=\"radio\" name=\"war\" value=\"No\">No</td></tr>");
		
		writer.println("<tr><td>Father's Name*</td>");
		writer.println("<td><textarea name = 'father' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Nationality*</td><td><select name=\"nation\"><option value=\"Indian\">Indian</option> <option value=\"American\">American</option><option value=\"German\">German</option><option value=\"Italian\">Italian</option></select></td></tr>");
		
		writer.println("<tr><td>Permanent Address*</td>");
		writer.println("<td><textarea name = 'add_per' cols = '40' rows = '3'></textarea></td>");
		
		writer.println("<tr><td>Pincode*</td>");
		writer.println("<td><textarea name = 'pin' cols = '40' rows = '1'></textarea></td>");
		
		//Schooling Information
		
		writer.println("<tr><td>Xth Board*</td>");
		writer.println("<td><textarea name = 'xboard' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Xth Marks*</td>");
		writer.println("<td><textarea name = 'xmarks' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Year of Passing Xth*</td><td><select name=\"yopx\"><option value=\"2007\">2007</option> <option value=\"2008\">2008</option><option value=\"2009\">2009</option><option value=\"2010\">2010</option></select></td></tr>");
		
		writer.println("<tr><td>XIIth Board*</td>");
		writer.println("<td><textarea name = 'x2board' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>XIIth Marks*</td>");
		writer.println("<td><textarea name = 'x2marks' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Year of Passing XIIth*</td><td><select name=\"yop2x\"><option value=\"2007\">2007</option> <option value=\"2008\">2008</option><option value=\"2009\">2009</option><option value=\"2010\">2010</option></select></td></tr>");
		
		//Graduation Information
		
		writer.println("<tr><td>Degree*</td>");
		writer.println("<td><textarea name = 'degree' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Department/Discipline*</td>");
		writer.println("<td><textarea name = 'depart' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Name of College*</td>");
		writer.println("<td><textarea name = 'nameclg' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Name of University*</td>");
		writer.println("<td><textarea name = 'nameuniv' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>City*</td>");
		writer.println("<td><textarea name = 'city' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>State*</td><td><select name=\"state\"><option value=\"Delhi\">Delhi</option> <option value=\"Maharashtra\">Maharashtra</option><option value=\"Gujrat\">Gujrat</option><option value=\"Punjab\">Punjab</option></select></td></tr>");
		
		writer.println("<tr><td>Year of Graduation*</td><td><select name=\"yog\"><option value=\"2007\">2007</option> <option value=\"2008\">2008</option><option value=\"2009\">2009</option><option value=\"2010\">2010</option></select></td></tr>");
		
		writer.println("<tr><td>CGPA or Marks ?*</td>");
		writer.println("<td><input type=\"radio\" name=\"cgpa\" value=\"CGPA\">CGPA");
		writer.println("<br>");
		writer.println("<textarea name = 'grad_marks' cols = '20' rows = '1'></textarea>");
		writer.println("  /  ");
		writer.println("<select name=\"gradcgpadrop\"><option value=\"4\">4</option><option value=\"10\">10</option></select>");
		writer.println("<br>");
		writer.println("<td><input type=\"radio\" name=\"cgpa\" value=\"Marks\">Marks");
		writer.println("<textarea name = 'grad_marks' cols = '20' rows = '1'></textarea></td></tr>");
		
		writer.println("<tr><td><input type = \"checkbox\" name = ece_phd value = \"Yes\">Are You Applying For ECE PhD ?</td></tr>");
	
		writer.println("<tr><td>You are required to fill 4 subjects if you are an undergraduate, otherwise you only need to fill 3</tr></td>");
		
		writer.println("<tr><td>Preference 1*</td><td><select name=\"ecepref1\"><option value=\"Artificial Intelligence and Robotics - CSE\">Artificial Intelligence and Robotics - CSE</option> <option value=\"Compilers - CSE\">Compilers - CSE</option><option value=\"Computer Architecture and Systems Design - CSE\">Computer Architecture and Systems Design - CSE</option><option value=\"Wireless Networks - CSE\">Computer Architecture and Systems Design - CSE</option></select></td></tr>");
		writer.println("<tr><td>Preference 2*</td><td><select name=\"ecepref2\"><option value=\"\">All</option> <option value=\"SC\">SC</option><option value=\"ST\">ST</option><option value=\"General\">General</option></select></td></tr>");
		writer.println("<tr><td>Preference 3*</td><td><select name=\"ecepref3\"><option value=\"All\">All</option> <option value=\"SC\">SC</option><option value=\"ST\">ST</option><option value=\"General\">General</option></select></td></tr>");
		writer.println("<tr><td>Preference 4*</td><td><select name=\"ecepref4\"><option value=\"All\">All</option> <option value=\"SC\">SC</option><option value=\"ST\">ST</option><option value=\"General\">General</option></select></td></tr>");
	
		
		writer.println("<tr><td><input type = \"checkbox\" name = 'complpg' value = \"Yes\">Have You Completed Your Post Graduation ?</td></tr>");
		writer.println("<br>");
		writer.println("<tr><td>Post Graduation Information :</td></tr>");
		writer.println("<br>");
		
		writer.println("<tr><td>Name of College*</td>");
		writer.println("<td><textarea name = 'pgnameclg' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>City*</td>");
		writer.println("<td><textarea name = 'pgcity' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>State*</td><td><select name=\"pgstate\"><option value=\"Delhi\">Delhi</option> <option value=\"Maharashtra\">Maharashtra</option><option value=\"Gujrat\">Gujrat</option><option value=\"Punjab\">Punjab</option></select></td></tr>");
		
		writer.println("<tr><td>Department/Discipline*</td>");
		writer.println("<td><textarea name = 'pgdepart' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Degree*</td>");
		writer.println("<td><textarea name = 'pgdegree' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Thesis Title*</td>");
		writer.println("<td><textarea name = 'thesis' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Year of Post-Graduation*</td><td><select name=\"yopg\"><option value=\"2007\">2007</option> <option value=\"2008\">2008</option><option value=\"2009\">2009</option><option value=\"2010\">2010</option></select></td></tr>");
		
		writer.println("<tr><td>CGPA or Marks ?*</td>");
		writer.println("<td><input type=\"radio\" name=\"cgpa\" value=\"CGPA\">CGPA");
		writer.println("<br>");
		writer.println("<textarea name = 'pg_marks' cols = '20' rows = '1'></textarea>");
		writer.println("  /  ");
		writer.println("<select name=\"pgcgpadrop\"><option value=\"4\">4</option><option value=\"10\">10</option></select>");
		writer.println("<br>");
		writer.println("<td><input type=\"radio\" name=\"cgpa\" value=\"Marks\">Marks");
		writer.println("<textarea name = 'pg_marks' cols = '20' rows = '1'></textarea>");
		
		
		writer.println("<tr><td><input type = \"checkbox\" name = 'other' value = \"Yes\">Other Academic Degrees ?</td></tr>");
		writer.println("<br>");
		writer.println("<tr><td>Other Academic Degrees :</td></tr>");
		writer.println("<br>");
		
		writer.println("<tr><td>Exam Name*</td>");
		writer.println("<td><textarea name = 'othername' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Subject*</td>");
		writer.println("<td><textarea name = 'othersubject' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Year*</td><td><select name=\"otheryear\"><option value=\"2007\">2007</option> <option value=\"2008\">2008</option><option value=\"2009\">2009</option><option value=\"2010\">2010</option></select></td></tr>");
		
		writer.println("<tr><td>Score*</td>");
		writer.println("<td><textarea name = 'otherscore' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Rank*</td>");
		writer.println("<td><textarea name = 'otherrank' cols = '40' rows = '1'></textarea></td>");
		
		
		writer.println("<tr><td><input type = \"checkbox\" name = 'gate' value = \"Yes\">Taken GATE Exam ?</td></tr>");
		//writer.println("<br>");
		writer.println("<tr><td>GATE Details :</td></tr>");
		//writer.println("<br>");
		
		writer.println("<tr><td>Area*</td>");
		writer.println("<td><textarea name = 'gatearea' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Year of Graduation*</td><td><select name=\"yog_gate\"><option value=\"2007\">2007</option> <option value=\"2008\">2008</option><option value=\"2009\">2009</option><option value=\"2010\">2010</option></select></td></tr>");
		
		writer.println("<tr><td>Marks(out of 100)</td>");
		writer.println("<td><textarea name = 'gatemarks' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Score</td>");
		writer.println("<td><textarea name = 'gatescore' cols = '40' rows = '1'></textarea></td>");
		
		writer.println("<tr><td>Rank</td>");
		writer.println("<td><textarea name = 'gaterank' cols = '40' rows = '1'></textarea></td>");
		
		
		//Achievements 
		
		writer.println("<tr><td>Achievements(Other information like medals, etc)</td>");
		writer.println("<td><textarea name = 'achieve' cols = '40' rows = '1'></textarea></td>");
		writer.println("<tr><td>Import CV</td><td><input type=\"file\" name=\"abc\">");
		writer.println("<tr><td>Import Statement of Purpose</td><td><input type=\"file\" name=\"xyz\">");
		writer.println("<tr><td><input type=\"submit\" value=\"submit\"></td></tr>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int valid=1;
		PrintWriter admission_file = new PrintWriter(new FileWriter("/Users/ayankapoor/Downloads/RishiProject22/src/Admission.txt", true));
		PrintWriter writer=response.getWriter();
		if(request.getParameter("emmail").equals("") || request.getParameter("name").equals("") || request.getParameter("enroll").equals("") || request.getParameter("add_co").equals("") || request.getParameter("mobile").equals("") || request.getParameter("emmail").equals("") || request.getParameter("dob").equals("") || request.getParameter("father").equals("") || request.getParameter("add_per").equals("") || request.getParameter("pin").equals("") || request.getParameter("xmarks").equals("") || request.getParameter("xboard").equals("") || request.getParameter("x2board").equals("") || request.getParameter("x2marks").equals("") || request.getParameter("degree").equals("") || request.getParameter("depart").equals("") || request.getParameter("nameclg").equals("") || request.getParameter("nameuniv").equals("") || request.getParameter("city").equals(""))
		{
			valid=0;
		}
		else{
		for (int i = 0; i < request.getParameter("mobile").length(); i++) 
        {
          if (!Character.isDigit(request.getParameter("mobile").charAt(i)))
            valid = 0;
        }
		for (int i = 0; i < request.getParameter("pin").length(); i++) 
        {
          if (!Character.isDigit(request.getParameter("pin").charAt(i)))
            valid = 0;
        }
		for (int i = 0; i < request.getParameter("xmarks").length(); i++) 
        {
          if (!Character.isDigit(request.getParameter("xmarks").charAt(i)))
            valid = 0;
        }
		for (int i = 0; i < request.getParameter("x2marks").length(); i++) 
        {
          if (!Character.isDigit(request.getParameter("x2marks").charAt(i)))
            valid = 0;
        }
		for (int i = 0; i < request.getParameter("grad_marks").length(); i++) 
        {
          if (!Character.isDigit(request.getParameter("grad_marks").charAt(i)))
            valid = 0;
        }
		for (int i = 0; i < request.getParameter("pg_marks").length(); i++) 
        {
          if (!Character.isDigit(request.getParameter("pg_marks").charAt(i)))
            valid = 0;
        }
		for (int i = 0; i < request.getParameter("otherscore").length(); i++) 
        {
          if (!Character.isDigit(request.getParameter("otherscore").charAt(i)))
            valid = 0;
        }
		for (int i = 0; i < request.getParameter("otherrank").length(); i++) 
        {
            if (!Character.isDigit(request.getParameter("otherrank").charAt(i)))
              valid = 0;
        }
		for (int i = 0; i < request.getParameter("gatemarks").length(); i++) 
        {
          if (!Character.isDigit(request.getParameter("gatemarks").charAt(i)))
            valid = 0;
        }
		for (int i = 0; i < request.getParameter("gatescore").length(); i++) 
        {
          if (!Character.isDigit(request.getParameter("gatescore").charAt(i)))
            valid = 0;
        }
		for (int i = 0; i < request.getParameter("gaterank").length(); i++) 
        {
          if (!Character.isDigit(request.getParameter("gaterank").charAt(i)))
            valid = 0;
        }
		
		//if ((Integer.parseInt(request.getParameter("xmarks")) > 100) || (Integer.parseInt(request.getParameter("x2marks")) > 100) || (Integer.parseInt(request.getParameter("xmarks")) < 0) || (Integer.parseInt(request.getParameter("x2marks")) < 0) || (Integer.parseInt(request.getParameter("otherscore")) < 0) || (Integer.parseInt(request.getParameter("otherscore")) > 100) || (Integer.parseInt(request.getParameter("otherrank")) < 0) || (Integer.parseInt(request.getParameter("gatemarks")) < 0) || (Integer.parseInt(request.getParameter("gatemarks")) > 100) || (Integer.parseInt(request.getParameter("gatescore")) < 0) || (Integer.parseInt(request.getParameter("gaterank")) < 0))
		//{
		//	valid = 0;
		//}
		if (request.getParameter("mobile").length() != 10)
		{
			valid = 0;
		}}
		if(valid==0)
		{
			writer.println("Fill the form correctly");
		}
		else{
			admission_file.println(request.getParameter("emmail") +";"+ request.getParameter("name") +";"+ request.getParameter("enroll") +";"+ request.getParameter("add_co") +";"+ request.getParameter("mobile") +";"+ request.getParameter("phdStrm") +";"+ request.getParameter("area1") +";"+ request.getParameter("area2") +";"+ request.getParameter("area3") +";"+ request.getParameter("gender") +";"+ request.getParameter("category") +";"+ request.getParameter("phydis") +";"+ request.getParameter("dob") +";"+ request.getParameter("war") +";"+ request.getParameter("father") +";"+ request.getParameter("nation") +";"+ request.getParameter("add_per") +";"+ request.getParameter("pin") +";"+ request.getParameter("xboard") +";"+ request.getParameter("xmarks") +";"+ request.getParameter("yopx") +";"+ request.getParameter("x2board") +";"+ request.getParameter("x2marks") +";"+ request.getParameter("yopx2") +";"+ request.getParameter("degree") +";"+ request.getParameter("depart") +";"+ request.getParameter("nameclg") +";"+ request.getParameter("nameuniv") +";"+ request.getParameter("city") +";"+ request.getParameter("state") +";"+ request.getParameter("yog") +";"+ request.getParameter("grad_marks") +";"+ request.getParameter("ecepref1") +";"+ request.getParameter("ecepref2") +";"+ request.getParameter("ecepref3") +";"+ request.getParameter("ecepref4") +";"+ request.getParameter("pgnameclg") +";"+ request.getParameter("pgcity") +";"+ request.getParameter("pgstate") +";"+ request.getParameter("pgdegree") +";"+ request.getParameter("pgdepart") +";"+ request.getParameter("thesis") +";"+ request.getParameter("yopg") +";"+ request.getParameter("pg_marks") +";"+ request.getParameter("othername") +";"+ request.getParameter("othersubject") +";"+ request.getParameter("otheryear") +";"+ request.getParameter("otherscore") +";"+ request.getParameter("otherrank") +";"+ request.getParameter("gatearea") +";"+ request.getParameter("yog_gate") +";"+ request.getParameter("gatemarks") +";"+ request.getParameter("gatescore") +";"+ request.getParameter("gaterank")+";"+request.getParameter("achieve")+";2015-12-02");
		}
		admission_file.close();
	}

}
