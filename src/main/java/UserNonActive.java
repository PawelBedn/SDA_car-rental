public class UserNonActive {
    private User[] users;

    public UserNonActive(int size) {
        users = new User[size];
    }

    public void add(User toAdd) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = toAdd;
                return;
            }
        }
    }
}
