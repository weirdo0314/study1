# study1
练习1
API文档：
https://www.showdoc.com.cn/1235298286270760?page_id=6217595980194172


问题：
尝试用token和shiro来做登录验证
在网上看他们做的千奇百怪的看不怎么懂
主要是卡在各种各样的工具类、拦截器、jwt还有shiro上
但token的概念我应该差不多懂了
token主要是按一个算法组成的字符串，每当用户进行一个请求的时候都需要过一拦截器进行token认证,token有时限但能一直刷新
学得比较慢:(


# 基于jwt的token验证

##### 大致思路：

基于token的登录，是不存在回话状态，大概思路，在用户初次登录的时候，校验用户账号密码，成功后给其生成一个token，token=用户ID+时间戳+过期时间+一个自己平台规定的签名，使用jjwt生成一个令牌，然后对其进行存库，用户每次访问接口，都会在头部Headers中带上token，后来拦截器对其进行拦截，如果token为空或错误则让其登录，如果有token，获取token进行其解析，取出里面的用户ID，根据用户ID查询数据库中所存token，判断其是否正确，正确使其登录，错误则提示登录。

1.用户登录产生token

2.用户请求时带token进行请求


3.拦截器会对所有请求进行拦截对token进行验证

4.对权限进行验证

5.返回用户资源

这里的token不需要存储

只需要请求时带上token服务器中会以签名来做一个验证的初始化

将token传进verifier对象进行验证并返回结果

所以说token在这种情况下不需要存储在服务端



