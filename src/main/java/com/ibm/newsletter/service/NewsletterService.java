package com.ibm.newsletter.service;

import java.util.List;

import com.ibm.newsletter.dto.Newsletter;


public interface NewsletterService {

	List<Newsletter> getNewsletterData();
	
	void saveNewsletterData();
	
	void updateNewsletterData();
	
	
	
}