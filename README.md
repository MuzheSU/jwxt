# 湖南工业大学成绩更新邮件提醒
[![](https://img.shields.io/badge/author-wind-blue "作者")](https://github.com/fengxiaop/) [![](https://img.shields.io/badge/%E6%95%99%E5%8A%A1%E7%B3%BB%E7%BB%9F-%E6%88%90%E7%BB%A9%E6%9B%B4%E6%96%B0v1.0-red)](https://github.com/fengxiaop/HUT-JWXT)[![](https://img.shields.io/badge/qq-1493020035-brightgreen"作者qq") ]() 

理论上实用于所有强智科技系统没有验证码的学校  可以作为参加  有需要的话 我会单独写一篇博客来讲流程

成绩更新邮件提醒 10min查询一次、

爬取湖南工业大学教务系统成绩并提醒 

博客详见<a href = "https://blog.huttop.top/2022/01/11/%E7%88%AC%E5%8F%96%E5%BC%BA%E5%88%B6%E7%A7%91%E6%8A%80%E6%95%99%E5%8A%A1%E7%B3%BB%E7%BB%9F%E2%80%94%E4%BB%A5%E6%B9%96%E5%8D%97%E5%B7%A5%E4%B8%9A%E5%A4%A7%E5%AD%A6%E4%B8%BA%E4%BE%8B/">地址</a>

`git clone https://github.com/fengxiaop/jwxt.git`

IDEA打开项目

![](http://windxiao-1307340949.cosgz.myqcloud.com/20220609194225.png)

![](http://windxiao-1307340949.cosgz.myqcloud.com/20220609194255.png)

选择`pom.xml`文件

![](http://windxiao-1307340949.cosgz.myqcloud.com/20220609194343.png)

![](http://windxiao-1307340949.cosgz.myqcloud.com/20220609200822.png)

大概等了几分钟 等依赖加载完  加载慢的建议直接上梯子

## 你需要修改的地方

学号+密码 以及发送的邮箱

`jwxt\src\main\java\com\example\jwxt\Login` 路径下的Login函数

![](http://windxiao-1307340949.cosgz.myqcloud.com/20220609195620.png)

你的发送邮箱以及授权码

`jwxt\src\main\java\com\example\jwxtGetUserInfo`

收件邮箱 加邮件主题(emailTitle  可改可不改) 

![](http://windxiao-1307340949.cosgz.myqcloud.com/image-20220609195712707.png)

`jwxt\src\main\java\com\example\jwxt\SendMailUtil` 下更改发件邮箱和授权码 

![](http://windxiao-1307340949.cosgz.myqcloud.com/20220609200055.png)

填写好之后点击JwxtApplication 运行

![](http://windxiao-1307340949.cosgz.myqcloud.com/20220609200148.png)

看看有没有收到邮件提醒

大概就是这样 UI太丑了  不太会设计  感谢大家多多包容

![](http://windxiao-1307340949.cosgz.myqcloud.com/20220609200425.png)



欢迎大家Star和提PR  

本个项目很粗糙  只是实现了这个功能而已  如果你有好的想法和建议希望你和和我交流  联系方式已经在上面可以看到~