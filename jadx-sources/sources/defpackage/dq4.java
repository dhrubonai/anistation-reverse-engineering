package defpackage;

import com.anistation.model.settings.HoldAction;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dq4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final long e;
    public final List f;
    public final boolean g;
    public final HoldAction h;
    public final boolean i;
    public final boolean j;
    public final String k;

    public dq4(boolean z, boolean z2, boolean z3, long j, long j2, List list, boolean z4, HoldAction holdAction, boolean z5, boolean z6, String str) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = z4;
        this.h = holdAction;
        this.i = z5;
        this.j = z6;
        this.k = str;
    }

    public static dq4 a(dq4 dq4Var, boolean z, boolean z2, boolean z3, long j, long j2, List list, boolean z4, HoldAction holdAction, boolean z5, boolean z6, String str, int i) {
        boolean z7;
        boolean z8;
        long j3;
        long j4;
        List list2;
        boolean z9;
        HoldAction holdAction2;
        boolean z10;
        boolean z11;
        String str2;
        if ((i & 1) != 0) {
            z = dq4Var.a;
        }
        boolean z12 = z;
        if ((i & 2) != 0) {
            z7 = dq4Var.b;
        } else {
            z7 = z2;
        }
        if ((i & 4) != 0) {
            z8 = dq4Var.c;
        } else {
            z8 = z3;
        }
        if ((i & 8) != 0) {
            j3 = dq4Var.d;
        } else {
            j3 = j;
        }
        if ((i & 16) != 0) {
            j4 = dq4Var.e;
        } else {
            j4 = j2;
        }
        if ((i & 32) != 0) {
            list2 = dq4Var.f;
        } else {
            list2 = list;
        }
        if ((i & 64) != 0) {
            z9 = dq4Var.g;
        } else {
            z9 = z4;
        }
        if ((i & 128) != 0) {
            holdAction2 = dq4Var.h;
        } else {
            holdAction2 = holdAction;
        }
        if ((i & 256) != 0) {
            z10 = dq4Var.i;
        } else {
            z10 = z5;
        }
        if ((i & 512) != 0) {
            z11 = dq4Var.j;
        } else {
            z11 = z6;
        }
        if ((i & 1024) != 0) {
            str2 = dq4Var.k;
        } else {
            str2 = str;
        }
        dq4Var.getClass();
        list2.getClass();
        return new dq4(z12, z7, z8, j3, j4, list2, z9, holdAction2, z10, z11, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq4)) {
            return false;
        }
        dq4 dq4Var = (dq4) obj;
        if (this.a == dq4Var.a && this.b == dq4Var.b && this.c == dq4Var.c && this.d == dq4Var.d && this.e == dq4Var.e && a34.i(this.f, dq4Var.f) && this.g == dq4Var.g && this.h == dq4Var.h && this.i == dq4Var.i && this.j == dq4Var.j && a34.i(this.k, dq4Var.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int g = zo5.g(zo5.j(this.f, qx1.d(qx1.d(zo5.g(zo5.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), 31), 31, this.g);
        int i = 0;
        HoldAction holdAction = this.h;
        if (holdAction == null) {
            hashCode = 0;
        } else {
            hashCode = holdAction.hashCode();
        }
        int g2 = zo5.g(zo5.g((g + hashCode) * 31, 31, this.i), 31, this.j);
        String str = this.k;
        if (str != null) {
            i = str.hashCode();
        }
        return g2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerUiState(isControlsVisible=");
        sb.append(this.a);
        sb.append(", isPlaying=");
        sb.append(this.b);
        sb.append(", isFullscreen=");
        sb.append(this.c);
        sb.append(", currentPosition=");
        sb.append(this.d);
        qx1.w(sb, ", duration=", this.e, ", subtitleCues=");
        sb.append(this.f);
        sb.append(", isSeeking=");
        sb.append(this.g);
        sb.append(", activeHoldAction=");
        sb.append(this.h);
        sb.append(", isBuffering=");
        sb.append(this.i);
        sb.append(", isCasting=");
        sb.append(this.j);
        sb.append(", castDeviceName=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
