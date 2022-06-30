package com.mybatis.join.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
public class EmployeeVO2 {
	
	private int employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private Date start_date;
	private String job_id;
	private int salary;
	private int commission_pct;
	private int manager_id;
	private int department_id;
    
    public EmployeeVO2() {}

}
