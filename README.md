# Java 8中的Optional 类型
在 Java 8中，我们可以使用 Optional 类型来表达可空的类型。

```java
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


```

运行输出：

```
3
0
```

但是，这样的代码，依然不是那么地优雅。

针对这方面 Groovy 提供了一种安全的属性/方法访问操作符 ?.
```
user?.getUsername()?.toUpperCase();
```
Swift 也有类似的语法, 只作用在  Optional 的类型上。

# Kotlin 中的可空类型

上面 Java 8的例子，用 Kotlin 来写就显得更加简单优雅了：

```kotlin
package com.easy.kotlin

fun main(args: Array<String>) {
    println(strLength(null))
    println(strLength("abc"))
}

fun strLength(s: String?): Int {
    return s?.length ?: 0
}
```


其中，我们使用 String? 同样表达了 Optional<String>的意思，相比之下，哪个更简单？

一目了然。

还有Java 8 Optional 提供的orElse

```java
s.orElse("").length();
```

这个东东，在 Kotlin 是最最常见不过的 Elvis 运算符了：

```kotlin
s?.length ?: 0
```

相比之下，还有什么理由继续用 Java 8 的 Optional 呢？

Kotlin 中的明星符号

```
??????????????????????????????????????
?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?: ?:
?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?. ?.
```


示例源代码工程Github 地址：

https://github.com/EasyKotlin/java_optional_vs_kotlin_nullable_type
