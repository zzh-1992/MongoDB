
### mac mongo数据路径
    /Users/user/LocalSoftware/mongodata

### mac mongo数据路径
    /Users/user/LocalSoftware/mongolog


### 安装完成后，我们可以把 MongoDB 的二进制命令文件目录（安装目录/bin）添加到 PATH 路径中：
    export PATH=/Users/user/LocalSoftware/mongodb/bin:$PATH

### 后台启动服务
    菜鸟教程链接 https://www.runoob.com/mongodb/mongodb-osx-install.html

    --dbpath 设置数据存放目录
    --logpath 设置日志存放目录
    --fork 在后台运行

    mongod --dbpath /Users/user/LocalSoftware/mongodata --logpath /Users/user/LocalSoftware/mongolog/mongo.log --fork