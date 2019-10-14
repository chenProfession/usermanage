package com.gsjk.result;

/**
 * @program: usermanagement
 * @Description: recoder result information
 * @author: Mr.Cheng
 * @date: 2019/10/9 3:53 下午
 */
public class Result {
    private int resultcode;
    private String resultmessage;

    public int getResultcode() {
        return resultcode;
    }

    public void setResultcode(int resultcode) {
        this.resultcode = resultcode;
    }

    public String getResultmessage() {
        return resultmessage;
    }

    public void setResultmessage(String resultmessage) {
        this.resultmessage = resultmessage;
    }
}
