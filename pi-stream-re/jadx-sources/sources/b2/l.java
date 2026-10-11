package b2;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import c1.o1;
import c1.p1;
import c1.q0;
import f.m0;
import j1.i1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import r6.n1;

/* loaded from: classes.dex */
public final class l extends s1.s implements q {
    public static final int[] A1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean B1;
    public static boolean C1;
    public final Context W0;
    public final i0 X0;
    public final e0 Y0;
    public final int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final boolean f1350a1;

    /* renamed from: b1, reason: collision with root package name */
    public final r f1351b1;

    /* renamed from: c1, reason: collision with root package name */
    public final q0.w f1352c1;

    /* renamed from: d1, reason: collision with root package name */
    public j f1353d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f1354e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f1355f1;

    /* renamed from: g1, reason: collision with root package name */
    public Surface f1356g1;

    /* renamed from: h1, reason: collision with root package name */
    public f1.u f1357h1;

    /* renamed from: i1, reason: collision with root package name */
    public n f1358i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f1359j1;

    /* renamed from: k1, reason: collision with root package name */
    public int f1360k1;

    /* renamed from: l1, reason: collision with root package name */
    public long f1361l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f1362m1;

    /* renamed from: n1, reason: collision with root package name */
    public int f1363n1;

    /* renamed from: o1, reason: collision with root package name */
    public int f1364o1;

    /* renamed from: p1, reason: collision with root package name */
    public long f1365p1;

    /* renamed from: q1, reason: collision with root package name */
    public int f1366q1;

    /* renamed from: r1, reason: collision with root package name */
    public long f1367r1;

    /* renamed from: s1, reason: collision with root package name */
    public p1 f1368s1;

    /* renamed from: t1, reason: collision with root package name */
    public p1 f1369t1;

    /* renamed from: u1, reason: collision with root package name */
    public boolean f1370u1;

    /* renamed from: v1, reason: collision with root package name */
    public boolean f1371v1;

    /* renamed from: w1, reason: collision with root package name */
    public boolean f1372w1;

    /* renamed from: x1, reason: collision with root package name */
    public int f1373x1;

    /* renamed from: y1, reason: collision with root package name */
    public k f1374y1;

    /* renamed from: z1, reason: collision with root package name */
    public p f1375z1;

    public l(Context context, s1.j jVar, s1.t tVar, long j4, boolean z9, Handler handler, f0 f0Var) {
        super(2, jVar, tVar, z9, 30.0f);
        this.Z0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.W0 = applicationContext;
        this.Y0 = new e0(handler, f0Var);
        o1.d0 d0Var = new o1.d0(applicationContext);
        w7.b.u(!d0Var.f8137a);
        if (((b) d0Var.f8140d) == null) {
            if (((o1) d0Var.f8139c) == null) {
                d0Var.f8139c = new a();
            }
            d0Var.f8140d = new b((o1) d0Var.f8139c);
        }
        d dVar = new d(d0Var);
        d0Var.f8137a = true;
        if (dVar.f1314d == null) {
            r rVar = new r(applicationContext, this, j4);
            w7.b.u(!dVar.c());
            dVar.f1314d = rVar;
            dVar.f1315e = new a0(dVar, rVar);
        }
        this.X0 = dVar;
        r rVar2 = dVar.f1314d;
        w7.b.w(rVar2);
        this.f1351b1 = rVar2;
        this.f1352c1 = new q0.w();
        this.f1350a1 = "NVIDIA".equals(f1.b0.f3801c);
        this.f1360k1 = 1;
        this.f1368s1 = p1.f1878e;
        this.f1373x1 = 0;
        this.f1369t1 = null;
    }

    public static List A0(Context context, s1.t tVar, c1.v vVar, boolean z9, boolean z10) {
        List e10;
        String str = vVar.f1935m;
        if (str == null) {
            return n1.f9497e;
        }
        if (f1.b0.f3799a >= 26 && "video/dolby-vision".equals(str) && !i.a(context)) {
            String b10 = s1.z.b(vVar);
            if (b10 == null) {
                e10 = n1.f9497e;
            } else {
                ((k1.i) tVar).getClass();
                e10 = s1.z.e(b10, z9, z10);
            }
            if (!e10.isEmpty()) {
                return e10;
            }
        }
        return s1.z.g(tVar, vVar, z9, z10);
    }

