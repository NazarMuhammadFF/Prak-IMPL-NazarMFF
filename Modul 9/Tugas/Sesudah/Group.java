package Tugas.Sesudah;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {

    public List<User> getUsersSortedByMostRecentlyRegistered() {
        List<User> users = new ArrayList<>();

        if (!userDirectoryExists()) {
            return users;
        }

        addFoundUsersTo(users);
        sortByMostRecentlyRegistered(users);
        return users;
    }

    private boolean userDirectoryExists() {
        return new File(persistencePath()).exists();
    }

    private void addFoundUsersTo(List<User> users) {
        File[] files = new File(persistencePath()).listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                users.add(new User(file.getName(), this));
            }
        }
    }

    private void sortByMostRecentlyRegistered(List<User> users) {
        Collections.sort(users, new User.UserComparatorByDescendingRegistration());
    }

    // aku bikin public supaya User bisa pakai (biar simpel, gak drama package)
    public String persistencePath() {
        return "data/users";
    }
}
