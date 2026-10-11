package c1;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f1702d = new g0(new f.c(5));

    /* renamed from: a, reason: collision with root package name */
    public final Uri f1703a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1704b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f1705c;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
    }

    public g0(f.c cVar) {
        this.f1703a = (Uri) cVar.f3635b;
        this.f1704b = (String) cVar.f3636c;
        this.f1705c = (Bundle) cVar.f3637d;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (f1.b0.a(this.f1703a, g0Var.f1703a) && f1.b0.a(this.f1704b, g0Var.f1704b)) {
            if (this.f1705c == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (g0Var.f1705c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 == z10) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i10 = 0;
        Uri uri = this.f1703a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f1704b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        if (this.f1705c != null) {
            i10 = 1;
        }
        return i12 + i10;
    }
}
