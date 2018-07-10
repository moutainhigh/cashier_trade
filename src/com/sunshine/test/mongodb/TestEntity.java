/**
 * <html>
 * <body>
 *  <P> Copyright 2017 阳光康众</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2017年3月10日</p>
 *  <p> Created by 于策/yu.ce@foxmail.com</p>
 *  </body>
 * </html>
 */
package com.sunshine.test.mongodb;

import com.sunshine.framework.mvc.mongodb.entity.BaseMongoEntity;

/**
 * @Project ChuFangLiuZhuan_PlatForm
 * @Package mongodb.test
 * @ClassName TestEntity.java
 * @Description
 * @JDK version used 1.8
 * @Author 于策/yu.ce@foxmail.com
 * @Create Date 2017年5月27日
 * @modify By
 * @modify Date
 * @Why&What is modify
 * @Version 1.0
 */
public class TestEntity extends BaseMongoEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1732907054137857465L;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_APPLICATION.NAME 名称
	 * 
	 * @mbggenerated
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_APPLICATION.CODE 编码
	 * 
	 * @mbggenerated
	 */
	private String code;
	/**
	 * 
	 * 平台值
	 */
	private Integer value;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_APPLICATION.IS_CITY_APP 是否是省/城市app 0:否 1:是
	 * 
	 * @mbggenerated
	 */
	private Integer isCityApp;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_APPLICATION.AREA_CODE 城市app 对应的省/城市编码
	 * 
	 * @mbggenerated
	 */
	private String areaCode;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_APPLICATION.APP_DESC 应用描述说明
	 * 
	 * @mbggenerated
	 */
	private String appDesc;

	/**
	 * appId入口取值(0地址参数，1平台配置)
	 * 
	 */
	private Integer appIdSource;

	/**
	 * App个人中心url
	 */
	private String appUserCenterUrl;

	/**
	 * App首页url
	 */
	private String appIndexUrl;

	/**
	 * 后台登录logo
	 */
	private String pfLoginLogoPath;

	/**
	 * 后台首页logo
	 */
	private String pfIndexLogoPath;

	/**
	 * App登录Logo
	 */
	private String appLoginLogoPath;

	/**
	 * App首页商圈URL
	 */
	private String bcUrl;
	/**
	 * App个人中心商圈订单URL
	 */
	private String bcGoodsOrderListUrl;
	/**
	 * 医程通(安卓)下载URL
	 */
	private String yctAndroidUrl;
	/**
	 * 医程通(IOS)下载URL
	 */
	private String yctIOSUrl;
	/**
	 * 易健通(安卓)下载URL
	 */
	private String yjtAndroidUrl;
	/**
	 * 易健通(IOS)下载URL
	 */
	private String yjtIOSUrl;

	/**
	 * 手动选择城市页面
	 */
	private String areaChooseUrl;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_APPLICATION.NAME
	 *
	 * @return the value of SYS_APPLICATION.NAME
	 *
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_APPLICATION.NAME
	 *
	 * @param name
	 *            the value for SYS_APPLICATION.NAME
	 *
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_APPLICATION.CODE
	 *
	 * @return the value of SYS_APPLICATION.CODE
	 *
	 * @mbggenerated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_APPLICATION.CODE
	 *
	 * @param code
	 *            the value for SYS_APPLICATION.CODE
	 *
	 * @mbggenerated
	 */
	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	/**
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(Integer value) {
		this.value = value;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_APPLICATION.IS_CITY_APP
	 *
	 * @return the value of SYS_APPLICATION.IS_CITY_APP
	 *
	 * @mbggenerated
	 */
	public Integer getIsCityApp() {
		return isCityApp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_APPLICATION.IS_CITY_APP
	 *
	 * @param isCityApp
	 *            the value for SYS_APPLICATION.IS_CITY_APP
	 *
	 * @mbggenerated
	 */
	public void setIsCityApp(Integer isCityApp) {
		this.isCityApp = isCityApp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_APPLICATION.AREA_CODE
	 *
	 * @return the value of SYS_APPLICATION.AREA_CODE
	 *
	 * @mbggenerated
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_APPLICATION.AREA_CODE
	 *
	 * @param areaCode
	 *            the value for SYS_APPLICATION.AREA_CODE
	 *
	 * @mbggenerated
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode == null ? null : areaCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_APPLICATION.APP_DESC
	 *
	 * @return the value of SYS_APPLICATION.APP_DESC
	 *
	 * @mbggenerated
	 */
	public String getAppDesc() {
		return appDesc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_APPLICATION.APP_DESC
	 *
	 * @param appDesc
	 *            the value for SYS_APPLICATION.APP_DESC
	 *
	 * @mbggenerated
	 */
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc == null ? null : appDesc.trim();
	}

	/**
	 * @return the appIdSource
	 */
	public Integer getAppIdSource() {
		if (appIdSource == null)
			appIdSource = 0;
		return appIdSource;
	}

	/**
	 * @param appIdSource
	 *            the appIdSource to set
	 */
	public void setAppIdSource(Integer appIdSource) {
		this.appIdSource = appIdSource;
	}

	public String getAppUserCenterUrl() {
		return appUserCenterUrl;
	}

	public void setAppUserCenterUrl(String appUserCenterUrl) {
		this.appUserCenterUrl = appUserCenterUrl;
	}

	public String getAppIndexUrl() {
		return appIndexUrl;
	}

	public void setAppIndexUrl(String appIndexUrl) {
		this.appIndexUrl = appIndexUrl;
	}

	public String getPfLoginLogoPath() {
		return pfLoginLogoPath;
	}

	public void setPfLoginLogoPath(String pfLoginLogoPath) {
		this.pfLoginLogoPath = pfLoginLogoPath;
	}

	public String getPfIndexLogoPath() {
		return pfIndexLogoPath;
	}

	public void setPfIndexLogoPath(String pfIndexLogoPath) {
		this.pfIndexLogoPath = pfIndexLogoPath;
	}

	public String getAppLoginLogoPath() {
		return appLoginLogoPath;
	}

	public void setAppLoginLogoPath(String appLoginLogoPath) {
		this.appLoginLogoPath = appLoginLogoPath;
	}

	public String getAreaChooseUrl() {
		return areaChooseUrl;
	}

	public void setAreaChooseUrl(String areaChooseUrl) {
		this.areaChooseUrl = areaChooseUrl;
	}

	public String getBcUrl() {
		return bcUrl;
	}

	public void setBcUrl(String bcUrl) {
		this.bcUrl = bcUrl;
	}

	public String getBcGoodsOrderListUrl() {
		return bcGoodsOrderListUrl;
	}

	public void setBcGoodsOrderListUrl(String bcGoodsOrderListUrl) {
		this.bcGoodsOrderListUrl = bcGoodsOrderListUrl;
	}

	public String getYctAndroidUrl() {
		return yctAndroidUrl;
	}

	public void setYctAndroidUrl(String yctAndroidUrl) {
		this.yctAndroidUrl = yctAndroidUrl;
	}

	public String getYctIOSUrl() {
		return yctIOSUrl;
	}

	public void setYctIOSUrl(String yctIOSUrl) {
		this.yctIOSUrl = yctIOSUrl;
	}

	public String getYjtAndroidUrl() {
		return yjtAndroidUrl;
	}

	public void setYjtAndroidUrl(String yjtAndroidUrl) {
		this.yjtAndroidUrl = yjtAndroidUrl;
	}

	public String getYjtIOSUrl() {
		return yjtIOSUrl;
	}

	public void setYjtIOSUrl(String yjtIOSUrl) {
		this.yjtIOSUrl = yjtIOSUrl;
	}

}
