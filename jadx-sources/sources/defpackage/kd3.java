package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kd3 {
    public final v11 a;
    public final ci2 b;
    public final vt0 c;
    public j32 d;
    public boolean e;
    public final ti4 f;
    public final ti4 g;
    public final ti4 h;
    public final ti4 i;
    public long j;
    public long k;
    public long l;
    public di2 m;
    public final wj n;
    public final wj o;
    public final ti4 p;

    public kd3(v11 v11Var, ci2 ci2Var, vt0 vt0Var) {
        di2 di2Var;
        this.a = v11Var;
        this.b = ci2Var;
        this.c = vt0Var;
        Boolean bool = Boolean.FALSE;
        this.f = xt5.g(bool);
        this.g = xt5.g(bool);
        this.h = xt5.g(bool);
        this.i = xt5.g(bool);
        this.j = 9223372034707292159L;
        this.k = 0L;
        this.l = 9223372034707292159L;
        Object obj = null;
        if (ci2Var != null) {
            di2Var = ci2Var.b();
        } else {
            di2Var = null;
        }
        this.m = di2Var;
        int i = 12;
        this.n = new wj(new c13(0L), db.r, obj, i);
        this.o = new wj(Float.valueOf(1.0f), db.l, obj, i);
        this.p = xt5.g(new c13(0L));
    }

    public final void a() {
        di2 di2Var = this.m;
        ((Boolean) this.g.getValue()).booleanValue();
        if (b()) {
            if (di2Var != null) {
                di2Var.f(1.0f);
            }
            tl7.z(this.a, null, null, new jd3(this, null, (byte) 0), 3);
        }
    }

    public final boolean b() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final void c() {
        ci2 ci2Var;
        ti4 ti4Var = this.f;
        boolean booleanValue = ((Boolean) ti4Var.getValue()).booleanValue();
        byte b = 3;
        v11 v11Var = this.a;
        vz0 vz0Var = null;
        if (booleanValue) {
            ti4Var.setValue(Boolean.FALSE);
            tl7.z(v11Var, null, null, new jd3(this, vz0Var, (byte) 2), 3);
        }
        ti4 ti4Var2 = this.g;
        if (((Boolean) ti4Var2.getValue()).booleanValue()) {
            ti4Var2.setValue(Boolean.FALSE);
            tl7.z(v11Var, null, null, new jd3(this, vz0Var, b), 3);
        }
        if (b()) {
            this.h.setValue(Boolean.FALSE);
            tl7.z(v11Var, null, null, new jd3(this, vz0Var, (byte) 4), 3);
        }
        this.e = false;
        d(0L);
        this.j = 9223372034707292159L;
        di2 di2Var = this.m;
        if (di2Var != null && (ci2Var = this.b) != null) {
            ci2Var.a(di2Var);
        }
        this.m = null;
        this.d = null;
    }

    public final void d(long j) {
        this.p.setValue(new c13(j));
    }
}
