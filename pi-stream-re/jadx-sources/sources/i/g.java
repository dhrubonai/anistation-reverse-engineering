package i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.s0;
import androidx.fragment.app.w0;
import androidx.fragment.app.y;
import androidx.fragment.app.y0;
import androidx.fragment.app.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import f.r0;
import f1.b0;
import f1.t;
import j.f0;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.zip.Inflater;
import l8.z;
import q0.r;
import q0.x;
import r6.h0;
import r6.o0;
import v1.c0;
import v1.s;
import v1.w;

/* loaded from: classes.dex */
public final class g implements a, c0, o1.o, y2.l, FragmentComponentBuilder, ViewComponentBuilder {

    /* renamed from: f, reason: collision with root package name */
    public static g f5194f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5195a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5196b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5197c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5198d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5199e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(x7.g gVar, x7.c cVar, x7.a aVar) {
        this(gVar, cVar, aVar, 10);
        this.f5195a = 10;
    }

    public static void N(long j4, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j4) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    public static void e(Object obj, long j4, Map map) {
        if (map.containsKey(obj)) {
            Long l10 = (Long) map.get(obj);
            int i10 = b0.f3799a;
            j4 = Math.max(j4, l10.longValue());
        }
        map.put(obj, Long.valueOf(j4));
    }

    @Override // o1.o
    public final void A(int i10, w wVar, Exception exc) {
        if (I(i10, wVar)) {
            ((o1.n) this.f5198d).e(exc);
        }
    }

    @Override // v1.c0
    public final void B(int i10, w wVar, v1.n nVar, s sVar) {
        if (I(i10, wVar)) {
            ((v1.b0) this.f5197c).n(nVar, J(sVar, wVar));
        }
    }

