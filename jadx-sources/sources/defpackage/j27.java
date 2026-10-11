package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.anistation.model.Episode;
import com.anistation.model.watch.SourcesResponse;
import com.unity3d.ads.adplayer.DisplayRecoverer;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j27 implements io4 {
    public final /* synthetic */ v27 a;

    public j27(v27 v27Var) {
        this.a = v27Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0113, code lost:
    
        if (r7 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v27 */
    @Override // defpackage.io4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(defpackage.qh6 r59) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j27.A(qh6):void");
    }

    @Override // defpackage.io4
    public final void H(kf6 kf6Var, int i) {
        kf6Var.getClass();
        v27 v27Var = this.a;
        v27Var.Y(Long.valueOf(v27Var.l.a.getDuration()));
        v27Var.T(null);
    }

    /* JADX WARN: Type inference failed for: r19v0, types: [y11, l11] */
    @Override // defpackage.io4
    public final void J(yx1 yx1Var) {
        Long l;
        Object value;
        Object value2;
        String str;
        yx1Var.getClass();
        int i = yx1Var.x;
        v27 v27Var = this.a;
        sx5 sx5Var = v27Var.o;
        sx5 sx5Var2 = v27Var.n;
        ei0 ei0Var = v27Var.l;
        if (ei0Var.a.getDeviceInfo().a) {
            v27Var.q(false);
            return;
        }
        if (((ym6) sx5Var2.getValue()).z || !((ym6) sx5Var2.getValue()).G || v27Var.X != null) {
            if (v27Var.Y == y17.y && (l = v27Var.X) != null) {
                long longValue = l.longValue();
                ym6 ym6Var = (ym6) sx5Var2.getValue();
                Episode episode = ym6Var.b;
                if (episode != null && !ym6Var.z && longValue == v27Var.c0 && !((dq4) sx5Var.getValue()).j) {
                    long j = v27Var.j();
                    boolean n = ei0Var.a.n();
                    if (!v27Var.a0) {
                        c32 c32Var = new c32(new d32(new u22(new nj4(yx1Var, (byte) 17), new dr6((byte) 21), (byte) 2), true, xd.X));
                        while (c32Var.hasNext()) {
                            if (ms.U0(new Integer[]{401, 403, 404, 410}).contains(Integer.valueOf(((oq2) c32Var.next()).z))) {
                                v27Var.a0 = true;
                                v27Var.X = null;
                                tl7.z(zz.J(v27Var), null, null, new m27(longValue, v27Var, episode, j, n, null), 3);
                                return;
                            } else {
                                n = n;
                                longValue = longValue;
                                episode = episode;
                            }
                        }
                    }
                    Episode episode2 = episode;
                    Object obj = null;
                    long j2 = longValue;
                    boolean z = n;
                    int i2 = 3;
                    SourcesResponse sourcesResponse = v27Var.Z;
                    if (sourcesResponse != null) {
                        if (!v27Var.b0) {
                            v27Var.b0 = true;
                            v27Var.Y = y17.z;
                            while (true) {
                                Object value3 = sx5Var.getValue();
                                ?? r19 = obj;
                                if (sx5Var.j(value3, dq4.a((dq4) value3, false, false, false, j, 0L, null, false, null, true, false, null, 1783))) {
                                    tl7.z(zz.J(v27Var), r19, r19, new n27(j2, v27Var, sourcesResponse, episode2, j, z, ym6Var, yx1Var, null), i2);
                                    return;
                                } else {
                                    obj = r19;
                                    i2 = i2;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
            if (pn4.b.contains(Integer.valueOf(i)) && v27Var.I(yx1Var)) {
                return;
            }
            v27Var.m();
            Log.e("WatchViewModel", "Playback failed: ".concat(yx1Var.b()), yx1Var);
            do {
                value = sx5Var.getValue();
            } while (!sx5Var.j(value, dq4.a((dq4) value, false, false, false, v27Var.C, 0L, null, false, null, false, false, null, 1783)));
            do {
                value2 = sx5Var2.getValue();
            } while (!sx5Var2.j(value2, ym6.a((ym6) value2, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -1, 2)));
            if (((dq4) sx5Var.getValue()).j) {
                str = "Couldn't play this source on the Cast device. Try another server.";
            } else if (((ym6) sx5Var2.getValue()).z) {
                str = "Couldn't play this downloaded video. Try re-downloading it.";
            } else if (pn4.a.contains(Integer.valueOf(i))) {
                str = "Couldn't play this video format on your device. Try another server.";
            } else {
                str = "Video stream is currently unavailable. Try another server or check back later.";
            }
            v27Var.p.i(new s17(str));
            v27Var.h.a();
        }
    }

    @Override // defpackage.io4
    public final void Q(rf1 rf1Var) {
        rf1Var.getClass();
        this.a.W(rf1Var);
    }

    @Override // defpackage.io4
    public final void V(boolean z) {
        Object value;
        Object value2;
        v27 v27Var = this.a;
        sx5 sx5Var = v27Var.o;
        if (z && v27Var.F) {
            v27Var.F = false;
            v27Var.G = false;
            v27Var.I = SystemClock.elapsedRealtime() + DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS;
            do {
                value2 = sx5Var.getValue();
            } while (!sx5Var.j(value2, dq4.a((dq4) value2, false, true, false, 0L, 0L, null, false, null, false, false, null, 1789)));
        } else {
            do {
                value = sx5Var.getValue();
            } while (!sx5Var.j(value, dq4.a((dq4) value, false, z, false, 0L, 0L, null, false, null, false, false, null, 2045)));
        }
        v27Var.T(null);
    }

    @Override // defpackage.io4
    public final void b(c31 c31Var) {
        Object value;
        dq4 dq4Var;
        List list;
        c31Var.getClass();
        v27 v27Var = this.a;
        sx5 sx5Var = v27Var.o;
        do {
            value = sx5Var.getValue();
            dq4Var = (dq4) value;
            if (((ym6) v27Var.n.getValue()).j) {
                list = c31Var.a;
                list.getClass();
            } else {
                list = nt1.x;
            }
        } while (!sx5Var.j(value, dq4.a(dq4Var, false, false, false, 0L, 0L, list, false, null, false, false, null, 2015)));
    }

    @Override // defpackage.io4
    public final void j(jo4 jo4Var, jo4 jo4Var2, int i) {
        jo4Var.getClass();
        jo4Var2.getClass();
    }

    @Override // defpackage.io4
    public final void r(int i, boolean z) {
        v27 v27Var = this.a;
        if (((dq4) v27Var.o.getValue()).j && i == 1) {
            v27Var.S = z;
        }
        v27Var.T(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0123, code lost:
    
        if (r13 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0125, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x012f, code lost:
    
        if (r13 < 0) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01df A[LOOP:0: B:29:0x0143->B:50:0x01df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ae A[EDGE_INSN: B:51:0x01ae->B:52:0x01ae BREAK  A[LOOP:0: B:29:0x0143->B:50:0x01df], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018f  */
    @Override // defpackage.io4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(int r52) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j27.v(int):void");
    }
}
