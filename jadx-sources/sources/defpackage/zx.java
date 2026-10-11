package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zx {
    public final String a;
    public final ArrayList b;

    public zx(String str, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.b = arrayList;
        } else {
            qi2.m("Null userAgent");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof zx) {
                zx zxVar = (zx) obj;
                if (this.a.equals(zxVar.a) && this.b.equals(zxVar.b)) {
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
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
