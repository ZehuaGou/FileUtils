package com.paul.fileutils.utils;


import java.io.File;

public class FileRenameUtil {

    public void reName(String path) {
        File f = new File(path);
        File[] fs = f.listFiles();
        for (File subFile : fs) {
            // 如果文件是文件夹则递归调用批量更改文件后缀名的函数
            if (subFile.isDirectory()) {
                reName(subFile.getPath());
            } else {
                String name = subFile.getName();
                String to = KeyUtil.genUniqueKey();
                int index = name.lastIndexOf(".");
                if (name.toLowerCase().endsWith("png")) {
                    subFile.renameTo(new File(subFile.getParent() + "/" + to + name.substring(index)));
                } else if (name.toLowerCase().endsWith("jpg")) {
                    subFile.renameTo(new File(subFile.getParent() + "/" + to + name.substring(index)));
                } else if (name.toLowerCase().endsWith("jpeg")) {
                    subFile.renameTo(new File(subFile.getParent() + "/" + to + name.substring(index)));
                }
            }
        }
    }
}
