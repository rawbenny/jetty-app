package com.ryan.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//		System.exit(1);
        ServletOutputStream out = resp.getOutputStream();
        String json = "{success:true}";
        resp.setContentType("application/json;");
        out.write(json.getBytes());
        out.flush();
        out.close();
    }
    
}
