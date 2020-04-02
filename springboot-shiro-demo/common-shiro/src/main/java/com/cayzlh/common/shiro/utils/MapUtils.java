package com.cayzlh.common.shiro.utils;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Map;

/**
 * @author Ant丶
 * @date 2018-11-06.
 */
public class MapUtils {
    @SuppressWarnings("unchecked")
    public static <T> T get(Map<?, ?> map, Object key) {
        if (map == null) {
            return null;
        }
        Object value = map.get(key);
        try {
            return value != null ? (T) value : null;
        } catch (Exception e) {
            return null;
        }
    }

    public static <K> String getString(final Map<? super K, ?> map, final K key) {
        if (map != null) {
            final Object answer = map.get(key);
            if (answer != null) {
                return answer.toString();
            }
        }
        return null;
    }

    public static <K> Boolean getBoolean(final Map<? super K, ?> map, final K key) {
        if (map != null) {
            final Object answer = map.get(key);
            if (answer != null) {
                if (answer instanceof Boolean) {
                    return (Boolean) answer;
                }
                if (answer instanceof String) {
                    return Boolean.valueOf((String) answer);
                }
                if (answer instanceof Number) {
                    final Number n = (Number) answer;
                    return n.intValue() > 0 ? Boolean.TRUE : Boolean.FALSE;
                }
            }
        }
        return null;
    }

    public static <K> Number getNumber(final Map<? super K, ?> map, final K key) {
        if (map != null) {
            final Object answer = map.get(key);
            if (answer != null) {
                if (answer instanceof Number) {
                    return (Number) answer;
                }
                if (answer instanceof String) {
                    try {
                        final String text = (String) answer;
                        return NumberFormat.getInstance().parse(text);
                    } catch (final ParseException e) {
                        // failure means null is returned
                    }
                }
            }
        }
        return null;
    }

    public static <K> Byte getByte(final Map<? super K, ?> map, final K key) {
        final Number answer = getNumber(map, key);
        if (answer == null) {
            return null;
        }
        if (answer instanceof Byte) {
            return (Byte) answer;
        }
        return answer.byteValue();
    }

    public static <K> Short getShort(final Map<? super K, ?> map, final K key) {
        final Number answer = getNumber(map, key);
        if (answer == null) {
            return null;
        }
        if (answer instanceof Short) {
            return (Short) answer;
        }
        return answer.shortValue();
    }

    public static <K> Integer getInteger(final Map<? super K, ?> map, final K key) {
        final Number answer = getNumber(map, key);
        if (answer == null) {
            return null;
        }
        if (answer instanceof Integer) {
            return (Integer) answer;
        }
        return answer.intValue();
    }

    public static <K> Long getLong(final Map<? super K, ?> map, final K key) {
        final Number answer = getNumber(map, key);
        if (answer == null) {
            return null;
        }
        if (answer instanceof Long) {
            return (Long) answer;
        }
        return answer.longValue();
    }

    public static <K> Float getFloat(final Map<? super K, ?> map, final K key) {
        final Number answer = getNumber(map, key);
        if (answer == null) {
            return null;
        }
        if (answer instanceof Float) {
            return (Float) answer;
        }
        return answer.floatValue();
    }

    public static <K> Double getDouble(final Map<? super K, ?> map, final K key) {
        final Number answer = getNumber(map, key);
        if (answer == null) {
            return null;
        }
        if (answer instanceof Double) {
            return (Double) answer;
        }
        return answer.doubleValue();
    }
}
