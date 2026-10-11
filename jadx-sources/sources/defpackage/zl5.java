package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zl5 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ hm5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zl5(hm5 hm5Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = hm5Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        hm5 hm5Var = this.z;
        switch (b) {
            case 0:
                return new zl5(hm5Var, vz0Var, (byte) 0);
            case 1:
                return new zl5(hm5Var, vz0Var, (byte) 1);
            case 2:
                return new zl5(hm5Var, vz0Var, (byte) 2);
            case 3:
                return new zl5(hm5Var, vz0Var, (byte) 3);
            case 4:
                return new zl5(hm5Var, vz0Var, (byte) 4);
            case 5:
                return new zl5(hm5Var, vz0Var, (byte) 5);
            case 6:
                return new zl5(hm5Var, vz0Var, (byte) 6);
            case 7:
                return new zl5(hm5Var, vz0Var, (byte) 7);
            case 8:
                return new zl5(hm5Var, vz0Var, (byte) 8);
            case 9:
                return new zl5(hm5Var, vz0Var, (byte) 9);
            case 10:
                return new zl5(hm5Var, vz0Var, (byte) 10);
            case 11:
                return new zl5(hm5Var, vz0Var, (byte) 11);
            case 12:
                return new zl5(hm5Var, vz0Var, (byte) 12);
            case 13:
                return new zl5(hm5Var, vz0Var, (byte) 13);
            case 14:
                return new zl5(hm5Var, vz0Var, (byte) 14);
            case 15:
                return new zl5(hm5Var, vz0Var, (byte) 15);
            case 16:
                return new zl5(hm5Var, vz0Var, (byte) 16);
            case 17:
                zl5 zl5Var = new zl5(hm5Var, vz0Var, (byte) 17);
                zl5Var.y = ((Boolean) obj).booleanValue();
                return zl5Var;
            case 18:
                return new zl5(hm5Var, vz0Var, (byte) 18);
            default:
                return new zl5(hm5Var, vz0Var, (byte) 19);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 6:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 7:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 9:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 10:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 11:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 12:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 13:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 14:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 15:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 16:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zl5) create(bool, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 18:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((zl5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        byte b2 = 11;
        byte b3 = 12;
        byte b4 = 2;
        byte b5 = 13;
        byte b6 = 14;
        byte b7 = 15;
        byte b8 = 0;
        byte b9 = 16;
        byte b10 = 17;
        w11 w11Var = w11.x;
        hm5 hm5Var = this.z;
        byte b11 = 1;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var = ((mf2) hm5Var.d).a;
                    in inVar = new in(hh2Var.a(hh2Var.a).getData(), (byte) 9);
                    ja1 ja1Var = rh1.a;
                    w42 D = zz.D(inVar, j91.y);
                    yl5 yl5Var = new yl5(hm5Var, vz0Var, b8);
                    this.y = true;
                    if (iv.q(D, yl5Var, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 1:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var2 = ((mf2) hm5Var.d).a;
                    in inVar2 = new in(hh2Var2.a(hh2Var2.a).getData(), (byte) 10);
                    ja1 ja1Var2 = rh1.a;
                    w42 D2 = zz.D(inVar2, j91.y);
                    yl5 yl5Var2 = new yl5(hm5Var, vz0Var, b11);
                    this.y = true;
                    if (iv.q(D2, yl5Var2, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 2:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var3 = ((mf2) hm5Var.d).a;
                    in inVar3 = new in(hh2Var3.b(hh2Var3.a).getData(), (byte) 11);
                    ja1 ja1Var3 = rh1.a;
                    w42 D3 = zz.D(inVar3, j91.y);
                    yl5 yl5Var3 = new yl5(hm5Var, vz0Var, b4);
                    this.y = true;
                    if (iv.q(D3, yl5Var3, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 3:
                boolean z4 = this.y;
                if (z4) {
                    if (z4) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var4 = ((mf2) hm5Var.d).a;
                    in inVar4 = new in(hh2Var4.b(hh2Var4.a).getData(), (byte) 12);
                    ja1 ja1Var4 = rh1.a;
                    w42 D4 = zz.D(inVar4, j91.y);
                    yl5 yl5Var4 = new yl5(hm5Var, vz0Var, (byte) 3);
                    this.y = true;
                    if (iv.q(D4, yl5Var4, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 4:
                boolean z5 = this.y;
                if (z5) {
                    if (z5) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var5 = ((mf2) hm5Var.d).a;
                    in inVar5 = new in(hh2Var5.a(hh2Var5.a).getData(), (byte) 13);
                    ja1 ja1Var5 = rh1.a;
                    w42 D5 = zz.D(inVar5, j91.y);
                    yl5 yl5Var5 = new yl5(hm5Var, vz0Var, (byte) 4);
                    this.y = true;
                    if (iv.q(D5, yl5Var5, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 5:
                boolean z6 = this.y;
                if (z6) {
                    if (z6) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var6 = ((mf2) hm5Var.d).a;
                    in inVar6 = new in(hh2Var6.a(hh2Var6.a).getData(), (byte) 14);
                    ja1 ja1Var6 = rh1.a;
                    w42 D6 = zz.D(inVar6, j91.y);
                    yl5 yl5Var6 = new yl5(hm5Var, vz0Var, (byte) 5);
                    this.y = true;
                    if (iv.q(D6, yl5Var6, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 6:
                boolean z7 = this.y;
                if (z7) {
                    if (z7) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var7 = ((mf2) hm5Var.d).a;
                    in inVar7 = new in(hh2Var7.a(hh2Var7.a).getData(), (byte) 15);
                    ja1 ja1Var7 = rh1.a;
                    w42 D7 = zz.D(inVar7, j91.y);
                    yl5 yl5Var7 = new yl5(hm5Var, vz0Var, (byte) 6);
                    this.y = true;
                    if (iv.q(D7, yl5Var7, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 7:
                boolean z8 = this.y;
                if (z8) {
                    if (z8) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var8 = ((mf2) hm5Var.d).a;
                    w42 m = sw0.m(new in(hh2Var8.a(hh2Var8.a).getData(), (byte) 16));
                    ja1 ja1Var8 = rh1.a;
                    w42 D8 = zz.D(m, j91.y);
                    yl5 yl5Var8 = new yl5(hm5Var, vz0Var, (byte) 7);
                    this.y = true;
                    if (iv.q(D8, yl5Var8, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 8:
                boolean z9 = this.y;
                if (z9) {
                    if (z9) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var9 = ((mf2) hm5Var.d).a;
                    in inVar8 = new in(hh2Var9.a(hh2Var9.a).getData(), (byte) 17);
                    ja1 ja1Var9 = rh1.a;
                    w42 D9 = zz.D(inVar8, j91.y);
                    yl5 yl5Var9 = new yl5(hm5Var, vz0Var, (byte) 8);
                    this.y = true;
                    if (iv.q(D9, yl5Var9, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 9:
                boolean z10 = this.y;
                if (z10) {
                    if (z10) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var10 = ((mf2) hm5Var.d).a;
                    in inVar9 = new in(hh2Var10.a(hh2Var10.a).getData(), (byte) 18);
                    ja1 ja1Var10 = rh1.a;
                    w42 D10 = zz.D(inVar9, j91.y);
                    yl5 yl5Var10 = new yl5(hm5Var, vz0Var, (byte) 9);
                    this.y = true;
                    if (iv.q(D10, yl5Var10, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 10:
                boolean z11 = this.y;
                if (z11) {
                    if (z11) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var11 = ((mf2) hm5Var.d).a;
                    g10 g10Var = new g10(hh2Var11.a(hh2Var11.a).getData(), hh2Var11, (byte) 4);
                    ja1 ja1Var11 = rh1.a;
                    w42 D11 = zz.D(g10Var, j91.y);
                    yl5 yl5Var11 = new yl5(hm5Var, vz0Var, (byte) 10);
                    this.y = true;
                    if (iv.q(D11, yl5Var11, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 11:
                boolean z12 = this.y;
                if (z12) {
                    if (z12) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var12 = ((mf2) hm5Var.d).a;
                    in inVar10 = new in(hh2Var12.a(hh2Var12.a).getData(), (byte) 19);
                    ja1 ja1Var12 = rh1.a;
                    w42 D12 = zz.D(inVar10, j91.y);
                    yl5 yl5Var12 = new yl5(hm5Var, vz0Var, b2);
                    this.y = true;
                    if (iv.q(D12, yl5Var12, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 12:
                boolean z13 = this.y;
                if (z13) {
                    if (z13) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hu6 hu6Var = new hu6(bv6.a(((qt6) hm5Var.e).a.a).getData(), (byte) 2);
                    ja1 ja1Var13 = rh1.a;
                    w42 D13 = zz.D(hu6Var, j91.y);
                    yl5 yl5Var13 = new yl5(hm5Var, vz0Var, b3);
                    this.y = true;
                    if (iv.q(D13, yl5Var13, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 13:
                boolean z14 = this.y;
                if (z14) {
                    if (z14) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var13 = ((mf2) hm5Var.d).a;
                    w42 m2 = sw0.m(new in(hh2Var13.a(hh2Var13.a).getData(), (byte) 20));
                    ja1 ja1Var14 = rh1.a;
                    w42 D14 = zz.D(m2, j91.y);
                    yl5 yl5Var14 = new yl5(hm5Var, vz0Var, b5);
                    this.y = true;
                    if (iv.q(D14, yl5Var14, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 14:
                boolean z15 = this.y;
                if (z15) {
                    if (z15) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    hh2 hh2Var14 = ((mf2) hm5Var.d).a;
                    in inVar11 = new in(hh2Var14.a(hh2Var14.a).getData(), (byte) 21);
                    ja1 ja1Var15 = rh1.a;
                    w42 D15 = zz.D(inVar11, j91.y);
                    yl5 yl5Var15 = new yl5(hm5Var, vz0Var, b6);
                    this.y = true;
                    if (iv.q(D15, yl5Var15, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 15:
                boolean z16 = this.y;
                if (z16) {
                    if (z16) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    m10 m10Var = (m10) hm5Var.h;
                    w42 m3 = sw0.m(new g10(m10Var.g.b, m10Var, (byte) 0));
                    yl5 yl5Var16 = new yl5(hm5Var, vz0Var, b7);
                    this.y = true;
                    if (iv.q(m3, yl5Var16, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 16:
                boolean z17 = this.y;
                if (z17) {
                    if (z17) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    in inVar12 = ((m10) hm5Var.h).g.c;
                    yl5 yl5Var17 = new yl5(hm5Var, vz0Var, b9);
                    this.y = true;
                    if (iv.q(inVar12, yl5Var17, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 17:
                boolean z18 = this.y;
                m37.N(obj);
                sx5 sx5Var = hm5Var.j;
                while (true) {
                    Object value = sx5Var.getValue();
                    boolean z19 = z18;
                    if (sx5Var.j(value, xm6.a((xm6) value, false, false, null, false, false, false, null, false, false, false, false, null, null, false, null, null, null, null, null, null, z19, null, null, false, false, false, false, 266338303))) {
                        return pn6Var;
                    }
                    z18 = z19;
                }
            case 18:
                boolean z20 = this.y;
                if (z20) {
                    if (z20) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    in inVar13 = ((m10) hm5Var.h).g.d;
                    zl5 zl5Var = new zl5(hm5Var, vz0Var, b10);
                    this.y = true;
                    if (iv.q(inVar13, zl5Var, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            default:
                boolean z21 = this.y;
                if (z21) {
                    if (z21) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    kf2 kf2Var = hm5Var.d;
                    Set set = ((xm6) hm5Var.j.getValue()).p;
                    this.y = true;
                    Object o = ((mf2) kf2Var).a.o(set, this);
                    if (o != w11Var) {
                        o = pn6Var;
                    }
                    if (o == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
