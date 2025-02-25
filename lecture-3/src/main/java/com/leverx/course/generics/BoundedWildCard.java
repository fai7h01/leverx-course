package com.leverx.course.generics;

import java.util.List;

public class BoundedWildCard {

    public static <T extends AutoCloseable> void closeAll(List<T> elements) throws Exception{
        for (T element : elements) {
            element.close();
        }
    }


}
