package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import androidx.lifecycle.b0;
import f9.x;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o1.d0;
import r6.h0;
import x3.q;

/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: y, reason: collision with root package name */
    public static volatile b f2168y;

    /* renamed from: z, reason: collision with root package name */
    public static volatile boolean f2169z;

    /* renamed from: a, reason: collision with root package name */
    public final y3.d f2170a;

    /* renamed from: b, reason: collision with root package name */
    public final z3.g f2171b;

    /* renamed from: c, reason: collision with root package name */
    public final f f2172c;

    /* renamed from: d, reason: collision with root package name */
    public final y3.h f2173d;

    /* renamed from: e, reason: collision with root package name */
    public final i4.n f2174e;

    /* renamed from: f, reason: collision with root package name */
    public final x f2175f;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f2176x = new ArrayList();

    public b(Context context, q qVar, z3.g gVar, y3.d dVar, y3.h hVar, i4.n nVar, x xVar, int i10, k3.d dVar2, n.e eVar, List list, ArrayList arrayList, h0 h0Var, b0 b0Var) {
        this.f2170a = dVar;
        this.f2173d = hVar;
        this.f2171b = gVar;
        this.f2174e = nVar;
        this.f2175f = xVar;
        this.f2172c = new f(context, hVar, new d0(this, arrayList, h0Var), new x(22), dVar2, eVar, list, qVar, b0Var, i10);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f2168y == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                if (f2168y == null) {
                    if (!f2169z) {
                        f2169z = true;
                        try {
                            b(context, generatedAppGlideModule);
                            f2169z = false;
                        } catch (Throwable th) {
                            f2169z = false;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                }
            }
        }
        return f2168y;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r24, com.bumptech.glide.GeneratedAppGlideModule r25) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.b(android.content.Context, com.bumptech.glide.GeneratedAppGlideModule):void");
    }

    public static o d(Context context) {
        if (context != null) {
            return a(context).f2174e.b(context);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public final void c(o oVar) {
        synchronized (this.f2176x) {
            if (this.f2176x.contains(oVar)) {
                this.f2176x.remove(oVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        p4.m.a();
        this.f2171b.e(0L);
        this.f2170a.s();
        this.f2173d.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        p4.m.a();
        synchronized (this.f2176x) {
            Iterator it = this.f2176x.iterator();
            while (it.hasNext()) {
                ((o) it.next()).getClass();
            }
        }
        this.f2171b.f(i10);
        this.f2170a.p(i10);
        this.f2173d.i(i10);
    }
}
