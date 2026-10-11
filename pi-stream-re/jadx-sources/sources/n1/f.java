package n1;

import f1.b0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7935a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7936b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7937c;

    public f(String str, String str2, String str3) {
        this.f7935a = str;
        this.f7936b = str2;
        this.f7937c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (b0.a(this.f7935a, fVar.f7935a) && b0.a(this.f7936b, fVar.f7936b) && b0.a(this.f7937c, fVar.f7937c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f7935a.hashCode() * 31;
        int i11 = 0;
        String str = this.f7936b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f7937c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
