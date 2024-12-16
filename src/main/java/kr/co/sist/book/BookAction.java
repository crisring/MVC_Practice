package kr.co.sist.book;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.action.Action;

public class BookAction implements Action {

	private String moveURL;
	private boolean forwardFlag;

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BookService bs = new BookService();
		List<String> list = bs.bookList(); // JSP로 보내야함 scope(request, session, page, application)
		// request를 사용하면 forward에서 넘어온 값을 사용 가능
		request.setAttribute("bookList", list);
		moveURL = "book/book_list.jsp";
		forwardFlag = true;

		/*
		 * HttpSession session = request.getSession(); // 모든 페이지 사용
		 * session.setAttribute("bookList", list);
		 * 
		 * ServletContext application = request.getServletContext(); // 모든 페이지에서 모든 접속자가
		 * 하나의 값을 가지고 사용하게 한다. application.setAttribute("bookList", list);
		 */
	}

	@Override
	public String moveURL() {
		// TODO Auto-generated method stub
		return moveURL;
	}

	@Override
	public boolean isForward() {
		// TODO Auto-generated method stub
		return forwardFlag;
	}

}
