package kr.co.sist.dept;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.action.Action;

public class DeptAction implements Action {

	private String moveURL;
	private boolean forwardFlag;

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		DeptService ds = DeptService.getInstance();
		List<DeptDomain> list = ds.selectAllDept();

		// 업무처리한 결과를 사용자에게 보여주기 위해 적절한 scope객체에 할당한다.
		request.setAttribute("deptList", list);

		// view페이지 설정
		moveURL = "dept/dept_list.jsp";
		forwardFlag = true;

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
