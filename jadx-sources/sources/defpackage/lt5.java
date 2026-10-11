package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.os.UserManager;
import android.view.KeyEvent;
import com.anistation.android.R;
import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.download.EpisodeDownloadState;
import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.model.watch.Provider;
import com.anistation.model.watch.Server;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class lt5 {
    public static int A(byte[] bArr, int i, yf7 yf7Var, m97 m97Var) {
        nf7 nf7Var = (nf7) yf7Var;
        int p = p(bArr, i, m97Var);
        int i2 = m97Var.a + p;
        while (p < i2) {
            p = p(bArr, p, m97Var);
            nf7Var.f(m97Var.a);
        }
        if (p == i2) {
            return p;
        }
        jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int B(xg7 xg7Var, int i, byte[] bArr, int i2, int i3, yf7 yf7Var, m97 m97Var) {
        mf7 a = xg7Var.a();
        xg7 xg7Var2 = xg7Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        m97 m97Var2 = m97Var;
        int x = x(a, xg7Var2, bArr2, i2, i4, m97Var2);
        xg7Var2.f(a);
        m97Var2.d = a;
        yf7Var.add(a);
        while (x < i4) {
            m97 m97Var3 = m97Var2;
            int i5 = i4;
            int p = p(bArr2, x, m97Var3);
            if (i != m97Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            xg7 xg7Var3 = xg7Var2;
            mf7 a2 = xg7Var3.a();
            x = x(a2, xg7Var3, bArr3, p, i5, m97Var3);
            xg7Var2 = xg7Var3;
            bArr2 = bArr3;
            i4 = i5;
            m97Var2 = m97Var3;
            xg7Var2.f(a2);
            m97Var2.d = a2;
            yf7Var.add(a2);
        }
        return x;
    }

    public static int C(int i, byte[] bArr, int i2, int i3, gh7 gh7Var, m97 m97Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                gh7Var.d(i, Integer.valueOf(t(i2, bArr)));
                                return i2 + 4;
                            }
                            jz7.e("Protocol message contained an invalid tag (zero).");
                            return 0;
                        }
                        int i5 = (i & (-8)) | 4;
                        gh7 a = gh7.a();
                        int i6 = m97Var.c + 1;
                        m97Var.c = i6;
                        if (i6 < 100) {
                            int i7 = 0;
                            while (true) {
                                if (i2 >= i3) {
                                    break;
                                }
                                int p = p(bArr, i2, m97Var);
                                int i8 = m97Var.a;
                                if (i8 == i5) {
                                    i7 = i8;
                                    i2 = p;
                                    break;
                                }
                                i2 = C(i8, bArr, p, i3, a, m97Var);
                                i7 = i8;
                            }
                            m97Var.c--;
                            if (i2 <= i3 && i7 == i5) {
                                gh7Var.d(i, a);
                                return i2;
                            }
                            jz7.e("Failed to parse the message.");
                            return 0;
                        }
                        jz7.e("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        return 0;
                    }
                    int p2 = p(bArr, i2, m97Var);
                    int i9 = m97Var.a;
                    if (i9 >= 0) {
                        if (i9 <= bArr.length - p2) {
                            if (i9 == 0) {
                                gh7Var.d(i, we7.y);
                            } else {
                                gh7Var.d(i, we7.j(bArr, p2, i9));
                            }
                            return p2 + i9;
                        }
                        jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return 0;
                    }
                    jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    return 0;
                }
                gh7Var.d(i, Long.valueOf(u(i2, bArr)));
                return i2 + 8;
            }
            int s = s(bArr, i2, m97Var);
            gh7Var.d(i, Long.valueOf(m97Var.b));
            return s;
        }
        jz7.e("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public static int D(int i, byte[] bArr, int i2, int i3, m97 m97Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            jz7.e("Protocol message contained an invalid tag (zero).");
                            return 0;
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = p(bArr, i2, m97Var);
                            i6 = m97Var.a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = D(i6, bArr, i2, i3, m97Var);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        jz7.e("Failed to parse the message.");
                        return 0;
                    }
                    return p(bArr, i2, m97Var) + m97Var.a;
                }
                return i2 + 8;
            }
            return s(bArr, i2, m97Var);
        }
        jz7.e("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c8, code lost:
    
        if (r14 == defpackage.au0.a) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.zw r24, final java.util.List r25, final float r26, final boolean r27, final defpackage.ub2 r28, defpackage.kd2 r29, final int r30) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt5.a(zw, java.util.List, float, boolean, ub2, kd2, int):void");
    }

    public static final void b(final EpisodeDownload episodeDownload, final EpisodeDownload episodeDownload2, final String str, final List list, final boolean z, final boolean z2, final int i, final float f, final kk1 kk1Var, final ub2 ub2Var, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final ub2 ub2Var2, final sb2 sb2Var, final ub2 ub2Var3, final sb2 sb2Var2, final ic2 ic2Var, final sb2 sb2Var3, kd2 kd2Var, final int i2, final int i3) {
        int i4;
        int i5;
        String u;
        OfflineDownloadMetadata metadata;
        String u2;
        OfflineDownloadMetadata metadata2;
        kk1 kk1Var2;
        boolean z7;
        long j;
        long j2;
        EpisodeDownload episodeDownload3;
        EpisodeDownload episodeDownload4;
        String str2;
        int i6;
        int i7;
        boolean z8;
        OfflineDownloadMetadata metadata3;
        OfflineDownloadMetadata metadata4;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(-756664498);
        if ((i2 & 6) == 0) {
            i4 = i2 | (kd2Var2.h(episodeDownload) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= kd2Var2.h(episodeDownload2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= kd2Var2.f(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= kd2Var2.f(list) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= kd2Var2.g(z) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= kd2Var2.g(z2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= kd2Var2.d(i) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= kd2Var2.c(f) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= kd2Var2.d(kk1Var.ordinal()) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= kd2Var2.h(ub2Var) ? 536870912 : 268435456;
        }
        int i8 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (kd2Var2.g(z3) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= kd2Var2.g(z4) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= kd2Var2.g(z5) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= kd2Var2.g(z6) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= kd2Var2.h(ub2Var2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= kd2Var2.h(sb2Var) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= kd2Var2.h(ub2Var3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= kd2Var2.h(sb2Var2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= kd2Var2.h(ic2Var) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= kd2Var2.h(sb2Var3) ? 536870912 : 268435456;
        }
        int i9 = i5;
        if (kd2Var2.V(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 306783379) == 306783378) ? false : true)) {
            boolean z9 = (i8 & 7168) == 2048;
            Object Q = kd2Var2.Q();
            q18 q18Var = au0.a;
            if (z9 || Q == q18Var) {
                Q = z51.o(list);
                kd2Var2.n0(Q);
            }
            List list2 = (List) Q;
            boolean f2 = kd2Var2.f(list2) | kd2Var2.f((episodeDownload == null || (metadata4 = episodeDownload.getMetadata()) == null) ? null : metadata4.getQuality());
            Object Q2 = kd2Var2.Q();
            if (f2 || Q2 == q18Var) {
                if (episodeDownload == null || (metadata = episodeDownload.getMetadata()) == null || (u = metadata.getQuality()) == null) {
                    u = z51.u(list2);
                }
                Q2 = xt5.g(u);
                kd2Var2.n0(Q2);
            }
            w44 w44Var = (w44) Q2;
            boolean f3 = kd2Var2.f(list2) | kd2Var2.f((episodeDownload2 == null || (metadata3 = episodeDownload2.getMetadata()) == null) ? null : metadata3.getQuality());
            Object Q3 = kd2Var2.Q();
            if (f3 || Q3 == q18Var) {
                if (episodeDownload2 == null || (metadata2 = episodeDownload2.getMetadata()) == null || (u2 = metadata2.getQuality()) == null) {
                    u2 = z51.u(list2);
                }
                Q3 = xt5.g(u2);
                kd2Var2.n0(Q3);
            }
            w44 w44Var2 = (w44) Q3;
            vz3 vz3Var = vz3.x;
            yz3 V = n77.V(n77.k0(ar5.g(ar5.c(vz3Var, 1.0f), 0.0f, f, 1), n77.d0(kd2Var2), 14), 12.0f, 0.0f, 12.0f, 16.0f, 2);
            xp0 a = vp0.a(new vr(15.0f, true, new ze0((byte) 6)), pk2.K, kd2Var2, 6);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, V);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z10 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z10) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            kd2Var2.e0(-293138322);
            String g = lz5.g(R.string.download_episode_num, new Object[]{Integer.valueOf(i)}, kd2Var2);
            xd6 xd6Var = ((nl6) kd2Var2.j(pl6.a)).h;
            tq1 tq1Var = op0.a;
            yc6.b(g, ar5.c(vz3Var, 1.0f), ((mp0) kd2Var2.j(tq1Var)).o, 0L, null, null, 0L, new c86(3), 0L, 0, false, 0, 0, xd6Var, kd2Var, 48, 0, 130040);
            kd2 kd2Var3 = kd2Var;
            if (episodeDownload == null && episodeDownload2 == null && (z4 || z3)) {
                kd2Var3.e0(-292828850);
                yz3 R = n77.R(ar5.c(vz3Var, 1.0f), 32.0f);
                vo3 c = b90.c(pk2.C, false);
                int hashCode2 = Long.hashCode(kd2Var3.T);
                al4 l2 = kd2Var3.l();
                yz3 E2 = o80.E(kd2Var3, R);
                kd2Var3.h0();
                if (kd2Var3.S) {
                    kd2Var3.k(t53Var);
                } else {
                    kd2Var3.q0();
                }
                ss5.i(st0Var, kd2Var3, c);
                ss5.i(ys0Var, kd2Var3, l2);
                h11.q(hashCode2, kd2Var3, st0Var2, kd2Var3);
                ss5.i(ys0Var2, kd2Var3, E2);
                cv4.a(null, ((mp0) kd2Var3.j(tq1Var)).o, 0.0f, 0L, 0, 0.0f, kd2Var, 0, 61);
                kd2Var2 = kd2Var;
                kd2Var2.q(true);
                kd2Var2.q(false);
                kd2Var2.q(false);
                z8 = true;
            } else {
                kd2Var3.e0(-292505954);
                kd2Var3.q(false);
                yz3 c2 = ar5.c(vz3Var, 1.0f);
                z75 a2 = y75.a(new vr(8.0f, true, new ze0((byte) 4)), pk2.H, kd2Var3, 6);
                int hashCode3 = Long.hashCode(kd2Var3.T);
                al4 l3 = kd2Var3.l();
                yz3 E3 = o80.E(kd2Var3, c2);
                kd2Var3.h0();
                if (kd2Var3.S) {
                    kd2Var3.k(t53Var);
                } else {
                    kd2Var3.q0();
                }
                ss5.i(st0Var, kd2Var3, a2);
                ss5.i(ys0Var, kd2Var3, l3);
                h11.q(hashCode3, kd2Var3, st0Var2, kd2Var3);
                ss5.i(ys0Var2, kd2Var3, E3);
                if (!z && episodeDownload == null) {
                    kd2Var3.e0(-146428166);
                    kd2Var3.q(false);
                    kk1Var2 = kk1Var;
                    z7 = false;
                } else {
                    kd2Var3.e0(-146941340);
                    String f4 = lz5.f(R.string.internal, kd2Var3);
                    kk1 kk1Var3 = kk1.x;
                    kk1Var2 = kk1Var;
                    boolean z11 = kk1Var2 == kk1Var3;
                    boolean z12 = (i8 & 1879048192) == 536870912;
                    Object Q4 = kd2Var3.Q();
                    if (z12 || Q4 == q18Var) {
                        Q4 = new wi(ub2Var, (byte) 11);
                        kd2Var3.n0(Q4);
                    }
                    ub2 ub2Var4 = (ub2) Q4;
                    if (kk1Var2 == kk1Var3) {
                        kd2Var3.e0(-146635804);
                        j = ((mp0) kd2Var3.j(tq1Var)).o;
                        z7 = false;
                        kd2Var3.q(false);
                    } else {
                        z7 = false;
                        kd2Var3.e0(-146544478);
                        j = ((mp0) kd2Var3.j(tq1Var)).r;
                        kd2Var3.q(false);
                    }
                    db.l(f4, z11, ub2Var4, null, null, null, j, 0L, false, kd2Var3, 0, 440);
                    kd2Var3 = kd2Var3;
                    kd2Var3.q(z7);
                }
                if (!z && episodeDownload2 == null) {
                    kd2Var3.e0(-145842886);
                    kd2Var3.q(z7);
                } else {
                    kd2Var3.e0(-146356060);
                    String f5 = lz5.f(R.string.external, kd2Var3);
                    kk1 kk1Var4 = kk1.y;
                    boolean z13 = kk1Var2 == kk1Var4;
                    boolean z14 = (i8 & 1879048192) == 536870912;
                    Object Q5 = kd2Var3.Q();
                    if (z14 || Q5 == q18Var) {
                        Q5 = new wi(ub2Var, (byte) 12);
                        kd2Var3.n0(Q5);
                    }
                    ub2 ub2Var5 = (ub2) Q5;
                    if (kk1Var2 == kk1Var4) {
                        kd2Var3.e0(-146050524);
                        j2 = ((mp0) kd2Var3.j(tq1Var)).o;
                        z7 = false;
                        kd2Var3.q(false);
                    } else {
                        z7 = false;
                        kd2Var3.e0(-145959198);
                        j2 = ((mp0) kd2Var3.j(tq1Var)).r;
                        kd2Var3.q(false);
                    }
                    kd2 kd2Var4 = kd2Var3;
                    db.l(f5, z13, ub2Var5, null, null, null, j2, 0L, false, kd2Var4, 0, 440);
                    kd2Var3 = kd2Var4;
                    kd2Var3.q(z7);
                }
                kd2Var3.q(true);
                int ordinal = kk1Var2.ordinal();
                if (ordinal == 0) {
                    episodeDownload3 = episodeDownload;
                } else {
                    if (ordinal != 1) {
                        ze0.l();
                        return;
                    }
                    episodeDownload3 = episodeDownload2;
                }
                int ordinal2 = kk1Var2.ordinal();
                if (ordinal2 == 0) {
                    episodeDownload4 = episodeDownload2;
                } else {
                    if (ordinal2 != 1) {
                        ze0.l();
                        return;
                    }
                    episodeDownload4 = episodeDownload;
                }
                int ordinal3 = kk1Var2.ordinal();
                if (ordinal3 == 0) {
                    str2 = (String) w44Var.getValue();
                } else if (ordinal3 == 1) {
                    str2 = (String) w44Var2.getValue();
                } else {
                    ze0.l();
                    return;
                }
                int i10 = i8 & 234881024;
                boolean f6 = (i10 == 67108864 ? true : z7) | kd2Var3.f(w44Var) | kd2Var3.f(w44Var2);
                Object Q6 = kd2Var3.Q();
                if (f6 || Q6 == q18Var) {
                    Q6 = new qb6((Object) kk1Var2, (Object) w44Var, (Object) w44Var2, (byte) 4);
                    kd2Var3.n0(Q6);
                }
                ub2 ub2Var6 = (ub2) Q6;
                boolean z15 = ((i9 & 57344) == 16384 ? true : z7) | (i10 == 67108864 ? true : z7) | ((i9 & 3670016) == 1048576 ? true : z7);
                Object Q7 = kd2Var3.Q();
                if (z15 || Q7 == q18Var) {
                    i6 = 57344;
                    Q7 = new qb6((Object) kk1Var2, (Object) ub2Var2, (Object) ub2Var3, (byte) 5);
                    kd2Var3.n0(Q7);
                } else {
                    i6 = 57344;
                }
                ub2 ub2Var7 = (ub2) Q7;
                boolean z16 = (i10 == 67108864 ? true : z7) | ((i9 & 458752) == 131072) | ((i9 & 29360128) == 8388608);
                Object Q8 = kd2Var3.Q();
                byte b = 23;
                if (z16 || Q8 == q18Var) {
                    i7 = 234881024;
                    Q8 = new mi(kk1Var2, sb2Var, sb2Var2, b);
                    kd2Var3.n0(Q8);
                } else {
                    i7 = 234881024;
                }
                sb2 sb2Var4 = (sb2) Q8;
                boolean h = kd2Var3.h(episodeDownload3) | ((i9 & i7) == 67108864);
                Object Q9 = kd2Var3.Q();
                if (h || Q9 == q18Var) {
                    Q9 = new ll5((Object) episodeDownload3, (Object) ic2Var, (byte) 23);
                    kd2Var3.n0(Q9);
                }
                int i11 = i8 << 9;
                kd2 kd2Var5 = kd2Var3;
                z8 = true;
                f(kk1Var2, episodeDownload3, episodeDownload4, str, list2, str2, ub2Var6, z, z2, z5, z6, ub2Var7, sb2Var4, (ub2) Q9, sb2Var3, kd2Var5, ((i8 << 3) & 7168) | ((i8 >> 24) & 14) | (i11 & 29360128) | (i11 & i7) | ((i9 << 21) & 1879048192), ((i9 >> 9) & 14) | ((i9 >> 15) & i6));
                kd2Var2 = kd2Var5;
                kd2Var2.q(false);
            }
            kd2Var2.q(z8);
        } else {
            kd2Var2.Y();
        }
        zz4 u3 = kd2Var2.u();
        if (u3 != null) {
            u3.d = new ic2() { // from class: h17
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(i2 | 1);
                    int N2 = kb0.N(i3);
                    lt5.b(EpisodeDownload.this, episodeDownload2, str, list, z, z2, i, f, kk1Var, ub2Var, z3, z4, z5, z6, ub2Var2, sb2Var, ub2Var3, sb2Var2, ic2Var, sb2Var3, (kd2) obj, N, N2);
                    return pn6.a;
                }
            };
        }
    }

    public static final void c(String str, List list, float f, boolean z, ub2 ub2Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(1640442827);
        if ((i & 6) == 0) {
            if (kd2Var2.f(str)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var2.f(list)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (kd2Var2.c(f)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (kd2Var2.g(z)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (kd2Var2.h(ub2Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var2.V(i2 & 1, z2)) {
            vz3 vz3Var = vz3.x;
            float f2 = 1.0f;
            yz3 V = n77.V(n77.k0(ar5.g(ar5.c(vz3Var, 1.0f), 0.0f, f, 1), n77.d0(kd2Var2), 14), 12.0f, 0.0f, 12.0f, 12.0f, 2);
            xp0 a = vp0.a(new vr(4.0f, true, new ze0((byte) 6)), pk2.K, kd2Var2, 6);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, V);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z7 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z7) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            kd2Var2.e0(-74537274);
            if (z) {
                kd2Var2.e0(-74584271);
                yz3 R = n77.R(ar5.c(vz3Var, 1.0f), 32.0f);
                vo3 c = b90.c(pk2.C, false);
                int hashCode2 = Long.hashCode(kd2Var2.T);
                al4 l2 = kd2Var2.l();
                yz3 E2 = o80.E(kd2Var2, R);
                kd2Var2.h0();
                if (kd2Var2.S) {
                    kd2Var2.k(t53Var);
                } else {
                    kd2Var2.q0();
                }
                ss5.i(st0Var, kd2Var2, c);
                ss5.i(ys0Var, kd2Var2, l2);
                h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
                ss5.i(ys0Var2, kd2Var2, E2);
                z4 = false;
                z3 = true;
                cv4.a(null, ((mp0) kd2Var2.j(op0.a)).o, 0.0f, 0L, 0, 0.0f, kd2Var, 0, 61);
                kd2Var2 = kd2Var;
                kd2Var2.q(true);
                kd2Var2.q(false);
            } else {
                z3 = true;
                z4 = false;
                kd2Var2.e0(-74261375);
                kd2Var2.q(false);
                if (list.isEmpty()) {
                    kd2Var2.e0(-74210814);
                    h98.d(lz5.f(R.string.no_qualities_available, kd2Var2), lz5.f(R.string.no_available_qualities, kd2Var2), null, kd2Var2, 0, 4);
                    kd2Var2.q(false);
                } else {
                    kd2Var2.e0(-73996511);
                    kd2Var2.q(false);
                    ov5.a(kd2Var2, ar5.e(vz3Var, 8.0f));
                    kd2Var2.e0(1383090469);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        boolean C = b06.C(str, str2, z3);
                        yz3 c2 = ar5.c(vz3Var, f2);
                        if ((57344 & i2) == 16384) {
                            z6 = z3;
                        } else {
                            z6 = false;
                        }
                        boolean f3 = z6 | kd2Var2.f(str2);
                        Object Q = kd2Var2.Q();
                        if (f3 || Q == au0.a) {
                            Q = new eh(ub2Var, str2, (byte) 5);
                            kd2Var2.n0(Q);
                        }
                        vz3 vz3Var2 = vz3Var;
                        float f4 = f2;
                        yz3 A = kb0.A(c2, false, null, null, false, (sb2) Q, kd2Var, 6, 31);
                        if (C) {
                            kd2Var.e0(-1601786947);
                            j = n03.r(kd2Var).o;
                            kd2Var.q(false);
                        } else {
                            kd2Var.e0(-1601785032);
                            j = n03.r(kd2Var).p;
                            kd2Var.q(false);
                        }
                        if (C) {
                            kd2Var.e0(-1601782469);
                            j2 = n03.r(kd2Var).n;
                            kd2Var.q(false);
                        } else {
                            kd2Var.e0(-1601780611);
                            j2 = n03.r(kd2Var).o;
                            kd2Var.q(false);
                        }
                        l36.a(A, n03.w(kd2Var).c, j, j2, 0.0f, 0.0f, null, nx7.R(-1905794218, new b17(str2, C, (byte) 1), kd2Var), kd2Var, 12582912, 112);
                        kd2Var2 = kd2Var;
                        vz3Var = vz3Var2;
                        f2 = f4;
                        z3 = true;
                    }
                    kd2Var2.q(false);
                    kd2Var2.q(false);
                    z5 = true;
                    kd2Var2.q(z5);
                }
            }
            kd2Var2.q(z4);
            z5 = z3;
            kd2Var2.q(z5);
        } else {
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new c17(str, list, f, z, ub2Var, i);
        }
    }

    public static final void d(final Server server, final float f, final String str, final boolean z, final boolean z2, final ub2 ub2Var, kd2 kd2Var, final int i) {
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(227940406);
        if (kd2Var2.h(server)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i2 | i;
        if ((i & 48) == 0) {
            if (kd2Var2.c(f)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i8 |= i7;
        }
        if ((i & 384) == 0) {
            if (kd2Var2.f(str)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i8 |= i6;
        }
        if ((i & 3072) == 0) {
            if (kd2Var2.g(z)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i8 |= i5;
        }
        if ((i & 24576) == 0) {
            if (kd2Var2.g(z2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i8 |= i4;
        }
        if ((196608 & i) == 0) {
            if (kd2Var2.h(ub2Var)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i8 |= i3;
        }
        int i9 = i8;
        if ((i9 & 74899) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var2.V(i9 & 1, z3)) {
            vz3 vz3Var = vz3.x;
            float f2 = 1.0f;
            yz3 V = n77.V(n77.k0(ar5.g(ar5.c(vz3Var, 1.0f), 0.0f, f, 1), n77.d0(kd2Var2), 14), 12.0f, 0.0f, 12.0f, 12.0f, 2);
            xp0 a = vp0.a(new vr(4.0f, true, new ze0((byte) 6)), pk2.K, kd2Var2, 6);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, V);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z6 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z6) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            kd2Var2.e0(1622787481);
            List<Provider> list = null;
            if (z2) {
                if (server != null) {
                    list = server.getDub();
                }
            } else if (server != null) {
                list = server.getSub();
            }
            if (z) {
                kd2Var2.e0(1622783698);
                yz3 R = n77.R(ar5.c(vz3Var, 1.0f), 32.0f);
                vo3 c = b90.c(pk2.C, false);
                int hashCode2 = Long.hashCode(kd2Var2.T);
                al4 l2 = kd2Var2.l();
                yz3 E2 = o80.E(kd2Var2, R);
                kd2Var2.h0();
                if (kd2Var2.S) {
                    kd2Var2.k(t53Var);
                } else {
                    kd2Var2.q0();
                }
                ss5.i(st0Var, kd2Var2, c);
                ss5.i(ys0Var, kd2Var2, l2);
                h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
                ss5.i(ys0Var2, kd2Var2, E2);
                z4 = true;
                cv4.a(null, ((mp0) kd2Var2.j(op0.a)).o, 0.0f, 0L, 0, 0.0f, kd2Var, 0, 61);
                kd2Var2 = kd2Var;
                kd2Var2.q(true);
                kd2Var2.q(false);
                kd2Var2.q(false);
            } else {
                boolean z7 = true;
                kd2Var2.e0(1623106594);
                kd2Var2.q(false);
                if (server != null && (list == null || !list.isEmpty())) {
                    kd2Var2.e0(1623384354);
                    kd2Var2.q(false);
                    ov5.a(kd2Var2, ar5.e(vz3Var, 8.0f));
                    if (list == null) {
                        kd2Var2.e0(1623528410);
                        kd2Var2.q(false);
                    } else {
                        kd2Var2.e0(1623528411);
                        for (Provider provider : list) {
                            boolean i10 = a34.i(str, provider.getId());
                            vz3 vz3Var2 = vz3Var;
                            yz3 c2 = ar5.c(vz3Var2, f2);
                            if ((i9 & 458752) == 131072) {
                                z5 = z7;
                            } else {
                                z5 = false;
                            }
                            boolean h = z5 | kd2Var2.h(provider);
                            Object Q = kd2Var2.Q();
                            if (h || Q == au0.a) {
                                Q = new lb5((Object) ub2Var, (Object) provider, (byte) 24);
                                kd2Var2.n0(Q);
                            }
                            float f3 = f2;
                            yz3 A = kb0.A(c2, false, null, null, false, (sb2) Q, kd2Var, 6, 31);
                            if (a34.i(str, provider.getId())) {
                                kd2Var.e0(1289926299);
                                j = n03.r(kd2Var).o;
                                kd2Var.q(false);
                            } else {
                                kd2Var.e0(1289928214);
                                j = n03.r(kd2Var).p;
                                kd2Var.q(false);
                            }
                            if (a34.i(str, provider.getId())) {
                                kd2Var.e0(1289931449);
                                j2 = n03.r(kd2Var).n;
                                kd2Var.q(false);
                            } else {
                                kd2Var.e0(1289933307);
                                j2 = n03.r(kd2Var).o;
                                kd2Var.q(false);
                            }
                            l36.a(A, n03.w(kd2Var).c, j, j2, 0.0f, 0.0f, null, nx7.R(-19105334, new q01(i10, provider), kd2Var), kd2Var, 12582912, 112);
                            kd2Var2 = kd2Var;
                            vz3Var = vz3Var2;
                            f2 = f3;
                            z7 = true;
                        }
                        kd2Var2.q(false);
                    }
                } else {
                    kd2Var2.e0(1623174856);
                    h98.d(lz5.f(R.string.no_server_available, kd2Var2), lz5.f(R.string.no_available_servers, kd2Var2), null, kd2Var2, 0, 4);
                    kd2Var2.q(false);
                }
                kd2Var2.q(false);
                z4 = true;
            }
            kd2Var2.q(z4);
        } else {
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ic2() { // from class: d17
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lt5.d(Server.this, f, str, z, z2, ub2Var, (kd2) obj, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x024c, code lost:
    
        if (r8.equals("und") == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0222, code lost:
    
        if (defpackage.b06.C(r26.getLabel(), r6.getLabel(), true) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0235, code lost:
    
        if (r8 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0238, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0280, code lost:
    
        if (r13 == r11) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(boolean r25, com.anistation.model.watch.Track r26, java.util.List r27, float r28, defpackage.ub2 r29, defpackage.kd2 r30, int r31) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt5.e(boolean, com.anistation.model.watch.Track, java.util.List, float, ub2, kd2, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x03c1  */
    /* JADX WARN: Type inference failed for: r7v22, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.kk1 r91, final com.anistation.model.download.EpisodeDownload r92, final com.anistation.model.download.EpisodeDownload r93, final java.lang.String r94, final java.util.List r95, final java.lang.String r96, final defpackage.ub2 r97, final boolean r98, final boolean r99, final boolean r100, final boolean r101, final defpackage.ub2 r102, final defpackage.sb2 r103, final defpackage.ub2 r104, final defpackage.sb2 r105, defpackage.kd2 r106, final int r107, final int r108) {
        /*
            Method dump skipped, instructions count: 2634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt5.f(kk1, com.anistation.model.download.EpisodeDownload, com.anistation.model.download.EpisodeDownload, java.lang.String, java.util.List, java.lang.String, ub2, boolean, boolean, boolean, boolean, ub2, sb2, ub2, sb2, kd2, int, int):void");
    }

    public static final void g(EpisodeDownload episodeDownload, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        EpisodeDownload episodeDownload2;
        String g;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(1315925538);
        if (kd2Var2.h(episodeDownload)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i3 & 1, z)) {
            if (episodeDownload.getState() != EpisodeDownloadState.COMPLETED) {
                kd2Var2.e0(-1723614190);
                vz3 vz3Var = vz3.x;
                yz3 c = ar5.c(vz3Var, 1.0f);
                xp0 a = vp0.a(new vr(8.0f, true, new ze0((byte) 6)), pk2.K, kd2Var2, 6);
                int hashCode = Long.hashCode(kd2Var2.T);
                al4 l = kd2Var2.l();
                yz3 E = o80.E(kd2Var2, c);
                tt0.d.getClass();
                kd2Var2.h0();
                if (kd2Var2.S) {
                    kd2Var2.k(za3.p0);
                } else {
                    kd2Var2.q0();
                }
                ss5.i(p7.F, kd2Var2, a);
                ss5.i(p7.E, kd2Var2, l);
                ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
                ss5.h(kd2Var2);
                ss5.i(p7.D, kd2Var2, E);
                if (episodeDownload.isWaitingForWifi()) {
                    g = h11.i(kd2Var2, 1802182590, R.string.waiting_for_wifi, kd2Var2, false);
                } else {
                    kd2Var2.e0(1802291028);
                    switch (m17.a[episodeDownload.getState().ordinal()]) {
                        case 1:
                            kd2Var2.e0(1802352811);
                            float percentDownloaded = episodeDownload.getPercentDownloaded();
                            if (percentDownloaded < 0.0f) {
                                percentDownloaded = 0.0f;
                            }
                            g = lz5.g(R.string.downloading_percent, new Object[]{Integer.valueOf((int) percentDownloaded)}, kd2Var2);
                            kd2Var2.q(false);
                            break;
                        case 2:
                            g = h11.i(kd2Var2, 1997811858, R.string.queued, kd2Var2, false);
                            break;
                        case 3:
                            g = h11.i(kd2Var2, 1997814546, R.string.paused, kd2Var2, false);
                            break;
                        case 4:
                            g = h11.i(kd2Var2, 1997817211, R.string.download_failed, kd2Var2, false);
                            break;
                        case 5:
                            g = h11.i(kd2Var2, 1997820212, R.string.deleting, kd2Var2, false);
                            break;
                        case 6:
                            g = h11.i(kd2Var2, 1997823062, R.string.restarting, kd2Var2, false);
                            break;
                        default:
                            kd2Var2.e0(1803035243);
                            kd2Var2.q(false);
                            g = "";
                            break;
                    }
                    kd2Var2.q(false);
                }
                yc6.b(g, null, ((mp0) kd2Var2.j(op0.a)).o, 0L, s92.C, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(pl6.a)).k, kd2Var, 1572864, 0, 131002);
                kd2Var2 = kd2Var;
                if (!episodeDownload.isActive() && !episodeDownload.isPaused()) {
                    kd2Var2.e0(1803555983);
                    kd2Var2.q(false);
                    episodeDownload2 = episodeDownload;
                } else {
                    kd2Var2.e0(1803306123);
                    episodeDownload2 = episodeDownload;
                    boolean h = kd2Var2.h(episodeDownload2);
                    Object Q = kd2Var2.Q();
                    if (h || Q == au0.a) {
                        Q = new zv1(episodeDownload2, (byte) 2);
                        kd2Var2.n0(Q);
                    }
                    o80.g((sb2) Q, ar5.e(ar5.c(vz3Var, 1.0f), 4.0f), 0L, 0L, kd2Var2, 48);
                    kd2Var2.q(false);
                }
                kd2Var2.q(true);
                kd2Var2.q(false);
            } else {
                episodeDownload2 = episodeDownload;
                kd2Var2.e0(-1722063136);
                kd2Var2.q(false);
            }
        } else {
            episodeDownload2 = episodeDownload;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new yv1(episodeDownload2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15, types: [d13, f13] */
    public static final void h(final float f, final ub2 ub2Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        final int i3;
        final float f2;
        final ub2 ub2Var2;
        kd2 kd2Var2;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        final ub2 ub2Var3;
        final byte b;
        byte b2;
        byte b3;
        byte b4;
        boolean z5;
        int i4;
        int i5;
        kd2 kd2Var3 = kd2Var;
        kd2Var3.f0(82059935);
        if ((i & 6) == 0) {
            if (kd2Var3.c(f)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i | i5;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var3.h(ub2Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var3.V(i2 & 1, z)) {
            List I = te4.I(Float.valueOf(0.25f), Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(1.5f), Float.valueOf(2.0f));
            Object Q = kd2Var3.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                d13 o0 = db.o0(new d13(25, 800, 1), 5);
                ArrayList arrayList = new ArrayList(zo0.V(o0, 10));
                Iterator it = o0.iterator();
                while (true) {
                    if (!((e13) it).z) {
                        break;
                    } else {
                        arrayList.add(Float.valueOf(r15.nextInt() / 100.0f));
                    }
                }
                kd2Var3.n0(arrayList);
                obj = arrayList;
            } else {
                obj = Q;
            }
            List list = (List) obj;
            vz3 vz3Var = vz3.x;
            yz3 U = n77.U(ar5.c(vz3Var, 1.0f), 14.0f, 12.0f, 14.0f, 25.0f);
            byte b5 = 6;
            xp0 a = vp0.a(new vr(20.0f, true, new ze0(b5)), pk2.L, kd2Var3, 54);
            int hashCode = Long.hashCode(kd2Var3.T);
            al4 l = kd2Var3.l();
            yz3 E = o80.E(kd2Var3, U);
            tt0.d.getClass();
            kd2Var3.h0();
            boolean z6 = kd2Var3.S;
            t53 t53Var = za3.p0;
            if (z6) {
                kd2Var3.k(t53Var);
            } else {
                kd2Var3.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var3, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var3, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var3, valueOf);
            ss5.h(kd2Var3);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var3, E);
            yz3 c = ar5.c(vz3Var, 1.0f);
            int i6 = i2;
            xp0 a2 = vp0.a(new vr(8.0f, true, new ze0(b5)), pk2.K, kd2Var3, 6);
            int hashCode2 = Long.hashCode(kd2Var3.T);
            al4 l2 = kd2Var3.l();
            yz3 E2 = o80.E(kd2Var3, c);
            kd2Var3.h0();
            if (kd2Var3.S) {
                kd2Var3.k(t53Var);
            } else {
                kd2Var3.q0();
            }
            ss5.i(st0Var, kd2Var3, a2);
            ss5.i(ys0Var, kd2Var3, l2);
            h11.q(hashCode2, kd2Var3, st0Var2, kd2Var3);
            ss5.i(ys0Var2, kd2Var3, E2);
            String format = String.format("%.2fx", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            xd6 xd6Var = ((nl6) kd2Var3.j(pl6.a)).g;
            tq1 tq1Var = op0.a;
            yc6.b(format, ar5.c(vz3Var, 1.0f), ((mp0) kd2Var3.j(tq1Var)).o, 0L, null, null, 0L, new c86(3), 0L, 0, false, 0, 0, xd6Var, kd2Var, 48, 0, 130040);
            yz3 c2 = ar5.c(vz3Var, 1.0f);
            z75 a3 = y75.a(new vr(10.0f, true, new ze0((byte) 4)), pk2.I, kd2Var, 54);
            int hashCode3 = Long.hashCode(kd2Var.T);
            al4 l3 = kd2Var.l();
            yz3 E3 = o80.E(kd2Var, c2);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a3);
            ss5.i(ys0Var, kd2Var, l3);
            h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E3);
            if (f > 0.25f) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j = ((mp0) kd2Var.j(tq1Var)).r;
            int i7 = i6 & 112;
            if (i7 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i8 = i6 & 14;
            if (i8 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z4 | z3;
            Object Q2 = kd2Var.Q();
            if (!z7 && Q2 != q18Var) {
                ub2Var3 = ub2Var;
                b = 0;
            } else {
                ub2Var3 = ub2Var;
                b = 0;
                Q2 = new sb2() { // from class: y07
                    @Override // defpackage.sb2
                    public final Object invoke() {
                        byte b6 = b;
                        pn6 pn6Var = pn6.a;
                        float f3 = f;
                        ub2 ub2Var4 = ub2Var3;
                        switch (b6) {
                            case 0:
                                ub2Var4.invoke(Float.valueOf(f3 - 0.05f));
                                return pn6Var;
                            default:
                                ub2Var4.invoke(Float.valueOf(f3 + 0.05f));
                                return pn6Var;
                        }
                    }
                };
                kd2Var.n0(Q2);
            }
            zz.a(null, z2, true, null, null, j, 0L, (sb2) Q2, null, bb4.I, kd2Var, 805309824, 337);
            do0 do0Var = new do0(0.25f, 8.0f);
            int size = list.size() - 2;
            byte b6 = b;
            ob3 ob3Var = new ob3(1.0f, true);
            if (i7 == 32) {
                b2 = 1;
            } else {
                b2 = b6;
            }
            Object Q3 = kd2Var.Q();
            if (b2 != 0 || Q3 == q18Var) {
                Q3 = new wi(ub2Var3, (byte) 10);
                kd2Var.n0(Q3);
            }
            kb0.a(f, (ub2) Q3, ob3Var, false, do0Var, size, null, null, kd2Var, i8, 200);
            f2 = f;
            kd2 kd2Var4 = kd2Var;
            if (f2 < 8.0f) {
                b3 = 1;
            } else {
                b3 = b6;
            }
            long j2 = ((mp0) kd2Var4.j(tq1Var)).r;
            if (i7 == 32) {
                b4 = 1;
            } else {
                b4 = b6;
            }
            if (i8 == 4) {
                b6 = 1;
            }
            int i9 = b4 | b6;
            Object Q4 = kd2Var4.Q();
            if (i9 == 0 && Q4 != q18Var) {
                z5 = true;
            } else {
                z5 = true;
                final boolean z8 = true ? 1 : 0;
                Q4 = new sb2() { // from class: y07
                    @Override // defpackage.sb2
                    public final Object invoke() {
                        byte b62 = z8;
                        pn6 pn6Var = pn6.a;
                        float f3 = f2;
                        ub2 ub2Var4 = ub2Var;
                        switch (b62) {
                            case 0:
                                ub2Var4.invoke(Float.valueOf(f3 - 0.05f));
                                return pn6Var;
                            default:
                                ub2Var4.invoke(Float.valueOf(f3 + 0.05f));
                                return pn6Var;
                        }
                    }
                };
                kd2Var4.n0(Q4);
            }
            zz.a(null, b3, true, null, null, j2, 0L, (sb2) Q4, null, bb4.J, kd2Var4, 805309824, 337);
            kd2Var4.q(z5);
            kd2Var4.q(z5);
            byte b7 = 6;
            ub2Var2 = ub2Var;
            i3 = i;
            q23.b(null, new vr(10.0f, z5, new ze0(b7)), new vr(10.0f, z5, new ze0(b7)), null, 0, 0, nx7.R(-168356742, new lh0(I, f2, ub2Var), kd2Var4), kd2Var4, 1573296, 57);
            kd2Var4.q(z5);
            kd2Var2 = kd2Var4;
        } else {
            i3 = i;
            f2 = f;
            ub2Var2 = ub2Var;
            kd2Var3.Y();
            kd2Var2 = kd2Var3;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ic2() { // from class: z07
                @Override // defpackage.ic2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int N = kb0.N(i3 | 1);
                    lt5.h(f2, ub2Var2, (kd2) obj2, N);
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final java.lang.String r30, defpackage.yz3 r31, final defpackage.ic2 r32, boolean r33, defpackage.sb2 r34, defpackage.os0 r35, defpackage.kd2 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt5.i(java.lang.String, yz3, ic2, boolean, sb2, os0, kd2, int, int):void");
    }

    public static final void j(final n17 n17Var, final ym6 ym6Var, final boolean z, final boolean z2, final boolean z3, final boolean z4, final sb2 sb2Var, final ub2 ub2Var, final ub2 ub2Var2, final ub2 ub2Var3, final ub2 ub2Var4, final ub2 ub2Var5, final ub2 ub2Var6, final ub2 ub2Var7, final ub2 ub2Var8, final ub2 ub2Var9, final sb2 sb2Var2, final ub2 ub2Var10, final sb2 sb2Var3, final ic2 ic2Var, final kk1 kk1Var, final ub2 ub2Var11, yz3 yz3Var, kd2 kd2Var, final int i, final int i2, final int i3) {
        int i4;
        boolean z5;
        boolean z6;
        int i5;
        ub2 ub2Var12;
        int i6;
        int i7;
        final yz3 yz3Var2;
        ic2 ic2Var2;
        zz4 zz4Var;
        float f;
        n17Var.getClass();
        ym6Var.getClass();
        sb2Var.getClass();
        ub2Var.getClass();
        ub2Var2.getClass();
        ub2Var3.getClass();
        ub2Var4.getClass();
        ub2Var5.getClass();
        ub2Var6.getClass();
        ub2Var7.getClass();
        ub2Var8.getClass();
        ub2Var9.getClass();
        sb2Var2.getClass();
        ub2Var10.getClass();
        sb2Var3.getClass();
        ic2Var.getClass();
        kk1Var.getClass();
        ub2Var11.getClass();
        kd2Var.f0(1445549055);
        if ((i & 6) == 0) {
            i4 = (kd2Var.d(n17Var.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= kd2Var.h(ym6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z5 = z;
            i4 |= kd2Var.g(z5) ? 256 : 128;
        } else {
            z5 = z;
        }
        if ((i & 3072) == 0) {
            i4 |= kd2Var.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z6 = z3;
            i4 |= kd2Var.g(z6) ? 16384 : 8192;
        } else {
            z6 = z3;
        }
        if ((i & 196608) == 0) {
            i4 |= kd2Var.g(z4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= kd2Var.h(sb2Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= kd2Var.h(ub2Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= kd2Var.h(ub2Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= kd2Var.h(ub2Var3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (kd2Var.h(ub2Var4) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= kd2Var.h(ub2Var5) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            ub2Var12 = ub2Var6;
            i5 |= kd2Var.h(ub2Var12) ? 256 : 128;
        } else {
            ub2Var12 = ub2Var6;
        }
        if ((i2 & 3072) == 0) {
            i5 |= kd2Var.h(ub2Var7) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= kd2Var.h(ub2Var8) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= kd2Var.h(ub2Var9) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= kd2Var.h(sb2Var2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= kd2Var.h(ub2Var10) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= kd2Var.h(sb2Var3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= kd2Var.h(ic2Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (kd2Var.d(kk1Var.ordinal()) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 = i6 | (kd2Var.h(ub2Var11) ? 32 : 16);
        } else {
            i7 = i6;
        }
        int i8 = i4;
        byte b = 1;
        if (kd2Var.V(i8 & 1, ((i4 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && ((i7 | 384) & 147) == 146) ? false : true)) {
            if (n17Var == n17.E) {
                zz4 u = kd2Var.u();
                if (u != null) {
                    final ub2 ub2Var13 = ub2Var12;
                    final boolean z7 = z6;
                    final boolean z8 = z5;
                    ic2Var2 = new ic2() { // from class: t07
                        @Override // defpackage.ic2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int N = kb0.N(i | 1);
                            int N2 = kb0.N(i2);
                            int N3 = kb0.N(i3);
                            lt5.j(n17.this, ym6Var, z8, z2, z7, z4, sb2Var, ub2Var, ub2Var2, ub2Var3, ub2Var4, ub2Var5, ub2Var13, ub2Var7, ub2Var8, ub2Var9, sb2Var2, ub2Var10, sb2Var3, ic2Var, kk1Var, ub2Var11, vz3.x, (kd2) obj, N, N2, N3);
                            return pn6.a;
                        }
                    };
                    zz4Var = u;
                    zz4Var.d = ic2Var2;
                }
                return;
            }
            Configuration configuration = (Configuration) kd2Var.j(eb.a);
            float f2 = configuration.screenWidthDp;
            float f3 = configuration.screenHeightDp;
            int i9 = configuration.orientation;
            boolean z9 = i9 == 2;
            boolean z10 = configuration.smallestScreenWidthDp >= 600 && z9 && !z2;
            kd2Var.c0(1898264297, Integer.valueOf(i9));
            do5 f4 = rz3.f(true, kd2Var, 6, 2);
            kd2Var.q(false);
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (Q == obj) {
                Q = db.L(kd2Var);
                kd2Var.n0(Q);
            }
            v11 v11Var = (v11) Q;
            boolean h = ((i8 & 3670016) == 1048576) | kd2Var.h(v11Var) | kd2Var.f(f4);
            Object Q2 = kd2Var.Q();
            if (h || Q2 == obj) {
                Q2 = new fz3(v11Var, f4, sb2Var, b);
                kd2Var.n0(Q2);
            }
            final ub2 ub2Var14 = (ub2) Q2;
            float f5 = 0.5625f * f2;
            if (!z2 && !z10) {
                f = ((vm1) jf7.x(new vm1(240.0f), new vm1((f3 - f5) - 45.0f))).x;
            } else {
                f = ((vm1) jf7.x(new vm1(240.0f), new vm1(f3 - 24.0f))).x;
            }
            final float f6 = f;
            WeakHashMap weakHashMap = z57.w;
            float a = sw0.h(mv5.b(kd2Var).e, kd2Var).a();
            Activity activity = (Activity) kd2Var.j(rj3.a);
            if (activity != null && activity.isInMultiWindowMode()) {
                a = 15.0f;
            }
            final float f7 = a;
            boolean z11 = z9;
            long j = ep0.h;
            long b2 = ep0.b(0.5f, ep0.b);
            ao2 ao2Var = io3.h;
            sz3 sz3Var = new sz3();
            float f8 = z11 ? f2 * 0.48f : Float.NaN;
            vz3 vz3Var = vz3.x;
            rz3.a(sb2Var, vz3Var, f4, f8, false, ao2Var, j, 0L, b2, null, new ao5((byte) 12), sz3Var, nx7.R(-922977567, new jc2() { // from class: a17
                @Override // defpackage.jc2
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    boolean z12;
                    kd2 kd2Var2 = (kd2) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    ((yp0) obj2).getClass();
                    if ((intValue & 17) != 16) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (kd2Var2.V(intValue & 1, z12)) {
                        yz3 U = n77.U(ar5.c(vz3.x, 1.0f), 15.0f, 12.0f, 15.0f, f7 + 8.0f);
                        long j2 = ((mp0) kd2Var2.j(op0.a)).p;
                        o75 o75Var = ((cn5) kd2Var2.j(dn5.a)).d;
                        final n17 n17Var2 = n17Var;
                        final float f9 = f6;
                        final ym6 ym6Var2 = ym6Var;
                        final ub2 ub2Var15 = ub2Var14;
                        final ub2 ub2Var16 = ub2Var5;
                        final kk1 kk1Var2 = kk1Var;
                        final ub2 ub2Var17 = ub2Var11;
                        final boolean z13 = z4;
                        final ub2 ub2Var18 = ub2Var9;
                        final sb2 sb2Var4 = sb2Var2;
                        final ub2 ub2Var19 = ub2Var10;
                        final sb2 sb2Var5 = sb2Var3;
                        final ic2 ic2Var3 = ic2Var;
                        final ub2 ub2Var20 = ub2Var2;
                        final ub2 ub2Var21 = ub2Var6;
                        final ub2 ub2Var22 = ub2Var7;
                        final ub2 ub2Var23 = ub2Var8;
                        final boolean z14 = z3;
                        final ub2 ub2Var24 = ub2Var;
                        final boolean z15 = z;
                        final ub2 ub2Var25 = ub2Var3;
                        final ub2 ub2Var26 = ub2Var4;
                        l36.a(U, o75Var, j2, 0L, 0.0f, 0.0f, null, nx7.R(-1794223556, new ic2() { // from class: i17
                            /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00ad. Please report as an issue. */
                            /* JADX WARN: Removed duplicated region for block: B:44:0x019e  */
                            /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
                            @Override // defpackage.ic2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r24, java.lang.Object r25) {
                                /*
                                    Method dump skipped, instructions count: 1476
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.i17.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, kd2Var2), kd2Var2, 12582912, 120);
                    } else {
                        kd2Var2.Y();
                    }
                    return pn6.a;
                }
            }, kd2Var), kd2Var, ((i8 >> 18) & 14) | 807075888, CommonGatewayClient.CODE_400);
            yz3Var2 = vz3Var;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            ic2Var2 = new ic2() { // from class: f17
                @Override // defpackage.ic2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int N = kb0.N(i | 1);
                    int N2 = kb0.N(i2);
                    int N3 = kb0.N(i3);
                    lt5.j(n17.this, ym6Var, z, z2, z3, z4, sb2Var, ub2Var, ub2Var2, ub2Var3, ub2Var4, ub2Var5, ub2Var6, ub2Var7, ub2Var8, ub2Var9, sb2Var2, ub2Var10, sb2Var3, ic2Var, kk1Var, ub2Var11, yz3Var2, (kd2) obj2, N, N2, N3);
                    return pn6.a;
                }
            };
            zz4Var = u2;
            zz4Var.d = ic2Var2;
        }
    }

    public static final int k(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else if (j < j2) {
                length = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public static final Object l(kr4 kr4Var, String str, xz0 xz0Var) {
        Object c = kr4Var.c(str, new ka6((byte) 12), xz0Var);
        if (c == w11.x) {
            return c;
        }
        return pn6.a;
    }

    public static final String m(int i, kd2 kd2Var) {
        kd2Var.j(eb.a);
        return ((Context) kd2Var.j(eb.b)).getResources().getString(i);
    }

    public static final boolean n(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
            return true;
        }
        return false;
    }

    public static boolean o(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static int p(byte[] bArr, int i, m97 m97Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            m97Var.a = b;
            return i2;
        }
        return r(b, bArr, i2, m97Var);
    }

    public static File q(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            File filesDir2 = context.getFilesDir();
            if (filesDir2 != null) {
                return filesDir2;
            }
            ze0.m("getFilesDir returned null twice.");
            return null;
        }
        return filesDir;
    }

    public static int r(int i, byte[] bArr, int i2, m97 m97Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            m97Var.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            m97Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            m97Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            m97Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                m97Var.a = i11;
                return i12;
            }
        }
    }

    public static int s(byte[] bArr, int i, m97 m97Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            m97Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        m97Var.b = j2;
        return i3;
    }

    public static int t(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long u(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int v(byte[] bArr, int i, m97 m97Var) {
        int p = p(bArr, i, m97Var);
        int i2 = m97Var.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                m97Var.d = "";
                return p;
            }
            m97Var.d = kh7.d(bArr, p, i2);
            return p + i2;
        }
        jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int w(byte[] bArr, int i, m97 m97Var) {
        int p = p(bArr, i, m97Var);
        int i2 = m97Var.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - p) {
                if (i2 == 0) {
                    m97Var.d = we7.y;
                    return p;
                }
                m97Var.d = we7.j(bArr, p, i2);
                return p + i2;
            }
            jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int x(Object obj, xg7 xg7Var, byte[] bArr, int i, int i2, m97 m97Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = r(i4, bArr, i3, m97Var);
            i4 = m97Var.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = m97Var.c + 1;
            m97Var.c = i6;
            if (i6 < 100) {
                int i7 = i5 + i4;
                xg7Var.g(obj, bArr, i5, i7, m97Var);
                m97Var.c--;
                m97Var.d = obj;
                return i7;
            }
            jz7.e("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int y(Object obj, xg7 xg7Var, byte[] bArr, int i, int i2, int i3, m97 m97Var) {
        pg7 pg7Var = (pg7) xg7Var;
        int i4 = m97Var.c + 1;
        m97Var.c = i4;
        if (i4 < 100) {
            int y = pg7Var.y(obj, bArr, i, i2, i3, m97Var);
            m97Var.c--;
            m97Var.d = obj;
            return y;
        }
        jz7.e("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        return 0;
    }

    public static int z(int i, byte[] bArr, int i2, int i3, yf7 yf7Var, m97 m97Var) {
        nf7 nf7Var = (nf7) yf7Var;
        int p = p(bArr, i2, m97Var);
        nf7Var.f(m97Var.a);
        while (p < i3) {
            int p2 = p(bArr, p, m97Var);
            if (i != m97Var.a) {
                break;
            }
            p = p(bArr, p2, m97Var);
            nf7Var.f(m97Var.a);
        }
        return p;
    }
}
