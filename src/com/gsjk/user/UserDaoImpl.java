package com.gsjk.user;

import com.gsjk.DefaultValue.DefaultValue;

import java.io.*;

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
        UserInfo userInfo = new UserInfo();
        try {
            if (username == null || username.length() == 0) {
                throw new Exception();
            }
            String filename = DefaultValue.FILEPATH + username + DefaultValue.FILETYPE;
            File file =new File(filename);
            if(!file.exists()){
                throw new Exception();
            }
            BufferedReader in = new BufferedReader(new FileReader(file));
            String findName = in.readLine();
            String findPassword = in.readLine();
            userInfo.setUsername(findName);
            userInfo.setPassword(findPassword);
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return userInfo;
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
            String content = userInfo.getUsername() + "\n" + userInfo.getPassword();
            File file =new File(filename);
            if(file.exists()){
                throw new Exception();
            }
            file.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
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
