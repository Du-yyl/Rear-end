### 增
-- 创建表
create table t_student
(
    no    int,
    name  varchar(12),
    age   int(3),
    sex   varchar(1),
    email varchar(40)
);

-- 插入信息
insert into
    t_student
(no, name, age, sex, email)
value
(12,'张三',20,'男','123456@123.com');


### 删除
# 删除一个表
drop table t_student;
# 如果一个表存在，就删除
drop table if exists t_student;

### 改
