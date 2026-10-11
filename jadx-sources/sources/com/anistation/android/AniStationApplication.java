package com.anistation.android;

import android.app.Application;
import android.content.Context;
import defpackage.d46;
import defpackage.dc5;
import defpackage.f12;
import defpackage.hv2;
import defpackage.id4;
import defpackage.is0;
import defpackage.jd4;
import defpackage.jv2;
import defpackage.kq5;
import defpackage.kz4;
import defpackage.l0;
import defpackage.lp6;
import defpackage.n;
import defpackage.nw;
import defpackage.oi4;
import defpackage.p7;
import defpackage.rg;
import defpackage.rv0;
import defpackage.t55;
import defpackage.tp;
import defpackage.un6;
import defpackage.v21;
import defpackage.v84;
import defpackage.vt0;
import defpackage.w4;
import defpackage.w83;
import defpackage.y7;
import defpackage.z05;
import defpackage.zn6;
import defpackage.zp2;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AniStationApplication extends Application implements kq5 {
    public static final /* synthetic */ int x = 0;

    @Override // defpackage.kq5
    public final kz4 a(Context context) {
        context.getClass();
        id4 id4Var = new id4();
        id4Var.c.add(new rv0((byte) 1));
        jd4 jd4Var = new jd4(id4Var);
        tp tpVar = new tp(context, (byte) 9);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList4.add(new n(new v84(new vt0(new y7(jd4Var, (byte) 18), (byte) 28)), z05.a(lp6.class), (byte) 27));
        tpVar.C = new is0(oi4.I(arrayList), oi4.I(arrayList2), oi4.I(arrayList3), oi4.I(arrayList4), oi4.I(arrayList5));
        tpVar.A = new d46(new rg(context, (byte) 0));
        tpVar.B = new d46(new rg(context, (byte) 1));
        w4 w4Var = hv2.a;
        w4 w4Var2 = jv2.a;
        v21 v21Var = new v21(200);
        f12 f12Var = (f12) tpVar.D;
        f12Var.a.put(jv2.a, v21Var);
        return tpVar.e();
    }

    @Override // android.app.Application
    public final void onCreate() {
        w83 w83Var;
        super.onCreate();
        l0 l0Var = new l0(this, (byte) 13);
        synchronized (p7.K) {
            w83Var = new w83();
            if (p7.L == null) {
                p7.L = w83Var.a;
                l0Var.invoke(w83Var);
                w83Var.a.s();
            } else {
                throw new nw("A Koin Application has already been started", (byte) 5);
            }
        }
        zn6 zn6Var = (zn6) ((t55) ((dc5) ((zp2) w83Var.a.z).A).d(z05.a(t55.class), null, null));
        zn6Var.e(new un6(zn6Var, (byte) 0));
    }
}
