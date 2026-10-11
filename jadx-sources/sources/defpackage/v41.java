package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v41 {
    public final Uri a;
    public final long b;
    public final byte c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        cr3.a("media3.datasource");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v41(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        boolean z;
        boolean z2;
        byte[] bArr2;
        if (j + j2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.n(z2);
        io3.n(j3 > 0 || j3 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = i;
        if (bArr != null && bArr.length != 0) {
            bArr2 = bArr;
        } else {
            bArr2 = null;
        }
        this.d = bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
    }

    public static String b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HEAD";
                }
                p65.l();
                return null;
            }
            return "POST";
        }
        return "GET";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [u41, java.lang.Object] */
    public final u41 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        return obj;
    }

    public final v41 c(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new v41(this.a, this.b, this.c, this.d, this.e, this.f + j, j2, this.h, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return zo5.k(this.i, "]", sb);
    }

    public v41(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0);
    }
}
