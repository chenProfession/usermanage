import com.gsjk.result.Result;
import com.gsjk.user.UserInfo;
import com.gsjk.user.UserServiceImpl;

/**
 * @program: usermanagement
 * @Description: main function
 * @author: Mr.Cheng
 * @date: 2019/10/9 1:54 下午
 */
public class Management {
    public static void main(String[] args){
        UserInfo user = new UserInfo();
        user.setUsername("Jame");
        user.setPassword("123456");

        UserServiceImpl userService = new UserServiceImpl();
        Result result = userService.register(user);
        System.out.println(result.getResultmessage());
    }
}
