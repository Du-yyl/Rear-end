### 子查询
# where 子查询
select
    *
from
    emp
where
    SAL > (select avg(sal) from emp);

# from 子查询【form 查出的表可以作为临时表】
# 每个岗位的平均薪资的工资等级
select
    Ja.JOB,GRADE
from
    (select
        JOB,
        avg(SAL) as sal
    from
        emp
    group by
        JOB) as Ja,
    salgrade
where
    sal
        between
            salgrade.LOSAL
        and
            salgrade.HISAL;

### union 合并查询结果集
# 找出工作岗位是 SALESMAN 和 MANAGER 的员工；
select
    ENAME
from
    emp
where JOB = 'MANAGER'
union
select
    ENAME
from
    emp
where
    JOB = 'SALESMAN';
