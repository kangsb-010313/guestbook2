package com.javaex.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gbc")
public class GuestbookController extends HttpServlet {
	
	//필드
	private static final long serialVersionUID = 1L;
       
	//생성자 --> 생략
	
	//메소드 gs
	
	//메소드 일반

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("GuestbookController");
		
		//action
		String action = request.getParameter("action");
		System.out.println(action); //업무구분
		
		if("list".equals(action)) {//리스트
			System.out.println("리스트");
			
			//GuestbookDAO guestbookDAO = new GuestbookDAO();
			//List<GuestbookVO> guestbookList = guestbookDAO.guestbookSelect();
			
		}else if("wform".equals(action)){//등록폼
			System.out.println("등록폼");
			
		}else if("write".equals(action)) {//등록(확인버튼)
			System.out.println("등록");
			
		}else if("dform".equals(action)){//삭제폼
			System.out.println("삭제폼");
			
		}else if("delete".equals(action)) {//삭제
			System.out.println("삭제");
			
		}
		
		
		
		
		
		
	
	}//doGet

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
