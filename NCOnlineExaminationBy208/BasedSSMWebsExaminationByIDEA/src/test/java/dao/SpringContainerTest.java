package dao;

import com.exam.service.IExamClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 *  App版本Spring容器查看清单
 *  @author: Gary SU
 *  @Date: 2019/9/22 7:25
 *  @Description: 加载spring配置文件，查看容器对象清单
 */
public class SpringContainerTest {

    public static void main(String args[]) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        String[] str=context.getBeanDefinitionNames();
        for (String string : str) {
            System.out.println("..."+string);
        }

        //获取指定类型的对象
        //Object obj= context.getType("ExamClassServiceImpl");
        Object obj2 = context.getBean("examClassServiceImpl");
        System.out.println("----"+obj2);

    }
}
