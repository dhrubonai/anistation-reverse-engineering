package l4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e4.r;
import msr.pistream.app.R;
import p4.m;
import v3.k;
import v3.l;
import v3.p;
import x3.n;
import x3.o;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {
    public boolean D;
    public Drawable F;
    public int G;
    public boolean K;
    public Resources.Theme L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean Q;

    /* renamed from: a, reason: collision with root package name */
    public int f6818a;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f6822e;

    /* renamed from: f, reason: collision with root package name */
    public int f6823f;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f6824x;

    /* renamed from: y, reason: collision with root package name */
    public int f6825y;

    /* renamed from: b, reason: collision with root package name */
    public float f6819b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public o f6820c = o.f11236c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.g f6821d = com.bumptech.glide.g.NORMAL;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6826z = true;
    public int A = -1;
    public int B = -1;
    public v3.i C = o4.a.f8191b;
    public boolean E = true;
    public l H = new l();
    public p4.c I = new p4.c();
    public Class J = Object.class;
    public boolean P = true;

    public static boolean g(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public a a(a aVar) {
        if (this.M) {
            return clone().a(aVar);
        }
        if (g(aVar.f6818a, 2)) {
            this.f6819b = aVar.f6819b;
        }
        if (g(aVar.f6818a, 262144)) {
            this.N = aVar.N;
        }
        if (g(aVar.f6818a, 1048576)) {
            this.Q = aVar.Q;
        }
        if (g(aVar.f6818a, 4)) {
            this.f6820c = aVar.f6820c;
        }
        if (g(aVar.f6818a, 8)) {
            this.f6821d = aVar.f6821d;
        }
        if (g(aVar.f6818a, 16)) {
            this.f6822e = aVar.f6822e;
            this.f6823f = 0;
            this.f6818a &= -33;
        }
        if (g(aVar.f6818a, 32)) {
            this.f6823f = aVar.f6823f;
            this.f6822e = null;
            this.f6818a &= -17;
        }
        if (g(aVar.f6818a, 64)) {
            this.f6824x = aVar.f6824x;
            this.f6825y = 0;
            this.f6818a &= -129;
        }
        if (g(aVar.f6818a, 128)) {
            this.f6825y = aVar.f6825y;
            this.f6824x = null;
            this.f6818a &= -65;
        }
        if (g(aVar.f6818a, 256)) {
            this.f6826z = aVar.f6826z;
        }
        if (g(aVar.f6818a, 512)) {
            this.B = aVar.B;
            this.A = aVar.A;
        }
        if (g(aVar.f6818a, 1024)) {
            this.C = aVar.C;
        }
        if (g(aVar.f6818a, 4096)) {
            this.J = aVar.J;
        }
        if (g(aVar.f6818a, 8192)) {
            this.F = aVar.F;
            this.G = 0;
            this.f6818a &= -16385;
        }
        if (g(aVar.f6818a, 16384)) {
            this.G = aVar.G;
            this.F = null;
            this.f6818a &= -8193;
        }
        if (g(aVar.f6818a, 32768)) {
            this.L = aVar.L;
        }
        if (g(aVar.f6818a, 65536)) {
            this.E = aVar.E;
        }
        if (g(aVar.f6818a, 131072)) {
            this.D = aVar.D;
        }
        if (g(aVar.f6818a, 2048)) {
            this.I.putAll(aVar.I);
            this.P = aVar.P;
        }
        if (g(aVar.f6818a, 524288)) {
            this.O = aVar.O;
        }
        if (!this.E) {
            this.I.clear();
            int i10 = this.f6818a & (-2049);
            this.D = false;
            this.f6818a = i10 & (-131073);
            this.P = true;
        }
        this.f6818a |= aVar.f6818a;
        this.H.f10650b.i(aVar.H.f10650b);
        l();
        return this;
    }

    @Override // 
    /* renamed from: b */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            l lVar = new l();
            aVar.H = lVar;
            lVar.f10650b.i(this.H.f10650b);
            p4.c cVar = new p4.c();
            aVar.I = cVar;
            cVar.putAll(this.I);
            aVar.K = false;
            aVar.M = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final a c(Class cls) {
        if (this.M) {
            return clone().c(cls);
        }
        this.J = cls;
        this.f6818a |= 4096;
        l();
        return this;
    }

    public final a d(n nVar) {
        if (this.M) {
            return clone().d(nVar);
        }
        this.f6820c = nVar;
        this.f6818a |= 4;
        l();
        return this;
    }

    public final a e() {
        if (this.M) {
            return clone().e();
        }
        this.f6823f = R.drawable.bg_card;
        int i10 = this.f6818a | 32;
        this.f6822e = null;
        this.f6818a = i10 & (-17);
        l();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return f((a) obj);
        }
        return false;
    }

    public final boolean f(a aVar) {
        if (Float.compare(aVar.f6819b, this.f6819b) == 0 && this.f6823f == aVar.f6823f && m.b(this.f6822e, aVar.f6822e) && this.f6825y == aVar.f6825y && m.b(this.f6824x, aVar.f6824x) && this.G == aVar.G && m.b(this.F, aVar.F) && this.f6826z == aVar.f6826z && this.A == aVar.A && this.B == aVar.B && this.D == aVar.D && this.E == aVar.E && this.N == aVar.N && this.O == aVar.O && this.f6820c.equals(aVar.f6820c) && this.f6821d == aVar.f6821d && this.H.equals(aVar.H) && this.I.equals(aVar.I) && this.J.equals(aVar.J) && m.b(this.C, aVar.C) && m.b(this.L, aVar.L)) {
            return true;
        }
        return false;
    }

    public final a h(e4.m mVar, e4.e eVar) {
        if (this.M) {
            return clone().h(mVar, eVar);
        }
        m(e4.n.f3501f, mVar);
        return q(eVar, false);
    }

    public int hashCode() {
        float f10 = this.f6819b;
        char[] cArr = m.f8575a;
        return m.f(m.f(m.f(m.f(m.f(m.f(m.f(m.g(m.g(m.g(m.g((((m.g(m.f((m.f((m.f(((Float.floatToIntBits(f10) + 527) * 31) + this.f6823f, this.f6822e) * 31) + this.f6825y, this.f6824x) * 31) + this.G, this.F), this.f6826z) * 31) + this.A) * 31) + this.B, this.D), this.E), this.N), this.O), this.f6820c), this.f6821d), this.H), this.I), this.J), this.C), this.L);
    }

    public final a i(int i10, int i11) {
        if (this.M) {
            return clone().i(i10, i11);
        }
        this.B = i10;
        this.A = i11;
        this.f6818a |= 512;
        l();
        return this;
    }

    public final a j() {
        if (this.M) {
            return clone().j();
        }
        this.f6825y = R.drawable.bg_card;
        int i10 = this.f6818a | 128;
        this.f6824x = null;
        this.f6818a = i10 & (-65);
        l();
        return this;
    }

    public final a k() {
        com.bumptech.glide.g gVar = com.bumptech.glide.g.LOW;
        if (this.M) {
            return clone().k();
        }
        this.f6821d = gVar;
        this.f6818a |= 8;
        l();
        return this;
    }

    public final void l() {
        if (!this.K) {
        } else {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a m(k kVar, Object obj) {
        if (this.M) {
            return clone().m(kVar, obj);
        }
        w7.b.q(kVar);
        w7.b.q(obj);
        this.H.f10650b.put(kVar, obj);
        l();
        return this;
    }

    public final a n(o4.b bVar) {
        if (this.M) {
            return clone().n(bVar);
        }
        this.C = bVar;
        this.f6818a |= 1024;
        l();
        return this;
    }

    public final a o() {
        if (this.M) {
            return clone().o();
        }
        this.f6826z = false;
        this.f6818a |= 256;
        l();
        return this;
    }

    public final a p(Class cls, p pVar, boolean z9) {
        if (this.M) {
            return clone().p(cls, pVar, z9);
        }
        w7.b.q(pVar);
        this.I.put(cls, pVar);
        int i10 = this.f6818a | 2048;
        this.E = true;
        int i11 = i10 | 65536;
        this.f6818a = i11;
        this.P = false;
        if (z9) {
            this.f6818a = i11 | 131072;
            this.D = true;
        }
        l();
        return this;
    }

    public final a q(p pVar, boolean z9) {
        if (this.M) {
            return clone().q(pVar, z9);
        }
        r rVar = new r(pVar, z9);
        p(Bitmap.class, pVar, z9);
        p(Drawable.class, rVar, z9);
        p(BitmapDrawable.class, rVar, z9);
        p(g4.c.class, new g4.d(pVar), z9);
        l();
        return this;
    }

    public final a r() {
        if (this.M) {
            return clone().r();
        }
        this.Q = true;
        this.f6818a |= 1048576;
        l();
        return this;
    }
}
