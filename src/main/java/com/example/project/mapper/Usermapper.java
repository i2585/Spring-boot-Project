package com.example.project.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.project.model.User;

@Mapper
public interface Usermapper {
	
	// ȸ������
	@Select("SELECT * FROM user WHERE id=#{user.id}")
    User searchUser(@Param("user") User user);
	
	// ȸ������
	@Insert("INSERT INTO user VALUES(#{user.id}, #{user.pw}, #{user.name}, #{user.phonenumber})")
	int insertUser(@Param("user") User user);

	// �α���
	@Select("SELECT * FROM user WHERE id=#{user.id} and pw=#{user.pw}")
	String loginUser(@Param("user") User user);

	// ID�ߺ��˻�
	@Select("SELECT * FROM user WHERE id=#{user.id}")
	String checkId(@Param("user") User user);
	
	// ȸ������ ����
	@Update("UPDATE user set name=#{user.name}, address=#{user.address}, phonenumber=#{user.phonenumber} WHERE id=#{user.id}")
	boolean editUser(@Param("user") User user);
	
	// ��й�ȣ ã��
	@Update("UPDATE user set pw=#{user.pw} WHERE id=#{user.id}")
	boolean findPw(@Param("user") User user);
	
	// ���̵� ã��
	@Select("SELECT id FROM user WHERE name=#{user.name} and phonenumber=#{user.phonenumber}")
	String findId(@Param("user") User user);
	
//	//�̸� ����
//	@Update("UPDATE user set name=#{user.name} WHERE id=#{user.id}")
//	boolean editName(@Param("user") User user);
//	 #{user.address}, #{user.email},
//	//�ּ� ����
//	@Update("UPDATE user set address=#{user.address} WHERE id=#{user.id}")
//	boolean editAddress(@Param("user") User user);
//	
//	//�̸��� ����
//	@Update("UPDATE user set email=#{user.email} WHERE id=#{user.id}")
//	boolean editEmail(@Param("user") User user);
//	
//	//����ȣ ����
//	@Update("UPDATE user set phonenumber=#{user.phonenumber} WHERE id=#{user.id}")
//	boolean editPhonenumber(@Param("user") User user);
}
