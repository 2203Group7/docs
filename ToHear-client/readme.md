# ToHear Client (前端项目)

## 项目简介
ToHear 是一款基于 uni-app 开发的播客类小程序，支持多端（微信小程序、H5、APP）运行，主要功能包括音频浏览、播放、上传与个人中心管理。

## 技术栈
- **uni-app**：跨平台小程序开发框架（基于 Vue.js）
- **Vue.js**：前端核心框架
- **Vuex**：状态管理（如用户状态、播放状态）
- **uView UI**：第三方UI组件库
- **uni.request封装**：统一管理HTTP请求

## 项目结构
```plaintext
ToHear_client/
│
├── pages/           # 页面目录（首页、详情页、个人中心等）
├── components/      # 公共组件（如音频播放器、卡片组件）
├── static/          # 静态资源（图片、音频等）
├── store/           # Vuex状态管理
├── common/          # 工具函数（如请求封装、时间格式化）
├── config/          # 全局配置文件（如API地址）
└── README.md        # 项目说明文件
```

## 核心功能模块

- 登录与注册
- 首页音频推荐与分类
- 播放器功能（播放、暂停、切换）
- 用户个人中心（信息管理、收藏列表）
- 音频上传功能（发布自己的播客）

## 前后端交互规范

- 通信协议：HTTP RESTful API
- 请求封装：基于 `uni.request`
- 鉴权方式：请求头携带 Token
- 返回数据格式：

```
json复制编辑{
  "code": 200,
  "msg": "成功",
  "data": { }
}
```

## 启动方式

```
bash复制编辑# 使用 HBuilderX 打开 ToHear_client 项目
# 选择运行到微信小程序模拟器 或 H5端预览
```

## 注意事项

- 需要配合 ToHear 后端服务（ToHear_server）正常运行
- 配置好请求基地址（在 config/config.js 中修改）