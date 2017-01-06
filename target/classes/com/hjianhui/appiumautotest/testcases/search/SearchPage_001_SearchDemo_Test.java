package com.hjianhui.appiumautotest.testcases.search;

import java.util.Map;

import org.testng.annotations.Test;

import com.hjianhui.appiumautotest.base.BasePrepare;
import com.hjianhui.appiumautotest.pages.HomePage;
//import com.hjianhui.appiumautotest.pages.InitPage;
import com.hjianhui.appiumautotest.pages.SearchNativePage;
import com.hjianhui.appiumautotest.pages.SearchWebviewPage;
import com.hjianhui.appiumautotest.pageshelper.HomePageHelper;
//import com.hjianhui.appiumautotest.pageshelper.InitPageHelper;
import com.hjianhui.appiumautotest.pageshelper.SearchNativePageHelper;
import com.hjianhui.appiumautotest.pageshelper.SearchWebviewPageHelper;

public class SearchPage_001_SearchDemo_Test extends BasePrepare {
	
	@Test(dataProvider = "testData")
  	public void searchDemo1(Map<String, String>data) {  
		
		//去队欢迎界面和定位窗口
//		InitPageHelper.handlenInit(appiumUtil, InitPage.byElements );
		
		//点击搜索按钮
		HomePageHelper.clickOnHomePage(appiumUtil, HomePage.HP_BUTTON_SEARCH);
		
		//在搜索界面输入框输入Java
		SearchNativePageHelper.typeInfo(appiumUtil, SearchNativePage.SNP_INPUT_SEARCH, data.get("KEYWORD"));
		
		//点击搜索网页，进行搜索
		SearchNativePageHelper.clickOnSearchNativePage(appiumUtil, SearchNativePage.SNP_LINK_WEBSEARCH);
		
		//进入webview内容
		SearchWebviewPageHelper.enterWebview(appiumUtil, SearchWebviewPage.WEBVIEW_NAME);


  }
}
