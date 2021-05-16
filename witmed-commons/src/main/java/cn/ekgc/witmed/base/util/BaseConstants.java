package cn.ekgc.witmed.base.util;

import java.util.Properties;

/**
 * <b>基础信息常量类</b>
 * @author Arthur
 * @version 1.0.0
 */
public class BaseConstants {
	private static Properties props = new Properties();

	static {
		try {
			// 加载配置文件 enums.properties
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>加密秘钥</b>
	 */
	public static final String BASE_SECRET_KEY = props.getProperty("base.secret.key");

	/**
	 * <b>Token 有效期</b>
	 */
	public static final Long BASE_TOKEN_EXPIRE_MAILLIS = Long.parseLong(props.getProperty("base.token.expire.millis"));

	/**
	 * <b>验证码有效期</b>
	 */
	public static final Long BASE_CAPTCHA_EXPIRE_MAILLIS = Long.parseLong(props.getProperty("base.captcha.expire.maillis"));
}
