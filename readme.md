基础应用架构MVP base（contract、baseview、basepresenter、lifecycle）
业务模块（插件化 or 组件化，配置管理）：在线音乐、主播电台、我的音乐、收音机、搜索   //TODO 插件化方案调研
功能组件（aar，通过dagger注入）：搜索、收藏
数据仓repo(两级缓存：内存、数据库、api)
代理（aar，通过dagger注入）：aosp proxy、usb音乐/adapterapi、蓝牙音乐/adpaterapi、、外部控制/openapi（媒体中心）、鉴权/openapi（用户、设备）、aidl
后台服务（多进程管理：apk）：收音机服务、音乐播放服务、下载服务（在线音乐）  //TODO 跨进程延时开销评估
基本功能库（aar，通过maven仓依赖）：热更新（tinker）、打点（ecarx）、工具包（xutils？）、路由（aroute）、依赖注入（dagger）、图片（glide）、网络请求（retrofit+rx）、响应式（livedata，不建议使用rxjava）、事件（EventBus）
自定义控件