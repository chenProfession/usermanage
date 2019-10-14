import com.gsjk.result.Result;
import com.gsjk.user.UserInfo;
import com.gsjk.user.UserServiceImpl;

import java.util.Scanner;

/**
 * @program: usermanagement
 * @Description: main function
 * @author: Mr.Cheng
 * @date: 2019/10/9 1:54 下午
 */
public class Management {
    public static void main(String[] args){
        int choose = 5;
        do{
            UserServiceImpl userService = new UserServiceImpl();
            System.out.println("\nPlease choose the options below:");
            System.out.println("1.login  2.register  3.forget password  4.exit");
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    UserInfo userLogin = new UserInfo();
                    System.out.println("Please enter user name:");
                    userLogin.setUsername(scanner.next());
                    System.out.println("Please enter user password:");
                    userLogin.setPassword(scanner.next());
                    Result resultLogin = userService.login(userLogin);
                    System.out.println(resultLogin.getResultmessage());
                    break;
                case 2:
                    UserInfo userRegister = new UserInfo();
                    System.out.println("Please enter user name:");
                    userRegister.setUsername(scanner.next());
                    System.out.println("Please enter user password:");
                    userRegister.setPassword(scanner.next());
                    Result resultRegister = userService.register(userRegister);
                    System.out.println(resultRegister.getResultmessage());
                    break;
                case 3:
                    System.out.println("Please enter user name:");
                    break;
                case 4:
                    choose = 6;
                    break;
                default:
                    System.out.println("incorrect!");
            }
        }while(choose < 6);
    }
}
