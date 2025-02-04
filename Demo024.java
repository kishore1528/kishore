import java.util.ArrayList;

class FriendList {
    ArrayList<String[]> list = new ArrayList<>();

    public FriendList() {
        list.add(new String[] { "Ajay", "1111111111", "Hyderabad" });
        list.add(new String[] { "nand", "2222222222", "Hyderabad" });
        list.add(new String[] { "Kumar", "3333333333", "Hyderabad" });
        list.add(new String[] { "Swamy", "4444444444", "Hyderabad" });
        list.add(new String[] { "Yadav", "5555555555", "Hyderabad" });
    }

    public void displayFriends() {
        for (String[] friend : list) {
            System.out.println("Name: " + friend[0]);
            System.out.println("Phone Number: " + friend[1]);
            System.out.println("Address: " + friend[2]);
            System.out.println();
        }
    }
}

public class Demo024 {
    public static void main(String[] args) {
        FriendList friendList = new FriendList();
        friendList.displayFriends();
    }
}