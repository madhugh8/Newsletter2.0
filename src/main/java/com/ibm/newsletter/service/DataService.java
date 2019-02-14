package com.ibm.newsletter.service;

import java.util.List;

import com.ibm.newsletter.dto.Data;

public interface DataService {
	
	public List<Data> getDatabyIssueNumberAndModuleId(int moduleId);
	
	public List<Data> saveData(List<Data> data);
	
	

}
