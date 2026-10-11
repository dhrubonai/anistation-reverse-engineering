package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ee extends xz3 implements wu0, zo1, fa3 {
    public final u34 L;
    public final boolean M;
    public final float N;
    public final i75 O;
    public final kd1 P;
    public qb0 Q;
    public float R;
    public boolean T;
    public h65 V;
    public i65 W;
    public long S = 0;
    public final f44 U = new f44();

    public ee(u34 u34Var, boolean z, float f, i75 i75Var, kd1 kd1Var) {
        this.L = u34Var;
        this.M = z;
        this.N = f;
        this.O = i75Var;
        this.P = kd1Var;
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.xz3
    public final void S0() {
        tl7.z(O0(), null, null, new e52(this, null, (byte) 17), 3);
    }

    @Override // defpackage.xz3
    public final void T0() {
        h65 h65Var = this.V;
        if (h65Var != null) {
            this.W = null;
            v94.y(this);
            pv1 pv1Var = h65Var.A;
            i65 i65Var = (i65) pv1Var.a.get(this);
            if (i65Var != null) {
                i65Var.c();
                LinkedHashMap linkedHashMap = pv1Var.a;
                i65 i65Var2 = (i65) linkedHashMap.get(this);
                if (i65Var2 != null) {
                }
                linkedHashMap.remove(this);
                h65Var.z.add(i65Var);
            }
        }
    }

    @Override // defpackage.fa3, defpackage.yo3
    public final void a(long j) {
        float g0;
        this.T = true;
        ud1 ud1Var = wc7.O(this).V;
        this.S = m37.O(j);
        float f = this.N;
        if (Float.isNaN(f)) {
            long j2 = this.S;
            float e = uq5.e(j2);
            float c = uq5.c(j2);
            g0 = xc4.c((Float.floatToRawIntBits(c) & 4294967295L) | (Float.floatToRawIntBits(e) << 32)) / 2.0f;
            if (this.M) {
                g0 += ud1Var.g0(10.0f);
            }
        } else {
            g0 = ud1Var.g0(f);
        }
        this.R = g0;
        f44 f44Var = this.U;
        Object[] objArr = f44Var.a;
        int i = f44Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            a1((st4) objArr[i2]);
        }
        f44Var.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a1(st4 st4Var) {
        i65 i65Var;
        Object remove;
        View view;
        h65 h65Var;
        if (st4Var instanceof qt4) {
            qt4 qt4Var = (qt4) st4Var;
            long j = this.S;
            float f = this.R;
            h65 h65Var2 = this.V;
            h65 h65Var3 = h65Var2;
            if (h65Var2 == null) {
                Object obj = (View) t80.C(this, eb.f);
                while (!(obj instanceof ViewGroup)) {
                    Object parent = ((View) obj).getParent();
                    if (parent instanceof View) {
                        obj = parent;
                    } else {
                        ov3.m("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                        return;
                    }
                }
                ViewGroup viewGroup = (ViewGroup) obj;
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i < childCount) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof h65) {
                            h65Var = (h65) childAt;
                            break;
                        }
                        i++;
                    } else {
                        h65 h65Var4 = new h65(viewGroup.getContext());
                        viewGroup.addView(h65Var4);
                        h65Var = h65Var4;
                        break;
                    }
                }
                this.V = h65Var;
                h65Var3 = h65Var;
            }
            ArrayList arrayList = h65Var3.y;
            pv1 pv1Var = h65Var3.A;
            LinkedHashMap linkedHashMap = pv1Var.a;
            LinkedHashMap linkedHashMap2 = pv1Var.a;
            LinkedHashMap linkedHashMap3 = pv1Var.b;
            i65 i65Var2 = (i65) linkedHashMap.get(this);
            View view2 = i65Var2;
            if (i65Var2 == null) {
                ArrayList arrayList2 = h65Var3.z;
                arrayList2.getClass();
                if (arrayList2.isEmpty()) {
                    remove = null;
                } else {
                    remove = arrayList2.remove(0);
                }
                i65 i65Var3 = (i65) remove;
                View view3 = i65Var3;
                if (i65Var3 == null) {
                    if (h65Var3.B > te4.D(arrayList)) {
                        View view4 = new View(h65Var3.getContext());
                        h65Var3.addView(view4);
                        arrayList.add(view4);
                        view = view4;
                    } else {
                        i65 i65Var4 = (i65) arrayList.get(h65Var3.B);
                        ee eeVar = (ee) linkedHashMap3.get(i65Var4);
                        view = i65Var4;
                        if (eeVar != null) {
                            eeVar.W = null;
                            v94.y(eeVar);
                            i65 i65Var5 = (i65) linkedHashMap2.get(eeVar);
                            if (i65Var5 != null) {
                            }
                            linkedHashMap2.remove(eeVar);
                            i65Var4.c();
                            view = i65Var4;
                        }
                    }
                    int i2 = h65Var3.B;
                    if (i2 < h65Var3.x - 1) {
                        h65Var3.B = i2 + 1;
                        view3 = view;
                    } else {
                        h65Var3.B = 0;
                        view3 = view;
                    }
                }
                linkedHashMap2.put(this, view3);
                linkedHashMap3.put(view3, this);
                view2 = view3;
            }
            i65 i65Var6 = view2;
            int h0 = io3.h0(f);
            long p = this.O.p();
            this.P.invoke();
            i65Var6.b(qt4Var, this.M, j, h0, p, new y7(this, (byte) 15));
            this.W = i65Var6;
            v94.y(this);
            return;
        }
        if (st4Var instanceof rt4) {
            i65 i65Var7 = this.W;
            if (i65Var7 != null) {
                i65Var7.d();
                return;
            }
            return;
        }
        if ((st4Var instanceof pt4) && (i65Var = this.W) != null) {
            i65Var.d();
        }
    }

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        xg0 xg0Var = bb3Var.x;
        bb3Var.a();
        qb0 qb0Var = this.Q;
        if (qb0Var != null) {
            float f = this.R;
            long p = this.O.p();
            float floatValue = ((Number) ((wj) qb0Var.z).d()).floatValue();
            if (floatValue > 0.0f) {
                long b = ep0.b(floatValue, p);
                if (qb0Var.x) {
                    float e = uq5.e(xg0Var.g());
                    float c = uq5.c(xg0Var.g());
                    dn0 dn0Var = xg0Var.y;
                    long B = dn0Var.B();
                    dn0Var.y().h();
                    try {
                        ((dn0) ((af2) dn0Var.y).y).y().n(0.0f, 0.0f, e, c, 1);
                        bp1.G0(bb3Var, b, f, 0L, 124);
                    } finally {
                        h11.u(dn0Var, B);
                    }
                } else {
                    bp1.G0(bb3Var, b, f, 0L, 124);
                }
            }
        }
        vg0 y = xg0Var.y.y();
        i65 i65Var = this.W;
        if (i65Var != null) {
            long j = this.S;
            int h0 = io3.h0(this.R);
            long p2 = this.O.p();
            this.P.invoke();
            i65Var.e(j, h0, p2);
            i65Var.draw(u9.a(y));
        }
    }
}
