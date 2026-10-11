package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uu3 implements xc2, ct3 {
    public long A;
    public final /* synthetic */ Object B;
    public Object x;
    public Serializable y;
    public Object z;

    public uu3(wu3 wu3Var) {
        this.B = wu3Var;
        this.x = jr3.M;
        this.y = "";
        this.A = -9223372036854775807L;
    }

    @Override // defpackage.ct3
    public void a(int i, lk5 lk5Var) {
        Bundle bundle = Bundle.EMPTY;
        boolean isEmpty = bundle.isEmpty();
        Bundle bundle2 = lk5Var.c;
        if (isEmpty) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        rt3 rt3Var = ((wu3) this.B).o;
        String str = lk5Var.b;
        rt3Var.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((mt3) rt3Var.y).a.sendSessionEvent(str, bundle);
        } else {
            ze0.k("event cannot be null or empty");
        }
    }

    @Override // defpackage.ct3
    public void e(int i, go4 go4Var) {
        int i2;
        wu3 wu3Var = (wu3) this.B;
        bu3 bu3Var = wu3Var.i;
        bu3Var.t();
        fq4 fq4Var = bu3Var.t;
        if (fq4Var.t0(20)) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if (wu3Var.v != i2) {
            wu3Var.v = i2;
            ((mt3) wu3Var.o.y).a.setFlags(i2 | 3);
        }
        wu3Var.Y(fq4Var);
    }

    @Override // defpackage.ct3
    public void h(int i, sk5 sk5Var, boolean z, boolean z2, int i2) {
        wu3 wu3Var = (wu3) this.B;
        bu3 bu3Var = wu3Var.i;
        bu3Var.t();
        wu3Var.Y(bu3Var.t);
    }

    public void i() {
        int i;
        su3 su3Var;
        ru ruVar;
        wu3 wu3Var = (wu3) this.B;
        bu3 bu3Var = wu3Var.i;
        bu3Var.t();
        fq4 fq4Var = bu3Var.t;
        if (!fq4Var.getDeviceInfo().a) {
            su3Var = null;
        } else {
            go4 l = fq4Var.l();
            int[] iArr = {26, 34};
            g42 g42Var = l.a;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 2;
                if (i3 < 2) {
                    if (g42Var.a.get(iArr[i3])) {
                        int[] iArr2 = {25, 33};
                        g42 g42Var2 = l.a;
                        int i5 = 0;
                        while (true) {
                            if (i5 < 2) {
                                if (g42Var2.a.get(iArr2[i5])) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else {
                                i4 = 1;
                                break;
                            }
                        }
                        i = i4;
                    } else {
                        i3++;
                    }
                } else {
                    i = 0;
                    break;
                }
            }
            Handler handler = new Handler(fq4Var.a.J0());
            if (fq4Var.t0(23)) {
                i2 = fq4Var.f();
            }
            rf1 deviceInfo = fq4Var.getDeviceInfo();
            su3Var = new su3(i, deviceInfo.c, i2, deviceInfo.d, handler, fq4Var);
        }
        wu3Var.r = su3Var;
        rt3 rt3Var = wu3Var.o;
        if (su3Var == null) {
            if (fq4Var.t0(21)) {
                ruVar = fq4Var.C();
            } else {
                ruVar = ru.i;
            }
            ((mt3) rt3Var.y).a.setPlaybackToLocal(ruVar.b());
            return;
        }
        ((mt3) rt3Var.y).a.setPlaybackToRemote(su3Var.a());
    }

    public void j(ar3 ar3Var) {
        p();
        wu3 wu3Var = (wu3) this.B;
        rt3 rt3Var = wu3Var.o;
        if (ar3Var == null) {
            ((mt3) rt3Var.y).a.setRatingType(0);
        } else {
            ((mt3) rt3Var.y).a.setRatingType(of3.e(ar3Var.d.i));
        }
        bu3 bu3Var = wu3Var.i;
        bu3Var.t();
        wu3Var.Y(bu3Var.t);
    }

    public void k(int i, fq4 fq4Var) {
        jr3 jr3Var;
        int i2;
        wu3 wu3Var = (wu3) this.B;
        o(fq4Var.f1());
        if (fq4Var.t0(18)) {
            jr3Var = fq4Var.k0();
        } else {
            jr3Var = jr3.M;
        }
        l(jr3Var);
        fq4Var.g1();
        p();
        n(fq4Var.O0());
        m(fq4Var.F0());
        fq4Var.getDeviceInfo();
        i();
        if (fq4Var.t0(20)) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if (wu3Var.v != i2) {
            wu3Var.v = i2;
            ((mt3) wu3Var.o.y).a.setFlags(i2 | 3);
        }
        j(fq4Var.e1());
    }

    public void l(jr3 jr3Var) {
        wu3 wu3Var = (wu3) this.B;
        rt3 rt3Var = wu3Var.o;
        CharSequence queueTitle = ((eq3) ((sn3) rt3Var.z).y).a.getQueueTitle();
        CharSequence charSequence = jr3Var.a;
        if (!TextUtils.equals(queueTitle, charSequence)) {
            if (!wu3Var.T()) {
                charSequence = null;
            }
            ((mt3) rt3Var.y).a.setQueueTitle(charSequence);
        }
    }

    public void m(int i) {
        rt3 rt3Var = ((wu3) this.B).o;
        int i2 = of3.a;
        int i3 = 0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    kb0.O("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                } else {
                    i3 = 2;
                }
            } else {
                i3 = 1;
            }
        }
        mt3 mt3Var = (mt3) rt3Var.y;
        if (mt3Var.j != i3) {
            mt3Var.j = i3;
            synchronized (mt3Var.d) {
                int beginBroadcast = mt3Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = mt3Var.f;
                    if (beginBroadcast >= 0) {
                        try {
                            ((gt2) remoteCallbackList.getBroadcastItem(beginBroadcast)).d(i3);
                        } catch (RemoteException | SecurityException e) {
                            kb0.t("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                        }
                        beginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public void n(boolean z) {
        rt3 rt3Var = ((wu3) this.B).o;
        int i = of3.a;
        mt3 mt3Var = (mt3) rt3Var.y;
        if (mt3Var.k != z) {
            mt3Var.k = z ? 1 : 0;
            synchronized (mt3Var.d) {
                int beginBroadcast = mt3Var.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = mt3Var.f;
                    if (beginBroadcast >= 0) {
                        try {
                            ((gt2) remoteCallbackList.getBroadcastItem(beginBroadcast)).B(z ? 1 : 0);
                        } catch (RemoteException | SecurityException e) {
                            kb0.t("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                        }
                        beginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public void o(kf6 kf6Var) {
        q(kf6Var);
        p();
    }

    @Override // defpackage.xc2
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        wu3 wu3Var = (wu3) ((uu3) this.B).B;
        if (this != wu3Var.u) {
            return;
        }
        wu3Var.o.I(of3.b((jr3) this.x, (String) this.y, (Uri) this.z, this.A, bitmap));
        bu3 bu3Var = wu3Var.i;
        eq6.a0(bu3Var.o, new tt3(bu3Var, (byte) 1));
    }

    public void p() {
        String str;
        Uri uri;
        long j;
        Uri uri2;
        jr3 jr3Var;
        Uri uri3;
        wu3 wu3Var = (wu3) this.B;
        bu3 bu3Var = wu3Var.i;
        bu3Var.t();
        fq4 fq4Var = bu3Var.t;
        ar3 e1 = fq4Var.e1();
        jr3 g1 = fq4Var.g1();
        long j2 = -9223372036854775807L;
        if ((!fq4Var.t0(16) || !fq4Var.b1()) && fq4Var.t0(16)) {
            j2 = fq4Var.getDuration();
        }
        if (e1 != null) {
            str = e1.a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (e1 != null && (uri3 = e1.f.a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals((jr3) this.x, g1) && Objects.equals((String) this.y, str2) && Objects.equals((Uri) this.z, uri) && this.A == j2) {
            return;
        }
        this.y = str2;
        this.z = uri;
        this.x = g1;
        this.A = j2;
        ii3 A = bu3Var.m.A(g1);
        if (A != null) {
            wu3Var.u = null;
            if (A.isDone()) {
                try {
                    bitmap = (Bitmap) wc7.s(A);
                } catch (CancellationException | ExecutionException e) {
                    kb0.O("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                j = j2;
                uri2 = uri;
                jr3Var = g1;
                uu3 uu3Var = new uu3(this, jr3Var, str2, uri2, j);
                str2 = str2;
                wu3Var.u = uu3Var;
                Handler handler = bu3Var.l;
                Objects.requireNonNull(handler);
                A.a(new yc2((Object) A, (Object) uu3Var, (byte) 0), new uw(handler, (byte) 1));
                wu3Var.o.I(of3.b(jr3Var, str2, uri2, j, bitmap));
            }
        }
        j = j2;
        uri2 = uri;
        jr3Var = g1;
        wu3Var.o.I(of3.b(jr3Var, str2, uri2, j, bitmap));
    }

    public void q(kf6 kf6Var) {
        wu3 wu3Var = (wu3) this.B;
        bu3 bu3Var = wu3Var.i;
        if (wu3Var.T() && !kf6Var.p()) {
            int i = of3.a;
            ArrayList arrayList = new ArrayList();
            jf6 jf6Var = new jf6();
            for (int i2 = 0; i2 < kf6Var.o(); i2++) {
                arrayList.add(kf6Var.m(i2, jf6Var, 0L).c);
            }
            ArrayList arrayList2 = new ArrayList();
            es3 es3Var = new es3(this, new AtomicInteger(0), arrayList, arrayList2);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                byte[] bArr = ((ar3) arrayList.get(i3)).d.k;
                if (bArr == null) {
                    arrayList2.add(null);
                    es3Var.run();
                } else {
                    ii3 F = bu3Var.m.F(bArr);
                    arrayList2.add(F);
                    Handler handler = bu3Var.l;
                    Objects.requireNonNull(handler);
                    F.a(es3Var, new uw(handler, (byte) 1));
                }
            }
            return;
        }
        wu3Var.o.M(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) defpackage.tq7.j.a(null)).intValue())) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) defpackage.tq7.j.a(null)).intValue())) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean r(long r11, defpackage.mt7 r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.z = r0
        Ld:
            java.io.Serializable r0 = r10.y
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.y = r0
        L1a:
            java.lang.Object r0 = r10.z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L47
            java.lang.Object r0 = r10.z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r1)
            mt7 r0 = (defpackage.mt7) r0
            long r2 = r0.y()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6 = 60
            long r2 = r2 / r6
            long r2 = r2 / r6
            long r8 = r13.y()
            long r8 = r8 / r4
            long r8 = r8 / r6
            long r8 = r8 / r6
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L47
            goto Ld4
        L47:
            long r2 = r10.A
            int r0 = r13.k()
            long r4 = (long) r0
            long r2 = r2 + r4
            java.lang.Object r0 = r10.B
            z18 r0 = (defpackage.z18) r0
            ak7 r4 = r0.e0()
            sq7 r5 = defpackage.tq7.Y0
            r6 = 0
            boolean r4 = r4.W(r6, r5)
            if (r4 == 0) goto L83
            java.lang.Object r4 = r10.z
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9c
            r0.e0()
            sq7 r4 = defpackage.tq7.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto Ld4
            goto L9c
        L83:
            r0.e0()
            sq7 r4 = defpackage.tq7.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L9c
            goto Ld4
        L9c:
            r10.A = r2
            java.lang.Object r2 = r10.z
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r13)
            java.io.Serializable r13 = r10.y
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.add(r11)
            java.lang.Object r11 = r10.x
            iu7 r11 = (defpackage.iu7) r11
            if (r11 != 0) goto Lb7
            goto Lbb
        Lb7:
            java.lang.String r6 = r11.r()
        Lbb:
            java.lang.Object r10 = r10.z
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r10 = r10.size()
            ak7 r11 = r0.e0()
            sq7 r12 = defpackage.tq7.k
            int r11 = r11.U(r6, r12)
            r12 = 1
            int r11 = java.lang.Math.max(r12, r11)
            if (r10 < r11) goto Ld5
        Ld4:
            return r1
        Ld5:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu3.r(long, mt7):boolean");
    }

    @Override // defpackage.xc2
    public void t(Throwable th) {
        if (this != ((wu3) ((uu3) this.B).B).u) {
            return;
        }
        kb0.O("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    @Override // defpackage.ct3
    public void onDisconnected() {
    }

    public /* synthetic */ uu3(z18 z18Var) {
        this.B = z18Var;
    }

    public uu3(uu3 uu3Var, jr3 jr3Var, String str, Uri uri, long j) {
        this.B = uu3Var;
        this.x = jr3Var;
        this.y = str;
        this.z = uri;
        this.A = j;
    }
}
