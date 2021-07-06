package com.tonacs.jpa.app.models.service;


import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;

public interface IUploadFileService {
	public Resource load(String filename) throws MalformedURLException ;
	public String copy(MultipartFile file) throws IOException ;
	public boolean delete(String filename);
	
	public void deleteAll() throws IOException ;
	public void init() throws IOException;
}
