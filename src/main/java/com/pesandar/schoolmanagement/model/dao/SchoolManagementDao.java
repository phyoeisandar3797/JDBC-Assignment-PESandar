package com.pesandar.schoolmanagement.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pesandar.schoolmanagement.ConnectionManager;
import com.pesandar.schoolmanagement.model.entities.SchoolManagement;

public class SchoolManagementDao {
	public List<SchoolManagement> getAllSchools(){
		String sql="select * from schoolmanagement";
		List<SchoolManagement> schoolList=new ArrayList<>();
		try(Connection connection=ConnectionManager.getInstance();
				Statement statement=connection.createStatement();){
			ResultSet rs=statement.executeQuery(sql);
			while (rs.next()) {
				String schoolfounder=rs.getString("schoolfounder");
				String schoolname=rs.getString("schoolname");
				String schooladdress=rs.getString("schooladdress");
				String schoolphno=rs.getString("schoolphno");
				SchoolManagement schoolmanagement=new SchoolManagement();
				schoolmanagement.setSchoolfounder(schoolfounder);
				schoolmanagement.setSchoolname(schoolname);
				schoolmanagement.setSchooladdress(schooladdress);
				schoolmanagement.setSchoolphno(schoolphno);
				schoolList.add(schoolmanagement);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}return schoolList;
		
	}
	public void insertNextData(SchoolManagement schoolmanagement1) {
		String sql="insert into schoolmanagement values(?,?,?,?,?)";
		try(Connection connection=ConnectionManager.getInstance();
			PreparedStatement prestatement=connection.prepareStatement(sql)) {
			prestatement.setInt(1,schoolmanagement1.getId());
		prestatement.setString(2,schoolmanagement1.getSchoolname());
		prestatement.setString(3,schoolmanagement1.getSchoolfounder());
		prestatement.setString(4,schoolmanagement1.getSchooladdress());
		prestatement.setString(5,schoolmanagement1.getSchoolphno());
		
		prestatement.executeUpdate(sql);
		
		} catch (Exception e) {
				e.printStackTrace();
			}
	}
}