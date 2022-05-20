### 条件查询
/*
 select
    字段1，字段2
 from
    表名
 where
    条件
 */

# 查询工资是 800 的
select ename, sal
from emp
where sal = 800;

# 查询工资不等于 800 的
select ename, sal
from emp
where sal != 800;
select ename, sal
from emp
where sal <> 800;

# 查询工资高于3000的
select ename, sal
from emp
where sal >= 3000;

# 查询工资 800 - 3000 之间的
select ename, sal
from emp
where sal >= 800
  and sal <= 3000;
select ename, SAL
from emp
where SAL between 800 and 3000;

# between 也能查询字符串中的内容
select ename
from emp
where ename between 'A' and 'C';

# 判断是否为空
select ename, COMM
from emp
where comm is not null;
select ename, COMM
from emp
where comm is null;

### and ， or 的组合查询
select ename, SAL
from emp
where job = 'MANAGER'
  and sal > 2000;
select ename, SAL
from emp
where job = 'MANAGER'
   or sal > 2000;

# and和or 的优先级
select ename, job, SAL
from emp
where sal > 2500
  and (DEPTNO = 10
    or DEPTNO = 20);
select ename, job, SAL
from emp
where DEPTNO = 10
   or DEPTNO = 20
    and sal > 2500;

### in  not in
select ename, job
from emp
where job in ('MANAGER', 'ANALYST');
select ename, job, sal
from emp
where sal in (800, 2000, 3000, 5000);

### 模糊查询
select ename
from emp
where ename like '__A%';
