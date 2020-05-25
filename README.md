 **Spring Boot系列基础教程**
本项目内容为Spring Boot系列的程序样例，由笔者通过对Spring boot每个知识点的学习所积累。！！！
如果感兴趣可以相互学习，谢谢~
1. [spring-boot-redis](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-redis)

    新增分布式锁功能，实现基本的秒杀操作，结合Redis的单线程实现，可以高效的处理并发问题。
2. [spring-boot-thymeleaf](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-thymeleaf)

	简单的thymeleaf操作，列举了一些简单常用的属性和功能，仅供参考，比较好的方法还是去官网查api文档
3. [spring-boot-thymeleaf-layout](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-thymeleaf-layout)

	在简单thymeleaf的基础上，增加了layout嵌入页面的功能，有兴趣的可以查看源代码实现
4. [spring-boot-jpa](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-jpa)
	spring boot集成jpa模块，并且实现了简单的数据库操作，使用jpa的有点就是从hibernate的基础上，更简易的方式是使用方法名来对数据库进行操作。sql都是有框架底层自动生成，并不需要工程师去开发编写
5. [spring-boot-multi-jpa](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-multi-jpa)

	在以上jpa的集成基础上，增加了多数据源的实现，根据配置多个数据源，以及配置文件，在不同的包名下，对不同的数据源进行操作。
6. [spring-boot-mybatis-annotation](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-mybatis-annotation)

	spring boot集成mybatis模块，此项目为使用注解开发mybatis，实现了基本的对数据库curd。

7. [spring-boot-mybatis-annotation-mulidatasource](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-mybatis-annotation-mulidatasource)

	spring boot集成mybatis模块的基础上，增加多数据源的操作，根据不同包名来区分对不同的数据源操作，此项目也为注解开发

8. [spring-boot-mybatis-xml](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-mybatis-xml)

	此项目跟上面的mybatis的区别只是在使用xml配置mybatis，相比注解开发可能更复杂一些。不过也只是实现了简单的curd

9. [spring-boot-mybatis-xml-mulidatasource](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-mybatis-xml-mulidatasource)

	此项目为以上mybatis配置xml版本的增强版，加入了多数据源的操作

10. [spring-boot-rabbitmq](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-rabbitmq)

	spring boot集成rabbitmq消息队列，目前在项目已经存在普通的生产者消费者的一对多和多对多的消息传递。同时还在项目中加了Topic交换机通配符模式，以及Fanout消息广播模式
	
11. [spring-boot-scheduler](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-scheduler)
    
    spring boot使用spring集成的Scheduled注解，实现定时任务功能

12. [spring-boot-mail](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-mail)

    spring boot集成邮件功能，demo中提供多种发送邮件的模板，根据自己需要使用

13. [spring-boot-atlas](https://gitee.com/xuyb/springboot_stu/tree/master/spring-boot-atlas)

    spring boot集成Atlas以及sharding-jdbc，demo中分别以这两种开源组件实现了读写分离功能，根据自己的需要使用