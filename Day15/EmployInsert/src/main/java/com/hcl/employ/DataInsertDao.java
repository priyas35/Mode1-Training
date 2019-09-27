package com.hcl.employ;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataInsertDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insertEmploy(){
		int empno,basic;
		String name,dept,desig;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No ");
		empno=Integer.parseInt(sc.nextLine());
		System.out.println("name of the employ");
		name=sc.nextLine();
		System.out.println("department ");
		dept=sc.nextLine();
		System.out.println("designation ");
		desig=sc.nextLine();
		System.out.println("basic ");
		basic=Integer.parseInt(sc.nextLine());
		String cmd="insert into employ values(?,?,?,?,?)";
		jdbcTemplate.update(cmd,new Object[]{
			empno,
			name,
			dept,
			desig,
			basic
			
		});
		
	
	}
}