    public final List C() {
        ArrayList arrayList;
        if (((ArrayList) this.f5198d).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f5198d)) {
            arrayList = new ArrayList((ArrayList) this.f5198d);
        }
        return arrayList;
    }

    @Override // v1.c0
    public final void D(int i10, w wVar, v1.n nVar, s sVar, IOException iOException, boolean z9) {
        if (I(i10, wVar)) {
            ((v1.b0) this.f5197c).k(nVar, J(sVar, wVar), iOException, z9);
        }
    }

    public final Menu E(j.o oVar) {
        Menu menu = (Menu) ((n.k) this.f5199e).getOrDefault(oVar, null);
        if (menu == null) {
            f0 f0Var = new f0((Context) this.f5197c, oVar);
            ((n.k) this.f5199e).put(oVar, f0Var);
            return f0Var;
        }
        return menu;
    }

    @Override // v1.c0
    public final void F(int i10, w wVar, v1.n nVar, s sVar) {
        if (I(i10, wVar)) {
            ((v1.b0) this.f5197c).h(nVar, J(sVar, wVar));
        }
    }

    public final void G(z0 z0Var) {
        boolean z9;
        y yVar = z0Var.f1062c;
        String str = yVar.f1037e;
        Object obj = this.f5196b;
        if (((HashMap) obj).get(str) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return;
        }
        ((HashMap) obj).put(yVar.f1037e, z0Var);
        if (s0.H(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + yVar);
        }
    }

    public final void H(z0 z0Var) {
        y yVar = z0Var.f1062c;
        if (yVar.R) {
            ((w0) this.f5199e).d(yVar);
        }
        if (((z0) ((HashMap) this.f5196b).put(yVar.f1037e, null)) != null && s0.H(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + yVar);
        }
    }

    public final boolean I(int i10, w wVar) {
        w wVar2;
        Object obj = this.f5196b;
        if (wVar != null) {
            wVar2 = ((v1.g) this.f5199e).t(obj, wVar);
            if (wVar2 == null) {
                return false;
            }
        } else {
            wVar2 = null;
        }
        int v9 = ((v1.g) this.f5199e).v(i10, obj);
        v1.b0 b0Var = (v1.b0) this.f5197c;
        if (b0Var.f10365a != v9 || !b0.a(b0Var.f10366b, wVar2)) {
            this.f5197c = new v1.b0(((v1.g) this.f5199e).f10355c.f10367c, v9, wVar2);
        }
        o1.n nVar = (o1.n) this.f5198d;
        if (nVar.f8162a != v9 || !b0.a(nVar.f8163b, wVar2)) {
            this.f5198d = new o1.n(((v1.g) this.f5199e).f10356d.f8164c, v9, wVar2);
            return true;
        }
        return true;
    }

    public final s J(s sVar, w wVar) {
        v1.g gVar = (v1.g) this.f5199e;
        long j4 = sVar.f10530f;
        Object obj = this.f5196b;
        long u9 = gVar.u(obj, j4);
        v1.g gVar2 = (v1.g) this.f5199e;
        long j10 = sVar.f10531g;
        long u10 = gVar2.u(obj, j10);
        if (u9 == sVar.f10530f && u10 == j10) {
            return sVar;
        }
        return new s(sVar.f10525a, sVar.f10526b, sVar.f10527c, sVar.f10528d, sVar.f10529e, u9, u10);
    }

    public final void K() {
        synchronized (this.f5196b) {
            a3.g.z(this.f5198d);
        }
    }

    @Override // o1.o
    public final void L(int i10, w wVar) {
        if (I(i10, wVar)) {
            ((o1.n) this.f5198d).b();
        }
    }

    public final void M() {
        LinearLayout linearLayout = (LinearLayout) this.f5199e;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        ArrayList d10 = h0.d((Context) this.f5197c);
        if (d10.isEmpty()) {
            ((LinearLayout) this.f5199e).setVisibility(8);
            k8.a aVar = (k8.a) this.f5198d;
            aVar.f6482c = null;
            aVar.f6493n.put("continueWatching", Long.valueOf(System.currentTimeMillis()));
            return;
        }
        ((LinearLayout) this.f5199e).setVisibility(0);
        TextView l10 = w8.i.l((Context) this.f5197c, "Continue watching", 24, -1, 1);
        LinearLayout linearLayout2 = new LinearLayout((Context) this.f5197c);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(w8.i.e((Context) this.f5197c, 24), w8.i.e((Context) this.f5197c, 30), w8.i.e((Context) this.f5197c, 24), 0);
        ((LinearLayout) this.f5199e).addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        a3.g.v(0, -2, 1.0f, linearLayout2, l10);
        TextView l11 = w8.i.l((Context) this.f5197c, "See all", 16, w8.i.f11065e, 1);
        l11.setPadding(w8.i.e((Context) this.f5197c, 8), w8.i.e((Context) this.f5197c, 8), w8.i.e((Context) this.f5197c, 8), w8.i.e((Context) this.f5197c, 8));
        l11.setGravity(17);
        l11.setOnClickListener(new j3.j(this, 6));
        linearLayout2.addView(l11, new LinearLayout.LayoutParams(-2, -2));
        RecyclerView recyclerView = new RecyclerView((Context) this.f5197c, null);
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        recyclerView.setPadding(w8.i.e((Context) this.f5197c, 24), w8.i.e((Context) this.f5197c, 22), w8.i.e((Context) this.f5197c, 24), 0);
        recyclerView.setClipToPadding(false);
        recyclerView.setSaveEnabled(false);
        i8.d dVar = new i8.d((Context) this.f5197c, new i8.g(this), true, true);
        recyclerView.setAdapter(dVar);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        ((LinearLayout) this.f5199e).addView(recyclerView, new LinearLayout.LayoutParams(-1, w8.i.e((Context) this.f5197c, 254)));
        k8.a aVar2 = (k8.a) this.f5198d;
        aVar2.f6482c = d10;
        aVar2.f6493n.put("continueWatching", Long.valueOf(System.currentTimeMillis()));
        if (d10.size() > 16) {
            d10 = new ArrayList(d10.subList(0, 16));
        }
        dVar.e(d10);
    }

    @Override // o1.o
    public final void O(int i10, w wVar) {
        if (I(i10, wVar)) {
            ((o1.n) this.f5198d).a();
        }
    }

    @Override // o1.o
    public final /* synthetic */ void P() {
    }

    public final n1.b Q(o0 o0Var) {
        ArrayList j4 = j(o0Var);
        if (j4.size() < 2) {
            return (n1.b) h0.W(j4, null);
        }
        Collections.sort(j4, new d0.b(1));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((n1.b) j4.get(0)).f7906c;
        int i12 = 0;
        while (true) {
            if (i12 >= j4.size()) {
                break;
            }
            n1.b bVar = (n1.b) j4.get(i12);
            if (i11 != bVar.f7906c) {
                if (arrayList.size() == 1) {
                    return (n1.b) j4.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar.f7905b, Integer.valueOf(bVar.f7907d)));
                i12++;
            }
        }
        n1.b bVar2 = (n1.b) ((Map) this.f5198d).get(arrayList);
        if (bVar2 == null) {
            List subList = j4.subList(0, arrayList.size());
            int i13 = 0;
            for (int i14 = 0; i14 < subList.size(); i14++) {
                i13 += ((n1.b) subList.get(i14)).f7907d;
            }
            int nextInt = ((Random) this.f5199e).nextInt(i13);
            int i15 = 0;
            while (true) {
                if (i10 < subList.size()) {
                    n1.b bVar3 = (n1.b) subList.get(i10);
                    i15 += bVar3.f7907d;
                    if (nextInt < i15) {
                        bVar2 = bVar3;
                        break;
                    }
                    i10++;
                } else {
                    bVar2 = (n1.b) h0.X(subList);
                    break;
                }
            }
            ((Map) this.f5198d).put(arrayList, bVar2);
        }
        return bVar2;
    }

    public final y0 R(String str, y0 y0Var) {
        if (y0Var != null) {
            return (y0) ((HashMap) this.f5197c).put(str, y0Var);
        }
        return (y0) ((HashMap) this.f5197c).remove(str);
    }

    @Override // i.a
    public final boolean a(b bVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f5196b).onActionItemClicked(u(bVar), new j.w((Context) this.f5197c, (b0.b) menuItem));
    }

    @Override // i.a
    public final boolean b(b bVar, j.o oVar) {
        return ((ActionMode.Callback) this.f5196b).onPrepareActionMode(u(bVar), E(oVar));
    }

    @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
    public final FragmentComponent build() {
        h0.m((y) this.f5199e, y.class);
        return new x7.d((x7.g) this.f5196b, (x7.c) this.f5197c, (x7.a) this.f5198d);
    }

    @Override // i.a
    public final void c(b bVar) {
        ((ActionMode.Callback) this.f5196b).onDestroyActionMode(u(bVar));
    }

    @Override // i.a
    public final boolean d(b bVar, j.o oVar) {
        return ((ActionMode.Callback) this.f5196b).onCreateActionMode(u(bVar), E(oVar));
    }

    @Override // y2.l
    public final void f() {
        switch (this.f5195a) {
            case 5:
                ((Map) this.f5196b).clear();
                ((Map) this.f5197c).clear();
                ((Map) this.f5198d).clear();
                return;
            default:
                return;
        }
    }

    @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
    public final FragmentComponentBuilder fragment(y yVar) {
        yVar.getClass();
        this.f5199e = yVar;
        return this;
    }

    @Override // v1.c0
    public final void g(int i10, w wVar, s sVar) {
        if (I(i10, wVar)) {
            ((v1.b0) this.f5197c).b(J(sVar, wVar));
        }
    }

    public final void h(y yVar) {
        if (!((ArrayList) this.f5198d).contains(yVar)) {
            synchronized (((ArrayList) this.f5198d)) {
                ((ArrayList) this.f5198d).add(yVar);
            }
            yVar.B = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + yVar);
    }

    @Override // v1.c0
    public final void i(int i10, w wVar, s sVar) {
        if (I(i10, wVar)) {
            ((v1.b0) this.f5197c).o(J(sVar, wVar));
        }
    }

    public final ArrayList j(o0 o0Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map map = (Map) this.f5196b;
        N(elapsedRealtime, map);
        N(elapsedRealtime, (Map) this.f5197c);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < o0Var.size(); i10++) {
            n1.b bVar = (n1.b) o0Var.get(i10);
            if (!map.containsKey(bVar.f7905b) && !((Map) this.f5197c).containsKey(Integer.valueOf(bVar.f7906c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // y2.l
    public final /* synthetic */ void k(byte[] bArr, r0 r0Var, w.f fVar) {
        r.f.a(this, bArr, r0Var, fVar);
    }

    @Override // o1.o
    public final void l(int i10, w wVar) {
        if (I(i10, wVar)) {
            ((o1.n) this.f5198d).f();
        }
    }

    public final void m() {
        ((HashMap) this.f5196b).values().removeAll(Collections.singleton(null));
    }

    public final void n(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((n.k) this.f5199e).getOrDefault(obj, null);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    n(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    @Override // y2.l
    public final void o(byte[] bArr, int i10, int i11, r0 r0Var, f1.c cVar) {
        char c6;
        int i12;
        e1.b bVar;
        int i13;
        int i14;
        int i15;
        int v9;
        int i16;
        int i17;
        int x9;
        t tVar = (t) this.f5196b;
        tVar.E(bArr, i10 + i11);
        tVar.G(i10);
        int i18 = tVar.f3860c;
        int i19 = tVar.f3859b;
        char c10 = 255;
        if (i18 - i19 > 0 && (tVar.f3858a[i19] & 255) == 120) {
            if (((Inflater) this.f5199e) == null) {
                this.f5199e = new Inflater();
            }
            if (b0.I(tVar, (t) this.f5197c, (Inflater) this.f5199e)) {
                t tVar2 = (t) this.f5197c;
                tVar.E(tVar2.f3858a, tVar2.f3860c);
            }
        }
        b3.a aVar = (b3.a) this.f5198d;
        int i20 = 0;
        aVar.f1423d = 0;
        aVar.f1424e = 0;
        aVar.f1425f = 0;
        aVar.f1426g = 0;
        aVar.f1427h = 0;
        aVar.f1428i = 0;
        aVar.f1420a.D(0);
        aVar.f1422c = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i21 = tVar.f3860c;
            if (i21 - tVar.f3859b >= 3) {
                b3.a aVar2 = (b3.a) this.f5198d;
                int v10 = tVar.v();
                int A = tVar.A();
                int i22 = tVar.f3859b + A;
                if (i22 > i21) {
                    tVar.G(i21);
                    i13 = i20;
                    c6 = c10;
                    bVar = null;
                } else {
                    if (v10 != 128) {
                        switch (v10) {
                            case 20:
                                aVar2.getClass();
                                if (A % 5 == 2) {
                                    tVar.H(2);
                                    int[] iArr = aVar2.f1421b;
                                    Arrays.fill(iArr, i20);
                                    int i23 = A / 5;
                                    int i24 = i20;
                                    while (i24 < i23) {
                                        int v11 = tVar.v();
                                        double v12 = tVar.v();
                                        double v13 = tVar.v() - 128;
                                        int i25 = i23;
                                        double v14 = tVar.v() - 128;
                                        iArr[v11] = (b0.h((int) ((1.402d * v13) + v12), 0, 255) << 16) | (tVar.v() << 24) | (b0.h((int) ((v12 - (0.34414d * v14)) - (v13 * 0.71414d)), 0, 255) << 8) | b0.h((int) ((v14 * 1.772d) + v12), 0, 255);
                                        i24++;
                                        i22 = i22;
                                        c10 = 255;
                                        i23 = i25;
                                    }
                                    c6 = c10;
                                    i12 = i22;
                                    aVar2.f1422c = true;
                                    break;
                                }
                                break;
                            case 21:
                                aVar2.getClass();
                                if (A >= 4) {
                                    tVar.H(3);
                                    if ((128 & tVar.v()) != 0) {
                                        i17 = 1;
                                    } else {
                                        i17 = i20;
                                    }
                                    int i26 = A - 4;
                                    t tVar3 = aVar2.f1420a;
                                    if (i17 != 0) {
                                        if (i26 >= 7 && (x9 = tVar.x()) >= 4) {
                                            aVar2.f1427h = tVar.A();
                                            aVar2.f1428i = tVar.A();
                                            tVar3.D(x9 - 4);
                                            i26 -= 7;
                                        }
                                    }
                                    int i27 = tVar3.f3859b;
                                    int i28 = tVar3.f3860c;
                                    if (i27 < i28 && i26 > 0) {
                                        int min = Math.min(i26, i28 - i27);
                                        tVar.d(tVar3.f3858a, i27, min);
                                        tVar3.G(i27 + min);
                                        break;
                                    }
                                }
                                break;
                            case 22:
                                aVar2.getClass();
                                if (A >= 19) {
                                    aVar2.f1423d = tVar.A();
                                    aVar2.f1424e = tVar.A();
                                    tVar.H(11);
                                    aVar2.f1425f = tVar.A();
                                    aVar2.f1426g = tVar.A();
                                    break;
                                }
                                break;
                        }
                        c6 = c10;
                        i12 = i22;
                        bVar = null;
                        i13 = 0;
                    } else {
                        c6 = c10;
                        i12 = i22;
                        int i29 = aVar2.f1423d;
                        t tVar4 = aVar2.f1420a;
                        if (i29 != 0 && aVar2.f1424e != 0 && aVar2.f1427h != 0 && aVar2.f1428i != 0 && (i14 = tVar4.f3860c) != 0 && tVar4.f3859b == i14 && aVar2.f1422c) {
                            tVar4.G(0);
                            int i30 = aVar2.f1427h * aVar2.f1428i;
                            int[] iArr2 = new int[i30];
                            int i31 = 0;
                            while (i31 < i30) {
                                int v15 = tVar4.v();
                                int[] iArr3 = aVar2.f1421b;
                                if (v15 != 0) {
                                    i15 = i31 + 1;
                                    iArr2[i31] = iArr3[v15];
                                } else {
                                    int v16 = tVar4.v();
                                    if (v16 != 0) {
                                        if ((v16 & 64) == 0) {
                                            v9 = v16 & 63;
                                        } else {
                                            v9 = ((v16 & 63) << 8) | tVar4.v();
                                        }
                                        if ((v16 & 128) == 0) {
                                            i16 = 0;
                                        } else {
                                            i16 = iArr3[tVar4.v()];
                                        }
                                        i15 = v9 + i31;
                                        Arrays.fill(iArr2, i31, i15, i16);
                                    }
                                }
                                i31 = i15;
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar2.f1427h, aVar2.f1428i, Bitmap.Config.ARGB_8888);
                            float f10 = aVar2.f1425f;
                            float f11 = aVar2.f1423d;
                            float f12 = f10 / f11;
                            float f13 = aVar2.f1426g;
                            float f14 = aVar2.f1424e;
                            bVar = new e1.b(null, null, null, createBitmap, f13 / f14, 0, 0, f12, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar2.f1427h / f11, aVar2.f1428i / f14, false, -16777216, Integer.MIN_VALUE, 0.0f);
                        } else {
                            bVar = null;
                        }
                        i13 = 0;
                        aVar2.f1423d = 0;
                        aVar2.f1424e = 0;
                        aVar2.f1425f = 0;
                        aVar2.f1426g = 0;
                        aVar2.f1427h = 0;
                        aVar2.f1428i = 0;
                        tVar4.D(0);
                        aVar2.f1422c = false;
                    }
                    tVar.G(i12);
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
                i20 = i13;
                c10 = c6;
            } else {
                cVar.accept(new y2.a(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }

    public final void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String s9 = a3.g.s(str, "    ");
        Object obj = this.f5196b;
        if (!((HashMap) obj).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (z0 z0Var : ((HashMap) obj).values()) {
                printWriter.print(str);
                if (z0Var != null) {
                    y yVar = z0Var.f1062c;
                    printWriter.println(yVar);
                    yVar.g(s9, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = ((ArrayList) this.f5198d).size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                y yVar2 = (y) ((ArrayList) this.f5198d).get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(yVar2.toString());
            }
        }
    }

    @Override // v1.c0
    public final void q(int i10, w wVar, v1.n nVar, s sVar) {
        if (I(i10, wVar)) {
            ((v1.b0) this.f5197c).e(nVar, J(sVar, wVar));
        }
    }

    @Override // y2.l
    public final /* synthetic */ y2.d r(byte[] bArr, int i10, int i11) {
        return r.f.b(this, bArr, i10, i11);
    }

    public final y s(String str) {
        z0 z0Var = (z0) ((HashMap) this.f5196b).get(str);
        if (z0Var != null) {
            return z0Var.f1062c;
        }
        return null;
    }

    public final y t(String str) {
        for (z0 z0Var : ((HashMap) this.f5196b).values()) {
            if (z0Var != null) {
                y yVar = z0Var.f1062c;
                if (!str.equals(yVar.f1037e)) {
                    yVar = yVar.K.f970c.t(str);
                }
                if (yVar != null) {
                    return yVar;
                }
            }
        }
        return null;
    }

    public final h u(b bVar) {
        int size = ((ArrayList) this.f5198d).size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = (h) ((ArrayList) this.f5198d).get(i10);
            if (hVar != null && hVar.f5201b == bVar) {
                return hVar;
            }
        }
        h hVar2 = new h((Context) this.f5197c, bVar);
        ((ArrayList) this.f5198d).add(hVar2);
        return hVar2;
    }

    public final ArrayList v() {
        ArrayList arrayList = new ArrayList();
        for (z0 z0Var : ((HashMap) this.f5196b).values()) {
            if (z0Var != null) {
                arrayList.add(z0Var);
            }
        }
        return arrayList;
    }

    @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
    public final ViewComponentBuilder view(View view) {
        view.getClass();
        this.f5199e = view;
        return this;
    }

    @Override // o1.o
    public final void w(int i10, w wVar) {
        if (I(i10, wVar)) {
            ((o1.n) this.f5198d).c();
        }
    }

    @Override // y2.l
    public final int x() {
        return 2;
    }

    @Override // o1.o
    public final void y(int i10, w wVar, int i11) {
        if (I(i10, wVar)) {
            ((o1.n) this.f5198d).d(i11);
        }
    }

    public final ArrayList z() {
        ArrayList arrayList = new ArrayList();
        for (z0 z0Var : ((HashMap) this.f5196b).values()) {
            if (z0Var != null) {
                arrayList.add(z0Var.f1062c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public /* synthetic */ g(x7.g gVar, x7.c cVar, x7.a aVar, int i10) {
        this.f5195a = i10;
        this.f5196b = gVar;
        this.f5197c = cVar;
        this.f5198d = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(x7.g gVar, x7.c cVar, x7.a aVar, Object obj) {
        this(gVar, cVar, aVar, 11);
        this.f5195a = 11;
    }

    @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
    /* renamed from: build, reason: collision with other method in class */
    public final ViewComponent mo4build() {
        h0.m((View) this.f5199e, View.class);
        return new x7.e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(int i10) {
        this(new Random());
        this.f5195a = i10;
        int i11 = 2;
        if (i10 == 2) {
            this.f5196b = new p.f(10, 1);
            this.f5199e = new n.k();
            this.f5198d = new ArrayList();
            this.f5197c = new HashSet();
            return;
        }
        if (i10 == 4) {
            this.f5198d = new ArrayList();
            this.f5196b = new HashMap();
            this.f5197c = new HashMap();
            return;
        }
        if (i10 == 5) {
            return;
        }
        if (i10 == 7) {
            this.f5196b = new t();
            this.f5197c = new t();
            this.f5198d = new b3.a();
        } else {
            if (i10 == 8) {
                this.f5196b = new n.e();
                this.f5197c = new SparseArray();
                this.f5198d = new n.i();
                this.f5199e = new n.e();
                return;
            }
            if (i10 != 9) {
                this.f5196b = new p.f(256, 0);
                this.f5197c = new p.f(256, 0);
                this.f5198d = new p.f(256, 0);
                this.f5199e = new p.k[32];
                return;
            }
            this.f5196b = new Object();
            this.f5197c = new Handler(Looper.getMainLooper(), new g4.g(this, i11));
        }
    }

    public g(Context context, k8.a aVar, z zVar) {
        this.f5195a = 12;
        this.f5197c = context;
        this.f5198d = aVar;
        this.f5196b = zVar;
    }

    public g(Random random) {
        this.f5195a = 5;
        this.f5198d = new HashMap();
        this.f5199e = random;
        this.f5196b = new HashMap();
        this.f5197c = new HashMap();
    }

    public g(Typeface typeface, r0.b bVar) {
        this.f5195a = 3;
        this.f5199e = typeface;
        this.f5196b = bVar;
        this.f5198d = new x(1024);
        this.f5197c = new char[bVar.c() * 2];
        int c6 = bVar.c();
        for (int i10 = 0; i10 < c6; i10++) {
            r rVar = new r(this, i10);
            Character.toChars(rVar.c(), (char[]) this.f5197c, i10 * 2);
            com.bumptech.glide.d.i("invalid metadata codepoint length", rVar.b() > 0);
            ((x) this.f5198d).a(rVar, 0, rVar.b() - 1);
        }
    }

    public g(Context context, ActionMode.Callback callback) {
        this.f5195a = 0;
        this.f5197c = context;
        this.f5196b = callback;
        this.f5198d = new ArrayList();
        this.f5199e = new n.k();
    }

    public g(v1.g gVar, Integer num) {
        this.f5195a = 6;
        this.f5199e = gVar;
        this.f5197c = gVar.a(null);
        this.f5198d = new o1.n(gVar.f10356d.f8164c, 0, null);
        this.f5196b = num;
    }
}
