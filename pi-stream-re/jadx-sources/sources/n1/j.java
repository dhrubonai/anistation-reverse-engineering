package n1;

import android.net.Uri;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f7951a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7952b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7953c;

    /* renamed from: d, reason: collision with root package name */
    public int f7954d;

    public j(String str, long j4, long j10) {
        this.f7953c = str == null ? "" : str;
        this.f7951a = j4;
        this.f7952b = j10;
    }

    public final j a(j jVar, String str) {
        String Z = j5.a.Z(str, this.f7953c);
        if (jVar != null && Z.equals(j5.a.Z(str, jVar.f7953c))) {
            long j4 = this.f7952b;
            long j10 = -1;
            long j11 = jVar.f7952b;
            if (j4 != -1) {
                long j12 = this.f7951a;
                if (j12 + j4 == jVar.f7951a) {
                    if (j11 != -1) {
                        j10 = j4 + j11;
                    }
                    return new j(Z, j12, j10);
                }
            }
            if (j11 != -1) {
                long j13 = jVar.f7951a;
                if (j13 + j11 == this.f7951a) {
                    if (j4 != -1) {
                        j10 = j11 + j4;
                    }
                    return new j(Z, j13, j10);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final Uri b(String str) {
        return j5.a.c0(str, this.f7953c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f7951a == jVar.f7951a && this.f7952b == jVar.f7952b && this.f7953c.equals(jVar.f7953c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f7954d == 0) {
            this.f7954d = this.f7953c.hashCode() + ((((527 + ((int) this.f7951a)) * 31) + ((int) this.f7952b)) * 31);
        }
        return this.f7954d;
    }

    public final String toString() {
        return "RangedUri(referenceUri=" + this.f7953c + ", start=" + this.f7951a + ", length=" + this.f7952b + ")";
    }
}
