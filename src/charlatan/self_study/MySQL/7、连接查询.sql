# 笛卡尔现象：两张表联合查询时，没有任何条件限制时发生笛卡尔积现象
select ename, dname
from emp,
     dept;

# 当员工表中的编号和部门编号中的内容相等的时候再返回
select ename, dname
from dept,
     emp
where emp.DEPTNO = dept.DEPTNO;
select emp.ename, dept.dname
from dept,
     emp
where emp.DEPTNO = dept.DEPTNO;


### 内连接
# 等值连接【可以带上 inner（也可以省略）】
# 查询每个员工的部门名称，要求显示员工名和部门名。
select e.ENAME, d.DNAME
from emp e
         join dept d on e.DEPTNO = d.DEPTNO;

select e.ENAME, d.DNAME
from emp e
         inner join dept d on e.DEPTNO = d.DEPTNO;

# 非等值连接【条件不是一个等值关系，称为非等值连接】
# 找出每个员工的工资等级，要求显示员工名、工资、工资等级。
select e.ENAME as ename, e.SAL as sal, s.GRADE as grade
from emp e
         inner join salgrade s on sal between s.LOSAL and s.HISAL;

# 自连接【自己连接自己】
# 找出每个员工的上级领导，要求显示员工名和对应的领导名。
select e1.ENAME staff,
       e2.ENAME leader
from emp e1
         join
     emp e2
     on e1.MGR = e2.EMPNO;

### 外连接
select e.ENAME, d.DNAME
from emp e
         right join dept d on e.DEPTNO = d.DEPTNO;

# 找出每个员工的上级领导，要求显示员工名和对应的领导名。【显示所有员工的上级，没有上级的也显示】
select e1.ENAME staff,
       e2.ENAME leader
from emp e1
         left join emp e2 on e1.MGR = e2.EMPNO;


### 三表联查
# 找出每一个员工的部门名称以及工资等级和上级领导。
select
    e1.ENAME as staffName,
    d.DNAME as staffDeptno,
    e1.SAL as staffSal,
    s.GRADE as staffGrade,
    e2.ENAME as leader
from
    emp e1
left join
    emp e2
on
    e1.MGR = e2.EMPNO
join
    salgrade s
on
    e1.SAL between s.LOSAL and s.HISAL
join
    dept d
on
    e1.DEPTNO = d.DEPTNO;
