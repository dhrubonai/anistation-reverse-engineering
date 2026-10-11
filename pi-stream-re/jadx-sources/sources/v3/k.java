package v3;

import android.text.TextUtils;
import androidx.lifecycle.q0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f10645e = new q0();

    /* renamed from: a, reason: collision with root package name */
    public final Object f10646a;

    /* renamed from: b, reason: collision with root package name */
    public final j f10647b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10648c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f10649d;

    public k(String str, Object obj, j jVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f10648c = str;
            this.f10646a = obj;
            this.f10647b = jVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static k a(Object obj, String str) {
        return new k(str, obj, f10645e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f10648c.equals(((k) obj).f10648c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10648c.hashCode();
    }

    public final String toString() {
        return a3.g.t(new StringBuilder("Option{key='"), this.f10648c, "'}");
    }
}
