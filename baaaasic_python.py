# 谢谢你

# chap1.5
print("Hello, world", end="")  # end=是没有空格的
print()  # 行内注释是2#1空格

# chap1.6
# inputstr1_6 = input("等价于先print了但光标悬停(任意输入):")  # 返回的是string
# inputint1_6 = int(input("这样的显性转型(输入数字谢谢): "))

# chap1.7
# error的介绍 你开心就好

# chap1.11
# 电脑的硬件 一起抓鸡

# chap1.12
# 电脑语言史 根本根本呢

# chap2.2
float2_2 = 10.25  # 初始化 但其实是动态的型
print(type(float2_2))  # 返回<class 'float'> 感觉像type类型松的喔
# 不推荐使用 多isinstance(float2_2, float) 原因子类instance type不行
float2_2 = "test"  # 这里就转str了 参数变量呢
print(id(float2_2))  # 返回4323776528 对象的内存地址 int吧 以后跟is有混淆点

# chap2.6
int2_6_a = 0
int2_6_b = 8
int2_6_c = 3
int2_6_a = int2_6_b // int2_6_c  # 返回1 python是地板除 就是向下取整
print(int2_6_a)
int2_6_a **= 2  # 返回4 **指数 (少用) 如2就乘方 可跟pow(a, b)区别? **马上后跟参数复杂
# 优先级正常 **是高于*/%
# python里string可*但限制同类能+

# chap2.8
print("\\转义\'单引号\"双引号\n换行\t缩进")
rawstr2_8 = r"\\转义\'单引号\"双引号\n换行\t缩进"  # raw string原始字符串 无视\转义

asciinum2_8 = ord("h")  # 返回104 int型 单char在ascii的十进制表对应码
asciichar2_8 = chr(66)  # 返回B str型 单十进制数在ascii对应char码
# unicode出名的utf-8字节?可1到4 所以多 编码大法

# chap3.1
strlen3_1 = len("一个格就是一")  # 返回6 字符串的长度
bracketsstr3_1 = "字符串"[0]  # 字符串首0index 可复制不可替换

# chap3.2
duolist3_2 = [1, 1.01]  # python里list支持多语言
duolist3_2.append("尾")  # .append()把参数加到list末尾
duolist3_2.pop(-1)  # 返回尾 .pop(index) python支持末尾负 -1代表最后一位
duolist3_2 = duolist3_2 + ["爱"]  # list1 + list2 前后就这样合
duolist3_2.remove("爱")  # 没有返回 .remove(element) 定点找 如果没有找到直接报错

listmin3_2 = min(duolist3_2)  # 返回1 min(list) 似类型比较 str不能跟int比 报错
listmax3_2 = max(duolist3_2)  # 返回1.01 max(list) list最大值
listsum3_2 = sum(duolist3_2)  # 返回2.01 sum(list) list求和 要纯数
listindex3_2 = duolist3_2.index(1.01)  # 返回1 .index(element) list里第一个到element的index 如果没有找到直接报错
listcount3_2 = duolist3_2.count(0)  # 返回0 list.count(element) element的计数 如果没有就为0

duotuple3_2 = ("1", 1)  # (element, element) tuple里不可变 可读不可写

# chap3.3
duodict3_3 = {"a": 0, "b": 1, "c": 2}  # {"k1": v1, "k2": v2, "k3": v3} dictionary字典 占内存大 放弃空间取得时间
# 字典是key什么什么map的巧东西 没有index的概念
dictva3_3 = duodict3_3["a"]  # dict[key] 返回0 输入key找对应value 如果没有直接报错
duodict3_3["d"] = 3  # dict[key] = value 如果存在key则替换value 如果不存在则加入dict里
del duodict3_3["d"]  # 类数据库操作 删掉对应的key跟value 如果没有key就报错

# chap3.6
caststr3_6 = str(10.25)  # 返回"10.25" type(value)转型

# chap3.7
print("%d; %f; %s; %x; %X; %e; %E" % (6, 10.25, "hwx", 10, 25, 10.25, 1.025))
# %d打印int %f打印float %s打印string %x or %X打印十六进制 %e or %E打印科学技术法e次方10
# %的进阶...

# chap3.8
# import math
# math.ceil(x) 还有好多方法: https://docs.python.org/3.3/library/math.html
# ??为什么pow()又有math.pow() 引用不同??

