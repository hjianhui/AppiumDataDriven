package com.hjianhui.appiumautotest.pages;

import org.openqa.selenium.By;

public class InitPage {
	/**
	 * @author hjianhui
	 * @description APP每次初始化出现的页面元素类
	 * */
	
	/**现在开启*/
	 public static final By IP_BUTTON_START = By.id("com.microsoft.bing:id/tutorial_finish_button"); 
	 
	/**取消定位*/
	 public static final By IP_BUTTON_CANCEL = By.id("android:id/button2"); 
	 
	 /**拒绝*/
	 public static final By IP_BUTTON_REJECT = By.name("拒绝");
	 
	 /**元素组*/
	 public static  By byElements[] = {IP_BUTTON_START,IP_BUTTON_REJECT,IP_BUTTON_CANCEL};

}
