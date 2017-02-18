package cbedoy.barchetype.utils;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import cbedoy.barchetype.ApplicationManager;

/**
 * Created by bedoy on 12/22/16.
 */

public class Utils
{
    public enum TYPEFACE
    {
        ROBOTO_BLACK("fonts/Roboto-Black.ttf"),
        ROBOTO_BOLD("fonts/Roboto-Bold.ttf"),
        ROBOTO_ITALIC("fonts/Roboto-Italic.ttf"),
        ROBOTO_LIGHT("fonts/Roboto-Light.ttf"),
        ROBOTO_MEDIUM("fonts/Roboto-Medium.ttf"),
        ROBOTO_REGULAR("fonts/Roboto-Regular.ttf"),
        ROBOTO_THIN("fonts/Roboto-Thin.ttf");

        private String VALUE;

        TYPEFACE(final String VALUE) {
            this.VALUE = VALUE;
        }

        @Override
        public String toString() {
            return VALUE;
        }
    }

    public final static boolean isValidEmail(CharSequence target)
    {
        if (TextUtils.isEmpty(target)) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    public static void setTypefaceOnView(TYPEFACE typeface, View view)
    {
        if (view != null && view instanceof TextView && view.getContext() != null)
        {
            ((TextView) view).setTypeface(Typeface.createFromAsset(ApplicationManager.getContext().getAssets(), typeface.toString()));
        }

    }
}
