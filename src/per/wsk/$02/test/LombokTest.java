package per.wsk.$02.test;

import lombok.Cleanup;
import lombok.NonNull;
import lombok.Synchronized;
import lombok.val;
import org.junit.Test;
import per.wsk.$02.entity.Student;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author wb_weishaokang
 * @date 2020/10/30 4:18 下午
 * @description
 */
public class LombokTest {

    @Test
    public void test01(){
        //val  用在局部变量前面，相当于将变量声明为final。
        val sets = new HashSet<String>();
        //=>相当于如下
        final HashSet<String> sets2 = new HashSet<>();

        //下面这段代码编译报错。因为str是final修饰的，值不能更改。
        /*
        val str = new String("abc");

        str = "a";
        System.out.println(str);

         */
    }


    @Test
    public void test02(){
        /*Student student = new Student(1, "美国队长", "7班", true, "数学");
        System.out.println(student);

        Student student2 = new Student(2, "钢铁侠", "15班", true, "英语");

        System.out.println(student.equals(student2));*/

        Student student3 = Student.init(1, "美国队长", "7班", true, "数学");
        System.out.println(student3);

    }

    /*
    @NonNull注解：作用于下面的method3()方法的参数上， 参数不能为空。
     作用于Student类的name属性上，name属性不能为空。
     */
    @Test
    public void test03(){

        String result = method3("a", "null");
        System.out.println(result);

        Student student = Student.init(4, "雷神", "1班", true, "物理");
//        Student student2 = Student.init(4, null, "1班", true, "物理");

        System.out.println(student);
//        System.out.println(student2);
    }


    public static String method3(@NonNull String arg1,@NonNull String arg2){

        return null;
    }


    /*
    lombok中@Synchronized注解的作用：下面的第一个方法加上这个注解，就相当于下面的第二个方法。
    这个注解不是太重要。
     */
    @Synchronized
    public void synchronizedPrintln01() {
        System.out.println("***********************");
    }

    private final Object $lock = new Object();
    public void synchronizedPrintln02(){
        synchronized ($lock){
            System.out.println("***********************");
        }
    }

    /*
    @Cleanup
    注释可用于确保已分配的资源被释放,如IO的连接关闭。
    下面的第一个方法等价于第二个方法。
     */
    public void testCleanUp01() {
        try {
            @Cleanup ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.write(new byte[] {'Y','e','s'});
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void testCleanUp02() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                baos.write(new byte[]{'Y', 'e', 's'});
                System.out.println(baos.toString());
            } finally {
                baos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
