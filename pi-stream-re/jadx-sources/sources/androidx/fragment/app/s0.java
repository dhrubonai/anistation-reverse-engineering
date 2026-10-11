package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract class s0 {
    public c.e A;
    public c.e B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public w0 L;
    public final e M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f969b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f971d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f972e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.activity.r f974g;

    /* renamed from: l, reason: collision with root package name */
    public final h0 f979l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f980m;

    /* renamed from: n, reason: collision with root package name */
    public final i0 f981n;
    public final i0 o;

    /* renamed from: p, reason: collision with root package name */
    public final i0 f982p;

    /* renamed from: q, reason: collision with root package name */
    public final i0 f983q;

    /* renamed from: r, reason: collision with root package name */
    public final l0 f984r;

    /* renamed from: s, reason: collision with root package name */
    public int f985s;

    /* renamed from: t, reason: collision with root package name */
    public a0 f986t;

    /* renamed from: u, reason: collision with root package name */
    public com.bumptech.glide.c f987u;

    /* renamed from: v, reason: collision with root package name */
    public y f988v;

    /* renamed from: w, reason: collision with root package name */
    public y f989w;

    /* renamed from: x, reason: collision with root package name */
    public final m0 f990x;

    /* renamed from: y, reason: collision with root package name */
    public final j0 f991y;

    /* renamed from: z, reason: collision with root package name */
    public c.e f992z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f968a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final i.g f970c = new i.g(4);

    /* renamed from: f, reason: collision with root package name */
    public final g0 f973f = new g0(this);

    /* renamed from: h, reason: collision with root package name */
    public final k0 f975h = new k0(this);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f976i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f977j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f978k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.i0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.i0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.i0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.i0] */
    public s0() {
        Collections.synchronizedMap(new HashMap());
        this.f979l = new h0(this);
        this.f980m = new CopyOnWriteArrayList();
        final int i10 = 0;
        this.f981n = new f0.a(this) { // from class: androidx.fragment.app.i0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s0 f905b;

            {
                this.f905b = this;
            }

            @Override // f0.a
            public final void accept(Object obj) {
                int i11 = i10;
                s0 s0Var = this.f905b;
                switch (i11) {
                    case 0:
                        s0Var.h((Configuration) obj);
                        return;
                    case 1:
                        s0Var.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            s0Var.l();
                            return;
                        }
                        return;
                    case 2:
                        s0Var.getClass();
                        s0Var.m(((w.o) obj).f10713a);
                        return;
                    default:
                        s0Var.getClass();
                        s0Var.r(((w.x) obj).f10745a);
                        return;
                }
            }
        };
        final int i11 = 1;
        this.o = new f0.a(this) { // from class: androidx.fragment.app.i0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s0 f905b;

            {
                this.f905b = this;
            }

            @Override // f0.a
            public final void accept(Object obj) {
                int i112 = i11;
                s0 s0Var = this.f905b;
                switch (i112) {
                    case 0:
                        s0Var.h((Configuration) obj);
                        return;
                    case 1:
                        s0Var.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            s0Var.l();
                            return;
                        }
                        return;
                    case 2:
                        s0Var.getClass();
                        s0Var.m(((w.o) obj).f10713a);
                        return;
                    default:
                        s0Var.getClass();
                        s0Var.r(((w.x) obj).f10745a);
                        return;
                }
            }
        };
        final int i12 = 2;
        this.f982p = new f0.a(this) { // from class: androidx.fragment.app.i0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s0 f905b;

            {
                this.f905b = this;
            }

            @Override // f0.a
            public final void accept(Object obj) {
                int i112 = i12;
                s0 s0Var = this.f905b;
                switch (i112) {
                    case 0:
                        s0Var.h((Configuration) obj);
                        return;
                    case 1:
                        s0Var.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            s0Var.l();
                            return;
                        }
                        return;
                    case 2:
                        s0Var.getClass();
                        s0Var.m(((w.o) obj).f10713a);
                        return;
                    default:
                        s0Var.getClass();
                        s0Var.r(((w.x) obj).f10745a);
                        return;
                }
            }
        };
        final int i13 = 3;
        this.f983q = new f0.a(this) { // from class: androidx.fragment.app.i0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s0 f905b;

            {
                this.f905b = this;
            }

            @Override // f0.a
            public final void accept(Object obj) {
                int i112 = i13;
                s0 s0Var = this.f905b;
                switch (i112) {
                    case 0:
                        s0Var.h((Configuration) obj);
                        return;
                    case 1:
                        s0Var.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            s0Var.l();
                            return;
                        }
                        return;
                    case 2:
                        s0Var.getClass();
                        s0Var.m(((w.o) obj).f10713a);
                        return;
                    default:
                        s0Var.getClass();
                        s0Var.r(((w.x) obj).f10745a);
                        return;
                }
            }
        };
        this.f984r = new l0(this);
        this.f985s = -1;
        this.f990x = new m0(this);
        this.f991y = new j0(this, i11);
        this.C = new ArrayDeque();
        this.M = new e(this, i12);
    }

    public static boolean H(int i10) {
        if (Log.isLoggable("FragmentManager", i10)) {
            return true;
        }
        return false;
    }

    public static boolean I(y yVar) {
        Iterator it = yVar.K.f970c.z().iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            y yVar2 = (y) it.next();
            if (yVar2 != null) {
                z9 = I(yVar2);
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(y yVar) {
        if (yVar == null) {
            return true;
        }
        if (yVar.S && (yVar.I == null || J(yVar.L))) {
            return true;
        }
        return false;
    }

    public static boolean K(y yVar) {
        if (yVar == null) {
            return true;
        }
        s0 s0Var = yVar.I;
        if (yVar.equals(s0Var.f989w) && K(s0Var.f988v)) {
            return true;
        }
        return false;
    }

    public static void Z(y yVar) {
        if (H(2)) {
            Log.v("FragmentManager", "show: " + yVar);
        }
        if (yVar.P) {
            yVar.P = false;
            yVar.Z = !yVar.Z;
        }
    }

    public final y A(String str) {
        return this.f970c.s(str);
    }

    public final y B(int i10) {
        i.g gVar = this.f970c;
        int size = ((ArrayList) gVar.f5198d).size();
        while (true) {
            size--;
            if (size >= 0) {
                y yVar = (y) ((ArrayList) gVar.f5198d).get(size);
                if (yVar != null && yVar.M == i10) {
                    return yVar;
                }
            } else {
                for (z0 z0Var : ((HashMap) gVar.f5196b).values()) {
                    if (z0Var != null) {
                        y yVar2 = z0Var.f1062c;
                        if (yVar2.M == i10) {
                            return yVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final y C(String str) {
        i.g gVar = this.f970c;
        int size = ((ArrayList) gVar.f5198d).size();
        while (true) {
            size--;
            if (size >= 0) {
                y yVar = (y) ((ArrayList) gVar.f5198d).get(size);
                if (yVar != null && str.equals(yVar.O)) {
                    return yVar;
                }
            } else {
                for (z0 z0Var : ((HashMap) gVar.f5196b).values()) {
                    if (z0Var != null) {
                        y yVar2 = z0Var.f1062c;
                        if (str.equals(yVar2.O)) {
                            return yVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final ViewGroup D(y yVar) {
        ViewGroup viewGroup = yVar.U;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (yVar.N > 0 && this.f987u.Q()) {
            View P = this.f987u.P(yVar.N);
            if (P instanceof ViewGroup) {
                return (ViewGroup) P;
            }
        }
        return null;
    }

    public final m0 E() {
        y yVar = this.f988v;
        if (yVar != null) {
            return yVar.I.E();
        }
        return this.f990x;
    }

    public final j0 F() {
        y yVar = this.f988v;
        if (yVar != null) {
            return yVar.I.F();
        }
        return this.f991y;
    }

    public final void G(y yVar) {
        if (H(2)) {
            Log.v("FragmentManager", "hide: " + yVar);
        }
        if (!yVar.P) {
            yVar.P = true;
            yVar.Z = true ^ yVar.Z;
            Y(yVar);
        }
    }

    public final void L(int i10, boolean z9) {
        Object obj;
        a0 a0Var;
        if (this.f986t == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z9 && i10 == this.f985s) {
            return;
        }
        this.f985s = i10;
        i.g gVar = this.f970c;
        Iterator it = ((ArrayList) gVar.f5198d).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            obj = gVar.f5196b;
            if (!hasNext) {
                break;
            }
            z0 z0Var = (z0) ((HashMap) obj).get(((y) it.next()).f1037e);
            if (z0Var != null) {
                z0Var.k();
            }
        }
        Iterator it2 = ((HashMap) obj).values().iterator();
        while (true) {
            boolean z10 = false;
            if (!it2.hasNext()) {
                break;
            }
            z0 z0Var2 = (z0) it2.next();
            if (z0Var2 != null) {
                z0Var2.k();
                y yVar = z0Var2.f1062c;
                if (yVar.C && !yVar.s()) {
                    z10 = true;
                }
                if (z10) {
                    gVar.H(z0Var2);
                }
            }
        }
        a0();
        if (this.D && (a0Var = this.f986t) != null && this.f985s == 7) {
            a0Var.G.invalidateOptionsMenu();
            this.D = false;
        }
    }

    public final void M() {
        if (this.f986t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.f1027f = false;
        for (y yVar : this.f970c.C()) {
            if (yVar != null) {
                yVar.K.M();
            }
        }
    }

    public final boolean N() {
        return O(-1, 0);
    }

    public final boolean O(int i10, int i11) {
        x(false);
        w(true);
        y yVar = this.f989w;
        if (yVar != null && i10 < 0 && yVar.j().N()) {
            return true;
        }
        boolean P = P(this.I, this.J, i10, i11);
        if (P) {
            this.f969b = true;
            try {
                R(this.I, this.J);
            } finally {
                d();
            }
        }
        b0();
        if (this.H) {
            this.H = false;
            a0();
        }
        this.f970c.m();
        return P;
    }

    public final boolean P(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z9;
        if ((i11 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList3 = this.f971d;
        int i12 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i10 < 0) {
                i12 = z9 ? 0 : (-1) + this.f971d.size();
            } else {
                int size = this.f971d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.f971d.get(size);
                    if (i10 >= 0 && i10 == aVar.f828r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z9) {
                        while (size > 0) {
                            int i13 = size - 1;
                            a aVar2 = (a) this.f971d.get(i13);
                            if (i10 < 0 || i10 != aVar2.f828r) {
                                break;
                            }
                            size = i13;
                        }
                    } else if (size != this.f971d.size() - 1) {
                        size++;
                    }
                }
                i12 = size;
            }
        }
        if (i12 < 0) {
            return false;
        }
        for (int size2 = this.f971d.size() - 1; size2 >= i12; size2--) {
            arrayList.add((a) this.f971d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Q(y yVar) {
        if (H(2)) {
            Log.v("FragmentManager", "remove: " + yVar + " nesting=" + yVar.H);
        }
        boolean z9 = !yVar.s();
        if (!yVar.Q || z9) {
            i.g gVar = this.f970c;
            synchronized (((ArrayList) gVar.f5198d)) {
                ((ArrayList) gVar.f5198d).remove(yVar);
            }
            yVar.B = false;
            if (I(yVar)) {
                this.D = true;
            }
            yVar.C = true;
            Y(yVar);
        }
    }

    public final void R(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                if (!((a) arrayList.get(i10)).o) {
                    if (i11 != i10) {
                        z(arrayList, arrayList2, i11, i10);
                    }
                    i11 = i10 + 1;
                    if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                        while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((a) arrayList.get(i11)).o) {
                            i11++;
                        }
                    }
                    z(arrayList, arrayList2, i10, i11);
                    i10 = i11 - 1;
                }
                i10++;
            }
            if (i11 != size) {
                z(arrayList, arrayList2, i11, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void S(Parcelable parcelable) {
        h0 h0Var;
        int i10;
        boolean z9;
        z0 z0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f986t.D.getClassLoader());
                this.f978k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f986t.D.getClassLoader());
                arrayList.add((y0) bundle.getParcelable("state"));
            }
        }
        i.g gVar = this.f970c;
        ((HashMap) gVar.f5197c).clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            ((HashMap) gVar.f5197c).put(y0Var.f1050b, y0Var);
        }
        u0 u0Var = (u0) bundle3.getParcelable("state");
        if (u0Var == null) {
            return;
        }
        Object obj = gVar.f5196b;
        ((HashMap) obj).clear();
        Iterator it2 = u0Var.f999a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            h0Var = this.f979l;
            if (!hasNext) {
                break;
            }
            y0 R = gVar.R((String) it2.next(), null);
            if (R != null) {
                y yVar = (y) this.L.f1022a.get(R.f1050b);
                if (yVar != null) {
                    if (H(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + yVar);
                    }
                    z0Var = new z0(h0Var, gVar, yVar, R);
                } else {
                    z0Var = new z0(this.f979l, this.f970c, this.f986t.D.getClassLoader(), E(), R);
                }
                y yVar2 = z0Var.f1062c;
                yVar2.I = this;
                if (H(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + yVar2.f1037e + "): " + yVar2);
                }
                z0Var.m(this.f986t.D.getClassLoader());
                gVar.G(z0Var);
                z0Var.f1064e = this.f985s;
            }
        }
        w0 w0Var = this.L;
        w0Var.getClass();
        Iterator it3 = new ArrayList(w0Var.f1022a.values()).iterator();
        while (true) {
            i10 = 0;
            if (!it3.hasNext()) {
                break;
            }
            y yVar3 = (y) it3.next();
            if (((HashMap) obj).get(yVar3.f1037e) != null) {
                i10 = 1;
            }
            if (i10 == 0) {
                if (H(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + yVar3 + " that was not found in the set of active Fragments " + u0Var.f999a);
                }
                this.L.d(yVar3);
                yVar3.I = this;
                z0 z0Var2 = new z0(h0Var, gVar, yVar3);
                z0Var2.f1064e = 1;
                z0Var2.k();
                yVar3.C = true;
                z0Var2.k();
            }
        }
        ArrayList<String> arrayList2 = u0Var.f1000b;
        ((ArrayList) gVar.f5198d).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                y s9 = gVar.s(str3);
                if (s9 != null) {
                    if (H(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + s9);
                    }
                    gVar.h(s9);
                } else {
                    throw new IllegalStateException(r.f.e("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (u0Var.f1001c != null) {
            this.f971d = new ArrayList(u0Var.f1001c.length);
            int i11 = 0;
            while (true) {
                b[] bVarArr = u0Var.f1001c;
                if (i11 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i11];
                bVar.getClass();
                a aVar = new a(this);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = bVar.f838a;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    a1 a1Var = new a1();
                    int i14 = i12 + 1;
                    a1Var.f829a = iArr[i12];
                    if (H(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i13 + " base fragment #" + iArr[i14]);
                    }
                    a1Var.f836h = androidx.lifecycle.o.values()[bVar.f840c[i13]];
                    a1Var.f837i = androidx.lifecycle.o.values()[bVar.f841d[i13]];
                    int i15 = i14 + 1;
                    if (iArr[i14] != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a1Var.f831c = z9;
                    int i16 = i15 + 1;
                    int i17 = iArr[i15];
                    a1Var.f832d = i17;
                    int i18 = i16 + 1;
                    int i19 = iArr[i16];
                    a1Var.f833e = i19;
                    int i20 = i18 + 1;
                    int i21 = iArr[i18];
                    a1Var.f834f = i21;
                    int i22 = iArr[i20];
                    a1Var.f835g = i22;
                    aVar.f813b = i17;
                    aVar.f814c = i19;
                    aVar.f815d = i21;
                    aVar.f816e = i22;
                    aVar.b(a1Var);
                    i13++;
                    i12 = i20 + 1;
                }
                aVar.f817f = bVar.f842e;
                aVar.f819h = bVar.f843f;
                aVar.f818g = true;
                aVar.f820i = bVar.f845y;
                aVar.f821j = bVar.f846z;
                aVar.f822k = bVar.A;
                aVar.f823l = bVar.B;
                aVar.f824m = bVar.C;
                aVar.f825n = bVar.D;
                aVar.o = bVar.E;
                aVar.f828r = bVar.f844x;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList3 = bVar.f839b;
                    if (i23 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i23);
                    if (str4 != null) {
                        ((a1) aVar.f812a.get(i23)).f830b = A(str4);
                    }
                    i23++;
                }
                aVar.c(1);
                if (H(2)) {
                    StringBuilder u9 = a3.g.u("restoreAllState: back stack #", i11, " (index ");
                    u9.append(aVar.f828r);
                    u9.append("): ");
                    u9.append(aVar);
                    Log.v("FragmentManager", u9.toString());
                    PrintWriter printWriter = new PrintWriter(new k1());
                    aVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f971d.add(aVar);
                i11++;
            }
        } else {
            this.f971d = null;
        }
        this.f976i.set(u0Var.f1002d);
        String str5 = u0Var.f1003e;
        if (str5 != null) {
            y A = A(str5);
            this.f989w = A;
            q(A);
        }
        ArrayList arrayList4 = u0Var.f1004f;
        if (arrayList4 != null) {
            while (i10 < arrayList4.size()) {
                this.f977j.put((String) arrayList4.get(i10), (c) u0Var.f1005x.get(i10));
                i10++;
            }
        }
        this.C = new ArrayDeque(u0Var.f1006y);
    }

    public final Bundle T() {
        int i10;
        b[] bVarArr;
        ArrayList arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            n1 n1Var = (n1) it.next();
            if (n1Var.f946e) {
                if (H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                n1Var.f946e = false;
                n1Var.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((n1) it2.next()).e();
        }
        x(true);
        this.E = true;
        this.L.f1027f = true;
        i.g gVar = this.f970c;
        gVar.getClass();
        HashMap hashMap = (HashMap) gVar.f5196b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (z0 z0Var : hashMap.values()) {
            if (z0Var != null) {
                z0Var.o();
                y yVar = z0Var.f1062c;
                arrayList2.add(yVar.f1037e);
                if (H(2)) {
                    Log.v("FragmentManager", "Saved state of " + yVar + ": " + yVar.f1031b);
                }
            }
        }
        i.g gVar2 = this.f970c;
        gVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) gVar2.f5197c).values());
        if (arrayList3.isEmpty()) {
            if (H(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            i.g gVar3 = this.f970c;
            synchronized (((ArrayList) gVar3.f5198d)) {
                bVarArr = null;
                if (((ArrayList) gVar3.f5198d).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) gVar3.f5198d).size());
                    Iterator it3 = ((ArrayList) gVar3.f5198d).iterator();
                    while (it3.hasNext()) {
                        y yVar2 = (y) it3.next();
                        arrayList.add(yVar2.f1037e);
                        if (H(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + yVar2.f1037e + "): " + yVar2);
                        }
                    }
                }
            }
            ArrayList arrayList4 = this.f971d;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                bVarArr = new b[size];
                for (i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new b((a) this.f971d.get(i10));
                    if (H(2)) {
                        StringBuilder u9 = a3.g.u("saveAllState: adding back stack #", i10, ": ");
                        u9.append(this.f971d.get(i10));
                        Log.v("FragmentManager", u9.toString());
                    }
                }
            }
            u0 u0Var = new u0();
            u0Var.f999a = arrayList2;
            u0Var.f1000b = arrayList;
            u0Var.f1001c = bVarArr;
            u0Var.f1002d = this.f976i.get();
            y yVar3 = this.f989w;
            if (yVar3 != null) {
                u0Var.f1003e = yVar3.f1037e;
            }
            u0Var.f1004f.addAll(this.f977j.keySet());
            u0Var.f1005x.addAll(this.f977j.values());
            u0Var.f1006y = new ArrayList(this.C);
            bundle.putParcelable("state", u0Var);
            for (String str : this.f978k.keySet()) {
                bundle.putBundle(r.f.d("result_", str), (Bundle) this.f978k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                y0 y0Var = (y0) it4.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", y0Var);
                bundle.putBundle("fragment_" + y0Var.f1050b, bundle2);
            }
        }
        return bundle;
    }

    public final void U() {
        synchronized (this.f968a) {
            boolean z9 = true;
            if (this.f968a.size() != 1) {
                z9 = false;
            }
            if (z9) {
                this.f986t.E.removeCallbacks(this.M);
                this.f986t.E.post(this.M);
                b0();
            }
        }
    }

    public final void V(y yVar, boolean z9) {
        ViewGroup D = D(yVar);
        if (D != null && (D instanceof FragmentContainerView)) {
            ((FragmentContainerView) D).setDrawDisappearingViewsLast(!z9);
        }
    }

    public final void W(y yVar, androidx.lifecycle.o oVar) {
        if (yVar.equals(A(yVar.f1037e)) && (yVar.J == null || yVar.I == this)) {
            yVar.f1034c0 = oVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + yVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void X(y yVar) {
        if (yVar != null && (!yVar.equals(A(yVar.f1037e)) || (yVar.J != null && yVar.I != this))) {
            throw new IllegalArgumentException("Fragment " + yVar + " is not an active fragment of FragmentManager " + this);
        }
        y yVar2 = this.f989w;
        this.f989w = yVar;
        q(yVar2);
        q(this.f989w);
    }

    public final void Y(y yVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup D = D(yVar);
        if (D != null) {
            v vVar = yVar.Y;
            boolean z9 = false;
            if (vVar == null) {
                i10 = 0;
            } else {
                i10 = vVar.f1008b;
            }
            if (vVar == null) {
                i11 = 0;
            } else {
                i11 = vVar.f1009c;
            }
            int i14 = i11 + i10;
            if (vVar == null) {
                i12 = 0;
            } else {
                i12 = vVar.f1010d;
            }
            int i15 = i12 + i14;
            if (vVar == null) {
                i13 = 0;
            } else {
                i13 = vVar.f1011e;
            }
            if (i13 + i15 > 0) {
                if (D.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    D.setTag(R.id.visible_removing_fragment_view_tag, yVar);
                }
                y yVar2 = (y) D.getTag(R.id.visible_removing_fragment_view_tag);
                v vVar2 = yVar.Y;
                if (vVar2 != null) {
                    z9 = vVar2.f1007a;
                }
                if (yVar2.Y != null) {
                    yVar2.h().f1007a = z9;
                }
            }
        }
    }

    public final z0 a(y yVar) {
        String str = yVar.f1032b0;
        if (str != null) {
            v0.c.d(yVar, str);
        }
        if (H(2)) {
            Log.v("FragmentManager", "add: " + yVar);
        }
        z0 f10 = f(yVar);
        yVar.I = this;
        i.g gVar = this.f970c;
        gVar.G(f10);
        if (!yVar.Q) {
            gVar.h(yVar);
            yVar.C = false;
            if (yVar.V == null) {
                yVar.Z = false;
            }
            if (I(yVar)) {
                this.D = true;
            }
        }
        return f10;
    }

    public final void a0() {
        Iterator it = this.f970c.v().iterator();
        while (it.hasNext()) {
            z0 z0Var = (z0) it.next();
            y yVar = z0Var.f1062c;
            if (yVar.W) {
                if (this.f969b) {
                    this.H = true;
                } else {
                    yVar.W = false;
                    z0Var.k();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(a0 a0Var, com.bumptech.glide.c cVar, y yVar) {
        boolean z9;
        String str;
        a0 a0Var2;
        if (this.f986t == null) {
            this.f986t = a0Var;
            this.f987u = cVar;
            this.f988v = yVar;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f980m;
            if (yVar != 0) {
                copyOnWriteArrayList.add(new n0(yVar));
            } else if (a0Var instanceof x0) {
                copyOnWriteArrayList.add(a0Var);
            }
            if (this.f988v != null) {
                b0();
            }
            if (a0Var instanceof androidx.activity.s) {
                androidx.activity.r t02 = a0Var.t0();
                this.f974g = t02;
                if (yVar != 0) {
                    a0Var2 = yVar;
                } else {
                    a0Var2 = a0Var;
                }
                t02.getClass();
                androidx.lifecycle.p lifecycle = a0Var2.getLifecycle();
                if (((androidx.lifecycle.w) lifecycle).f1156c != androidx.lifecycle.o.DESTROYED) {
                    k0 k0Var = this.f975h;
                    k0Var.f920b.add(new androidx.activity.p(t02, lifecycle, k0Var));
                    if (com.bumptech.glide.d.G()) {
                        t02.b();
                        k0Var.f921c = t02.f286c;
                    }
                }
            }
            int i10 = 0;
            if (yVar != 0) {
                w0 w0Var = yVar.I.L;
                HashMap hashMap = w0Var.f1023b;
                w0 w0Var2 = (w0) hashMap.get(yVar.f1037e);
                if (w0Var2 == null) {
                    w0Var2 = new w0(w0Var.f1025d);
                    hashMap.put(yVar.f1037e, w0Var2);
                }
                this.L = w0Var2;
            } else if (a0Var instanceof androidx.lifecycle.c1) {
                this.L = (w0) new androidx.lifecycle.a1(a0Var.getViewModelStore(), w0.f1021g).a(w0.class);
            } else {
                this.L = new w0(false);
            }
            w0 w0Var3 = this.L;
            if (!this.E && !this.F) {
                z9 = false;
            } else {
                z9 = true;
            }
            w0Var3.f1027f = z9;
            this.f970c.f5199e = w0Var3;
            a0 a0Var3 = this.f986t;
            int i11 = 2;
            if ((a0Var3 instanceof n3.g) && yVar == 0) {
                n3.e savedStateRegistry = a0Var3.getSavedStateRegistry();
                savedStateRegistry.c("android:support:fragments", new androidx.activity.c(this, 2));
                Bundle a10 = savedStateRegistry.a("android:support:fragments");
                if (a10 != null) {
                    S(a10);
                }
            }
            a0 a0Var4 = this.f986t;
            if (a0Var4 instanceof c.i) {
                c.h activityResultRegistry = a0Var4.G.getActivityResultRegistry();
                if (yVar != 0) {
                    str = a3.g.t(new StringBuilder(), yVar.f1037e, ":");
                } else {
                    str = "";
                }
                String d10 = r.f.d("FragmentManager:", str);
                this.f992z = activityResultRegistry.d(a3.g.s(d10, "StartActivityForResult"), new d.c(), new j0(this, i11));
                this.A = activityResultRegistry.d(a3.g.s(d10, "StartIntentSenderForResult"), new o0(), new j0(this, 3));
                this.B = activityResultRegistry.d(a3.g.s(d10, "RequestPermissions"), new d.b(), new j0(this, i10));
            }
            a0 a0Var5 = this.f986t;
            if (a0Var5 instanceof x.n) {
                a0Var5.p0(this.f981n);
            }
            a0 a0Var6 = this.f986t;
            if (a0Var6 instanceof x.o) {
                a0Var6.s0(this.o);
            }
            a0 a0Var7 = this.f986t;
            if (a0Var7 instanceof w.v) {
                a0Var7.q0(this.f982p);
            }
            a0 a0Var8 = this.f986t;
            if (a0Var8 instanceof w.w) {
                a0Var8.r0(this.f983q);
            }
            a0 a0Var9 = this.f986t;
            if ((a0Var9 instanceof g0.n) && yVar == 0) {
                a0Var9.o0(this.f984r);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void b0() {
        int i10;
        synchronized (this.f968a) {
            try {
                boolean z9 = true;
                if (!this.f968a.isEmpty()) {
                    k0 k0Var = this.f975h;
                    k0Var.f919a = true;
                    f0.a aVar = k0Var.f921c;
                    if (aVar != null) {
                        aVar.accept(Boolean.TRUE);
                    }
                    return;
                }
                k0 k0Var2 = this.f975h;
                ArrayList arrayList = this.f971d;
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                if (i10 <= 0 || !K(this.f988v)) {
                    z9 = false;
                }
                k0Var2.f919a = z9;
                f0.a aVar2 = k0Var2.f921c;
                if (aVar2 != null) {
                    aVar2.accept(Boolean.valueOf(z9));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(y yVar) {
        if (H(2)) {
            Log.v("FragmentManager", "attach: " + yVar);
        }
        if (yVar.Q) {
            yVar.Q = false;
            if (!yVar.B) {
                this.f970c.h(yVar);
                if (H(2)) {
                    Log.v("FragmentManager", "add from attach: " + yVar);
                }
                if (I(yVar)) {
                    this.D = true;
                }
            }
        }
    }

    public final void d() {
        this.f969b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f970c.v().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((z0) it.next()).f1062c.U;
            if (viewGroup != null) {
                hashSet.add(n1.f(viewGroup, F()));
            }
        }
        return hashSet;
    }

    public final z0 f(y yVar) {
        String str = yVar.f1037e;
        i.g gVar = this.f970c;
        z0 z0Var = (z0) ((HashMap) gVar.f5196b).get(str);
        if (z0Var != null) {
            return z0Var;
        }
        z0 z0Var2 = new z0(this.f979l, gVar, yVar);
        z0Var2.m(this.f986t.D.getClassLoader());
        z0Var2.f1064e = this.f985s;
        return z0Var2;
    }

    public final void g(y yVar) {
        if (H(2)) {
            Log.v("FragmentManager", "detach: " + yVar);
        }
        if (!yVar.Q) {
            yVar.Q = true;
            if (yVar.B) {
                if (H(2)) {
                    Log.v("FragmentManager", "remove from detach: " + yVar);
                }
                i.g gVar = this.f970c;
                synchronized (((ArrayList) gVar.f5198d)) {
                    ((ArrayList) gVar.f5198d).remove(yVar);
                }
                yVar.B = false;
                if (I(yVar)) {
                    this.D = true;
                }
                Y(yVar);
            }
        }
    }

    public final void h(Configuration configuration) {
        for (y yVar : this.f970c.C()) {
            if (yVar != null) {
                yVar.onConfigurationChanged(configuration);
                yVar.K.h(configuration);
            }
        }
    }

    public final boolean i() {
        if (this.f985s < 1) {
            return false;
        }
        for (y yVar : this.f970c.C()) {
            if (yVar != null && yVar.K()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        boolean z9;
        if (this.f985s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (y yVar : this.f970c.C()) {
            if (yVar != null && J(yVar)) {
                if (!yVar.P) {
                    z9 = yVar.K.j() | false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(yVar);
                    z10 = true;
                }
            }
        }
        if (this.f972e != null) {
            for (int i10 = 0; i10 < this.f972e.size(); i10++) {
                y yVar2 = (y) this.f972e.get(i10);
                if (arrayList == null || !arrayList.contains(yVar2)) {
                    yVar2.getClass();
                }
            }
        }
        this.f972e = arrayList;
        return z10;
    }

    public final void k() {
        boolean z9 = true;
        this.G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((n1) it.next()).e();
        }
        a0 a0Var = this.f986t;
        boolean z10 = a0Var instanceof androidx.lifecycle.c1;
        i.g gVar = this.f970c;
        if (z10) {
            z9 = ((w0) gVar.f5199e).f1026e;
        } else {
            Context context = a0Var.D;
            if (context instanceof Activity) {
                z9 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z9) {
            Iterator it2 = this.f977j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((c) it2.next()).f849a) {
                    w0 w0Var = (w0) gVar.f5199e;
                    w0Var.getClass();
                    if (H(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    w0Var.c(str);
                }
            }
        }
        t(-1);
        a0 a0Var2 = this.f986t;
        if (a0Var2 instanceof x.o) {
            a0Var2.y0(this.o);
        }
        a0 a0Var3 = this.f986t;
        if (a0Var3 instanceof x.n) {
            a0Var3.v0(this.f981n);
        }
        a0 a0Var4 = this.f986t;
        if (a0Var4 instanceof w.v) {
            a0Var4.w0(this.f982p);
        }
        a0 a0Var5 = this.f986t;
        if (a0Var5 instanceof w.w) {
            a0Var5.x0(this.f983q);
        }
        a0 a0Var6 = this.f986t;
        if (a0Var6 instanceof g0.n) {
            a0Var6.u0(this.f984r);
        }
        this.f986t = null;
        this.f987u = null;
        this.f988v = null;
        if (this.f974g != null) {
            Iterator it3 = this.f975h.f920b.iterator();
            while (it3.hasNext()) {
                ((androidx.activity.a) it3.next()).cancel();
            }
            this.f974g = null;
        }
        c.e eVar = this.f992z;
        if (eVar != null) {
            eVar.b();
            this.A.b();
            this.B.b();
        }
    }

    public final void l() {
        for (y yVar : this.f970c.C()) {
            if (yVar != null) {
                yVar.onLowMemory();
                yVar.K.l();
            }
        }
    }

    public final void m(boolean z9) {
        for (y yVar : this.f970c.C()) {
            if (yVar != null) {
                yVar.K.m(z9);
            }
        }
    }

    public final void n() {
        Iterator it = this.f970c.z().iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar != null) {
                yVar.r();
                yVar.K.n();
            }
        }
    }

    public final boolean o() {
        boolean z9;
        if (this.f985s < 1) {
            return false;
        }
        for (y yVar : this.f970c.C()) {
            if (yVar != null) {
                if (!yVar.P) {
                    z9 = yVar.K.o();
                } else {
                    z9 = false;
                }
                if (z9) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f985s < 1) {
            return;
        }
        for (y yVar : this.f970c.C()) {
            if (yVar != null && !yVar.P) {
                yVar.K.p();
            }
        }
    }

    public final void q(y yVar) {
        if (yVar != null && yVar.equals(A(yVar.f1037e))) {
            yVar.I.getClass();
            boolean K = K(yVar);
            Boolean bool = yVar.A;
            if (bool == null || bool.booleanValue() != K) {
                yVar.A = Boolean.valueOf(K);
                t0 t0Var = yVar.K;
                t0Var.b0();
                t0Var.q(t0Var.f989w);
            }
        }
    }

    public final void r(boolean z9) {
        for (y yVar : this.f970c.C()) {
            if (yVar != null) {
                yVar.K.r(z9);
            }
        }
    }

    public final boolean s() {
        boolean z9;
        if (this.f985s < 1) {
            return false;
        }
        boolean z10 = false;
        for (y yVar : this.f970c.C()) {
            if (yVar != null && J(yVar)) {
                if (!yVar.P) {
                    z9 = yVar.K.s() | false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void t(int i10) {
        try {
            this.f969b = true;
            for (z0 z0Var : ((HashMap) this.f970c.f5196b).values()) {
                if (z0Var != null) {
                    z0Var.f1064e = i10;
                }
            }
            L(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((n1) it.next()).e();
            }
            this.f969b = false;
            x(true);
        } catch (Throwable th) {
            this.f969b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        y yVar = this.f988v;
        if (yVar != null) {
            sb.append(yVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f988v)));
            sb.append("}");
        } else {
            a0 a0Var = this.f986t;
            if (a0Var != null) {
                sb.append(a0Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f986t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String s9 = a3.g.s(str, "    ");
        this.f970c.p(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f972e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                y yVar = (y) this.f972e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(yVar.toString());
            }
        }
        ArrayList arrayList2 = this.f971d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) this.f971d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.h(s9, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f976i.get());
        synchronized (this.f968a) {
            int size3 = this.f968a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    q0 q0Var = (q0) this.f968a.get(i12);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(q0Var);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f986t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f987u);
        if (this.f988v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f988v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f985s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void v(q0 q0Var, boolean z9) {
        boolean z10;
        if (!z9) {
            if (this.f986t == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (!this.E && !this.F) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f968a) {
            if (this.f986t == null) {
                if (z9) {
                } else {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f968a.add(q0Var);
                U();
            }
        }
    }

    public final void w(boolean z9) {
        boolean z10;
        if (!this.f969b) {
            if (this.f986t == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.f986t.E.getLooper()) {
                if (!z9) {
                    if (!this.E && !this.F) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                    }
                }
                if (this.I == null) {
                    this.I = new ArrayList();
                    this.J = new ArrayList();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean x(boolean z9) {
        boolean z10;
        w(z9);
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.J;
            synchronized (this.f968a) {
                if (this.f968a.isEmpty()) {
                    z10 = false;
                } else {
                    try {
                        int size = this.f968a.size();
                        z10 = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            z10 |= ((q0) this.f968a.get(i10)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z10) {
                break;
            }
            z11 = true;
            this.f969b = true;
            try {
                R(this.I, this.J);
            } finally {
                d();
            }
        }
        b0();
        if (this.H) {
            this.H = false;
            a0();
        }
        this.f970c.m();
        return z11;
    }

    public final void y(q0 q0Var, boolean z9) {
        if (z9 && (this.f986t == null || this.G)) {
            return;
        }
        w(z9);
        if (q0Var.a(this.I, this.J)) {
            this.f969b = true;
            try {
                R(this.I, this.J);
            } finally {
                d();
            }
        }
        b0();
        if (this.H) {
            this.H = false;
            a0();
        }
        this.f970c.m();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:178:0x0322. Please report as an issue. */
    public final void z(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        ViewGroup viewGroup;
        i.g gVar;
        i.g gVar2;
        i.g gVar3;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z9 = ((a) arrayList3.get(i10)).o;
        ArrayList arrayList5 = this.K;
        if (arrayList5 == null) {
            this.K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.K;
        i.g gVar4 = this.f970c;
        arrayList6.addAll(gVar4.C());
        y yVar = this.f989w;
        int i15 = i10;
        boolean z10 = false;
        while (true) {
            int i16 = 1;
            if (i15 < i11) {
                a aVar = (a) arrayList3.get(i15);
                if (!((Boolean) arrayList4.get(i15)).booleanValue()) {
                    ArrayList arrayList7 = this.K;
                    int i17 = 0;
                    while (true) {
                        ArrayList arrayList8 = aVar.f812a;
                        if (i17 < arrayList8.size()) {
                            a1 a1Var = (a1) arrayList8.get(i17);
                            int i18 = a1Var.f829a;
                            if (i18 != i16) {
                                if (i18 != 2) {
                                    if (i18 != 3 && i18 != 6) {
                                        if (i18 != 7) {
                                            if (i18 == 8) {
                                                arrayList8.add(i17, new a1(9, yVar, 0));
                                                a1Var.f831c = true;
                                                i17++;
                                                yVar = a1Var.f830b;
                                            }
                                        } else {
                                            gVar3 = gVar4;
                                            i12 = 1;
                                        }
                                    } else {
                                        arrayList7.remove(a1Var.f830b);
                                        y yVar2 = a1Var.f830b;
                                        if (yVar2 == yVar) {
                                            arrayList8.add(i17, new a1(9, yVar2));
                                            i17++;
                                            gVar3 = gVar4;
                                            i12 = 1;
                                            yVar = null;
                                        }
                                    }
                                    gVar3 = gVar4;
                                    i12 = 1;
                                } else {
                                    y yVar3 = a1Var.f830b;
                                    int i19 = yVar3.N;
                                    int size = arrayList7.size() - 1;
                                    boolean z11 = false;
                                    while (size >= 0) {
                                        i.g gVar5 = gVar4;
                                        y yVar4 = (y) arrayList7.get(size);
                                        if (yVar4.N == i19) {
                                            if (yVar4 == yVar3) {
                                                i13 = i19;
                                                z11 = true;
                                            } else {
                                                if (yVar4 == yVar) {
                                                    i13 = i19;
                                                    i14 = 0;
                                                    arrayList8.add(i17, new a1(9, yVar4, 0));
                                                    i17++;
                                                    yVar = null;
                                                } else {
                                                    i13 = i19;
                                                    i14 = 0;
                                                }
                                                a1 a1Var2 = new a1(3, yVar4, i14);
                                                a1Var2.f832d = a1Var.f832d;
                                                a1Var2.f834f = a1Var.f834f;
                                                a1Var2.f833e = a1Var.f833e;
                                                a1Var2.f835g = a1Var.f835g;
                                                arrayList8.add(i17, a1Var2);
                                                arrayList7.remove(yVar4);
                                                i17++;
                                                yVar = yVar;
                                            }
                                        } else {
                                            i13 = i19;
                                        }
                                        size--;
                                        i19 = i13;
                                        gVar4 = gVar5;
                                    }
                                    gVar3 = gVar4;
                                    i12 = 1;
                                    if (z11) {
                                        arrayList8.remove(i17);
                                        i17--;
                                    } else {
                                        a1Var.f829a = 1;
                                        a1Var.f831c = true;
                                        arrayList7.add(yVar3);
                                    }
                                }
                                i17 += i12;
                                i16 = i12;
                                gVar4 = gVar3;
                            } else {
                                gVar3 = gVar4;
                                i12 = i16;
                            }
                            arrayList7.add(a1Var.f830b);
                            i17 += i12;
                            i16 = i12;
                            gVar4 = gVar3;
                        } else {
                            gVar2 = gVar4;
                        }
                    }
                } else {
                    gVar2 = gVar4;
                    int i20 = 1;
                    ArrayList arrayList9 = this.K;
                    ArrayList arrayList10 = aVar.f812a;
                    int size2 = arrayList10.size() - 1;
                    while (size2 >= 0) {
                        a1 a1Var3 = (a1) arrayList10.get(size2);
                        int i21 = a1Var3.f829a;
                        if (i21 != i20) {
                            if (i21 != 3) {
                                switch (i21) {
                                    case 8:
                                        yVar = null;
                                        break;
                                    case 9:
                                        yVar = a1Var3.f830b;
                                        break;
                                    case 10:
                                        a1Var3.f837i = a1Var3.f836h;
                                        break;
                                }
                                size2--;
                                i20 = 1;
                            }
                            arrayList9.add(a1Var3.f830b);
                            size2--;
                            i20 = 1;
                        }
                        arrayList9.remove(a1Var3.f830b);
                        size2--;
                        i20 = 1;
                    }
                }
                if (!z10 && !aVar.f818g) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                i15++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                gVar4 = gVar2;
            } else {
                i.g gVar6 = gVar4;
                this.K.clear();
                if (!z9 && this.f985s >= 1) {
                    for (int i22 = i10; i22 < i11; i22++) {
                        Iterator it = ((a) arrayList.get(i22)).f812a.iterator();
                        while (it.hasNext()) {
                            y yVar5 = ((a1) it.next()).f830b;
                            if (yVar5 != null && yVar5.I != null) {
                                gVar = gVar6;
                                gVar.G(f(yVar5));
                            } else {
                                gVar = gVar6;
                            }
                            gVar6 = gVar;
                        }
                    }
                }
                for (int i23 = i10; i23 < i11; i23++) {
                    a aVar2 = (a) arrayList.get(i23);
                    if (((Boolean) arrayList2.get(i23)).booleanValue()) {
                        aVar2.c(-1);
                        ArrayList arrayList11 = aVar2.f812a;
                        for (int size3 = arrayList11.size() - 1; size3 >= 0; size3--) {
                            a1 a1Var4 = (a1) arrayList11.get(size3);
                            y yVar6 = a1Var4.f830b;
                            if (yVar6 != null) {
                                if (yVar6.Y != null) {
                                    yVar6.h().f1007a = true;
                                }
                                int i24 = aVar2.f817f;
                                int i25 = 8194;
                                int i26 = 4097;
                                if (i24 != 4097) {
                                    if (i24 != 8194) {
                                        i25 = 8197;
                                        i26 = 4100;
                                        if (i24 != 8197) {
                                            if (i24 != 4099) {
                                                if (i24 != 4100) {
                                                    i25 = 0;
                                                }
                                            } else {
                                                i25 = 4099;
                                            }
                                        }
                                    }
                                    i25 = i26;
                                }
                                if (yVar6.Y != null || i25 != 0) {
                                    yVar6.h();
                                    yVar6.Y.f1012f = i25;
                                }
                                ArrayList arrayList12 = aVar2.f825n;
                                ArrayList arrayList13 = aVar2.f824m;
                                yVar6.h();
                                v vVar = yVar6.Y;
                                vVar.f1013g = arrayList12;
                                vVar.f1014h = arrayList13;
                            }
                            int i27 = a1Var4.f829a;
                            s0 s0Var = aVar2.f826p;
                            switch (i27) {
                                case 1:
                                    yVar6.R(a1Var4.f832d, a1Var4.f833e, a1Var4.f834f, a1Var4.f835g);
                                    s0Var.V(yVar6, true);
                                    s0Var.Q(yVar6);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + a1Var4.f829a);
                                case 3:
                                    yVar6.R(a1Var4.f832d, a1Var4.f833e, a1Var4.f834f, a1Var4.f835g);
                                    s0Var.a(yVar6);
                                    break;
                                case 4:
                                    yVar6.R(a1Var4.f832d, a1Var4.f833e, a1Var4.f834f, a1Var4.f835g);
                                    s0Var.getClass();
                                    Z(yVar6);
                                    break;
                                case 5:
                                    yVar6.R(a1Var4.f832d, a1Var4.f833e, a1Var4.f834f, a1Var4.f835g);
                                    s0Var.V(yVar6, true);
                                    s0Var.G(yVar6);
                                    break;
                                case 6:
                                    yVar6.R(a1Var4.f832d, a1Var4.f833e, a1Var4.f834f, a1Var4.f835g);
                                    s0Var.c(yVar6);
                                    break;
                                case zzaja.zze.zzg /* 7 */:
                                    yVar6.R(a1Var4.f832d, a1Var4.f833e, a1Var4.f834f, a1Var4.f835g);
                                    s0Var.V(yVar6, true);
                                    s0Var.g(yVar6);
                                    break;
                                case 8:
                                    s0Var.X(null);
                                    break;
                                case 9:
                                    s0Var.X(yVar6);
                                    break;
                                case 10:
                                    s0Var.W(yVar6, a1Var4.f836h);
                                    break;
                            }
                        }
                    } else {
                        aVar2.c(1);
                        ArrayList arrayList14 = aVar2.f812a;
                        int size4 = arrayList14.size();
                        for (int i28 = 0; i28 < size4; i28++) {
                            a1 a1Var5 = (a1) arrayList14.get(i28);
                            y yVar7 = a1Var5.f830b;
                            if (yVar7 != null) {
                                if (yVar7.Y != null) {
                                    yVar7.h().f1007a = false;
                                }
                                int i29 = aVar2.f817f;
                                if (yVar7.Y != null || i29 != 0) {
                                    yVar7.h();
                                    yVar7.Y.f1012f = i29;
                                }
                                ArrayList arrayList15 = aVar2.f824m;
                                ArrayList arrayList16 = aVar2.f825n;
                                yVar7.h();
                                v vVar2 = yVar7.Y;
                                vVar2.f1013g = arrayList15;
                                vVar2.f1014h = arrayList16;
                            }
                            int i30 = a1Var5.f829a;
                            s0 s0Var2 = aVar2.f826p;
                            switch (i30) {
                                case 1:
                                    yVar7.R(a1Var5.f832d, a1Var5.f833e, a1Var5.f834f, a1Var5.f835g);
                                    s0Var2.V(yVar7, false);
                                    s0Var2.a(yVar7);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + a1Var5.f829a);
                                case 3:
                                    yVar7.R(a1Var5.f832d, a1Var5.f833e, a1Var5.f834f, a1Var5.f835g);
                                    s0Var2.Q(yVar7);
                                case 4:
                                    yVar7.R(a1Var5.f832d, a1Var5.f833e, a1Var5.f834f, a1Var5.f835g);
                                    s0Var2.G(yVar7);
                                case 5:
                                    yVar7.R(a1Var5.f832d, a1Var5.f833e, a1Var5.f834f, a1Var5.f835g);
                                    s0Var2.V(yVar7, false);
                                    Z(yVar7);
                                case 6:
                                    yVar7.R(a1Var5.f832d, a1Var5.f833e, a1Var5.f834f, a1Var5.f835g);
                                    s0Var2.g(yVar7);
                                case zzaja.zze.zzg /* 7 */:
                                    yVar7.R(a1Var5.f832d, a1Var5.f833e, a1Var5.f834f, a1Var5.f835g);
                                    s0Var2.V(yVar7, false);
                                    s0Var2.c(yVar7);
                                case 8:
                                    s0Var2.X(yVar7);
                                case 9:
                                    s0Var2.X(null);
                                case 10:
                                    s0Var2.W(yVar7, a1Var5.f837i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
                for (int i31 = i10; i31 < i11; i31++) {
                    a aVar3 = (a) arrayList.get(i31);
                    if (booleanValue) {
                        for (int size5 = aVar3.f812a.size() - 1; size5 >= 0; size5--) {
                            y yVar8 = ((a1) aVar3.f812a.get(size5)).f830b;
                            if (yVar8 != null) {
                                f(yVar8).k();
                            }
                        }
                    } else {
                        Iterator it2 = aVar3.f812a.iterator();
                        while (it2.hasNext()) {
                            y yVar9 = ((a1) it2.next()).f830b;
                            if (yVar9 != null) {
                                f(yVar9).k();
                            }
                        }
                    }
                }
                L(this.f985s, true);
                HashSet hashSet = new HashSet();
                for (int i32 = i10; i32 < i11; i32++) {
                    Iterator it3 = ((a) arrayList.get(i32)).f812a.iterator();
                    while (it3.hasNext()) {
                        y yVar10 = ((a1) it3.next()).f830b;
                        if (yVar10 != null && (viewGroup = yVar10.U) != null) {
                            hashSet.add(n1.f(viewGroup, F()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    n1 n1Var = (n1) it4.next();
                    n1Var.f945d = booleanValue;
                    n1Var.g();
                    n1Var.c();
                }
                for (int i33 = i10; i33 < i11; i33++) {
                    a aVar4 = (a) arrayList.get(i33);
                    if (((Boolean) arrayList2.get(i33)).booleanValue() && aVar4.f828r >= 0) {
                        aVar4.f828r = -1;
                    }
                    aVar4.getClass();
                }
                return;
            }
        }
    }
}
