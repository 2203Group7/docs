# ToHear Server (后端项目)

## 项目简介
ToHear 后端服务基于 Spring Boot 构建，提供小程序所需的 API 接口，包括用户管理、音频管理、上传功能等模块。数据持久化采用 MySQL。

## 技术栈
- **Spring Boot**：快速搭建后端服务
- **MyBatis-Plus**：简化数据库操作
- **MySQL**：关系型数据库
- **JWT**：用户身份认证
- **Swagger**：自动生成 API 文档
- **Spring Validation**：参数校验
- **Lombok**：简化 Java 开发

## 项目结构
```plaintext
ToHear_server/
│
├── controller/       # 接口控制层
├── service/          # 业务逻辑层接口
├── service/impl/     # 业务逻辑层实现类
├── mapper/           # 数据访问层接口
├── entity/           # 实体类（数据库表映射）
├── config/           # 配置类（如跨域、Swagger）
├── utils/            # 工具类（如Token工具、文件上传工具）
├── resources/
│   ├── application.yml  # Spring Boot 配置文件
│   └── mapper/          # MyBatis-Plus XML映射文件
└── README.md         # 项目说明文件
```

## 核心功能模块

- **用户模块**：注册、登录、信息修改、身份认证
- **音频模块**：浏览、上传、搜索、分类管理
- **个人中心模块**：我的发布、我的收藏
- **文件上传模块**：支持音频文件的上传与存储

## API交互规范

- **通信协议**：HTTP RESTful 风格

- **身份认证**：Token机制（JWT）

- **请求头规范**：

  ```
  makefile
  
  
  复制编辑
  Authorization: Bearer <token>
  ```

- **返回数据统一格式**：

```
json复制编辑{
  "code": 200,
  "msg": "成功",
  "data": { }
}
```

## 启动方式

```
bash复制编辑# 1. 使用 IntelliJ IDEA 或 Eclipse 打开 ToHear_server 项目
# 2. 配置数据库连接 application.yml
# 3. 运行主启动类 ToHearApplication.java
```

## Swagger访问方式

项目启动后访问：

```
bash


复制编辑
http://localhost:8080/swagger-ui/index.html
```

可以在线查看并测试后端API接口。