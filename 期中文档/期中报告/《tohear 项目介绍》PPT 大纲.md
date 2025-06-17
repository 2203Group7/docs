## **《tohear 项目介绍》PPT 大纲**

------

### **1. 项目概述**

- 项目名称：tohear（播客类小程序）
- 项目目标：打造一个简洁、流畅、功能完备的播客收听与分享平台
- 技术栈：
  - 前端：uni-app（基于 Vue）
  - 后端：Spring Boot
  - 数据库：MySQL（utf8mb4）
  - 工具：Navicat、HBuilderX、IDEA

------

### **2. 原型设计**

- 设计工具：墨刀
- 原型展示页面：
  - 首页（播客推荐、分类）
  - 我的页面（登录、收藏、历史记录）
  - 播客播放页（音频播放、评论、点赞）
- 用户流程图：
  - 用户登录/注册 → 浏览播客 → 播放/收藏 → 留言/点赞
- 用户角色与权限：
  - 普通用户
  - 管理员（后台管理权限）

------

### **3. API 设计**

- 接口设计原则：RESTful
- 请求方式：GET / POST / PUT / DELETE
- 接口示例：
  - `GET /api/podcast/list` → 获取播客列表
  - `POST /api/user/login` → 用户登录
  - `GET /api/podcast/detail/{id}` → 获取播客详情
  - `POST /api/comment/add` → 发布评论
- API 文档工具推荐：Swagger 或 Postman

------

### **4. 前端设计**

- 使用框架：uni-app

- 项目结构划分：

  ```
  tohear_clent/
  ├── vite/                    # Vite构建工具
  ├── node_modules/            # 项目依赖
  └── src/                     # 源代码目录
      ├── assets/
      │   └── iconfont.css     # 图标字体
      ├── components/          # 公共组件
      │   ├── broadcast-item/  # 广播组件
      │   ├── channel-item/    # 频道组件
      │   ├── comment-item/    # 评论组件
      │   ├── drop-down/       # 下拉组件
      │   ├── edit-wind/       # 编辑窗口
      │   ├── head-generic/    # 通用头部
      │   ├── my-button/       # 自定义按钮
      │   ├── my-head/         # 个人中心头部
      │   ├── player-bar/      # 播放器控制条
      │   ├── popupwindow/     # 弹窗组件
      │   ├── post-head/       # 帖子头部
      │   ├── post-interaction/# 帖子交互
      │   ├── post-item/       # 帖子项
      │   ├── reply-item/      # 回复项
      │   ├── search-box/      # 搜索框
      │   ├── sort-method-box/ # 排序选择
      │   ├── tabbar/          # 底部导航
      │   ├── tags-tabs/       # 标签页
      │   └── useritem/        # 用户项
      ├── pages/               # 页面目录
      │   ├── broadcast/       # 广播页
      │   ├── channel/         # 频道页
      │   ├── community/       # 社区页
      │   ├── creation/        # 创作页
      │   ├── index/           # 首页
      │   ├── login-register/  # 登录注册
      │   ├── my/              # 个人中心
      │   ├── player/          # 播放器
      │   ├── search-pages/    # 搜索页
      │   ├── test/            # 测试页
      │   └── user/            # 用户页
      ├── request/             # 请求封装
      │   ├── apis.ts          # API接口
      │   └── index.ts         # 请求核心
      ├── static/              # 静态资源
      │   └── tab_icons/       # 标签图标
      │       ├── bg.png       # 背景图
      │       └── logo.png     # Logo
      ├── stores/              # 状态管理
      │   ├── base.ts          # 基础Store
      │   ├── counter.ts       # 计数器Store
      │   ├── player-副本.ts   # 播放器备份
      │   ├── player.ts        # 播放器状态
      │   └── user.ts          # 用户状态
      ├── styles/              # 样式文件
      │   └── tailwind.css     # Tailwind样式
      ├── uni_modules/         # uni-app模块
      ├── utils/               # 工具函数
      │   ├── broadcastSort.ts # 广播排序
      │   ├── channelSort.ts   # 频道排序
      │   ├── checkPassword.ts # 密码验证
      │   ├── commentSort.ts   # 评论排序
      │   ├── durationFormatting.ts # 时长格式化
      │   ├── initPlayer.ts    # 播放器初始化
      │   ├── logOut.ts        # 登出逻辑
      │   ├── numConversion.js # 数字转换
      │   ├── postSort.ts      # 帖子排序
      │   └── timeChange.ts    # 时间转换
      ├── App.vue              # 根组件
      ├── env.d.ts             # 环境类型
      ├── main.ts              # 主入口
      ├── manifest.json        # 应用配置
      ├── pages.json           # 路由配置
      ├── shime-uni.d.ts       # uni类型声明
      ├── uni.scss             # 全局样式
      ├── .gitignore           # Git配置
      └── index.html           # HTML入口
  ```

  

  #### TypeScript 规范

- 样式规范：

  - 响应式布局，适配各类手机屏幕
  - 统一颜色与字体风格（主题色、组件风格统一）

