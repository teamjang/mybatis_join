package com.mybatis.join.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class JobVO {
	private int employee_id;
	private Date start_date;
	private Date end_date;
	private String job_id;
	private int department_id;
	
	public JobVO() {}
}


