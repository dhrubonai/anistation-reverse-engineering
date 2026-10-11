package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a46 extends xz3 implements yq4, ud1, xq4 {
    public Object L;
    public Object M;
    public Object[] N;
    public PointerInputEventHandler O;
    public bx5 P;
    public nq4 Q = v36.a;
    public final z44 R;
    public final z44 S;
    public final z44 T;
    public nq4 U;
    public long V;

    public a46(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.L = obj;
        this.M = obj2;
        this.N = objArr;
        this.O = pointerInputEventHandler;
        z44 z44Var = new z44(new z36[16], 0);
        this.R = z44Var;
        this.S = z44Var;
        this.T = new z44(new z36[16], 0);
        this.V = 0L;
    }

    @Override // defpackage.xq4
    public final void F0() {
        c1();
    }

    @Override // defpackage.xq4
    public final void J() {
        nq4 nq4Var = this.U;
        if (nq4Var == null) {
            return;
        }
        List list = nq4Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((uq4) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    uq4 uq4Var = (uq4) list.get(i2);
                    long j = uq4Var.a;
                    long j2 = uq4Var.c;
                    long j3 = uq4Var.b;
                    float f = uq4Var.e;
                    boolean z = uq4Var.d;
                    arrayList.add(new uq4(j, j3, j2, false, f, j3, j2, z, z, uq4Var.i, 0L, 1.0f, 0L));
                }
                nq4 nq4Var2 = new nq4(arrayList, null);
                this.Q = nq4Var2;
                b1(nq4Var2, oq4.x);
                b1(nq4Var2, oq4.y);
                b1(nq4Var2, oq4.z);
                this.U = null;
                return;
            }
        }
    }

    @Override // defpackage.xz3
    public final void T0() {
        c1();
    }

    public final Object a1(ic2 ic2Var, vz0 vz0Var) {
        qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        z36 z36Var = new z36(this, qg0Var);
        synchronized (this.S) {
            this.R.b(z36Var);
            new t85(wc7.z(wc7.j(z36Var, z36Var, ic2Var)), w11.x).resumeWith(pn6.a);
        }
        qg0Var.v(new yd(z36Var, (byte) 6));
        return qg0Var.r();
    }

    @Override // defpackage.ud1
    public final float b() {
        return wc7.O(this).V.b();
    }

    public final void b1(nq4 nq4Var, oq4 oq4Var) {
        qg0 qg0Var;
        qg0 qg0Var2;
        synchronized (this.S) {
            z44 z44Var = this.T;
            z44Var.c(z44Var.z, this.R);
        }
        try {
            int ordinal = oq4Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new er0((byte) 4);
                    }
                } else {
                    z44 z44Var2 = this.T;
                    int i = z44Var2.z - 1;
                    Object[] objArr = z44Var2.x;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            z36 z36Var = (z36) objArr[i];
                            if (oq4Var == z36Var.A && (qg0Var2 = z36Var.z) != null) {
                                z36Var.z = null;
                                qg0Var2.resumeWith(nq4Var);
                            }
                            i--;
                        }
                    }
                    this.T.h();
                }
            }
            z44 z44Var3 = this.T;
            Object[] objArr2 = z44Var3.x;
            int i2 = z44Var3.z;
            for (int i3 = 0; i3 < i2; i3++) {
                z36 z36Var2 = (z36) objArr2[i3];
                if (oq4Var == z36Var2.A && (qg0Var = z36Var2.z) != null) {
                    z36Var2.z = null;
                    qg0Var.resumeWith(nq4Var);
                }
            }
            this.T.h();
        } catch (Throwable th) {
            this.T.h();
            throw th;
        }
    }

    public final void c1() {
        bx5 bx5Var = this.P;
        if (bx5Var != null) {
            bx5Var.s(new tm4("Pointer input was reset", (byte) 2));
            this.P = null;
        }
    }

    @Override // defpackage.yc1, defpackage.xq4
    public final void f() {
        c1();
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return wc7.O(this).V.getFontScale();
    }

    @Override // defpackage.xq4
    public final void x(nq4 nq4Var, oq4 oq4Var, long j) {
        this.V = j;
        if (oq4Var == oq4.x) {
            this.Q = nq4Var;
        }
        vz0 vz0Var = null;
        if (this.P == null) {
            this.P = tl7.z(O0(), null, y11.A, new nf6(this, vz0Var, (byte) 5), 1);
        }
        b1(nq4Var, oq4Var);
        List list = nq4Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!t80.y((uq4) list.get(i))) {
                    break;
                } else {
                    i++;
                }
            } else {
                nq4Var = null;
                break;
            }
        }
        this.U = nq4Var;
    }
}
