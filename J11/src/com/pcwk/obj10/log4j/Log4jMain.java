package com.pcwk.obj10.log4j;

import org.apache.log4j.Logger;

public class Log4jMain {
		
		final static Logger LOG = Logger.getLogger(Log4jMain.class);
		
	public static void main(String[] args) {
		LOG.debug("====================");
		LOG.debug("=log4j=");
		LOG.debug("====================");
	}

}
