[返回目录](/README.md)

# 单行函数

## ![](../assets/import16.png)字符函数

### ![](../assets/import17.png)Upper & Lower & initcap

dual 是虚拟表

```
select upper('ericchen') from dual  -- ERICCHEN 转化为大写
select lower('EricChen') from  dual --  ericchen 转化为小写
select initcap ('ericChen') from dual -- Ericchen 首字母大写
```

* concat 连接字符串

```
select concat('hello','world') from dual -- helloworld
```

* substr字符串截取

```
select substr ('hello',0,3) from dual -- hel 截取前三个字符
```

* length获取字符串长度

```
select length('hello') from dual -- 5个
```

* replace字符串替换

```
select replace('hello','l','x') from dual -- hexxo 替换l为x
```

## 数值函数

* round四舍五入

```
round(45.926,2) -- 45.93
```

* Trunc截断

```
trunc(45.926,2) -- 45.92
```

* MOD求余数

```
mod(1600,300) -- 100
```

## 



