package com.hjianhui.appiumautotest.pageshelper;

import org.apache.log4j.Logger;

import com.hjianhui.appiumautotest.utils.AppiumUtil;

/**
 * @author hjianhui
 * @description 操作Webview
 *  
 * */
public class SearchWebviewPageHelper {
	public static Logger logger = Logger.getLogger(SearchWebviewPageHelper.class);
	
	/**进入指定的webview内容中*/
	public static void enterWebview(AppiumUtil appiumUtil, String webview){
		appiumUtil.switchWebview(webview);
	}

}
