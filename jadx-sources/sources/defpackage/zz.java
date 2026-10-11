package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.view.View;
import android.view.ViewGroup;
import com.anistation.android.R;
import com.anistation.model.Recommendation;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class zz {
    public static ExecutorService a;
    public static final v50 b = new v50(-1.0f);
    public static final v50 c = new v50(1.0f);
    public static final u50 d = new u50(-1.0f);
    public static final u50 e = new u50(1.0f);
    public static final kw4 f = new kw4(new gr(8));
    public static final os0 g = new os0(1778779700, false, new qs0(14));
    public static final os0 h = new os0(845410318, false, new qs0(15));
    public static final long[] i = new long[0];
    public static final qc5 j = new qc5(3);

    public static final int A(View view, int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj == null) {
                    obj = tag;
                } else if (!tag.equals(obj)) {
                    break;
                }
                i4 = i3;
            }
            i3++;
            Object d2 = nz5.d(view);
            if (d2 instanceof View) {
                view = (View) d2;
            } else {
                view = null;
            }
        }
        return i4;
    }

    public static final int B(int i2, rd3 rd3Var, Object obj) {
        int e2;
        if (obj != null && rd3Var.a() != 0 && ((i2 >= rd3Var.a() || !obj.equals(rd3Var.b(i2))) && (e2 = rd3Var.e(obj)) != -1)) {
            return e2;
        }
        return i2;
    }

    public static final View C(View view) {
        View view2;
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(A(view, R.id.view_tree_lifecycle_owner), A(view, R.id.view_tree_saved_state_registry_owner));
        View view3 = view;
        int i2 = 0;
        View view4 = view3;
        while (view != null) {
            if (i2 == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view3;
                }
            } else if (H(view) == null) {
                i2++;
                Object d2 = nz5.d(view);
                if (d2 instanceof View) {
                    view2 = (View) d2;
                } else {
                    view2 = null;
                }
                View view5 = view3;
                view3 = view;
                view = view2;
                view4 = view5;
            }
            return view;
        }
        return view4;
    }

    public static final w42 D(w42 w42Var, l11 l11Var) {
        if (l11Var.get(h95.F) == null) {
            if (l11Var.equals(it1.x)) {
                return w42Var;
            }
            if (w42Var instanceof wc2) {
                return wc2.c((wc2) w42Var, l11Var, 0, null, 6);
            }
            return new sj0(w42Var, l11Var, 0, null, 12);
        }
        p65.g(l11Var, "Flow context cannot contain job in it. Had ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mj2 E(javax.net.ssl.SSLSession r6) {
        /*
            nt1 r0 = defpackage.nt1.x
            java.lang.String r1 = r6.getCipherSuite()
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.String r3 = "TLS_NULL_WITH_NULL_NULL"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L13
            r3 = 1
            goto L19
        L13:
            java.lang.String r3 = "SSL_NULL_WITH_NULL_NULL"
            boolean r3 = r1.equals(r3)
        L19:
            if (r3 != 0) goto L6b
            i18 r3 = defpackage.bm0.b
            bm0 r1 = r3.L(r1)
            java.lang.String r3 = r6.getProtocol()
            if (r3 == 0) goto L65
            java.lang.String r4 = "NONE"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L5f
            yf6 r2 = defpackage.qs5.e(r3)
            java.security.cert.Certificate[] r3 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
            if (r3 == 0) goto L43
            int r4 = r3.length     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
            java.util.List r3 = defpackage.dq6.k(r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
            goto L44
        L43:
            r3 = r0
        L44:
            mj2 r4 = new mj2
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L55
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.util.List r0 = defpackage.dq6.k(r6)
        L55:
            yk r6 = new yk
            r5 = 2
            r6.<init>(r3, r5)
            r4.<init>(r2, r1, r0, r6)
            return r4
        L5f:
            java.lang.String r6 = "tlsVersion == NONE"
            defpackage.qi2.k(r6)
            return r2
        L65:
            java.lang.String r6 = "tlsVersion == null"
            defpackage.ze0.m(r6)
            return r2
        L6b:
            java.lang.String r6 = "cipherSuite == "
            java.lang.String r6 = r6.concat(r1)
            defpackage.qi2.k(r6)
            return r2
        L75:
            java.lang.String r6 = "cipherSuite == null"
            defpackage.ze0.m(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.E(javax.net.ssl.SSLSession):mj2");
    }

    public static synchronized Executor F() {
        ExecutorService executorService;
        synchronized (zz.class) {
            executorService = a;
            if (executorService == null) {
                String str = eq6.a;
                executorService = Executors.newSingleThreadExecutor(new fv0("ExoPlayer:BackgroundExecutor", (byte) 2));
                a = executorService;
            }
        }
        return executorService;
    }

    public static final int G(wc0 wc0Var) {
        wc0Var.getClass();
        oa0 g2 = wc0Var.g();
        g2.getClass();
        return (int) g2.z;
    }

    public static final yt0 H(View view) {
        WeakReference weakReference;
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        if (tag instanceof WeakReference) {
            weakReference = (WeakReference) tag;
        } else {
            weakReference = null;
        }
        if (weakReference == null) {
            return null;
        }
        return (yt0) weakReference.get();
    }

    public static float I(ByteBuffer byteBuffer, boolean z, boolean z2) {
        int i2 = 32767;
        if (z2) {
            if (z) {
                return byteBuffer.getShort();
            }
            float f2 = byteBuffer.getFloat();
            if (f2 < 0.0f) {
                i2 = 32768;
            }
            return eq6.i(f2 * i2, -32768.0f, 32767.0f);
        }
        if (z) {
            short s = byteBuffer.getShort();
            float f3 = s;
            if (s < 0) {
                i2 = 32768;
            }
            return f3 / i2;
        }
        return byteBuffer.getFloat();
    }

    public static final bo0 J(vv6 vv6Var) {
        bo0 bo0Var;
        vv6Var.getClass();
        synchronized (j) {
            bo0Var = (bo0) vv6Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (bo0Var == null) {
                l11 l11Var = it1.x;
                try {
                    ja1 ja1Var = rh1.a;
                    l11Var = qm3.a.B;
                } catch (IllegalStateException | xa4 unused) {
                }
                bo0 bo0Var2 = new bo0(l11Var.plus(iv5.a()));
                vv6Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", bo0Var2);
                bo0Var = bo0Var2;
            }
        }
        return bo0Var;
    }

    public static int K(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x02d1, code lost:
    
        if (r0 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x036c, code lost:
    
        r10 = r4;
        r9 = r6;
        r14 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04cc A[Catch: all -> 0x004d, TryCatch #10 {all -> 0x004d, blocks: (B:15:0x0046, B:17:0x0466, B:19:0x046e, B:27:0x047d, B:28:0x0493, B:35:0x03f5, B:38:0x0423, B:40:0x0431, B:47:0x044a, B:51:0x0402, B:52:0x041c, B:69:0x0394, B:71:0x039a, B:73:0x03a0, B:78:0x03b7, B:83:0x03c8, B:85:0x03d0, B:91:0x0494, B:92:0x049b, B:95:0x04a2, B:100:0x04b7, B:101:0x04cb, B:102:0x04cc, B:103:0x04f5, B:164:0x02c8), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0169 A[Catch: all -> 0x0384, TryCatch #3 {all -> 0x0384, blocks: (B:107:0x0163, B:109:0x0169, B:111:0x016f), top: B:106:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c8 A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x004d, blocks: (B:15:0x0046, B:17:0x0466, B:19:0x046e, B:27:0x047d, B:28:0x0493, B:35:0x03f5, B:38:0x0423, B:40:0x0431, B:47:0x044a, B:51:0x0402, B:52:0x041c, B:69:0x0394, B:71:0x039a, B:73:0x03a0, B:78:0x03b7, B:83:0x03c8, B:85:0x03d0, B:91:0x0494, B:92:0x049b, B:95:0x04a2, B:100:0x04b7, B:101:0x04cb, B:102:0x04cc, B:103:0x04f5, B:164:0x02c8), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x046e A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #10 {all -> 0x004d, blocks: (B:15:0x0046, B:17:0x0466, B:19:0x046e, B:27:0x047d, B:28:0x0493, B:35:0x03f5, B:38:0x0423, B:40:0x0431, B:47:0x044a, B:51:0x0402, B:52:0x041c, B:69:0x0394, B:71:0x039a, B:73:0x03a0, B:78:0x03b7, B:83:0x03c8, B:85:0x03d0, B:91:0x0494, B:92:0x049b, B:95:0x04a2, B:100:0x04b7, B:101:0x04cb, B:102:0x04cc, B:103:0x04f5, B:164:0x02c8), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0431 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #10 {all -> 0x004d, blocks: (B:15:0x0046, B:17:0x0466, B:19:0x046e, B:27:0x047d, B:28:0x0493, B:35:0x03f5, B:38:0x0423, B:40:0x0431, B:47:0x044a, B:51:0x0402, B:52:0x041c, B:69:0x0394, B:71:0x039a, B:73:0x03a0, B:78:0x03b7, B:83:0x03c8, B:85:0x03d0, B:91:0x0494, B:92:0x049b, B:95:0x04a2, B:100:0x04b7, B:101:0x04cb, B:102:0x04cc, B:103:0x04f5, B:164:0x02c8), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0402 A[Catch: all -> 0x004d, TryCatch #10 {all -> 0x004d, blocks: (B:15:0x0046, B:17:0x0466, B:19:0x046e, B:27:0x047d, B:28:0x0493, B:35:0x03f5, B:38:0x0423, B:40:0x0431, B:47:0x044a, B:51:0x0402, B:52:0x041c, B:69:0x0394, B:71:0x039a, B:73:0x03a0, B:78:0x03b7, B:83:0x03c8, B:85:0x03d0, B:91:0x0494, B:92:0x049b, B:95:0x04a2, B:100:0x04b7, B:101:0x04cb, B:102:0x04cc, B:103:0x04f5, B:164:0x02c8), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x039a A[Catch: all -> 0x004d, TryCatch #10 {all -> 0x004d, blocks: (B:15:0x0046, B:17:0x0466, B:19:0x046e, B:27:0x047d, B:28:0x0493, B:35:0x03f5, B:38:0x0423, B:40:0x0431, B:47:0x044a, B:51:0x0402, B:52:0x041c, B:69:0x0394, B:71:0x039a, B:73:0x03a0, B:78:0x03b7, B:83:0x03c8, B:85:0x03d0, B:91:0x0494, B:92:0x049b, B:95:0x04a2, B:100:0x04b7, B:101:0x04cb, B:102:0x04cc, B:103:0x04f5, B:164:0x02c8), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03bd  */
    /* JADX WARN: Type inference failed for: r0v0, types: [wc0] */
    /* JADX WARN: Type inference failed for: r10v23, types: [short, int] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v9, types: [v05] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [short, int] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [bd0, xz0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r32v4, types: [w05] */
    /* JADX WARN: Type inference failed for: r4v19, types: [short, int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2, types: [w05] */
    /* JADX WARN: Type inference failed for: r5v31, types: [w05] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36, types: [w05] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [w05] */
    /* JADX WARN: Type inference failed for: r5v9, types: [w05] */
    /* JADX WARN: Type inference failed for: r6v11, types: [short, int] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [short, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x0355 -> B:64:0x0359). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L(defpackage.wc0 r32, defpackage.mk0 r33, long r34, boolean r36, boolean r37, defpackage.xz0 r38) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.L(wc0, mk0, long, boolean, boolean, xz0):java.lang.Object");
    }

    public static final void M(w05 w05Var, Appendable appendable, cv5 cv5Var, v05 v05Var, long j2) {
        if (w05Var.x == null) {
            if (j2 > 0) {
                cv5Var.m(j2);
                appendable.append(gv5.b(cv5Var.c(), j2));
                v05Var.x += j2;
                return;
            }
            return;
        }
        N(w05Var, cv5Var, v05Var, j2);
    }

    public static final void N(w05 w05Var, cv5 cv5Var, v05 v05Var, long j2) {
        if (j2 > 0) {
            Object obj = w05Var.x;
            if (obj == null) {
                obj = new Object();
                w05Var.x = obj;
            }
            ((oa0) obj).k0(cv5Var, j2);
            v05Var.x += j2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.cv5 r9, defpackage.wc0 r10, boolean r11, defpackage.xz0 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.cd0
            if (r0 == 0) goto L13
            r0 = r12
            cd0 r0 = (defpackage.cd0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            cd0 r0 = new cd0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.z
            int r1 = r0.A
            r2 = 1
            r4 = 2
            r6 = 1
            if (r1 == 0) goto L34
            if (r1 != r6) goto L2d
            boolean r11 = r0.y
            cv5 r9 = r0.x
            defpackage.m37.N(r12)
            goto L4f
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            r9 = 0
            return r9
        L34:
            defpackage.m37.N(r12)
            long r7 = defpackage.sw0.w(r9)
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 >= 0) goto L57
            r0.x = r9
            r0.y = r11
            r0.A = r6
            r12 = 2
            java.lang.Object r12 = r10.c(r12, r0)
            w11 r10 = defpackage.w11.x
            if (r12 != r10) goto L4f
            return r10
        L4f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            if (r10 == 0) goto L69
        L57:
            oa0 r10 = r9.c()
            byte r10 = r10.a(r2)
            r12 = 10
            if (r10 != r12) goto L69
            defpackage.sw0.l(r9, r4)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L69:
            if (r11 == 0) goto L71
            defpackage.sw0.l(r9, r2)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L71:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.O(cv5, wc0, boolean, xz0):java.lang.Object");
    }

    public static final yz3 P(yz3 yz3Var, tc tcVar, uf3 uf3Var, jb6 jb6Var) {
        return yz3Var.w(new mf3(tcVar, uf3Var, jb6Var));
    }

    public static void Q(ByteBuffer byteBuffer, vv vvVar, ByteBuffer byteBuffer2, vv vvVar2, ak0 ak0Var, int i2, boolean z) {
        boolean z2;
        int i3 = ak0Var.b;
        boolean z3 = true;
        if (vvVar.c == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (vvVar2.c != 2) {
            z3 = false;
        }
        int i4 = ak0Var.a;
        float[] fArr = new float[i4];
        float[] fArr2 = new float[i3];
        for (int i5 = 0; i5 < i2; i5++) {
            if (z) {
                int position = byteBuffer2.position();
                for (int i6 = 0; i6 < i3; i6++) {
                    fArr2[i6] = I(byteBuffer2, z3, z3);
                }
                byteBuffer2.position(position);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                fArr[i7] = I(byteBuffer, z2, z3);
            }
            for (int i8 = 0; i8 < i3; i8++) {
                for (int i9 = 0; i9 < i4; i9++) {
                    fArr2[i8] = (ak0Var.c[(i9 * i3) + i8] * fArr[i9]) + fArr2[i8];
                }
                if (z3) {
                    byteBuffer2.putShort((short) eq6.i(fArr2[i8], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(eq6.i(fArr2[i8], -1.0f, 1.0f));
                }
                fArr2[i8] = 0.0f;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable R(defpackage.wc0 r4, int r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.dd0
            if (r0 == 0) goto L13
            r0 = r6
            dd0 r0 = (defpackage.dd0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            dd0 r0 = new dd0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.z
            int r1 = r0.A
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            int r5 = r0.y
            wc0 r4 = r0.x
            defpackage.m37.N(r6)
            goto L49
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r3
        L30:
            defpackage.m37.N(r6)
            boolean r6 = r4.h()
            if (r6 == 0) goto L3a
            goto L51
        L3a:
            r0.x = r4
            r0.y = r5
            r0.A = r2
            java.lang.Object r6 = r4.c(r5, r0)
            w11 r0 = defpackage.w11.x
            if (r6 != r0) goto L49
            return r0
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L52
        L51:
            return r3
        L52:
            oa0 r4 = r4.g()
            qz4 r4 = r4.l()
            byte[] r4 = defpackage.nv5.o(r4, r5)
            yd0 r5 = new yd0
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.R(wc0, int, xz0):java.lang.Comparable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U(defpackage.wc0 r4, byte[] r5, int r6, defpackage.xz0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ed0
            if (r0 == 0) goto L13
            r0 = r7
            ed0 r0 = (defpackage.ed0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            ed0 r0 = new ed0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.A
            int r1 = r0.B
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2c
            int r6 = r0.z
            byte[] r5 = r0.y
            wc0 r4 = r0.x
            defpackage.m37.N(r7)
            goto L5d
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L33:
            defpackage.m37.N(r7)
            boolean r7 = r4.h()
            if (r7 == 0) goto L42
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            return r4
        L42:
            oa0 r7 = r4.g()
            boolean r7 = r7.D()
            if (r7 == 0) goto L5d
            r0.x = r4
            r0.y = r5
            r0.z = r6
            r0.B = r3
            java.lang.Object r7 = r4.c(r3, r0)
            w11 r0 = defpackage.w11.x
            if (r7 != r0) goto L5d
            return r0
        L5d:
            boolean r7 = r4.h()
            if (r7 == 0) goto L69
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            return r4
        L69:
            oa0 r4 = r4.g()
            r4.getClass()
            r5.getClass()
            r7 = 0
            int r4 = r4.E(r5, r7, r6)
            if (r4 != r2) goto L7b
            goto L7c
        L7b:
            r7 = r4
        L7c:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.U(wc0, byte[], int, xz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0046 -> B:11:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:10:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object V(defpackage.wc0 r4, defpackage.xz0 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.fd0
            if (r0 == 0) goto L13
            r0 = r5
            fd0 r0 = (defpackage.fd0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            fd0 r0 = new fd0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.z
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            oa0 r4 = r0.y
            wc0 r1 = r0.x
            defpackage.m37.N(r5)
            goto L59
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L30:
            defpackage.m37.N(r5)
            oa0 r5 = new oa0
            r5.<init>()
        L38:
            boolean r1 = r4.h()
            if (r1 != 0) goto L63
            oa0 r1 = r4.g()
            boolean r1 = r1.D()
            if (r1 == 0) goto L5b
            r0.x = r4
            r0.y = r5
            r0.A = r2
            java.lang.Object r1 = r4.c(r2, r0)
            w11 r3 = defpackage.w11.x
            if (r1 != r3) goto L57
            return r3
        L57:
            r1 = r4
            r4 = r5
        L59:
            r5 = r4
            r4 = r1
        L5b:
            oa0 r1 = r4.g()
            r5.G(r1)
            goto L38
        L63:
            java.lang.Throwable r4 = r4.b()
            if (r4 != 0) goto L6a
            return r5
        L6a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.V(wc0, xz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r0v2, types: [gd0, xz0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [wc0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [cv5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W(defpackage.wc0 r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.gd0
            if (r0 == 0) goto L13
            r0 = r6
            gd0 r0 = (defpackage.gd0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            gd0 r0 = new gd0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            cv5 r5 = r0.x
            defpackage.m37.N(r6)
            goto L4b
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.m37.N(r6)
            oa0 r6 = r5.g()
            boolean r1 = r6.D()
            if (r1 == 0) goto L5d
            r0.x = r6
            r0.z = r2
            java.lang.Object r5 = r5.c(r2, r0)
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L48
            return r0
        L48:
            r4 = r6
            r6 = r5
            r5 = r4
        L4b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L55
            r6 = r5
            goto L5d
        L55:
            java.io.EOFException r5 = new java.io.EOFException
            java.lang.String r6 = "Not enough data available"
            r5.<init>(r6)
            throw r5
        L5d:
            byte r5 = r6.readByte()
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.W(wc0, xz0):java.lang.Object");
    }

    public static Object X(wc0 wc0Var, mk0 mk0Var, xz0 xz0Var) {
        return L(wc0Var, mk0Var, 8192L, false, true, xz0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004c -> B:11:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005f -> B:10:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y(defpackage.wc0 r10, int r11, defpackage.xz0 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.hd0
            if (r0 == 0) goto L13
            r0 = r12
            hd0 r0 = (defpackage.hd0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            hd0 r0 = new hd0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.A
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            int r10 = r0.z
            oa0 r11 = r0.y
            wc0 r1 = r0.x
            defpackage.m37.N(r12)
            goto L61
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            r10 = 0
            return r10
        L32:
            defpackage.m37.N(r12)
            oa0 r12 = new oa0
            r12.<init>()
            r9 = r12
            r12 = r11
            r11 = r9
        L3d:
            long r3 = r11.z
            long r5 = (long) r12
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L93
            oa0 r1 = r10.g()
            boolean r1 = r1.D()
            if (r1 == 0) goto L63
            r0.x = r10
            r0.y = r11
            r0.z = r12
            r0.B = r2
            java.lang.Object r1 = r10.c(r2, r0)
            w11 r3 = defpackage.w11.x
            if (r1 != r3) goto L5f
            return r3
        L5f:
            r1 = r10
            r10 = r12
        L61:
            r12 = r10
            r10 = r1
        L63:
            boolean r1 = r10.h()
            if (r1 != 0) goto L93
            oa0 r1 = r10.g()
            long r3 = defpackage.sw0.w(r1)
            long r5 = (long) r12
            long r7 = r11.z
            long r7 = r5 - r7
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L85
            oa0 r1 = r10.g()
            long r3 = r11.z
            long r5 = r5 - r3
            r1.p(r11, r5)
            goto L3d
        L85:
            oa0 r1 = r10.g()
            long r3 = r1.I(r11)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            goto L3d
        L93:
            long r0 = r11.z
            long r2 = (long) r12
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 < 0) goto L9b
            return r11
        L9b:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r12 = defpackage.qx1.s(r12, r0, r1)
            long r0 = r11.z
            java.lang.String r11 = " available"
            java.lang.String r11 = defpackage.qx1.k(r0, r11, r12)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.Y(wc0, int, xz0):java.lang.Object");
    }

    public static final py4 Z(v11 v11Var, l11 l11Var, nc0 nc0Var, ic2 ic2Var) {
        l11Var.getClass();
        vz0 vz0Var = null;
        byte b2 = 0;
        bx5 z = tl7.z(v11Var, l11Var, null, new jd0(ic2Var, nc0Var, vz0Var, b2), 2);
        z.l0(new tc0(nc0Var, (byte) 1));
        return new py4(new yn0(nc0Var, new id0(z, vz0Var, b2)), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.yz3 r28, boolean r29, boolean r30, defpackage.by2 r31, defpackage.u34 r32, long r33, long r35, final defpackage.sb2 r37, defpackage.th4 r38, final defpackage.ic2 r39, defpackage.kd2 r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.a(yz3, boolean, boolean, by2, u34, long, long, sb2, th4, ic2, kd2, int, int):void");
    }

    public static final void a0(qg0 qg0Var, vz0 vz0Var, boolean z) {
        Object g2;
        gn6 gn6Var;
        Object s = qg0Var.s();
        Throwable f2 = qg0Var.f(s);
        if (f2 != null) {
            g2 = new y45(f2);
        } else {
            g2 = qg0Var.g(s);
        }
        if (z) {
            vz0Var.getClass();
            jh1 jh1Var = (jh1) vz0Var;
            xz0 xz0Var = jh1Var.B;
            Object obj = jh1Var.D;
            l11 context = xz0Var.getContext();
            Object c2 = ke6.c(context, obj);
            if (c2 != ke6.a) {
                gn6Var = bx7.Q(xz0Var, context, c2);
            } else {
                gn6Var = null;
            }
            try {
                xz0Var.resumeWith(g2);
                if (gn6Var != null && !gn6Var.m0()) {
                    return;
                }
                ke6.a(context, c2);
                return;
            } catch (Throwable th) {
                if (gn6Var == null || gn6Var.m0()) {
                    ke6.a(context, c2);
                }
                throw th;
            }
        }
        vz0Var.resumeWith(g2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r20, com.anistation.model.Status r21, defpackage.yz3 r22, java.lang.String r23, defpackage.sb2 r24, defpackage.kd2 r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.b(java.lang.String, com.anistation.model.Status, yz3, java.lang.String, sb2, kd2, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (w(r6, r7, r0) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r8 == r5) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(defpackage.wc0 r6, defpackage.yd0 r7, defpackage.xz0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.kd0
            if (r0 == 0) goto L13
            r0 = r8
            kd0 r0 = (defpackage.kd0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            kd0 r0 = new kd0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.A
            r2 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.m37.N(r8)
            goto L63
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r2
        L31:
            yd0 r7 = r0.y
            wc0 r6 = r0.x
            defpackage.m37.N(r8)
            goto L4c
        L39:
            defpackage.m37.N(r8)
            byte[] r8 = r7.x
            int r8 = r8.length
            r0.x = r6
            r0.y = r7
            r0.A = r4
            java.lang.Comparable r8 = R(r6, r8, r0)
            if (r8 != r5) goto L4c
            goto L62
        L4c:
            boolean r8 = defpackage.a34.i(r8, r7)
            if (r8 == 0) goto L66
            byte[] r7 = r7.x
            int r7 = r7.length
            long r7 = (long) r7
            r0.x = r2
            r0.y = r2
            r0.A = r3
            java.lang.Object r6 = w(r6, r7, r0)
            if (r6 != r5) goto L63
        L62:
            return r5
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L66:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.b0(wc0, yd0, xz0):java.lang.Object");
    }

    public static final void c(final xh4 xh4Var, final yz3 yz3Var, e7 e7Var, final dz0 dz0Var, float f2, kd2 kd2Var, final int i2) {
        int i3;
        boolean z;
        final e7 e7Var2;
        final float f3;
        int i4;
        int i5;
        int i6;
        boolean h2;
        int i7;
        kd2Var.f0(1142754848);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = kd2Var.f(xh4Var);
            } else {
                h2 = kd2Var.h(xh4Var);
            }
            if (h2) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.f(null)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.f(yz3Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i8 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            if (kd2Var.f(dz0Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i8 |= i4;
        }
        int i9 = i8 | 1769472;
        if ((599187 & i9) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i9 & 1, z)) {
            y50 y50Var = pk2.C;
            kd2Var.e0(1899381698);
            kd2Var.q(false);
            yz3 H = x97.H(n03.l(yz3Var.w(vz3.x)), xh4Var, dz0Var, 1.0f, null, 2);
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = yb.i;
                kd2Var.n0(Q);
            }
            vo3 vo3Var = (vo3) Q;
            int hashCode = Long.hashCode(kd2Var.T);
            yz3 E = o80.E(kd2Var, H);
            al4 l = kd2Var.l();
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, vo3Var);
            ss5.i(p7.E, kd2Var, l);
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            kd2Var.q(true);
            f3 = 1.0f;
            e7Var2 = y50Var;
        } else {
            kd2Var.Y();
            e7Var2 = e7Var;
            f3 = f2;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: uu2
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zz.c(xh4.this, yz3Var, e7Var2, dz0Var, f3, (kd2) obj, kb0.N(i2 | 1));
                    return pn6.a;
                }
            };
        }
    }

    public static final void c0(int i2, String str) {
        throw new SQLException(qx1.h(i2, "Error code: ").concat(", message: ".concat(str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [x53, y43] */
    /* JADX WARN: Type inference failed for: r1v0, types: [e53, java.lang.Object] */
    public static x53 d(ub2 ub2Var) {
        x43 x43Var = y43.d;
        x43Var.getClass();
        ?? obj = new Object();
        g53 g53Var = x43Var.a;
        obj.a = g53Var.a;
        obj.b = g53Var.f;
        obj.c = g53Var.b;
        obj.d = g53Var.c;
        obj.e = g53Var.e;
        String str = g53Var.g;
        obj.f = str;
        obj.g = g53Var.h;
        obj.h = g53Var.k;
        obj.i = g53Var.j;
        obj.j = g53Var.i;
        obj.k = g53Var.d;
        obj.l = x43Var.b;
        obj.m = g53Var.l;
        ub2Var.invoke(obj);
        if (!obj.e) {
            if (!str.equals("    ")) {
                ze0.k("Indent should not be specified when default printing mode is used");
                return null;
            }
        } else if (!str.equals("    ")) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    ze0.e("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                    return null;
                }
            }
        }
        g53 g53Var2 = new g53(obj.a, obj.c, obj.d, obj.k, obj.e, obj.b, obj.f, obj.g, obj.j, obj.i, obj.h, obj.m);
        uj5 uj5Var = obj.l;
        uj5Var.getClass();
        ?? y43Var = new y43(g53Var2, uj5Var);
        uj5Var.equals(db.k);
        return y43Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable d0(defpackage.wc0 r4, defpackage.xz0 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ld0
            if (r0 == 0) goto L13
            r0 = r5
            ld0 r0 = (defpackage.ld0) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            ld0 r0 = new ld0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.x
            int r1 = r0.y
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.m37.N(r5)
            r0.y = r2
            java.lang.Object r5 = V(r4, r0)
            w11 r4 = defpackage.w11.x
            if (r5 != r4) goto L3a
            return r4
        L3a:
            oa0 r5 = (defpackage.oa0) r5
            long r0 = r5.z
            int r4 = (int) r0
            byte[] r4 = defpackage.nv5.o(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.d0(wc0, xz0):java.io.Serializable");
    }

    public static final void e(boolean z, hp4 hp4Var, sb2 sb2Var, sb2 sb2Var2, yz3 yz3Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        sb2Var.getClass();
        sb2Var2.getClass();
        kd2Var.f0(-1217943906);
        if ((i2 & 6) == 0) {
            if (kd2Var.g(z)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.f(hp4Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.h(sb2Var)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var.h(sb2Var2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (kd2Var.f(yz3Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        boolean z3 = false;
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i3 & 1, z2)) {
            w44 h2 = xt5.h(sb2Var, kd2Var);
            Object Q = kd2Var.Q();
            vz0 vz0Var = null;
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = xt5.g(null);
                kd2Var.n0(Q);
            }
            w44 w44Var = (w44) Q;
            if ((i3 & 112) == 32) {
                z3 = true;
            }
            Object Q2 = kd2Var.Q();
            if (z3 || Q2 == q18Var) {
                Q2 = new yh(hp4Var, w44Var, vz0Var, (byte) 17);
                kd2Var.n0(Q2);
            }
            db.f((ic2) Q2, kd2Var, hp4Var);
            x97.b(yz3Var.w(ar5.c), null, nx7.R(-1707075852, new ip4(z, h2, hp4Var, sb2Var2, w44Var), kd2Var), kd2Var, 3072, 6);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new g(z, hp4Var, sb2Var, sb2Var2, yz3Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ku1 e0(defpackage.ku1 r17, defpackage.ev2 r18, defpackage.mg4 r19, defpackage.h95 r20, defpackage.xz0 r21) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.e0(ku1, ev2, mg4, h95, xz0):ku1");
    }

    public static final void f(final ko4 ko4Var, final yz3 yz3Var, final int i2, kd2 kd2Var, final int i3) {
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        kd2Var.f0(12998269);
        if ((i3 & 6) == 0) {
            if (kd2Var.h(ko4Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i7 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 384) == 0) {
            if (kd2Var.d(i2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i4 |= i5;
        }
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i4 & 1, z)) {
            q18 q18Var = au0.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    kd2Var.e0(-393503123);
                    Object Q = kd2Var.Q();
                    if (Q == q18Var) {
                        Q = vp4.x;
                        kd2Var.n0(Q);
                    }
                    ub2 ub2Var = (ub2) ((i73) Q);
                    Object Q2 = kd2Var.Q();
                    if (Q2 == q18Var) {
                        Q2 = wp4.x;
                        kd2Var.n0(Q2);
                    }
                    ic2 ic2Var = (ic2) ((i73) Q2);
                    Object Q3 = kd2Var.Q();
                    if (Q3 == q18Var) {
                        Q3 = xp4.x;
                        kd2Var.n0(Q3);
                    }
                    g(ko4Var, yz3Var, ub2Var, ic2Var, (ic2) ((i73) Q3), null, kd2Var, (i4 & 14) | 28032 | (i4 & 112), 32);
                    kd2Var.q(false);
                } else {
                    kd2Var.e0(-393496186);
                    kd2Var.q(false);
                    ze0.k(qx1.h(i2, "Unrecognized surface type: "));
                    return;
                }
            } else {
                kd2Var.e0(684642547);
                Object Q4 = kd2Var.Q();
                if (Q4 == q18Var) {
                    Q4 = xt5.g(null);
                    kd2Var.n0(Q4);
                }
                w44 w44Var = (w44) Q4;
                Object Q5 = kd2Var.Q();
                if (Q5 == q18Var) {
                    Q5 = new ef(w44Var, (byte) 13);
                    kd2Var.n0(Q5);
                }
                ub2 ub2Var2 = (ub2) Q5;
                Object Q6 = kd2Var.Q();
                if (Q6 == q18Var) {
                    Q6 = db.L(kd2Var);
                    kd2Var.n0(Q6);
                }
                v11 v11Var = (v11) Q6;
                boolean h2 = kd2Var.h(v11Var);
                Object Q7 = kd2Var.Q();
                if (h2 || Q7 == q18Var) {
                    Q7 = new r82(v11Var, w44Var, (byte) 19);
                    kd2Var.n0(Q7);
                }
                ub2 ub2Var3 = (ub2) Q7;
                Object Q8 = kd2Var.Q();
                if (Q8 == q18Var) {
                    Q8 = tp4.x;
                    kd2Var.n0(Q8);
                }
                ic2 ic2Var2 = (ic2) ((i73) Q8);
                Object Q9 = kd2Var.Q();
                if (Q9 == q18Var) {
                    Q9 = up4.x;
                    kd2Var.n0(Q9);
                }
                g(ko4Var, yz3Var, ub2Var2, ic2Var2, (ic2) ((i73) Q9), ub2Var3, kd2Var, (i4 & 14) | 28032 | (i4 & 112), 0);
                kd2Var.q(false);
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: rp4
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(i3 | 1);
                    zz.f(ko4.this, yz3Var, i2, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    public static final void f0(ki5 ki5Var, VolumeSettingsChange volumeSettingsChange) {
        Object i2 = ki5Var.i(volumeSettingsChange);
        if (!(i2 instanceof ck0)) {
        } else {
            Object obj = ((dk0) bx7.K(it1.x, new e0(ki5Var, volumeSettingsChange, null, (byte) 11))).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.ko4 r19, final defpackage.yz3 r20, final defpackage.ub2 r21, final defpackage.ic2 r22, final defpackage.ic2 r23, defpackage.ub2 r24, defpackage.kd2 r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.g(ko4, yz3, ub2, ic2, ic2, ub2, kd2, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final xg5 g0(final u98 u98Var, final fm0 fm0Var, xg5 xg5Var) {
        final int i2;
        final int i3;
        p21 p21Var;
        int i4 = fm0Var.z;
        int i5 = fm0Var.y;
        boolean z = u98Var.y;
        if (z) {
            i2 = i5;
        } else {
            i2 = i4;
        }
        bd6 bd6Var = (bd6) fm0Var.B;
        int i6 = fm0Var.A;
        byte b2 = 1;
        af1 af1Var = new af1(fm0Var, i2, b2);
        jf3 jf3Var = jf3.z;
        final rb3 B = bx7.B(jf3Var, af1Var);
        if (z) {
            i3 = i4;
        } else {
            i3 = i5;
        }
        rb3 B2 = bx7.B(jf3Var, new sb2() { // from class: zg5
            @Override // defpackage.sb2
            public final Object invoke() {
                boolean z2;
                fm0 fm0Var2 = fm0.this;
                bd6 bd6Var2 = (bd6) fm0Var2.B;
                int intValue = ((Number) B.getValue()).intValue();
                u98 u98Var2 = u98Var;
                boolean z3 = u98Var2.y;
                if (u98Var2.i() == p21.x) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i7 = i2;
                long k = bd6Var2.k(i7);
                o24 o24Var = bd6Var2.b;
                int i8 = nd6.c;
                int i9 = (int) (k >> 32);
                int i10 = o24Var.f;
                if (o24Var.d(i9) != intValue) {
                    if (intValue >= i10) {
                        i9 = bd6Var2.h(i10 - 1);
                    } else {
                        i9 = bd6Var2.h(intValue);
                    }
                }
                int i11 = (int) (k & 4294967295L);
                if (o24Var.d(i11) != intValue) {
                    if (intValue >= i10) {
                        i11 = o24Var.c(i10 - 1, false);
                    } else {
                        i11 = o24Var.c(intValue, false);
                    }
                }
                int i12 = i3;
                if (i9 == i12) {
                    return fm0Var2.c(i11);
                }
                if (i11 == i12) {
                    return fm0Var2.c(i9);
                }
                if (!(z3 ^ z2) ? i7 >= i9 : i7 > i11) {
                    i9 = i11;
                }
                return fm0Var2.c(i9);
            }
        });
        if (1 != xg5Var.c) {
            return (xg5) B2.getValue();
        }
        if (i2 == i6) {
            return xg5Var;
        }
        if (((Number) B.getValue()).intValue() != bd6Var.b.d(i6)) {
            return (xg5) B2.getValue();
        }
        int i7 = xg5Var.b;
        long k = bd6Var.k(i7);
        if (i6 != -1) {
            if (i2 != i6) {
                p21 p21Var2 = p21.x;
                if (i5 < i4) {
                    p21Var = p21.y;
                } else if (i5 > i4) {
                    p21Var = p21Var2;
                } else {
                    p21Var = p21.z;
                }
                if (p21Var != p21Var2) {
                    b2 = 0;
                }
                if (((z ? 1 : 0) ^ b2) == 0) {
                }
            }
            return fm0Var.c(i2);
        }
        int i8 = nd6.c;
        if (i7 != ((int) (k >> 32)) && i7 != ((int) (k & 4294967295L))) {
            return fm0Var.c(i2);
        }
        return (xg5) B2.getValue();
    }

    public static final void h(Recommendation recommendation, yz3 yz3Var, ub2 ub2Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        recommendation.getClass();
        ub2Var.getClass();
        kd2Var.f0(-1651242615);
        if (kd2Var.h(recommendation)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (kd2Var.f(yz3Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (kd2Var.h(ub2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        boolean z2 = false;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i8 & 1, z)) {
            bv2 bv2Var = new bv2((Context) kd2Var.j(eb.b));
            String extraLarge = recommendation.getCoverImage().getExtraLarge();
            if (extraLarge == null) {
                extraLarge = recommendation.getCoverImage().getLarge();
            }
            bv2Var.c = extraLarge;
            hv2.a(bv2Var, true);
            ev2 a2 = bv2Var.a();
            String b2 = e02.b(recommendation.getTitle());
            long j2 = ep0.b;
            yz3 e2 = ar5.e(ar5.n(yz3Var, 0.0f, 180.0f, 1), 275.0f);
            if ((i8 & 896) == 256) {
                z2 = true;
            }
            boolean h2 = kd2Var.h(recommendation) | z2;
            Object Q = kd2Var.Q();
            if (h2 || Q == au0.a) {
                Q = new va1(ub2Var, recommendation, (byte) 25);
                kd2Var.n0(Q);
            }
            l36.a(kb0.A(e2, false, null, null, false, (sb2) Q, kd2Var, 0, 31), ((cn5) kd2Var.j(dn5.a)).c, ((mp0) kd2Var.j(op0.a)).p, 0L, 0.0f, 0.0f, null, nx7.R(2128207118, new fm(recommendation, a2, j2, b2, (byte) 1), kd2Var), kd2Var, 12582912, 120);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new df((Object) recommendation, yz3Var, ub2Var, i2, (byte) 8);
        }
    }

    public static void i(wd4 wd4Var, og3 og3Var, ub2 ub2Var) {
        wd4Var.getClass();
        wd4Var.a(og3Var, new nz(ub2Var));
    }

    public static final yg5 j(u98 u98Var, s80 s80Var) {
        boolean z;
        p21 i2 = u98Var.i();
        fm0 fm0Var = (fm0) u98Var.A;
        if (i2 == p21.x) {
            z = true;
        } else {
            z = false;
        }
        return new yg5(k(fm0Var, z, true, s80Var), k(fm0Var, z, false, s80Var), z);
    }

    public static final xg5 k(fm0 fm0Var, boolean z, boolean z2, s80 s80Var) {
        int i2;
        long j2;
        if (z2) {
            i2 = fm0Var.y;
        } else {
            i2 = fm0Var.z;
        }
        long b2 = s80Var.b(fm0Var, i2);
        if (z ^ z2) {
            int i3 = nd6.c;
            j2 = b2 >> 32;
        } else {
            int i4 = nd6.c;
            j2 = 4294967295L & b2;
        }
        return fm0Var.c((int) j2);
    }

    public static w42 l(w42 w42Var, int i2) {
        ta0 ta0Var;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            ze0.e(qx1.h(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i2 == -1) {
            i2 = 0;
            ta0Var = ta0.y;
        } else {
            ta0Var = ta0.x;
        }
        int i3 = i2;
        ta0 ta0Var2 = ta0Var;
        if (w42Var instanceof wc2) {
            return wc2.c((wc2) w42Var, null, i3, ta0Var2, 1);
        }
        return new sj0(w42Var, null, i3, ta0Var2, 2);
    }

    public static boolean m(vv vvVar) {
        if (vvVar.a == -1 || vvVar.b == -1) {
            return false;
        }
        int i2 = vvVar.c;
        if (i2 != 2 && i2 != 4) {
            return false;
        }
        return true;
    }

    public static final xg5 q(xg5 xg5Var, fm0 fm0Var, int i2) {
        return new xg5(((bd6) fm0Var.B).a(i2), i2, xg5Var.c);
    }

    public static long[] r(long[]... jArr) {
        boolean z;
        long j2 = 0;
        for (long[] jArr2 : jArr) {
            j2 += jArr2.length;
        }
        int i2 = (int) j2;
        if (j2 == i2) {
            z = true;
        } else {
            z = false;
        }
        io3.l(j2, "the total number of elements (%s) in the arrays must fit in an int", z);
        long[] jArr3 = new long[i2];
        int i3 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i3, jArr4.length);
            i3 += jArr4.length;
        }
        return jArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r0 != r8) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #2 {all -> 0x009c, blocks: (B:25:0x0065, B:27:0x006b, B:34:0x00a2, B:39:0x00be), top: B:24:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2 A[Catch: all -> 0x009c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x009c, blocks: (B:25:0x0065, B:27:0x006b, B:34:0x00a2, B:39:0x00be), top: B:24:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r14v0, types: [wc0] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [ae0] */
    /* JADX WARN: Type inference failed for: r14v5, types: [ae0] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [xc0] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [xc0, vz0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [xc0, xz0] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [wc0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [wc0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0099 -> B:23:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.wc0 r14, defpackage.ae0 r15, defpackage.xz0 r16) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.s(wc0, ae0, xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (r1.c(r6, r13) == r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        if (r0 != r8) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [yc0] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [yc0, vz0] */
    /* JADX WARN: Type inference failed for: r1v8, types: [yc0, vz0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ae0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [ae0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ae0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00cb -> B:23:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.wc0 r17, defpackage.ae0 r18, long r19, defpackage.xz0 r21) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.t(wc0, ae0, long, xz0):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [fc5, k03] */
    public static y83 u(im0 im0Var, ic2 ic2Var, v83 v83Var, e04 e04Var, int i2) {
        k03 k03Var;
        kz5 kz5Var = zp2.C;
        kz5Var.getClass();
        e04Var.getClass();
        r50 r50Var = new r50(kz5Var, im0Var, null, ic2Var, v83Var);
        int ordinal = v83Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ?? k03Var2 = new k03(r50Var);
                    k03Var2.b = new ConcurrentHashMap();
                    k03Var = k03Var2;
                } else {
                    ze0.l();
                    return null;
                }
            } else {
                k03Var = new k03(r50Var);
            }
        } else {
            k03Var = new k03(r50Var);
        }
        e04Var.a(k03Var);
        return new y83(e04Var, k03Var);
    }

    public static final j21 v(ew6 ew6Var) {
        ew6Var.getClass();
        if (ew6Var instanceof uj2) {
            return ((uj2) ew6Var).getDefaultViewModelCreationExtras();
        }
        return i21.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0047 -> B:11:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005a -> B:10:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.wc0 r8, long r9, defpackage.xz0 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.zc0
            if (r0 == 0) goto L13
            r0 = r11
            zc0 r0 = (defpackage.zc0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            zc0 r0 = new zc0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.A
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            long r8 = r0.z
            long r3 = r0.y
            wc0 r10 = r0.x
            defpackage.m37.N(r11)
            goto L5f
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            r8 = 0
            return r8
        L32:
            defpackage.m37.N(r11)
            r11 = r0
            r0 = r9
        L37:
            r3 = 0
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 <= 0) goto L79
            boolean r3 = r8.h()
            if (r3 != 0) goto L79
            int r3 = G(r8)
            if (r3 != 0) goto L64
            r11.x = r8
            r11.y = r0
            r11.z = r9
            r11.B = r2
            java.lang.Object r3 = r8.c(r2, r11)
            w11 r4 = defpackage.w11.x
            if (r3 != r4) goto L5a
            return r4
        L5a:
            r3 = r9
            r10 = r8
            r8 = r3
            r3 = r0
            r0 = r11
        L5f:
            r6 = r8
            r8 = r10
            r9 = r6
            r11 = r0
            r0 = r3
        L64:
            oa0 r3 = r8.g()
            long r3 = defpackage.sw0.w(r3)
            long r3 = java.lang.Math.min(r9, r3)
            oa0 r5 = r8.g()
            defpackage.sw0.l(r5, r3)
            long r9 = r9 - r3
            goto L37
        L79:
            long r0 = r0 - r9
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.w(wc0, long, xz0):java.lang.Object");
    }

    public static final yg5 x(yg5 yg5Var, u98 u98Var) {
        int f2;
        xg5 xg5Var;
        fm0 fm0Var = (fm0) u98Var.A;
        if (yg5Var != null) {
            xg5 xg5Var2 = yg5Var.a;
            long j2 = xg5Var2.c;
            xg5 xg5Var3 = yg5Var.b;
            if (j2 == xg5Var3.c) {
                if (xg5Var2.b != xg5Var3.b) {
                    return yg5Var;
                }
            } else {
                boolean z = yg5Var.c;
                if (z) {
                    xg5Var = xg5Var2;
                } else {
                    xg5Var = xg5Var3;
                }
                if (xg5Var.b == 0) {
                    if (z) {
                        xg5Var2 = xg5Var3;
                    }
                    if (((bd6) fm0Var.B).a.a.y.length() != xg5Var2.b) {
                        return yg5Var;
                    }
                } else {
                    return yg5Var;
                }
            }
        }
        yg5 yg5Var2 = (yg5) u98Var.z;
        String str = ((bd6) fm0Var.B).a.a.y;
        if (yg5Var2 != null && str.length() != 0) {
            boolean z2 = u98Var.y;
            String str2 = ((bd6) fm0Var.B).a.a.y;
            int i2 = fm0Var.y;
            int length = str2.length();
            boolean z3 = false;
            if (i2 == 0) {
                int f3 = fz5.f(0, str2);
                if (z2) {
                    return yg5.a(yg5Var, q(yg5Var.a, fm0Var, f3), null, true, 2);
                }
                return yg5.a(yg5Var, null, q(yg5Var.b, fm0Var, f3), false, 1);
            }
            if (i2 == length) {
                int g2 = fz5.g(length, str2);
                if (z2) {
                    return yg5.a(yg5Var, q(yg5Var.a, fm0Var, g2), null, false, 2);
                }
                return yg5.a(yg5Var, null, q(yg5Var.b, fm0Var, g2), true, 1);
            }
            if (yg5Var2.c) {
                z3 = true;
            }
            if (z2 ^ z3) {
                f2 = fz5.g(i2, str2);
            } else {
                f2 = fz5.f(i2, str2);
            }
            if (z2) {
                return yg5.a(yg5Var, q(yg5Var.a, fm0Var, f2), null, z3, 2);
            }
            return yg5.a(yg5Var, null, q(yg5Var.b, fm0Var, f2), z3, 1);
        }
        return yg5Var;
    }

    public static final void y(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.p0();
            o80.r(s0, null);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(defpackage.wc0 r4, defpackage.xz0 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ad0
            if (r0 == 0) goto L13
            r0 = r5
            ad0 r0 = (defpackage.ad0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ad0 r0 = new ad0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            wc0 r4 = r0.x
            defpackage.m37.N(r5)
            goto L48
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.m37.N(r5)
            oa0 r5 = r4.g()
            boolean r5 = r5.D()
            if (r5 == 0) goto L48
            r0.x = r4
            r0.z = r2
            java.lang.Object r5 = r4.c(r2, r0)
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L48
            return r0
        L48:
            oa0 r4 = r4.g()
            boolean r4 = r4.D()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz.z(wc0, xz0):java.lang.Object");
    }

    public void S(w2 w2Var, w2 w2Var2) {
        w2Var.b = w2Var2;
    }

    public void T(w2 w2Var, Thread thread) {
        w2Var.a = thread;
    }

    public boolean n(x2 x2Var, s2 s2Var, s2 s2Var2) {
        synchronized (x2Var) {
            try {
                if (x2Var.y == s2Var) {
                    x2Var.y = s2Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean o(x2 x2Var, Object obj, Object obj2) {
        synchronized (x2Var) {
            try {
                if (x2Var.x == obj) {
                    x2Var.x = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean p(x2 x2Var, w2 w2Var, w2 w2Var2) {
        synchronized (x2Var) {
            try {
                if (x2Var.z == w2Var) {
                    x2Var.z = w2Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
