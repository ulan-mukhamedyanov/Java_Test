package task_3;

import java.util.ArrayList;
import java.util.List;

// МОЖНО МЕНЯТЬ ВЕСЬ КЛАСС

public class Friend {

    private String email;
    private List<Friend> friends;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public List<Friend> getFriends() {
        return this.friends;
    }

    public void addFriendship(Friend friend) {
        this.friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canAddConnection(Friend friend) {

        // МЕТОД, КОТОРЫЙ НУЖНО РЕАЛИЗОВАТЬ

    }

}
