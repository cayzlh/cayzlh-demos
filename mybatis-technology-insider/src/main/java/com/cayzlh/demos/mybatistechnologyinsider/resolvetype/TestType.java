package com.cayzlh.demos.mybatistechnologyinsider.resolvetype;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Ant丶
 * @date 2020-06-06.
 */
public class TestType {

    SubClassA<Long> sa = new SubClassA();

    public static void main(String[] args) throws NoSuchFieldException {
        Field f = ClassA.class.getDeclaredField("map");
        System.out.println(f.getGenericType());
        System.out.println(f.getGenericType() instanceof ParameterizedType);
        // 输出：
        // java.util.Map<K, V>
        // true

        // 解析SubA<Long>(ParameterizedType类 型)中的map字段，注意:ParameterizedTypelmpl是
        // 在 sun.reflect.generics.reflectiveObjects 包下的 ParameterizedType接口实 现

        Type type = TypeParameterResolver.resolveFieldType(f, ParameterizedTypelmpl
                .make(SubClassA.class, new Type[]{Long.class}, TestType.class));

        //也可以使用下面的方式生成上述ParameterizedType对 象，
        // 并 调 用 TypeParameterResolver.resolveFieldType ()方 法 :
        //
        // TypeParameterResolver.resolveFieldType(f,
        // TestType.class.getDeclaredField("sa").getGenericType());
        System.out.println(type.getClass());
        // 输 出 :class TypeParameterResolver$ParameterizedTypelmpl

        // 注意，TypeParameterResolver$ParameterizedTypeImpl是ParameterizedType接口的实 现
        ParameterizedType p = (ParameterizedType) type;
        System.out.println(p.getRawType());
        // 输 出 :interface java.util.Map

        System.out.println(p.getOwnerType());
        // 输 出:null

        for (Type t : p .getActualTypeArguments()) {
            System.out.println(t);
        }
        //输 出:
        // class java.lang.Long
        // class java.lang.Long

    }

}
