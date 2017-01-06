package com.hjianhui.appiumautotest.pages;

import org.openqa.selenium.By;

/**@author hjianhui
 * @description 搜索页面元素(Webview)
 * */
public class SearchWebviewPage {
	

	 public static final String NATIVE = "NATIVE_APP";
	/**WebView名字*/
	 public static final String WEBVIEW_NAME = "WEBVIEW_com.microsoft.bing";
	 
	 /**网页搜索的结果列表*/
	 public static final By SWP_LINK_WEBRESULT = By.xpath("//*[@class='deeplink_title']");
	 
	 /**词典搜索的结果列表*/
	 public static final By SWP_LINK_DICTRESULT = By.xpath(".//*[@id='headword']/h1/strong");
	 
	 /**全部结果*/
	 public static final By SWP_LINK_ALLSEARCH = By.xpath(".//*[@id='b_results']/li[1]/div/ul/li[2]/span");
	 
	 /**仅英文结果*/
	 public static final By SWP_LINK_ENGLISHSEARCH = By.xpath(".//*[@id='b_results']/li[1]/div/ul/li[4]/a");
	 
	 public static final By SWP_LINK_JAVA = By.linkText("白花");
}



