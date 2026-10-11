package defpackage;

import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zl7 extends pv7 {
    public String A;
    public long z;

    @Override // defpackage.pv7
    public final boolean M() {
        Calendar calendar = Calendar.getInstance();
        this.z = (calendar.get(16) + calendar.get(15)) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.A = qx1.q(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long P() {
        N();
        return this.z;
    }

    public final String Q() {
        N();
        return this.A;
    }
}
