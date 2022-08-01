package per.wsk.$03.entity;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * @Author wb_weishaokang
 * @date 2020/11/2 11:37 上午
 * @description
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Setter
@Getter
@Accessors(fluent=true)
//@Accessors(prefix = "c")
@RequiredArgsConstructor
public class Student {

    private long id;
    @NonNull//注意：这个注解作用在属性上，表示如果通过带参构造器或set方法给这个属性赋值时，不能传空。但如果没有给这个
    private String name;//属性赋值，这个属性默认值是null，此时不会报错的。例如如果调用无参构造器，此时该属性默认值是null。编译和运行都不报错。
    private String className;

    /*
    @Accessors注解：用于配置getter和setter方法的生成结果
    可以作用在类上和字段名上。
    ①fluent属性 fluent的中文含义是流畅的，设置为true 则 生成的get/set方法则没有 set/get 前缀，默认为 false
    ②chain属性 chain的中文含义是链式的，为一个布尔值，如果为true生成的set方法返回this，为false生成的 set 方法是 void 类型。
    默认为 false，但是当 fluent属性 为 true时，chain 默认则为 true 。
    ③prefix属性：可以指定前缀，生成 get/set 方法时会去掉指定的前缀。例如作用在类上面的prefix="c",
    那么此时cOuntry属性的set和get方法是：instance.setOuntry("XXX"),而且因为注解在类上，不在某一个字段上，
    所以此时，每一个属性都应该是c开头，而且第二个字母必须大写。否则在进行set/get方法时会报错。
    这个prefix属性很少用到。
     */

    private String cOuntry;


    /*
    @RequiredArgsConstructor：注解在类上；
    为类提供一个部分参的构造方法(使用类中所有带有@NonNull注解的或者带有final修饰的成员变量生成对应的构造方法)
     */
}
