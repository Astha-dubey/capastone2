package com.ServletGroup;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dynamicCartServlet")
public class dynamicCart extends HttpServlet 
{
	private static final long serialVersionUID = -688557614474425351L;
	static String arr[]=new String[20];
	static int i;
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		    PrintWriter out=res.getWriter();
			Enumeration<String> pn=req.getParameterNames();
            while(pn.hasMoreElements())
            {
            	arr[i]=pn.nextElement();
            	i++;
            }
            for(int i=0;i<arr.length;i++)
            {
            	out.println(arr[i]);
            }
		
	}

}
