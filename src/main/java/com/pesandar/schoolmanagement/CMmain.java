package com.pesandar.schoolmanagement;

import java.util.ArrayList;
import java.util.List;

import com.pesandar.schoolmanagement.model.dao.SchoolManagementDao;
import com.pesandar.schoolmanagement.model.entities.SchoolManagement;

public class CMmain {

	public static void main(String[] args) {
		SchoolManagementDao sdao1=new SchoolManagementDao();
		sdao1.getAllSchools().stream().map(SchoolManagement::getSchoolfounder).forEach(System.out::println);
		SchoolManagement schoolmanagement1=new SchoolManagement();
		schoolmanagement1.setId(7);
		schoolmanagement1.setSchoolfounder("PE SanDar");
		schoolmanagement1.setSchoolname("Winner");
		schoolmanagement1.setSchooladdress("Shwe Taung Kyar");
		schoolmanagement1.setSchoolphno("09786820265");
		
		
		SchoolManagementDao sdao2=new SchoolManagementDao();
		sdao2.insertNextData(schoolmanagement1);

	}

}
