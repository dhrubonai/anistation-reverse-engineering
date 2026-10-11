package f;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class x {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales;
        LocaleList locales2;
        boolean equals;
        locales = configuration.getLocales();
        locales2 = configuration2.getLocales();
        equals = locales.equals(locales2);
        if (!equals) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static c0.i b(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return c0.i.b(languageTags);
    }

    public static void c(c0.i iVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(iVar.f1608a.a());
        LocaleList.setDefault(forLanguageTags);
    }

    public static void d(Configuration configuration, c0.i iVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(iVar.f1608a.a());
        configuration.setLocales(forLanguageTags);
    }
}
