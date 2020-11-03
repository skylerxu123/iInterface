package com.liubike.testcase;

import com.alibaba.fastjson.JSONObject;
import com.liubike.common.HttpClientUtil;
import com.liubike.testBase.testBase;
import com.liubike.tools.ZTestReport;
import com.liubike.tools.readJsonFile;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Properties;

@Listeners({ZTestReport.class})
public class testUser extends testBase {

    public String url = null;

    @BeforeTest
    public void beforeTest(){
        Properties prop = loadFromEnvProperties("userInfo.properties");
        String server_address = prop.getProperty("server_addr", "newtestsso.xlgxapp.com");
        url = "http://" + server_address + "/erp-admin-sso/api/v1/admin/user/create";
        Reporter.log("发送的请求地址为：" + url);
    }

    @Test(groups = {"UserCase"}, description = "post请求是否能通")
    public void sendPostRequest() throws Exception {
        JSONObject jsonObject = readJsonFile.getJsonObejectbyFileName("user2.json");
        String jsonString = jsonObject.toString();
        String response = HttpClientUtil.sendPostByJson(url, jsonString, 3);
        JSONObject jsonResp = JSONObject.parseObject(response);
        Reporter.log("用例结果: resultCode=>expected: " + "1" + " ,actual: " + jsonResp.get("code"));
        Reporter.log("用例结果: resultCode=>expected: " + "用户名重复" + " ,actual: " + jsonResp.get("msg"));
        Reporter.log("用例结果: resultCode=>expected: " + "false" + " ,actual: " + jsonResp.get("success"));
        Assert.assertEquals(jsonResp.get("code"), 1);
        Assert.assertEquals(jsonResp.get("msg"), "用户名重复");
        Assert.assertEquals(jsonResp.get("success"), false);
    }

    @Test(groups = {"UserCase"}, description = "post请求是否能通")
    public void sendPostRequest2() throws Exception {
        JSONObject jsonObject = readJsonFile.getJsonObejectbyFileName("user2.json");
        String jsonString = jsonObject.toString();
        String response = HttpClientUtil.sendPostByJson(url, jsonString, 3);
        JSONObject jsonResp = JSONObject.parseObject(response);
        Reporter.log("用例结果: resultCode=>expected: " + "1" + " ,actual: " + jsonResp.get("code"));
        Reporter.log("用例结果: resultCode=>expected: " + "用户名重复" + " ,actual: " + jsonResp.get("msg"));
        Reporter.log("用例结果: resultCode=>expected: " + "false" + " ,actual: " + jsonResp.get("success"));
        Assert.assertEquals(jsonResp.get("code"), 1);
        Assert.assertEquals(jsonResp.get("msg"), "用户名重复");
        Assert.assertEquals(jsonResp.get("success"), false);
    }

}
