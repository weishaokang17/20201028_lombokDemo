package per.wsk.$02.entity;

import lombok.*;

/**
 * @Author wb_weishaokang
 * @date 2020/10/30 4:13 下午
 * @description
 */
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Value(staticConstructor = "init")
public class Student {

    private int id;
    @NonNull
    private String name;
    private String className;//班级
    private boolean gender;
    private String subject;//科目


    /*
    @Value注解：
    相当于@getter，@AllArgsConstructor,@tostring,@EqualsAndHashCode四个注解的结合。
    @value注解只能用在类上，相当于为每个属性添加final声明，只提供getter方法，而不提供setter方法

    @value注解有一个属性：staticConstructor
    这个属性会指定把全参构造器放入一个静态方法中，并指定全参构造器的方法名。例如：
    @Value(staticConstructor = "init")

    等同于：
    public static Student init(int id,String name,String className,boolean gender,String subject){
        return new Student(id,name,className,gender,subject);
    }

    private Student(int id,String name,String className,boolean gender,String subject){
        this.id = id;
        this.name = name;
        this.className = className;
        this.gender = gender;
        this.subject = subject;
    }

     */


}
