package cn.ekgc.witmed.util;

import java.util.Properties;

/**
 * <b>智慧医疗-系统常量工具类</b>
 * @author Arthur
 * @version 1.0.0
 */
public class SystemConstants {
	private static Properties props = new Properties();

	static {
		try {
			// 加载配置文件 enums.properties
			props.load(SystemConstants.class.getClassLoader().getResourceAsStream("props/system.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
