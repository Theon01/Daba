package com.daba.backend.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.daba.backend.domain.User;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;


@Controller
public class UploadCreator {

	@RequestMapping(value="/uploadurl", method = RequestMethod.GET)
	public @ResponseBody String crateUploadUrl(){
		
		BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();
		
		return blobstoreService.createUploadUrl("/uploadsuccess");
	}
	
	
	
	
}
