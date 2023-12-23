#### 初始化Spring环境， spring-framework 5.2.x源码
#### -- 2023-12-23从github获取5.2.x分支
1. git clone https://github.com/spring-projects/spring-framework.git
2. github 创建spring-framework
3. 导入IDEA，checkout 5.2.x分支
4. git remote remove origin
5. 删除本地main分支
6. 基于5.2.x分支创建本地master分支
7. git remote add origin git@github.com:anliwen/spring-framework.git
8. 在master分支下执行：git push -u origin master
9. 在5.2.x分支下：创建测试模块spring-example
10. 在5.2.x分支下：删除checkstyle相关信息，spring-framework/src/checkstyle/*
11. 在5.2.x分支下：系统build.gradle删除3处checkstyle相关插件信息
12. 在5.2.x分支下：添加阿里云maven代理
13. 在5.2.x分支下：添加文档信息
14. 在5.2.x分支下执行：git push -u origin 5.2.x
15. 基于5.2.x分支创建本地debug分支：dev
16. 在dev分支下：git push -u origin dev
17. 此时一共3个分支：
    - master：主分支，对应spring-framework的5.2.x
    - 5.2.x：对应spring-framework的5.2.x，但是添加了测试模块，修改了部分配置信息，方便自己debug
    - dev：用于学习的debug分支，也就是spring-framework的5.2.x