package com.liubike.tools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.ILoggerFactory;

import java.io.*;

public class readJsonFile {

    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JSONObject getJsonObejectbyFileName(String fileName) throws Exception {
        String path = readJsonFile.class.getClassLoader().getResource("testData/"+fileName).getPath();
        if(path==null){
            throw new Exception("the file is not exsisting, please check!");
        }
        String s = readJsonFile(path);
        JSONObject jobj = JSON.parseObject(s);
        //System.out.println(jobj.toString());
        return jobj;
    }

    public static void main(String[] args) throws Exception {
        String path = readJsonFile.class.getClassLoader().getResource("testData/user.json").getPath();
        if(path==null){
            throw new Exception("the file is not existing, please check!");
        }
        String s = readJsonFile(path);
        JSONObject jobj = JSON.parseObject(s);
        System.out.println(jobj.toString());
    }
}

