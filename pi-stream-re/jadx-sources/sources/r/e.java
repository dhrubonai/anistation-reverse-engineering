package r;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import f1.v;
import f1.w;
import f1.x;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9261a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9262b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9263c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9264d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9265e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractCollection f9266f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractCollection f9267g;

    /* renamed from: h, reason: collision with root package name */
    public Object f9268h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f9269i;

    public e(q.f fVar) {
        this.f9261a = true;
        this.f9262b = true;
        this.f9265e = new ArrayList();
        this.f9266f = new ArrayList();
        this.f9268h = null;
        this.f9269i = new b();
        this.f9267g = new ArrayList();
        this.f9263c = fVar;
        this.f9264d = fVar;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f9269i) {
            if (this.f9261a) {
                return;
            }
            ((CopyOnWriteArraySet) this.f9266f).add(new f1.n(obj));
        }
    }

    public final void b(g gVar, int i10, int i11, ArrayList arrayList, l lVar) {
        n nVar = gVar.f9273d;
        if (nVar.f9290c == null) {
            q.f fVar = (q.f) this.f9263c;
            if (nVar != fVar.f8825d && nVar != fVar.f8826e) {
                if (lVar == null) {
                    lVar = new l(nVar);
                    arrayList.add(lVar);
                }
                nVar.f9290c = lVar;
                lVar.f9285b.add(nVar);
                g gVar2 = nVar.f9295h;
                Iterator it = gVar2.f9280k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof g) {
                        b((g) dVar, i10, 0, arrayList, lVar);
                    }
                }
                g gVar3 = nVar.f9296i;
                Iterator it2 = gVar3.f9280k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof g) {
                        b((g) dVar2, i10, 1, arrayList, lVar);
                    }
                }
                if (i10 == 1 && (nVar instanceof m)) {
                    Iterator it3 = ((m) nVar).f9286k.f9280k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof g) {
                            b((g) dVar3, i10, 2, arrayList, lVar);
                        }
                    }
                }
                Iterator it4 = gVar2.f9281l.iterator();
                while (it4.hasNext()) {
                    b((g) it4.next(), i10, 0, arrayList, lVar);
                }
                Iterator it5 = gVar3.f9281l.iterator();
                while (it5.hasNext()) {
                    b((g) it5.next(), i10, 1, arrayList, lVar);
                }
                if (i10 == 1 && (nVar instanceof m)) {
                    Iterator it6 = ((m) nVar).f9286k.f9281l.iterator();
                    while (it6.hasNext()) {
                        b((g) it6.next(), i10, 2, arrayList, lVar);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024a, code lost:
    
        if (r10 != 2) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x024c, code lost:
    
        if (r12 != 2) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x024e, code lost:
    
        r0 = r11[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0251, code lost:
    
        if (r0 == r2) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0253, code lost:
    
        if (r0 != r2) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0255, code lost:
    
        r0 = r11[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0257, code lost:
    
        if (r0 == r2) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0259, code lost:
    
        if (r0 != r2) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x025b, code lost:
    
        h(r3, 1, (int) ((r7 * r17.m()) + 0.5f), 1, (int) ((r8 * r17.j()) + 0.5f));
        r13.d(r3.m());
        r15.d(r3.j());
        r3.f8819a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0287, code lost:
    
        h(r3, 2, 0, 2, 0);
        r13.f9282m = r3.m();
        r15.f9282m = r3.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00ca, code lost:
    
        if (r12 != 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00cc, code lost:
    
        if (r5 != r0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00ce, code lost:
    
        r13 = r4;
        r15 = r9;
        h(r3, 2, 0, 2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00de, code lost:
    
        r9 = r3.j();
        h(r3, 1, (int) ((r9 * r3.L) + 0.5f), 1, r9);
        r13.d(r3.m());
        r15.d(r3.j());
        r3.f8819a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00dc, code lost:
    
        r13 = r4;
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0105, code lost:
    
        r13 = r4;
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0108, code lost:
    
        if (r12 != 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x010a, code lost:
    
        h(r3, 2, 0, r5, 0);
        r13.f9282m = r3.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x011d, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x011f, code lost:
    
        if (r12 != 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0121, code lost:
    
        r4 = r11[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0125, code lost:
    
        if (r4 == 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0128, code lost:
    
        if (r4 != 4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0162, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x012a, code lost:
    
        h(r3, 1, (int) ((r7 * r17.m()) + 0.5f), r0, r3.j());
        r13.d(r3.m());
        r15.d(r3.j());
        r3.f8819a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0159, code lost:
    
        if (r14[0].f8815d == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x015f, code lost:
    
        if (r14[1].f8815d != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0164, code lost:
    
        h(r3, 2, 0, r0, 0);
        r13.d(r3.m());
        r15.d(r3.j());
        r3.f8819a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0181, code lost:
    
        r13 = r4;
        r0 = r5;
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00b3, code lost:
    
        if (r5 == 2) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00aa, code lost:
    
        if (r6 == 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r11 = r2.f8824c0;
        r14 = r3.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
    
        if (r6 != 3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00be, code lost:
    
        if (r5 == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c1, code lost:
    
        if (r5 != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
    
        r0 = r5;
        r15 = r9;
        r2 = 1;
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0185, code lost:
    
        r4 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0186, code lost:
    
        if (r0 != 3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0189, code lost:
    
        if (r6 == 2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018b, code lost:
    
        if (r6 != r2) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018d, code lost:
    
        if (r10 != 3) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018f, code lost:
    
        if (r6 != 2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0191, code lost:
    
        h(r3, 2, 0, 2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019b, code lost:
    
        r7 = r3.m();
        r0 = r3.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a4, code lost:
    
        if (r3.M != (-1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a6, code lost:
    
        r0 = 1.0f / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01aa, code lost:
    
        h(r3, 1, r7, 1, (int) ((r7 * r0) + 0.5f));
        r13.d(r3.m());
        r15.d(r3.j());
        r3.f8819a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cc, code lost:
    
        if (r10 != 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ce, code lost:
    
        h(r3, r6, 0, 2, 0);
        r15.f9282m = r3.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e0, code lost:
    
        if (r10 != 2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e2, code lost:
    
        r4 = r11[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e5, code lost:
    
        if (r4 == 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e8, code lost:
    
        if (r4 != 4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0220, code lost:
    
        r2 = 1;
        r4 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ea, code lost:
    
        h(r3, r6, r3.m(), 1, (int) ((r8 * r17.j()) + 0.5f));
        r13.d(r3.m());
        r15.d(r3.j());
        r3.f8819a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0216, code lost:
    
        if (r14[2].f8815d == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x021d, code lost:
    
        if (r14[3].f8815d != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0223, code lost:
    
        h(r3, 2, 0, r0, 0);
        r13.d(r3.m());
        r15.d(r3.j());
        r3.f8819a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0240, code lost:
    
        if (r6 != r4) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0242, code lost:
    
        if (r0 != r4) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0244, code lost:
    
        if (r12 == r2) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0246, code lost:
    
        if (r10 != r2) goto L130;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(q.f r17) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.e.c(q.f):void");
    }

    public final void d() {
        ArrayList arrayList = (ArrayList) this.f9265e;
        arrayList.clear();
        q.f fVar = (q.f) this.f9264d;
        fVar.f8825d.f();
        m mVar = fVar.f8826e;
        mVar.f();
        arrayList.add(fVar.f8825d);
        arrayList.add(mVar);
        Iterator it = fVar.f8847d0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            q.e eVar = (q.e) it.next();
            if (eVar instanceof q.i) {
                arrayList.add(new i(eVar));
            } else {
                if (eVar.r()) {
                    if (eVar.f8821b == null) {
                        eVar.f8821b = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f8821b);
                } else {
                    arrayList.add(eVar.f8825d);
                }
                if (eVar.s()) {
                    if (eVar.f8823c == null) {
                        eVar.f8823c = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f8823c);
                } else {
                    arrayList.add(eVar.f8826e);
                }
                if (eVar instanceof q.k) {
                    arrayList.add(new j(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((n) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            n nVar = (n) it3.next();
            if (nVar.f9289b != fVar) {
                nVar.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f9267g;
        arrayList2.clear();
        q.f fVar2 = (q.f) this.f9263c;
        f(fVar2.f8825d, 0, arrayList2);
        f(fVar2.f8826e, 1, arrayList2);
        this.f9261a = false;
    }

    public final int e(q.f fVar, int i10) {
        int i11;
        long j4;
        long j10;
        ArrayList arrayList;
        n nVar;
        n nVar2;
        long j11;
        float f10;
        long j12;
        q.f fVar2 = fVar;
        ArrayList arrayList2 = (ArrayList) this.f9267g;
        int size = arrayList2.size();
        int i12 = 0;
        long j13 = 0;
        while (i12 < size) {
            n nVar3 = ((l) arrayList2.get(i12)).f9284a;
            if (!(nVar3 instanceof c) ? !(i10 != 0 ? (nVar3 instanceof m) : (nVar3 instanceof k)) : ((c) nVar3).f9293f != i10) {
                i11 = size;
                j4 = j13;
                j10 = 0;
                arrayList = arrayList2;
            } else {
                if (i10 == 0) {
                    nVar = fVar2.f8825d;
                } else {
                    nVar = fVar2.f8826e;
                }
                g gVar = nVar.f9295h;
                if (i10 == 0) {
                    nVar2 = fVar2.f8825d;
                } else {
                    nVar2 = fVar2.f8826e;
                }
                g gVar2 = nVar2.f9296i;
                boolean contains = nVar3.f9295h.f9281l.contains(gVar);
                g gVar3 = nVar3.f9296i;
                boolean contains2 = gVar3.f9281l.contains(gVar2);
                long j14 = nVar3.j();
                g gVar4 = nVar3.f9295h;
                if (contains && contains2) {
                    long b10 = l.b(gVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i11 = size;
                    long a10 = l.a(gVar3, 0L);
                    long j15 = b10 - j14;
                    int i13 = gVar3.f9275f;
                    j11 = j13;
                    arrayList = arrayList3;
                    if (j15 >= (-i13)) {
                        j15 += i13;
                    }
                    long j16 = (-a10) - j14;
                    long j17 = gVar4.f9275f;
                    long j18 = j16 - j17;
                    if (j18 >= j17) {
                        j18 -= j17;
                    }
                    q.e eVar = nVar3.f9289b;
                    if (i10 == 0) {
                        f10 = eVar.S;
                    } else if (i10 == 1) {
                        f10 = eVar.T;
                    } else {
                        eVar.getClass();
                        f10 = -1.0f;
                    }
                    if (f10 > 0.0f) {
                        j12 = (((float) j15) / (1.0f - f10)) + (((float) j18) / f10);
                    } else {
                        j12 = 0;
                    }
                    float f11 = (float) j12;
                    j10 = (gVar4.f9275f + ((((f11 * f10) + 0.5f) + j14) + (((1.0f - f10) * f11) + 0.5f))) - gVar3.f9275f;
                } else {
                    i11 = size;
                    j11 = j13;
                    arrayList = arrayList2;
                    if (contains) {
                        j10 = Math.max(l.b(gVar4, gVar4.f9275f), gVar4.f9275f + j14);
                    } else if (contains2) {
                        j10 = Math.max(-l.a(gVar3, gVar3.f9275f), (-gVar3.f9275f) + j14);
                    } else {
                        j10 = (nVar3.j() + gVar4.f9275f) - gVar3.f9275f;
                    }
                }
                j4 = j11;
            }
            i12++;
            arrayList2 = arrayList;
            size = i11;
            j13 = Math.max(j4, j10);
            fVar2 = fVar;
        }
        return (int) j13;
    }

    public final void f(n nVar, int i10, ArrayList arrayList) {
        g gVar;
        Iterator it = nVar.f9295h.f9280k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            gVar = nVar.f9296i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof g) {
                b((g) dVar, i10, 0, arrayList, null);
            } else if (dVar instanceof n) {
                b(((n) dVar).f9295h, i10, 0, arrayList, null);
            }
        }
        Iterator it2 = gVar.f9280k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof g) {
                b((g) dVar2, i10, 1, arrayList, null);
            } else if (dVar2 instanceof n) {
                b(((n) dVar2).f9296i, i10, 1, arrayList, null);
            }
        }
        if (i10 == 1) {
            Iterator it3 = ((m) nVar).f9286k.f9280k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof g) {
                    b((g) dVar3, i10, 2, arrayList, null);
                }
            }
        }
    }

    public final void g() {
        m();
        if (((ArrayDeque) this.f9268h).isEmpty()) {
            return;
        }
        x xVar = (x) ((f1.i) this.f9264d);
        if (!xVar.f3866a.hasMessages(0)) {
            xVar.getClass();
            w b10 = x.b();
            b10.f3864a = xVar.f3866a.obtainMessage(0);
            xVar.getClass();
            Message message = b10.f3864a;
            message.getClass();
            xVar.f3866a.sendMessageAtFrontOfQueue(message);
            b10.f3864a = null;
            ArrayList arrayList = x.f3865b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(b10);
                }
            }
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f9267g;
        boolean z9 = !arrayDeque.isEmpty();
        arrayDeque.addAll((ArrayDeque) this.f9268h);
        ((ArrayDeque) this.f9268h).clear();
        if (z9) {
            return;
        }
        while (!arrayDeque.isEmpty()) {
            ((Runnable) arrayDeque.peekFirst()).run();
            arrayDeque.removeFirst();
        }
    }

    public final void h(q.e eVar, int i10, int i11, int i12, int i13) {
        boolean z9;
        b bVar = (b) this.f9269i;
        bVar.f9249a = i10;
        bVar.f9250b = i12;
        bVar.f9251c = i11;
        bVar.f9252d = i13;
        ((s.e) this.f9268h).a(eVar, bVar);
        eVar.z(bVar.f9253e);
        eVar.w(bVar.f9254f);
        eVar.f8843w = bVar.f9256h;
        int i14 = bVar.f9255g;
        eVar.P = i14;
        if (i14 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        eVar.f8843w = z9;
    }

    public final void i() {
        boolean z9;
        a aVar;
        Iterator it = ((q.f) this.f9263c).f8847d0.iterator();
        while (it.hasNext()) {
            q.e eVar = (q.e) it.next();
            if (!eVar.f8819a) {
                int[] iArr = eVar.f8824c0;
                boolean z10 = false;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = eVar.f8831j;
                int i13 = eVar.f8832k;
                if (i10 != 2 && (i10 != 3 || i12 != 1)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (i11 == 2 || (i11 == 3 && i13 == 1)) {
                    z10 = true;
                }
                k kVar = eVar.f8825d;
                h hVar = kVar.f9292e;
                boolean z11 = hVar.f9279j;
                m mVar = eVar.f8826e;
                h hVar2 = mVar.f9292e;
                boolean z12 = hVar2.f9279j;
                if (z11 && z12) {
                    h(eVar, 1, hVar.f9276g, 1, hVar2.f9276g);
                    eVar.f8819a = true;
                } else if (z11 && z10) {
                    h(eVar, 1, hVar.f9276g, 2, hVar2.f9276g);
                    h hVar3 = mVar.f9292e;
                    if (i11 == 3) {
                        hVar3.f9282m = eVar.j();
                    } else {
                        hVar3.d(eVar.j());
                        eVar.f8819a = true;
                    }
                } else if (z12 && z9) {
                    h(eVar, 2, hVar.f9276g, 1, hVar2.f9276g);
                    h hVar4 = kVar.f9292e;
                    if (i10 == 3) {
                        hVar4.f9282m = eVar.m();
                    } else {
                        hVar4.d(eVar.m());
                        eVar.f8819a = true;
                    }
                }
                if (eVar.f8819a && (aVar = mVar.f9287l) != null) {
                    aVar.d(eVar.P);
                }
            }
        }
    }

    public final void j(int i10, f1.l lVar) {
        m();
        ((ArrayDeque) this.f9268h).add(new f1.k(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f9266f), i10, lVar, 0));
    }

    public final void k() {
        m();
        synchronized (this.f9269i) {
            this.f9261a = true;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f9266f).iterator();
        while (it.hasNext()) {
            f1.n nVar = (f1.n) it.next();
            f1.m mVar = (f1.m) this.f9265e;
            nVar.f3837d = true;
            if (nVar.f3836c) {
                nVar.f3836c = false;
                mVar.b(nVar.f3834a, nVar.f3835b.b());
            }
        }
        ((CopyOnWriteArraySet) this.f9266f).clear();
    }

    public final void l(int i10, f1.l lVar) {
        j(i10, lVar);
        g();
    }

    public final void m() {
        boolean z9;
        if (!this.f9262b) {
            return;
        }
        if (Thread.currentThread() == ((x) ((f1.i) this.f9264d)).f3866a.getLooper().getThread()) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
    }

    public e(Looper looper, f1.a aVar, f1.m mVar) {
        this(new CopyOnWriteArraySet(), looper, aVar, mVar, true);
    }

    public e(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, f1.a aVar, f1.m mVar, boolean z9) {
        this.f9263c = aVar;
        this.f9266f = copyOnWriteArraySet;
        this.f9265e = mVar;
        this.f9269i = new Object();
        this.f9267g = new ArrayDeque();
        this.f9268h = new ArrayDeque();
        this.f9264d = ((v) aVar).a(looper, new Handler.Callback() { // from class: f1.j
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                r.e eVar = r.e.this;
                Iterator it = ((CopyOnWriteArraySet) eVar.f9266f).iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    m mVar2 = (m) eVar.f9265e;
                    if (!nVar.f3837d && nVar.f3836c) {
                        c1.s b10 = nVar.f3835b.b();
                        nVar.f3835b = new c1.r(0);
                        nVar.f3836c = false;
                        mVar2.b(nVar.f3834a, b10);
                    }
                    if (((x) ((i) eVar.f9264d)).f3866a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f9262b = z9;
    }
}
