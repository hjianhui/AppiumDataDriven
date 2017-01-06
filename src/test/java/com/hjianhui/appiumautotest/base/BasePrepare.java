package com.hjianhui.appiumautotest.base;

import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.hjianhui.appiumautotest.utils.AppiumUtil;
import com.hjianhui.appiumautotest.utils.ExcelDataProvider;
import com.hjianhui.appiumautotest.utils.LogConfiguration;
//import com.hjianhui.appiumautotest.utils.PropertiesDataProvider;
import com.hjianhui.appiumautotest.utils.SelectDriver;

import io.appium.java_client.AppiumDriver;

/**
 * @author hjianhui
 * @description 启动和结束测试，以及数据提供者，提供测试数据
 * */
public class BasePrepare {
	protected AppiumDriver<WebElement> driver; 
	protected AppiumUtil appiumUtil;
	public static Logger logger = Logger.getLogger(BasePrepare.class);
	protected String platformName;
	protected String appFilePath;
	protected String appPackage; 
	protected int elementTimeOut;
	protected ITestContext testContext = null;
	
	@BeforeClass
	 public void initTest(ITestContext context){
		//使log4j的配置生效，以便输出日志
		LogConfiguration.initLog(this.getClass().getSimpleName());
		
		//获取platform、appFilePath、appPackage的值，这个值是从testng的配置文件获取的
		platformName = context.getCurrentXmlTest().getParameter("platformName");
		appFilePath = context.getCurrentXmlTest().getParameter("appFilePath");
		appPackage = context.getCurrentXmlTest().getParameter("appPackage");
		elementTimeOut = Integer.valueOf(context.getCurrentXmlTest().getParameter("elementTimeOut"));
		this.testContext = context;
		appiumUtil = new AppiumUtil();
		//调用SelectDriver类的selectDriver方法，生成driver对象
		driver = new SelectDriver().selectDriver(context,appiumUtil);
		testContext.setAttribute("APPIUM_DRIVER", appiumUtil.driver);
	} 
	
	@AfterClass
	public void cleanTest(){
		if(driver != null){
//			appiumUtil.closeApp(PropertiesDataProvider.getTestData(appFilePath, appPackage));
		    driver.quit();
		}else{
			Assert.fail("driver没有获得对象，退出操作失败");
		}
	}
	
	@DataProvider(name = "testData")
	public Iterator<Object[]> dataFortestMethod() throws IOException {
		String moduleName = null; // 模块的名字
		String caseNum = null; // 用例编号
		String className = this.getClass().getName();
		int dotIndexNum = className.indexOf("."); // 取得第一个.的index
		int underlineIndexNum = className.indexOf("_"); // 取得第一个_的index

		if (dotIndexNum > 0) {
			/**这里的calssName原始值大概是这样的：com.hjianhui.appiumautotest.testcases.login.LoginPage_001_loginError_Test
			 * 那么下面这段代码className.substring(38, className.lastIndexOf("."))是什么意思？substring方法参数有两个
			 * 一个开始位置，一个结束位置，38表示这个字符串的第38个位置，这个位置当前字符是l,className.lastIndexOf(".")表示返回这字符串最后一个.所在
			 * 的位置，它是38，那么className.substring(38, className.lastIndexOf("."))可以转换成：className.substring(39, 44)，最终取得的值是login，
			 * 也就是moduleName的值
			 * 
			 * 
			 * */
			moduleName = className.substring(38, className.lastIndexOf(".")); // 取到模块的名称
		}

		if (underlineIndexNum > 0) {
			//这个分析方法和moduleName的分析方法一样
			caseNum = className.substring(underlineIndexNum + 1, underlineIndexNum + 4); // 取到用例编号
		}
		//将模块名称和用例的编号传给 ExcelDataProvider ，然后进行读取excel数据
		return new ExcelDataProvider(moduleName, caseNum);
	}
	
}
