package per.wsk.$04.test;

import org.junit.Test;
import per.wsk.$04.entity.Student;
import per.wsk.$04.entity.Student02;

/**
 * @Author wb_weishaokang
 * @date 2020/11/2 3:59 下午
 * @description
 */
public class LombokTest {

    /*
    @Build注解：构建 建造者模式
    即下面Student类中和Student02类里面的写法都是一样的。
     */
    @Test
    public void test01(){
        Student student = Student.builder().name("hresh").age(22).build();
        Student02 student02 = Student02.builder().name("李白").age(37).build();

        System.out.println(student);
        System.out.println(student02);
    }

}
