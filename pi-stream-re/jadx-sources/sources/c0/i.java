package c0;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f1607b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final k f1608a;

    public i(k kVar) {
        this.f1608a = kVar;
    }

    public static i a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new i(new l(h.a(localeArr)));
        }
        return new i(new j(localeArr));
    }

    public static i b(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i10 = 0; i10 < length; i10++) {
                localeArr[i10] = g.a(split[i10]);
            }
            return a(localeArr);
        }
        return f1607b;
    }

    public final Locale c(int i10) {
        return this.f1608a.get(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (this.f1608a.equals(((i) obj).f1608a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1608a.hashCode();
    }

    public final String toString() {
        return this.f1608a.toString();
    }
}
