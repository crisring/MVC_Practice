package kr.co.sist.redirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.action.Action;

public class RedirectAction implements Action {

	private String moveURL;
	private boolean forwardFlag;

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Forward는 URI를 사용, redirect는 URL을 사용
		// ridirect는 URL을 사용 - HTML,JSP 모두 가능
		moveURL = "http://192.168.10.219/MVC_prj/index.html";
		forwardFlag = false;
	}

	@Override
	public String moveURL() {
		return moveURL;
	}

	@Override
	public boolean isForward() {
		return forwardFlag;
	}

}
