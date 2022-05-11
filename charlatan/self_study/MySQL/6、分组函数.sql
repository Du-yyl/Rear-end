# 找出最高工资
select ENAME, MAX(sal)
from emp;

# 计算工资总和
select sum(sal)
from emp;

# 平均
select avg(sal)
from emp;

select JOB, avg(sal)
from emp
group by job;

# 找出每个工作最高的工资
select JOB, sum(sal) allSal
from emp
group by JOB;

# 不同部门和不同岗位的最高工资
select DEPTNO, JOB, max(sal)
from emp
group by DEPTNO, JOB
order by DEPTNO desc;

# 找出每个部门最高工资，要求显示最高薪资大于 3000
select DEPTNO, MAX(sal) MaxSal
from emp
where sal >= 3000
group by DEPTNO;

# 计算每个部门评论薪资，显示高于 2500 的
select DEPTNO, avg(sal)
from emp
group by DEPTNO
having avg(sal) > 2500;
