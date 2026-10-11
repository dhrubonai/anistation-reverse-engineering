package c0;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Locale[] f1606a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        boolean z9;
        boolean z10;
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f1606a;
        int length = localeArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (localeArr[i10].equals(locale)) {
                    z9 = true;
                    break;
                }
                i10++;
            } else {
                z9 = false;
                break;
            }
        }
        if (!z9) {
            int length2 = localeArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length2) {
                    if (localeArr[i11].equals(locale2)) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                String a10 = e0.f.a(locale);
                if (a10.isEmpty()) {
                    String country = locale.getCountry();
                    if (country.isEmpty() || country.equals(locale2.getCountry())) {
                        return true;
                    }
                    return false;
                }
                return a10.equals(e0.f.a(locale2));
            }
        }
        return false;
    }
}
