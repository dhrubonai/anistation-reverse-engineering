package w2;

import f1.t;
import p7.a0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f10797a;

    /* renamed from: b, reason: collision with root package name */
    public int f10798b;

    /* renamed from: c, reason: collision with root package name */
    public int f10799c;

    /* renamed from: d, reason: collision with root package name */
    public long f10800d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10801e;

    /* renamed from: f, reason: collision with root package name */
    public final t f10802f;

    /* renamed from: g, reason: collision with root package name */
    public final t f10803g;

    /* renamed from: h, reason: collision with root package name */
    public int f10804h;

    /* renamed from: i, reason: collision with root package name */
    public int f10805i;

    public c(t tVar, t tVar2, boolean z9) {
        this.f10803g = tVar;
        this.f10802f = tVar2;
        this.f10801e = z9;
        tVar2.G(12);
        this.f10797a = tVar2.y();
        tVar.G(12);
        this.f10805i = tVar.y();
        a0.d("first_chunk must be 1", tVar.f() == 1);
        this.f10798b = -1;
    }

    public final boolean a() {
        long w9;
        int i10;
        int i11 = this.f10798b + 1;
        this.f10798b = i11;
        if (i11 == this.f10797a) {
            return false;
        }
        boolean z9 = this.f10801e;
        t tVar = this.f10802f;
        if (z9) {
            w9 = tVar.z();
        } else {
            w9 = tVar.w();
        }
        this.f10800d = w9;
        if (this.f10798b == this.f10804h) {
            t tVar2 = this.f10803g;
            this.f10799c = tVar2.y();
            tVar2.H(4);
            int i12 = this.f10805i - 1;
            this.f10805i = i12;
            if (i12 > 0) {
                i10 = tVar2.y() - 1;
            } else {
                i10 = -1;
            }
            this.f10804h = i10;
        }
        return true;
    }
}
