package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ky {
    public final un0 a;
    public final HashMap b;

    public ky(un0 un0Var, HashMap hashMap) {
        this.a = un0Var;
        this.b = hashMap;
    }

    public final long a(cu4 cu4Var, long j, int i) {
        long j2;
        long f = j - this.a.f();
        ly lyVar = (ly) this.b.get(cu4Var);
        long j3 = lyVar.a;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2))), f), lyVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ky) {
                ky kyVar = (ky) obj;
                if (this.a.equals(kyVar.a) && this.b.equals(kyVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
