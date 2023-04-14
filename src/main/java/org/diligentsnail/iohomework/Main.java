package org.diligentsnail.iohomework;

import org.diligentsnail.iohomework.utils.ResourceUtils;

import java.util.List;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		loadApplicationProperties()
			.getExpletives()
			.forEach(System.out::println);
	}

	private static ApplicationProperties loadApplicationProperties() {
		Properties properties = ResourceUtils.getPropertiesFromClassPath("/application.properties");
		return new ApplicationProperties(
			// expletives=word1,word2, поэтому делаем split по запятой
			List.of(properties.getProperty("expletives").split(","))
		);
	}
}
