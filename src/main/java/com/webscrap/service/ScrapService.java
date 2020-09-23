package com.webscrap.service;

import com.webscrap.dto.WebscrapingDto;
import com.webscrap.dto.WebscrapingInputDto;
import com.webscrap.dto.GoogleVisonDto;


public interface ScrapService {

	WebscrapingDto selectWebListPost(WebscrapingInputDto WebscrapingInput);
	
	GoogleVisonDto GoogleVisonApi();
}
