[返回目录](/README.md)

# Function

java.util.function.Function&lt;T, R&gt; 接口定义了一个叫作 apply 的方法，它接受一个

如果你需要定义一个Lambda，将输入对象的信息映射

在下面的

```
@FunctionalInterface
public interface Function<T, R>{
    R apply(T t);
}
```

```
public class FunctionTest {

    public static <T,R>List<R> map (List<T> list, Function<T,R> func){
        List<R> result = new ArrayList<>();
        for (T s :list){
            result.add( func.apply(s));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("lambdas", "in", "action");
        List<Integer> map = map(strings, String::length);
        System.out.println(map);
    }
}
```

[返回目录](#)
