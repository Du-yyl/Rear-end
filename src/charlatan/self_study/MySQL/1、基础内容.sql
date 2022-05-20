# 查看有哪些数据库
show databases;

# 使用指定数据库
use bjpowernode;

# 创建数据库
create database MyTest;

# 删除数据库
drop database MyTest;

# 查看数据库版本号
select version();

# 查看使用的是哪个数据库
select database();

# 查看创建数据库用的语句
show create table dept;

# 查询表中的数据
select *
from dept;

# 显示所有的表
show tables;

# 查看表结构
desc dept;
