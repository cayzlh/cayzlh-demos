package com.cayzlh.demos.mybatistechnologyinsider.resolvetype;

import java.util.Map;
import lombok.Data;

/**
 * @author Ant丶
 * @date 2020-06-06.
 */
@Data
public class ClassA<K,V> {
    protected Map<K,V> map;
}
