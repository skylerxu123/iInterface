package com.liubike.testcase;

import com.alibaba.fastjson.JSONObject;
import com.liubike.testBase.testBase;
import com.liubike.tools.JSONParaser;
import com.liubike.serviceIterface.CityWeather;
import com.liubike.tools.ZTestReport;
import com.liubike.tools.readJsonFile;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.io.IOException;

@Listeners({ZTestReport.class})
public class TestExec extends testBase {
    public String httpResult = null, weatherinfo = null, city = null, exp_city = null;
    public static String cityCode = "";
    CityWeather weather = new CityWeather();

    @BeforeTest
    public void beforeTest(){
        Reporter.log("test begginining!");
    }

    @AfterTest
    public void afterTest(){
        Reporter.log("test end!");
    }


    @Test(groups = {"BaseCase"}, description = "验证北京天气返回城市名称是否正确")
    public void getBeiJing_Succ() throws IOException {
        exp_city = "北京";
        cityCode = "101010100";
        Reporter.log("【正常用例】:获取" + exp_city + "天气成功!");
        httpResult = weather.getHttpRespone(cityCode);
        Reporter.log("请求地址: " + weather.geturl());
        Reporter.log("返回结果: " + httpResult);
        weatherinfo = JSONParaser.getJsonValue(httpResult, "weatherinfo");
        city = JSONParaser.getJsonValue(weatherinfo, "city");
        Reporter.log("用例结果: resultCode=>expected: " + exp_city + " ,actual: " + city);
        Assert.assertEquals(city, exp_city);
    }

    @Test(groups = {"BaseCase"}, description = "验证北京天气返回城市名称是否正确")
    public void getBeiJing_Succ2() throws IOException {
        exp_city = "北京";
        cityCode = "101010100";
        Reporter.log("【正常用例】:获取" + exp_city + "天气成功!");
        httpResult = weather.getHttpRespone(cityCode);
        Reporter.log("请求地址: " + weather.geturl());
        Reporter.log("返回结果: " + httpResult);
        weatherinfo = JSONParaser.getJsonValue(httpResult, "weatherinfo");
        city = JSONParaser.getJsonValue(weatherinfo, "city");
        Reporter.log("用例结果: resultCode=>expected: " + exp_city + " ,actual: " + city);
        Assert.assertEquals(city, exp_city);
    }

    @Test(groups = {"BaseCase"}, description = "验证北京天气返回城市名称是否正确")
    public void getBeiJing_Succ3() throws IOException {
        exp_city = "北京";
        cityCode = "101010100";
        Reporter.log("【正常用例】:获取" + exp_city + "天气成功!");
        httpResult = weather.getHttpRespone(cityCode);
        Reporter.log("请求地址: " + weather.geturl());
        Reporter.log("返回结果: " + httpResult);
        weatherinfo = JSONParaser.getJsonValue(httpResult, "weatherinfo");
        city = JSONParaser.getJsonValue(weatherinfo, "city");
        Reporter.log("用例结果: resultCode=>expected: " + exp_city + " ,actual: " + city);
        Assert.assertEquals(city, exp_city);
    }

    @Test(groups = {"BaseCase"}, description = "验证北京天气返回城市名称是否正确")
    public void getBeiJing_Succ4() throws IOException {
        exp_city = "北京";
        cityCode = "101010100";
        Reporter.log("【正常用例】:获取" + exp_city + "天气成功!");
        httpResult = weather.getHttpRespone(cityCode);
        Reporter.log("请求地址: " + weather.geturl());
        Reporter.log("返回结果: " + httpResult);
        weatherinfo = JSONParaser.getJsonValue(httpResult, "weatherinfo");
        city = JSONParaser.getJsonValue(weatherinfo, "city");
        Reporter.log("用例结果: resultCode=>expected: " + exp_city + " ,actual: " + city);
        Assert.assertEquals(city, exp_city);
    }

    @Test(groups = {"BaseCase"}, description = "验证北京天气返回城市名称是否正确")
    public void getBeiJing_Succ5() throws IOException {
        exp_city = "北京";
        cityCode = "101010100";
        Reporter.log("【正常用例】:获取" + exp_city + "天气成功!");
        httpResult = weather.getHttpRespone(cityCode);
        Reporter.log("请求地址: " + weather.geturl());
        Reporter.log("返回结果: " + httpResult);
        weatherinfo = JSONParaser.getJsonValue(httpResult, "weatherinfo");
        city = JSONParaser.getJsonValue(weatherinfo, "city");
        Reporter.log("用例结果: resultCode=>expected: " + exp_city + " ,actual: " + city);
        Assert.assertEquals(city, exp_city);
    }

