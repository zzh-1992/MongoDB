
## mac mongo数据路径
    /Users/user/LocalSoftware/mongodata

## mac mongo日志路径
    /Users/user/LocalSoftware/mongolog


## 安装完成后，我们可以把 MongoDB 的二进制命令文件目录（安装目录/bin）添加到 PATH 路径中：
    export PATH=/Users/user/LocalSoftware/mongodb/bin:$PATH

## 后台启动服务
    菜鸟教程链接 https://www.runoob.com/mongodb/mongodb-osx-install.html

    --dbpath 设置数据存放目录
    --logpath 设置日志存放目录
    --fork 在后台运行

    mongod --dbpath /Users/user/LocalSoftware/mongodata --logpath /Users/user/LocalSoftware/mongolog/mongo.log --fork

## MongoDB Authentication setting
###方式1 使用java代码配置
```java
    //@Bean
    public MongoClientFactoryBean mongo() {
        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        mongo.setHost("localhost");
        mongo.setPort(27017);

        // Authentication
        MongoCredential[] array = new MongoCredential[1];
        array[0] = MongoCredential.createCredential("grapefruit", "grape", "123456".toCharArray());;
        mongo.setCredential(array);
        return mongo;
    }
```
### 方式2
```properties
spring.data.mongodb.database=grape
spring.data.mongodb.host=127.0.0.1
spring.data.mongodb.port=27017
spring.data.mongodb.username=grapefruit
spring.data.mongodb.password=1234565
```

### 方式3
```properties
spring.data.mongodb.uri=mongodb://grapefruit:123456@localhost:27017/grape
```