package com.qetrix.libs;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class Util
{
	public static String UrlEncode(String instring)
	{
		try {
			return URLEncoder.encode(instring, "UTF-8").replaceAll("\\+", "%20");
		} catch (Exception ex) {
			return instring;
		}
	}

	public static String UrlDecode(String instring)
	{
		try {
			return URLDecoder.decode(instring.replaceAll("%20", "+"), "UTF-8");
		} catch (Exception ex) {
			return instring;
		}
	}
}
