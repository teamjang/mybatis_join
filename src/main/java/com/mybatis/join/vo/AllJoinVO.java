package com.mybatis.join.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class AllJoinVO {
	
	AllJoinVO () {}

	private int employee_id  ;
	private String first_name      ;
	private String job_id        ;
	private int manager_id    ;
	private String start_date   ;
	private int salary     ;
	private int commission_pct ;
    private int department_id        ;
    private String department_name      ;
    private String location_id        ;
	private Date end_date;
	private String street_address;
	private String postal_code;
	private String city;
	private String state_province;
	private String country_id;

   
	
}
