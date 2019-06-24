/**
 * 
 */
package com.lsn.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author LSN
 *
 */
@Configuration
public class ConfigBean
{
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}
