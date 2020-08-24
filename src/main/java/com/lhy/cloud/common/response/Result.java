package com.lhy.cloud.common.response;

import java.io.Serializable;

/**
 * @author: LiuHeYong
 * @create: 2019-05-22
 * @exception:
 * @description:
 **/
public class Result implements Serializable {

    private static final long serialVersionUID = 326257344007822118L;

    private String resultCode;

    private String resultMessage;

    private Object resultData;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

}
