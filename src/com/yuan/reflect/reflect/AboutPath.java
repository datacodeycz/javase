package com.yuan.reflect.reflect;

/*

关于文件路径问题
 */
public class AboutPath {
    public static void main(String[] args) throws  Exception{
        // 这种方式得路径缺点时：移植性差，在IDEA中默认得当前路径时project得根
        //这个代码假设离开了IDEA，换到了其他位置，可能当前路径就不是project的根了，这时这个路径就无效了
        //FileReader reader = new FileReader("java01/src/");
        //通用的路径
        //注意：使用以下通用方式的前提时：这个文件必须在类路径下。
        //就是在src下
        //src就是类的根路径

        /*
        解释：
            Thread.currentThread() 当前线程对象
            getContextClassLoader() 是线程对象的方法，可以获取到当前线程的类加载器对象
            getResource() 【获取资源】 这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源。
         */
        String path = Thread.currentThread().getContextClassLoader().
                getResource("classinfo2.properties").getPath();
        System.out.println(path);
        // 采用以上的代码可以拿到一个文件的绝对路径。
//      //file:/E:/code_data/java/java01/out/production/java01/classinfo2.properties
    }
}
