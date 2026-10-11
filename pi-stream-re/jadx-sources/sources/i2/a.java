package i2;

import a3.g;
import c1.u;
import c1.v;
import d2.g0;
import e0.j;
import f1.s;
import f1.t;
import java.util.Collections;

/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f5282e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f5283b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5284c;

    /* renamed from: d, reason: collision with root package name */
    public int f5285d;

    public a(g0 g0Var) {
        super(g0Var);
    }

    public final boolean n(t tVar) {
        String str;
        if (!this.f5283b) {
            int v9 = tVar.v();
            int i10 = (v9 >> 4) & 15;
            this.f5285d = i10;
            Object obj = this.f3315a;
            if (i10 == 2) {
                int i11 = f5282e[(v9 >> 2) & 3];
                u k10 = g.k("audio/mpeg");
                k10.f1920y = 1;
                k10.f1921z = i11;
                ((g0) obj).b(new v(k10));
                this.f5284c = true;
            } else if (i10 != 7 && i10 != 8) {
                if (i10 != 10) {
                    throw new d("Audio format not supported: " + this.f5285d);
                }
            } else {
                if (i10 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                u k11 = g.k(str);
                k11.f1920y = 1;
                k11.f1921z = 8000;
                ((g0) obj).b(new v(k11));
                this.f5284c = true;
            }
            this.f5283b = true;
        } else {
            tVar.H(1);
        }
        return true;
    }

    public final boolean o(long j4, t tVar) {
        int i10 = this.f5285d;
        Object obj = this.f3315a;
        if (i10 == 2) {
            int i11 = tVar.f3860c - tVar.f3859b;
            g0 g0Var = (g0) obj;
            g0Var.f(i11, tVar);
            g0Var.d(j4, 1, i11, 0, null);
            return true;
        }
        int v9 = tVar.v();
        if (v9 == 0 && !this.f5284c) {
            int i12 = tVar.f3860c - tVar.f3859b;
            byte[] bArr = new byte[i12];
            tVar.d(bArr, 0, i12);
            d2.a s9 = z7.c.s(new s(bArr, 0, (Object) null), false);
            u k10 = g.k("audio/mp4a-latm");
            k10.f1905i = s9.f3088a;
            k10.f1920y = s9.f3090c;
            k10.f1921z = s9.f3089b;
            k10.f1910n = Collections.singletonList(bArr);
            ((g0) obj).b(new v(k10));
            this.f5284c = true;
            return false;
        }
        if (this.f5285d == 10 && v9 != 1) {
            return false;
        }
        int i13 = tVar.f3860c - tVar.f3859b;
        g0 g0Var2 = (g0) obj;
        g0Var2.f(i13, tVar);
        g0Var2.d(j4, 1, i13, 0, null);
        return true;
    }
}
