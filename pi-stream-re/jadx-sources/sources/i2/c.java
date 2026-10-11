package i2;

import d2.o;
import e0.j;
import f1.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: b, reason: collision with root package name */
    public long f5301b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f5302c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f5303d;

    public c() {
        super(new o());
        this.f5301b = -9223372036854775807L;
        this.f5302c = new long[0];
        this.f5303d = new long[0];
    }

    public static Serializable o(int i10, t tVar) {
        if (i10 != 0) {
            boolean z9 = true;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(tVar.o())).doubleValue());
                                tVar.H(2);
                                return date;
                            }
                            int y9 = tVar.y();
                            ArrayList arrayList = new ArrayList(y9);
                            for (int i11 = 0; i11 < y9; i11++) {
                                Serializable o = o(tVar.v(), tVar);
                                if (o != null) {
                                    arrayList.add(o);
                                }
                            }
                            return arrayList;
                        }
                        return p(tVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String q9 = q(tVar);
                        int v9 = tVar.v();
                        if (v9 == 9) {
                            return hashMap;
                        }
                        Serializable o6 = o(v9, tVar);
                        if (o6 != null) {
                            hashMap.put(q9, o6);
                        }
                    }
                } else {
                    return q(tVar);
                }
            } else {
                if (tVar.v() != 1) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(tVar.o()));
        }
    }

    public static HashMap p(t tVar) {
        int y9 = tVar.y();
        HashMap hashMap = new HashMap(y9);
        for (int i10 = 0; i10 < y9; i10++) {
            String q9 = q(tVar);
            Serializable o = o(tVar.v(), tVar);
            if (o != null) {
                hashMap.put(q9, o);
            }
        }
        return hashMap;
    }

    public static String q(t tVar) {
        int A = tVar.A();
        int i10 = tVar.f3859b;
        tVar.H(A);
        return new String(tVar.f3858a, i10, A);
    }

    public final boolean n(long j4, t tVar) {
        if (tVar.v() != 2 || !"onMetaData".equals(q(tVar)) || tVar.f3860c - tVar.f3859b == 0 || tVar.v() != 8) {
            return false;
        }
        HashMap p3 = p(tVar);
        Object obj = p3.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f5301b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = p3.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f5302c = new long[size];
                this.f5303d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f5302c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f5303d[i10] = ((Double) obj5).longValue();
                    } else {
                        this.f5302c = new long[0];
                        this.f5303d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}
