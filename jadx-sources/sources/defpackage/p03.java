package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.anistation.local.AniStationDatabase;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class p03 implements ub2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ p03(int i, ue3 ue3Var) {
        this.x = (byte) 11;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        yn2 yn2Var;
        String valueOf;
        byte b = this.x;
        byte b2 = 2;
        byte b3 = 29;
        byte b4 = 28;
        Context context = null;
        q44 q44Var = null;
        boolean z = true;
        byte b5 = 0;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                char charValue = ((Character) obj).charValue();
                if ('0' > charValue || charValue >= ':') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                jm0 jm0Var = (jm0) obj;
                jm0Var.getClass();
                jm0.a(jm0Var, "JsonPrimitive", new v53(new co2((byte) 28)));
                jm0.a(jm0Var, "JsonNull", new v53(new co2((byte) 29)));
                jm0.a(jm0Var, "JsonLiteral", new v53(new t53((byte) 0)));
                jm0.a(jm0Var, "JsonObject", new v53(new t53((byte) 1)));
                jm0.a(jm0Var, "JsonArray", new v53(new t53((byte) 2)));
                return pn6Var;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                q53 q53Var = (q53) entry.getValue();
                StringBuilder sb = new StringBuilder();
                jz5.a(sb, str);
                sb.append(':');
                sb.append(q53Var);
                return sb.toString();
            case 3:
                e53 e53Var = (e53) obj;
                e53Var.getClass();
                e53Var.a = true;
                e53Var.d = true;
                e53Var.j = true;
                e53Var.k = true;
                e53Var.e = false;
                return pn6Var;
            case 4:
                return pn6Var;
            case 5:
                List list = (List) obj;
                return new wc3(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 6:
                ((Integer) obj).getClass();
                return nt1.x;
            case 7:
                ((Integer) obj).getClass();
                return -1;
            case 8:
                ((Integer) obj).getClass();
                return null;
            case 9:
                return pn6Var;
            case 10:
                List list2 = (List) obj;
                return new af3(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 11:
                return pn6Var;
            case 12:
                return pn6Var;
            case 13:
                return pn6Var;
            case 14:
                return pn6Var;
            case 15:
                al4 al4Var = (al4) obj;
                tq1 tq1Var = eb.b;
                al4Var.getClass();
                Context context2 = (Context) sw0.E(al4Var, tq1Var);
                while (true) {
                    if (context2 instanceof ContextWrapper) {
                        if (context2 instanceof Activity) {
                            context = context2;
                        } else {
                            context2 = ((ContextWrapper) context2).getBaseContext();
                        }
                    }
                }
                return (Activity) context;
            case 16:
                e04 e04Var = (e04) obj;
                e04Var.getClass();
                st0 st0Var = new st0(b4);
                kz5 kz5Var = zp2.C;
                im0 a = z05.a(AniStationDatabase.class);
                v83 v83Var = v83.x;
                e04Var.a(new k03(new r50(kz5Var, a, null, st0Var, v83Var)));
                e04Var.a(new k03(new r50(kz5Var, z05.a(zx6.class), null, new st0(b3), v83Var)));
                e04Var.a(new k03(new r50(kz5Var, z05.a(tm.class), null, new wj3(b5), v83Var)));
                zz.u(z05.a(av6.class), new wj3(1 == true ? 1 : 0), v83Var, e04Var, 8);
                zz.u(z05.a(hh2.class), new wj3(b2), v83Var, e04Var, 8);
                zz.u(z05.a(yq.class), new wj3((byte) 3), v83Var, e04Var, 8);
                zz.u(z05.a(i20.class), new wj3((byte) 4), v83Var, e04Var, 8);
                e04Var.a(new k03(new r50(kz5Var, z05.a(ee5.class), null, new wj3((byte) 5), v83Var)));
                return pn6Var;
            case 17:
                gm4 gm4Var = (gm4) obj;
                if (gm4Var.u()) {
                    yl3 yl3Var = gm4Var.y;
                    if (!yl3Var.L) {
                        ub2 e = gm4Var.x.e();
                        if (gm4Var.x.d() != null) {
                            yl3Var.L0();
                        } else if (e == null) {
                            yl3Var.E = null;
                            yl3Var.F = null;
                            yl3Var.D = null;
                            yl3Var.L0();
                        } else {
                            yl3Var.E = null;
                            yl3Var.F = null;
                            yl3Var.l0(gm4Var, 9223372034707292159L, 0L);
                            yl3Var.D = e;
                        }
                    }
                }
                return pn6Var;
            case 18:
                gm4 gm4Var2 = (gm4) obj;
                if (gm4Var2.u() && (yn2Var = gm4Var2.z) != null) {
                    yl3 yl3Var2 = gm4Var2.y;
                    p44 p44Var = yl3Var2.O;
                    if (p44Var != null) {
                        q44Var = (q44) p44Var.g(yn2Var);
                    }
                    if (q44Var != null) {
                        sp spVar = yl3Var2.N;
                        if (spVar != null) {
                            spVar.g(yn2Var);
                        }
                        yl3Var2.I0(q44Var);
                        q44Var.b();
                    }
                }
                return pn6Var;
            case 19:
                ((Long) obj).getClass();
                return pn6Var;
            case 20:
                zh5.i((bi5) obj);
                return pn6Var;
            case 21:
                w73[] w73VarArr = zh5.a;
                ((bi5) obj).b(yh5.y, pn6Var);
                return pn6Var;
            case 22:
                di4 di4Var = (di4) obj;
                return qx1.l("[", di4Var.b, ", ", di4Var.c, ")");
            case 23:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                Object value = entry2.getValue();
                if (value instanceof byte[]) {
                    valueOf = ms.O0((byte[]) value, ", ", null, 56);
                } else {
                    valueOf = String.valueOf(entry2.getValue());
                }
                return qx1.q(new StringBuilder("  "), ((ts4) entry2.getKey()).a, " = ", valueOf);
            case 24:
                e04 e04Var2 = (e04) obj;
                e04Var2.getClass();
                iz5.b(e04Var2, z05.a(b64.class), new wj3((byte) 6));
                return pn6Var;
            case 25:
                ((sc3) obj).getClass();
                return new li2(tl7.e(sc3.b));
            case 26:
                ((sc3) obj).getClass();
                return new li2(tl7.e(sc3.b));
            case 27:
                ((sc3) obj).getClass();
                return new li2(tl7.e(sc3.b));
            case 28:
                return new xk((wp5) obj);
            default:
                return pn6Var;
        }
    }

    public /* synthetic */ p03(byte b) {
        this.x = b;
    }
}