# chap4.1
if True:  # if (返回布尔值的式):
    pass  # pass充当语句
    # statement of True
elif 1997 <= 10 < 25:  # python里支持双元运算符连算
    pass
else:
    pass
    # statement of False
# python以:缩进看语句块

# chap4.4
not True and False or True  # 优先级算术运算符not高于and高于or括号大嗮

# chap4.5
membershipoprd4_5_a = "h" in "hwx"  # 返回True in//not in判断是否在里面
membershipoprd4_5_b = "hh" not in ["h", "w", "x"]  # 返回True 也可判断是否在list里面
identityoprd4_5_a = "h" is "hwx"  # 返回False 判断内存地址 有时候价等地不同
identityoprd4_5_b = "hh" is not "hwx"  # 返回True 反判断内存地址

# chap4.6
duolist4_6 = ["我", "草",
              "爱", "他",  # 下续行保持相同缩进
              "你", "吗"]
# chap4.7
booleannum4_7 = True if (True or False) else False  # 返回True 三元运算符 括号可选省略 前是当真时的输出中是条件判断后是当假时的输出

# chap5.2
while False:  # while 返回布尔值的式
    continue  # 少用 不执行循环下位的语句开始下次循环 如果是最后iterate了呢?
else:  # while-else 当while一次进入用break出来(非正常退出)则else不会执行
    pass

# chap5.5
duolist5_5 = ["h", "w", "x"]
for listterm5_5_a in reversed(duolist5_5):  # reversed(list)就反转数列迭代 list则正
    for loopindex5_5 in range(10, 25, 1):  # range(开始, 结束(不包括), 步长(默认为1 爆栈就出错 可为-1即递减)) range(b[,e,n])
        for listindex5_5, listterm5_5_b in enumerate(duolist5_5, 0):
            # enumerate(list[, begin_index]) 输出对应一般 0-term1 1-term2...
            break  # 马上跳出最近的循环
        else:  # for-else 同理 for里的不正常退出会导致else不会执行
            pass
# python里的for第一感很想java里的for-each 支持nested嵌套

# chap7.1


def callfunction7_1(formalparameter7_1):  # 手写函数与上码隔空2行 手写函数请提前调用函数请往后 貌似只有在后行调用才有效吧
    # def 函数名(形參[,形參]...):
    #    raise NotImplementedError  # 调用error 码用
    return  # return不跟东西返回none 若跟则返回相应东西
callfunction7_1("actualparameter7_1")  # 函数名(对应的实參) 函数调用 但其实list啊iteratable?叫mutable

# -------------------------------------------------2016.10.2------------------------------------------------- #
import base64
print(base64.b64decode("XDY1XDc2XDY5XDZjXDYzXDZmXDczXDQwXDY3XDZkXDYxXDY5XDZjXDJlXDYzXDZmXDZk").decode())
# 差个原理

# chap8 有空再见zy


def callfunction8_1(formalparameter8_6, defaultvar8_6 = 9.08, *args, **kwargs):  # defaultvaribles可多可无随意 要置后
    """This is a docstring
    函数说明 可以由help(函数名)查阅 那么问题是重载函数该显示哪个呢?? 就近?
    """
    # *args (arbitrary argument list tuple) 接受0到多的值 **kwargs (keyword arguments) 接受0到多的字典类 像赋值式
    global quanjuvar8_1  # 在函数里声明一个全局变量 但不能同时赋值
    quanjuvar8_1 = 9.08  # 另外赋值 如果函数外也有同名变量则地址一样了哦
    globals()  # 返回当前的所有很多全局变量 dict型
    args  # 返回的是(9.8,) tuple型
    for key8_7, value8_7 in kwargs.items():  # kwargs 返回的是dict型 通过.items()对应key和value
        pass
    return 9.8, 9.08  # 函数可返回list或者tuple但不行多个东西若要则包装成tuple
returnFnval8_8, returnFnval8_8 = callfunction8_1(9.08, "09.08", 9.8, "9.80", zy9_6a=9.08, zy9_6b="9.08")
# 这样拆包tuple 但这里对应个数(同名)参数即后带前 返回9.08 若单参数则tuple型
locals()  # 返回当前的局部函数 dict型 若在main里即glocalvariables 检查用的


help(callfunction8_1)  # 直接进输出流 但是NoneType不支持任何东西只是值为None

# 到chap9
