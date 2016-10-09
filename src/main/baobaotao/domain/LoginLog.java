package main.baobaotao.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {

	/**
	 * 登录日志实体
	 */
	private static final long serialVersionUID = 6551097567487096359L;

	private int loginLogId;
	private int userId;
	private String ip;
	private Date loginDateTime;

	public int getLoginLogId() {
		return loginLogId;
	}

	public void setLoginLogId(int loginLogId) {
		this.loginLogId = loginLogId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getLoginDateTime() {
		return loginDateTime;
	}

	public void setLoginDateTime(Date loginDateTime) {
		this.loginDateTime = loginDateTime;
	}

}