------

### **5. 后端设计**

- 技术栈：Spring Boot + MyBatis Plus

- 项目结构：

  ```java
   tohear_server/
  ├── .idea/                   # IDEA配置文件
  ├── .mvn/                   # Maven包装器
  ├── src/
  │   ├── main/
  │   │   ├── java/
  │   │   │   └── com.pxx.ifmserver/
  │   │   │       ├── config/          # 配置类
  │   │   │       │   ├── CorsConfig   # 跨域配置
  │   │   │       │   └── WebConfig    # Web配置
  │   │   │       ├── controller/      # 控制器层
  │   │   │       │   ├── BroadcastController
  │   │   │       │   ├── ChannelController
  │   │   │       │   ├── CommentController
  │   │   │       │   ├── EmailController
  │   │   │       │   ├── PostController
  │   │   │       │   ├── ReplyController
  │   │   │       │   ├── SearchHistoryController
  │   │   │       │   ├── ServerController
  │   │   │       │   └── UserController
  │   │   │       ├── entity/          # 数据库实体
  │   │   │       │   ├── Broadcast
  │   │   │       │   ├── BroadcastFavorite
  │   │   │       │   ├── BroadcastHistory
  │   │   │       │   ├── Channel
  │   │   │       │   ├── Comment
  │   │   │       │   ├── Post
  │   │   │       │   ├── Reply
  │   │   │       │   ├── SearchHistory
  │   │   │       │   └── User
  │   │   │       ├── dto/             # 数据传输对象
  │   │   │       │   ├── CommentDTO
  │   │   │       │   └── HashTag
  │   │   │       ├── vo/              # 视图对象
  │   │   │       │   ├── BroadcastItemVO
  │   │   │       │   ├── BroadcastVO
  │   │   │       │   ├── ChannelItemVO
  │   │   │       │   ├── ChannelVO
  │   │   │       │   ├── CommentVO
  │   │   │       │   ├── PostVO
  │   │   │       │   └── ReplyVO
  │   │   │       ├── mapper/          # MyBatis映射器
  │   │   │       │   ├── BroadcastMapper
  │   │   │       │   ├── ChannelMapper
  │   │   │       │   ├── CommentMapper
  │   │   │       │   ├── PostMapper
  │   │   │       │   ├── ReplyMapper
  │   │   │       │   ├── SearchHistoryMapper
  │   │   │       │   └── UserMapper
  │   │   │       ├── result/          # 统一返回结果
  │   │   │       │   ├── Result
  │   │   │       │   └── ResultCodeEnum
  │   │   │       ├── service/         # 服务层
  │   │   │       │   └── impl/        # 服务实现
  │   │   │       │       ├── BroadcastService
  │   │   │       │       ├── ChannelService
  │   │   │       │       ├── CommentService
  │   │   │       │       ├── PostService
  │   │   │       │       ├── ReplyService
  │   │   │       │       ├── SearchHistoryService
  │   │   │       │       └── UserService
  │   │   │       └── utils/           # 工具类
  │   │   │           ├── EmailUtil
  │   │   │           ├── FileUtils
  │   │   │           ├── TokenUtil
  │   │   │           ├── VCodeUtil
  │   │   │           └── IFmServerApplication
  │   │   └── resources/
  │   │       ├── static/              # 静态资源
  │   │       │   └── images/
  │   │       │       ├── channel/    # 频道图片
  │   │       │       │   └── D.png
  │   │       │       └── user.head/  # 用户头像
  │   │       │           ├── 6_1732262627.png
  │   │       │           ├── 7_1732262834.png
  │   │       │           └── D.png
  │   │       ├── application.properties # 应用配置
  │   │       └── mybatis-config.xml   # MyBatis配置
  │   └── test/                       # 测试代码
  ├── target/                         # 构建输出
  │   ├── .gitattributes
  │   ├── .gitignore
  │   ├── mvnw                        # Maven包装器脚本
  │   ├── mvnw.cmd
  │   └── pom.xml                     # Maven项目配置
  └── pom.xml                         # 主POM文件
  
  ```

- 核心模块：

  - 用户模块（登录注册）
  - 播客模块（上传、展示、播放）
  - 评论模块（添加、查询）

- 数据库设计：

  - 表：用户表、播客表、评论表、收藏表
  - 关系：一对多（用户与评论）、多对多（用户与收藏）

------

### **6. 测试方案**

- 单元测试（JUnit）：
  - 测试服务层、工具类逻辑正确性
- 接口测试：
  - 使用 Postman 逐一验证接口请求与返回数据
- 前端测试：
  - 手动测试主流程：登录 → 播客浏览 → 播放 → 评论/收藏
- 性能测试（可选）：
  - 使用 Apache JMeter 模拟并发用户访问
- Bug 跟踪工具推荐：语雀、飞书表格、TAPD 等

------

### **7. 项目进度与规划**

- 当前进度：
  - 环境已搭建，数据库设计完成，前后端架构搭建完成
- 后续计划：
  - 接口实现 → 联调 → 测试优化 → 部署发布