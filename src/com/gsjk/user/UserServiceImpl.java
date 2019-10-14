package com.gsjk.user;

import com.gsjk.result.Result;

/**
 * @program: usermanagement
 * @Description: implement user service
 * @author: Mr.Cheng
 * @date: 2019/10/9 3:58 下午
 */
public class UserServiceImpl implements UserService {
    /**
     * @param userinfo
     * @Description: to login the system
     * @Param: [userinfo]
     * @return: com.gsjk.result.Result
     * @Author: Mr.Cheng
     * @Date: 2019/10/9 3:56 下午
     */
    @Override
    public Result login(UserInfo userinfo) {

        return null;
    }

    /**
     * @param userInfo
     * @Description: to register the new user
     * @Param: [userInfo]
     * @return: com.gsjk.result.Result
     * @Author: Mr.Cheng
     * @Date: 2019/10/9 3:58 下午
     */
    @Override
    public Result register(UserInfo userInfo) {
        UserDaoImpl userDao = new UserDaoImpl();
        boolean register = userDao.saveUser(userInfo);
        Result result = new Result(404,"can not save");
        if(register){
            result.setResultcode(200);
            result.setResultmessage("saved");
        }
        return result;
    }
}
