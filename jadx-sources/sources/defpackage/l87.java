package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l87 implements g25, ux7, hs7 {
    public static l87 B;
    public Object A;
    public final /* synthetic */ byte x;
    public Object y;
    public Object z;

    public l87(byte b) {
        this.x = b;
        switch (b) {
            case 1:
                this.y = new mc7("", 0L, null);
                this.z = new mc7("", 0L, null);
                this.A = new ArrayList();
                return;
            case 8:
                this.y = new AtomicBoolean(false);
                new ConcurrentHashMap();
                this.z = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.A = new ConcurrentHashMap();
                return;
            default:
                List list = Collections.EMPTY_LIST;
                this.y = list;
                this.z = list;
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    @Override // defpackage.ux7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r8, java.lang.Throwable r9, byte[] r10) {
        /*
            r7 = this;
            java.lang.Object r10 = r7.y
            qx7 r10 = (defpackage.qx7) r10
            r10.L()
            java.lang.Object r0 = r7.A
            c18 r0 = (defpackage.c18) r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r8 == r1) goto L18
            r1 = 204(0xcc, float:2.86E-43)
            if (r8 == r1) goto L18
            r1 = 304(0x130, float:4.26E-43)
            if (r8 != r1) goto L33
            r8 = r1
        L18:
            if (r9 != 0) goto L33
            java.lang.Object r8 = r10.x
            gu7 r8 = (defpackage.gu7) r8
            es7 r8 = r8.C
            defpackage.gu7.l(r8)
            bs7 r8 = r8.K
            long r1 = r0.x
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "[sgtm] Upload succeeded for row_id"
            r8.b(r9, r1)
            by7 r8 = defpackage.by7.SUCCESS
            goto L6f
        L33:
            java.lang.Object r1 = r10.x
            gu7 r1 = (defpackage.gu7) r1
            es7 r1 = r1.C
            defpackage.gu7.l(r1)
            bs7 r1 = r1.F
            long r2 = r0.x
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.String r4 = "[sgtm] Upload failed for row_id. response, exception"
            r1.d(r4, r2, r3, r9)
            sq7 r9 = defpackage.tq7.u
            r1 = 0
            java.lang.Object r9 = r9.a(r1)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r1 = ","
            java.lang.String[] r9 = r9.split(r1)
            java.util.List r9 = java.util.Arrays.asList(r9)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto L6d
            by7 r8 = defpackage.by7.BACKOFF
            goto L6f
        L6d:
            by7 r8 = defpackage.by7.FAILURE
        L6f:
            java.lang.Object r7 = r7.z
            java.util.concurrent.atomic.AtomicReference r7 = (java.util.concurrent.atomic.AtomicReference) r7
            java.lang.Object r9 = r10.x
            gu7 r9 = (defpackage.gu7) r9
            zz7 r9 = r9.n()
            mg7 r1 = new mg7
            long r2 = r0.x
            byte r4 = r8.x
            long r5 = r0.C
            r1.<init>(r2, r4, r5)
            r9.L()
            r9.M()
            r0 = 1
            b48 r0 = r9.b0(r0)
            t35 r4 = new t35
            r5 = 10
            r4.<init>(r9, r0, r1, r5)
            r9.Z(r4)
            java.lang.Object r9 = r10.x
            gu7 r9 = (defpackage.gu7) r9
            es7 r9 = r9.C
            defpackage.gu7.l(r9)
            bs7 r9 = r9.K
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "[sgtm] Updated status for row_id"
            r9.c(r0, r10, r8)
            monitor-enter(r7)
            r7.set(r8)     // Catch: java.lang.Throwable -> Lb8
            r7.notifyAll()     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb8
            return
        Lb8:
            r0 = move-exception
            r8 = r0
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb8
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l87.a(int, java.lang.Throwable, byte[]):void");
    }

    @Override // defpackage.g25
    public void accept(Object obj, Object obj2) {
        p76 p76Var = (p76) obj2;
        switch (this.x) {
            case 3:
                String str = (String) this.z;
                String str2 = (String) this.A;
                t98 t98Var = (t98) obj;
                sm7 sm7Var = (sm7) this.y;
                HashMap hashMap = sm7Var.B;
                long incrementAndGet = sm7Var.q.incrementAndGet();
                sm7Var.j();
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), p76Var);
                    Context context = t98Var.c;
                    lp i = rv5.i();
                    uh7 uh7Var = (uh7) t98Var.m();
                    Parcel K = uh7Var.K();
                    K.writeString(str);
                    K.writeString(str2);
                    K.writeLong(incrementAndGet);
                    nn7.b(K, i);
                    uh7Var.O(K, 9);
                    return;
                } catch (RemoteException e) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    p76Var.a(e);
                    return;
                }
            case 4:
                sm7 sm7Var2 = (sm7) this.y;
                String str3 = (String) this.z;
                aa3 aa3Var = (aa3) this.A;
                sm7Var2.j();
                uh7 uh7Var2 = (uh7) ((t98) obj).m();
                lp i2 = rv5.i();
                Parcel K2 = uh7Var2.K();
                K2.writeString(str3);
                nn7.b(K2, aa3Var);
                nn7.b(K2, i2);
                uh7Var2.O(K2, 13);
                synchronized (sm7Var2.r) {
                    try {
                        if (sm7Var2.o != null) {
                            sm7Var2.l(2477);
                        }
                        sm7Var2.o = p76Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                sm7 sm7Var3 = (sm7) this.y;
                String str4 = (String) this.z;
                s25 s25Var = (s25) this.A;
                t98 t98Var2 = (t98) obj;
                boolean z = true;
                if (sm7Var3.F == 1) {
                    z = false;
                }
                a34.A("Not active connection", z);
                Context context2 = t98Var2.c;
                lp i3 = rv5.i();
                uh7 uh7Var3 = (uh7) t98Var2.m();
                Parcel K3 = uh7Var3.K();
                K3.writeString(str4);
                nn7.b(K3, i3);
                uh7Var3.O(K3, 12);
                if (s25Var != null) {
                    uh7 uh7Var4 = (uh7) t98Var2.m();
                    Parcel K4 = uh7Var4.K();
                    K4.writeString(str4);
                    nn7.b(K4, i3);
                    uh7Var4.O(K4, 11);
                }
                p76Var.b(null);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0088  */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.String] */
    @Override // defpackage.hs7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r5, int r6, java.lang.Throwable r7, byte[] r8, java.util.Map r9) {
        /*
            r4 = this;
            java.lang.Object r5 = r4.z
            b28 r5 = (defpackage.b28) r5
            long r0 = r5.a
            java.lang.Object r5 = r4.A
            z18 r5 = (defpackage.z18) r5
            java.lang.Object r4 = r4.y
            java.lang.String r4 = (java.lang.String) r4
            au7 r9 = r5.f()
            r9.L()
            r5.l0()
            r9 = 0
            if (r8 != 0) goto L21
            byte[] r8 = new byte[r9]     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r4 = move-exception
            goto La1
        L21:
            r2 = 200(0xc8, float:2.8E-43)
            if (r6 == r2) goto L2a
            r2 = 204(0xcc, float:2.86E-43)
            if (r6 != r2) goto L65
            r6 = r2
        L2a:
            if (r7 != 0) goto L65
            fl7 r7 = r5.z     // Catch: java.lang.Throwable -> L1e
            defpackage.z18.T(r7)     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1e
            r7.S(r8)     // Catch: java.lang.Throwable -> L1e
            es7 r7 = r5.c()     // Catch: java.lang.Throwable -> L1e
            bs7 r7 = r7.K     // Catch: java.lang.Throwable -> L1e
            java.lang.String r8 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L1e
            r7.c(r8, r4, r6)     // Catch: java.lang.Throwable -> L1e
            ls7 r6 = r5.y     // Catch: java.lang.Throwable -> L1e
            defpackage.z18.T(r6)     // Catch: java.lang.Throwable -> L1e
            boolean r6 = r6.P()     // Catch: java.lang.Throwable -> L1e
            if (r6 == 0) goto L61
            fl7 r6 = r5.z     // Catch: java.lang.Throwable -> L1e
            defpackage.z18.T(r6)     // Catch: java.lang.Throwable -> L1e
            boolean r6 = r6.R(r4)     // Catch: java.lang.Throwable -> L1e
            if (r6 == 0) goto L61
            r5.t(r4)     // Catch: java.lang.Throwable -> L1e
            goto L9b
        L61:
            r5.N()     // Catch: java.lang.Throwable -> L1e
            goto L9b
        L65:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L1e
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L1e
            int r8 = r2.length()     // Catch: java.lang.Throwable -> L1e
            r3 = 32
            int r8 = java.lang.Math.min(r3, r8)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r8 = r2.substring(r9, r8)     // Catch: java.lang.Throwable -> L1e
            es7 r2 = r5.c()     // Catch: java.lang.Throwable -> L1e
            bs7 r2 = r2.H     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L1e
            if (r7 != 0) goto L89
            r7 = r8
        L89:
            r2.d(r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L1e
            fl7 r4 = r5.z     // Catch: java.lang.Throwable -> L1e
            defpackage.z18.T(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1e
            r4.X(r6)     // Catch: java.lang.Throwable -> L1e
            r5.N()     // Catch: java.lang.Throwable -> L1e
        L9b:
            r5.R = r9
            r5.O()
            return
        La1:
            r5.R = r9
            r5.O()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l87.b(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(defpackage.we7 r10, java.util.Set r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l87.c(we7, java.util.Set, java.lang.String):void");
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.x) {
            case 1:
                l87 l87Var = new l87(((mc7) this.y).clone());
                ArrayList arrayList = (ArrayList) this.A;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ArrayList) l87Var.A).add(((mc7) obj).clone());
                }
                return l87Var;
            default:
                return super.clone();
        }
    }

    public synchronized void d(int i, int i2, long j, long j2) {
        ((gu7) this.y).H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.A;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        v78 e = ((wb7) this.z).e(new x76(0, Arrays.asList(new ny3(36301, i, 0, j, j2, null, null, 0, i2))));
        e.b.m(new os7(r76.a, new ok2((Object) this, elapsedRealtime, (byte) 9)));
        e.j();
    }

    public l87(Context context, gu7 gu7Var) {
        this.x = (byte) 6;
        this.A = new AtomicLong(-1L);
        this.z = new ph2(context, wb7.k, new y76("measurement:api"), oh2.c);
        this.y = gu7Var;
    }

    public l87(z18 z18Var, String str, b28 b28Var) {
        this.x = (byte) 9;
        this.y = str;
        this.z = b28Var;
        this.A = z18Var;
    }

    public l87(mc7 mc7Var) {
        this.x = (byte) 1;
        this.y = mc7Var;
        this.z = mc7Var.clone();
        this.A = new ArrayList();
    }

    public /* synthetic */ l87(Object obj, Serializable serializable, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = serializable;
        this.A = obj2;
    }
}
