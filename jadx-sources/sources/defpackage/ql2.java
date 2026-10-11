package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ql2 implements cm1 {
    public final long a;
    public final long b;
    public final v41 c;
    public final fj4 d;
    public final ArrayList e;
    public final te0 f;
    public final lp5 g;
    public final Executor h;
    public final long i;
    public final ArrayList j;
    public volatile boolean k;
    public final fj4 l;

    public ql2(ar3 ar3Var, fj4 fj4Var, te0 te0Var, Executor executor, long j, long j2, long j3) {
        vq3 vq3Var = ar3Var.b;
        vq3Var.getClass();
        this.c = d(vq3Var.a);
        this.d = fj4Var;
        this.e = new ArrayList(vq3Var.e);
        this.f = te0Var;
        this.h = executor;
        this.a = j2;
        this.b = j3;
        lp5 lp5Var = te0Var.x;
        lp5Var.getClass();
        this.g = lp5Var;
        this.j = new ArrayList();
        this.i = eq6.U(j);
        this.l = fj4Var;
    }

    public static void c(bm2 bm2Var, yl2 yl2Var, HashSet hashSet, ArrayList arrayList) {
        String str = bm2Var.a;
        long j = bm2Var.h + yl2Var.B;
        String str2 = yl2Var.D;
        if (str2 != null) {
            Uri j2 = et5.j(str, str2);
            if (hashSet.add(j2)) {
                arrayList.add(new dg5(j, d(j2)));
            }
        }
        arrayList.add(new dg5(j, new v41(et5.j(str, yl2Var.x), yl2Var.F, yl2Var.G)));
    }

    public static v41 d(Uri uri) {
        Map map = Collections.EMPTY_MAP;
        io3.w(uri, "The uri must be set.");
        return new v41(uri, 0L, 1, null, map, 0L, -1L, null, 1);
    }

    public static void g(ArrayList arrayList, long j) {
        dg5 dg5Var;
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            dg5 dg5Var2 = (dg5) arrayList.get(i2);
            v41 v41Var = dg5Var2.y;
            String str = v41Var.h;
            Uri uri = v41Var.a;
            if (str == null) {
                str = uri.toString();
            }
            Integer num = (Integer) hashMap.get(str);
            if (num == null) {
                dg5Var = null;
            } else {
                dg5Var = (dg5) arrayList.get(num.intValue());
            }
            if (dg5Var != null) {
                long j2 = dg5Var.x;
                v41 v41Var2 = dg5Var.y;
                if (dg5Var2.x <= j2 + j) {
                    Uri uri2 = v41Var2.a;
                    long j3 = v41Var2.g;
                    if (uri2.equals(uri)) {
                        long j4 = -1;
                        if (j3 != -1 && v41Var2.f + j3 == v41Var.f && Objects.equals(v41Var2.h, v41Var.h) && v41Var2.i == v41Var.i && v41Var2.c == v41Var.c && v41Var2.e.equals(v41Var.e)) {
                            long j5 = v41Var.g;
                            if (j5 != -1) {
                                j4 = j3 + j5;
                            }
                            v41 c = v41Var2.c(0L, j4);
                            num.getClass();
                            arrayList.set(num.intValue(), new dg5(j2, c));
                        }
                    }
                }
            }
            hashMap.put(str, Integer.valueOf(i));
            arrayList.set(i, dg5Var2);
            i++;
        }
        eq6.b0(arrayList, i, arrayList.size());
    }

    @Override // defpackage.cm1
    public final void a(hk1 hk1Var) {
        ArrayList arrayList;
        q41 q41Var;
        ArrayList arrayList2;
        q41 q41Var2;
        ue0 a;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        try {
            te0 te0Var = this.f;
            l33 l33Var = te0Var.A;
            if (l33Var != null) {
                q41Var = l33Var.H();
            } else {
                q41Var = null;
            }
            ue0 a2 = te0Var.a(q41Var, 1);
            gm2 e = e(a2, this.d, this.c, false);
            if (!this.e.isEmpty()) {
                e = (gm2) e.a(this.e);
            }
            ArrayList f = f(a2, e, false);
            Collections.sort(f);
            g(f, this.i);
            int size = f.size();
            int i = 0;
            long j = 0;
            long j2 = 0;
            for (int size2 = f.size() - 1; size2 >= 0; size2--) {
                v41 v41Var = ((dg5) f.get(size2)).y;
                String str = v41Var.h;
                if (str == null) {
                    str = v41Var.a.toString();
                }
                long j3 = v41Var.g;
                if (j3 == -1) {
                    long a3 = ry0.a(this.g.g(str));
                    if (a3 != -1) {
                        j3 = a3 - v41Var.f;
                    }
                }
                long j4 = j3;
                long e2 = this.g.e(v41Var.f, str, j4);
                j2 += e2;
                if (j4 != -1) {
                    if (j4 == e2) {
                        i++;
                        f.remove(size2);
                    }
                    if (j != -1) {
                        j += j4;
                    }
                } else {
                    j = -1;
                }
            }
            cg5 cg5Var = new cg5(hk1Var, j, size, j2, i);
            arrayDeque.addAll(f);
            while (!this.k && !arrayDeque.isEmpty()) {
                if (!arrayDeque2.isEmpty()) {
                    eg5 eg5Var = (eg5) arrayDeque2.removeFirst();
                    a = eg5Var.E;
                    bArr = eg5Var.G;
                } else {
                    te0 te0Var2 = this.f;
                    l33 l33Var2 = te0Var2.A;
                    if (l33Var2 != null) {
                        q41Var2 = l33Var2.H();
                    } else {
                        q41Var2 = null;
                    }
                    a = te0Var2.a(q41Var2, 1);
                    bArr = new byte[131072];
                }
                eg5 eg5Var2 = new eg5((dg5) arrayDeque.removeFirst(), a, cg5Var, bArr);
                b(eg5Var2);
                this.h.execute(eg5Var2);
                for (int size3 = this.j.size() - 1; size3 >= 0; size3--) {
                    eg5 eg5Var3 = (eg5) this.j.get(size3);
                    if (arrayDeque.isEmpty() || eg5Var3.y.e()) {
                        try {
                            eg5Var3.get();
                            h(size3);
                            arrayDeque2.addLast(eg5Var3);
                        } catch (ExecutionException e3) {
                            Throwable cause = e3.getCause();
                            cause.getClass();
                            if (!(cause instanceof IOException)) {
                                String str2 = eq6.a;
                                throw cause;
                            }
                            throw ((IOException) cause);
                        }
                    }
                }
                eg5Var2.x.b();
            }
            int i2 = 0;
            while (true) {
                int size4 = this.j.size();
                arrayList2 = this.j;
                if (i2 >= size4) {
                    break;
                }
                ((e85) arrayList2.get(i2)).cancel(true);
                i2++;
            }
            for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
                ((e85) this.j.get(size5)).b();
                h(size5);
            }
        } catch (Throwable th) {
            int i3 = 0;
            while (true) {
                int size6 = this.j.size();
                arrayList = this.j;
                if (i3 >= size6) {
                    break;
                }
                ((e85) arrayList.get(i3)).cancel(true);
                i3++;
            }
            for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
                ((e85) this.j.get(size7)).b();
                h(size7);
            }
            throw th;
        }
    }

    public final void b(e85 e85Var) {
        synchronized (this.j) {
            try {
                if (!this.k) {
                    this.j.add(e85Var);
                } else {
                    throw new InterruptedException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cm1
    public final void cancel() {
        synchronized (this.j) {
            try {
                this.k = true;
                for (int i = 0; i < this.j.size(); i++) {
                    ((e85) this.j.get(i)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final gm2 e(ue0 ue0Var, fj4 fj4Var, v41 v41Var, boolean z) {
        Object obj;
        fj4Var.getClass();
        if (z) {
            bg5 bg5Var = new bg5(ue0Var, fj4Var, v41Var);
            bg5Var.run();
            try {
                obj = bg5Var.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    String str = eq6.a;
                    throw e;
                }
                throw ((IOException) cause);
            }
        } else if (!this.k) {
            bg5 bg5Var2 = new bg5(ue0Var, fj4Var, v41Var);
            b(bg5Var2);
            this.h.execute(bg5Var2);
            try {
                try {
                    Object obj2 = bg5Var2.get();
                    bg5Var2.b();
                    synchronized (this.j) {
                        this.j.remove(bg5Var2);
                    }
                    obj = obj2;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    cause2.getClass();
                    if (!(cause2 instanceof IOException)) {
                        String str2 = eq6.a;
                        throw e2;
                    }
                    throw ((IOException) cause2);
                }
            } catch (Throwable th) {
                bg5Var2.b();
                synchronized (this.j) {
                    this.j.remove(bg5Var2);
                    throw th;
                }
            }
        } else {
            throw new InterruptedException();
        }
        return (gm2) obj;
    }

    public final ArrayList f(ue0 ue0Var, gm2 gm2Var, boolean z) {
        fj4 fj4Var;
        ArrayList arrayList;
        fj4 fj4Var2;
        long j;
        ql2 ql2Var = this;
        boolean z2 = z;
        ArrayList arrayList2 = new ArrayList();
        fm2 fm2Var = fm2.o;
        if (gm2Var instanceof fm2) {
            fm2Var = (fm2) gm2Var;
            List list = fm2Var.d;
            for (int i = 0; i < list.size(); i++) {
                arrayList2.add(d((Uri) list.get(i)));
            }
        } else {
            arrayList2.add(d(Uri.parse(gm2Var.a)));
        }
        if (!fm2Var.l.isEmpty()) {
            fj4Var = new im2(fm2Var, null);
        } else {
            fj4Var = ql2Var.l;
        }
        fj4 fj4Var3 = fj4Var;
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = new HashSet();
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            v41 v41Var = (v41) arrayList2.get(i2);
            long j2 = 0;
            arrayList3.add(new dg5(0L, v41Var));
            try {
                bm2 bm2Var = (bm2) ql2Var.e(ue0Var, fj4Var3, v41Var, z2);
                nw2 nw2Var = bm2Var.r;
                if (!z2) {
                    j2 = ql2Var.a;
                }
                if (z2) {
                    j = -9223372036854775807L;
                } else {
                    j = ql2Var.b;
                }
                yl2 yl2Var = null;
                int i4 = 0;
                while (true) {
                    if (i4 < nw2Var.size()) {
                        yl2 yl2Var2 = (yl2) nw2Var.get(i4);
                        arrayList = arrayList2;
                        fj4Var2 = fj4Var3;
                        long j3 = bm2Var.h + yl2Var2.B;
                        if (j3 + yl2Var2.z > j2) {
                            if (j == -9223372036854775807L || j3 < j2 + j) {
                                yl2 yl2Var3 = yl2Var2.y;
                                if (yl2Var3 != null && yl2Var3 != yl2Var) {
                                    c(bm2Var, yl2Var3, hashSet, arrayList3);
                                    yl2Var = yl2Var3;
                                }
                                c(bm2Var, yl2Var2, hashSet, arrayList3);
                            }
                        }
                        i4++;
                        arrayList2 = arrayList;
                        fj4Var3 = fj4Var2;
                    } else {
                        arrayList = arrayList2;
                        fj4Var2 = fj4Var3;
                        break;
                    }
                }
            } catch (IOException e) {
                arrayList = arrayList2;
                fj4Var2 = fj4Var3;
                if (!z) {
                    throw e;
                }
            }
            ql2Var = this;
            z2 = z;
            i2 = i3;
            arrayList2 = arrayList;
            fj4Var3 = fj4Var2;
        }
        return arrayList3;
    }

    public final void h(int i) {
        synchronized (this.j) {
            this.j.remove(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r3 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        r3 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        r0.k(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 != null) goto L22;
     */
    @Override // defpackage.cm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remove() {
        /*
            r7 = this;
            lp5 r0 = r7.g
            v41 r1 = r7.c
            android.net.Uri r2 = r1.a
            java.lang.String r3 = r1.h
            te0 r4 = r7.f
            r5 = 0
            r6 = 1
            ue0 r4 = r4.a(r5, r6)
            fj4 r5 = r7.d     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L47 java.lang.InterruptedException -> L52
            gm2 r1 = r7.e(r4, r5, r1, r6)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L47 java.lang.InterruptedException -> L52
            java.util.ArrayList r7 = r7.f(r4, r1, r6)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L47 java.lang.InterruptedException -> L52
            r1 = 0
        L1b:
            int r4 = r7.size()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L47 java.lang.InterruptedException -> L52
            if (r1 >= r4) goto L3c
            java.lang.Object r4 = r7.get(r1)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L47 java.lang.InterruptedException -> L52
            dg5 r4 = (defpackage.dg5) r4     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L47 java.lang.InterruptedException -> L52
            v41 r4 = r4.y     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L47 java.lang.InterruptedException -> L52
            java.lang.String r5 = r4.h     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L47 java.lang.InterruptedException -> L52
            if (r5 == 0) goto L2e
            goto L34
        L2e:
            android.net.Uri r4 = r4.a     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L47 java.lang.InterruptedException -> L52
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L47 java.lang.InterruptedException -> L52
        L34:
            r0.k(r5)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L47 java.lang.InterruptedException -> L52
            int r1 = r1 + 1
            goto L1b
        L3a:
            r7 = move-exception
            goto L5d
        L3c:
            if (r3 == 0) goto L3f
            goto L43
        L3f:
            java.lang.String r3 = r2.toString()
        L43:
            r0.k(r3)
            return
        L47:
            if (r3 == 0) goto L4a
            goto L4e
        L4a:
            java.lang.String r3 = r2.toString()
        L4e:
            r0.k(r3)
            goto L5c
        L52:
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3a
            r7.interrupt()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L4a
            goto L4e
        L5c:
            return
        L5d:
            if (r3 == 0) goto L60
            goto L64
        L60:
            java.lang.String r3 = r2.toString()
        L64:
            r0.k(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql2.remove():void");
    }
}
