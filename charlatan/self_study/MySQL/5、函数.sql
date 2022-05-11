### 单行处理函数
# 转小写
select lower(ename)
from emp;

# 转大写
select upper(ename)
from emp;

# 取子串（被截取的字符串，起始下标，长度）
select substr(ename, 1, 17)
from emp;

# 去除空格
select trim(ename)
from emp;

# 首字母大写
select concat(upper(substr(ename, 1, 1)), lower(substr(ename, 2, length(ename) - 1)))
from emp;

# 生成随机数
select rand()
from emp;

# 空处理函数【将NULL字段转换为指定的内容】
select ifnull(COMM, '测试'), ename
from emp;

# 多行处理函数
