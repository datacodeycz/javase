package com.yuan.io;

import java.io.*;

/*
目录拷贝
 */
public class CopyAll {
    public static void main(String[] args) {
        //源目录
        File srcFile = new File("D:\\考研内容\\专业课\\编程语言\\Java\\JavaSE\\笔记");
        //目标目录
        File destFile = new File("E:\\班级文件");
        //拷贝方法
        copyDir(srcFile,destFile);

    }

    /**
     *
     *拷贝目录
     * @param srcFile 拷贝源
     * @param destFile 拷贝目标
     */
    private static void copyDir(File srcFile, File destFile) {

        if(srcFile.isFile()){
            //srcFile如果是一个文件的话，递归结束。
            //是文件的时候需要拷贝。
            // ……一边读一边写
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                //读这个文件
                in  = new FileInputStream(srcFile);
                //写这个代码
                String path = destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\" + srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);
                byte[] bytes = new byte[1024 * 1024]; //一次复制1MB
                int readCount = 0;
                while((readCount = in.read(bytes)) != -1){
                    out.write(bytes,0,readCount);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally{
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        //获取源下面的子目录
        File[] files = srcFile.listFiles();
        for(File file : files){
            //获取所有文件的（包括目录和文件）绝对路径
            // System.out.println(file.getAbsolutePath());
            if(file.isDirectory()){
                //新建对应的目录
                //System.out.println(file.getAbsolutePath());
                //D:\考研内容\专业课\编程语言\Java\JavaSE\笔记  源目录
                //E:\班级文件 目标目录
                String srcDir = file.getAbsolutePath();

                String destDir = destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\" + srcDir.substring(3);

                File newFile = new File(destDir);
                if(!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            //递归调用
            copyDir(file,destFile);


        }

    }
}
