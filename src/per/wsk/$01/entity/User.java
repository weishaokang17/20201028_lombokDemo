package per.wsk.$01.entity;


import lombok.*;

import java.util.Date;

/**
 * @Author wb_weishaokang
 * @date 2020/10/28 2:50 下午
 * @description
 */

@AllArgsConstructor
@NoArgsConstructor
//@NoArgsConstructor(access= AccessLevel.PROTECTED,staticName = "getInstance")
//@Data
@Getter
@Setter
//@ToString
//@ToString(includeFieldNames=false,exclude={"id","birthday"},callSuper = true)
@ToString(includeFieldNames = true,of = {"id","name","password"},callSuper = true)
@EqualsAndHashCode
public class User extends Person{

    /*
    @Getter  作用在类上或成员变量上，生成对应的 getter 方法
    @Setter  作用在类上或成员变量上，生成对应的 setter 方法
    @ToString	作用在类上，生成对应的 toString 方法
    @EqualsAndHashCode	作用在类上，生成对应的 equals 和 hashCode 方法
    @Data	作用在类上，效果等同于上述 4 个注解

    @NoArgsConstructor	作用在类上，生成对应的无参构造方法
    @AllArgsConstructor	作用在类上，生成对应的有参构造方法

    @Log4j/@Slf4j	作用在类上，生成对应的 Logger 对象，变量名为 log
    */


    private int id;

    //getter注解，
    // ① 注解中的value属性是设置访问权限是public module protected package private,默认是public
    // ② 注解中的lazy属性为true表示懒加载,默认是false
    // ③ 针对boolean类型的属性，getter注解对应的是isXxx()方法，不是getXxx()方法
    @Getter(value= AccessLevel.MODULE,lazy = false)
    private String name;

    //setter注解，
    // ①注解中的value属性是设置访问权限是public module protected package private
    @Setter(value=AccessLevel.PUBLIC)
    private String password;


    private Date birthday;

    private boolean gender;


    /*
    @NoArgsConstructor注解：给实体类无参构造器
    ①access属性：设置访问权限是public module protected package private,默认是public
    ②staticName属性：这个属性会把该无参构造器变成静态方法。
    例如上面的：@NoArgsConstructor(access= AccessLevel.PROTECTED,staticName = "getInstance")
    等价于：
    protected static User getInstance(){
        return new User();
    }
    private User(){

    }

     */

    /*
    @AllArgsConstructor注解：给实体类全参构造器
    ①access属性：设置访问权限是public module protected package private,默认是public
    ②staticName属性：这个属性会把该全参构造器变成静态方法。
    例如：@AllArgsConstructor(access= AccessLevel.PROTECTED,staticName = "getInstance")
    等价于：(参数顺序按照属性定义的顺序)
    protected static User getInstance(int id,String name,String password,Date date,boolean gender){
        return new User();
    }
    private User(int id,String name,String password,Date date,boolean gender){
        this.id = id;
        this.name = name;
        this.password = password;
        this.date = date;
        this.gender = gender;
    }
     */




    /*
    @ToString：
    生成 toString 方法，默认情况下，会输出类名、所有属性，属性按照顺序输出，以逗号分割。
    例如当前类名上面的：
    @ToString(includeFieldNames=false,exclude={"id","birthday"},callSuper = true)
    @ToString(includeFieldNames = true,of = {"id","name","password"},callSuper = true)

    ①includeFieldNames属性： 是否包含字段名称,默认为true
    ②callSuper属性： 是否输出父类的toString方法,默认为false
    ③exclude属性： 排除生成tostring的字段
    ④of属性： 仅使用哪些属性, 即生成tostring的字段（与exclude属性相反）
    ⑤doNotUseGetters属性：默认为false，表示获取字段值时通过get方法获取，设置为true表示直接通过字段获取
    这个属性不是太重要
     */


    /*
    @EqualsAndHashCode：
    该注解生成equals()方法和hashCode()方法。
    ①callSuper属性： 父类的属性是否参与equals()和toString()方法,默认为false
    ②exclude属性：排除哪些属性不参与equals()和toString()方法、
    ③of属性：仅使用哪些属性,参与equals()和toString()方法
    ④doNotUseGetters属性：默认为false，表示获取字段值时通过get方法获取，设置为true表示直接通过字段获取
    这个属性不是太重要
     */
}
