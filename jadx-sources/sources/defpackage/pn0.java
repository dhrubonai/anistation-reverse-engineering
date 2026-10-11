package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pn0 implements xc2 {
    public Object A;
    public Object B;
    public final /* synthetic */ byte x;
    public boolean y;
    public boolean z;

    public pn0(byte b) {
        this.x = b;
        switch (b) {
            case 5:
                return;
            default:
                this.y = true;
                return;
        }
    }

    public jw0 a() {
        return new jw0(this.y, this.z, (String[]) this.A, (String[]) this.B);
    }

    public void b(bm0... bm0VarArr) {
        if (this.y) {
            ArrayList arrayList = new ArrayList(bm0VarArr.length);
            for (bm0 bm0Var : bm0VarArr) {
                arrayList.add(bm0Var.a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            c((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        ze0.k("no cipher suites for cleartext connections");
    }

    public void c(String... strArr) {
        if (this.y) {
            if (strArr.length != 0) {
                this.A = (String[]) strArr.clone();
                return;
            } else {
                ze0.k("At least one cipher suite is required");
                return;
            }
        }
        ze0.k("no cipher suites for cleartext connections");
    }

    public void d(yf6... yf6VarArr) {
        if (this.y) {
            ArrayList arrayList = new ArrayList(yf6VarArr.length);
            for (yf6 yf6Var : yf6VarArr) {
                arrayList.add(yf6Var.x);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            e((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        ze0.k("no TLS versions for cleartext connections");
    }

    public void e(String... strArr) {
        if (this.y) {
            if (strArr.length != 0) {
                this.B = (String[]) strArr.clone();
                return;
            } else {
                ze0.k("At least one TLS version is required");
                return;
            }
        }
        ze0.k("no TLS versions for cleartext connections");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pn0.f():void");
    }

    @Override // defpackage.xc2
    public void onSuccess(Object obj) {
        final et3 et3Var = (et3) obj;
        bu3 bu3Var = ((wu3) this.B).i;
        final dt3 dt3Var = (dt3) this.A;
        final boolean z = this.y;
        final boolean z2 = this.z;
        Runnable runnable = new Runnable() { // from class: qu3
            @Override // java.lang.Runnable
            public final void run() {
                bu3 bu3Var2 = ((wu3) pn0.this.B).i;
                bu3Var2.t();
                fq4 fq4Var = bu3Var2.t;
                x97.Q(fq4Var, et3Var);
                int h0 = fq4Var.h0();
                if (z) {
                    if (h0 == 1) {
                        if (fq4Var.t0(2)) {
                            fq4Var.a();
                        }
                    } else if (h0 == 4 && fq4Var.t0(4)) {
                        fq4Var.B();
                    }
                }
                boolean z3 = z2;
                if (z3 && fq4Var.t0(1)) {
                    fq4Var.p0();
                }
                fo4 fo4Var = new fo4();
                fo4Var.a.c(31, 2);
                fo4Var.a(1, z3);
                fo4Var.b();
                bu3Var2.n(dt3Var);
            }
        };
        bu3Var.getClass();
        runnable.run();
    }

    public String toString() {
        String str;
        String str2;
        switch (this.x) {
            case 3:
                if (this.y) {
                    str = "Video";
                } else {
                    str = "Audio";
                }
                if (this.z) {
                    str2 = "Decoder";
                } else {
                    str2 = "Encoder";
                }
                StringBuilder n = h11.n("CodecInfo{type=", str.concat(str2), ", configurationFormat=");
                n.append((String) this.A);
                n.append(", name=");
                return qx1.p(n, (String) this.B, '}');
            default:
                return super.toString();
        }
    }

    public pn0(String str, boolean z, boolean z2, String str2) {
        this.x = (byte) 3;
        this.A = str;
        this.y = z;
        this.z = z2;
        this.B = str2;
    }

    public pn0(lw3 lw3Var) {
        this.x = (byte) 0;
        lw3Var.getClass();
        this.A = lw3Var;
        this.B = new oq3();
    }

    @Override // defpackage.xc2
    public void t(Throwable th) {
    }

    public pn0(kl1 kl1Var) {
        this.x = (byte) 2;
        this.B = kl1Var;
        this.A = new Handler(Looper.getMainLooper());
    }

    public pn0(wu3 wu3Var, dt3 dt3Var, boolean z, boolean z2) {
        this.x = (byte) 4;
        this.B = wu3Var;
        this.A = dt3Var;
        this.y = z;
        this.z = z2;
    }
}
