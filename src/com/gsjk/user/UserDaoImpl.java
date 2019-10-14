package com.gsjk.user;

/**
 * @program: usermanagement
 * @Description: to implement user dao to get data
 * @author: Mr.Cheng
 * @date: 2019/10/9 5:47 下午
 */
public class UserDaoImpl implements UserDao {
    /**
     * @param username
     * @Description: to find user by user name
     * @Param: [username]
     * @return: com.gsjk.user.UserInfo
     * @Author: Mr.Cheng
     * @Date: 2019/10/9 4:04 下午
     */
    @Override
    public UserInfo findUserInfoByName(String username) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        userDaoImpl.findUserInfoByName(username);
        return null;
    }

    /**
     * @param userInfo
     * @Description: to register user in data source
     * @Param: [userInfo]
     * @return: int
     * @Author: Mr.Cheng
     * @Date: 2019/10/9 4:11 下午
     */
    @Override
    public UserInfo registerUser(UserInfo userInfo) {
        return null;
    }
}
