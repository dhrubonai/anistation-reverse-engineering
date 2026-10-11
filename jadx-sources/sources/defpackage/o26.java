package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o26 implements kv2 {
    public final mu2 a;
    public final ev2 b;
    public final p41 c;
    public final gx3 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public o26(mu2 mu2Var, ev2 ev2Var, p41 p41Var, gx3 gx3Var, String str, boolean z, boolean z2) {
        this.a = mu2Var;
        this.b = ev2Var;
        this.c = p41Var;
        this.d = gx3Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.kv2
    public final mu2 a() {
        return this.a;
    }

    @Override // defpackage.kv2
    public final ev2 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o26)) {
            return false;
        }
        o26 o26Var = (o26) obj;
        if (a34.i(this.a, o26Var.a) && a34.i(this.b, o26Var.b) && this.c == o26Var.c && a34.i(this.d, o26Var.d) && a34.i(this.e, o26Var.e) && this.f == o26Var.f && this.g == o26Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = 0;
        gx3 gx3Var = this.d;
        if (gx3Var == null) {
            hashCode = 0;
        } else {
            hashCode = gx3Var.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return Boolean.hashCode(this.g) + zo5.g((i2 + i) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        sb.append(this.e);
        sb.append(", isSampled=");
        sb.append(this.f);
        sb.append(", isPlaceholderCached=");
        return qx1.r(sb, this.g, ")");
    }
}
