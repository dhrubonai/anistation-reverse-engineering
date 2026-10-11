package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hf7 {
    public static final /* synthetic */ int c = 0;
    public final zg7 a = new zg7();
    public boolean b;

    static {
        new hf7(0);
    }

    public hf7(int i) {
        a();
        a();
    }

    public static void b(ef7 ef7Var, lh7 lh7Var, int i, Object obj) {
        if (lh7Var != lh7.A) {
            ef7Var.d(i, lh7Var.y);
            mh7 mh7Var = mh7.x;
            switch (lh7Var.ordinal()) {
                case 0:
                    ef7Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    ef7Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    ef7Var.t(((Long) obj).longValue());
                    return;
                case 3:
                    ef7Var.t(((Long) obj).longValue());
                    return;
                case 4:
                    ef7Var.q(((Integer) obj).intValue());
                    return;
                case 5:
                    ef7Var.u(((Long) obj).longValue());
                    return;
                case 6:
                    ef7Var.s(((Integer) obj).intValue());
                    return;
                case 7:
                    ef7Var.p(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof we7) {
                        ef7Var.m((we7) obj);
                        return;
                    } else {
                        ef7Var.v((String) obj);
                        return;
                    }
                case 9:
                    ((mf7) ((qe7) obj)).d(ef7Var);
                    return;
                case 10:
                    ef7Var.o((qe7) obj);
                    return;
                case 11:
                    if (obj instanceof we7) {
                        ef7Var.m((we7) obj);
                        return;
                    } else {
                        byte[] bArr = (byte[]) obj;
                        ef7Var.n(bArr.length, bArr);
                        return;
                    }
                case 12:
                    ef7Var.r(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof of7) {
                        ef7Var.q(((of7) obj).a());
                        return;
                    } else {
                        ef7Var.q(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    ef7Var.s(((Integer) obj).intValue());
                    return;
                case 15:
                    ef7Var.u(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    ef7Var.r((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    ef7Var.t((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
        ef7Var.d(i, 3);
        ((mf7) ((qe7) obj)).d(ef7Var);
        ef7Var.d(i, 4);
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.b) {
            return;
        }
        zg7 zg7Var = this.a;
        int i = zg7Var.y;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = zg7Var.a(i2).y;
            if (obj instanceof mf7) {
                mf7 mf7Var = (mf7) obj;
                ug7.c.a(mf7Var.getClass()).f(mf7Var);
                mf7Var.f();
            }
        }
        Iterator it = zg7Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof mf7) {
                mf7 mf7Var2 = (mf7) value;
                ug7.c.a(mf7Var2.getClass()).f(mf7Var2);
                mf7Var2.f();
            }
        }
        if (!zg7Var.A) {
            if (zg7Var.y <= 0) {
                Iterator it2 = zg7Var.b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    ov3.d();
                    return;
                }
            } else {
                zg7Var.a(0).x.getClass();
                ov3.d();
                return;
            }
        }
        if (!zg7Var.A) {
            if (zg7Var.z.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(zg7Var.z);
            }
            zg7Var.z = unmodifiableMap;
            if (zg7Var.C.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(zg7Var.C);
            }
            zg7Var.C = unmodifiableMap2;
            zg7Var.A = true;
        }
        this.b = true;
    }

    public final Object clone() {
        hf7 hf7Var = new hf7();
        zg7 zg7Var = this.a;
        if (zg7Var.y <= 0) {
            Iterator it = zg7Var.b().iterator();
            if (!it.hasNext()) {
                return hf7Var;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                ov3.d();
                return null;
            }
            entry.getValue();
            throw null;
        }
        zg7Var.a(0).x.getClass();
        ov3.d();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf7)) {
            return false;
        }
        return this.a.equals(((hf7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public hf7() {
    }
}
