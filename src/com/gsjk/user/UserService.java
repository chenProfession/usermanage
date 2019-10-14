package com.gsjk.user;

import com.gsjk.result.Result;

/**
 * @program: usermanagement
 * @Description: declare user interface
 * @author: Mr.Cheng
 * @date: 2019/10/9 3:49 下午
 */
public interface UserService {
    /**
    * @Description: to login the system
    * @Param: [userinfo]
    * @return: com.gsjk.result.Result
    * @Author: Mr.Cheng
    * @Date: 2019/10/9 3:56 下午
    */ 
   public Result login(UserInfo userinfo);
   
   /**
   * @Description: to register the new user
   * @Param: [userInfo]
   * @return: com.gsjk.result.Result
   * @Author: Mr.Cheng
   * @Date: 2019/10/9 3:58 下午
   */ 
   public Result register(UserInfo userInfo);
}
