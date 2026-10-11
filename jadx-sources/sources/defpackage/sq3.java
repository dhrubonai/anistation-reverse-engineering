package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sq3 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final UUID a;
    public final Uri b;
    public final rw2 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final nw2 g;
    public final byte[] h;

    static {
        String str = eq6.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public sq3(rq3 rq3Var) {
        boolean z;
        byte[] bArr;
        if (rq3Var.c && ((Uri) rq3Var.e) == null) {
            z = false;
        } else {
            z = true;
        }
        io3.B(z);
        UUID uuid = (UUID) rq3Var.d;
        uuid.getClass();
        this.a = uuid;
        this.b = (Uri) rq3Var.e;
        this.c = (rw2) rq3Var.f;
        this.d = rq3Var.a;
        this.f = rq3Var.c;
        this.e = rq3Var.b;
        this.g = (nw2) rq3Var.g;
        byte[] bArr2 = (byte[]) rq3Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.h = bArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [rq3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Cloneable, byte[]] */
    public final rq3 a() {
        ?? obj = new Object();
        obj.d = this.a;
        obj.e = this.b;
        obj.f = this.c;
        obj.a = this.d;
        obj.b = this.e;
        obj.c = this.f;
        obj.g = this.g;
        obj.h = this.h;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq3)) {
            return false;
        }
        sq3 sq3Var = (sq3) obj;
        if (this.a.equals(sq3Var.a) && Objects.equals(this.b, sq3Var.b) && Objects.equals(this.c, sq3Var.c) && this.d == sq3Var.d && this.f == sq3Var.f && this.e == sq3Var.e && this.g.equals(sq3Var.g) && Arrays.equals(this.h, sq3Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        if (uri != null) {
            i2 = uri.hashCode();
        } else {
            i2 = 0;
        }
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((hashCode + i2) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
