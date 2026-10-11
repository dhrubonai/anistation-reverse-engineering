package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.anistation.download.service.ExternalDownloadService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hu1 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu1(Object obj, boolean z, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.y = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                return new hu1((iu1) obj2, vz0Var, (byte) 0);
            case 1:
                return new hu1((ju5) obj2, vz0Var, (byte) 1);
            case 2:
                return new hu1((oc0) obj2, vz0Var, (byte) 2);
            case 3:
                return new hu1((ConstraintTrackingWorker) obj2, vz0Var, (byte) 3);
            case 4:
                return new hu1((h31) obj2, vz0Var, (byte) 4);
            case 5:
                return new hu1((p51) obj2, vz0Var, (byte) 5);
            case 6:
                return new hu1((t71) obj2, vz0Var, (byte) 6);
            case 7:
                return new hu1((ch1) obj2, vz0Var, (byte) 7);
            case 8:
                return new hu1((nc0) obj2, vz0Var, (byte) 8);
            case 9:
                return new hu1((ExternalDownloadService) obj2, vz0Var, (byte) 9);
            case 10:
                return new hu1((m82) obj2, vz0Var, (byte) 10);
            case 11:
                return new hu1((ft) obj2, vz0Var, (byte) 11);
            case 12:
                return new hu1((rn2) obj2, vz0Var, (byte) 12);
            case 13:
                return new hu1((a43) obj2, vz0Var, (byte) 13);
            case 14:
                return new hu1((l33) obj2, vz0Var, (byte) 14);
            case 15:
                return new hu1((ap3) obj2, vz0Var, (byte) 15);
            case 16:
                return new hu1((cz3) obj2, vz0Var, (byte) 16);
            case 17:
                return new hu1((h14) obj2, vz0Var, (byte) 17);
            case 18:
                return new hu1((b64) obj2, vz0Var, (byte) 18);
            case 19:
                return new hu1((wc4) obj2, vz0Var, (byte) 19);
            case 20:
                return new hu1((kt4) obj2, this.y, vz0Var, (byte) 20);
            case 21:
                return new hu1((x65) obj2, vz0Var, (byte) 21);
            case 22:
                return new hu1((zq0) obj2, vz0Var, (byte) 22);
            case 23:
                return new hu1((af5) obj2, vz0Var, (byte) 23);
            case 24:
                return new hu1((sf5) obj2, vz0Var, (byte) 24);
            case 25:
                return new hu1((u96) obj2, vz0Var, (byte) 25);
            case 26:
                return new hu1((j31) obj2, vz0Var, (byte) 26);
            case 27:
                return new hu1((va6) obj2, vz0Var, (byte) 27);
            case 28:
                return new hu1((w44) obj2, this.y, vz0Var, (byte) 28);
            default:
                return new hu1((jb6) obj2, vz0Var, (byte) 29);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                return ((hu1) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 6:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 7:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 9:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 10:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 11:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 12:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 13:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 14:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 15:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 16:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 17:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 18:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 19:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 20:
                ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 21:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 22:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 23:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 24:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 25:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 26:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 27:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 28:
                ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                return ((hu1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [vz0] */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, u05] */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        Object r;
        kn0 kn0Var;
        byte b = 12;
        byte b2 = 2;
        byte b3 = 4;
        byte b4 = 0;
        byte b5 = 11;
        byte b6 = 3;
        ko koVar = 0;
        koVar = 0;
        switch (this.x) {
            case 0:
                w11 w11Var = w11.x;
                boolean z = this.y;
                if (z) {
                    if (z) {
                        try {
                            m37.N(obj);
                        } catch (Throwable unused) {
                        }
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                }
                do {
                    long j = ((iu1) this.z).lastActivity + ((iu1) this.z).G;
                    int[] iArr = s51.a;
                    currentTimeMillis = j - System.currentTimeMillis();
                    if (currentTimeMillis <= 0) {
                        ((iu1) this.z).F.f(null);
                        ((iu1) this.z).E.invoke();
                        return pn6.a;
                    }
                    this.y = true;
                } while (x97.u(currentTimeMillis, this) != w11Var);
                return w11Var;
            case 1:
                w11 w11Var2 = w11.x;
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
                    py4 py4Var = (py4) ((ju5) this.z).readerJob;
                    if (py4Var != null) {
                        this.y = true;
                        if (py4Var.a(this) == w11Var2) {
                            return w11Var2;
                        }
                    }
                }
                k97 k97Var = (k97) ((ju5) this.z).writerJob;
                if (k97Var != null) {
                    h41.f(k97Var);
                }
                ((ju5) this.z).k0();
                return pn6.a;
            case 2:
                w11 w11Var3 = w11.x;
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                wc0 wc0Var = ((oc0) this.z).x;
                this.y = true;
                vc0 vc0Var = wc0.a;
                Object c = wc0Var.c(1, this);
                if (c != w11Var3) {
                    return c;
                }
                return w11Var3;
            case 3:
                w11 w11Var4 = w11.x;
                boolean z4 = this.y;
                if (z4) {
                    if (z4) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.z;
                this.y = true;
                Object b7 = constraintTrackingWorker.b(this);
                if (b7 != w11Var4) {
                    return b7;
                }
                return w11Var4;
            case 4:
                pn6 pn6Var = pn6.a;
                h31 h31Var = (h31) this.z;
                w11 w11Var5 = w11.x;
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
                    mx0 j2 = wt5.j(new vt0(h31Var, (byte) 5));
                    rc rcVar = new rc(h31Var, b2);
                    this.y = true;
                    Object collect = j2.collect(new ii(new Object(), new hn(rcVar, (byte) 9), b6), this);
                    if (collect != w11Var5) {
                        collect = pn6Var;
                    }
                    if (collect != w11Var5) {
                        collect = pn6Var;
                    }
                    if (collect == w11Var5) {
                        return w11Var5;
                    }
                }
                return pn6Var;
            case 5:
                w11 w11Var6 = w11.x;
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
                    p51 p51Var = (p51) this.z;
                    this.y = true;
                    if (p51Var.e(this) == w11Var6) {
                        return w11Var6;
                    }
                }
                return pn6.a;
            case 6:
                w11 w11Var7 = w11.x;
                boolean z7 = this.y;
                if (z7) {
                    if (z7) {
                        m37.N(obj);
                        return pn6.a;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                Object obj2 = new Object();
                Object obj3 = new Object();
                Object obj4 = new Object();
                t71 t71Var = (t71) this.z;
                in5 in5Var = t71Var.L.a;
                vj0 vj0Var = new vj0(obj2, obj3, obj4, t71Var, (byte) 3);
                this.y = true;
                in5Var.collect(vj0Var, this);
                return w11Var7;
            case 7:
                ch1 ch1Var = (ch1) this.z;
                kf2 kf2Var = ch1Var.a;
                w11 w11Var8 = w11.x;
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
                    g10 g10Var = new g10(new w42[]{ch1Var.c, ch1Var.d, ch1Var.e}, new t36(4, null), b6);
                    hh2 hh2Var = ((mf2) kf2Var).a;
                    in inVar = new in(hh2Var.b(hh2Var.a).getData(), b5);
                    ja1 ja1Var = rh1.a;
                    j91 j91Var = j91.y;
                    w42 D = zz.D(inVar, j91Var);
                    hh2 hh2Var2 = ((mf2) kf2Var).a;
                    w42 m = sw0.m(new g10(new w42[]{D, zz.D(new in(hh2Var2.b(hh2Var2.a).getData(), b), j91Var), g10Var}, new zg1(ch1Var, null), b6));
                    rc rcVar2 = new rc(ch1Var, b3);
                    this.y = true;
                    if (m.collect(rcVar2, this) == w11Var8) {
                        return w11Var8;
                    }
                }
                return pn6.a;
            case 8:
                w11 w11Var9 = w11.x;
                boolean z9 = this.y;
                if (z9) {
                    if (z9) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                nc0 nc0Var = (nc0) this.z;
                this.y = true;
                vc0 vc0Var2 = wc0.a;
                Object c2 = nc0Var.c(1, this);
                if (c2 != w11Var9) {
                    return c2;
                }
                return w11Var9;
            case 9:
                ExternalDownloadService externalDownloadService = (ExternalDownloadService) this.z;
                w11 w11Var10 = w11.x;
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
                    int i = ExternalDownloadService.R;
                    vy4 vy4Var = ((ml1) externalDownloadService.B.getValue()).c;
                    ns0 ns0Var = new ns0(2, externalDownloadService, ExternalDownloadService.class, "handleDownloadPolicy", "handleDownloadPolicy(Lcom/anistation/download/model/DownloadPolicyState;)V", 4, (byte) 1);
                    this.y = true;
                    if (iv.q(vy4Var, ns0Var, this) == w11Var10) {
                        return w11Var10;
                    }
                }
                return pn6.a;
            case 10:
                w11 w11Var11 = w11.x;
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
                    m82 m82Var = (m82) this.z;
                    this.y = true;
                    if (wc7.i(m82Var, null, this) == w11Var11) {
                        return w11Var11;
                    }
                }
                return pn6.a;
            case 11:
                w11 w11Var12 = w11.x;
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
                    ft ftVar = (ft) this.z;
                    this.y = true;
                    if (ftVar.b(this) == w11Var12) {
                        return w11Var12;
                    }
                }
                return pn6.a;
            case 12:
                rn2 rn2Var = (rn2) this.z;
                w11 w11Var13 = w11.x;
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
                    hu6 hu6Var = new hu6(((ny6) rn2Var.c).a.getAllLastWatchedProgress(), b3);
                    ja1 ja1Var2 = rh1.a;
                    w42 D2 = zz.D(hu6Var, j91.y);
                    yh yhVar = new yh(rn2Var, koVar, b5);
                    this.y = true;
                    if (iv.q(D2, yhVar, this) == w11Var13) {
                        return w11Var13;
                    }
                }
                return pn6.a;
            case 13:
                w11 w11Var14 = w11.x;
                boolean z14 = this.y;
                if (z14) {
                    if (z14) {
                        m37.N(obj);
                        r = obj;
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    w42 data = ((a43) this.z).c.getData();
                    this.y = true;
                    r = sw0.r(data, this);
                    if (r == w11Var14) {
                        return w11Var14;
                    }
                }
                j44 j44Var = (j44) r;
                if (j44Var != null) {
                    return j44Var.a();
                }
                return ot1.x;
            case 14:
                w11 w11Var15 = w11.x;
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
                    ml mlVar = (ml) ((l33) this.z).z;
                    Float f = new Float(0.0f);
                    tw5 O = z51.O(0.0f, 400.0f, new Float(0.5f), 1);
                    this.y = true;
                    if (nv5.f(mlVar, f, O, true, null, this, 8) == w11Var15) {
                        return w11Var15;
                    }
                }
                return pn6.a;
            case 15:
                w11 w11Var16 = w11.x;
                boolean z16 = this.y;
                if (z16) {
                    if (z16) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                bp3 bp3Var = ((ap3) this.z).a;
                this.y = true;
                Object c3 = bp3Var.c(this);
                if (c3 != w11Var16) {
                    return c3;
                }
                return w11Var16;
            case 16:
                w11 w11Var17 = w11.x;
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
                    wj wjVar = ((cz3) this.z).e;
                    Float f2 = new Float(0.0f);
                    this.y = true;
                    if (wj.a(wjVar, f2, null, null, this, 14) == w11Var17) {
                        return w11Var17;
                    }
                }
                return pn6.a;
            case 17:
                w11 w11Var18 = w11.x;
                boolean z18 = this.y;
                if (z18) {
                    if (z18) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                za0 za0Var = ((h14) this.z).g;
                this.y = true;
                Object K = db.K(new e52(za0Var, koVar, b), this);
                if (K != w11Var18) {
                    return K;
                }
                return w11Var18;
            case 18:
                b64 b64Var = (b64) this.z;
                w11 w11Var19 = w11.x;
                boolean z19 = this.y;
                if (z19) {
                    if (z19) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    in inVar2 = new in(((on) b64Var.b).b.observeAllWithProgress(), b4);
                    yh yhVar2 = new yh(b64Var, koVar, (byte) 15);
                    this.y = true;
                    if (iv.q(inVar2, yhVar2, this) == w11Var19) {
                        return w11Var19;
                    }
                }
                return pn6.a;
            case 19:
                wc4 wc4Var = (wc4) this.z;
                w11 w11Var20 = w11.x;
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
                    w42 m2 = sw0.m(new in(wc4Var.b.b, (byte) 22));
                    rc rcVar3 = new rc(wc4Var, (byte) 8);
                    this.y = true;
                    if (m2.collect(rcVar3, this) == w11Var20) {
                        return w11Var20;
                    }
                }
                return pn6.a;
            case 20:
                m37.N(obj);
                kt4 kt4Var = (kt4) this.z;
                boolean z21 = this.y;
                if (z21 != kt4Var.c) {
                    kt4Var.c = z21;
                    kt4Var.b(kt4Var.d);
                }
                return pn6.a;
            case 21:
                w11 w11Var21 = w11.x;
                boolean z22 = this.y;
                if (z22) {
                    if (z22) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    x65 x65Var = (x65) this.z;
                    this.y = true;
                    if (x65Var.b(this) == w11Var21) {
                        return w11Var21;
                    }
                }
                return pn6.a;
            case 22:
                w11 w11Var22 = w11.x;
                boolean z23 = this.y;
                if (z23) {
                    if (z23) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                zq0 zq0Var = (zq0) this.z;
                this.y = true;
                Object o = zq0Var.o(this);
                if (o != w11Var22) {
                    return o;
                }
                return w11Var22;
            case 23:
                af5 af5Var = (af5) this.z;
                w11 w11Var23 = w11.x;
                boolean z24 = this.y;
                if (z24) {
                    if (z24) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    mx0 mx0Var = new mx0(new f52(new la5((byte) 29), sw0.m(new in(af5Var.f, (byte) 23)), null), b6);
                    hj1 hj1Var = new hj1(2, af5Var, af5.class, "loadSuggestions", "loadSuggestions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 7);
                    this.y = true;
                    if (iv.q(mx0Var, hj1Var, this) == w11Var23) {
                        return w11Var23;
                    }
                }
                return pn6.a;
            case 24:
                w11 w11Var24 = w11.x;
                boolean z25 = this.y;
                if (z25) {
                    if (z25) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    sf5 sf5Var = (sf5) this.z;
                    this.y = true;
                    if (sf5Var.Q(this) == w11Var24) {
                        return w11Var24;
                    }
                }
                return pn6.a;
            case 25:
                u96 u96Var = (u96) this.z;
                w11 w11Var25 = w11.x;
                boolean z26 = this.y;
                if (z26) {
                    if (z26) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    ?? obj5 = new Object();
                    obj5.x = 1;
                    mx0 j3 = wt5.j(new lb5(u96Var, (Object) obj5, b5));
                    jr jrVar = new jr(u96Var, null);
                    this.y = true;
                    if (iv.q(j3, jrVar, this) == w11Var25) {
                        return w11Var25;
                    }
                }
                return pn6.a;
            case 26:
                pn6 pn6Var2 = pn6.a;
                w11 w11Var26 = w11.x;
                boolean z27 = this.y;
                if (z27) {
                    if (z27) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    j31 j31Var = (j31) this.z;
                    this.y = true;
                    j31Var.getClass();
                    Object K2 = db.K(new yh(j31Var, koVar, b6), this);
                    if (K2 != w11Var26) {
                        K2 = pn6Var2;
                    }
                    if (K2 == w11Var26) {
                        return w11Var26;
                    }
                }
                return pn6Var2;
            case 27:
                w11 w11Var27 = w11.x;
                boolean z28 = this.y;
                if (z28) {
                    if (z28) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    wj wjVar2 = ((va6) this.z).S;
                    xc4 xc4Var = new xc4(9205357640488583168L);
                    this.y = true;
                    if (wjVar2.f(this, xc4Var) == w11Var27) {
                        return w11Var27;
                    }
                }
                return pn6.a;
            case 28:
                w44 w44Var = (w44) this.z;
                m37.N(obj);
                if (((qt4) w44Var.getValue()) != null) {
                    w44Var.setValue(null);
                }
                return pn6.a;
            default:
                jb6 jb6Var = (jb6) this.z;
                pn6 pn6Var3 = pn6.a;
                w11 w11Var28 = w11.x;
                boolean z29 = this.y;
                if (z29) {
                    if (z29) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    if (!nd6.d(jb6Var.l().b) && jb6Var.h()) {
                        ko d = gv5.d(jb6Var.l());
                        ko f3 = gv5.f(jb6Var.l(), jb6Var.l().a.y.length());
                        ko e = gv5.e(jb6Var.l(), jb6Var.l().a.y.length());
                        io ioVar = new io(f3);
                        ioVar.a(e);
                        ko e2 = ioVar.e();
                        int g = nd6.g(jb6Var.l().b);
                        jb6Var.c.invoke(jb6.b(e2, fy5.a(g, g)));
                        jb6Var.r(hj2.x);
                        jb6Var.a.e = true;
                        koVar = d;
                    }
                    if (koVar != 0 && (kn0Var = jb6Var.g) != null) {
                        in0 T = q23.T(koVar);
                        this.y = true;
                        ((x9) kn0Var).a(T);
                        if (pn6Var3 == w11Var28) {
                            return w11Var28;
                        }
                    }
                }
                return pn6Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu1(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
    }
}
