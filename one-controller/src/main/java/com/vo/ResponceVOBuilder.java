package com.vo;/**
 * @author: fs
 * @create: 2019/11/25 15:27
 */

/**
 * @program spring-text-one 
 * @description:
 * @author: fs
 * @create: 2019/11/25 15:27 
 */
public final class ResponceVOBuilder {
    private String code;
    private String msg;
    private Object data;

    private ResponceVOBuilder() {
    }

    public static ResponceVOBuilder aResponceVO() {
        return new ResponceVOBuilder();
    }

    public ResponceVOBuilder withCode(String code) {
        this.code = code;
        return this;
    }

    public ResponceVOBuilder withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public ResponceVOBuilder withData(Object data) {
        this.data = data;
        return this;
    }

    public ResponceVO build() {
        ResponceVO responceVO = new ResponceVO();
        responceVO.setCode(code);
        responceVO.setMsg(msg);
        responceVO.setData(data);
        return responceVO;
    }
}
