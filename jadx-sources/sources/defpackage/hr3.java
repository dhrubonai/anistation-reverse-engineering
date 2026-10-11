package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hr3 {
    public CharSequence A;
    public CharSequence B;
    public CharSequence C;
    public Integer D;
    public Integer E;
    public CharSequence F;
    public CharSequence G;
    public CharSequence H;
    public Integer I;
    public Bundle J;
    public nw2 K;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Long h;
    public yx4 i;
    public yx4 j;
    public byte[] k;
    public ob0 l;
    public Integer m;
    public Uri n;
    public Integer o;
    public Integer p;
    public Integer q;
    public Boolean r;
    public Boolean s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public Integer x;
    public Integer y;
    public CharSequence z;

    public hr3() {
        z62 z62Var = nw2.y;
        this.K = o15.B;
    }

    public final void a(int i, byte[] bArr) {
        if (this.k != null && i != 3 && Objects.equals(this.m, 3)) {
            return;
        }
        this.k = (byte[]) bArr.clone();
        this.l = null;
        this.m = Integer.valueOf(i);
    }

    public final void b(jr3 jr3Var) {
        boolean z;
        if (jr3Var != null) {
            nw2 nw2Var = jr3Var.L;
            byte[] bArr = jr3Var.k;
            CharSequence charSequence = jr3Var.a;
            if (charSequence != null) {
                this.a = charSequence;
            }
            CharSequence charSequence2 = jr3Var.b;
            if (charSequence2 != null) {
                this.b = charSequence2;
            }
            CharSequence charSequence3 = jr3Var.c;
            if (charSequence3 != null) {
                this.c = charSequence3;
            }
            CharSequence charSequence4 = jr3Var.d;
            if (charSequence4 != null) {
                this.d = charSequence4;
            }
            CharSequence charSequence5 = jr3Var.e;
            if (charSequence5 != null) {
                this.e = charSequence5;
            }
            CharSequence charSequence6 = jr3Var.f;
            if (charSequence6 != null) {
                this.f = charSequence6;
            }
            CharSequence charSequence7 = jr3Var.g;
            if (charSequence7 != null) {
                this.g = charSequence7;
            }
            Long l = jr3Var.h;
            if (l != null) {
                if (l.longValue() >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                io3.n(z);
                this.h = l;
            }
            yx4 yx4Var = jr3Var.i;
            if (yx4Var != null) {
                this.i = yx4Var;
            }
            yx4 yx4Var2 = jr3Var.j;
            if (yx4Var2 != null) {
                this.j = yx4Var2;
            }
            Uri uri = jr3Var.n;
            if (uri != null || bArr != null) {
                this.n = uri;
                c(bArr, jr3Var.m);
                this.l = jr3Var.l;
            }
            Integer num = jr3Var.o;
            if (num != null) {
                this.o = num;
            }
            Integer num2 = jr3Var.p;
            if (num2 != null) {
                this.p = num2;
            }
            Integer num3 = jr3Var.q;
            if (num3 != null) {
                this.q = num3;
            }
            Boolean bool = jr3Var.r;
            if (bool != null) {
                this.r = bool;
            }
            Boolean bool2 = jr3Var.s;
            if (bool2 != null) {
                this.s = bool2;
            }
            Integer num4 = jr3Var.t;
            if (num4 != null) {
                this.t = num4;
            }
            Integer num5 = jr3Var.u;
            if (num5 != null) {
                this.t = num5;
            }
            Integer num6 = jr3Var.v;
            if (num6 != null) {
                this.u = num6;
            }
            Integer num7 = jr3Var.w;
            if (num7 != null) {
                this.v = num7;
            }
            Integer num8 = jr3Var.x;
            if (num8 != null) {
                this.w = num8;
            }
            Integer num9 = jr3Var.y;
            if (num9 != null) {
                this.x = num9;
            }
            Integer num10 = jr3Var.z;
            if (num10 != null) {
                this.y = num10;
            }
            CharSequence charSequence8 = jr3Var.A;
            if (charSequence8 != null) {
                this.z = charSequence8;
            }
            CharSequence charSequence9 = jr3Var.B;
            if (charSequence9 != null) {
                this.A = charSequence9;
            }
            CharSequence charSequence10 = jr3Var.C;
            if (charSequence10 != null) {
                this.B = charSequence10;
            }
            CharSequence charSequence11 = jr3Var.D;
            if (charSequence11 != null) {
                this.C = charSequence11;
            }
            Integer num11 = jr3Var.E;
            if (num11 != null) {
                this.D = num11;
            }
            Integer num12 = jr3Var.F;
            if (num12 != null) {
                this.E = num12;
            }
            CharSequence charSequence12 = jr3Var.G;
            if (charSequence12 != null) {
                this.F = charSequence12;
            }
            CharSequence charSequence13 = jr3Var.H;
            if (charSequence13 != null) {
                this.G = charSequence13;
            }
            CharSequence charSequence14 = jr3Var.I;
            if (charSequence14 != null) {
                this.H = charSequence14;
            }
            Integer num13 = jr3Var.J;
            if (num13 != null) {
                this.I = num13;
            }
            Bundle bundle = jr3Var.K;
            if (bundle != null) {
                this.J = bundle;
            }
            if (!nw2Var.isEmpty()) {
                this.K = nw2.o(nw2Var);
            }
        }
    }

    public final void c(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.k = bArr2;
        this.l = null;
        this.m = num;
    }
}
