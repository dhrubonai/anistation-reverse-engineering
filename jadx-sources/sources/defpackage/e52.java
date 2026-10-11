package defpackage;

import android.net.Uri;
import android.view.textclassifier.TextClassifier;
import com.anistation.local.entity.RemovedWatchProgress;
import com.anistation.model.Page;
import com.anistation.model.settings.HoldAction;
import com.anistation.model.settings.SubtitleStyleSettings;
import com.anistation.model.settings.ThemeMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e52 extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e52(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.A = obj2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.A;
        switch (b) {
            case 0:
                e52 e52Var = new e52((w42) obj2, vz0Var, (byte) 0);
                e52Var.z = obj;
                return e52Var;
            case 1:
                return new e52((rn2) this.z, (List) obj2, vz0Var, (byte) 1);
            case 2:
                return new e52((dq2) this.z, (ls0) obj2, vz0Var, (byte) 2);
            case 3:
                return new e52((ic2) this.z, (f91) obj2, vz0Var, (byte) 3);
            case 4:
                return new e52((a43) this.z, (ub2) obj2, vz0Var, (byte) 4);
            case 5:
                return new e52((a43) this.z, (ts4) obj2, vz0Var, (byte) 5);
            case 6:
                return new e52((nf3) this.z, (l5) obj2, vz0Var, (byte) 6);
            case 7:
                return new e52((ap3) this.z, (Uri) obj2, vz0Var, (byte) 7);
            case 8:
                return new e52((qx5) this.z, (r04) obj2, vz0Var, (byte) 8);
            case 9:
                e52 e52Var2 = new e52((z84) obj2, vz0Var, (byte) 9);
                e52Var2.z = obj;
                return e52Var2;
            case 10:
                return new e52((g94) this.z, (tu4) obj2, vz0Var, (byte) 10);
            case 11:
                return new e52((oa4) this.z, (ic2) obj2, vz0Var, (byte) 11);
            case 12:
                e52 e52Var3 = new e52((za0) obj2, vz0Var, (byte) 12);
                e52Var3.z = obj;
                return e52Var3;
            case 13:
                return new e52((ic2) this.z, (mj4) obj2, vz0Var, (byte) 13);
            case 14:
                return new e52((TextClassifier) this.z, (ic2) obj2, vz0Var, (byte) 14);
            case 15:
                return new e52((ko4) this.z, (ic2) obj2, vz0Var, (byte) 15);
            case 16:
                return new e52((kt4) this.z, (ko4) obj2, vz0Var, (byte) 16);
            case 17:
                e52 e52Var4 = new e52((ee) obj2, vz0Var, (byte) 17);
                e52Var4.z = obj;
                return e52Var4;
            case 18:
                return new e52((sn1) this.z, (jd5) obj2, vz0Var, (byte) 18);
            case 19:
                return new e52((af5) this.z, (String) obj2, vz0Var, (byte) 19);
            case 20:
                return new e52((Page) this.z, (wc3) obj2, vz0Var, (byte) 20);
            case 21:
                return new e52((ub2) this.z, (ic6) obj2, vz0Var, (byte) 21);
            case 22:
                return new e52((hm5) this.z, (HoldAction) obj2, vz0Var, (byte) 22);
            case 23:
                return new e52((hm5) this.z, (SubtitleStyleSettings) obj2, vz0Var, (byte) 23);
            case 24:
                return new e52((hm5) this.z, (ThemeMode) obj2, vz0Var, (byte) 24);
            case 25:
                return new e52((tr5) this.z, (l5) obj2, vz0Var, (byte) 25);
            case 26:
                return new e52((wj) this.z, (tw5) obj2, vz0Var, (byte) 26);
            case 27:
                return new e52((qb0) this.z, (ll) obj2, vz0Var, (byte) 27);
            case 28:
                e52 e52Var5 = new e52((fa6) obj2, vz0Var, (byte) 28);
                e52Var5.z = obj;
                return e52Var5;
            default:
                e52 e52Var6 = new e52((va6) obj2, vz0Var, (byte) 29);
                e52Var6.z = obj;
                return e52Var6;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((e52) create((tu4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 6:
                ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
            case 7:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
            case 9:
                return ((e52) create((h94) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 10:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 11:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 12:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 13:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 14:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 15:
                ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
            case 16:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 17:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 18:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 19:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 20:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 21:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 22:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 23:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 24:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 25:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 26:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 27:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 28:
                ((e52) create((pd) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
            default:
                return ((e52) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v21, types: [h43] */
    /* JADX WARN: Type inference failed for: r1v24, types: [h43] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object p;
        Object r;
        Object c;
        Object h;
        Object g;
        byte b = this.x;
        ?? r1 = 9;
        char c2 = '\t';
        char c3 = '\t';
        float f = 1.0f;
        byte b2 = 13;
        byte b3 = 7;
        pn6 pn6Var = pn6.a;
        w11 w11Var = w11.x;
        Object obj2 = this.A;
        byte b4 = 1;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                tu4 tu4Var = (tu4) this.z;
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                rc rcVar = new rc(tu4Var, (byte) 6);
                this.z = null;
                this.y = true;
                if (((w42) obj2).collect(rcVar, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 1:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                cy6 cy6Var = ((rn2) this.z).c;
                List list = (List) obj2;
                this.y = true;
                zx6 zx6Var = ((ny6) cy6Var).a;
                ArrayList arrayList = new ArrayList(zo0.V(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new RemovedWatchProgress((String) it.next()));
                }
                Object hideFromWatchHistory = zx6Var.hideFromWatchHistory(arrayList, this);
                if (hideFromWatchHistory != w11Var) {
                    hideFromWatchHistory = pn6Var;
                }
                if (hideFromWatchHistory == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 2:
                dq2 dq2Var = (dq2) this.z;
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
                h43 h43Var = (h43) dq2Var.getCoroutineContext().get(h95.F);
                if (h43Var != null) {
                    z = h43Var.isActive();
                } else {
                    z = false;
                }
                if (z) {
                    this.y = true;
                    Object a = dq2Var.a((ls0) obj2, this);
                    if (a == w11Var) {
                        return w11Var;
                    }
                    return a;
                }
                throw new wm0((byte) 0);
            case 3:
                boolean z5 = this.y;
                if (z5) {
                    if (z5) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                Object invoke = ((ic2) this.z).invoke((f91) obj2, this);
                if (invoke == w11Var) {
                    return w11Var;
                }
                return invoke;
            case 4:
                a43 a43Var = (a43) this.z;
                ThreadLocal threadLocal = a43Var.b;
                boolean z6 = this.y;
                try {
                    if (z6) {
                        if (z6) {
                            m37.N(obj);
                            p = obj;
                            return (j44) p;
                        }
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m37.N(obj);
                    Object obj3 = threadLocal.get();
                    Boolean bool = Boolean.TRUE;
                    if (!a34.i(obj3, bool)) {
                        threadLocal.set(bool);
                        w41 w41Var = a43Var.c;
                        t31 t31Var = new t31((ub2) obj2, null);
                        this.y = true;
                        p = oi4.p(w41Var, t31Var, this);
                        if (p == w11Var) {
                            return w11Var;
                        }
                        return (j44) p;
                    }
                    ze0.m("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    return null;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
                threadLocal.set(Boolean.FALSE);
            case 5:
                boolean z7 = this.y;
                if (z7) {
                    if (z7) {
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
                    if (r == w11Var) {
                        return w11Var;
                    }
                }
                j44 j44Var = (j44) r;
                if (j44Var != null && (c = j44Var.c((ts4) obj2)) != null) {
                    return c;
                }
                return null;
            case 6:
                boolean z8 = this.y;
                if (z8) {
                    if (!z8) {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        m37.N(obj);
                        v71.e();
                    }
                    return null;
                }
                m37.N(obj);
                this.y = true;
                in4.a((nf3) this.z, (l5) obj2, this);
                return w11Var;
            case 7:
                boolean z9 = this.y;
                if (z9) {
                    if (z9) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (((ap3) this.z).a.i((Uri) obj2, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 8:
                boolean z10 = this.y;
                if (z10) {
                    if (!z10) {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m37.N(obj);
                } else {
                    m37.N(obj);
                    qx5 qx5Var = (qx5) this.z;
                    rc rcVar2 = new rc((r04) obj2, b3);
                    this.y = true;
                    if (qx5Var.collect(rcVar2, this) == w11Var) {
                        return w11Var;
                    }
                }
                v71.e();
                return null;
            case 9:
                z84 z84Var = (z84) obj2;
                h94 h94Var = (h94) this.z;
                boolean z11 = this.y;
                if (z11) {
                    if (z11) {
                        m37.N(obj);
                        h = obj;
                        return new ev5((lv2) h, z84.d(z84Var.a, h94Var.d.a()), p41.A);
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                lv5 lv5Var = h94Var.e;
                if (lv5Var != null) {
                    this.z = h94Var;
                    this.y = true;
                    h = z84Var.h(lv5Var, this);
                    if (h == w11Var) {
                        return w11Var;
                    }
                    return new ev5((lv2) h, z84.d(z84Var.a, h94Var.d.a()), p41.A);
                }
                ze0.m("body == null");
                return null;
            case 10:
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
                    this.y = true;
                    if (x97.u(1000L, this) == w11Var) {
                        return w11Var;
                    }
                }
                xk3.d().a(b77.a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
                ((nj0) ((tu4) obj2)).i(new wx0(7));
                return pn6Var;
            case 11:
                boolean z13 = this.y;
                if (z13) {
                    if (z13) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (((oa4) this.z).a.g(c54.y, (ic2) obj2, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 12:
                boolean z14 = this.y;
                try {
                    if (z14) {
                        if (z14) {
                            h43 h43Var2 = (h43) this.z;
                            m37.N(obj);
                            g = obj;
                            r1 = h43Var2;
                        } else {
                            ze0.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        m37.N(obj);
                        bx5 z15 = tl7.z((v11) this.z, null, null, new b20(2, vz0Var, b2), 3);
                        this.z = z15;
                        this.y = true;
                        g = ((za0) obj2).g(this);
                        r1 = z15;
                        if (g == w11Var) {
                            return w11Var;
                        }
                    }
                    r1.l(null);
                    return g;
                } catch (Throwable th) {
                    r1.l(null);
                    throw th;
                }
            case 13:
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
                this.y = true;
                Object invoke2 = ((ic2) this.z).invoke((mj4) obj2, this);
                if (invoke2 == w11Var) {
                    return w11Var;
                }
                return invoke2;
            case 14:
                boolean z17 = this.y;
                if (z17) {
                    if (z17) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                TextClassifier textClassifier = (TextClassifier) this.z;
                if (textClassifier == null) {
                    return null;
                }
                this.y = true;
                Object invoke3 = ((ic2) obj2).invoke(textClassifier, this);
                if (invoke3 == w11Var) {
                    return w11Var;
                }
                return invoke3;
            case 15:
                boolean z18 = this.y;
                if (z18) {
                    if (!z18) {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        m37.N(obj);
                        v71.e();
                    }
                    return null;
                }
                m37.N(obj);
                this.y = true;
                db.d0((ko4) this.z, (ic2) obj2, this);
                return w11Var;
            case 16:
                boolean z19 = this.y;
                if (z19) {
                    if (z19) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (((kt4) this.z).c((ko4) obj2, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 17:
                boolean z20 = this.y;
                if (z20) {
                    if (z20) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                v11 v11Var = (v11) this.z;
                ee eeVar = (ee) obj2;
                in5 in5Var = eeVar.L.a;
                ii iiVar = new ii(eeVar, v11Var, c2);
                this.y = true;
                in5Var.collect(iiVar, this);
                return w11Var;
            case 18:
                boolean z21 = this.y;
                if (z21) {
                    if (z21) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                sn1 sn1Var = (sn1) this.z;
                if (sn1Var.b) {
                    f = -1.0f;
                }
                rd5 rd5Var = ((jd5) obj2).o0;
                long f2 = ur6.f(f, sn1Var.a);
                this.y = true;
                if (rd5Var.c(f2, false, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 19:
                boolean z22 = this.y;
                if (z22) {
                    if (z22) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                mj0 mj0Var = ((af5) this.z).j;
                rc rcVar3 = new rc((String) obj2, c3);
                this.y = true;
                if (mj0Var.collect(rcVar3, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 20:
                boolean z23 = this.y;
                if (z23) {
                    if (z23) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                Page page = (Page) this.z;
                if (page != null && page.getCurrentPage() == 1) {
                    this.y = true;
                    if (wc3.i((wc3) obj2, 0, this) == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
                }
                return pn6Var;
            case 21:
                boolean z24 = this.y;
                if (z24) {
                    if (z24) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                w42 m = sw0.m(wt5.j(new nj4((ic6) obj2, (byte) 15)));
                le5 le5Var = new le5((ub2) this.z);
                this.y = true;
                if (m.collect(le5Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 22:
                boolean z25 = this.y;
                if (z25) {
                    if (z25) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                kf2 kf2Var = ((hm5) this.z).d;
                this.y = true;
                Object l = ((mf2) kf2Var).a.l((HoldAction) obj2, this);
                if (l != w11Var) {
                    l = pn6Var;
                }
                if (l == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 23:
                boolean z26 = this.y;
                if (z26) {
                    if (z26) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                ot6 ot6Var = ((hm5) this.z).e;
                this.y = true;
                Object k = ((qt6) ot6Var).a.k((SubtitleStyleSettings) obj2, this);
                if (k != w11Var) {
                    k = pn6Var;
                }
                if (k == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 24:
                boolean z27 = this.y;
                if (z27) {
                    if (z27) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                kf2 kf2Var2 = ((hm5) this.z).d;
                this.y = true;
                Object q = ((mf2) kf2Var2).a.q((ThemeMode) obj2, this);
                if (q != w11Var) {
                    q = pn6Var;
                }
                if (q == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 25:
                tr5 tr5Var = (tr5) this.z;
                ti4 ti4Var = tr5Var.K;
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
                    ti4Var.setValue(Boolean.TRUE);
                    i54 i54Var = tr5Var.P;
                    c9 c9Var = tr5Var.O;
                    this.y = true;
                    i54Var.getClass();
                    if (db.K(new h54(c54.y, i54Var, (l5) obj2, c9Var, null), this) == w11Var) {
                        return w11Var;
                    }
                }
                ti4Var.setValue(Boolean.FALSE);
                return pn6Var;
            case 26:
                boolean z29 = this.y;
                if (z29) {
                    if (z29) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (wj.a((wj) this.z, new Float(1.0f), (tw5) obj2, null, this, 12) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 27:
                boolean z30 = this.y;
                if (z30) {
                    if (z30) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (wj.a((wj) ((qb0) this.z).z, new Float(0.0f), (ll) obj2, null, this, 12) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 28:
                fa6 fa6Var = (fa6) obj2;
                boolean z31 = this.y;
                if (z31) {
                    if (!z31) {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        m37.N(obj);
                        v71.e();
                    }
                    return null;
                }
                m37.N(obj);
                pd pdVar = (pd) this.z;
                gi6 gi6Var = fa6Var.N;
                dd6 dd6Var = fa6Var.O;
                yv2 b5 = fa6Var.R.b(fa6Var.T);
                ic5 ic5Var = new ic5(1, fa6Var, fa6.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8, (byte) 2);
                z96 z96Var = new z96(fa6Var, (byte) 12);
                t44 t44Var = fa6Var.V;
                rv6 rv6Var = (rv6) t80.C(fa6Var, bv0.t);
                aa6 aa6Var = new aa6(fa6Var, b3);
                this.y = true;
                jf7.C(pdVar, gi6Var, dd6Var, b5, ic5Var, z96Var, t44Var, rv6Var, aa6Var, this);
                return w11Var;
            default:
                va6 va6Var = (va6) obj2;
                boolean z32 = this.y;
                if (z32) {
                    if (z32) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                v11 v11Var2 = (v11) this.z;
                mx0 j = wt5.j(new e96(va6Var, b4));
                ii iiVar2 = new ii(va6Var, v11Var2, b2);
                this.y = true;
                if (j.collect(iiVar2, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e52(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
    }
}
