package josim74.github.com.sharedpreferencepractice;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by JosimUddin on 26/04/2018.
 */

public class UserSharedPreference {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Context context;

    public UserSharedPreference(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("user", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void seveUser(String name, String pass) {
        editor.putString("name", name);
        editor.putString("pass", pass);
        editor.commit();
    }

    public String getName() {

        return sharedPreferences.getString("name", "not found");
    }
    public String getPass() {

        return sharedPreferences.getString("pass", "not found");
    }

    public void resetUser() {
        editor.clear();
        editor.commit();
    }
}
