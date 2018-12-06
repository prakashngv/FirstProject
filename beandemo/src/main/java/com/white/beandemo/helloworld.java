package com.white.beandemo;

import org.springframework.context.annotation.*;

public class helloworld{
	public helloworld() {
		System.out.println("bean is created");
	}
	public void disp() {
		System.out.println("hai");
	}
}
