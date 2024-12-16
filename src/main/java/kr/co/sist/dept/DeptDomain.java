package kr.co.sist.dept;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class DeptDomain {
	// deptno, dname, loc, status
	private String dname, loc, status;
	private int deptno;

}
