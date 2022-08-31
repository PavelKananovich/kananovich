package com.homework3.test;

import com.homework3.objects.User;
import com.homework3.utill.UtillUser;
import java.util.ArrayList;
import java.util.List;


public class MainTestUser {
    public static void main(String[] args) {
        List<User> listUser = UtillUser.userGeneration();
        UtillUser.printMethod(listUser);
        int numberOfUsers = UtillUser.listFriendsGeneration(listUser);
        List<User> user = UtillUser.takeWithNotNullFriends(listUser,numberOfUsers);
        List<User> recursionList = new ArrayList<>();
        recursionList.add(user.get(0));
        UtillUser.recursionMethod(recursionList);
    }
}