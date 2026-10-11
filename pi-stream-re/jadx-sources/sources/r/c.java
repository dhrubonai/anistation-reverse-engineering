package r;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f9259k;

    /* renamed from: l, reason: collision with root package name */
    public int f9260l;

    public c(q.e eVar, int i10) {
        super(eVar);
        q.e eVar2;
        n nVar;
        boolean z9;
        int i11;
        n nVar2;
        this.f9259k = new ArrayList();
        this.f9293f = i10;
        q.e eVar3 = this.f9289b;
        q.e l10 = eVar3.l(i10);
        while (true) {
            q.e eVar4 = l10;
            eVar2 = eVar3;
            eVar3 = eVar4;
            if (eVar3 == null) {
                break;
            } else {
                l10 = eVar3.l(this.f9293f);
            }
        }
        this.f9289b = eVar2;
        int i12 = this.f9293f;
        if (i12 == 0) {
            nVar = eVar2.f8825d;
        } else if (i12 == 1) {
            nVar = eVar2.f8826e;
        } else {
            nVar = null;
        }
        ArrayList arrayList = this.f9259k;
        arrayList.add(nVar);
        q.e k10 = eVar2.k(this.f9293f);
        while (k10 != null) {
            int i13 = this.f9293f;
            if (i13 == 0) {
                nVar2 = k10.f8825d;
            } else if (i13 == 1) {
                nVar2 = k10.f8826e;
            } else {
                nVar2 = null;
            }
            arrayList.add(nVar2);
            k10 = k10.k(this.f9293f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n nVar3 = (n) it.next();
            int i14 = this.f9293f;
            if (i14 == 0) {
                nVar3.f9289b.f8821b = this;
            } else if (i14 == 1) {
                nVar3.f9289b.f8823c = this;
            }
        }
        if (this.f9293f == 0 && ((q.f) this.f9289b.I).f8851h0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && arrayList.size() > 1) {
            this.f9289b = ((n) arrayList.get(arrayList.size() - 1)).f9289b;
        }
        if (this.f9293f == 0) {
            i11 = this.f9289b.X;
        } else {
            i11 = this.f9289b.Y;
        }
        this.f9260l = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0196, code lost:
    
        if (r2 != r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01bb, code lost:
    
        r1.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01b8, code lost:
    
        r14 = r14 + 1;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01b6, code lost:
    
        if (r2 != r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x03c3, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    @Override // r.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r.d r27) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.c.a(r.d):void");
    }

    @Override // r.n
    public final void d() {
        ArrayList arrayList = this.f9259k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        q.e eVar = ((n) arrayList.get(0)).f9289b;
        q.e eVar2 = ((n) arrayList.get(size - 1)).f9289b;
        int i10 = this.f9293f;
        g gVar = this.f9296i;
        g gVar2 = this.f9295h;
        if (i10 == 0) {
            q.d dVar = eVar.f8844x;
            q.d dVar2 = eVar2.f8846z;
            g i11 = n.i(dVar, 0);
            int c6 = dVar.c();
            q.e m5 = m();
            if (m5 != null) {
                c6 = m5.f8844x.c();
            }
            if (i11 != null) {
                n.b(gVar2, i11, c6);
            }
            g i12 = n.i(dVar2, 0);
            int c10 = dVar2.c();
            q.e n9 = n();
            if (n9 != null) {
                c10 = n9.f8846z.c();
            }
            if (i12 != null) {
                n.b(gVar, i12, -c10);
            }
        } else {
            q.d dVar3 = eVar.f8845y;
            q.d dVar4 = eVar2.A;
            g i13 = n.i(dVar3, 1);
            int c11 = dVar3.c();
            q.e m9 = m();
            if (m9 != null) {
                c11 = m9.f8845y.c();
            }
            if (i13 != null) {
                n.b(gVar2, i13, c11);
            }
            g i14 = n.i(dVar4, 1);
            int c12 = dVar4.c();
            q.e n10 = n();
            if (n10 != null) {
                c12 = n10.A.c();
            }
            if (i14 != null) {
                n.b(gVar, i14, -c12);
            }
        }
        gVar2.f9270a = this;
        gVar.f9270a = this;
    }

    @Override // r.n
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9259k;
            if (i10 < arrayList.size()) {
                ((n) arrayList.get(i10)).e();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // r.n
    public final void f() {
        this.f9290c = null;
        Iterator it = this.f9259k.iterator();
        while (it.hasNext()) {
            ((n) it.next()).f();
        }
    }

    @Override // r.n
    public final long j() {
        ArrayList arrayList = this.f9259k;
        int size = arrayList.size();
        long j4 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j4 = r5.f9296i.f9275f + ((n) arrayList.get(i10)).j() + j4 + r5.f9295h.f9275f;
        }
        return j4;
    }

    @Override // r.n
    public final boolean k() {
        ArrayList arrayList = this.f9259k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((n) arrayList.get(i10)).k()) {
                return false;
            }
        }
        return true;
    }

    public final q.e m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9259k;
            if (i10 < arrayList.size()) {
                q.e eVar = ((n) arrayList.get(i10)).f9289b;
                if (eVar.V != 8) {
                    return eVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final q.e n() {
        ArrayList arrayList = this.f9259k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q.e eVar = ((n) arrayList.get(size)).f9289b;
            if (eVar.V != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        if (this.f9293f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        String concat = "ChainRun ".concat(str);
        Iterator it = this.f9259k.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            concat = a3.g.s(a3.g.s(concat, "<") + nVar, "> ");
        }
        return concat;
    }
}
