package test;

import java.util.*;//这个是什么预处理 .*是全部 但只是一层的 像什么 xx.yy.zz的东西想全部就要 xx.yy.*（xx.*是不带zz的）

import javax.swing.*;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // 这里就是上面说的 awt.* 是不带awt.event.ActionListener的 当然想全部都带是可以awt.event.*;

public class study_log {
	public static void main(String[] args) {// 这个开头就记住吧 main一般都要的
		// 选择题我忘了。。 然后多做题 巴朗好像还不错 有些概念真的很容易混 分不清的时候可以多敲一下看结果然后记住哈哈

		System.out.println("换行的");// 好像只有这个主动带换行
		System.out.print("不换行");// print主要看好光标的位置就好了
								// 比如println光标就跳到下一行的开头那么字就那里开始输出
								// print就是在东西的后一位也就是紧跟它输出

		System.out.print("换行的\n");// 这个跟println等价 \叫做escape的什么东西 还有什么\t
		System.out.println();// 这里就是把光标跳到下一行 因为之前就在新的一行现在再跳一行 所以就空了一行
		System.out.printf("test %.2f\n%s\n%d\n%%\\\"\n", 1997.908, "zy", 98); //每个%一般跟一个字母就要对应后面的一个值 顺序要一样 如果是多个要拿逗号隔开 如果是没有%的即是直接打印出来像这里会是 test 1997.91什么什么
		// 这个是做format的要会一点还挺好用的 .2f是保留小数点后面2位 s是string d是整数 %%会返回%我也不知道为什么不是用\% \\返回\ \"返回s

		Scanner sc; // 这是叫declaration 没记错的话 就说这个参数sc是scanner class里的instance
		sc = new Scanner(System.in); // 这是叫initialization 把值给它 那些int double string也是 不然就是空的 也可以扫文件哦
		// 上面等价于Scanner sc = new Scanner(System.in)
		// int inputintva = sc.nextInt(); //这是int的输入流 print也就是输出流
		// 注意sc.next()只收空格、tab键、回车的第一个字符串（比如hi hello然后回车
		// 那么只会有hi然后hello会剩下流到下个输入流里）和sc.nextLine()是回车前的全部字符
		final String hehe = "shajisb"; // final就是常量不变量

		sc.close();

		// 数的运算和布尔值的运算也挺混的 有优先级 可以做些这类型的题 思路要清楚哪个先哪个后 乱了就从头来
		System.out.println(3 / 4); // 除法是地板除就是向下取整 但假如等式里有一个变量是double结果都会是double
									// http://www.cnblogs.com/gw811/archive/2012/10/13/2722752.html这个网可以看（优先级是1最高 也就是1的先运算） 自己写的时候不确定就拿() 题目判断的时候就记住些基本的hh
		System.out.println(true && false || !false);
		int a = (int) 1.56478; // 返回1 这叫强制cast int double这些都是基本类 string是集合类是有不同的 也是向下取整
		a++; // 等价于a += 1 跟++a不一样的地方在于 a++是在；之后（就是整一行执行完到下一行的时候值才会变 而++a是在句子执行的时候已经变了）
		//一般来说 如果一个statement只有一个a++;的话 就是说这一行只有a++; 那么这种时候a++; 一行是跟 ++a; 一行是等价的
		a = 3;
		System.out.println(4 == ++a); // 返回true 这个a一开始等于3 ++在前就直接看成a加完1之后的样子
										// 还有*=各种也是类似的道理
		String b = "z" + "y";// 返回zy 可以把两个加起来诶 但不能减啊乘啊除啊

		b.equals("字符比较用equal"); // equals跟==不一样 equals用于string .equals也是一种method
		b.toLowerCase();// 还有好多种方法呢string tolowercase的原理那些要搞清楚 是通过char类型
						// 然后编码是ascii 处理出来的

		System.out.println(Math.max(9, 8)); // 返回9 Math是个class原有的
											// 然后max(数，数)是一种Math的方法 还有很多什么
		// int abs(int n) 要会看这种表示 前面的一个int是说这个东西返回的类型 括号里的int是指参数的类型
		// 因为会有重载的情况所以abs里可以打double啊 但就是这样的了 而是 double abs(double n)

		Random rd = new Random();
		System.out.println(rd.nextInt(3)); // 随机出来的会有0 1 2 没有3 也只能是正数bound
											// 如果想要负数的只要对random之后返回的结果处理就好了（假设它的结果是n）比如-n
											// 若要偶数就2n
		boolean oneC = true;
		if (true) { // (条件)括号里的就是条件 条件为真则执行紧接着的{}里面的东西 但假如后面只有1句话（话是指; 有时候即使后面有很多行但只有一个;通常来说还是1句“话”）可以省略不用{} 看习惯吧 
					//一般建议加{}以免以后要在那1句话后面加点东西变成两句话就很容易出错
			if (true) { //在if里面还可以镶嵌一个if啊什么的叫nested   那么意义呢就是 要最前面的if条件为真然后这个if也是真的 那么就执行莫个东西
				; //但是如果就这两个if 就if里面镶一个if的话 是可以简化的 变成 if(前面的条件比如说正数 && 后面的条件比如说偶数) {能进来这里 说明 数都是正偶数}
				;
			} else {
				if (1 <= 2 && 2 <= 3) { // <=是指小于等于 !=是不等于哦 java里是不可以1<=2<=3的 要拆开就像前面条件里那样
					// else也是可以跟一个if的 就是上一个if false的时候来到else 因为else跟着个if 那个就判断这个if的条件 这种可以用来确定一个数大于0等于0小于0的情况
					;
					;
				} else { //else也可以跟if 但else永远只跟着上一个if（最最最近的）也就是最近的if条件为假则执行else里面的东西
					while (oneC){ //先讲条件里的oneC 在53行给了它值为true 那么这里的 （oneC 等价于 oneC == true）一般就用oneC就好了
						oneC = false; //只有条件为真才能进来这里 这里给个false 这样就不会死循环（条件恒为true 然后程序就只能在这里无限循环了 不要犯这样的错误！！）
						//所以while是这样的 程序看到了while 先判断条件对不对 true就进来{}这里执行的东西 执行完了（到 } 了） 这时再判断条件对不对 对就继续进来 false就不执行{}的东西了
						//比如说我这里oneC一开始是true的 进来{} 在里面oneC变成false了 执行完 while再判断条件oneC 现在oneC是false的了 所以就不进来{}了 继续下去些别的
					}
					for (int fori = 0; fori < 5; fori++){
						//这里注意条件的< 这里就会是01234（5次） 如果是<=则6次（012345） 一般不用!=在循环递增递减的时候
						//然后还要注意fori的scope 中文叫作用域好像 fori只在这个for里的{}括号里有用 在外面是没有这个参数名的 
						//然后如果外面也有一个fori在这的上面 那么就不能int fori 同个名字不能再声明一次 但可以直接fori = 0 这时候fori是全局变量 也就是我for里的对fori的操作是会有影响的 一般不建议这样做
						//那么有一个fori在这{}的后面 是没有任何影响的 但要int fori什么什么 可以理解为 刚好是同一个名字而已
						System.out.println("zy");
						//for(初始化一个值(一般是index拿来计数 让这个for循环执行多少次的)； 条件; 一次循环之后的动作){条件为真是进来执行的东西;}
						//这里就是 程序看到for 先初始化一个fori = 0 然后判断fori是不是小于5 是真的 进来打印zy 这时候到 } 了 执行fori++ 执行完了这时候fori等于1了 
						//再判断条件 fori还是小于5 所以再打印zy 一直一直跳过2 3 这时候fori等于4了 判断条件还是小于5 进来打印zy 打印完了++ 这时候fori等于5 再判断条件的时候为false 结束
						//这整个for下来 从fori等于0 1 2 3 4 条件一共对了5次 所以打印了5次的zy
						
						//那么for跟while什么时候用呢 靠感觉啊hhh while是灵活（只要条件对就循环了） for就没那么灵活（值要设定好 连增长的规律都设定好了）
						//所以一般有规律的比如说什么执行10次（这时候是不用算那个值了 当然值就是计数 指示着第几次）再比如说1997到2016 就用for好了   while一定要注意在{}里控制一下条件 让他什么时候自己变成false 不然会死循环
						;
					}
				}
			}
		}
 
		
		//break
		// 抽象类

		//list
		// cs里“返回”是个很重要的东西 简单来说就是某个动作之后的结果 有了这个结果就可以干很多很多东西

		// 面向对象主要讲 多态 继承 数据封装

	}
	
