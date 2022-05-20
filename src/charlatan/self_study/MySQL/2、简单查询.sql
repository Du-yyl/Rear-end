# 查询所有表中所有内容
select *
from dept;

### 为列起一个别名
# 为查询的结果起一个别名【as后的内容是别名】
select ENAME, SAL as test
from emp;

# 可以分为多个
select ENAME as name, SAL as gongzi
from emp;

# as也可以省略
select ENAME name, SAL gongzi
from emp;

# 如果别名中有空格吗，可以将内容使用单引号括起来
select ENAME 'n a m e', SAL 'g o n g z i'
from emp;

# 计算员工年薪，并重新命名字段
select ename, sal * 12 YearSal
from emp;
