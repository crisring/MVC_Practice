package kr.co.sist.dept;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.co.sist.dao.MyBatisHandler;

public class DeptDAO {

	private static DeptDAO dDAO;

	private DeptDAO() {
	}

	public static DeptDAO getInstance() {

		if (dDAO == null) {
			dDAO = new DeptDAO();
		}
		return dDAO;
	}// getInstance

	public List<DeptDomain> selectAllDept() throws PersistenceException {

		List<DeptDomain> list = null;

		MyBatisHandler mbh = MyBatisHandler.getInstance();
		SqlSession handler = mbh.getHandler();

		try {
			list = handler.selectList("kr.co.sist.dept.selectAllDept");
		} finally {
			mbh.closeHandler(handler);
		}

		return list;
	}// selectAllDept

}
