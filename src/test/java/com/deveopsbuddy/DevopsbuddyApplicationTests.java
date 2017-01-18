package com.deveopsbuddy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.deveopsbuddy.web.i18n.i18NService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsbuddyApplicationTests {

	@Autowired
	private i18NService i18NService;
	
	
	@Test
	public void testMessageByLocalService() throws Exception {
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId);
	    Assert.assertEquals("The actual and expected Strings don't match",expectedResult, actual);
		
	}
	
}
