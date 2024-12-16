package kr.co.sist.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.action.Action;
import kr.co.sist.book.BookAction;
import kr.co.sist.dept.DeptAction;
import kr.co.sist.main.MainAction;
import kr.co.sist.redirect.RedirectAction;

/**
 * 진입점 : 1. 요청에 대한 실행될 Action을 찾아서 실행하는 일 <br>
 * 2. Action이 반환하는 값들을 받아서 <br>
 * 3. JSP로 이동 <br>
 */
@SuppressWarnings("serial")
public class MainController extends HttpServlet {

	private static Map<String, Action> map = new HashMap<>();
	private String defaultURL;

	/*
	 * public void init() { }
	 */

	static {
		map.put("M001", new MainAction());
		map.put("B001", new BookAction());
		map.put("R001", new RedirectAction());
		map.put("S001", new DeptAction());

	}

	public void init() {
		ServletConfig sc = getServletConfig();

		defaultURL = sc.getInitParameter("protocol") + sc.getInitParameter("serverName")
				+ sc.getInitParameter("contextRoot");

		ServletContext sc2 = getServletContext();
		String bc = sc2.getInitParameter("bootstrap_css");
		String bj = sc2.getInitParameter("bootstrap_js");
		String jquery = sc2.getInitParameter("jquery_js");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}// doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cmd = request.getParameter("cmd"); // null

		if (cmd == null || !map.containsKey(cmd)) {
			cmd = "M001";
		}

		Action action = map.get(cmd);
		action.execute(request, response);
		String moveURL = action.moveURL();
		boolean isFlag = action.isForward();

		ServletContext application = getServletContext();
		application.setAttribute("defaultURL", defaultURL);

		movePage(request, response, moveURL, isFlag);

	}// doPost

	public void movePage(HttpServletRequest request, HttpServletResponse response, String moveURL, boolean isForward)
			throws ServletException, IOException {

		if (isForward) {
			RequestDispatcher rd = request.getRequestDispatcher(moveURL);
			rd.forward(request, response);
		} else {
			response.sendRedirect(moveURL);

		}

	}

}// class
