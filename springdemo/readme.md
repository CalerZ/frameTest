作为框架测试使用
#spring


#mybatis
##1.参数处理
如果是单个参数那么可以直接使用#{参数名获取}

如果是多个参数那么默认是0,1，....或者param0，param1，

也可以使用一下三种方式
0.传参时声明说使用哪个参数@param("id"),param("name")，然后使用#{id}，#{name}取值
1：pojo对象的方式传递#{属性名}
2.封装一个map，然后#{map的key值}
3.to，经常使用例如分页对象
  1.8可以使用全局配置把参数名作为#{参数名}

2.在{}中如果值为NULL，那么oracle不能识别，程序会报错，那么就将全局配置修改NULL-->NULL而非之前转为OTHER


