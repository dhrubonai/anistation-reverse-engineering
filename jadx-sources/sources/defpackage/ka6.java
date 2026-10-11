package defpackage;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ka6 implements ub2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ ka6(al6 al6Var) {
        this.x = (byte) 15;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        rg4 rg4Var;
        id6 a;
        pv5 pv5Var;
        al6 al6Var;
        String valueOf;
        byte b = this.x;
        boolean z = true;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                wa6 wa6Var = (wa6) obj;
                Integer c = wa6Var.c();
                if (c == null) {
                    return null;
                }
                int intValue = c.intValue();
                long j = wa6Var.f;
                int i = nd6.c;
                return new nd1(((int) (4294967295L & j)) - intValue, 0);
            case 1:
                wa6 wa6Var2 = (wa6) obj;
                Integer b2 = wa6Var2.b();
                if (b2 == null) {
                    return null;
                }
                int intValue2 = b2.intValue();
                long j2 = wa6Var2.f;
                int i2 = nd6.c;
                return new nd1(0, intValue2 - ((int) (4294967295L & j2)));
            case 2:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                if (((Boolean) obj2).booleanValue()) {
                    rg4Var = rg4.x;
                } else {
                    rg4Var = rg4.y;
                }
                Object obj3 = list.get(0);
                obj3.getClass();
                return new cb6(rg4Var, ((Float) obj3).floatValue());
            case 3:
                return pn6Var;
            case 4:
                if (((n05) obj) != null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                return pn6Var;
            case 6:
                return pn6Var;
            case 7:
                return pn6Var;
            case 8:
                return pn6Var;
            case 9:
                return pn6Var;
            case 10:
                jo joVar = (jo) obj;
                Object obj4 = joVar.a;
                if ((obj4 instanceof vh3) && (a = ((vh3) obj4).a()) != null && (a.a != null || a.b != null || a.c != null || a.d != null)) {
                    Object obj5 = joVar.a;
                    obj5.getClass();
                    id6 a2 = ((vh3) obj5).a();
                    if (a2 == null || (pv5Var = a2.a) == null) {
                        pv5Var = new pv5(0L, 0L, (s92) null, (o92) null, (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, (g96) null, (km5) null, 65535);
                    }
                    return te4.n(joVar, new jo(joVar.b, joVar.c, pv5Var));
                }
                return te4.n(joVar);
            case 11:
                ((bi5) obj).b(yh5.B, pn6Var);
                return pn6Var;
            case 12:
                m85 m85Var = (m85) obj;
                m85Var.getClass();
                return Boolean.valueOf(m85Var.p0());
            case 13:
                sf5 sf5Var = (sf5) obj;
                long j3 = sf5Var.C;
                eu5 eu5Var = sf5Var.E;
                if (eu5Var != null) {
                    eu5Var.d(sf5Var, tl7.j, sf5Var.D);
                }
                long j4 = sf5Var.C;
                if (j3 != j4) {
                    lf5 lf5Var = sf5Var.L;
                    if (lf5Var != null) {
                        if (lf5Var.a > j4) {
                            sf5Var.N();
                        } else {
                            lf5Var.g = j4;
                            if (lf5Var.b == null) {
                                lf5Var.h = io3.i0((1.0d - lf5Var.e.a(0)) * sf5Var.C);
                            }
                        }
                    } else if (j4 != 0) {
                        sf5Var.S();
                    }
                }
                return pn6Var;
            case 14:
                m85 m85Var2 = (m85) obj;
                m85Var2.getClass();
                wk5 wk5Var = new wk5();
                while (m85Var2.p0()) {
                    wk5Var.add(Integer.valueOf((int) m85Var2.getLong(0)));
                }
                return te4.s(wk5Var);
            case 15:
                a83 a83Var = (a83) obj;
                a83Var.getClass();
                c83 c83Var = a83Var.a;
                if (c83Var == null) {
                    return "*";
                }
                y73 y73Var = a83Var.b;
                if (y73Var instanceof al6) {
                    al6Var = (al6) y73Var;
                } else {
                    al6Var = null;
                }
                if (al6Var != null) {
                    valueOf = al6Var.d(true);
                } else {
                    valueOf = String.valueOf(y73Var);
                }
                int ordinal = c83Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return "out ".concat(valueOf);
                        }
                        ze0.l();
                        return null;
                    }
                    return "in ".concat(valueOf);
                }
                return valueOf;
            case 16:
                ai4 ai4Var = (ai4) obj;
                ai4Var.getClass();
                String str = (String) ai4Var.x;
                Object obj6 = ai4Var.y;
                if (obj6 != null) {
                    return str + '=' + String.valueOf(obj6);
                }
                return str;
            case 17:
                return UniversalRequestDataStoreProvider.b((d21) obj);
            case 18:
                cn0 cn0Var = (cn0) obj;
                cn0Var.getClass();
                cn0Var.a(p7.Q, new up6(((sp6) cn0Var.b).a, null));
                return pn6Var;
            case 19:
                return pn6Var;
            case 20:
                return new nl(((Float) obj).floatValue());
            case 21:
                return new nl(((Integer) obj).intValue());
            case 22:
                return Integer.valueOf((int) ((nl) obj).a);
            case 23:
                return new nl(((vm1) obj).x);
            case 24:
                return new vm1(((nl) obj).a);
            case 25:
                xm1 xm1Var = (xm1) obj;
                return new ol(Float.intBitsToFloat((int) (xm1Var.a >> 32)), Float.intBitsToFloat((int) (xm1Var.a & 4294967295L)));
            case 26:
                ol olVar = (ol) obj;
                return new xm1((Float.floatToRawIntBits(olVar.a) << 32) | (Float.floatToRawIntBits(olVar.b) & 4294967295L));
            case 27:
                uq5 uq5Var = (uq5) obj;
                return new ol(Float.intBitsToFloat((int) (uq5Var.a >> 32)), Float.intBitsToFloat((int) (uq5Var.a & 4294967295L)));
            case 28:
                ol olVar2 = (ol) obj;
                return new uq5((Float.floatToRawIntBits(olVar2.a) << 32) | (Float.floatToRawIntBits(olVar2.b) & 4294967295L));
            default:
                xc4 xc4Var = (xc4) obj;
                return new ol(Float.intBitsToFloat((int) (xc4Var.a >> 32)), Float.intBitsToFloat((int) (xc4Var.a & 4294967295L)));
        }
    }

    public /* synthetic */ ka6(byte b) {
        this.x = b;
    }
}
