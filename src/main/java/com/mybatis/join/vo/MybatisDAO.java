package com.mybatis.join.vo;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis; 
	
	public List<JoinVO> selectListJoin (JoinVO vo) {
		System.out.println("selectListJoin() �޼ҵ� ȣ�� ");
		return mybatis.selectList("join.selectListJoin", vo); 
	}
	
	public List<EnD_VO> selectListJoin2 (EnD_VO vo) {
		System.out.println("selectListJoin() �޼ҵ� ȣ�� ");
		return mybatis.selectList("join.selectListJoin2", vo); 
	}
	
	public List<JoinVO2> selectListJoin3 (JoinVO2 vo) {
		System.out.println("selectListJoin() �޼ҵ� ȣ�� ");
		return mybatis.selectList("join.selectListJoin3", vo); 
	}
	
	public List<AllJoinVO> selectListJoin4 (AllJoinVO vo) {
		System.out.println("selectListJoin() �޼ҵ� ȣ�� ");
		return mybatis.selectList("join.selectListJoin4", vo); 
	}
}
