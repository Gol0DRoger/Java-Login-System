import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> logininfo = new HashMap<>();

    IDandPasswords() {
        logininfo.put("Rex", "pizza");
        logininfo.put("Goku", "123");
        logininfo.put("Rahul", "xyz");
    }

    protected HashMap<String, String> getLoginInfo() {
        return logininfo;
    }
}
