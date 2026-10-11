package defpackage;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k27 extends r25 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public k27(gi0 gi0Var) {
        this.a = (byte) 2;
        Objects.requireNonNull(gi0Var);
        this.b = gi0Var;
    }

    @Override // defpackage.r25
    public void j() {
        switch (this.a) {
            case 3:
                ((a58) this.b).b();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.r25
    public void k(MediaError mediaError) {
        switch (this.a) {
            case 0:
                String str = mediaError.x;
                String str2 = mediaError.A;
                Integer num = mediaError.z;
                StringBuilder o = h11.o("Cast media error: type=", str, ", reason=", str2, ", detail=");
                o.append(num);
                Log.e("WatchViewModel", o.toString());
                Set set = pn4.a;
                if (num != null) {
                    int intValue = num.intValue();
                    while (intValue > 999) {
                        intValue /= 10;
                    }
                    if (100 <= intValue && intValue < 400) {
                        ((v27) this.b).q(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.r25
    public void l() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((v27) obj).S();
                return;
            case 3:
                ((a58) obj).b();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.r25
    public void m() {
        switch (this.a) {
            case 3:
                ((a58) this.b).b();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.r25
    public void n() {
        switch (this.a) {
            case 3:
                ((a58) this.b).b();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [mm5, java.lang.Object] */
    @Override // defpackage.r25
    public final void o() {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        MediaInfo mediaInfo;
        byte b = this.a;
        bx3 bx3Var = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                v27 v27Var = (v27) obj;
                v27Var.S();
                bx3 n = v27Var.n();
                if (n != null && (mediaInfo = n.x) != null) {
                    l = Long.valueOf(mediaInfo.B);
                } else {
                    l = null;
                }
                v27Var.Y(l);
                sx5 sx5Var = v27Var.n;
                bx3 n2 = v27Var.n();
                if (n2 != null) {
                    int i = n2.B;
                    boolean z = false;
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            if (i == 4 || i == 5) {
                                v27Var.g();
                                return;
                            }
                            return;
                        }
                        zw Q = h98.Q(((ym6) sx5Var.getValue()).o, ((ym6) sx5Var.getValue()).m);
                        if (Q != null) {
                            l3 = Q.g;
                        } else {
                            l3 = null;
                        }
                        if (v27Var.Q && l3 != null) {
                            long[] jArr = n2.H;
                            if (jArr == null) {
                                jArr = new long[0];
                            }
                            if (!ms.s0(jArr, l3.longValue())) {
                                return;
                            }
                        }
                        v27Var.Q = false;
                        t17 t17Var = v27Var.K;
                        if (t17Var != null) {
                            l4 = Long.valueOf(t17Var.d);
                        } else {
                            l4 = null;
                        }
                        v27Var.N = l4;
                        if (n2.B == 2) {
                            z = true;
                        }
                        v27Var.S = z;
                        bx5 bx5Var = v27Var.O;
                        if (bx5Var != null) {
                            bx5Var.l(null);
                        }
                        v27Var.O = null;
                        return;
                    }
                    if (n2.C == 4) {
                        v27Var.q(false);
                        return;
                    }
                    if (!v27Var.Q) {
                        Long l5 = v27Var.N;
                        t17 t17Var2 = v27Var.K;
                        if (t17Var2 != null) {
                            l2 = Long.valueOf(t17Var2.d);
                        } else {
                            l2 = null;
                        }
                        if (a34.i(l5, l2)) {
                            int i2 = n2.C;
                            if (i2 == 2 || i2 == 1) {
                                bx5 bx5Var2 = v27Var.O;
                                if (bx5Var2 != null) {
                                    bx5Var2.l(null);
                                }
                                v27Var.O = null;
                                v27Var.Q = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                nq3 nq3Var = (nq3) obj;
                long g = nq3Var.g();
                if (g != nq3Var.a) {
                    nq3Var.a = g;
                    nq3Var.d();
                    if (nq3Var.a != 0) {
                        nq3Var.e();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                gi0 gi0Var = (gi0) obj;
                s25 s25Var = gi0Var.j;
                if (s25Var != null) {
                    bx3Var = s25Var.e();
                }
                uw7 uw7Var = gi0Var.l;
                if (uw7Var != null && bx3Var != null) {
                    lc7 I = ((kz) uw7Var.x).I();
                    ?? obj2 = new Object();
                    obj2.x = bx3Var.B;
                    e60 e60Var = new e60(obj2);
                    e60 e60Var2 = I.m;
                    if (e60Var2 == null || e60Var2.a != 2) {
                        e60Var.c = I.h;
                        I.m = e60Var;
                        return;
                    }
                    return;
                }
                return;
            default:
                ((a58) obj).b();
                return;
        }
    }

    @Override // defpackage.r25
    public void p(String str, long j, int i, long j2, long j3) {
        switch (this.a) {
            case 2:
                uw7 uw7Var = ((gi0) this.b).l;
                if (uw7Var != null) {
                    lc7 I = ((kz) uw7Var.x).I();
                    xn7 xn7Var = new xn7(str);
                    xn7Var.b = j;
                    xn7Var.c = i;
                    xn7Var.d = j2;
                    xn7Var.e = j3;
                    zn7 zn7Var = new zn7(xn7Var);
                    zn7Var.f = I.h;
                    I.d.add(zn7Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.r25
    public void q(int[] iArr) {
        switch (this.a) {
            case 1:
                nq3 nq3Var = (nq3) this.b;
                ArrayList e = qi0.e(iArr);
                if (!((ArrayList) nq3Var.d).equals(e)) {
                    nq3Var.h();
                    ((lw7) nq3Var.f).evictAll();
                    ((ArrayList) nq3Var.g).clear();
                    nq3Var.d = e;
                    nq3Var.f();
                    nq3Var.j();
                    nq3Var.i();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.r25
    public void r(int[] iArr, int i) {
        int i2;
        switch (this.a) {
            case 1:
                nq3 nq3Var = (nq3) this.b;
                if (i == 0) {
                    i2 = ((ArrayList) nq3Var.d).size();
                } else {
                    i2 = ((SparseIntArray) nq3Var.e).get(i, -1);
                    if (i2 == -1) {
                        nq3Var.e();
                        return;
                    }
                }
                nq3 nq3Var2 = (nq3) this.b;
                nq3Var2.h();
                ((ArrayList) nq3Var2.d).addAll(i2, qi0.e(iArr));
                nq3Var2.f();
                Set set = (Set) nq3Var2.m;
                synchronized (set) {
                    try {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((n25) it.next()).getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                nq3Var2.i();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.r25
    public void s(int[] iArr) {
        switch (this.a) {
            case 1:
                nq3 nq3Var = (nq3) this.b;
                ArrayList arrayList = new ArrayList();
                for (int i : iArr) {
                    ((lw7) nq3Var.f).remove(Integer.valueOf(i));
                    int i2 = ((SparseIntArray) nq3Var.e).get(i, -1);
                    if (i2 == -1) {
                        nq3Var.e();
                        return;
                    }
                    arrayList.add(Integer.valueOf(i2));
                }
                Collections.sort(arrayList);
                nq3Var.h();
                qi0.d(arrayList);
                nq3Var.k();
                nq3Var.i();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.r25
    public void t(int[] iArr) {
        switch (this.a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i : iArr) {
                    nq3 nq3Var = (nq3) this.b;
                    ((lw7) nq3Var.f).remove(Integer.valueOf(i));
                    SparseIntArray sparseIntArray = (SparseIntArray) nq3Var.e;
                    int i2 = sparseIntArray.get(i, -1);
                    if (i2 == -1) {
                        nq3Var.e();
                        return;
                    } else {
                        sparseIntArray.delete(i);
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    nq3 nq3Var2 = (nq3) this.b;
                    nq3Var2.h();
                    ((ArrayList) nq3Var2.d).removeAll(qi0.e(iArr));
                    nq3Var2.f();
                    qi0.d(arrayList);
                    Set set = (Set) nq3Var2.m;
                    synchronized (set) {
                        try {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                ((n25) it.next()).getClass();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    nq3Var2.i();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.r25
    public void u(ur3[] ur3VarArr) {
        switch (this.a) {
            case 1:
                HashSet hashSet = new HashSet();
                nq3 nq3Var = (nq3) this.b;
                ArrayList arrayList = (ArrayList) nq3Var.g;
                SparseIntArray sparseIntArray = (SparseIntArray) nq3Var.e;
                arrayList.clear();
                int i = 0;
                for (ur3 ur3Var : ur3VarArr) {
                    int i2 = ur3Var.y;
                    ((lw7) nq3Var.f).put(Integer.valueOf(i2), ur3Var);
                    int i3 = sparseIntArray.get(i2, -1);
                    if (i3 == -1) {
                        nq3Var.e();
                        return;
                    }
                    hashSet.add(Integer.valueOf(i3));
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    int i4 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i4 != -1) {
                        hashSet.add(Integer.valueOf(i4));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                nq3Var.h();
                qi0.d(arrayList2);
                nq3Var.k();
                nq3Var.i();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.r25
    public void v(ArrayList arrayList, ArrayList arrayList2, int i) {
        switch (this.a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                if (i == 0) {
                    ((ArrayList) ((nq3) this.b).d).size();
                } else {
                    boolean isEmpty = arrayList2.isEmpty();
                    nq3 nq3Var = (nq3) this.b;
                    if (isEmpty) {
                        zk3 zk3Var = (zk3) nq3Var.b;
                        Log.w(zk3Var.a, zk3Var.c("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                    } else {
                        SparseIntArray sparseIntArray = (SparseIntArray) nq3Var.e;
                        if (sparseIntArray.get(i, -1) == -1) {
                            sparseIntArray.get(((Integer) arrayList2.get(0)).intValue(), -1);
                        }
                    }
                }
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    int intValue = ((Integer) obj).intValue();
                    nq3 nq3Var2 = (nq3) this.b;
                    int i3 = ((SparseIntArray) nq3Var2.e).get(intValue, -1);
                    if (i3 == -1) {
                        nq3Var2.e();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i3));
                }
                nq3 nq3Var3 = (nq3) this.b;
                nq3Var3.h();
                nq3Var3.d = arrayList;
                nq3Var3.f();
                Set set = (Set) nq3Var3.m;
                synchronized (set) {
                    try {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((n25) it.next()).getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                nq3Var3.i();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.r25
    public void w() {
        switch (this.a) {
            case 1:
                ((nq3) this.b).e();
                return;
            default:
                return;
        }
    }

    public /* synthetic */ k27(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
