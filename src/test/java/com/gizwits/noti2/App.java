package com.gizwits.noti2;

import com.gizwits.noti2.client.Events;
import com.gizwits.noti2.client.NotiClient;

import java.util.Arrays;

/**
 * Created by feel on 2017/6/16.
 * <p>
 * 参考link:http://docs.gizwits.com/zh-cn/Cloud/NotificationAPI.html
 */
public class App {

    public static void main(String[] args) {


        NotiClient notiClient = NotiClient
                .build()
                .setHost("snoti.gizwits.com")
                .setPort(2017)
                .login("xx", "xx", "xx", "client", 50, Arrays.asList(Events.ONLINE, Events.OFFLINE, Events.STATUS_KV));

        // 启动
        notiClient.doStart();


        // 发起远程控制
        //notiClient.sendControlMessage(String product_key, String mac, String did, Map attrs);
        //notiClient.sendControlMessage(String product_key, String mac, String did, DataCommand cmd, Byte[] raw)
        //notiClient.sendControlMessage(List<RemoteControlData> controlMessage)


        //订阅(接收)推送事件消息
        while (true) {

            String messgae = notiClient.reveiceMessgae();
            System.out.println(messgae);

        }

    }

}
