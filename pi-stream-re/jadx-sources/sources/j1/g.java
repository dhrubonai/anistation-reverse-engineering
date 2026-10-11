package j1;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f5745a;

    /* renamed from: b, reason: collision with root package name */
    public final c1.v f5746b;

    /* renamed from: c, reason: collision with root package name */
    public final c1.v f5747c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5748d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5749e;

    public g(String str, c1.v vVar, c1.v vVar2, int i10, int i11) {
        boolean z9;
        if (i10 != 0 && i11 != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        w7.b.g(z9);
        if (!TextUtils.isEmpty(str)) {
            this.f5745a = str;
            this.f5746b = vVar;
            vVar2.getClass();
            this.f5747c = vVar2;
            this.f5748d = i10;
            this.f5749e = i11;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f5748d == gVar.f5748d && this.f5749e == gVar.f5749e && this.f5745a.equals(gVar.f5745a) && this.f5746b.equals(gVar.f5746b) && this.f5747c.equals(gVar.f5747c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5747c.hashCode() + ((this.f5746b.hashCode() + ((this.f5745a.hashCode() + ((((527 + this.f5748d) * 31) + this.f5749e) * 31)) * 31)) * 31);
    }
}
