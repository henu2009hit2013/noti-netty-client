###  SNoti 客户端

基于netty 封装的客户端
* 1、远程控制
* 2、接收服务端推送的事件



### 客户端使用


```

NotiClient notiClient = NotiClient
            .build()
            .setHost("snoti.gizwits.com")
            .setPort(2017)
            .login("product_key","auth_id", "auth_secret", "subkey", prefetch_count,Arrays.asList(Events.ONLINE, Events.OFFLINE, Events.STATUS_KV));

 // 启动
notiClient.doStart();


// 发起远程控制
//notiClient.sendControlMessage(String product_key, String mac, String did, Map attrs);
//notiClient.sendControlMessage(String product_key, String mac, String did, DataCommand cmd, Byte[] raw)
//notiClient.sendControlMessage(List< RemoteControlData > contorlMessage)


// 接收服务端推送事件消息
while (true) {
    String messgae = notiClient.reveiceMessgae();

}
        
        
```
