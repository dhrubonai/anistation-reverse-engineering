package defpackage;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class bg implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ bg(py0 py0Var, yo6 yo6Var, h43 h43Var, pd5 pd5Var) {
        this.x = (byte) 5;
        this.y = py0Var;
        this.z = h43Var;
        this.A = pd5Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Object a(Object obj) {
        Integer e;
        Integer d;
        Integer d2;
        Integer e2;
        bd6 bd6Var;
        bd6 bd6Var2;
        cd6 cd6Var;
        cd6 cd6Var2;
        bd6 bd6Var3;
        bd6 bd6Var4;
        cd6 cd6Var3;
        cd6 cd6Var4;
        Integer d3;
        Integer e3;
        Integer e4;
        Integer d4;
        y23 y23Var;
        f83 f83Var = (f83) this.y;
        la6 la6Var = (la6) this.z;
        r05 r05Var = (r05) this.A;
        wa6 wa6Var = (wa6) obj;
        int ordinal = f83Var.ordinal();
        byte b = 21;
        byte b2 = 1;
        pn6 pn6Var = pn6.a;
        byte b3 = 0;
        mc6 mc6Var = null;
        switch (ordinal) {
            case 0:
                wa6Var.e.a = null;
                if (wa6Var.g.y.length() > 0) {
                    if (nd6.d(wa6Var.f)) {
                        wa6Var.i();
                        return pn6Var;
                    }
                    boolean f = wa6Var.f();
                    long j = wa6Var.f;
                    if (f) {
                        int g = nd6.g(j);
                        wa6Var.q(g, g);
                        return pn6Var;
                    }
                    int f2 = nd6.f(j);
                    wa6Var.q(f2, f2);
                }
                return pn6Var;
            case 1:
                wa6Var.e.a = null;
                if (wa6Var.g.y.length() > 0) {
                    if (nd6.d(wa6Var.f)) {
                        wa6Var.m();
                        return pn6Var;
                    }
                    boolean f3 = wa6Var.f();
                    long j2 = wa6Var.f;
                    if (f3) {
                        int f4 = nd6.f(j2);
                        wa6Var.q(f4, f4);
                        return pn6Var;
                    }
                    int g2 = nd6.g(j2);
                    wa6Var.q(g2, g2);
                    return pn6Var;
                }
                return pn6Var;
            case 2:
                md6 md6Var = wa6Var.e;
                md6Var.a = null;
                ko koVar = wa6Var.g;
                String str = koVar.y;
                String str2 = koVar.y;
                if (str.length() > 0) {
                    if (wa6Var.f()) {
                        md6Var.a = null;
                        if (str2.length() > 0 && (d = wa6Var.d()) != null) {
                            int intValue = d.intValue();
                            wa6Var.q(intValue, intValue);
                            return pn6Var;
                        }
                    } else {
                        md6Var.a = null;
                        if (str2.length() > 0 && (e = wa6Var.e()) != null) {
                            int intValue2 = e.intValue();
                            wa6Var.q(intValue2, intValue2);
                            return pn6Var;
                        }
                    }
                }
                return pn6Var;
            case 3:
                md6 md6Var2 = wa6Var.e;
                md6Var2.a = null;
                ko koVar2 = wa6Var.g;
                String str3 = koVar2.y;
                String str4 = koVar2.y;
                if (str3.length() > 0) {
                    if (wa6Var.f()) {
                        md6Var2.a = null;
                        if (str4.length() > 0 && (e2 = wa6Var.e()) != null) {
                            int intValue3 = e2.intValue();
                            wa6Var.q(intValue3, intValue3);
                            return pn6Var;
                        }
                    } else {
                        md6Var2.a = null;
                        if (str4.length() > 0 && (d2 = wa6Var.d()) != null) {
                            int intValue4 = d2.intValue();
                            wa6Var.q(intValue4, intValue4);
                            return pn6Var;
                        }
                    }
                }
                return pn6Var;
            case 4:
                wa6Var.j();
                return pn6Var;
            case 5:
                wa6Var.l();
                return pn6Var;
            case 6:
                wa6Var.o();
                return pn6Var;
            case 7:
                wa6Var.n();
                return pn6Var;
            case 8:
                wa6Var.e.a = null;
                if (wa6Var.g.y.length() > 0) {
                    if (wa6Var.f()) {
                        wa6Var.o();
                        return pn6Var;
                    }
                    wa6Var.n();
                    return pn6Var;
                }
                return pn6Var;
            case 9:
                wa6Var.e.a = null;
                if (wa6Var.g.y.length() > 0) {
                    if (wa6Var.f()) {
                        wa6Var.n();
                        return pn6Var;
                    }
                    wa6Var.o();
                    return pn6Var;
                }
                return pn6Var;
            case 10:
                if (wa6Var.g.y.length() > 0 && (bd6Var = wa6Var.c) != null) {
                    int g3 = wa6Var.g(bd6Var, -1);
                    wa6Var.q(g3, g3);
                    return pn6Var;
                }
                return pn6Var;
            case 11:
                if (wa6Var.g.y.length() > 0 && (bd6Var2 = wa6Var.c) != null) {
                    int g4 = wa6Var.g(bd6Var2, 1);
                    wa6Var.q(g4, g4);
                    return pn6Var;
                }
                return pn6Var;
            case 12:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                return pn6Var;
            case 13:
                if (wa6Var.g.y.length() > 0 && (cd6Var = wa6Var.i) != null) {
                    int h = wa6Var.h(cd6Var, -1);
                    wa6Var.q(h, h);
                    return pn6Var;
                }
                return pn6Var;
            case 14:
                if (wa6Var.g.y.length() > 0 && (cd6Var2 = wa6Var.i) != null) {
                    int h2 = wa6Var.h(cd6Var2, 1);
                    wa6Var.q(h2, h2);
                    return pn6Var;
                }
                return pn6Var;
            case 15:
                wa6Var.e.a = null;
                if (wa6Var.g.y.length() > 0) {
                    wa6Var.q(0, 0);
                    return pn6Var;
                }
                return pn6Var;
            case 16:
                wa6Var.e.a = null;
                ko koVar3 = wa6Var.g;
                if (koVar3.y.length() > 0) {
                    int length = koVar3.y.length();
                    wa6Var.q(length, length);
                    return pn6Var;
                }
                return pn6Var;
            case 17:
                la6Var.b.a(false);
                return pn6Var;
            case 18:
                la6Var.b.o();
                return pn6Var;
            case 19:
                la6Var.b.c();
                return pn6Var;
            case 20:
                List a = wa6Var.a(new tg5((byte) 26));
                if (a != null) {
                    la6Var.a(a);
                    return pn6Var;
                }
                return pn6Var;
            case 21:
                List a2 = wa6Var.a(new tg5((byte) 27));
                if (a2 != null) {
                    la6Var.a(a2);
                    return pn6Var;
                }
                return pn6Var;
            case 22:
                List a3 = wa6Var.a(new tg5((byte) 28));
                if (a3 != null) {
                    la6Var.a(a3);
                    return pn6Var;
                }
                return pn6Var;
            case 23:
                List a4 = wa6Var.a(new tg5((byte) 29));
                if (a4 != null) {
                    la6Var.a(a4);
                    return pn6Var;
                }
                return pn6Var;
            case 24:
                List a5 = wa6Var.a(new ka6(b3));
                if (a5 != null) {
                    la6Var.a(a5);
                    return pn6Var;
                }
                return pn6Var;
            case 25:
                List a6 = wa6Var.a(new ka6(b2));
                if (a6 != null) {
                    la6Var.a(a6);
                    return pn6Var;
                }
                return pn6Var;
            case 26:
                wa6Var.e.a = null;
                ko koVar4 = wa6Var.g;
                if (koVar4.y.length() > 0) {
                    wa6Var.q(0, koVar4.y.length());
                    return pn6Var;
                }
                return pn6Var;
            case 27:
                wa6Var.i();
                wa6Var.p();
                return pn6Var;
            case 28:
                wa6Var.m();
                wa6Var.p();
                return pn6Var;
            case 29:
                if (wa6Var.g.y.length() > 0 && (bd6Var3 = wa6Var.c) != null) {
                    int g5 = wa6Var.g(bd6Var3, -1);
                    wa6Var.q(g5, g5);
                }
                wa6Var.p();
                return pn6Var;
            case 30:
                if (wa6Var.g.y.length() > 0 && (bd6Var4 = wa6Var.c) != null) {
                    int g6 = wa6Var.g(bd6Var4, 1);
                    wa6Var.q(g6, g6);
                }
                wa6Var.p();
                return pn6Var;
            case 31:
                if (wa6Var.g.y.length() > 0 && (cd6Var3 = wa6Var.i) != null) {
                    int h3 = wa6Var.h(cd6Var3, -1);
                    wa6Var.q(h3, h3);
                }
                wa6Var.p();
                return pn6Var;
            case 32:
                if (wa6Var.g.y.length() > 0 && (cd6Var4 = wa6Var.i) != null) {
                    int h4 = wa6Var.h(cd6Var4, 1);
                    wa6Var.q(h4, h4);
                }
                wa6Var.p();
                return pn6Var;
            case 33:
                wa6Var.e.a = null;
                if (wa6Var.g.y.length() > 0) {
                    wa6Var.q(0, 0);
                }
                wa6Var.p();
                return pn6Var;
            case 34:
                wa6Var.e.a = null;
                ko koVar5 = wa6Var.g;
                if (koVar5.y.length() > 0) {
                    int length2 = koVar5.y.length();
                    wa6Var.q(length2, length2);
                }
                wa6Var.p();
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                md6 md6Var3 = wa6Var.e;
                md6Var3.a = null;
                ko koVar6 = wa6Var.g;
                String str5 = koVar6.y;
                String str6 = koVar6.y;
                if (str5.length() > 0) {
                    if (wa6Var.f()) {
                        md6Var3.a = null;
                        if (str6.length() > 0 && (e3 = wa6Var.e()) != null) {
                            int intValue5 = e3.intValue();
                            wa6Var.q(intValue5, intValue5);
                        }
                    } else {
                        md6Var3.a = null;
                        if (str6.length() > 0 && (d3 = wa6Var.d()) != null) {
                            int intValue6 = d3.intValue();
                            wa6Var.q(intValue6, intValue6);
                        }
                    }
                }
                wa6Var.p();
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                md6 md6Var4 = wa6Var.e;
                md6Var4.a = null;
                ko koVar7 = wa6Var.g;
                String str7 = koVar7.y;
                String str8 = koVar7.y;
                if (str7.length() > 0) {
                    if (wa6Var.f()) {
                        md6Var4.a = null;
                        if (str8.length() > 0 && (d4 = wa6Var.d()) != null) {
                            int intValue7 = d4.intValue();
                            wa6Var.q(intValue7, intValue7);
                        }
                    } else {
                        md6Var4.a = null;
                        if (str8.length() > 0 && (e4 = wa6Var.e()) != null) {
                            int intValue8 = e4.intValue();
                            wa6Var.q(intValue8, intValue8);
                        }
                    }
                }
                wa6Var.p();
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                wa6Var.j();
                wa6Var.p();
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                wa6Var.l();
                wa6Var.p();
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                wa6Var.o();
                wa6Var.p();
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                wa6Var.n();
                wa6Var.p();
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                wa6Var.e.a = null;
                if (wa6Var.g.y.length() > 0) {
                    if (wa6Var.f()) {
                        wa6Var.o();
                    } else {
                        wa6Var.n();
                    }
                }
                wa6Var.p();
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                wa6Var.e.a = null;
                if (wa6Var.g.y.length() > 0) {
                    if (wa6Var.f()) {
                        wa6Var.n();
                    } else {
                        wa6Var.o();
                    }
                }
                wa6Var.p();
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                wa6Var.e.a = null;
                if (wa6Var.g.y.length() > 0) {
                    long j3 = wa6Var.f;
                    int i = nd6.c;
                    int i2 = (int) (j3 & 4294967295L);
                    wa6Var.q(i2, i2);
                    return pn6Var;
                }
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                if (!la6Var.e) {
                    la6Var.a(te4.H(new mq0("\n", 1)));
                    return pn6Var;
                }
                r05Var.x = la6Var.a.x.y.r.F(la6Var.k);
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                if (!la6Var.e) {
                    la6Var.a(te4.H(new mq0("\t", 1)));
                    return pn6Var;
                }
                r05Var.x = false;
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                la6Var.h.a(mc6.a(wa6Var.h, wa6Var.g, wa6Var.f, 4));
                in6 in6Var = la6Var.h;
                y23 y23Var2 = in6Var.a;
                if (y23Var2 != null && (y23Var = (y23) y23Var2.y) != null) {
                    in6Var.a = y23Var;
                    in6Var.c -= ((mc6) y23Var2.z).a.y.length();
                    in6Var.b = new y23(in6Var.b, (mc6) y23Var2.z, b);
                    mc6Var = (mc6) y23Var.z;
                }
                if (mc6Var != null) {
                    la6Var.j.invoke(mc6Var);
                    return pn6Var;
                }
                return pn6Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                in6 in6Var2 = la6Var.h;
                y23 y23Var3 = in6Var2.b;
                if (y23Var3 != null) {
                    in6Var2.b = (y23) y23Var3.y;
                    mc6 mc6Var2 = (mc6) y23Var3.z;
                    in6Var2.a = new y23(in6Var2.a, mc6Var2, b);
                    in6Var2.c = mc6Var2.a.y.length() + in6Var2.c;
                    mc6Var = (mc6) y23Var3.z;
                }
                if (mc6Var != null) {
                    la6Var.j.invoke(mc6Var);
                    return pn6Var;
                }
                return pn6Var;
            default:
                ze0.l();
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v0, types: [ec2, vz0] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        oa oaVar;
        float f;
        ep0 ep0Var;
        long j;
        os0 os0Var;
        os0 os0Var2;
        os0 os0Var3;
        byte b;
        Object y45Var;
        boolean z;
        boolean z2;
        float f2;
        float f3;
        float f4;
        long g;
        long j2;
        long j3;
        do3 do3Var;
        Integer K;
        Object g2;
        jo joVar;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        byte b2 = this.x;
        rg4 rg4Var = rg4.x;
        byte b3 = 5;
        byte b4 = 4;
        byte b5 = 3;
        final byte b6 = 2;
        byte b7 = 6;
        ?? r14 = 0;
        aq4 aq4Var = null;
        do3 do3Var2 = null;
        in1 in1Var = null;
        Object obj2 = pn6.a;
        byte b8 = 1;
        final ?? r5 = 0;
        boolean z8 = false;
        Object obj3 = this.A;
        int i = 8;
        Object obj4 = this.z;
        Object obj5 = this.y;
        switch (b2) {
            case 0:
                sv6 sv6Var = (sv6) obj5;
                za3 za3Var = (za3) obj3;
                sv6 sv6Var2 = (sv6) obj4;
                vg0 y = ((bp1) obj).n0().y();
                if (sv6Var.y.getVisibility() != 8) {
                    sv6Var.V = true;
                    kh4 kh4Var = za3Var.K;
                    if (kh4Var instanceof oa) {
                        oaVar = (oa) kh4Var;
                    } else {
                        oaVar = null;
                    }
                    if (oaVar != null) {
                        Canvas a = u9.a(y);
                        oaVar.getAndroidViewsHandler$ui().getClass();
                        sv6Var2.draw(a);
                    }
                    sv6Var.V = false;
                }
                return obj2;
            case 1:
                og3 og3Var = (og3) obj5;
                ((k55) obj).getClass();
                bj bjVar = new bj((ko4) obj4, (w44) obj3, r5);
                og3Var.getLifecycle().a(bjVar);
                return new pj(og3Var, bjVar);
            case 2:
                n nVar = new n((v11) obj4, (ng6) obj3, (byte) 19);
                w73[] w73VarArr = zh5.a;
                ((bi5) obj).b(oh5.c, new o3((String) obj5, nVar));
                return obj2;
            case 3:
                pf6 pf6Var = (pf6) obj5;
                u05 u05Var = (u05) obj4;
                WritableByteChannel writableByteChannel = (WritableByteChannel) obj3;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                while (byteBuffer.hasRemaining()) {
                    if (pf6Var == null) {
                        do {
                            u05Var.x = writableByteChannel.write(byteBuffer);
                            if (byteBuffer.hasRemaining()) {
                            }
                        } while (u05Var.x > 0);
                    } else {
                        pf6Var.a();
                        do {
                            try {
                                u05Var.x = writableByteChannel.write(byteBuffer);
                                if (byteBuffer.hasRemaining()) {
                                }
                            } finally {
                                pf6Var.b();
                            }
                        } while (u05Var.x > 0);
                    }
                }
                return obj2;
            case 4:
                rs3 rs3Var = (rs3) obj5;
                ks3 ks3Var = (ks3) obj4;
                w44 w44Var = (w44) obj3;
                ((ci1) obj).getClass();
                wh0 wh0Var = new wh0(rs3Var, ks3Var, w44Var);
                rs3Var.a(ks3Var, wh0Var, 4);
                rs3.b();
                ?? r1 = rs3.c().i;
                r1.getClass();
                ArrayList arrayList = new ArrayList();
                int size = r1.size();
                while (r5 < size) {
                    Object obj6 = r1.get(r5);
                    r5++;
                    qs3 qs3Var = (qs3) obj6;
                    if (qs3Var.e(ks3Var) && !qs3Var.c()) {
                        arrayList.add(obj6);
                    }
                }
                w44Var.setValue(arrayList);
                return new qj(rs3Var, wh0Var, b4);
            case 5:
                py0 py0Var = (py0) obj5;
                h43 h43Var = (h43) obj4;
                pd5 pd5Var = (pd5) obj3;
                float floatValue = ((Float) obj).floatValue();
                if (py0Var.N) {
                    f = 1.0f;
                } else {
                    f = -1.0f;
                }
                rd5 rd5Var = py0Var.M;
                long f5 = rd5Var.f(rd5Var.i(f * floatValue));
                rd5 rd5Var2 = pd5Var.a;
                float h = rd5Var.h(rd5Var.f(rd5Var2.d(rd5Var2.k, f5, 1))) * f;
                if (Math.abs(h) < Math.abs(floatValue)) {
                    h98.j(h43Var, "Scroll animation cancelled because scroll was not consumed (" + h + " < " + floatValue + ")", null);
                }
                return obj2;
            case 6:
                uf3 uf3Var = (uf3) obj5;
                mc6 mc6Var = (mc6) obj4;
                h12 h12Var = (h12) obj3;
                bp1 bp1Var = (bp1) obj;
                cd6 d = uf3Var.d();
                if (d != null) {
                    vg0 y2 = bp1Var.n0().y();
                    long j4 = ((nd6) uf3Var.A.getValue()).a;
                    long j5 = ((nd6) uf3Var.B.getValue()).a;
                    bd6 bd6Var = d.a;
                    ad adVar = uf3Var.y;
                    long j6 = uf3Var.z;
                    if (!nd6.d(j4)) {
                        adVar.r(j6);
                        int g3 = nd6.g(j4);
                        h12Var.b(g3);
                        int f6 = nd6.f(j4);
                        h12Var.b(f6);
                        if (g3 != f6) {
                            y2.f(bd6Var.j(g3, f6), adVar);
                        }
                    } else if (!nd6.d(j5)) {
                        long b9 = bd6Var.a.b.b();
                        ep0 ep0Var2 = new ep0(b9);
                        if (b9 == 16) {
                            ep0Var = null;
                        } else {
                            ep0Var = ep0Var2;
                        }
                        if (ep0Var != null) {
                            j = ep0Var.a;
                        } else {
                            j = ep0.b;
                        }
                        adVar.r(ep0.b(ep0.c(j) * 0.2f, j));
                        int g4 = nd6.g(j5);
                        h12Var.b(g4);
                        int f7 = nd6.f(j5);
                        h12Var.b(f7);
                        if (g4 != f7) {
                            y2.f(bd6Var.j(g4, f7), adVar);
                        }
                    } else if (!nd6.d(mc6Var.b)) {
                        adVar.r(j6);
                        long j7 = mc6Var.b;
                        int g5 = nd6.g(j7);
                        h12Var.b(g5);
                        int f8 = nd6.f(j7);
                        h12Var.b(f8);
                        if (g5 != f8) {
                            y2.f(bd6Var.j(g5, f8), adVar);
                        }
                    }
                    uv5.c(y2, bd6Var);
                }
                return obj2;
            case 7:
                t05 t05Var = (t05) obj5;
                kl klVar = (kl) obj;
                float floatValue2 = ((Number) klVar.e.getValue()).floatValue() - t05Var.x;
                float a2 = ((wc5) obj4).a(floatValue2);
                t05Var.x = ((Number) klVar.e.getValue()).floatValue();
                ((t05) obj3).x = ((Number) klVar.a.b.invoke(klVar.f)).floatValue();
                if (Math.abs(floatValue2 - a2) > 0.5f) {
                    klVar.a();
                }
                return obj2;
            case 8:
                Context context = (Context) obj4;
                b96 b96Var = (b96) obj3;
                rz0 rz0Var = (rz0) obj;
                List list = ((p86) obj5).a;
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    o86 o86Var = (o86) list.get(i2);
                    byte b10 = 10;
                    if (o86Var instanceof w86) {
                        w86 w86Var = (w86) o86Var;
                        o0 o0Var = new o0(w86Var, b10);
                        if (w86Var.c == 0) {
                            os0Var3 = r14;
                            b = 1;
                        } else {
                            b = 1;
                            os0Var3 = new os0(-1930700965, true, new wa1(w86Var, r5));
                        }
                        rz0.b(rz0Var, o0Var, os0Var3, new va1(w86Var, b96Var, b), 6);
                    } else if (o86Var instanceof c96) {
                        c96 c96Var = (c96) o86Var;
                        if (context != null) {
                            int i3 = c96Var.c;
                            TextClassification textClassification = c96Var.b;
                            Drawable drawable = c96Var.d;
                            if (i3 < 0) {
                                cu5 cu5Var = new cu5(textClassification, b3);
                                if (drawable != null) {
                                    os0Var2 = new os0(-1123224187, true, new v86(drawable, r5));
                                } else {
                                    os0Var2 = null;
                                }
                                rz0.b(rz0Var, cu5Var, os0Var2, new lb5(context, textClassification, b10), 6);
                            } else {
                                RemoteAction remoteAction = textClassification.getActions().get(i3);
                                cu5 cu5Var2 = new cu5(remoteAction, b7);
                                if (drawable != null) {
                                    os0Var = new os0(1106162332, true, new v86(drawable, (byte) 1));
                                } else {
                                    os0Var = null;
                                }
                                rz0.b(rz0Var, cu5Var2, os0Var, new nj4(remoteAction, (byte) 29), 6);
                            }
                        }
                    } else if (o86Var instanceof a96) {
                        rz0Var.a.add(n77.d);
                    }
                    i2++;
                    b3 = 5;
                    r14 = 0;
                }
                return obj2;
            case 9:
                String str = (String) obj;
                str.getClass();
                tl7.z((v11) obj5, null, null, new e0((Object) str, obj4, obj3, (vz0) null, (byte) 16), 3);
                return obj2;
            case 10:
                Context context2 = (Context) obj5;
                tm1 tm1Var = (tm1) obj4;
                String str2 = (String) obj3;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    try {
                        context2.getContentResolver().takePersistableUriPermission(uri, 3);
                        y45Var = obj2;
                    } catch (Throwable th) {
                        y45Var = new y45(th);
                    }
                    if (!(y45Var instanceof y45)) {
                        String uri2 = uri.toString();
                        uri2.getClass();
                        zg zgVar = new zg(str2, (byte) 9);
                        tm1Var.getClass();
                        tl7.z(zz.J(tm1Var), null, null, new e0((Object) tm1Var, (Object) uri2, (Object) zgVar, (vz0) null, (byte) 17), 3);
                    }
                    if (z45.b(y45Var) != null) {
                        si siVar = si.a;
                        si.a(str2);
                    }
                }
                return obj2;
            case 11:
                an1 an1Var = (an1) obj5;
                hn1 hn1Var = (hn1) obj4;
                r05 r05Var = (r05) obj3;
                hn1 hn1Var2 = (hn1) obj;
                if (!hn1Var2.K) {
                    return ij6.y;
                }
                if (hn1Var2.N != null) {
                    ez2.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                ub2 ub2Var = hn1Var2.L;
                if (ub2Var != null) {
                    in1Var = (in1) ub2Var.invoke(an1Var);
                }
                hn1Var2.N = in1Var;
                if (in1Var != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ((bc) ((oa) wc7.P(hn1Var)).m159getDragAndDropManager()).b.add(hn1Var2);
                }
                if (!r05Var.x && !z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                r05Var.x = z2;
                return ij6.x;
            case 12:
                no1 no1Var = (no1) obj4;
                em4 em4Var = (em4) obj3;
                dm4 dm4Var = (dm4) obj;
                boolean d0 = ((xo3) obj5).d0();
                d9 d9Var = no1Var.L;
                if (d0) {
                    f2 = d9Var.d().d(no1Var.L.h.getValue());
                } else {
                    f2 = d9Var.f();
                }
                rg4 rg4Var2 = no1Var.N;
                if (rg4Var2 == rg4.y) {
                    f3 = f2;
                } else {
                    f3 = 0.0f;
                }
                if (rg4Var2 == rg4Var) {
                    f4 = f2;
                } else {
                    f4 = 0.0f;
                }
                dm4Var.x = true;
                dm4.h(dm4Var, em4Var, io3.h0(f3), io3.h0(f4));
                dm4Var.x = false;
                return obj2;
            case 13:
                c9 c9Var = (c9) obj5;
                rg4 rg4Var3 = (rg4) obj3;
                long j8 = ((qn1) obj).a;
                if (((to1) obj4).k0) {
                    g = xc4.g(-1.0f, j8);
                } else {
                    g = xc4.g(1.0f, j8);
                }
                qo1 qo1Var = ro1.a;
                if (rg4Var3 == rg4Var) {
                    j2 = g & 4294967295L;
                } else {
                    j2 = g >> 32;
                }
                float intBitsToFloat = Float.intBitsToFloat((int) j2);
                switch (c9Var.a) {
                    case 0:
                        d9 d9Var2 = (d9) c9Var.b;
                        z8 z8Var = d9Var2.m;
                        float e = d9Var2.e(intBitsToFloat);
                        d9 d9Var3 = z8Var.a;
                        d9Var3.i.i(e);
                        d9Var3.j.i(0.0f);
                        return obj2;
                    default:
                        ((tr5) c9Var.b).b(intBitsToFloat);
                        return obj2;
                }
            case 14:
                r72 r72Var = (r72) obj4;
                ub2 ub2Var2 = (ub2) obj3;
                h82 h82Var = (h82) obj;
                if (!a34.i(h82Var, (h82) obj5)) {
                    if (!a34.i(h82Var, r72Var.c)) {
                        z8 = ((Boolean) ub2Var2.invoke(h82Var)).booleanValue();
                    } else {
                        ze0.m("Focus search landed at the root.");
                        return null;
                    }
                }
                return Boolean.valueOf(z8);
            case 15:
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                ts4 ts4Var = (ts4) obj3;
                j44 j44Var = (j44) obj;
                ts4 ts4Var2 = sk2.c;
                ts4 ts4Var3 = sk2.d;
                String str5 = "";
                if (((String) nx7.F(j44Var, ts4Var3, "")).equals(str3)) {
                    ts4 c = sk2.c(j44Var, str3);
                    if (c != null && !c.a.equals(str4)) {
                        ts4 c2 = sk2.c(j44Var, str3);
                        if (c2 != null) {
                            HashSet hashSet = new HashSet((Collection) nx7.F(j44Var, c2, new HashSet()));
                            hashSet.remove(str3);
                            if (hashSet.isEmpty()) {
                                j44Var.d(c2);
                            } else {
                                j44Var.f(c2, hashSet);
                            }
                        }
                        HashSet hashSet2 = new HashSet((Collection) nx7.F(j44Var, ts4Var, new HashSet()));
                        hashSet2.add(str3);
                        j44Var.f(ts4Var, hashSet2);
                    }
                } else {
                    long longValue = ((Long) nx7.F(j44Var, ts4Var2, 0L)).longValue();
                    long j9 = 1;
                    if (longValue + 1 == 30) {
                        long longValue2 = ((Long) nx7.F(j44Var, ts4Var2, 0L)).longValue();
                        HashSet hashSet3 = new HashSet();
                        String str6 = null;
                        for (Map.Entry entry : j44Var.a().entrySet()) {
                            if (entry.getValue() instanceof Set) {
                                ?? r15 = (Set) entry.getValue();
                                for (String str7 : r15) {
                                    long j10 = j9;
                                    if (str6 == null || str6.compareTo(str7) > 0) {
                                        str5 = ((ts4) entry.getKey()).a;
                                        str6 = str7;
                                        hashSet3 = r15;
                                    }
                                    j9 = j10;
                                }
                            }
                            j9 = j9;
                        }
                        j3 = j9;
                        HashSet hashSet4 = new HashSet(hashSet3);
                        hashSet4.remove(str6);
                        str5.getClass();
                        j44Var.f(new ts4(str5), hashSet4);
                        longValue = longValue2 - j3;
                        j44Var.f(ts4Var2, Long.valueOf(longValue));
                    } else {
                        j3 = 1;
                    }
                    HashSet hashSet5 = new HashSet((Collection) nx7.F(j44Var, ts4Var, new HashSet()));
                    hashSet5.add(str3);
                    j44Var.f(ts4Var, hashSet5);
                    j44Var.f(ts4Var2, Long.valueOf(longValue + j3));
                    j44Var.f(ts4Var3, str3);
                }
                return null;
            case 16:
                df dfVar = (df) obj5;
                URI uri3 = (URI) obj4;
                r05 r05Var2 = (r05) obj3;
                String str8 = (String) obj;
                str8.getClass();
                Matcher matcher = km2.b.x.matcher(str8);
                matcher.getClass();
                if (!matcher.find(0)) {
                    do3Var = null;
                } else {
                    do3Var = new do3(matcher, str8);
                }
                if (do3Var != null) {
                    Matcher matcher2 = km2.c.x.matcher(str8);
                    matcher2.getClass();
                    if (matcher2.find(0)) {
                        do3Var2 = new do3(matcher2, str8);
                    }
                    if (do3Var2 != null && (K = b06.K((String) ((bo3) do3Var.a()).get(1))) != null) {
                        int intValue = K.intValue();
                        Integer K2 = b06.K((String) ((bo3) do3Var.a()).get(2));
                        if (K2 != null) {
                            int intValue2 = K2.intValue();
                            Integer J = b06.J(16, uz5.v0((String) ((bo3) do3Var2.a()).get(1)));
                            if (J != null) {
                                int intValue3 = J.intValue();
                                if (intValue >= 1280 && intValue2 >= 720 && intValue3 < 40) {
                                    String str9 = (String) ((bo3) do3Var2.a()).get(1);
                                    str9.getClass();
                                    int length = str9.length() - 2;
                                    if (length < 0) {
                                        length = 0;
                                    }
                                    String concat = uz5.u0(length, str9).concat("28");
                                    ao3 c3 = do3Var2.c.c(1);
                                    c3.getClass();
                                    f13 f13Var = c3.b;
                                    str8 = uz5.e0(str8, f13Var.x, f13Var.y + 1, concat).toString();
                                }
                            }
                        }
                    }
                }
                if (!uz5.V(str8)) {
                    if (b06.I(str8, "#", false)) {
                        String c4 = km2.a.c(str8, new r82(uri3, dfVar, b6));
                        r05Var2.x = b06.I(str8, "#EXTINF:", false);
                        return c4;
                    }
                    String uri4 = uri3.resolve(uz5.w0(str8).toString()).toString();
                    uri4.getClass();
                    Object invoke = dfVar.invoke(uri4, Boolean.valueOf(r05Var2.x));
                    r05Var2.x = false;
                    return (CharSequence) invoke;
                }
                return str8;
            case 17:
                ((rn2) obj5).d.remove((String) obj4, (bx5) obj3);
                return obj2;
            case 18:
                og3 og3Var2 = (og3) obj5;
                ?? obj7 = new Object();
                jg3 jg3Var = new jg3((xg3) obj4, obj7, (ub2) obj3, r5);
                og3Var2.getLifecycle().a(jg3Var);
                return new dk(og3Var2, jg3Var, obj7, (byte) 1);
            case 19:
                u24 u24Var = (u24) obj4;
                w05 w05Var = (w05) obj3;
                if (((Set) obj5).contains(obj) && (g2 = u24Var.y.g(obj)) != null) {
                    if (g2 instanceof q44) {
                        q44 q44Var = (q44) g2;
                        Object[] objArr = q44Var.b;
                        long[] jArr = q44Var.a;
                        int length2 = jArr.length - 2;
                        if (length2 >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j11 = jArr[i4];
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((255 & j11) < 128) {
                                            ki5 ki5Var = (ki5) objArr[(i4 << 3) + i6];
                                            Object obj8 = w05Var.x;
                                            Object obj9 = obj8;
                                            if (obj8 == null) {
                                                ArrayList arrayList2 = new ArrayList();
                                                w05Var.x = arrayList2;
                                                obj9 = arrayList2;
                                            }
                                            ((List) obj9).add(ki5Var);
                                        }
                                        j11 >>= i;
                                    }
                                    if (i5 != i) {
                                    }
                                }
                                if (i4 != length2) {
                                    i4++;
                                    i = 8;
                                }
                            }
                        }
                    } else {
                        ki5 ki5Var2 = (ki5) g2;
                        Object obj10 = w05Var.x;
                        Object obj11 = obj10;
                        if (obj10 == null) {
                            ArrayList arrayList3 = new ArrayList();
                            w05Var.x = arrayList3;
                            obj11 = arrayList3;
                        }
                        ((List) obj11).add(ki5Var2);
                    }
                }
                return obj2;
            case 20:
                w74 w74Var = (w74) obj5;
                ht0 ht0Var = (ht0) obj4;
                m74 m74Var = (m74) obj3;
                if (w74Var.e == null) {
                    w74Var.e = ht0Var;
                    m74.a(m74Var, ht0Var);
                    return new qj(ht0Var, w74Var, (byte) 7);
                }
                ov3.n("NavigationEventState '", w74Var, "' is already registered with a NavigationEventHandler '", ht0Var, "'.");
                return null;
            case 21:
                ko4 ko4Var = (ko4) obj5;
                ub2 ub2Var3 = (ub2) obj4;
                View view = (View) obj3;
                ((ci1) obj).getClass();
                if (ko4Var != null) {
                    aq4Var = new aq4(ub2Var3, view);
                    ko4Var.v(aq4Var);
                }
                return new qj(aq4Var, ko4Var, (byte) 12);
            case 22:
                k95 k95Var = (k95) obj5;
                q95 q95Var = (q95) obj3;
                p44 p44Var = k95Var.y;
                if (!p44Var.b(obj4)) {
                    k95Var.x.remove(obj4);
                    p44Var.n(obj4, q95Var);
                    return new dk(k95Var, obj4, q95Var, b4);
                }
                ov3.m("Key ", obj4, " was used multiple times ");
                return null;
            case 23:
                List list2 = (List) obj5;
                bc3 bc3Var = (bc3) obj;
                bc3Var.getClass();
                bc3Var.A0(list2.size(), new od(new la5((byte) 25), list2, (byte) 24), new eo(list2, (byte) 15), new os0(-1117249557, true, new vh0(list2, (ub2) obj3, (byte) 1)));
                if (((wm6) obj4).d) {
                    bc3.z0(bc3Var, null, new la5((byte) 26), n03.j, 5);
                }
                return obj2;
            case 24:
                r05 r05Var3 = (r05) obj3;
                uq4 uq4Var = (uq4) obj;
                if (((b14) obj5).a(uq4Var.c, (p65) obj4)) {
                    uq4Var.a();
                    r05Var3.x = true;
                }
                return obj2;
            case 25:
                st0 st0Var = (st0) obj3;
                Throwable th2 = (Throwable) obj;
                ((lz0) obj5).invoke(th2);
                za0 za0Var = (za0) ((zp2) obj4).z;
                za0Var.c(th2, false);
                while (true) {
                    Object a3 = dk0.a(za0Var.e());
                    if (a3 != null) {
                        st0Var.invoke(a3, th2);
                    } else {
                        return obj2;
                    }
                }
            case 26:
                r05 r05Var4 = (r05) obj5;
                jo joVar2 = (jo) obj4;
                pv5 pv5Var = (pv5) obj3;
                jo joVar3 = (jo) obj;
                if (r05Var4.x) {
                    Object obj12 = joVar3.a;
                    int i7 = joVar3.c;
                    int i8 = joVar3.b;
                    if ((obj12 instanceof pv5) && i8 == joVar2.b && i7 == joVar2.c) {
                        if (pv5Var == null) {
                            pv5Var = new pv5(0L, 0L, (s92) null, (o92) null, (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, (g96) null, (km5) null, 65535);
                        }
                        joVar = new jo(i8, i7, pv5Var);
                        r05Var4.x = joVar2.equals(joVar3);
                        return joVar;
                    }
                }
                joVar = joVar3;
                r05Var4.x = joVar2.equals(joVar3);
                return joVar;
            case 27:
                ub2 ub2Var4 = (ub2) obj4;
                vc6 vc6Var = (vc6) ((w05) obj3).x;
                mc6 k = ((pz2) obj5).k((List) obj);
                if (vc6Var != null) {
                    vc6Var.a(null, k);
                }
                ub2Var4.invoke(k);
                return obj2;
            case 28:
                return a(obj);
            default:
                final jb6 jb6Var = (jb6) obj5;
                v11 v11Var = (v11) obj4;
                Context context3 = (Context) obj3;
                n86 n86Var = (n86) obj;
                n86Var.a();
                f44 f44Var = n86Var.a;
                x86[] x86VarArr = x86.y;
                if (!nd6.d(jb6Var.l().b) && jb6Var.h() && jb6Var.g != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                mb6 mb6Var = new mb6(v11Var, new eb6(jb6Var, r14, b8), r5);
                Resources resources = context3.getResources();
                ll5 ll5Var = new ll5((sb2) mb6Var, (ec2) r14, b7);
                if (z3) {
                    f44Var.a(new w86(m37.k, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, ll5Var));
                }
                x86[] x86VarArr2 = x86.y;
                if (!nd6.d(jb6Var.l().b) && jb6Var.g != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                mb6 mb6Var2 = new mb6(v11Var, new eb6(jb6Var, r14, b6), r5);
                Resources resources2 = context3.getResources();
                ll5 ll5Var2 = new ll5((sb2) mb6Var2, (ec2) r14, b7);
                if (z4) {
                    f44Var.a(new w86(m37.l, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, ll5Var2));
                }
                x86[] x86VarArr3 = x86.y;
                if (jb6Var.h() && ((Boolean) jb6Var.w.getValue()).booleanValue() && jb6Var.g != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                mb6 mb6Var3 = new mb6(v11Var, new eb6(jb6Var, r14, b5), r5);
                Resources resources3 = context3.getResources();
                ll5 ll5Var3 = new ll5((sb2) mb6Var3, (ec2) r14, b7);
                if (z5) {
                    f44Var.a(new w86(m37.m, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, ll5Var3));
                }
                x86[] x86VarArr4 = x86.y;
                if (nd6.e(jb6Var.l().b) != jb6Var.l().a.y.length()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                sb2 sb2Var = new sb2() { // from class: ob6
                    @Override // defpackage.sb2
                    public final Object invoke() {
                        byte b11 = r5;
                        pn6 pn6Var = pn6.a;
                        jb6 jb6Var2 = jb6Var;
                        switch (b11) {
                            case 0:
                                return Boolean.valueOf(!jb6Var2.A);
                            case 1:
                                mc6 b12 = jb6.b(jb6Var2.l().a, fy5.a(0, jb6Var2.l().a.y.length()));
                                jb6Var2.c.invoke(b12);
                                long j12 = b12.b;
                                jb6Var2.v = new nd6(j12);
                                jb6Var2.t = mc6.a(jb6Var2.t, null, j12, 5);
                                jb6Var2.e(true);
                                return pn6Var;
                            default:
                                sb2 sb2Var2 = jb6Var2.f;
                                if (sb2Var2 != null) {
                                    sb2Var2.invoke();
                                }
                                return pn6Var;
                        }
                    }
                };
                final byte b11 = 1;
                sb2 sb2Var2 = new sb2() { // from class: ob6
                    @Override // defpackage.sb2
                    public final Object invoke() {
                        byte b112 = b11;
                        pn6 pn6Var = pn6.a;
                        jb6 jb6Var2 = jb6Var;
                        switch (b112) {
                            case 0:
                                return Boolean.valueOf(!jb6Var2.A);
                            case 1:
                                mc6 b12 = jb6.b(jb6Var2.l().a, fy5.a(0, jb6Var2.l().a.y.length()));
                                jb6Var2.c.invoke(b12);
                                long j12 = b12.b;
                                jb6Var2.v = new nd6(j12);
                                jb6Var2.t = mc6.a(jb6Var2.t, null, j12, 5);
                                jb6Var2.e(true);
                                return pn6Var;
                            default:
                                sb2 sb2Var22 = jb6Var2.f;
                                if (sb2Var22 != null) {
                                    sb2Var22.invoke();
                                }
                                return pn6Var;
                        }
                    }
                };
                Resources resources4 = context3.getResources();
                ll5 ll5Var4 = new ll5(sb2Var2, (ec2) sb2Var, b7);
                if (z6) {
                    f44Var.a(new w86(m37.n, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, ll5Var4));
                }
                x86[] x86VarArr5 = x86.y;
                if (jb6Var.h() && nd6.d(jb6Var.l().b)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                sb2 sb2Var3 = new sb2() { // from class: ob6
                    @Override // defpackage.sb2
                    public final Object invoke() {
                        byte b112 = b6;
                        pn6 pn6Var = pn6.a;
                        jb6 jb6Var2 = jb6Var;
                        switch (b112) {
                            case 0:
                                return Boolean.valueOf(!jb6Var2.A);
                            case 1:
                                mc6 b12 = jb6.b(jb6Var2.l().a, fy5.a(0, jb6Var2.l().a.y.length()));
                                jb6Var2.c.invoke(b12);
                                long j12 = b12.b;
                                jb6Var2.v = new nd6(j12);
                                jb6Var2.t = mc6.a(jb6Var2.t, null, j12, 5);
                                jb6Var2.e(true);
                                return pn6Var;
                            default:
                                sb2 sb2Var22 = jb6Var2.f;
                                if (sb2Var22 != null) {
                                    sb2Var22.invoke();
                                }
                                return pn6Var;
                        }
                    }
                };
                Resources resources5 = context3.getResources();
                ll5 ll5Var5 = new ll5(sb2Var3, (ec2) r14, b7);
                if (z7) {
                    f44Var.a(new w86(m37.o, resources5.getString(R.string.autofill), 0, ll5Var5));
                }
                n86Var.a();
                return obj2;
        }
    }

    public /* synthetic */ bg(t05 t05Var, wc5 wc5Var, t05 t05Var2, s81 s81Var) {
        this.x = (byte) 7;
        this.y = t05Var;
        this.z = wc5Var;
        this.A = t05Var2;
    }

    public /* synthetic */ bg(sv6 sv6Var, za3 za3Var, sv6 sv6Var2) {
        this.x = (byte) 0;
        this.y = sv6Var;
        this.A = za3Var;
        this.z = sv6Var2;
    }

    public /* synthetic */ bg(Object obj, Object obj2, Object obj3, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    public /* synthetic */ bg(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.x = b;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }
}
