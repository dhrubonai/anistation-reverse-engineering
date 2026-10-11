package defpackage;

import android.content.Context;
import android.media.MediaRouter2;
import android.media.RouteListingPreference;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rs3 {
    public static ff2 c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public rs3(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        ze0.m("The media router service must only be accessed on the application's main thread.");
    }

    public static ff2 c() {
        ff2 ff2Var = c;
        if (ff2Var != null) {
            return ff2Var;
        }
        ze0.m("getGlobalRouter cannot be called when sGlobal is null");
        return null;
    }

    public static rs3 d(Context context) {
        if (context != null) {
            b();
            ff2 ff2Var = c;
            if (ff2Var == null) {
                ff2Var = new ff2(context.getApplicationContext());
                c = ff2Var;
            }
            ArrayList arrayList = ff2Var.h;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    rs3 rs3Var = (rs3) ((WeakReference) arrayList.get(size)).get();
                    if (rs3Var == null) {
                        arrayList.remove(size);
                    } else if (rs3Var.a == context) {
                        return rs3Var;
                    }
                } else {
                    rs3 rs3Var2 = new rs3(context);
                    arrayList.add(new WeakReference(rs3Var2));
                    return rs3Var2;
                }
            }
        } else {
            ze0.k("context must not be null");
            return null;
        }
    }

    public static void f(v75 v75Var) {
        RouteListingPreference routeListingPreference;
        b();
        bs3 bs3Var = c().r;
        if (bs3Var != null && Build.VERSION.SDK_INT >= 34) {
            MediaRouter2 mediaRouter2 = bs3Var.F;
            if (v75Var != null) {
                routeListingPreference = s3.p(v75Var);
            } else {
                routeListingPreference = null;
            }
            s3.o(mediaRouter2, routeListingPreference);
        }
    }

    public static void g(int i) {
        if (i >= 0 && i <= 3) {
            b();
            ff2 c2 = c();
            qs3 c3 = c2.c();
            if (c2.g() != c3) {
                c2.j(c3, i, true);
                return;
            }
            return;
        }
        ze0.k("Unsupported reason to unselect route");
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, gk2] */
    public final void a(ks3 ks3Var, ls3 ls3Var, int i) {
        ms3 ms3Var;
        if (ls3Var != null) {
            b();
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    if (((ms3) arrayList.get(i2)).b == ls3Var) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 < 0) {
                ms3Var = new ms3(this, ls3Var);
                arrayList.add(ms3Var);
            } else {
                ms3Var = (ms3) arrayList.get(i2);
            }
            boolean z2 = true;
            if (i != ms3Var.d) {
                ms3Var.d = i;
                z = true;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if ((i & 1) != 0) {
                z = true;
            }
            ms3Var.e = elapsedRealtime;
            ks3 ks3Var2 = ms3Var.c;
            ks3Var2.a();
            ks3Var.a();
            if (!ks3Var2.b.containsAll(ks3Var.b)) {
                ks3 ks3Var3 = ms3Var.c;
                ?? obj = new Object();
                if (ks3Var3 != null) {
                    ks3Var3.a();
                    if (!ks3Var3.b.isEmpty()) {
                        obj.a = new ArrayList(ks3Var3.b);
                    }
                    obj.g(ks3Var.c());
                    ms3Var.c = obj.j();
                } else {
                    ze0.k("selector must not be null");
                    return;
                }
            } else {
                z2 = z;
            }
            if (z2) {
                c().l();
                return;
            }
            return;
        }
        ze0.k("callback must not be null");
    }

    public final void e(ls3 ls3Var) {
        if (ls3Var != null) {
            b();
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((ms3) arrayList.get(i)).b == ls3Var) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                arrayList.remove(i);
                c().l();
                return;
            }
            return;
        }
        ze0.k("callback must not be null");
    }
}
