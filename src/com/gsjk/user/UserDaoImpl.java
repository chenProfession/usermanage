package com.gsjk.user;

import com.gsjk.DefaultValue.DefaultValue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
        // get user information from the files

        return null;
    }

    /**
     * @param userInfo
     * @Description: to register user in data source
     * @Param: [userInfo]
     * @return: boolean
     * @Author: Mr.Cheng
     * @Date: 2019/10/9 4:11 下午
     */
    @Override
    public boolean saveUser(UserInfo userInfo) {
        // save user information in txt file which is named by user name
        boolean result = false;
        try {
            if (userInfo.getUsername() == null || userInfo.getUsername().length() == 0) {
                throw new Exception();
            }
            String filename = DefaultValue.FILEPATH + userInfo.getUsername() + DefaultValue.FILETYPE;
            System.out.println(filename);
            String content = userInfo.getUsername() + "\n" + userInfo.getPassword();
            BufferedWriter out = new BufferedWriter(new FileWriter(userInfo.getUsername()+DefaultValue.FILETYPE));
            out.write(content);
            out.close();
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
