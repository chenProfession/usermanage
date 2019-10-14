package com.gsjk.user;

/**
 * @program: usermanagement
 * @Description: to get user information from data source
 * @author: Mr.Cheng
 * @date: 2019/10/9 4:02 下午
 */
public interface UserDao {
    /**
    * @Description: to find user by user name
    * @Param: [username]
    * @return: com.gsjk.user.UserInfo
    * @Author: Mr.Cheng
    * @Date: 2019/10/9 4:04 下午
    */
    public UserInfo findUserInfoByName(String username);

    /**
    * @Description: to register user in data source
    * @Param: [userInfo]
    * @return: int
    * @Author: Mr.Cheng
    * @Date: 2019/10/9 4:11 下午
    */ 
    public UserInfo registerUser(UserInfo userInfo);
}
