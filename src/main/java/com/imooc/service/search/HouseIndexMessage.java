package com.imooc.service.search;

/**
 * Created by 瓦力.
 * 索引消息封装
 */
public class HouseIndexMessage {

    //消息类型
    public static final String INDEX = "index";
    public static final String REMOVE = "remove";

    //消息重复消费的次数
    public static final int MAX_RETRY = 3;

    private Long houseId;//房屋ID
    private String operation;//INDEX or REMOVE
    private int retry = 0;//重试次数

    /**
     * 默认构造器 防止jackson序列化失败
     */
    public HouseIndexMessage() {
    }

    public HouseIndexMessage(Long houseId, String operation, int retry) {
        this.houseId = houseId;
        this.operation = operation;
        this.retry = retry;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getRetry() {
        return retry;
    }

    public void setRetry(int retry) {
        this.retry = retry;
    }
}
