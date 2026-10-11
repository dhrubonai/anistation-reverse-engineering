package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bf2 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ ff2 c;

    public bf2(ff2 ff2Var) {
        this.c = ff2Var;
    }

    public static void a(ms3 ms3Var, int i, Object obj, int i2) {
        qs3 qs3Var;
        qs3 qs3Var2;
        boolean z;
        rs3 rs3Var = ms3Var.a;
        ls3 ls3Var = ms3Var.b;
        int i3 = 65280 & i;
        if (i3 != 256) {
            if (i3 != 512) {
                if (i3 == 768 && i == 769) {
                    ls3Var.getClass();
                    return;
                }
                return;
            }
            switch (i) {
                case 513:
                    ls3Var.getClass();
                    return;
                case 514:
                    ls3Var.getClass();
                    return;
                case 515:
                    ls3Var.getClass();
                    return;
                default:
                    return;
            }
        }
        if (i != 264 && i != 262) {
            if (i != 265 && i != 266) {
                qs3Var2 = (qs3) obj;
                qs3Var = null;
            } else {
                throw h11.f(obj);
            }
        } else {
            ef2 ef2Var = (ef2) obj;
            qs3 qs3Var3 = ef2Var.b;
            qs3Var = ef2Var.a;
            qs3Var2 = qs3Var3;
        }
        if (qs3Var2 != null) {
            boolean z2 = true;
            if ((ms3Var.d & 2) == 0 && !qs3Var2.e(ms3Var.c)) {
                us3 us3Var = rs3.c().u;
                if (us3Var == null) {
                    z = false;
                } else {
                    z = us3Var.c;
                }
                z2 = (z && qs3Var2.c() && i == 262 && i2 == 3 && qs3Var != null) ? true ^ qs3Var.c() : false;
            }
            if (z2) {
                switch (i) {
                    case 257:
                        ls3Var.a(rs3Var, qs3Var2);
                        return;
                    case 258:
                        ls3Var.e(rs3Var, qs3Var2);
                        return;
                    case 259:
                        ls3Var.b(rs3Var, qs3Var2);
                        return;
                    case 260:
                        ls3Var.getClass();
                        return;
                    case 261:
                        ls3Var.getClass();
                        return;
                    case 262:
                        ls3Var.f(rs3Var, qs3Var2, i2, qs3Var2);
                        return;
                    case 263:
                        ls3Var.g(rs3Var, qs3Var2, i2);
                        return;
                    case 264:
                        ls3Var.f(rs3Var, qs3Var2, i2, qs3Var);
                        return;
                    case 265:
                        ls3Var.c(qs3Var, qs3Var2);
                        return;
                    case 266:
                        ls3Var.d(qs3Var, qs3Var2, i2);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int k;
        ArrayList arrayList = this.a;
        ff2 ff2Var = this.c;
        ArrayList arrayList2 = ff2Var.h;
        pm4 pm4Var = ff2Var.s;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && ff2Var.g().c.equals(((qs3) obj).c)) {
            ff2Var.p(true);
        }
        int i3 = 0;
        ArrayList arrayList3 = this.b;
        if (i != 262) {
            if (i != 264) {
                switch (i) {
                    case 257:
                        pm4Var.n((qs3) obj);
                        break;
                    case 258:
                        pm4Var.o((qs3) obj);
                        break;
                    case 259:
                        qs3 qs3Var = (qs3) obj;
                        pm4Var.getClass();
                        if (qs3Var.a() != pm4Var && (k = pm4Var.k(qs3Var)) >= 0) {
                            pm4.t((sm4) pm4Var.O.get(k));
                            break;
                        }
                        break;
                }
            } else {
                ef2 ef2Var = (ef2) obj;
                qs3 qs3Var2 = ef2Var.b;
                arrayList3.add(qs3Var2);
                pm4Var.n(qs3Var2);
                if (ef2Var.c) {
                    pm4Var.p(qs3Var2);
                }
            }
        } else {
            ef2 ef2Var2 = (ef2) obj;
            qs3 qs3Var3 = ef2Var2.b;
            if (ef2Var2.c) {
                pm4Var.p(qs3Var3);
            }
            if (ff2Var.v != null && qs3Var3.c()) {
                int size = arrayList3.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList3.get(i4);
                    i4++;
                    pm4Var.o((qs3) obj2);
                }
                arrayList3.clear();
            }
        }
        try {
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    rs3 rs3Var = (rs3) ((WeakReference) arrayList2.get(size2)).get();
                    if (rs3Var == null) {
                        arrayList2.remove(size2);
                    } else {
                        arrayList.addAll(rs3Var.b);
                    }
                } else {
                    int size3 = arrayList.size();
                    while (i3 < size3) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        a((ms3) obj3, i, obj, i2);
                    }
                    arrayList.clear();
                    return;
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
