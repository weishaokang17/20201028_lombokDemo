package per.wsk.$01.test;

import org.junit.Test;
import per.wsk.$01.entity.User;

import java.util.Date;

/**
 * @Author wb_weishaokang
 * @date 2020/10/28 3:01 下午
 * @description
 */
public class LombokTest {

    @Test
    public void test01(){
        User user = new User();
        user.setId(10007);
        user.setName("万磁王");
        user.setBirthday(new Date());
        user.setPassword("***************");
        user.setGender(true);
        //去掉User类的@Data注解后，toString和equals都是调用的Object中的方法
        System.out.println(user.toString());

        User user2 = new User();

        user.equals(user2);

    }


    @Test
    public void test02(){
        User user = new User(1,"黑凤凰","TTTTTTTTTT",new Date(),false);
        user.isGender();

        System.out.println(user);
        // User(super=Person(heigth=0.0), 黑凤凰, TTTTTTTTTT, false)
        //User(super=Person(heigth=0.0), id=1, name=黑凤凰, password=TTTTTTTTTT)
    }




}
