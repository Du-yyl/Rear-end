# limit 可以写两个参数，指定显示的内容，如果第一个没参数，默认是 0
select
    ENAME,SAL
from
    emp
group by
    JOB
order by
    'SAL'
limit 2,4;
