package com.yk.utils;

import com.yk.entity.Employee;
import com.yk.entity.datas.DataModel;

import java.util.*;

/**
 * 返回数据工具类
 */
public class Datauitls {

    public static List<DataModel> getDataView(List<Employee> list, Object obj) {
        List<DataModel> dataModels = new ArrayList<>();
         Map<String, Integer> data = new HashMap<>();

        list.stream().forEach(o -> {
            Arrays.stream(o.getClass().getFields()).forEach(field -> {
                System.out.println(field);
                System.out.println(field.getName() +obj.getClass().getName());

               if (field.getName().equals( obj.getClass().getName())){
                   try {
                       Object timeobj = new Object();
                       timeobj = field.get(obj);
                       String name = (String)timeobj.getClass().getField("name").get(null);
                       if (! data.containsKey(timeobj) ) {
                           data.put(name,  1);
                       }else {
                           data.put(name, data.get(name) + 1);
                       }
                   } catch (IllegalAccessException e) {
                       e.printStackTrace();
                   } catch (NoSuchFieldException e) {
                       e.printStackTrace();
                   }
               }
            });
        });
        data.forEach( (o1, o2) ->{
            dataModels.add( new DataModel(o1, o2));
            System.out.println(o1 + o2);
        });
        return dataModels;
    }

}
