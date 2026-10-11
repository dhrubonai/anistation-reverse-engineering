package n1;

import f1.b0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f7946a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7947b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7948c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7949d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7950e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f7946a = str;
        this.f7947b = str2;
        this.f7948c = str3;
        this.f7949d = str4;
        this.f7950e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (b0.a(this.f7946a, iVar.f7946a) && b0.a(this.f7947b, iVar.f7947b) && b0.a(this.f7948c, iVar.f7948c) && b0.a(this.f7949d, iVar.f7949d) && b0.a(this.f7950e, iVar.f7950e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        String str = this.f7946a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (527 + i10) * 31;
        String str2 = this.f7947b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f7948c;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f7949d;
        if (str4 != null) {
            i13 = str4.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        String str5 = this.f7950e;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }
}
