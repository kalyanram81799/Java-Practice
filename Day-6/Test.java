class LoginSystem {
    private String password = "admin123";

    public boolean login(String inputPassword) {
        return password.equals(inputPassword);
    }

    public void changePassword(String oldPwd, String newPwd) {
        if (password.equals(oldPwd)) {
            password = newPwd;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        LoginSystem ls = new LoginSystem();

        System.out.println(ls.login("wrong"));     // false
        System.out.println(ls.login("admin123"));  // true

        ls.changePassword("admin123", "newpass");

        System.out.println(ls.login("admin123"));  // false
        System.out.println(ls.login("newpass"));   // true
    }
}
