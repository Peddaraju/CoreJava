package com.app;

import javax.jws.WebService;

@WebService
public class ServerInfo {

	public String getIpAddress()
	{
		return "10.10.10.10";
	}
}
