package com.yk.utils;

import com.yk.entity.OpLog;

import java.util.Date;

public class LogUtils {

    public static OpLog addLog(Byte type, String msg){
        return new OpLog(type,new Date(),msg,Hruitls.getCurrent().getName() );
    }
}
