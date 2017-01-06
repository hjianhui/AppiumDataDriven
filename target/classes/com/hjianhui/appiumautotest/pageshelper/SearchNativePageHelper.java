package com.hjianhui.appiumautotest.pageshelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.hjianhui.appiumautotest.utils.AppiumUtil;

/**
 * @author hjianhui
 * @description 在原生APP界面封装点击和输入操作
 *  
 * */
public class SearchNativePageHelper {
	public static Logger logger = Logger.getLogger(SearchNativePageHelper.class);
	
	/**在此原生搜索页面点击操作*/
	public static void clickOnSearchNativePage(AppiumUtil appiumUtil, By  byElement){
		appiumUtil.click(byElement);
	}
	
	/**向输入框输入内容*/
	public static void typeInfo(AppiumUtil appiumUtil, By  byElement, String info){
		appiumUtil.typeContent(byElement, info);
	}
	
	/**清空输入框内容*/
	public static void clearContent(AppiumUtil appiumUtil, By  byElement){
		appiumUtil.clear(byElement);
	}
}
