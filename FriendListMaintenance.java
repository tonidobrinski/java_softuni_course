package Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> friendList = new ArrayList();
        String[] friendNames = scanner.nextLine().split(", ");

        friendList.addAll(Arrays.asList(friendNames));
        while (friendNames.equals("Report"))
        {

        }
    }
}
