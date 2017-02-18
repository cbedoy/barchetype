package cbedoy.barchetype;

import android.app.Application;
import android.content.Context;

/**
 * Created by bedoy on 2/17/17.
 */

public class ApplicationManager extends Application
{
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
