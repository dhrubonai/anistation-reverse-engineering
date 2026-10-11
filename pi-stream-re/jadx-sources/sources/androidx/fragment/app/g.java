package androidx.fragment.app;

import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import r6.d2;

/* loaded from: classes.dex */
public final class g implements c0.c, ViewWithFragmentComponentBuilder {

    /* renamed from: a, reason: collision with root package name */
    public Object f885a;

    /* renamed from: b, reason: collision with root package name */
    public Object f886b;

    /* renamed from: c, reason: collision with root package name */
    public Object f887c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f888d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f889e;

    public g() {
        this.f885a = new Object();
    }

    public final o1.i a(c1.c0 c0Var) {
        String uri;
        byte[] bArr;
        h1.g gVar = (h1.g) this.f888d;
        h1.g gVar2 = gVar;
        if (gVar == null) {
            h1.o oVar = new h1.o();
            oVar.f4621b = (String) this.f889e;
            gVar2 = oVar;
        }
        Uri uri2 = c0Var.f1634b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        o1.d0 d0Var = new o1.d0(uri, c0Var.f1638f, gVar2);
        d2 it = c0Var.f1635c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((Map) d0Var.f8140d)) {
                ((Map) d0Var.f8140d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = c1.j.f1723a;
        androidx.lifecycle.q0 q0Var = new androidx.lifecycle.q0(0);
        UUID uuid2 = c0Var.f1633a;
        k1.i iVar = o1.c0.f8109d;
        uuid2.getClass();
        boolean z9 = c0Var.f1636d;
        boolean z10 = c0Var.f1637e;
        int[] e02 = com.bumptech.glide.d.e0(c0Var.f1639g);
        for (int i10 : e02) {
            boolean z11 = true;
            if (i10 != 2 && i10 != 1) {
                z11 = false;
            }
            w7.b.g(z11);
        }
        o1.i iVar2 = new o1.i(uuid2, iVar, d0Var, hashMap, z9, (int[]) e02.clone(), z10, q0Var, 300000L);
        byte[] bArr2 = c0Var.f1640h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        w7.b.u(iVar2.C.isEmpty());
        iVar2.L = 0;
        iVar2.M = bArr;
        return iVar2;
    }

    public final o1.q b(c1.k0 k0Var) {
        o1.q qVar;
        k0Var.f1769b.getClass();
        c1.c0 c0Var = k0Var.f1769b.f1684c;
        if (c0Var != null && f1.b0.f3799a >= 18) {
            synchronized (this.f885a) {
                if (!f1.b0.a(c0Var, (c1.c0) this.f886b)) {
                    this.f886b = c0Var;
                    this.f887c = a(c0Var);
                }
                qVar = (o1.q) this.f887c;
                qVar.getClass();
            }
            return qVar;
        }
        return o1.q.f8166m;
    }

    @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
    public final ViewWithFragmentComponent build() {
        r6.h0.m((View) this.f885a, View.class);
        return new x7.e();
    }

    @Override // c0.c
    public final void p() {
        ((View) this.f885a).clearAnimation();
        ((ViewGroup) this.f886b).endViewTransition((View) this.f885a);
        ((j) this.f887c).b();
        if (s0.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((m1) this.f888d) + " has been cancelled.");
        }
    }

    @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
    public final ViewWithFragmentComponentBuilder view(View view) {
        view.getClass();
        this.f885a = view;
        return this;
    }

    public g(x7.g gVar, x7.c cVar, x7.a aVar, x7.d dVar) {
        this.f886b = gVar;
        this.f887c = cVar;
        this.f888d = aVar;
        this.f889e = dVar;
    }

    public g(View view, ViewGroup viewGroup, j jVar, l lVar, m1 m1Var) {
        this.f889e = lVar;
        this.f885a = view;
        this.f886b = viewGroup;
        this.f887c = jVar;
        this.f888d = m1Var;
    }
}
