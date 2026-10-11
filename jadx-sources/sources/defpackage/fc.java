package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fc {
    public final ud1 a;
    public long b = 9205357640488583168L;
    public final er1 c;
    public final ti4 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final zc1 i;

    public fc(Context context, ud1 ud1Var, long j, vh4 vh4Var) {
        mh2 mh2Var;
        this.a = ud1Var;
        er1 er1Var = new er1(context, w65.U(j));
        this.c = er1Var;
        this.d = new ti4(pn6.a, h95.H);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        ec ecVar = new ec(this, (byte) 0);
        nq4 nq4Var = v36.a;
        a46 a46Var = new a46(null, null, null, ecVar);
        if (Build.VERSION.SDK_INT >= 31) {
            mh2Var = new mh2(a46Var, this, er1Var);
        } else {
            mh2Var = new mh2(a46Var, this, er1Var, vh4Var);
        }
        this.i = mh2Var;
    }

    public final void a() {
        boolean z;
        er1 er1Var = this.c;
        EdgeEffect edgeEffect = er1Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = er1Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            if (edgeEffect2.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        EdgeEffect edgeEffect3 = er1Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        EdgeEffect edgeEffect4 = er1Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0129, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, defpackage.ic2 r21, defpackage.xz0 r22) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc.b(long, ic2, xz0):java.lang.Object");
    }

    public final long c() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = bx7.w(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(pn6.a);
        }
    }

    public final boolean e() {
        float f;
        float f2;
        float f3;
        float f4;
        er1 er1Var = this.c;
        EdgeEffect edgeEffect = er1Var.d;
        if (edgeEffect != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f4 = hb.d(edgeEffect);
            } else {
                f4 = 0.0f;
            }
            if (f4 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = er1Var.e;
        if (edgeEffect2 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f3 = hb.d(edgeEffect2);
            } else {
                f3 = 0.0f;
            }
            if (f3 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = er1Var.f;
        if (edgeEffect3 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f2 = hb.d(edgeEffect3);
            } else {
                f2 = 0.0f;
            }
            if (f2 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = er1Var.g;
        if (edgeEffect4 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f = hb.d(edgeEffect4);
            } else {
                f = 0.0f;
            }
            if (f != 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final float f(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b = this.c.b();
        float f2 = -intBitsToFloat2;
        float f3 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f2 = hb.g(b, f2, f3);
        } else {
            b.onPull(f2, f3);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f2);
        if (i2 >= 31) {
            f = hb.d(b);
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c = this.c.c();
        float f2 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = hb.g(c, intBitsToFloat2, f2);
        } else {
            c.onPull(intBitsToFloat2, f2);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2;
        if (i2 >= 31) {
            f = hb.d(c);
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d = this.c.d();
        float f2 = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f2 = hb.g(d, f2, intBitsToFloat);
        } else {
            d.onPull(f2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g >> 32)) * (-f2);
        if (i2 >= 31) {
            f = hb.d(d);
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = hb.g(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2;
        if (i2 >= 31) {
            f = hb.d(e);
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean b = uq5.b(this.g, 0L);
        boolean b2 = uq5.b(j, this.g);
        this.g = j;
        if (!b2) {
            long h0 = (io3.h0(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (io3.h0(Float.intBitsToFloat((int) (j >> 32))) << 32);
            er1 er1Var = this.c;
            er1Var.c = h0;
            EdgeEffect edgeEffect = er1Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (h0 >> 32), (int) (h0 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = er1Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (h0 >> 32), (int) (h0 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = er1Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (h0 & 4294967295L), (int) (h0 >> 32));
            }
            EdgeEffect edgeEffect4 = er1Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (h0 & 4294967295L), (int) (h0 >> 32));
            }
            EdgeEffect edgeEffect5 = er1Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (h0 >> 32), (int) (h0 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = er1Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (h0 >> 32), (int) (h0 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = er1Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (h0 & 4294967295L), (int) (h0 >> 32));
            }
            EdgeEffect edgeEffect8 = er1Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & h0), (int) (h0 >> 32));
            }
        }
        if (!b && !b2) {
            a();
        }
    }
}
