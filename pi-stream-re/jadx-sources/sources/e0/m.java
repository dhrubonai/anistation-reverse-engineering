package e0;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class m {
    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
