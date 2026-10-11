package defpackage;

import android.content.SharedPreferences;
import android.util.SparseLongArray;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ok2 implements hp5, ws6, c12, d12, fp3, ce4 {
    public final /* synthetic */ byte x;
    public long y;
    public Object z;

    public /* synthetic */ ok2(bt7 bt7Var, long j) {
        boolean z;
        this.x = (byte) 10;
        this.z = bt7Var;
        a34.u("health_monitor");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        a34.n(z);
        this.y = j;
    }

    public static long B(ok2 ok2Var, long j, float f) {
        float abs;
        long j2;
        long f2 = xc4.f(ok2Var.y, j);
        ok2Var.y = f2;
        if (((rg4) ok2Var.z) == null) {
            abs = xc4.c(f2);
        } else {
            abs = Math.abs(ok2Var.C(f2));
        }
        if (abs > 0.0f && abs >= f) {
            rg4 rg4Var = (rg4) ok2Var.z;
            long j3 = ok2Var.y;
            if (rg4Var == null) {
                float c = xc4.c(j3);
                float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / c;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) / c;
                return xc4.e(ok2Var.y, xc4.g(f, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)));
            }
            float C = ok2Var.C(j3) - (Math.signum(ok2Var.C(ok2Var.y)) * f);
            long j4 = ok2Var.y;
            rg4 rg4Var2 = (rg4) ok2Var.z;
            rg4 rg4Var3 = rg4.y;
            if (rg4Var2 == rg4Var3) {
                j2 = j4 & 4294967295L;
            } else {
                j2 = j4 >> 32;
            }
            float intBitsToFloat3 = Float.intBitsToFloat((int) j2);
            if (((rg4) ok2Var.z) == rg4Var3) {
                return (Float.floatToRawIntBits(C) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
            }
            return (Float.floatToRawIntBits(C) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32);
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.c12
    public void A(byte[] bArr, int i, int i2) {
        ((c12) this.z).A(bArr, i, i2);
    }

    public float C(long j) {
        long j2;
        if (((rg4) this.z) == rg4.y) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public ik2 D() {
        gk2 gk2Var = new gk2((byte) 0);
        while (true) {
            String K = ((db0) this.z).K(this.y);
            this.y -= K.length();
            if (K.length() == 0) {
                return gk2Var.i();
            }
            int S = uz5.S(K, ':', 1, 4);
            if (S != -1) {
                gk2Var.h(K.substring(0, S), K.substring(S + 1));
            } else if (K.charAt(0) == ':') {
                gk2Var.h("", K.substring(1));
            } else {
                gk2Var.h("", K);
            }
        }
    }

    public void E(int i, long j) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.z;
        long j2 = sparseLongArray.get(i, -9223372036854775807L);
        if (j2 == -9223372036854775807L || j > j2) {
            sparseLongArray.put(i, j);
            if (j2 != -9223372036854775807L && j2 != this.y) {
                return;
            }
            String str = eq6.a;
            if (sparseLongArray.size() != 0) {
                long j3 = Long.MAX_VALUE;
                for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
                    j3 = Math.min(j3, sparseLongArray.valueAt(i2));
                }
                this.y = j3;
                return;
            }
            qi2.e();
        }
    }

    public void F() {
        bt7 bt7Var = (bt7) this.z;
        bt7Var.L();
        ((gu7) bt7Var.x).H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = bt7Var.P().edit();
        edit.remove("health_monitor:count");
        edit.remove("health_monitor:value");
        edit.putLong("health_monitor:start", currentTimeMillis);
        edit.apply();
    }

    @Override // defpackage.d12
    public bh6 G(int i, int i2) {
        return ((d12) this.z).G(i, i2);
    }

    @Override // defpackage.d12
    public void I(hf5 hf5Var) {
        ((d12) this.z).I(new hx5(this, hf5Var, hf5Var));
    }

    @Override // defpackage.ws6
    public void a(ns6 ns6Var) {
        ((up5) this.z).e.execute(new sp5(this, ns6Var, (byte) 0));
    }

    @Override // defpackage.ws6
    public void c(int i, int i2) {
        ((up5) this.z).e.execute(new i34(this, i, i2, (byte) 1));
    }

    @Override // defpackage.ws6
    public void d(long j, boolean z) {
        if (j == 0) {
            ((up5) this.z).k = true;
        }
        this.y = j;
        ((up5) this.z).e.execute(new j34(this, j, z, (byte) 1));
    }

    @Override // defpackage.fp3
    public rn4 e() {
        return rn4.d;
    }

    @Override // defpackage.ws6
    public void f(float f) {
        ((up5) this.z).e.execute(new h34(this, f, (byte) 1));
    }

    @Override // defpackage.c12
    public boolean g(byte[] bArr, int i, int i2, boolean z) {
        return ((c12) this.z).g(bArr, 0, i2, z);
    }

    @Override // defpackage.hp5
    public long get() {
        long j = this.y;
        if (j != -9223372036854775807L) {
            return j;
        }
        return ((hp5) this.z).get();
    }

    @Override // defpackage.c12
    public long getPosition() {
        return ((c12) this.z).getPosition() - this.y;
    }

    @Override // defpackage.c12
    public boolean i(int i, boolean z) {
        return ((c12) this.z).i(i, true);
    }

    @Override // defpackage.c12
    public boolean j(byte[] bArr, int i, int i2, boolean z) {
        return ((c12) this.z).j(bArr, i, i2, z);
    }

    @Override // defpackage.c12
    public long k() {
        return ((c12) this.z).k() - this.y;
    }

    @Override // defpackage.c12
    public void l(int i) {
        ((c12) this.z).l(i);
    }

    @Override // defpackage.fp3
    public long m() {
        return this.y;
    }

    @Override // defpackage.c12
    public int n(int i) {
        return ((c12) this.z).n(i);
    }

    @Override // defpackage.ce4
    public void onFailure(Exception exc) {
        int i;
        switch (this.x) {
            case 8:
                if (exc instanceof bp) {
                    i = ((bp) exc).x.x;
                } else {
                    i = 13;
                }
                long j = this.y;
                Iterator it = ((s25) ((xf6) this.z).A).c.d.iterator();
                while (it.hasNext()) {
                    ((bl7) it.next()).d(j, i, null);
                }
                return;
            default:
                l87 l87Var = (l87) this.z;
                ((AtomicLong) l87Var.A).set(this.y);
                return;
        }
    }

    @Override // defpackage.c12
    public long p() {
        return ((c12) this.z).p() - this.y;
    }

    @Override // defpackage.c12
    public int r(byte[] bArr, int i, int i2) {
        return ((c12) this.z).r(bArr, i, i2);
    }

    @Override // defpackage.m41
    public int read(byte[] bArr, int i, int i2) {
        return ((c12) this.z).read(bArr, i, i2);
    }

    @Override // defpackage.c12
    public void readFully(byte[] bArr, int i, int i2) {
        ((c12) this.z).readFully(bArr, i, i2);
    }

    @Override // defpackage.d12
    public void t() {
        ((d12) this.z).t();
    }

    @Override // defpackage.c12
    public void u() {
        ((c12) this.z).u();
    }

    @Override // defpackage.c12
    public void v(int i) {
        ((c12) this.z).v(i);
    }

    @Override // defpackage.ws6
    public void w() {
        ((up5) this.z).e.execute(new a92(this, (byte) 22));
    }

    @Override // defpackage.c12
    public boolean x(int i, boolean z) {
        return ((c12) this.z).x(i, true);
    }

    @Override // defpackage.fp3
    public void b(rn4 rn4Var) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ok2(rg4 rg4Var) {
        this((Object) rg4Var, 0L, (byte) 6);
        this.x = (byte) 6;
    }

    public /* synthetic */ ok2(Object obj, long j, byte b) {
        this.x = b;
        this.z = obj;
        this.y = j;
    }

    public /* synthetic */ ok2(long j, Object obj, byte b) {
        this.x = b;
        this.y = j;
        this.z = obj;
    }

    public ok2(db0 db0Var) {
        this.x = (byte) 0;
        this.z = db0Var;
        this.y = 262144L;
    }

    public ok2(c12 c12Var, long j) {
        this.x = (byte) 4;
        this.z = c12Var;
        io3.n(c12Var.getPosition() >= j);
        this.y = j;
    }

    public ok2() {
        this.x = (byte) 7;
        this.z = new SparseLongArray();
    }

    public ok2(up5 up5Var) {
        this.x = (byte) 3;
        this.z = up5Var;
    }

    public ok2(hp5 hp5Var) {
        this.x = (byte) 2;
        this.z = hp5Var;
        this.y = -9223372036854775807L;
    }
}
