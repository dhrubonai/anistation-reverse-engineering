package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vq3 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Uri a;
    public final String b;
    public final sq3 c;
    public final mq3 d;
    public final List e;
    public final String f;
    public final nw2 g;
    public final long h;

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

    public vq3(Uri uri, String str, sq3 sq3Var, mq3 mq3Var, List list, String str2, nw2 nw2Var, long j2) {
        this.a = uri;
        this.b = qy3.n(str);
        this.c = sq3Var;
        this.d = mq3Var;
        this.e = list;
        this.f = str2;
        this.g = nw2Var;
        jw2 k2 = nw2.k();
        for (int i2 = 0; i2 < nw2Var.size(); i2++) {
            k2.c(new zq3(((zq3) nw2Var.get(i2)).a()));
        }
        k2.g();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vq3) {
                vq3 vq3Var = (vq3) obj;
                if (this.a.equals(vq3Var.a) && Objects.equals(this.b, vq3Var.b) && Objects.equals(this.c, vq3Var.c) && Objects.equals(this.d, vq3Var.d) && this.e.equals(vq3Var.e) && Objects.equals(this.f, vq3Var.f) && this.g.equals(vq3Var.g) && this.h == vq3Var.h) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.a.hashCode() * 31;
        int i2 = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (hashCode4 + hashCode) * 31;
        sq3 sq3Var = this.c;
        if (sq3Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = sq3Var.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        mq3 mq3Var = this.d;
        if (mq3Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = mq3Var.hashCode();
        }
        int hashCode5 = (this.e.hashCode() + ((i4 + hashCode3) * 31)) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (int) (((this.g.hashCode() + ((hashCode5 + i2) * 31)) * 31 * 31) + this.h);
    }
}
