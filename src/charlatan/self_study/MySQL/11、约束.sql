# 约束
# 【创建表额时候，让两个字段都进行联合约束】
create table
    t_class
(
    id    int primary key ,
    class varchar(20)
);

create table
    t_student
(
    id    int primary key,
    name  varchar(10),
    class int,
    foreign key (class) references t_class(id)
);

drop table if exists t_;

insert into
    t_class
(id, class)
value
(1,'一班'),
(2,'二班'),
(3,'三班');

insert into
    t_student
(id, name, class)
value
(1,'jock-1',1),
(2,'jock0',2),
(3,'jock1',3),
(4,'jock2',3),
(5,'jock3',2),
(6,'jock4',1);

select * from t_class;
select * from t_student;
