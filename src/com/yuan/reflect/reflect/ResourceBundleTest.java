package com.yuan.reflect.reflect;

import java.util.ResourceBundle;

/*
java.util包下提供一个资源绑定器，便于获取属性配置文件中的内容。
使用以下这种方式的时候，属性配置文件xxx.properties必须放在类路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {

        // 资源绑定器，只能绑定xxx.properties文件。并且这个文件必须在类路径下。文件格式必须是.properties
        //并且在写路径的时候，路径后面的扩展名不能写
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");

        String className = bundle.getString("className");
        System.out.println(className);

    }
}

/*
关于JDK中自带的类加载器：（聊一聊，不需要掌握，知道当然最好！）
	什么是类加载器？
		专门负责加载类的命令/工具。
		ClassLoader

	JDK中自带了3个类加载器
		启动类加载器:rt.jar
		扩展类加载器:ext/*.jar
		应用类加载器:classpath

	假设有这样一段代码：
		String s = "abc";

		代码在开始执行之前，会将所需要类全部加载到JVM当中。
		通过类加载器加载，看到以上代码类加载器会找String.class
		文件，找到就加载，那么是怎么进行加载的呢？

			首先通过“启动类加载器”加载。
				注意：启动类加载器专门加载：C:\Program Files\Java\jdk1.8.0_101\jre\lib\rt.jar
				rt.jar中都是JDK最核心的类库。

			如果通过“启动类加载器”加载不到的时候，
			会通过"扩展类加载器"加载。
				注意：扩展类加载器专门加载：C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\*.jar


			如果“扩展类加载器”没有加载到，那么
			会通过“应用类加载器”加载。
				注意：应用类加载器专门加载：classpath中的类。

	java中为了保证类加载的安全，使用了双亲委派机制。
		优先从启动类加载器中加载，这个称为“父”
		“父”无法加载到，再从扩展类加载器中加载，
		这个称为“母”。双亲委派。如果都加载不到，
		才会考虑从应用类加载器中加载。直到加载
		到为止。

 */