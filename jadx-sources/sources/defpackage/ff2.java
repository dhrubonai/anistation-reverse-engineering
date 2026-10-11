package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ff2 {
    public static final /* synthetic */ int E = 0;
    public ds3 A;
    public int B;
    public st3 C;
    public final af2 D;
    public final ui3 c;
    public qs3 d;
    public hs3 e;
    public os3 f;
    public final Context g;
    public final vy n;
    public final i75 o;
    public final boolean p;
    public final boolean q;
    public bs3 r;
    public final pm4 s;
    public final ss3 t;
    public us3 u;
    public qs3 v;
    public qs3 w;
    public qs3 x;
    public gs3 y;
    public ds3 z;
    public final bf2 a = new bf2(this);
    public final HashMap b = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final HashMap j = new HashMap();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v8, types: [vy, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ff2(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff2.<init>(android.content.Context):void");
    }

    public final void a(js3 js3Var, boolean z) {
        if (d(js3Var) == null) {
            ps3 ps3Var = new ps3(js3Var, z);
            this.l.add(ps3Var);
            this.a.b(513, ps3Var);
            n(ps3Var, js3Var.D);
            rs3.b();
            js3Var.A = this.o;
            js3Var.g(this.z);
        }
    }

    public final String b(ps3 ps3Var, String str) {
        String str2;
        String flattenToShortString = ((ComponentName) ps3Var.d.y).flattenToShortString();
        boolean z = ps3Var.c;
        if (z) {
            str2 = str;
        } else {
            str2 = flattenToShortString + ":" + str;
        }
        HashMap hashMap = this.k;
        if (!z) {
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((qs3) arrayList.get(i)).c.equals(str2)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                Log.w("AxMediaRouter", qx1.n("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str3 = str2 + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            if (((qs3) arrayList.get(i3)).c.equals(str3)) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 < 0) {
                        hashMap.put(new bi4(flattenToShortString, str), str3);
                        return str3;
                    }
                    i2++;
                }
            }
        }
        hashMap.put(new bi4(flattenToShortString, str), str2);
        return str2;
    }

    public final qs3 c() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qs3 qs3Var = (qs3) obj;
            if (qs3Var != this.v && qs3Var.a() == this.s && qs3Var.h("android.media.intent.category.LIVE_AUDIO") && !qs3Var.h("android.media.intent.category.LIVE_VIDEO") && qs3Var.d()) {
                return qs3Var;
            }
        }
        return this.v;
    }

    public final ps3 d(js3 js3Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ps3 ps3Var = (ps3) obj;
            if (ps3Var.a == js3Var) {
                return ps3Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.j.values().iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        throw qx1.f(it);
    }

    public final hs3 f(qs3 qs3Var) {
        hs3 hs3Var;
        if (qs3Var == this.d && (hs3Var = this.e) != null) {
            return hs3Var;
        }
        boolean z = qs3Var instanceof ns3;
        HashMap hashMap = this.j;
        if (z) {
            rs3.b();
            if (rs3.c().e().contains((ns3) qs3Var)) {
                Iterator it = hashMap.values().iterator();
                if (!it.hasNext()) {
                    return null;
                }
                throw qx1.f(it);
            }
        }
        hs3 hs3Var2 = (hs3) this.b.get(qs3Var.c);
        if (hs3Var2 != null) {
            return hs3Var2;
        }
        Iterator it2 = hashMap.values().iterator();
        if (!it2.hasNext()) {
            return hs3Var2;
        }
        throw qx1.f(it2);
    }

    public final qs3 g() {
        qs3 qs3Var = this.d;
        if (qs3Var != null) {
            return qs3Var;
        }
        ze0.m("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final boolean h() {
        if (this.q) {
            us3 us3Var = this.u;
            if (us3Var == null || us3Var.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        hs3 d;
        if (!this.d.v.isEmpty()) {
            List<qs3> unmodifiableList = Collections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((qs3) it.next()).c);
            }
            HashMap hashMap = this.b;
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    hs3 hs3Var = (hs3) entry.getValue();
                    hs3Var.h(0);
                    hs3Var.d();
                    it2.remove();
                }
            }
            for (qs3 qs3Var : unmodifiableList) {
                if (!hashMap.containsKey(qs3Var.c) && (d = qs3Var.a().d(qs3Var.b, this.d.b)) != null) {
                    d.e();
                    hashMap.put(qs3Var.c, d);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r0 != 2) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.qs3 r6, int r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff2.j(qs3, int, boolean):void");
    }

    public final void k(qs3 qs3Var, int i, boolean z) {
        boolean z2;
        u92 u92Var;
        String str;
        if (this.d == qs3Var) {
            return;
        }
        boolean z3 = false;
        if (qs3Var == this.v) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.w != null && z2) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder("- Stacktrace: [");
            int i2 = 3;
            while (i2 < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                sb.append(stackTraceElement.getClassName());
                sb.append(".");
                sb.append(stackTraceElement.getMethodName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                i2++;
                if (i2 < stackTrace.length) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            qs3 qs3Var2 = this.d;
            if (qs3Var2 != null) {
                Locale locale = Locale.US;
                String str2 = qs3Var2.d;
                rs3.b();
                if (rs3.c().w == qs3Var2) {
                    z3 = true;
                }
                str = str2 + "(BT=" + z3 + ", syncMediaRoute1Provider=" + z + ")";
            } else {
                str = null;
            }
            StringBuilder n = h11.n("Changing selection(", str, ") to default while BT is available: pkgName=");
            n.append(this.g.getPackageName());
            n.append((Object) sb);
            Log.w("AxMediaRouter", n.toString());
        }
        if (this.x != null) {
            this.x = null;
            gs3 gs3Var = this.y;
            if (gs3Var != null) {
                gs3Var.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (h() && (u92Var = qs3Var.a.e) != null && u92Var.c) {
            js3 a = qs3Var.a();
            String str3 = qs3Var.b;
            Bundle bundle = new Bundle();
            bundle.putString("clientPackageName", this.g.getPackageName());
            gs3 a2 = a.a(str3, new is3(bundle));
            if (a2 != null) {
                Executor mainExecutor = this.g.getMainExecutor();
                af2 af2Var = this.D;
                synchronized (a2.a) {
                    try {
                        if (mainExecutor != null) {
                            if (af2Var != null) {
                                a2.b = mainExecutor;
                                a2.c = af2Var;
                                ArrayList arrayList = a2.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    cs3 cs3Var = a2.d;
                                    ArrayList arrayList2 = a2.e;
                                    a2.d = null;
                                    a2.e = null;
                                    a2.b.execute(new es3(a2, af2Var, cs3Var, arrayList2, (byte) 1));
                                }
                            } else {
                                throw new NullPointerException("Listener shouldn't be null");
                            }
                        } else {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.x = qs3Var;
                this.y = a2;
                a2.e();
                return;
            }
            Log.w("AxMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + qs3Var);
        }
        js3 a3 = qs3Var.a();
        String str4 = qs3Var.b;
        Bundle bundle2 = new Bundle();
        bundle2.putString("clientPackageName", this.g.getPackageName());
        hs3 c = a3.c(str4, new is3(bundle2));
        if (c != null) {
            c.e();
        }
        if (this.d == null) {
            this.d = qs3Var;
            this.e = c;
            bf2 bf2Var = this.a;
            bf2Var.getClass();
            Message obtainMessage = bf2Var.obtainMessage(262, new ef2(null, qs3Var, z));
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
            return;
        }
        os3 os3Var = this.f;
        if (os3Var != null) {
            os3Var.a();
            this.f = null;
        }
        os3 os3Var2 = new os3(this, qs3Var, c, i, z, null, null);
        this.f = os3Var2;
        os3Var2.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0104, code lost:
    
        if (r24.A.b() == r2) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, gk2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff2.l():void");
    }

    public final void m() {
        int i;
        MediaRouter2.RoutingController routingController;
        qs3 qs3Var = this.d;
        if (qs3Var != null) {
            int i2 = qs3Var.p;
            vy vyVar = this.n;
            vyVar.a = i2;
            vyVar.b = qs3Var.q;
            vyVar.c = qs3Var.b();
            vyVar.d = this.d.m;
            String str = null;
            if (h() && this.d.a() == this.r) {
                hs3 hs3Var = this.e;
                int i3 = bs3.Q;
                if ((hs3Var instanceof xr3) && (routingController = ((xr3) hs3Var).g) != null) {
                    str = routingController.getId();
                }
                vyVar.e = str;
            } else {
                vyVar.e = null;
            }
            Iterator it = this.m.iterator();
            if (!it.hasNext()) {
                st3 st3Var = this.C;
                if (st3Var != null) {
                    qs3 qs3Var2 = this.d;
                    qs3 qs3Var3 = this.v;
                    if (qs3Var3 != null) {
                        if (qs3Var2 != qs3Var3 && qs3Var2 != this.w) {
                            if (vyVar.c == 1) {
                                i = 2;
                            } else {
                                i = 0;
                            }
                            int i4 = i;
                            int i5 = vyVar.b;
                            int i6 = vyVar.a;
                            String str2 = vyVar.e;
                            st3 st3Var2 = (st3) st3Var.x;
                            if (st3Var2 != null) {
                                df2 df2Var = (df2) st3Var.y;
                                if (df2Var != null && i4 == 0 && i5 == 0) {
                                    df2Var.d = i6;
                                    yw6.a(df2Var.a(), i6);
                                    return;
                                } else {
                                    df2 df2Var2 = new df2(st3Var, i4, i5, i6, str2);
                                    st3Var.y = df2Var2;
                                    ((nt3) st3Var2.x).a.setPlaybackToRemote(df2Var2.a());
                                    return;
                                }
                            }
                            return;
                        }
                        st3Var.g();
                        return;
                    }
                    ze0.m("There is no default route.  The media router has not yet been fully initialized.");
                    return;
                }
                return;
            }
            throw qx1.f(it);
        }
        st3 st3Var3 = this.C;
        if (st3Var3 != null) {
            st3Var3.g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r21 == r19.s.D) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a5 A[LOOP:5: B:77:0x01a3->B:78:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c0 A[LOOP:6: B:81:0x01be->B:82:0x01c0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.ps3 r20, defpackage.u92 r21) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff2.n(ps3, u92):void");
    }

    public final int o(qs3 qs3Var, cs3 cs3Var) {
        int f = qs3Var.f(cs3Var);
        if (f != 0) {
            int i = f & 1;
            bf2 bf2Var = this.a;
            if (i != 0) {
                bf2Var.b(259, qs3Var);
            }
            if ((f & 2) != 0) {
                bf2Var.b(260, qs3Var);
            }
            if ((f & 4) != 0) {
                bf2Var.b(261, qs3Var);
            }
        }
        return f;
    }

    public final void p(boolean z) {
        qs3 qs3Var = this.v;
        if (qs3Var != null && !qs3Var.d()) {
            Log.i("AxMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        qs3 qs3Var2 = this.v;
        pm4 pm4Var = this.s;
        ArrayList arrayList = this.i;
        if (qs3Var2 == null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                qs3 qs3Var3 = (qs3) obj;
                if (qs3Var3.a() == pm4Var && qs3Var3.b.equals("DEFAULT_ROUTE") && qs3Var3.d()) {
                    this.v = qs3Var3;
                    Log.i("AxMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        qs3 qs3Var4 = this.w;
        if (qs3Var4 != null && !qs3Var4.d()) {
            Log.i("AxMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.w);
            this.w = null;
        }
        if (this.w == null) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                qs3 qs3Var5 = (qs3) obj2;
                if (qs3Var5.a() == pm4Var && qs3Var5.h("android.media.intent.category.LIVE_AUDIO") && !qs3Var5.h("android.media.intent.category.LIVE_VIDEO") && qs3Var5.d()) {
                    this.w = qs3Var5;
                    Log.i("AxMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        qs3 qs3Var6 = this.d;
        if (qs3Var6 != null && qs3Var6.g) {
            if (z) {
                i();
                m();
                return;
            }
            return;
        }
        Log.i("AxMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.d);
        k(c(), 0, true);
    }
}
