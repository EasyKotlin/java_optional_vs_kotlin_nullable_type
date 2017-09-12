package com.easy.kotlin;

import java.util.Optional;

import static java.lang.System.out;

/**
 * Optional.ofNullable - 允许传递为 null 参数
 * Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
 * Optional<String> b = Optional.of(s);
 */
public class Java8OptionalDemo {

    public static void main(String[] args) {
        out.println(strLength(Optional.of("abc")));
        out.println(strLength(Optional.ofNullable(null)));
    }

    static Integer strLength(Optional<String> s) {
        return s.orElse("").length();
    }
}
