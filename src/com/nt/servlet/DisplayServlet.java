package com.nt.servlet;
import java.io.*;
import java.util.Arrays;

import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	String name=null,gender=null,ms=null,addrs=null,qlfy=null ,crs[]=null,hb[]=null;
	int age=0;
	PrintWriter pw=null;
	pw=res.getWriter();
	res.setContentType("text/html");
	name=req.getParameter("tname");
	age=Integer.parseInt(req.getParameter("tage"));
	gender=req.getParameter("gen");
	ms=req.getParameter("ms");
	addrs=req.getParameter("taddres");
	qlfy=req.getParameter("qlfy");
	crs =req.getParameterValues("crs");
	hb =req.getParameterValues("hb");
	if(gender.equalsIgnoreCase("M"))
	{
		if(age<=5)
		pw.println(name+"u r baby boy");
		else if(age<=12)
			pw.println(name+"u r small boy");
		else if(age<=19)
			pw.println(name+"u r teenger boy");
		else if(age<=35)
			pw.println(name+"u r young man");
		else if(age<=50)
			pw.println(name+"u r middle aged man");
		else
			pw.println(name+" u r Buddha");
	}
	else if(gender.equalsIgnoreCase("F"))
	{
		if(age<=5)
			pw.println(name+"u r baby girl");
			else if(age<=12)
				pw.println(name+"u r small girl");
			else if(age<=19)
				pw.println(name+"u r teenger girl");
			else if(age<=35)
				pw.println(name+"u r young woman");
			else if(age<=50)
				pw.println(name+"u r middle aged woman");
			else
				pw.println(name+" ur Budiya");
	}
	else {
		pw.println("<br><b>Mrs."+name+"u r old");
	}
	pw.println("<br>name="+name);
	pw.println("<br>age="+age);
	pw.println("<br>Gender="+gender);
	pw.println("<br>Marital Status="+ms);
	pw.println("<br>Address="+addrs);
	pw.println("<br>Qualification="+qlfy);
	pw.println("<br>Course"+Arrays.toString(crs));
	pw.println("<br>Hobbies:"+Arrays.toString(hb));
	 pw.println("<a href='form.html'>home</a>");
		}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		doGet(req,res);
	}
	}
		