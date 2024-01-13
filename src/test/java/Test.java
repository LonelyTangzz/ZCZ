//import cn.hutool.core.io.FileUtil;

import cn.hutool.core.bean.BeanUtil;
import com.peter.contoller.TestController;

import java.io.File;

//@SpringBootTest

public class Test {


    public void test() {
        String filePath = "CLASSPATH:";
//        File file = FileUtil.file(filePath);
        System.out.println("end");
    }

    public static void main(String[] args) {

        BeanUtil.hasGetter(TestClass.class);
    }

}