	public int fakeAddOne(int a){ // 这里可以理解为自己写的一个方法 是在main{}括号外面的
		//public是全局变量 还有private等下讲 还有abstract这个怪东西 当然还有很多
		//int是这个function（叫做函数不是数学里的函数）的返回类型 有了这个返回类型那么{}里一定要有 return 东西（这个东西的类型要跟类型对应一样） 如果是void就是不返回任何东西可以不用return 用return;最好在最后
		// fakeAddOne是这个函数的名字 不要是keyword的什么名字都可以
		//（）括号里的是形式參数 可以没有这个参数即func(){} 也可以有很多个形參 func(int a, int b, double c){} 要有它的类型
		a += 1; //这就是在main里打假设int a = 8; fakeAddOne(a) 这里呢两个a是不一样的 在函数里的a叫形參 在main里的是实參 实參会影响形參 但形參要不能直接影响实參需要要用别的方式 
		// 然后调用这个函数就跳来这里 这时候函数a=8 然后执行+=1 完了这时候a=9了 注意注意注意只是形參变了 在main里的实參没有没有没有改变 现在main里的a还是8！！！
		return -1; //这里return -1说明在main里 fakeAddOne(a)返回的是-1 就比如main里 a = fakeAddOne(a); 执行完了 a的值是-1
		//所以它叫fake嗯呢 那么真的怎么搞 就是return a;(注意这里前面是有a+=1的 所以返回形參的值给回去)就好了 当然这也不会直接影响main里的a 但是如果是这样return的话 a = fakeAddOne(a);这时a就加上了1 
		//这种好像string里的操作 就是复制出来的 而不是改变原本的 
		
	}
	public class classA extends JPanel{
		//一般来说class会在新建一个java里 但写在同一个也没问题 但是在class{里}在main{}外 注意大括号顺序 
		//如果没记错的话 考试好像是不考GUI的 
		// 然后这些jpanel啊jframe是要import的 叫javax.swing.*
		// jframe是个大的容器 里面可以装很多个jpanel 然后多个jpanel是有很多种布局layout的
		//extends implements throw
		// extends是继承的一种体现 implements也是继承 最大的不同大概就是implements要在{}定义所有父类的方法 extends不用 同时 extends只能继承一个父类 但implements跟着的是接口（可以是抽象的abstract）可以是很多个拿逗号隔开
		// 这里挺抽象的 extends比如说 jpanel jframe 而implements现在一般是接mouse或者keyboard的动作比如ActionListener
		// throws一般一开始很少见到 她是告诉编译器这里可能会抛出一个错误 后面跟比如IOException用于文件读写
		//gui
		public classA(int a){
			this(Color.black); //这里是this的用法 还有很多种用法 this意思就是这里的classA 所以这里就会调出她的重载calssA(Color bgc) 
			// 如果我没记错的话overload重载就是同个方法但由于参数的不同能实现类似但不完全相同的东西 
			//比如说这里如果main里初始化的是classA(0)就会来到这里然后默认颜色是黑 当然这时候只是给那个形參black还没画上去 如果是classA(Color.blue)就不会来到这里 而是下面那个classA(Color bgc){然后做里面的东西}
			switch (a){
			//这里故意用一下switch语句 switch (case) {} 这里的case一般为int char 吧。。 但注意不能是n+1（n是int）这种东西 
				case 0:
					System.out.println("z");
					// 假如a等于0的话 就会进来这里 打印z
					// 但注意这里没有break 一般是要的
				case 1:
					System.out.println("y");
					// 因为上面没有break 那么如果a等于0 程序会输出z 接着来到case1 紧跟着打印出y 如果a等于1 那么程序会直接来到这里输出y 因为有break那么直接执行完东西之后就可以跳出来了 
					break;
				case 2:
				case 3:
				case 4:
					System.out.println("zy");
					// 可以一直写很多个case 这里的意思是a等于2或3或4都会来到这里 打印出zy然后break 
					break;
				default:
					// default在switch里是可有可无的 看需要 这里的意思是如果a不是属于上面的如何一个case比如说5 那么就会来到这里 default其实可以不要braek因为她就是最后一个了 不过还是可以习惯break的
					break;
					}
			//那么这里介绍了一种break的用法 break还有很多常见的用法呢 比如跳出循环 
			
		}
		public classA(Color bgc){
			setBackground(bgc); //在这里 this.setBackground(bgc)跟这个是等价的
			Timer tm =new Timer(50, new MoveListener()); //这里有timer是一般精确的计时 可以理解为每隔50毫秒刷新一次动作 后面是初始化一个叫MoveListener的class
			//timer是在很多class都有的 一般会用swing里的
			tm.stop(); //让timer停止
			
		}
		public void paintComponent(Graphics g){ 	//这个就是父类的方法 参数是g g的类型是graphics 就是这样
			super.paintComponent(g); //super意思就是父类jpanel
			g.drawLine(0, 0, 1, 1); //这里是画一条线 还有很多这方法 
		}
		private class MoveListener implements ActionListener{ //这里就是前面timer的那个class 用到接口ActionListener这个接口只有1个方法就是actionPerformed 然后要自己写一次里面的东西
			public void actionPerformed(ActionEvent ae){ //参数名是可以改的 跟下面对应就好 但ae是actionevent class的
				
				try{
					//try catch一般是用来debug捕捉错误的 try{}里面是有可能会抛出错误的语句
					System.out.println(ae.getWhen()); //这里我随便打的 说ae也是可以做些东西的虽然我没怎么用过
				}catch(Exception e){ // catch(这里是写要抛出的错误 如果是捕捉全部的错误则Exception e) {那么如果有错误就会执行这里面的东西 而不是直接报红}
					System.out.println("我错了"); 
				}
				// trycatch的顺序是这样的 程序看到try 运行try{}里面的东西 如果在运行的时候发出了catch()里提到的错误 就执行catch(){}大括号里的东西 注意的是 在try里一行一行的运行一有要抛出的错误就不会执行后面的了 马上转catch
			    repaint(); //repaint()是要刷新一次画的东西 不然不会更新的 当然我这里没有再画别的东西 所以有没有都一样 
			    }

			
			}
	}
}


