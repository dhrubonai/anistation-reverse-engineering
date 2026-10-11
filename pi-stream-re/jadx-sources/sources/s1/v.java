package s1;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f9846a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9847b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9848c;

    public v(String str, boolean z9, boolean z10) {
        this.f9846a = str;
        this.f9847b = z9;
        this.f9848c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != v.class) {
            return false;
        }
        v vVar = (v) obj;
        if (TextUtils.equals(this.f9846a, vVar.f9846a) && this.f9847b == vVar.f9847b && this.f9848c == vVar.f9848c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f9846a.hashCode() + 31) * 31;
        int i11 = 1231;
        if (this.f9847b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode + i10) * 31;
        if (!this.f9848c) {
            i11 = 1237;
        }
        return i12 + i11;
    }
}
