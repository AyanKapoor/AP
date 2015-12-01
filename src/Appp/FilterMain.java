package Appp;
import Appp.Applicant;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FilterMain")
public class FilterMain extends HttpServlet 
{
	private static ArrayList<Applicant> personData = new ArrayList<Applicant>();
	public static ArrayList<Applicant> finalData = new ArrayList<Applicant>();
	private static final long serialVersionUID = 1L;
	public int value=0
			;
	
   
    public void init()
    {
    	value=0;
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		if(value==0)
		{
			try {
				personData.clear();
				finalData.clear();
				
				ShowMain(request,response);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	protected void ShowMain(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, ParseException
	{
		String csvFile= "/Users/ayankapoor/Downloads/RishiProject22/src/Admission.txt";

		BufferedReader reader=null;
		String line="";
		String cvsSplitBy=";";
		try
		{
			
			reader = new BufferedReader(new FileReader(csvFile));
			while ((line = reader.readLine()) != null)
			{
				//System.out.println(line);
				String[] country = line.split(cvsSplitBy);
				
				//System.out.println(country[30]);
	 
				personData.add(new Applicant(country[0],country[1],country[2],country[5],country[9],country[10],country[11],
						country[12],country[18],country[19],country[21],country[22],country[24],country[25],
						country[27],country[29],country[31],country[36],country[38],country[40],country[39],country[43],country[51],
						country[55]));
				//System.out.println(country[31]);
				//System.out.println(country[43]);
			}
			
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		finally 
		{
			if (reader != null) 
			{
				try {
						reader.close();
					} 
				catch (IOException e)
					{
						e.printStackTrace();
					}
				
			}
		}
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>" + "FILTER ENTRIES" + "</title></head>");
        writer.println("<body><h1>" + "FILTER ENTRIES" + "</h1>");
        writer.println("<form method='post'>");
        writer.println("<table>");
        writer.println("<tr>");
        writer.println("<td>Name</td>");
        writer.println("<td><textarea name='name' "
                + "cols='40' rows='1'></textarea></td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Email</td><td><textarea name='mail' "
                + "cols='40' rows='1'></textarea></td>");
        writer.println("</tr><tr>");
        writer.println("<td>Enrollment No</td><td><textarea name=\"enro\" "
                + "cols='40' rows='1'></textarea></td></tr>");
        
        writer.println("<tr><td>Category</td><td><select name=\"category\"><option value=\"All\">All</option> <option value=\"SC\">SC</option><option value=\"ST\">ST</option>"
        		+"<option value=\"General\">General</option></select></td></tr>");
        writer.println("<tr><td>Gender</td><td><input type=\"radio\" name=\"gender\" value=\"Male\">Male"
        				
        				+"<input type=\"radio\" name=\"gender\" value=\"Female\">Female</td></tr>");
        writer.println("<tr><td>Physically Disabled</td><td><input type=\"radio\" name=\"disabled\" value=\"Yes\">Yes"
				
				+"<input type=\"radio\" name=\"disabled\" value=\"No\">No</td></tr>");
        writer.println("<tr><td>Date of birth</td><td><input type=\"radio\" name=\"dob\" value=\"Before\">Before"
				+"<input type=\"radio\" name=\"dob\" value=\"On\">On<input type=\"radio\" name=\"dob\" value=\"After\">After</td></tr>");
       
		writer.println("<br><tr><td>Choose the date:</td><td><input type=\"date\" name=\"dateofbirth\"></td></tr>");
		writer.println("<tr><td>PhD Stream</td><td><select name=\"phdStrm\"><option value=\"All\">All</option> <option value=\"Computer Science\">Computer Science</option><option value=\"Electronics and Communication\">Electronics and Communication</option>"
        		+"<option value=\"Computational Biology\">Computational Biology</option></select></td></tr>");
		writer.println("<tr><td>Graduation Degree</td><td><select name=\"GradDegree\"><option value=\"All\">All</option> <option value=\"B.Tech\">B.Tech</option>"
        		+"</select></td></tr>");
		writer.println("<tr><td>Post Graduation Degree</td><td><select name=\"PGDegree\"><option value=\"All\">All</option> <option value=\"M.Tech\">M.Tech</option>"
        		+"</select></td></tr>");
		writer.println("<tr><td>Class X Board</td><td><select name=\"XB\"><option value=\"All\">All</option><option value=\"State Board\">State Board</option> <option value=\"CBSE\">CBSE</option><option value=\"ICSE\">ICSE</option>"
        		+"</select></td></tr>");
		writer.println("<tr><td>Class XII Board</td><td><select name=\"XIIB\"><option value=\"All\">All</option><option value=\"State Board\">State Board</option> <option value=\"CBSE\">CBSE</option><option value=\"ICSE\">ICSE</option>"
        		+"</select></td></tr>");
		writer.println("<tr><td>Graduation Dept</td><td><select name=\"GradDept\"><option value=\"All\">All</option> <option value=\"Computer Science\">Computer Science</option><option value=\"Information Technology\">Information Technology</option>"
        		+"<option value=\"Electronics and Communication\">Electronics and Communication</option></select></td></tr>");
		writer.println("<tr><td>Post Grad Dept</td><td><select name=\"PGDept\"><option value=\"All\">All</option> <option value=\"Computer Science\">Computer Science</option><option value=\"Information Technology\">Information Technology</option>"
        		+"<option value=\"Electronics and Communication\">Electronics and Communication</option></select></td></tr>");
		 writer.println("<tr><td>Graduation University</td><td><textarea name='GradUniv' "
	                + "cols='40' rows='1'></textarea></td></tr>");
		 writer.println("<tr><td>Post Graduation University</td><td><textarea name='PGUniv' "
	                + "cols='40' rows='1'></textarea></td></tr>");
		 writer.println("<tr><td>Graduation State</td><td><select name=\"GradState\"><option value=\"All\">All</option> <option value=\"Delhi\">Delhi</option><option value=\"Andhra Pradesh\">Andhra Pradesh</option>"
	        		+"<option value=\"Tamil Nadu\">Tamil Nadu</option><option value=\"Maharashtra\">Maharashtra</option><option value=\"West Bengal\">West Bengal</option</select></td></tr>");
		 writer.println("<tr><td>Post Grad State</td><td><select name=\"PGState\"><option value=\"All\">All</option> <option value=\"Delhi\">Delhi</option><option value=\"Andhra Pradesh\">Andhra Pradesh</option>"
	        		+"<option value=\"Tamil Nadu\">Tamil Nadu</option><option value=\"Maharashtra\">Maharashtra</option><option value=\"West Bengal\">West Bengal</option</select></td></tr>");
		 writer.println("<tr><td>Class X Board Percentage</td><td><input type=\"radio\" name=\"XBPercen\" value=\"Greater than\">Greater than"
					+"<input type=\"radio\" name=\"XBPercen\" value=\"Equal\">Equal<input type=\"radio\" name=\"XBPercen\" value=\"Less than\">Less than</td>"
					+ "<td><textarea name='XBPercent' cols='5' rows='1'></textarea></td></tr>");
		 writer.println("<tr><td>Class XII Board Percentage</td><td><input type=\"radio\" name=\"XIIBPercen\" value=\"Greater than\">Greater than"
					+"<input type=\"radio\" name=\"XIIBPercen\" value=\"Equal\">Equal<input type=\"radio\" name=\"XIIBPercen\" value=\"Less than\">Less than</td>"
					+ "<td><textarea name='XIIBPercent' cols='5' rows='1'></textarea></td></tr>");
		 writer.println("<tr><td>Grad Marks</td><td><input type=\"radio\" name=\"GradMark\" value=\"Greater than\">Greater than"
					+"<input type=\"radio\" name=\"GradMark\" value=\"Equal\">Equal<input type=\"radio\" name=\"GradMark\" value=\"Less than\">Less than</td>"
					+ "<td><textarea name='GradMarks' cols='5' rows='1'></textarea></td></tr>");
		 writer.println("<tr><td>Post Grad Marks</td><td><input type=\"radio\" name=\"PGMark\" value=\"Greater than\">Greater than"
					+"<input type=\"radio\" name=\"PGMark\" value=\"Equal\">Equal<input type=\"radio\" name=\"PGMark\" value=\"Less than\">Less than</td>"
					+ "<td><textarea name='PGMarks' cols='5' rows='1'></textarea></td></tr>");
		 writer.println("<tr><td>Gate Score</td><td><input type=\"radio\" name=\"ScoreGat\" value=\"Greater than\">Greater than"
					+"<input type=\"radio\" name=\"ScoreGat\" value=\"Equal\">Equal<input type=\"radio\" name=\"ScoreGat\" value=\"Less than\">Less than</td>"
					+ "<td><textarea name='ScoreGate' cols='5' rows='1'></textarea></td></tr>");
		 writer.println("<tr><td>Application from:</td><td><input type=\"date\" name=\"AppsFrom\"></td></tr>");
		 writer.println("<tr><td>Application to:</td><td><input type=\"date\" name=\"AppsTo\"></td></tr>");
		 writer.println("<tr><td><input type=\"submit\" value=\"Submit\" name=\"submitbutton\"></td></tr>");
		 
	}
	
	
       
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		int valid=1;
		if(value==0)
		{	
			for(Applicant temp:personData)
        	{
        		
        			temp.flag=1;
        			//Checking gender
        	    	String rb = null;
        	    	rb = request.getParameter("gender");
        	    	
        	    	if(rb!=null)
        	    	{
        	    		
        	    		if(!rb.equals(temp.getGender()))
            	    		temp.flag=0; 
        	    	}
        	    	
        	    	//Checking Disabled
        	    	
        	    	String rb2 = null;
        	    	rb2 = request.getParameter("disabled");
        	    	
        	    	if(rb2!=null)
        	    	{
        	    		
        	    		if(!rb2.equals(temp.getDisabled()))
            	    		temp.flag=0; 
        	    	}
        	    	//Checking DOB
        	    	
        	    	String rb3=null;
        	  
        	    	rb3=request.getParameter("dob");
        	    	if(rb3!=null && !request.getParameter("dateofbirth").equals(""))
        	    	{	
        	    		if(rb3.equals("After") && request.getParameter("dateofbirth").compareTo(temp.getDOB())>=0)
        	    			temp.flag=0;
        	    		if(rb3.equals("On") && !request.getParameter("dateofbirth").equals(temp.getDOB()))
        	    			temp.flag=0;
        	    		if(rb3.equals("Before") && request.getParameter("dateofbirth").compareTo(temp.getDOB())<=0)
        	    			temp.flag=0;
        	    	}
        	    	//Apps From
        	 
        	    	String rb4=null;
              	  
        	    	if(!request.getParameter("AppsFrom").equals("") && request.getParameter("AppsFrom").compareTo(temp.getAppsFromDate())>0)
        	    	{
        	    		temp.flag=0;
        	    	}
        	    	if(!request.getParameter("AppsTo").equals("") && request.getParameter("AppsTo").compareTo(temp.getAppsFromDate())<0)
        	    	{
        	    		temp.flag=0;
        	    	}
        	    	
        	    	
        	    	//Checking name*/
        	    	
        	    	
        	    	if(!request.getParameter("name").equals("")&&!request.getParameter("name").equals(temp.getName()))
        	    		temp.flag=0;
        	    	
        	    	if(!request.getParameter("mail").equals("")&&!request.getParameter("mail").equals(temp.getEmail()))
        	    		temp.flag=0;
        	    	
        	    	if(!request.getParameter("enro").equals("")&&!request.getParameter("enro").equals(temp.getEnrollmentNo()))
        	    		temp.flag=0;
        	    	
        	    	//System.out.println(temp.flag);
        	    	
        	    
        	    	if(!(request.getParameter("category").equals("All")))
        	    		{
        	    			
        	    			if(!(request.getParameter("category").equals(temp.getCategory())))
        	    			temp.flag=0;
        	    		}
        	    	//writer.println(temp.flag);
        	    	if(!(request.getParameter("phdStrm").equals("All")))
        	    	{if(!(request.getParameter("phdStrm").equals(temp.getPhdStream())))
        	    		temp.flag=0;}
        	    	//writer.println(temp.flag);
        	    	if(!(request.getParameter("GradDegree").equals("All")))
        	    	{if(!(request.getParameter("GradDegree").equals(temp.getGraduationDegree())))
        	    		temp.flag=0;}
        	    	
        	    	if(!(request.getParameter("PGDegree").equals("All")))
        	    	{if(!(request.getParameter("PGDegree").equals(temp.getPostGraduationDegree())))
        	    		temp.flag=0;}
        	    	//System.out.println(temp.flag);
        	    	
        	    	if(!(request.getParameter("XB").equals("All")))
        	    	{if(!(request.getParameter("XB").equals(temp.getXboard())))
        	    		temp.flag=0;}
        	    	
        	    	if(!(request.getParameter("XIIB").equals("All")))
        	    	{if(!(request.getParameter("XIIB").equals(temp.getXiiboard())))
        	    		temp.flag=0;}
        	    	
        	    	if(!(request.getParameter("GradDept").equals("All")))
        	    	{if(!(request.getParameter("GradDept").equals(temp.getGraduationDepartment())))
        	    		temp.flag=0;}
        	    	
        	    	if(!(request.getParameter("PGDept").equals("All")))
        	    	{if(!(request.getParameter("PGDept").equals(temp.getPostGraduationDepartment())))
        	    		temp.flag=0;}
        	    	
        	    	
        	    	if(!request.getParameter("GradUniv").equals("") && !request.getParameter("GradUniv").equals(temp.getGraduationUniversity()))
        	    		temp.flag=0;
        	    	//writer.println(temp.flag);
        	    	if(!request.getParameter("PGUniv").equals("") && !request.getParameter("PGUniv").equals(temp.getPostGraduationUniversity()))
        	    		temp.flag=0;
        	    	//writer.println(temp.flag);
        	    	if(!(request.getParameter("GradState").equals("All")))
        	    	{if(!(request.getParameter("GradState").equals(temp.getGraduationState())))
        	    		temp.flag=0;}
        	    	
        	    	if(!(request.getParameter("PGState").equals("All")))
        	    	{if(!(request.getParameter("PGState").equals(temp.getPostGraduationState())))
        	    		temp.flag=0;}
        	    	//writer.println(temp.flag);
        	    	//Checking for tenth board percentage
        	    	if(request.getParameter("XBPercent")!=null && request.getParameter("XBPercen")!=null)
        	    	{
        	    		int value=Integer.parseInt(request.getParameter("XBPercent"));
        	    		if(request.getParameter("XBPercen").equals("Greater than") && Integer.parseInt(temp.getXpercentage())<=value)
        	    			temp.flag=0;
        	    		if(request.getParameter("XBPercen").equals("Equal") && Integer.parseInt(temp.getXpercentage())!=value)
        	    			temp.flag=0;
        	    		if(request.getParameter("XBPercen").equals("Less than") && Integer.parseInt(temp.getXpercentage())>=value)
        	    			temp.flag=0;
        	    	}
        	    	//for twelfth board
        	    	
        	    	if(request.getParameter("XIIBPercent")!=null && request.getParameter("XIIBPercen")!=null)
        	    	{
        	    		int value=Integer.parseInt(request.getParameter("XIIBPercent"));
        	    		if(request.getParameter("XIIBPercen").equals("Greater than") && Integer.parseInt(temp.getXiipercentage())<=value)
        	    			temp.flag=0;
        	    		if(request.getParameter("XIIBPercen").equals("Equal") && Integer.parseInt(temp.getXiipercentage())!=value)
        	    			temp.flag=0;
        	    		if(request.getParameter("XIIBPercen").equals("Less than") && Integer.parseInt(temp.getXiipercentage())>=value)
        	    			temp.flag=0;
        	    	}
        	    	
        	    	//System.out.println(temp.getGateScore());
        	    	//graduation marks
        	    	if(request.getParameter("GradMarks")!=null && request.getParameter("GradMark")!=null)
        	    	{
        	    		int value=Integer.parseInt(request.getParameter("GradMarks"));
        	    		float x=Float.valueOf(temp.getGraduationPercentage());
        	    		int y=Math.round(x);
        	    		
        	    		if(request.getParameter("GradMark").equals("Greater than") && y<=value)
        	    			temp.flag=0;
        	    		if(request.getParameter("GradMark").equals("Equal") && y!=value)
        	    			temp.flag=0;
        	    		if(request.getParameter("GradMark").equals("Less than") && y>=value)
        	    			temp.flag=0;
        	    	}
        	    	
        	    	//post graduation marks
        	    	if(request.getParameter("PGMarks")!=null && request.getParameter("PGMark")!=null)
        	    	{
        	    		int value=Integer.parseInt(request.getParameter("PGMarks"));
        	    		float x=Float.valueOf(temp.getPostGraduationPercentage());
        	    		int y=Math.round(x);
        	    		
        	    		if(request.getParameter("PGMark").equals("Greater than") && y<=value)
        	    			temp.flag=0;
        	    		if(request.getParameter("PGMark").equals("Equal") && y!=value)
        	    			temp.flag=0;
        	    		if(request.getParameter("PGMark").equals("Less than") && y>=value)
        	    			temp.flag=0;
        	    	}
        	    	
        	    /*	if(!(PGMarks.getText()).equals(""))
        	    	if((!CB11.isSelected())&&Integer.parseInt(PGMarks.getText())==Float.parseFloat(temp.getPostGraduationPercentage()))
        	    		temp.flag=0;
        	    	if(!(PGMarks.getText()).equals(""))
        	    	if((!CB12.isSelected())&&Integer.parseInt(PGMarks.getText())>=Float.parseFloat(temp.getPostGraduationPercentage()))
        	    		temp.flag=0;
        	    	//Gate score check
        	    	if(!(ScoreGate.getText()).equals(""))
        	    	{if((CB13.isSelected())&&Integer.parseInt(ScoreGate.getText())<Integer.parseInt(temp.getGateScore()))
        	    		temp.flag=0;
        	    	
        	    	if((!CB14.isSelected())&&Integer.parseInt(ScoreGate.getText())==Integer.parseInt(temp.getGateScore()))
        	    		temp.flag=0;
        	    	
        	    	if((CB15.isSelected())&&Integer.parseInt(ScoreGate.getText())>Integer.parseInt(temp.getGateScore()))
        	    		temp.flag=0;
        	    	
        	    	}*/
        	    	if(request.getParameter("ScoreGate")!=null && request.getParameter("ScoreGat")!=null)
        	    	{
        	    		int value=Integer.parseInt(request.getParameter("ScoreGate"));
        	    		if(request.getParameter("ScoreGat").equals("Greater than") && Integer.parseInt(temp.getGateScore())<=value)
        	    			temp.flag=0;
        	    		if(request.getParameter("ScoreGat").equals("Equal") && Integer.parseInt(temp.getGateScore())!=value)
        	    			temp.flag=0;
        	    		if(request.getParameter("ScoreGat").equals("Less than") && Integer.parseInt(temp.getGateScore())>=value)
        	    			temp.flag=0;
        	    	}
        	    	valid=1;
        	    	if(request.getParameter("AppsFrom").compareTo(request.getParameter("AppsTo"))>0)
        	    	{
        	    		valid=0;
        	    		//writer.println("Some error");
        	    	}
        	    	
        	    	
        	    	if(temp.flag==1 && valid==1)
        	    	{
        	    		finalData.add(temp);
        	    	//	System.out.println(temp.getName());
        	    	}
        	    	
        	    	
        	    		
        	 
        	}
			if(valid==0)
			{
				writer.println("Fill the fields correctly");
			}
		//	writer.println(request.getParameter("gender"));
		//	writer.println(request.getParameter("name"));
		//	writer.println(request.getParameter("dateofbirth"));
			writer.println("<a href='?value=0'>Back</a>");
			//if(request.getParameter("name")!=null)
			//	writer.println("all cool");
			
			writer.println("<html><body><table><tr><td>Name</td><td>Enrollment number</td></tr>");
			
			for(Applicant temp:finalData)
			{
				writer.println("<tr><td>"+temp.name+"</td><td>"+temp.enrollmentNo+"</td></tr>");
			}
			writer.println("<br>");
			writer.println("Total eligible candidates are: "+finalData.size());
			writer.println("<br>");
			writer.println("</body></html>");
		}
		
	}

}
