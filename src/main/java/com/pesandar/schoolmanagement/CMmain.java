package com.pesandar.schoolmanagement;

import com.pesandar.schoolmanagement.model.dao.SchoolManagementDao;
import com.pesandar.schoolmanagement.model.entities.SchoolManagement;

public class CMmain {

	public static void main(String[] args) {
		SchoolManagementDao sdao=new SchoolManagementDao();
		sdao.getAllSchools().stream().map(SchoolManagement::getSchoolfounder).forEach(System.out::println);

	}

}
