package com.hjianhui.appiumautotest.pages;

import org.openqa.selenium.By;

/**
 * @author hjianhui
 * @description 搜索页面元素（原生APP）
 * */
public class SearchNativePage {
	/**搜索输入框*/
	 public static final By SNP_INPUT_SEARCH = By.id("com.microsoft.bing:id/search_text_field"); 
	 
	 /**搜索网页*/
	 public static final By SNP_LINK_WEBSEARCH = By.id("com.microsoft.bing:id/opal_as_web");
	 
	 /**搜索图片*/
	 public static final By SNP_LINK_IMAGESEARCH = By.id("com.microsoft.bing:id/opal_as_images");
	 
	 /**搜索视频*/
	 public static final By SNP_LINK_VEDIOSEARCH = By.id("com.microsoft.bing:id/opal_as_videos");
	 
	 /**搜索学术*/
	 public static final By SNP_LINK_ACADEMICSEARCH = By.id("com.microsoft.bing:id/opal_as_academic");
	 
	 /**搜索词典*/
	 public static final By SNP_LINK_DICTSEARCH = By.id("com.microsoft.bing:id/opal_as_dict");
}
