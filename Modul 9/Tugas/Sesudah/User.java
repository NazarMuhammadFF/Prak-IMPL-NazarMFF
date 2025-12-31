package Tugas.Sesudah;

import java.io.File;

public class User {
    private final String username;
    private final long registrationTime; // pakai timestamp folder sebagai simulasi "registered time"

    public User(String username, Group group) {
        this.username = username;

        // simulasi: ambil waktu registrasi dari lastModified folder user
        File userDir = new File(group.persistencePath() + File.separator + username);
        this.registrationTime = userDir.exists() ? userDir.lastModified() : 0L;
    }

    public String getUsername() {
        return username;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    // Comparator: descending registration (paling baru di atas)
    public static class UserComparatorByDescendingRegistration implements java.util.Comparator<User> {
        @Override
        public int compare(User a, User b) {
            return Long.compare(b.registrationTime, a.registrationTime);
        }
    }
}
