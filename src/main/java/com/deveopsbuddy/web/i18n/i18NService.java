package com.deveopsbuddy.web.i18n;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service	
public class i18NService {
	
	private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(i18NService.class);
	@Autowired
	private MessageSource messageSource;

	
	public String getMessage(String messageId) {
		LOG.info("Returning i18N text for messageId{}",messageId);
		Locale locale = LocalContextHolder.getLocale();
			
		return getMessage(messageId,locale);
	}

	public String getMessage(String messageId, Locale locale) {
		return messageSource.getMessage(messageId,null,locale);
			
	}
}
