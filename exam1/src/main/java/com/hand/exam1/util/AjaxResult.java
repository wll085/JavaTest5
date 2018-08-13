package com.hand.exam1.util;

public class AjaxResult {
    private int retcode = 1;
    private String retmsg = "succeed";
    private Object data;

    public AjaxResult(int retcode,String retmsg,String data){
        this.retcode=retcode;
        this.retmsg=retmsg;
        this.data=data;
    }
    public AjaxResult(int retcode,String retmsg){
        this.retcode=retcode;
        this.retmsg=retmsg;
    }
    public AjaxResult(Object data){
        this.retmsg="查询成功";
        this.data=data;
    }
    public AjaxResult(int retcode){
        this.retcode=retcode;
        this.retmsg="操作失败";
    }
    public AjaxResult(String retmsg){
        this.retcode=0;
        this.retmsg=retmsg;
    }
    public AjaxResult(){

    }

    public int getRetcode() {
        return retcode;
    }

    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    @Override
    public String toString(){
        return "AjaxResult [retcode=" + retcode + ", retmsg=" + retmsg + ", data=" + data + "]";
    }
}
