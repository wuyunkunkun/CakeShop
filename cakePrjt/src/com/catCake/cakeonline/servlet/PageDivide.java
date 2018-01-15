package com.catCake.cakeonline.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.catCake.cakeonline.cake.dao.cakeDaoImpl;
import com.catCake.cakeonline.entity.Cake;

/**
 * Servlet implementation class PageDivide
 */
@WebServlet("/PageDivide")
public class PageDivide extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageDivide() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 获取图书列表并存入session
				//获取图书列表
				List<Cake> list = new cakeDaoImpl().findAll();
				//获取session对象
				HttpSession session = request.getSession();
				//把图书列表存入session
				session.setAttribute("list", list);
				//2. 设置页码数量（pageCount）
				int pageCount = 3;
				session.setAttribute("pageCount", pageCount);
				//3. 设置当前页码
				int pageIndex = 0; //记录当前页码
				if(null == request.getParameter("pageIndex") ||
						Integer.parseInt(request.getParameter("pageIndex"))<0) {
					pageIndex = 1;
				} else {
					pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
				}
				session.setAttribute("pageIndex", pageIndex);
				request.getRequestDispatcher("product.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
