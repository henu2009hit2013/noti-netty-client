package com.gizwits.noti2.client;

import com.google.gson.annotations.SerializedName;

/**
 * Created by feel on 2017/6/17.
 */
public enum PushEvents {


    @SerializedName("datapoints_changed")
    DATAPOINTS_CHANGED("datapoints_changed"),//数据点编辑事件
    @SerializedName("device_online")
    DEVICE_ONLINE("device_online"),//设备上线事件
    @SerializedName("device_offline")
    DEVICE_OFFLINE("device_offline"),//设备下线事件
    @SerializedName("attr_fault")
    ATTR_FAULT("attr_fault"),//属性故障
    @SerializedName("attr_alert")
    ATTR_ALERT("attr_alert"),// 属性告警
    @SerializedName("device_status_raw")
    DEVICE_STATUS_RAW("device_status_raw"),//设备状态事件
    @SerializedName("device_status_kv")
    DEVICE_STATUS_KV("device_status_kv"),//设备状态事件
    @SerializedName("sub_device_added")
    SUB_DEVICE_ADDED("sub_device_added"),//中控添加子设备事件
    @SerializedName("sub_device_deleted")
    SUB_DEVICE_DELETED("sub_device_deleted");//中控删除子设备事件

    private String name;

    PushEvents(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static PushEvents getEvent(String name) {
        for (PushEvents event : values()) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        return null;
    }
}
