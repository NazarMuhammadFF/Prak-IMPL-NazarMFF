package Tugas.Sesudah;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        List<User> users = group.getUsersSortedByMostRecentlyRegistered();
        if (users.isEmpty()) {
            System.out.println("No users found (folder data/users tidak ada atau kosong).");
            return;
        }

        System.out.println("Users (most recently registered first):");
        for (User u : users) {
            System.out.println("- " + u.getUsername() + " | regTime=" + u.getRegistrationTime());
        }
    }
}
