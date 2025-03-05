  # To Hear 应用程序 
  
   ## 项目介绍 
  
   本项目是基于uni-app + Vue3 + Typescript + Pinia + Vite的TOHEARAPP，后端使用SpringBoot+Maven + MyBatis+MySQL，其主要功能是：

  - 热门内容推荐：通过算法推荐，实时推送用户感兴趣的播客内容，提升用户粘性
- 多种精彩呈现：用户可以根据频道订阅播客节目，支持收听、收藏功能，满足个性化需求
- 社区互动：设计了丰富的社交互动功能，帖子代替评论，增强播客内容与社区内容的关联性，提升用户参与度
- 简单快捷的创作功能：通过创作中心，用户可以轻松创作播客节目或社区帖子，降低创作门槛
- 数据安全保障：提供邮箱验证安全措施，确保用户数据安全

  
   ![图片](./images/frame.jpg)
  
   ## 小组成员及分工 
  
   |姓名 | 学号 | 分工 | 
  |----------------------------------- |------------ |------------------------ | 
  | [徐显舜]（https://github.com/Pleaseboss） | 2212190527 | 前端核心开发+拓展模块+数据库 | 
  | [张皖男]（https://github.com/wnzhang） | 2212190106 | 后端服务+基础设施 | 
  
  ## 项目结构
```mermaid
mindmap
  root((To Hear APP))
    技术栈
      前端
        uni-app
        Vue.js
        TypeScript
        Vuex (状态管理)
        Vuetify (UI组件库)
        axios (网络请求)
        ECharts (数据可视化)
      后端
        Spring Boot
        MySQL
        Redis
        JWT认证
        JPA
        Spring Security
    功能模块
      播客管理
        创建播客
        编辑播客
        删除播客
        订阅播客
        播放播客
        收藏播客
      频道管理
        创建频道
        编辑频道
        删除频道
        频道订阅
        频道推荐
      社区互动
        创建帖子
        编辑帖子
        删除帖子
        帖子评论
        帖子点赞
        帖子分享
        帖子关联播客
      用户管理
        用户注册
        用户登录
        用户资料修改
        用户安全设置
        用户权限管理
      数据统计
        播客播放统计
        用户活跃度统计
        社区互动统计
        播客推荐排行
        热点话题
    测试方案
      单元测试
        JUnit (后端)
        Mocha (前端)
        Jest (前端)
      集成测试
        Postman
        Spring Boot Test
        FastAPI TestClient
      E2E测试
        Cypress
        Playwright
      性能测试
        JMeter
        Lighthouse
    维护方案
      CI/CD
        GitHub Actions
        Docker容器化
        Kubernetes编排
      监控告警
        Prometheus+Grafana
        ELK日志系统
        Sentry
      文档维护
        Swagger API文档
        Storybook组件文档
        MkDocs项目文档
    第三方服务
      云存储
        AWS S3
        MinIO
      邮件服务
        SendGrid
      推送服务
        Firebase Cloud Messaging
      OAuth集成
        Google
        GitHub
```

## 项目计划
```mermaid
gantt
    title iFM 爱播客 项目开发计划 (2025/03/05 - 2025/07/01)
    dateFormat  YYYY-MM-DD
    axisFormat %m/%d
    
    section 需求与设计
    需求分析           :a1, 2025-03-05, 7d
    技术方案评审       :a2, after a1, 5d
    UI/UX原型设计      :a3, after a2, 10d
    
    section 基础架构
    前端脚手架搭建(徐显舜)  :b1, 2025-03-20, 10d
    后端基础设施(张皖男)   :b2, 2025-03-20, 14d
    数据库设计(徐显舜)    :b3, 2025-03-27, 7d
    
    section 核心功能开发
    播客管理模块(张皖男)  :c1, 2025-04-03, 14d
    频道管理模块(徐显舜)  :c2, 2025-04-03, 21d
    社区互动模块(张皖男)  :c3, 2025-04-17, 14d
    
    section 扩展功能
    用户管理模块(徐显舜)  :d1, 2025-04-24, 14d
    数据统计模块(张皖男)  :d2, 2025-05-01, 7d
    第三方服务对接(徐显舜) :d3, 2025-05-08, 14d
    
    section 测试验证
    单元测试           :e1, 2025-05-22, 14d
    集成测试           :e2, 2025-05-29, 7d
    E2E测试           :e3, 2025-06-05, 7d
    
    section 部署维护
    文档编写           :f1, 2025-06-05, 7d
    生产环境部署       :f2, 2025-06-12, 5d
    监控系统搭建       :f3, 2025-06-12, 7d
```
  
   
 
