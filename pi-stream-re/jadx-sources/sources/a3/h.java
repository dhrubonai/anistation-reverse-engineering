package a3;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g0.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import m3.a1;
import m3.b1;
import m3.c1;
import m3.d0;
import m3.p0;
import m3.q0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f64a;

    /* renamed from: b, reason: collision with root package name */
    public int f65b;

    /* renamed from: c, reason: collision with root package name */
    public final Cloneable f66c;

    /* renamed from: d, reason: collision with root package name */
    public Cloneable f67d;

    /* renamed from: e, reason: collision with root package name */
    public final Cloneable f68e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f69f;

    /* renamed from: g, reason: collision with root package name */
    public Object f70g;

    /* renamed from: h, reason: collision with root package name */
    public Object f71h;

    /* renamed from: i, reason: collision with root package name */
    public Object f72i;

    public h(int i10, int i11) {
        this.f64a = i10;
        this.f65b = i11;
        this.f66c = new SparseArray();
        this.f67d = new SparseArray();
        this.f68e = new SparseArray();
        this.f69f = new SparseArray();
        this.f70g = new SparseArray();
    }

    public final void a(a1 a1Var, boolean z9) {
        g0.c cVar;
        RecyclerView.l(a1Var);
        c1 c1Var = ((RecyclerView) this.f72i).E0;
        View view = a1Var.f7153a;
        if (c1Var != null) {
            b1 b1Var = c1Var.f7188e;
            if (b1Var instanceof b1) {
                cVar = (g0.c) b1Var.f7180e.remove(view);
            } else {
                cVar = null;
            }
            y0.l(view, cVar);
        }
        if (z9) {
            ((RecyclerView) this.f72i).getClass();
            if (((RecyclerView) this.f72i).F.size() <= 0) {
                Object obj = this.f72i;
                d0 d0Var = ((RecyclerView) obj).D;
                RecyclerView recyclerView = (RecyclerView) obj;
                if (recyclerView.f1258x0 != null) {
                    recyclerView.f1257x.m(a1Var);
                }
                if (RecyclerView.R0) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + a1Var);
                }
            } else {
                g.z(((RecyclerView) this.f72i).F.get(0));
                throw null;
            }
        }
        a1Var.f7170s = null;
        a1Var.f7169r = null;
        q0 c6 = c();
        c6.getClass();
        int i10 = a1Var.f7158f;
        ArrayList arrayList = c6.a(i10).f7339a;
        if (((p0) c6.f7349a.get(i10)).f7340b <= arrayList.size()) {
            z7.c.c(view);
        } else {
            if (RecyclerView.Q0 && arrayList.contains(a1Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            a1Var.n();
            arrayList.add(a1Var);
        }
    }

    public final int b(int i10) {
        if (i10 >= 0 && i10 < ((RecyclerView) this.f72i).f1258x0.b()) {
            Object obj = this.f72i;
            if (!((RecyclerView) obj).f1258x0.f7412g) {
                return i10;
            }
            return ((RecyclerView) obj).f1236e.f(i10, 0);
        }
        StringBuilder u9 = g.u("invalid position ", i10, ". State item count is ");
        u9.append(((RecyclerView) this.f72i).f1258x0.b());
        throw new IndexOutOfBoundsException(g.m((RecyclerView) this.f72i, u9));
    }

    public final q0 c() {
        if (((q0) this.f70g) == null) {
            this.f70g = new q0();
            e();
        }
        return (q0) this.f70g;
    }

    public final View d(int i10) {
        return l(i10, Long.MAX_VALUE).f7153a;
    }

    public final void e() {
        if (((q0) this.f70g) != null) {
            Object obj = this.f72i;
            if (((RecyclerView) obj).D != null && ((RecyclerView) obj).isAttachedToWindow()) {
                q0 q0Var = (q0) this.f70g;
                q0Var.f7351c.add(((RecyclerView) this.f72i).D);
            }
        }
    }

    public final void f(d0 d0Var, boolean z9) {
        Object obj = this.f70g;
        if (((q0) obj) != null) {
            q0 q0Var = (q0) obj;
            Set set = q0Var.f7351c;
            set.remove(d0Var);
            if (set.size() == 0 && !z9) {
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = q0Var.f7349a;
                    if (i10 < sparseArray.size()) {
                        ArrayList arrayList = ((p0) sparseArray.get(sparseArray.keyAt(i10))).f7339a;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            z7.c.c(((a1) arrayList.get(i11)).f7153a);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = (ArrayList) this.f68e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.W0) {
            n.g gVar = ((RecyclerView) this.f72i).f1256w0;
            int[] iArr = gVar.f7875c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            gVar.f7876d = 0;
        }
    }

    public final void h(int i10) {
        if (RecyclerView.R0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i10);
        }
        Cloneable cloneable = this.f68e;
        a1 a1Var = (a1) ((ArrayList) cloneable).get(i10);
        if (RecyclerView.R0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + a1Var);
        }
        a(a1Var, true);
        ((ArrayList) cloneable).remove(i10);
    }

    public final void i(View view) {
        a1 L = RecyclerView.L(view);
        if (L.l()) {
            ((RecyclerView) this.f72i).removeDetachedView(view, false);
        }
        if (L.k()) {
            L.f7166n.m(L);
        } else if (L.q()) {
            L.f7162j &= -33;
        }
        j(L);
        if (((RecyclerView) this.f72i).f1239f0 != null && !L.i()) {
            ((RecyclerView) this.f72i).f1239f0.d(L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00af, code lost:
    
        if (r6 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b3, code lost:
    
        if (r4 < 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b5, code lost:
    
        r6 = ((m3.a1) r5.get(r4)).f7155c;
        r7 = ((androidx.recyclerview.widget.RecyclerView) r11.f72i).f1256w0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c5, code lost:
    
        if (r7.f7875c == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c7, code lost:
    
        r8 = r7.f7876d * 2;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        if (r9 >= r8) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        if (r7.f7875c[r9] != r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        r9 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d4, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00da, code lost:
    
        if (r6 != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00dc, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d9, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(m3.a1 r12) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.h.j(m3.a1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.view.View r5) {
        /*
            r4 = this;
            m3.a1 r5 = androidx.recyclerview.widget.RecyclerView.L(r5)
            int r0 = r5.f7162j
            r1 = r0 & 12
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Le
            r1 = r2
            goto Lf
        Le:
            r1 = r3
        Lf:
            if (r1 != 0) goto L64
            r0 = r0 & 2
            if (r0 == 0) goto L17
            r0 = r2
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L64
            java.lang.Object r0 = r4.f72i
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            m3.h0 r0 = r0.f1239f0
            if (r0 == 0) goto L47
            java.util.List r1 = r5.e()
            m3.j r0 = (m3.j) r0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L41
            boolean r0 = r0.f7255g
            if (r0 == 0) goto L3b
            boolean r0 = r5.h()
            if (r0 == 0) goto L39
            goto L3b
        L39:
            r0 = r3
            goto L3c
        L3b:
            r0 = r2
        L3c:
            if (r0 == 0) goto L3f
            goto L41
        L3f:
            r0 = r3
            goto L42
        L41:
            r0 = r2
        L42:
            if (r0 == 0) goto L45
            goto L47
        L45:
            r0 = r3
            goto L48
        L47:
            r0 = r2
        L48:
            if (r0 == 0) goto L4b
            goto L64
        L4b:
            java.lang.Cloneable r0 = r4.f67d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L58
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f67d = r0
        L58:
            r5.f7166n = r4
            r5.o = r2
            java.lang.Cloneable r0 = r4.f67d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r5)
            goto L9b
        L64:
            boolean r0 = r5.h()
            if (r0 == 0) goto L90
            boolean r0 = r5.j()
            if (r0 != 0) goto L90
            java.lang.Object r0 = r4.f72i
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            m3.d0 r0 = r0.D
            boolean r0 = r0.f7193b
            if (r0 == 0) goto L7b
            goto L90
        L7b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
            r0.<init>(r1)
            java.lang.Object r1 = r4.f72i
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            java.lang.String r0 = a3.g.m(r1, r0)
            r5.<init>(r0)
            throw r5
        L90:
            r5.f7166n = r4
            r5.o = r3
            java.lang.Cloneable r0 = r4.f66c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r5)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.h.k(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x050f, code lost:
    
        if (r6.h() == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x056f, code lost:
    
        if (r7 == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x024d, code lost:
    
        if (r6.f7158f != 0) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0712 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m3.a1 l(int r18, long r19) {
        /*
            Method dump skipped, instructions count: 1866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.h.l(int, long):m3.a1");
    }

    public final void m(a1 a1Var) {
        if (a1Var.o) {
            ((ArrayList) this.f67d).remove(a1Var);
        } else {
            ((ArrayList) this.f66c).remove(a1Var);
        }
        a1Var.f7166n = null;
        a1Var.o = false;
        a1Var.f7162j &= -33;
    }

    public final void n() {
        int i10;
        Object obj = this.f72i;
        if (((RecyclerView) obj).E != null) {
            i10 = ((RecyclerView) obj).E.f7287j;
        } else {
            i10 = 0;
        }
        this.f65b = this.f64a + i10;
        Cloneable cloneable = this.f68e;
        for (int size = ((ArrayList) cloneable).size() - 1; size >= 0 && ((ArrayList) cloneable).size() > this.f65b; size--) {
            h(size);
        }
    }

    public h(RecyclerView recyclerView) {
        this.f72i = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f66c = arrayList;
        this.f67d = null;
        this.f68e = new ArrayList();
        this.f69f = Collections.unmodifiableList(arrayList);
        this.f64a = 2;
        this.f65b = 2;
    }
}
