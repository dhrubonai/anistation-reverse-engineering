package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class v10 {
    public static final u10 Companion = new Object();
    public final s00 a;
    public final m20 b;
    public final m00 c;
    public final int d;
    public final String e;
    public final boolean f;

    public /* synthetic */ v10(int i, s00 s00Var, m20 m20Var, m00 m00Var, int i2, String str, boolean z) {
        if (31 != (i & 31)) {
            iq4.throwMissingFieldException(i, 31, t10.a.getDescriptor());
        }
        this.a = s00Var;
        this.b = m20Var;
        this.c = m00Var;
        this.d = i2;
        this.e = str;
        if ((i & 32) == 0) {
            this.f = true;
        } else {
            this.f = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v10)) {
            return false;
        }
        v10 v10Var = (v10) obj;
        if (a34.i(this.a, v10Var.a) && a34.i(this.b, v10Var.b) && a34.i(this.c, v10Var.c) && this.d == v10Var.d && a34.i(this.e, v10Var.e) && this.f == v10Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + zo5.i(this.e, qx1.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "BackupSettings(global=" + this.a + ", video=" + this.b + ", download=" + this.c + ", skippedUpdateVersionCode=" + this.d + ", backupFrequency=" + this.e + ", includeAnimeList=" + this.f + ")";
    }

    public v10(s00 s00Var, m20 m20Var, m00 m00Var, int i, String str, boolean z) {
        str.getClass();
        this.a = s00Var;
        this.b = m20Var;
        this.c = m00Var;
        this.d = i;
        this.e = str;
        this.f = z;
    }
}
