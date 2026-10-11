package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class md3 {
    public rx0 b;
    public int c;
    public int d;
    public int f;
    public int g;
    public final /* synthetic */ od3 h;
    public kd3[] a = nx7.B;
    public int e = 1;

    public md3(od3 od3Var) {
        this.h = od3Var;
    }

    public static void b(md3 md3Var, vd3 vd3Var, v11 v11Var, ci2 ci2Var, int i, int i2, boolean z) {
        long j;
        md3Var.h.getClass();
        long g = vd3Var.g(0);
        if (!z) {
            j = g & 4294967295L;
        } else {
            j = g >> 32;
        }
        md3Var.a(vd3Var, v11Var, ci2Var, i, i2, (int) j);
    }

    public final void a(vd3 vd3Var, v11 v11Var, ci2 ci2Var, int i, int i2, int i3) {
        kd3[] kd3VarArr;
        bd3 bd3Var;
        kd3[] kd3VarArr2 = this.a;
        int length = kd3VarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                kd3 kd3Var = kd3VarArr2[i4];
                if (kd3Var != null && kd3Var.e) {
                    break;
                } else {
                    i4++;
                }
            } else {
                this.f = i;
                this.g = i2;
                break;
            }
        }
        int size = vd3Var.e().size();
        int length2 = this.a.length;
        while (true) {
            kd3VarArr = this.a;
            if (size >= length2) {
                break;
            }
            kd3 kd3Var2 = kd3VarArr[size];
            if (kd3Var2 != null) {
                kd3Var2.c();
            }
            size++;
        }
        if (kd3VarArr.length != vd3Var.e().size()) {
            this.a = (kd3[]) Arrays.copyOf(this.a, vd3Var.e().size());
        }
        this.b = new rx0(vd3Var.d());
        this.c = i3;
        this.d = vd3Var.h();
        this.e = vd3Var.b();
        int size2 = vd3Var.e().size();
        for (int i5 = 0; i5 < size2; i5++) {
            Object w = ((em4) vd3Var.e().get(i5)).w();
            if (w instanceof bd3) {
                bd3Var = (bd3) w;
            } else {
                bd3Var = null;
            }
            kd3[] kd3VarArr3 = this.a;
            if (bd3Var == null) {
                kd3 kd3Var3 = kd3VarArr3[i5];
                if (kd3Var3 != null) {
                    kd3Var3.c();
                }
                this.a[i5] = null;
            } else {
                kd3 kd3Var4 = kd3VarArr3[i5];
                if (kd3Var4 == null) {
                    kd3Var4 = new kd3(v11Var, ci2Var, new vt0(this.h, (byte) 19));
                    this.a[i5] = kd3Var4;
                }
                kd3Var4.d = bd3Var.L;
            }
        }
    }
}