    @Test(groups = {"BaseCase"}, description = "验证北京天气返回城市名称是否正确")
    public void getBeiJing_Succ6() throws IOException {
        exp_city = "北京";
        cityCode = "101010100";
        Reporter.log("【正常用例】:获取" + exp_city + "天气成功!");
        httpResult = weather.getHttpRespone(cityCode);
        Reporter.log("请求地址: " + weather.geturl());
        Reporter.log("返回结果: " + httpResult);
        weatherinfo = JSONParaser.getJsonValue(httpResult, "weatherinfo");
        city = JSONParaser.getJsonValue(weatherinfo, "city");
        Reporter.log("用例结果: resultCode=>expected: " + exp_city + " ,actual: " + city);
        Assert.assertEquals(city, exp_city);
    }

    @DataProvider(name = "dataShangHai")
    public Object[][] cityDataProvider() {
        return new Object[][]{{"武汉"}};
    }

    @Test(groups = {"BaseCase"}, description = "验证上海天气返回城市名称是否正确", dataProvider = "dataShangHai")
    public void getShangHai_Succ(String exp_city) throws IOException {
        cityCode = "101020100";
        Reporter.log("【正常用例】:获取" + exp_city + "天气成功!");
        httpResult = weather.getHttpRespone(cityCode);
        Reporter.log("请求地址: " + weather.geturl());
        Reporter.log("返回结果: " + httpResult);
        weatherinfo = JSONParaser.getJsonValue(httpResult, "weatherinfo");
        city = JSONParaser.getJsonValue(weatherinfo, "city");
        Reporter.log("用例结果: resultCode=>expected: " + exp_city + " ,actual: " + city);
        Assert.assertEquals(city, exp_city, "期望城市检测");
    }

    @Test(groups = {"BaseCase"}, description = "验证深圳天气返回城市名称是否正确")
    public void getShenZhen_Succ() throws Exception {
        exp_city = "深圳";
        cityCode = "101280601";
        Reporter.log("【模拟跳过测试用例】:获取" + exp_city + "天气成功!");
        httpResult = weather.getHttpRespone(cityCode);
        Reporter.log("请求地址: " + weather.geturl());
        Reporter.log("返回结果: " + httpResult);
        weatherinfo = JSONParaser.getJsonValue(httpResult, "weatherinfo");
        city = JSONParaser.getJsonValue(weatherinfo, "city");
        Reporter.log("用例结果: resultCode=>expected: " + exp_city + " ,actual: " + city);
        Assert.assertEquals(city, exp_city);
        throw new SkipException("");
    }


    @DataProvider(name = "nameOption")
    public Object[][] nameOptionProvider() {
        return new Object[][]{{"xiaowang"},{"xiaowang1"},{"xiaowang2"}};
    }

    @Test(groups = {"BaseCase"}, description = "验证JSON格式的post请求是否通",dataProvider = "nameOption")
    public void verifyJsonPostRequest(String exp_username) throws Exception {
        JSONObject jsonObject = readJsonFile.getJsonObejectbyFileName("user.json");
        String username = jsonObject.get("name").toString();
        Reporter.log("用例结果: resultCode=>expected: " + exp_username + " ,actual: " + username);
        Assert.assertEquals(username, exp_username);
        //String respones = HttpClientUtil.sendPostByJson("", jsonObject.toString(), 2);
    }


    @Test(groups = {"BaseCase"}, description = "验证JSON格式的post请求是否通")
    public void sendPostRequest(String exp_username) throws Exception {
        JSONObject jsonObject = readJsonFile.getJsonObejectbyFileName("user.json");
        String username = jsonObject.get("name").toString();
        weather.getHttpRespone(cityCode);
        Reporter.log("用例结果: resultCode=>expected: " + exp_username + " ,actual: " + username);
        Assert.assertEquals(username, exp_username);
        //String respones = HttpClientUtil.sendPostByJson("", jsonObject.toString(), 2);
    }
}
