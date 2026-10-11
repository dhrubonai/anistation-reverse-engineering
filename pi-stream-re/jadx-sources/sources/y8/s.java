package y8;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f11790d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f11791e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f11792a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11793b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f11794c;

    public s(String str, String str2, String[] strArr) {
        this.f11792a = str;
        this.f11793b = str2;
        this.f11794c = strArr;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s) && r6.h0.g(((s) obj).f11792a, this.f11792a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11792a.hashCode();
    }

    public final String toString() {
        return this.f11792a;
    }
}
