package c0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final Locale[] f1609c = new Locale[0];

    /* renamed from: a, reason: collision with root package name */
    public final Locale[] f1610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1611b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length == 1) {
                new Locale(split[0]);
                return;
            }
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public j(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f1610a = f1609c;
            this.f1611b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb.append('-');
                        sb.append(locale2.getCountry());
                    }
                    if (i10 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(a3.g.o("list[", i10, "] is null"));
            }
        }
        this.f1610a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f1611b = sb.toString();
    }

    @Override // c0.k
    public final String a() {
        return this.f1611b;
    }

    @Override // c0.k
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        Locale[] localeArr = ((j) obj).f1610a;
        Locale[] localeArr2 = this.f1610a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < localeArr2.length; i10++) {
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // c0.k
    public final Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f1610a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i10 = 1;
        for (Locale locale : this.f1610a) {
            i10 = (i10 * 31) + locale.hashCode();
        }
        return i10;
    }

    @Override // c0.k
    public final boolean isEmpty() {
        if (this.f1610a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // c0.k
    public final int size() {
        return this.f1610a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f1610a;
            if (i10 < localeArr.length) {
                sb.append(localeArr[i10]);
                if (i10 < localeArr.length - 1) {
                    sb.append(',');
                }
                i10++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
