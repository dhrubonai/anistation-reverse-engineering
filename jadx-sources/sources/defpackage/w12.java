package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w12 {
    public static final /* synthetic */ int c = 0;
    public final gs5 a = gs5.f();
    public boolean b;

    static {
        new w12(0);
    }

    public w12(int i) {
        a();
        a();
    }

    public static void b(to0 to0Var, v67 v67Var, int i, Object obj) {
        if (v67Var == v67.A) {
            to0Var.B(i, 3);
            ((h2) obj).b(to0Var);
            to0Var.B(i, 4);
            return;
        }
        to0Var.B(i, v67Var.y);
        switch (v67Var.ordinal()) {
            case 0:
                to0Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                to0Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                to0Var.F(((Long) obj).longValue());
                return;
            case 3:
                to0Var.F(((Long) obj).longValue());
                return;
            case 4:
                to0Var.w(((Integer) obj).intValue());
                return;
            case 5:
                to0Var.u(((Long) obj).longValue());
                return;
            case 6:
                to0Var.s(((Integer) obj).intValue());
                return;
            case 7:
                to0Var.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof xd0) {
                    to0Var.q((xd0) obj);
                    return;
                } else {
                    to0Var.A((String) obj);
                    return;
                }
            case 9:
                ((h2) obj).b(to0Var);
                return;
            case 10:
                h2 h2Var = (h2) obj;
                to0Var.D(((vd2) h2Var).a(null));
                h2Var.b(to0Var);
                return;
            case 11:
                if (obj instanceof xd0) {
                    to0Var.q((xd0) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                to0Var.D(length);
                to0Var.n(bArr, 0, length);
                return;
            case 12:
                to0Var.D(((Integer) obj).intValue());
                return;
            case 13:
                to0Var.w(((Integer) obj).intValue());
                return;
            case 14:
                to0Var.s(((Integer) obj).intValue());
                return;
            case 15:
                to0Var.u(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                to0Var.D((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                to0Var.F((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.b) {
            return;
        }
        gs5 gs5Var = this.a;
        int size = gs5Var.x.size();
        for (int i = 0; i < size; i++) {
            Map.Entry c2 = gs5Var.c(i);
            if (c2.getValue() instanceof vd2) {
                vd2 vd2Var = (vd2) c2.getValue();
                vd2Var.getClass();
                ew4 ew4Var = ew4.c;
                ew4Var.getClass();
                ew4Var.a(vd2Var.getClass()).b(vd2Var);
                vd2Var.h();
            }
        }
        if (!gs5Var.z) {
            if (gs5Var.x.size() <= 0) {
                Iterator it = gs5Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    ov3.d();
                    return;
                }
            } else {
                gs5Var.c(0).getKey().getClass();
                ov3.d();
                return;
            }
        }
        if (!gs5Var.z) {
            if (gs5Var.y.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(gs5Var.y);
            }
            gs5Var.y = unmodifiableMap;
            if (gs5Var.B.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(gs5Var.B);
            }
            gs5Var.B = unmodifiableMap2;
            gs5Var.z = true;
        }
        this.b = true;
    }

    public final Object clone() {
        w12 w12Var = new w12();
        gs5 gs5Var = this.a;
        if (gs5Var.x.size() <= 0) {
            Iterator it = gs5Var.d().iterator();
            if (!it.hasNext()) {
                return w12Var;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                ov3.d();
                return null;
            }
            entry.getValue();
            throw null;
        }
        Map.Entry c2 = gs5Var.c(0);
        if (c2.getKey() != null) {
            ov3.d();
            return null;
        }
        c2.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w12)) {
            return false;
        }
        return this.a.equals(((w12) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public w12() {
    }
}
