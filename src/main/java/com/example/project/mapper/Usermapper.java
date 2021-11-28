package com.example.project.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.project.model.User;

@Mapper
public interface Usermapper {
	
	// 회원정보
	@Select("SELECT * FROM user WHERE id=#{user.id}")
    User searchUser(@Param("user") User user);
	
	// 회원가입
	@Insert("INSERT INTO user VALUES(#{user.id}, #{user.pw}, #{user.name}, #{user.phonenumber})")
	int insertUser(@Param("user") User user);

	// 로그인
	@Select("SELECT * FROM user WHERE id=#{user.id} and pw=#{user.pw}")
	String loginUser(@Param("user") User user);

	// ID중복검사
	@Select("SELECT * FROM user WHERE id=#{user.id}")
	String checkId(@Param("user") User user);
	
	// 회원정보 수정
	@Update("UPDATE user set name=#{user.name}, address=#{user.address}, phonenumber=#{user.phonenumber} WHERE id=#{user.id}")
	boolean editUser(@Param("user") User user);
	
	// 비밀번호 찾기
	@Update("UPDATE user set pw=#{user.pw} WHERE id=#{user.id}")
	boolean findPw(@Param("user") User user);
	
	// 아이디 찾기
	@Select("SELECT id FROM user WHERE name=#{user.name} and phonenumber=#{user.phonenumber}")
	String findId(@Param("user") User user);
	
//	//이름 변경
//	@Update("UPDATE user set name=#{user.name} WHERE id=#{user.id}")
//	boolean editName(@Param("user") User user);
//	 #{user.address}, #{user.email},
//	//주소 변경
//	@Update("UPDATE user set address=#{user.address} WHERE id=#{user.id}")
//	boolean editAddress(@Param("user") User user);
//	
//	//이메일 변경
//	@Update("UPDATE user set email=#{user.email} WHERE id=#{user.id}")
//	boolean editEmail(@Param("user") User user);
//	
//	//폰번호 변경
//	@Update("UPDATE user set phonenumber=#{user.phonenumber} WHERE id=#{user.id}")
//	boolean editPhonenumber(@Param("user") User user);
}
