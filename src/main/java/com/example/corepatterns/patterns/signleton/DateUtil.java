package com.example.corepatterns.patterns.signleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

    private DateUtil() {
    }

    public static volatile DateUtil instance;

    public static DateUtil getInstance() {
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null)
                    return instance = new DateUtil();
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
