package com.scratch.scratch1;

import com.scratch.scratch1.provider.HelloWorldMessageProvider;
import com.scratch.scratch1.provider.MessageProvider;
import com.scratch.scratch1.renderer.MessageRenderer;
import com.scratch.scratch1.renderer.StandardOutMessageRenderer;

// @SpringBootApplication
public class HelloWorldDecoupled {

	public static void main(String[] args) {
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloWorldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
		 
	}
}