    public static int B0(c1.v vVar, s1.n nVar) {
        int i10 = vVar.f1936n;
        if (i10 != -1) {
            List list = vVar.o;
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += ((byte[]) list.get(i12)).length;
            }
            return i10 + i11;
        }
        return z0(vVar, nVar);
    }

    public static boolean x0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (l.class) {
            if (!B1) {
                C1 = y0();
                B1 = true;
            }
        }
        return C1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0844, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x089b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y0() {
        /*
            Method dump skipped, instructions count: 3182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.l.y0():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007b, code lost:
    
        if (r3.equals("video/av01") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int z0(c1.v r10, s1.n r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.l.z0(c1.v, s1.n):int");
    }

    public final void C0() {
        if (this.f1362m1 > 0) {
            this.f5712x.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = elapsedRealtime - this.f1361l1;
            int i10 = this.f1362m1;
            e0 e0Var = this.Y0;
            Handler handler = e0Var.f1336a;
            if (handler != null) {
                handler.post(new b0(e0Var, i10, j4));
            }
            this.f1362m1 = 0;
            this.f1361l1 = elapsedRealtime;
        }
    }

    public final void D0(p1 p1Var) {
        if (!p1Var.equals(p1.f1878e) && !p1Var.equals(this.f1369t1)) {
            this.f1369t1 = p1Var;
            this.Y0.b(p1Var);
        }
    }

    @Override // s1.s
    public final j1.g E(s1.n nVar, c1.v vVar, c1.v vVar2) {
        int i10;
        j1.g b10 = nVar.b(vVar, vVar2);
        j jVar = this.f1353d1;
        jVar.getClass();
        int i11 = vVar2.f1939r;
        int i12 = jVar.f1345a;
        int i13 = b10.f5749e;
        if (i11 > i12 || vVar2.f1940s > jVar.f1346b) {
            i13 |= 256;
        }
        if (B0(vVar2, nVar) > jVar.f1347c) {
            i13 |= 64;
        }
        int i14 = i13;
        String str = nVar.f9801a;
        if (i14 != 0) {
            i10 = 0;
        } else {
            i10 = b10.f5748d;
        }
        return new j1.g(str, vVar, vVar2, i10, i14);
    }

    public final void E0() {
        int i10;
        s1.k kVar;
        if (!this.f1372w1 || (i10 = f1.b0.f3799a) < 23 || (kVar = this.f9819b0) == null) {
            return;
        }
        this.f1374y1 = new k(this, kVar);
        if (i10 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            kVar.c(bundle);
        }
    }

    @Override // s1.s
    public final s1.m F(IllegalStateException illegalStateException, s1.n nVar) {
        return new g(illegalStateException, nVar, this.f1356g1);
    }

    public final void F0() {
        Surface surface = this.f1356g1;
        n nVar = this.f1358i1;
        if (surface == nVar) {
            this.f1356g1 = null;
        }
        if (nVar != null) {
            nVar.release();
            this.f1358i1 = null;
        }
    }

    public final void G0(s1.k kVar, int i10) {
        Surface surface;
        com.bumptech.glide.d.c("releaseOutputBuffer");
        kVar.g(i10, true);
        com.bumptech.glide.d.s();
        this.R0.f5723e++;
        boolean z9 = false;
        this.f1363n1 = 0;
        D0(this.f1368s1);
        r rVar = this.f1351b1;
        if (rVar.f1390e != 3) {
            z9 = true;
        }
        rVar.f1390e = 3;
        ((f1.v) rVar.f1396k).getClass();
        rVar.f1392g = f1.b0.O(SystemClock.elapsedRealtime());
        if (z9 && (surface = this.f1356g1) != null) {
            e0 e0Var = this.Y0;
            Handler handler = e0Var.f1336a;
            if (handler != null) {
                handler.post(new c0(e0Var, surface, SystemClock.elapsedRealtime(), 0));
            }
            this.f1359j1 = true;
        }
    }

    public final void H0(s1.k kVar, int i10, long j4) {
        Surface surface;
        com.bumptech.glide.d.c("releaseOutputBuffer");
        kVar.n(i10, j4);
        com.bumptech.glide.d.s();
        this.R0.f5723e++;
        boolean z9 = false;
        this.f1363n1 = 0;
        D0(this.f1368s1);
        r rVar = this.f1351b1;
        if (rVar.f1390e != 3) {
            z9 = true;
        }
        rVar.f1390e = 3;
        ((f1.v) rVar.f1396k).getClass();
        rVar.f1392g = f1.b0.O(SystemClock.elapsedRealtime());
        if (z9 && (surface = this.f1356g1) != null) {
            e0 e0Var = this.Y0;
            Handler handler = e0Var.f1336a;
            if (handler != null) {
                handler.post(new c0(e0Var, surface, SystemClock.elapsedRealtime(), 0));
            }
            this.f1359j1 = true;
        }
    }

    public final boolean I0(s1.n nVar) {
        if (f1.b0.f3799a >= 23 && !this.f1372w1 && !x0(nVar.f9801a) && (!nVar.f9806f || n.d(this.W0))) {
            return true;
        }
        return false;
    }

    public final void J0(s1.k kVar, int i10) {
        com.bumptech.glide.d.c("skipVideoBuffer");
        kVar.g(i10, false);
        com.bumptech.glide.d.s();
        this.R0.f5724f++;
    }

    public final void K0(int i10, int i11) {
        j1.f fVar = this.R0;
        fVar.f5726h += i10;
        int i12 = i10 + i11;
        fVar.f5725g += i12;
        this.f1362m1 += i12;
        int i13 = this.f1363n1 + i12;
        this.f1363n1 = i13;
        fVar.f5727i = Math.max(i13, fVar.f5727i);
        int i14 = this.Z0;
        if (i14 > 0 && this.f1362m1 >= i14) {
            C0();
        }
    }

    public final void L0(long j4) {
        j1.f fVar = this.R0;
        fVar.f5729k += j4;
        fVar.f5730l++;
        this.f1365p1 += j4;
        this.f1366q1++;
    }

    @Override // s1.s
    public final int N(i1.h hVar) {
        if (f1.b0.f3799a >= 34 && this.f1372w1 && hVar.f5264x < this.C) {
            return 32;
        }
        return 0;
    }

    @Override // s1.s
    public final boolean O() {
        if (this.f1372w1 && f1.b0.f3799a < 23) {
            return true;
        }
        return false;
    }

    @Override // s1.s
    public final float P(float f10, c1.v[] vVarArr) {
        float f11 = -1.0f;
        for (c1.v vVar : vVarArr) {
            float f12 = vVar.f1941t;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // s1.s
    public final ArrayList Q(s1.t tVar, c1.v vVar, boolean z9) {
        List A0 = A0(this.W0, tVar, vVar, z9, this.f1372w1);
        Pattern pattern = s1.z.f9849a;
        ArrayList arrayList = new ArrayList(A0);
        Collections.sort(arrayList, new s1.u(new w.f(vVar, 12), 0));
        return arrayList;
    }

    @Override // s1.s
    public final s1.i R(s1.n nVar, c1.v vVar, MediaCrypto mediaCrypto, float f10) {
        boolean z9;
        c1.k kVar;
        int i10;
        int i11;
        j jVar;
        boolean z10;
        int i12;
        int i13;
        String str;
        int i14;
        Point point;
        float f11;
        int i15;
        int i16;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z11;
        boolean z12;
        int i17;
        boolean z13;
        Pair d10;
        int z02;
        n nVar2 = this.f1358i1;
        boolean z14 = nVar.f9806f;
        if (nVar2 != null && nVar2.f1383a != z14) {
            F0();
        }
        c1.v[] vVarArr = this.A;
        vVarArr.getClass();
        int B0 = B0(vVar, nVar);
        int length = vVarArr.length;
        float f12 = vVar.f1941t;
        c1.k kVar2 = vVar.f1946y;
        int i18 = vVar.f1940s;
        int i19 = vVar.f1939r;
        if (length == 1) {
            if (B0 != -1 && (z02 = z0(vVar, nVar)) != -1) {
                B0 = Math.min((int) (B0 * 1.5f), z02);
            }
            jVar = new j(i19, i18, B0);
            z9 = z14;
            kVar = kVar2;
            i10 = i18;
            i11 = i19;
        } else {
            int length2 = vVarArr.length;
            int i20 = 0;
            boolean z15 = false;
            int i21 = i18;
            int i22 = i19;
            while (i20 < length2) {
                int i23 = length2;
                c1.v vVar2 = vVarArr[i20];
                c1.v[] vVarArr2 = vVarArr;
                if (kVar2 != null && vVar2.f1946y == null) {
                    c1.u uVar = new c1.u(vVar2);
                    uVar.f1919x = kVar2;
                    vVar2 = new c1.v(uVar);
                }
                if (nVar.b(vVar, vVar2).f5748d != 0) {
                    int i24 = vVar2.f1940s;
                    z11 = z14;
                    int i25 = vVar2.f1939r;
                    if (i25 != -1 && i24 != -1) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    i22 = Math.max(i22, i25);
                    i21 = Math.max(i21, i24);
                    z15 = z12 | z15;
                    B0 = Math.max(B0, B0(vVar2, nVar));
                } else {
                    z11 = z14;
                }
                i20++;
                length2 = i23;
                vVarArr = vVarArr2;
                z14 = z11;
            }
            z9 = z14;
            if (z15) {
                String str2 = "MediaCodecVideoRenderer";
                f1.o.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i22 + "x" + i21);
                if (i18 > i19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i12 = i18;
                } else {
                    i12 = i19;
                }
                if (z10) {
                    i13 = i19;
                } else {
                    i13 = i18;
                }
                kVar = kVar2;
                float f13 = i13 / i12;
                int[] iArr = A1;
                i10 = i18;
                int i26 = 0;
                i11 = i19;
                while (i26 < 9) {
                    int i27 = iArr[i26];
                    int[] iArr2 = iArr;
                    int i28 = (int) (i27 * f13);
                    if (i27 <= i12 || i28 <= i13) {
                        break;
                    }
                    int i29 = i12;
                    int i30 = i13;
                    if (f1.b0.f3799a >= 21) {
                        if (z10) {
                            i16 = i28;
                        } else {
                            i16 = i27;
                        }
                        if (!z10) {
                            i27 = i28;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f9804d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point = null;
                            f11 = f13;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f11 = f13;
                            point = new Point((((i16 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i27 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        if (point != null) {
                            str = str2;
                            i14 = B0;
                            if (nVar.f(point.x, point.y, f12)) {
                                break;
                            }
                        } else {
                            str = str2;
                            i14 = B0;
                        }
                        i26++;
                        iArr = iArr2;
                        i12 = i29;
                        i13 = i30;
                        f13 = f11;
                        B0 = i14;
                        str2 = str;
                    } else {
                        str = str2;
                        i14 = B0;
                        f11 = f13;
                        try {
                            int i31 = (((i27 + 16) - 1) / 16) * 16;
                            int i32 = (((i28 + 16) - 1) / 16) * 16;
                            if (i31 * i32 <= s1.z.j()) {
                                if (z10) {
                                    i15 = i32;
                                } else {
                                    i15 = i31;
                                }
                                if (!z10) {
                                    i31 = i32;
                                }
                                point = new Point(i15, i31);
                            } else {
                                i26++;
                                iArr = iArr2;
                                i12 = i29;
                                i13 = i30;
                                f13 = f11;
                                B0 = i14;
                                str2 = str;
                            }
                        } catch (s1.w unused) {
                        }
                    }
                }
                str = str2;
                i14 = B0;
                point = null;
                if (point != null) {
                    i22 = Math.max(i22, point.x);
                    i21 = Math.max(i21, point.y);
                    c1.u uVar2 = new c1.u(vVar);
                    uVar2.f1912q = i22;
                    uVar2.f1913r = i21;
                    B0 = Math.max(i14, z0(new c1.v(uVar2), nVar));
                    f1.o.f(str, "Codec max resolution adjusted to: " + i22 + "x" + i21);
                } else {
                    B0 = i14;
                }
            } else {
                kVar = kVar2;
                i10 = i18;
                i11 = i19;
            }
            jVar = new j(i22, i21, B0);
        }
        this.f1353d1 = jVar;
        if (this.f1372w1) {
            i17 = this.f1373x1;
        } else {
            i17 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", nVar.f9803c);
        mediaFormat.setInteger("width", i11);
        mediaFormat.setInteger("height", i10);
        com.bumptech.glide.d.Z(mediaFormat, vVar.o);
        if (f12 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f12);
        }
        com.bumptech.glide.d.J(mediaFormat, "rotation-degrees", vVar.f1942u);
        if (kVar != null) {
            c1.k kVar3 = kVar;
            com.bumptech.glide.d.J(mediaFormat, "color-transfer", kVar3.f1763c);
            com.bumptech.glide.d.J(mediaFormat, "color-standard", kVar3.f1761a);
            com.bumptech.glide.d.J(mediaFormat, "color-range", kVar3.f1762b);
            byte[] bArr = kVar3.f1764d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(vVar.f1935m) && (d10 = s1.z.d(vVar)) != null) {
            com.bumptech.glide.d.J(mediaFormat, "profile", ((Integer) d10.first).intValue());
        }
        mediaFormat.setInteger("max-width", jVar.f1345a);
        mediaFormat.setInteger("max-height", jVar.f1346b);
        com.bumptech.glide.d.J(mediaFormat, "max-input-size", jVar.f1347c);
        if (f1.b0.f3799a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.f1350a1) {
            z13 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z13 = true;
        }
        if (i17 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z13);
            mediaFormat.setInteger("audio-session-id", i17);
        }
        if (this.f1356g1 == null) {
            if (I0(nVar)) {
                if (this.f1358i1 == null) {
                    this.f1358i1 = n.e(this.W0, z9);
                }
                this.f1356g1 = this.f1358i1;
            } else {
                throw new IllegalStateException();
            }
        }
        return new s1.i(nVar, mediaFormat, vVar, this.f1356g1, mediaCrypto);
    }

    @Override // s1.s
    public final void S(i1.h hVar) {
        if (!this.f1355f1) {
            return;
        }
        ByteBuffer byteBuffer = hVar.f5265y;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b10 = byteBuffer.get();
            short s9 = byteBuffer.getShort();
            short s10 = byteBuffer.getShort();
            byte b11 = byteBuffer.get();
            byte b12 = byteBuffer.get();
            byteBuffer.position(0);
            if (b10 == -75 && s9 == 60 && s10 == 1 && b11 == 4) {
                if (b12 == 0 || b12 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    s1.k kVar = this.f9819b0;
                    kVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    kVar.c(bundle);
                }
            }
        }
    }

    @Override // s1.s
    public final void X(Exception exc) {
        f1.o.d("MediaCodecVideoRenderer", "Video codec error", exc);
        e0 e0Var = this.Y0;
        Handler handler = e0Var.f1336a;
        if (handler != null) {
            handler.post(new m0(13, e0Var, exc));
        }
    }

    @Override // s1.s
    public final void Y(String str, long j4, long j10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        e0 e0Var = this.Y0;
        Handler handler = e0Var.f1336a;
        if (handler != null) {
            handler.post(new l1.o(e0Var, str, j4, j10, 1));
        }
        this.f1354e1 = x0(str);
        s1.n nVar = this.f9826i0;
        nVar.getClass();
        boolean z9 = false;
        if (f1.b0.f3799a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.f9802b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f9804d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i10].profile == 16384) {
                    z9 = true;
                    break;
                }
                i10++;
            }
        }
        this.f1355f1 = z9;
        E0();
    }

    @Override // s1.s
    public final void Z(String str) {
        e0 e0Var = this.Y0;
        Handler handler = e0Var.f1336a;
        if (handler != null) {
            handler.post(new m0(15, e0Var, str));
        }
    }

    @Override // s1.s, j1.g1
    public final boolean a() {
        n nVar;
        boolean z9 = false;
        if (super.a()) {
            z9 = true;
        }
        if (z9 && (((nVar = this.f1358i1) != null && this.f1356g1 == nVar) || this.f9819b0 == null || this.f1372w1)) {
            return true;
        }
        return this.f1351b1.b(z9);
    }

    @Override // s1.s
    public final j1.g a0(androidx.appcompat.widget.a0 a0Var) {
        j1.g a02 = super.a0(a0Var);
        c1.v vVar = (c1.v) a0Var.f404c;
        vVar.getClass();
        e0 e0Var = this.Y0;
        Handler handler = e0Var.f1336a;
        if (handler != null) {
            handler.post(new q0.o(e0Var, vVar, a02, 7));
        }
        return a02;
    }

    @Override // j1.e, j1.g1
    public final boolean b() {
        if (!this.N0) {
            return false;
        }
        return true;
    }

    @Override // s1.s
    public final void b0(c1.v vVar, MediaFormat mediaFormat) {
        boolean z9;
        int integer;
        int integer2;
        int i10;
        int i11;
        s1.k kVar = this.f9819b0;
        if (kVar != null) {
            kVar.i(this.f1360k1);
        }
        boolean z10 = true;
        if (this.f1372w1) {
            i11 = vVar.f1939r;
            i10 = vVar.f1940s;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z9) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i12 = integer;
            i10 = integer2;
            i11 = i12;
        }
        float f10 = vVar.f1943v;
        if (f1.b0.f3799a < 21) {
            z10 = false;
        }
        int i13 = vVar.f1942u;
        if (z10) {
            if (i13 != 90 && i13 != 270) {
                i13 = 0;
            } else {
                f10 = 1.0f / f10;
                i13 = 0;
                int i14 = i10;
                i10 = i11;
                i11 = i14;
            }
        }
        this.f1368s1 = new p1(f10, i11, i10, i13);
        y yVar = this.f1351b1.f1387b;
        yVar.f1409f = vVar.f1941t;
        f fVar = yVar.f1404a;
        fVar.f1338a.c();
        fVar.f1339b.c();
        fVar.f1340c = false;
        fVar.f1341d = -9223372036854775807L;
        fVar.f1342e = 0;
        yVar.b();
    }

    @Override // s1.s, j1.g1
    public final void d(long j4, long j10) {
        super.d(j4, j10);
    }

    @Override // s1.s
    public final void d0(long j4) {
        super.d0(j4);
        if (!this.f1372w1) {
            this.f1364o1--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.view.Surface] */
    @Override // j1.e, j1.c1
    public final void e(int i10, Object obj) {
        n nVar;
        Handler handler;
        n nVar2;
        Surface surface;
        r rVar = this.f1351b1;
        i0 i0Var = this.X0;
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 10) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 13) {
                                if (i10 == 14) {
                                    obj.getClass();
                                    this.f1357h1 = (f1.u) obj;
                                    d dVar = (d) i0Var;
                                    if (dVar.c()) {
                                        f1.u uVar = this.f1357h1;
                                        uVar.getClass();
                                        if (uVar.f3862a != 0) {
                                            f1.u uVar2 = this.f1357h1;
                                            uVar2.getClass();
                                            if (uVar2.f3863b != 0 && (surface = this.f1356g1) != null) {
                                                f1.u uVar3 = this.f1357h1;
                                                uVar3.getClass();
                                                dVar.e(surface, uVar3);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            d dVar2 = (d) i0Var;
                            dVar2.f1319i = (List) obj;
                            if (!dVar2.c()) {
                                this.f1370u1 = true;
                                return;
                            } else {
                                dVar2.getClass();
                                w7.b.w(null);
                                throw null;
                            }
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        y yVar = rVar.f1387b;
                        if (yVar.f1413j != intValue) {
                            yVar.f1413j = intValue;
                            yVar.c(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.f1360k1 = intValue2;
                    s1.k kVar = this.f9819b0;
                    if (kVar != null) {
                        kVar.i(intValue2);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.f1373x1 != intValue3) {
                    this.f1373x1 = intValue3;
                    if (this.f1372w1) {
                        k0();
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            p pVar = (p) obj;
            this.f1375z1 = pVar;
            ((d) i0Var).f1317g = pVar;
            return;
        }
        if (obj instanceof Surface) {
            nVar = (Surface) obj;
        } else {
            nVar = null;
        }
        if (nVar == null) {
            n nVar3 = this.f1358i1;
            if (nVar3 != null) {
                nVar = nVar3;
            } else {
                s1.n nVar4 = this.f9826i0;
                if (nVar4 != null && I0(nVar4)) {
                    nVar = n.e(this.W0, nVar4.f9806f);
                    this.f1358i1 = nVar;
                }
            }
        }
        Surface surface2 = this.f1356g1;
        e0 e0Var = this.Y0;
        if (surface2 != nVar) {
            this.f1356g1 = nVar;
            y yVar2 = rVar.f1387b;
            yVar2.getClass();
            int i11 = f1.b0.f3799a;
            if (i11 >= 17 && s.a(nVar)) {
                nVar2 = null;
            } else {
                nVar2 = nVar;
            }
            if (yVar2.f1408e != nVar2) {
                yVar2.a();
                yVar2.f1408e = nVar2;
                yVar2.c(true);
            }
            rVar.d(1);
            this.f1359j1 = false;
            int i12 = this.f5713y;
            s1.k kVar2 = this.f9819b0;
            if (kVar2 != null && !((d) i0Var).c()) {
                if (i11 >= 23 && nVar != null && !this.f1354e1) {
                    kVar2.l(nVar);
                } else {
                    k0();
                    V();
                }
            }
            if (nVar != null && nVar != this.f1358i1) {
                p1 p1Var = this.f1369t1;
                if (p1Var != null) {
                    e0Var.b(p1Var);
                }
                if (i12 == 2) {
                    rVar.c();
                }
                d dVar3 = (d) i0Var;
                if (dVar3.c()) {
                    dVar3.e(nVar, f1.u.f3861c);
                }
            } else {
                this.f1369t1 = null;
                d dVar4 = (d) i0Var;
                if (dVar4.c()) {
                    int i13 = f1.u.f3861c.f3862a;
                    dVar4.f1320j = null;
                }
            }
            E0();
            return;
        }
        if (nVar != null && nVar != this.f1358i1) {
            p1 p1Var2 = this.f1369t1;
            if (p1Var2 != null) {
                e0Var.b(p1Var2);
            }
            Surface surface3 = this.f1356g1;
            if (surface3 != null && this.f1359j1 && (handler = e0Var.f1336a) != null) {
                handler.post(new c0(e0Var, surface3, SystemClock.elapsedRealtime(), 0));
            }
        }
    }

    @Override // s1.s
    public final void e0() {
        this.f1351b1.d(2);
        E0();
        i0 i0Var = this.X0;
        if (((d) i0Var).c()) {
            ((d) i0Var).f(this.S0.f9816c);
        }
    }

    @Override // j1.g1
    public final String f() {
        return "MediaCodecVideoRenderer";
    }

    @Override // s1.s
    public final void f0(i1.h hVar) {
        boolean z9;
        Surface surface;
        boolean z10 = this.f1372w1;
        if (!z10) {
            this.f1364o1++;
        }
        if (f1.b0.f3799a < 23 && z10) {
            long j4 = hVar.f5264x;
            w0(j4);
            D0(this.f1368s1);
            this.R0.f5723e++;
            r rVar = this.f1351b1;
            if (rVar.f1390e != 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            rVar.f1390e = 3;
            ((f1.v) rVar.f1396k).getClass();
            rVar.f1392g = f1.b0.O(SystemClock.elapsedRealtime());
            if (z9 && (surface = this.f1356g1) != null) {
                e0 e0Var = this.Y0;
                Handler handler = e0Var.f1336a;
                if (handler != null) {
                    handler.post(new c0(e0Var, surface, SystemClock.elapsedRealtime(), 0));
                }
                this.f1359j1 = true;
            }
            d0(j4);
        }
    }

    @Override // j1.e, j1.g1
    public final void g() {
        r rVar = this.f1351b1;
        if (rVar.f1390e == 0) {
            rVar.f1390e = 1;
        }
    }

    @Override // s1.s
    public final void g0(c1.v vVar) {
        boolean z9 = this.f1370u1;
        i0 i0Var = this.X0;
        if (z9 && !this.f1371v1 && !((d) i0Var).c()) {
            try {
                ((d) i0Var).b(vVar);
                throw null;
            } catch (h0 e10) {
                throw m(7000, vVar, e10, false);
            }
        }
        d dVar = (d) i0Var;
        if (!dVar.c()) {
            this.f1371v1 = true;
            return;
        }
        dVar.getClass();
        w7.b.w(null);
        new androidx.fragment.app.o(this);
        throw null;
    }

    @Override // s1.s
    public final boolean i0(long j4, long j10, s1.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z9, boolean z10, c1.v vVar) {
        long j12;
        long j13;
        long j14;
        kVar.getClass();
        s1.r rVar = this.S0;
        long j15 = j11 - rVar.f9816c;
        int a10 = this.f1351b1.a(j11, j4, j10, rVar.f9815b, z10, this.f1352c1);
        if (z9 && !z10) {
            J0(kVar, i10);
            return true;
        }
        Surface surface = this.f1356g1;
        n nVar = this.f1358i1;
        q0.w wVar = this.f1352c1;
        if (surface == nVar) {
            if (wVar.f8964a >= 30000) {
                return false;
            }
            J0(kVar, i10);
            L0(wVar.f8964a);
            return true;
        }
        if (a10 != 0) {
            if (a10 != 1) {
                if (a10 != 2) {
                    if (a10 != 3) {
                        if (a10 == 4 || a10 == 5) {
                            return false;
                        }
                        throw new IllegalStateException(String.valueOf(a10));
                    }
                    J0(kVar, i10);
                    L0(wVar.f8964a);
                    return true;
                }
                com.bumptech.glide.d.c("dropVideoBuffer");
                kVar.g(i10, false);
                com.bumptech.glide.d.s();
                K0(0, 1);
                L0(wVar.f8964a);
                return true;
            }
            long j16 = wVar.f8965b;
            long j17 = wVar.f8964a;
            if (f1.b0.f3799a >= 21) {
                if (j16 == this.f1367r1) {
                    J0(kVar, i10);
                    j14 = j17;
                    j13 = j16;
                } else {
                    p pVar = this.f1375z1;
                    if (pVar != null) {
                        j12 = j17;
                        j13 = j16;
                        pVar.j(j15, j16, vVar, this.f9821d0);
                    } else {
                        j12 = j17;
                        j13 = j16;
                    }
                    H0(kVar, i10, j13);
                    j14 = j12;
                }
                L0(j14);
                this.f1367r1 = j13;
                return true;
            }
            if (j17 < 30000) {
                if (j17 > 11000) {
                    try {
                        Thread.sleep((j17 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                p pVar2 = this.f1375z1;
                if (pVar2 != null) {
                    pVar2.j(j15, j16, vVar, this.f9821d0);
                }
                G0(kVar, i10);
                L0(j17);
                return true;
            }
            return false;
        }
        this.f5712x.getClass();
        long nanoTime = System.nanoTime();
        p pVar3 = this.f1375z1;
        if (pVar3 != null) {
            pVar3.j(j15, nanoTime, vVar, this.f9821d0);
        }
        if (f1.b0.f3799a >= 21) {
            H0(kVar, i10, nanoTime);
        } else {
            G0(kVar, i10);
        }
        L0(wVar.f8964a);
        return true;
    }

    @Override // s1.s, j1.e, j1.g1
    public final void l(float f10, float f11) {
        super.l(f10, f11);
        r rVar = this.f1351b1;
        rVar.f1395j = f10;
        y yVar = rVar.f1387b;
        yVar.f1412i = f10;
        yVar.f1416m = 0L;
        yVar.f1418p = -1L;
        yVar.f1417n = -1L;
        yVar.c(false);
    }

    @Override // s1.s
    public final void m0() {
        super.m0();
        this.f1364o1 = 0;
    }

    @Override // s1.s, j1.e
    public final void p() {
        e0 e0Var = this.Y0;
        this.f1369t1 = null;
        this.f1351b1.d(0);
        E0();
        this.f1359j1 = false;
        this.f1374y1 = null;
        try {
            super.p();
            j1.f fVar = this.R0;
            e0Var.getClass();
            synchronized (fVar) {
            }
            Handler handler = e0Var.f1336a;
            if (handler != null) {
                handler.post(new d0(e0Var, fVar, 1));
            }
            e0Var.b(p1.f1878e);
        } catch (Throwable th) {
            e0Var.a(this.R0);
            e0Var.b(p1.f1878e);
            throw th;
        }
    }

    @Override // j1.e
    public final void q(boolean z9, boolean z10) {
        boolean z11;
        this.R0 = new j1.f();
        i1 i1Var = this.f5709d;
        i1Var.getClass();
        int i10 = 0;
        boolean z12 = i1Var.f5791b;
        if (z12 && this.f1373x1 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        w7.b.u(z11);
        if (this.f1372w1 != z12) {
            this.f1372w1 = z12;
            k0();
        }
        j1.f fVar = this.R0;
        e0 e0Var = this.Y0;
        Handler handler = e0Var.f1336a;
        if (handler != null) {
            handler.post(new d0(e0Var, fVar, i10));
        }
        this.f1351b1.f1390e = z10 ? 1 : 0;
    }

    @Override // j1.e
    public final void r() {
        f1.a aVar = this.f5712x;
        aVar.getClass();
        this.f1351b1.f1396k = aVar;
        d dVar = (d) this.X0;
        w7.b.u(!dVar.c());
        dVar.f1313c = aVar;
    }

    @Override // s1.s
    public final boolean r0(s1.n nVar) {
        if (this.f1356g1 == null && !I0(nVar)) {
            return false;
        }
        return true;
    }

    @Override // s1.s, j1.e
    public final void s(long j4, boolean z9) {
        super.s(j4, z9);
        d dVar = (d) this.X0;
        if (dVar.c()) {
            dVar.f(this.S0.f9816c);
        }
        r rVar = this.f1351b1;
        y yVar = rVar.f1387b;
        yVar.f1416m = 0L;
        yVar.f1418p = -1L;
        yVar.f1417n = -1L;
        rVar.f1393h = -9223372036854775807L;
        rVar.f1391f = -9223372036854775807L;
        rVar.d(1);
        rVar.f1394i = -9223372036854775807L;
        if (z9) {
            rVar.c();
        }
        E0();
        this.f1363n1 = 0;
    }

    @Override // j1.e
    public final void t() {
        d dVar = (d) this.X0;
        if (dVar.c() && dVar.f1324n != 2) {
            f1.x xVar = dVar.f1318h;
            if (xVar != null) {
                xVar.f3866a.removeCallbacksAndMessages(null);
            }
            dVar.f1320j = null;
            dVar.f1324n = 2;
        }
    }

    @Override // s1.s
    public final int t0(s1.t tVar, c1.v vVar) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (!q0.n(vVar.f1935m)) {
            return a3.g.e(0, 0, 0, 0);
        }
        if (vVar.f1937p != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        Context context = this.W0;
        List A0 = A0(context, tVar, vVar, z9, false);
        if (z9 && A0.isEmpty()) {
            A0 = A0(context, tVar, vVar, false, false);
        }
        if (A0.isEmpty()) {
            return a3.g.e(1, 0, 0, 0);
        }
        int i15 = vVar.I;
        if (i15 != 0 && i15 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return a3.g.e(2, 0, 0, 0);
        }
        s1.n nVar = (s1.n) A0.get(0);
        boolean d10 = nVar.d(vVar);
        if (!d10) {
            for (int i16 = 1; i16 < A0.size(); i16++) {
                s1.n nVar2 = (s1.n) A0.get(i16);
                if (nVar2.d(vVar)) {
                    z11 = false;
                    d10 = true;
                    nVar = nVar2;
                    break;
                }
            }
        }
        z11 = true;
        if (d10) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        if (nVar.e(vVar)) {
            i11 = 16;
        } else {
            i11 = 8;
        }
        if (nVar.f9807g) {
            i12 = 64;
        } else {
            i12 = 0;
        }
        if (z11) {
            i13 = 128;
        } else {
            i13 = 0;
        }
        if (f1.b0.f3799a >= 26 && "video/dolby-vision".equals(vVar.f1935m) && !i.a(context)) {
            i13 = 256;
        }
        if (d10) {
            List A02 = A0(context, tVar, vVar, z9, true);
            if (!A02.isEmpty()) {
                Pattern pattern = s1.z.f9849a;
                ArrayList arrayList = new ArrayList(A02);
                Collections.sort(arrayList, new s1.u(new w.f(vVar, 12), 0));
                s1.n nVar3 = (s1.n) arrayList.get(0);
                if (nVar3.d(vVar) && nVar3.e(vVar)) {
                    i14 = 32;
                    return i14 | i10 | i11 | i12 | i13 | 0;
                }
            }
        }
        i14 = 0;
        return i14 | i10 | i11 | i12 | i13 | 0;
    }

    @Override // j1.e
    public final void u() {
        try {
            try {
                G();
                k0();
                o1.k kVar = this.W;
                if (kVar != null) {
                    kVar.a(null);
                }
                this.W = null;
            } catch (Throwable th) {
                o1.k kVar2 = this.W;
                if (kVar2 != null) {
                    kVar2.a(null);
                }
                this.W = null;
                throw th;
            }
        } finally {
            this.f1371v1 = false;
            if (this.f1358i1 != null) {
                F0();
            }
        }
    }

    @Override // j1.e
    public final void v() {
        this.f1362m1 = 0;
        this.f5712x.getClass();
        this.f1361l1 = SystemClock.elapsedRealtime();
        this.f1365p1 = 0L;
        this.f1366q1 = 0;
        r rVar = this.f1351b1;
        rVar.f1389d = true;
        ((f1.v) rVar.f1396k).getClass();
        rVar.f1392g = f1.b0.O(SystemClock.elapsedRealtime());
        y yVar = rVar.f1387b;
        yVar.f1407d = true;
        yVar.f1416m = 0L;
        yVar.f1418p = -1L;
        yVar.f1417n = -1L;
        v vVar = yVar.f1405b;
        if (vVar != null) {
            x xVar = yVar.f1406c;
            xVar.getClass();
            xVar.f1401b.sendEmptyMessage(1);
            vVar.c(new w.f(yVar, 15));
        }
        yVar.c(false);
    }

    @Override // j1.e
    public final void w() {
        C0();
        int i10 = this.f1366q1;
        if (i10 != 0) {
            long j4 = this.f1365p1;
            e0 e0Var = this.Y0;
            Handler handler = e0Var.f1336a;
            if (handler != null) {
                handler.post(new b0(e0Var, j4, i10));
            }
            this.f1365p1 = 0L;
            this.f1366q1 = 0;
        }
        r rVar = this.f1351b1;
        rVar.f1389d = false;
        rVar.f1394i = -9223372036854775807L;
        y yVar = rVar.f1387b;
        yVar.f1407d = false;
        v vVar = yVar.f1405b;
        if (vVar != null) {
            vVar.b();
            x xVar = yVar.f1406c;
            xVar.getClass();
            xVar.f1401b.sendEmptyMessage(2);
        }
        yVar.a();
    }
}
