package f;

import android.content.res.Configuration;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class v {
    public static void a(Configuration configuration, Locale locale) {
        configuration.setLayoutDirection(locale);
    }

    public static void b(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }
}
