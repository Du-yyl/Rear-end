# 升序【默认升序】
select ename, SAL
from emp
order by sal asc;

# 降序
select ename, SAL
from emp
order by sal desc;

# 多个字段排序
select ename, SAL
from emp
order by sal desc, ENAME asc;

# 指定按照第二列排序
select ename, sal
from emp
order by 2;

# 统计工资大于1250并且小于3000的员工信息，倒叙排列
select ename, sal
from emp
where sal >= 1250
  and sal <= 3000
order by sal desc;
