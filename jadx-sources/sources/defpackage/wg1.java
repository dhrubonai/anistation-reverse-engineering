package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wg1 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final xg1 g;
    public final String h;

    public wg1(String str, int i, String str2, String str3, long j, long j2, xg1 xg1Var, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = xg1Var;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wg1) {
                wg1 wg1Var = (wg1) obj;
                if (!this.a.equals(wg1Var.a) || this.b != wg1Var.b || !a34.i(this.c, wg1Var.c) || !a34.i(this.d, wg1Var.d) || this.e != wg1Var.e || this.f != wg1Var.f || this.g != wg1Var.g || !this.h.equals(wg1Var.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int c = qx1.c(this.b, this.a.hashCode() * 31, 31);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (c + hashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.h.hashCode() + ((this.g.hashCode() + qx1.d(qx1.d((i2 + i) * 31, this.e, 31), this.f, 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = h11.m(this.b, "DiscordPlayback(animeTitle=", this.a, ", episodeNumber=", ", episodeTitle=");
        qx1.x(m, this.c, ", coverImageUrl=", this.d, ", positionMs=");
        m.append(this.e);
        qx1.w(m, ", durationMs=", this.f, ", state=");
        m.append(this.g);
        m.append(", detailsUrl=");
        m.append(this.h);
        m.append(")");
        return m.toString();
    }
}
