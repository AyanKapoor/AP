package Appp;
/*Ayan Kapoor 2014028
 * Rishi Mohon 2014087
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;



public class Applicant 
{
	public final String name;
    public final String email;
    public final String enrollmentNo;
    public final String category;
    public final String gender;
    public final String disabled;
    public final String birthday;
    public final String ApplicationFrom;
    public final String ApplicationTo;
    public final String phdStream;
    public final String graduationDegree;
    public final String postGraduationDegree;
    public final String xboard;
    public final String xiiboard;
    public final String graduationDepartment;
    public final String postGraduationDepartment;
    public final String graduationUniversity;
    public final String postGraduationUniversity;
    public final String graduationState;
    public final String postGraduationState;
    public final String xpercentage;
    public final String xiipercentage;
    public final String graduationPercentage;
    public final String postGraduationPercentage;
    public final String gateScore;
    public int flag;
    
    
    public Applicant(String a,String b,String c,String d,String e,String f,String g,String h,String i,
    		String j,String k,String l,String m,String n,String o,String p,String q,String r,String s,
    		String t,String u,String v,String w,String x) throws ParseException//This function will have arguments of details of the applicant
    {
    	//Here these arguments will be assigned to the applicant
    	this.flag=1;
    	this.email= new String(a);
    	this.name=new String(b);
    	this.enrollmentNo=new String(c);
    	this.phdStream=new String(d);
    	this.gender=new String(e);
    	this.category=new String(f);
    	this.disabled=new String(g);
    	this.birthday=new String(h);
    	this.xboard=new String(i);
    	this.ApplicationFrom=new String(x);
    	this.ApplicationTo=new String("");
    	this.xpercentage=new String(j);
    	this.xiiboard=new String(k);
    	this.xiipercentage=new String(l);
    	this.graduationDegree=new String(m);
    	this.graduationDepartment=new String(n);
    	this.graduationUniversity=new String(o);
    	this.graduationState=new String(p);
    	this.graduationPercentage=new String(q);
    	this.postGraduationUniversity=new String(r);
    	this.postGraduationState=new String(s);
    	this.postGraduationDepartment=new String(t);
    	this.postGraduationDegree=new String(u);
    	this.postGraduationPercentage=new String(v);
    	this.gateScore=new String(w);
    	
    	
    	
    			
    }
    
    public String getName(){ return name;}
    //public StringProperty getNameProperty(){return name;}
    //public StringProperty getEnrollmentProperty(){return enrollmentNo;}
    public String getEmail(){ return email;}
    public String getEnrollmentNo(){return enrollmentNo;}
    public String getCategory(){return category;}
    public String getGender(){return gender;}
    public String getDisabled(){return disabled;}
    public String getDOB(){return birthday;}
    public String getPhdStream(){return phdStream;}
    public String getGraduationDegree(){return graduationDegree;}
    public String getPostGraduationDegree(){return postGraduationDegree;}
    public String getXboard(){return xboard;}
    public String getXiiboard(){return xiiboard;}
    public String getGraduationDepartment(){return graduationDepartment;}
    public String getPostGraduationDepartment(){return postGraduationDepartment;}
    public String getGraduationUniversity(){return graduationUniversity;}
    public String getPostGraduationUniversity(){return postGraduationUniversity;}
    public String getGraduationState(){return graduationState;}
    public String getPostGraduationState(){return postGraduationState;}
    public String getXpercentage(){return xpercentage;}
    public String getXiipercentage(){return xiipercentage;}
    public String getGraduationPercentage(){return graduationPercentage;}
    public String getPostGraduationPercentage(){return postGraduationPercentage;}
    public String getGateScore(){return gateScore;}
    public String getAppsFromDate(){return ApplicationFrom;}
    public String getAppsToDate(){return ApplicationTo;}
    
    

}
