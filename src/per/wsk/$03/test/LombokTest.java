package per.wsk.$03.test;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import per.wsk.$03.entity.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @Author wb_weishaokang
 * @date 2020/11/2 11:39 上午
 * @description
 */
//@Slf4j
public class LombokTest {

    @Test
    public void test01(){
        Student instance = new Student();
        System.out.println(instance);
        System.out.println(instance.id(14).name("拿破仑").className("7班"));
        /*instance.setOuntry("中国");
        instance.setId(27);
        instance.setName("华盛顿");
        instance.setClassName("17班");
        instance.setCountry("美国");
        System.out.println(instance);*/
    }

    @Test
    public void test02(){
        Student student = new Student("希特勒");
        System.out.println(student);
    }




    /*
    @CommonsLog Creates log = org.apache.commons.logging.LogFactory.getLog(LogExample.class);

    @Log Creates log = java.util.logging.Logger.getLogger(LogExample.class.getName());

    @Log4j Creates log = org.apache.log4j.Logger.getLogger(LogExample.class);

    @Log4j2 Creates log = org.apache.logging.log4j.LogManager.getLogger(LogExample.class);

    @Slf4j Creates log = org.slf4j.LoggerFactory.getLogger(LogExample.class);

    @XSlf4j Creates log = org.slf4j.ext.XLoggerFactory.getXLogger(LogExample.class);

    例如：@Slf4j 为类提供一个 属性名为log 的 slf4j 日志对象
    @Test
    public void test03(){
        log.info("你好");
    }
    等价于：
    public static Logger log = LoggerFactory.getLogger(LombokTest.class);
    @Test
    public void test03(){
        log.info("你好");
    }

    同理，@Log4j 为类提供一个属性名是log的 log4j 日志对象，等等。
     */




    /*
    @SneakyThrows
    自动抛受检异常，而无需显式在方法上使用 throws 语句
     */
    @SneakyThrows
    public void read01(){
        InputStream inputStream = new FileInputStream("");
    }
    //等价于：
    public void read02() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("");
    }

}
