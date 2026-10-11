package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q65 {
    public final im0 a;
    public final Context b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public Executor f;
    public Executor g;
    public hh0 h;
    public boolean i;
    public final a94 j;
    public final LinkedHashSet k;
    public final LinkedHashSet l;
    public final ArrayList m;
    public boolean n;
    public boolean o;
    public boolean p;

    public q65(Context context, Class cls, String str) {
        context.getClass();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.j = new a94();
        this.k = new LinkedHashSet();
        this.l = new LinkedHashSet();
        this.m = new ArrayList();
        this.n = true;
        this.a = z05.a(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(oy3... oy3VarArr) {
        for (oy3 oy3Var : oy3VarArr) {
            Integer valueOf = Integer.valueOf(oy3Var.startVersion);
            LinkedHashSet linkedHashSet = this.l;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(oy3Var.endVersion));
        }
        for (oy3 oy3Var2 : (oy3[]) Arrays.copyOf(oy3VarArr, oy3VarArr.length)) {
            this.j.a(oy3Var2);
        }
    }

    public final v65 b() {
        ActivityManager activityManager;
        s65 s65Var;
        String str;
        String str2;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            qr qrVar = rr.c;
            this.g = qrVar;
            this.f = qrVar;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet linkedHashSet = this.l;
        boolean isEmpty = linkedHashSet.isEmpty();
        LinkedHashSet linkedHashSet2 = this.k;
        if (!isEmpty) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(intValue))) {
                    ze0.e(qx1.h(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        z26 z26Var = this.h;
        if (z26Var == null) {
            z26Var = new i18((byte) 20);
        }
        z26 z26Var2 = z26Var;
        boolean z = this.i;
        Context context = this.b;
        context.getClass();
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null && !activityManager.isLowRamDevice()) {
            s65Var = s65.y;
        } else {
            s65Var = s65.x;
        }
        s65 s65Var2 = s65Var;
        Executor executor2 = this.f;
        if (executor2 != null) {
            Executor executor3 = this.g;
            if (executor3 != null) {
                r51 r51Var = new r51(context, this.c, z26Var2, this.j, this.d, z, s65Var2, executor2, executor3, null, this.n, this.o, linkedHashSet2, null, null, null, this.e, this.m, this.p, null, null);
                Class M = t80.M(this.a);
                Package r0 = M.getPackage();
                if (r0 == null || (str = r0.getName()) == null) {
                    str = "";
                }
                String canonicalName = M.getCanonicalName();
                canonicalName.getClass();
                if (str.length() != 0) {
                    canonicalName = canonicalName.substring(str.length() + 1);
                }
                String replace = canonicalName.replace('.', '_');
                replace.getClass();
                String concat = replace.concat("_Impl");
                try {
                    if (str.length() == 0) {
                        str2 = concat;
                    } else {
                        str2 = str + '.' + concat;
                    }
                    Class<?> cls = Class.forName(str2, true, M.getClassLoader());
                    cls.getClass();
                    v65 v65Var = (v65) cls.getDeclaredConstructor(null).newInstance(null);
                    v65Var.init(r51Var);
                    return v65Var;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException("Cannot find implementation for " + M.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
                } catch (IllegalAccessException e2) {
                    p65.j("Cannot access the constructor ", M.getCanonicalName(), e2);
                    return null;
                } catch (InstantiationException e3) {
                    p65.j("Failed to create an instance of ", M.getCanonicalName(), e3);
                    return null;
                }
            }
            ze0.k("Required value was null.");
            return null;
        }
        ze0.k("Required value was null.");
        return null;
    }
}
