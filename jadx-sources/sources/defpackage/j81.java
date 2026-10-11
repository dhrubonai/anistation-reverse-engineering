package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j81 implements ho0 {
    public final Context x;
    public final boolean y;

    public j81(Context context) {
        this.x = context.getApplicationContext();
        this.y = true;
    }

    public static oz1 a(ea2 ea2Var, String str) {
        return oz1.c(new IllegalArgumentException(str), 4003, new pn0(ea2Var.toString(), qy3.m(ea2Var.p), false, (String) null));
    }

    public static oz1 d(ea2 ea2Var, boolean z) {
        String str;
        hp0 hp0Var = ea2Var.H;
        if (z && hp0.h(hp0Var)) {
            str = "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: " + hp0Var;
        } else {
            str = "No MIME type is supported by both encoder and muxer.";
        }
        return oz1.c(new IllegalArgumentException(str), 4003, new pn0(ea2Var.toString(), z, false, (String) null));
    }

    public static nw2 e(nw2 nw2Var, k81 k81Var) {
        ArrayList arrayList = new ArrayList(nw2Var.size());
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < nw2Var.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) nw2Var.get(i2);
            int b = k81Var.b(mediaCodecInfo);
            if (b != Integer.MAX_VALUE) {
                if (b < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = b;
                } else if (b == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return nw2.o(arrayList);
    }

    @Override // defpackage.ho0
    public p71 b(ea2 ea2Var, LogSessionId logSessionId) {
        rt3 rt3Var;
        if (ea2Var.k == -1) {
            da2 a = ea2Var.a();
            a.i = 131072;
            ea2Var = new ea2(a);
        }
        String str = ea2Var.p;
        if (str != null) {
            MediaFormat m = m37.m(ea2Var);
            nw2 d = zt1.d(str);
            if (!d.isEmpty()) {
                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) d.get(0);
                int i = ea2Var.L;
                if (d.isEmpty()) {
                    rt3Var = null;
                } else {
                    ArrayList arrayList = new ArrayList(d.size());
                    int i2 = Integer.MAX_VALUE;
                    for (int i3 = 0; i3 < d.size(); i3++) {
                        MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) d.get(i3);
                        int abs = Math.abs(zt1.b(mediaCodecInfo2, str, i) - i);
                        if (abs != Integer.MAX_VALUE) {
                            if (abs < i2) {
                                arrayList.clear();
                                arrayList.add(mediaCodecInfo2);
                                i2 = abs;
                            } else if (abs == i2) {
                                arrayList.add(mediaCodecInfo2);
                            }
                        }
                    }
                    MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) nw2.o(arrayList).get(0);
                    int b = zt1.b(mediaCodecInfo3, str, i);
                    da2 a2 = ea2Var.a();
                    a2.K = b;
                    rt3Var = new rt3((Object) mediaCodecInfo3, (Object) new ea2(a2), (byte) 16);
                }
                if (rt3Var != null) {
                    mediaCodecInfo = (MediaCodecInfo) rt3Var.y;
                    ea2Var = (ea2) rt3Var.z;
                    m = m37.m(ea2Var);
                }
                ea2 ea2Var2 = ea2Var;
                MediaFormat mediaFormat = m;
                if (Build.VERSION.SDK_INT >= 35 && logSessionId != null) {
                    nu5.p(mediaFormat, logSessionId);
                }
                return new p71(this.x, ea2Var2, mediaFormat, mediaCodecInfo.getName(), false, null);
            }
            throw a(ea2Var, "No audio media codec found");
        }
        throw d(ea2Var, false);
    }

    @Override // defpackage.ho0
    public boolean c() {
        ks6 ks6Var = ks6.g;
        return !ks6Var.equals(ks6Var);
    }

    @Override // defpackage.ho0
    public boolean j() {
        return !true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b3, code lost:
    
        if (r6.equals("T603") != false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c5  */
    @Override // defpackage.ho0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.p71 m(defpackage.ea2 r24, android.media.metrics.LogSessionId r25) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j81.m(ea2, android.media.metrics.LogSessionId):p71");
    }

    public j81(j81 j81Var) {
        this.x = j81Var.x;
        this.y = j81Var.y;
    }
}
