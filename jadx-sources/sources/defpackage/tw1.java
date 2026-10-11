package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tw1 implements ey3 {
    public static final ea2 g;
    public static final ea2 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        da2 da2Var = new da2();
        da2Var.o = qy3.n("application/id3");
        g = new ea2(da2Var);
        da2 da2Var2 = new da2();
        da2Var2.o = qy3.n("application/x-scte35");
        h = new ea2(da2Var2);
    }

    public tw1(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // defpackage.ey3
    public final ea2 a() {
        String str = this.a;
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return h;
            case 1:
            case 2:
                return g;
            default:
                return null;
        }
    }

    @Override // defpackage.ey3
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && tw1.class == obj.getClass()) {
                tw1 tw1Var = (tw1) obj;
                if (this.c == tw1Var.c && this.d == tw1Var.d && this.a.equals(tw1Var.a) && this.b.equals(tw1Var.b) && Arrays.equals(this.e, tw1Var.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            int i2 = zo5.i(this.b, zo5.i(this.a, 527, 31), 31);
            long j = this.c;
            int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            int hashCode = Arrays.hashCode(this.e) + ((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
            this.f = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
