package com.mybatis.join.vo;

import lombok.Data;

@Data
public class JoinVO2 {
	private EmployeeVO2 emp1; 
	private DepartmentVO2 dept1;
	private JobVO jobJ;
	private LocVO locJ;
	
	public JoinVO2 () {}
	
	public JoinVO2(EmployeeVO2 emp1, DepartmentVO2 dept1, JobVO jobJ, LocVO locJ) {
		super();
		this.emp1 = emp1;
		this.dept1 = dept1;
		this.jobJ=jobJ;
		this.locJ=locJ;
	}
}
