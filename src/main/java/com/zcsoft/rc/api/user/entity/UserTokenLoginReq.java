package com.zcsoft.rc.api.user.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class UserTokenLoginReq {

	/**
	 * token
	 */
	@NotEmpty
	private String loginToken;


	public String getLoginToken() {
		return loginToken;
	}

	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UserTokenLoginReq{");
		sb.append("loginToken='").append(loginToken).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
