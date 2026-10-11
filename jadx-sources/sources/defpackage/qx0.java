package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qx0 {
    public static final qx0 j = new qx0();
    public final k94 a;
    public final f94 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public qx0(qx0 qx0Var) {
        qx0Var.getClass();
        this.c = qx0Var.c;
        this.d = qx0Var.d;
        this.b = qx0Var.b;
        this.a = qx0Var.a;
        this.e = qx0Var.e;
        this.f = qx0Var.f;
        this.i = qx0Var.i;
        this.g = qx0Var.g;
        this.h = qx0Var.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qx0.class.equals(obj.getClass())) {
            qx0 qx0Var = (qx0) obj;
            if (this.c == qx0Var.c && this.d == qx0Var.d && this.e == qx0Var.e && this.f == qx0Var.f && this.g == qx0Var.g && this.h == qx0Var.h && a34.i(a(), qx0Var.a()) && this.a == qx0Var.a) {
                return this.i.equals(qx0Var.i);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int hashCode2 = (this.i.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest a = a();
        if (a != null) {
            i = a.hashCode();
        } else {
            i = 0;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Constraints{requiredNetworkType=");
        sb.append(this.a);
        sb.append(", requiresCharging=");
        sb.append(this.c);
        sb.append(", requiresDeviceIdle=");
        sb.append(this.d);
        sb.append(", requiresBatteryNotLow=");
        sb.append(this.e);
        sb.append(", requiresStorageNotLow=");
        sb.append(this.f);
        sb.append(", contentTriggerUpdateDelayMillis=");
        sb.append(this.g);
        qx1.w(sb, ", contentTriggerMaxDelayMillis=", this.h, ", contentUriTriggers=");
        sb.append(this.i);
        sb.append(", }");
        return sb.toString();
    }

    public qx0(f94 f94Var, k94 k94Var, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        this.b = f94Var;
        this.a = k94Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public qx0() {
        this.b = new f94(null);
        this.a = k94.x;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = tt1.x;
    }
}
