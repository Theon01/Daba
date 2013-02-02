package com.daba.backend.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.daba.backend.domain.VideoMetaData;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;


@Controller
public class UploadCreator {

	@RequestMapping(value="/uploadurl")
	public @ResponseBody String createUploadUrl(){

		BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();

		return blobstoreService.createUploadUrl("/upload");
	}


	@RequestMapping(value="/videometadata",  method=RequestMethod.POST)
	public @ResponseBody String uploadsuccess(@RequestBody VideoMetaData vmd){


		return "/videometa/"+vmd.getKey()+"/"+vmd.getLatitude()+"/"+vmd.getLongitude();

	}
	@RequestMapping(value="/videometa/{longitude}/{latitude}")
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) {



	}


}
