package com.example.corepatterns.patterns.creational.signleton;

import java.io.*;

public class Test {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(new File("/Users/pioneersacademy/Documents/projects/singelton/dateUtil.ser")));
        oss.writeObject(dateUtil1);

        DateUtil dateUtil2 = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream((new File("/Users/pioneersacademy/Documents/projects/singelton/dateUtil.ser"))));
        dateUtil2 = (DateUtil) ois.readObject();

        oss.close();
        ois.close();
        System.out.println(dateUtil1 == dateUtil2);
    }


}
