package com.httpurlconnection;


import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HttpURLConn {

    /**
     * 发送post请求 并获取返回值
     *
     * @param url          请求URL
     * @param headerParams 请求头参数集合
     * @param bodyParams   请求体参数集合
     * @return 返回响应数据
     */
    public static String sendPost(String url, Map<String, String> headerParams, Map<String, String> bodyParams) {
        OutputStreamWriter out = null;
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        try {
            URL realUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
            // 设置请求方式为POST
            conn.setRequestMethod("POST");
            // 发送POST请求必须设置如下两行
            //设置是否向HttpURLConnection输出
            conn.setDoOutput(true);
            //设置是否从HttpURLConnection读入
            conn.setDoInput(true);
            //设置连接超时时间
            conn.setConnectTimeout(10000);
            //设置读取超时时间
            conn.setReadTimeout(10000);
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "application/json");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Content-Type", "application/json;charset=utf-8");

            //设置请求头相关数据
            if (headerParams != null) {
                for (Map.Entry<String, String> entry : headerParams.entrySet()) {
                    conn.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            //连接服务器
            conn.connect();

            // 获取URLConnection对象对应的输出流
            out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            // 设置请求体
            if (bodyParams != null) {
                //将map类型参数转为json字符串
                String body = JSON.toJSONString(bodyParams);
                out.write(body);
            }

            out.flush();

            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result.toString();
    }

}

