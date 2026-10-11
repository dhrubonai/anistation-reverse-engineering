package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.discord.org.webrtc.PeerConnection;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jp3 extends pp3 implements fp3 {
    public final Context e1;
    public final pz2 f1;
    public final l71 g1;
    public final y23 h1;
    public final AtomicBoolean i1;
    public int j1;
    public boolean k1;
    public ea2 l1;
    public ea2 m1;
    public long n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public int s1;
    public boolean t1;
    public long u1;
    public long v1;
    public boolean w1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp3(Context context, gp3 gp3Var, Handler handler, iw iwVar, l71 l71Var) {
        super(context.getApplicationContext(), 1, gp3Var);
        y23 y23Var;
        if (Build.VERSION.SDK_INT >= 35) {
            y23Var = new y23((byte) 3);
        } else {
            y23Var = null;
        }
        this.e1 = context.getApplicationContext();
        this.g1 = l71Var;
        this.h1 = y23Var;
        this.s1 = -1000;
        this.f1 = new pz2((Object) handler, (Object) iwVar, (byte) 6);
        this.i1 = new AtomicBoolean();
        this.u1 = -9223372036854775807L;
        this.v1 = -9223372036854775807L;
        this.w1 = false;
    }

    @Override // defpackage.pp3
    public final boolean B0(ea2 ea2Var) {
        x25 x25Var = this.A;
        x25Var.getClass();
        if (x25Var.a != 0) {
            int G0 = G0(ea2Var);
            if ((G0 & 512) != 0) {
                x25 x25Var2 = this.A;
                x25Var2.getClass();
                if (x25Var2.a == 2 || (G0 & 1024) != 0 || (ea2Var.N == 0 && ea2Var.O == 0)) {
                    return true;
                }
            }
        }
        if (this.g1.h(ea2Var) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r7 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    @Override // defpackage.pp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int C0(defpackage.ea2 r19) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp3.C0(ea2):int");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, jv] */
    public final int G0(ea2 ea2Var) {
        kv a;
        int i;
        l71 l71Var = this.g1;
        if (l71Var.a0) {
            a = kv.d;
        } else {
            ov b = l71Var.r.b(l71Var.g(ea2Var));
            ?? obj = new Object();
            obj.a = b.a;
            obj.b = b.b;
            obj.c = b.c;
            a = obj.a();
        }
        if (!a.a) {
            return 0;
        }
        if (a.b) {
            i = 1536;
        } else {
            i = 512;
        }
        if (a.c) {
            return i | 2048;
        }
        return i;
    }

    public final void H0() {
        long j;
        long j2;
        long j3;
        k();
        l71 l71Var = this.g1;
        dn0 dn0Var = l71Var.b;
        if (!l71Var.m() || l71Var.H) {
            j = Long.MIN_VALUE;
            j2 = Long.MIN_VALUE;
        } else {
            long min = Math.min(l71Var.t.a(), eq6.c0(l71Var.p.e.b, l71Var.j()));
            ArrayDeque arrayDeque = l71Var.h;
            while (!arrayDeque.isEmpty() && min >= ((k71) arrayDeque.getFirst()).c) {
                l71Var.w = (k71) arrayDeque.remove();
            }
            k71 k71Var = l71Var.w;
            long j4 = min - k71Var.c;
            long E = eq6.E(k71Var.a.a, j4);
            if (arrayDeque.isEmpty()) {
                xu5 xu5Var = (xu5) dn0Var.A;
                if (xu5Var.isActive()) {
                    if (xu5Var.o >= 1024) {
                        long j5 = xu5Var.n;
                        xu5Var.k.getClass();
                        long o = j5 - (r10.i.o() * (r10.j * r10.b));
                        int i = xu5Var.i.a;
                        int i2 = xu5Var.h.a;
                        j = Long.MIN_VALUE;
                        long j6 = xu5Var.o;
                        if (i == i2) {
                            j4 = eq6.e0(j4, o, j6, RoundingMode.DOWN);
                        } else {
                            j4 = eq6.e0(j4, o * i, j6 * i2, RoundingMode.DOWN);
                        }
                    } else {
                        j = Long.MIN_VALUE;
                        j4 = (long) (xu5Var.d * j4);
                    }
                } else {
                    j = Long.MIN_VALUE;
                }
                k71 k71Var2 = l71Var.w;
                j3 = k71Var2.b + j4;
                k71Var2.d = j4 - E;
            } else {
                j = Long.MIN_VALUE;
                k71 k71Var3 = l71Var.w;
                j3 = k71Var3.b + E + k71Var3.d;
            }
            long j7 = ((ro5) dn0Var.z).l;
            j2 = eq6.c0(l71Var.p.e.b, j7) + j3;
            long j8 = l71Var.c0;
            if (j7 > j8) {
                long c0 = eq6.c0(l71Var.p.e.b, j7 - j8);
                l71Var.c0 = j7;
                l71Var.d0 += c0;
                Handler handler = l71Var.e0;
                if (handler == null) {
                    handler = new Handler(Looper.myLooper());
                    l71Var.e0 = handler;
                }
                handler.removeCallbacksAndMessages(null);
                l71Var.e0.postDelayed(new p0((Object) l71Var, (byte) 12), 100L);
            }
        }
        if (j2 != j) {
            if (!this.o1) {
                j2 = Math.max(this.n1, j2);
            }
            this.n1 = j2;
            this.o1 = false;
        }
    }

    @Override // defpackage.pp3
    public final s61 J(mp3 mp3Var, ea2 ea2Var, ea2 ea2Var2, boolean z) {
        int i;
        s61 b = mp3Var.b(ea2Var, ea2Var2);
        int i2 = b.e;
        if (this.d0 == null && B0(ea2Var2)) {
            i2 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
        }
        "OMX.google.raw.decoder".equals(mp3Var.a);
        if (ea2Var2.q > this.j1) {
            i2 |= 64;
        }
        int i3 = i2;
        String str = mp3Var.a;
        if (i3 != 0) {
            i = 0;
        } else {
            i = b.d;
        }
        return new s61(str, ea2Var, ea2Var2, i, i3);
    }

    @Override // defpackage.pp3
    public final ArrayList T(ea2 ea2Var, boolean z) {
        o15 g;
        mp3 mp3Var;
        if (ea2Var.p == null) {
            z62 z62Var = nw2.y;
            g = o15.B;
        } else {
            if (this.g1.h(ea2Var) != 0) {
                List e = up3.e("audio/raw", false, false);
                if (e.isEmpty()) {
                    mp3Var = null;
                } else {
                    mp3Var = (mp3) e.get(0);
                }
                if (mp3Var != null) {
                    g = nw2.s(mp3Var);
                }
            }
            g = up3.g(ea2Var, z, false);
        }
        HashMap hashMap = up3.a;
        ArrayList arrayList = new ArrayList(g);
        Collections.sort(arrayList, new xq0(new qp3(this.e1, ea2Var, (byte) 1), (byte) 1));
        return arrayList;
    }

    @Override // defpackage.pp3
    public final long U(long j, long j2, boolean z) {
        boolean z2;
        long e0;
        float f;
        l71 l71Var = this.g1;
        boolean z3 = false;
        if (l71Var.k() && this.u1 != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.t1) {
            if (z2 || this.O0) {
                return 1000000L;
            }
        } else {
            if (!l71Var.m()) {
                e0 = -9223372036854775807L;
            } else if (l71Var.p.b()) {
                e0 = eq6.c0(l71Var.p.e.b, l71Var.t.a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = l71Var.t.a.getBufferSizeInFrames();
                int C = w65.C(l71Var.p.e.a);
                if (C != -2147483647) {
                    z3 = true;
                }
                io3.B(z3);
                e0 = eq6.e0(bufferSizeInFrames, 1000000L, C, RoundingMode.DOWN);
            }
            if (this.r1 && z2 && e0 != -9223372036854775807L) {
                float min = (float) Math.min(e0, this.u1 - j);
                rn4 rn4Var = l71Var.x;
                if (rn4Var != null) {
                    f = rn4Var.a;
                } else {
                    f = 1.0f;
                }
                return Math.max(10000L, (min / f) / 2.0f);
            }
        }
        return 10000L;
    }

    @Override // defpackage.pp3
    public final tp W(mp3 mp3Var, ea2 ea2Var, MediaCrypto mediaCrypto, float f) {
        vu vuVar;
        int i;
        int i2;
        Pair c;
        ea2[] ea2VarArr = this.G;
        ea2VarArr.getClass();
        String str = mp3Var.a;
        "OMX.google.raw.decoder".equals(str);
        int i3 = ea2Var.q;
        String str2 = ea2Var.p;
        int i4 = ea2Var.J;
        int i5 = 0;
        boolean z = true;
        if (ea2VarArr.length != 1) {
            for (ea2 ea2Var2 : ea2VarArr) {
                if (mp3Var.b(ea2Var, ea2Var2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    i3 = Math.max(i3, ea2Var2.q);
                }
            }
        }
        this.j1 = i3;
        HashSet hashSet = cr3.a;
        if (!str.equals("OMX.google.opus.decoder") && !str.equals("c2.android.opus.decoder") && !str.equals("OMX.google.vorbis.decoder") && !str.equals("c2.android.vorbis.decoder")) {
            z = false;
        }
        this.k1 = z;
        String str3 = mp3Var.c;
        int i6 = this.j1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i4);
        int i7 = ea2Var.L;
        mediaFormat.setInteger("sample-rate", i7);
        m37.I(mediaFormat, ea2Var.s);
        m37.y(mediaFormat, "max-input-size", i6);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2) && (c = ko0.c(ea2Var)) != null) {
            m37.y(mediaFormat, "profile", ((Integer) c.first).intValue());
            m37.y(mediaFormat, "level", ((Integer) c.second).intValue());
        }
        da2 da2Var = new da2();
        da2Var.o = qy3.n("audio/raw");
        da2Var.I = i4;
        da2Var.K = i7;
        da2Var.L = 4;
        ea2 ea2Var3 = new ea2(da2Var);
        l71 l71Var = this.g1;
        if (l71Var.h(ea2Var3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i8 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.s1));
        }
        ea2 ea2Var4 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            yw ywVar = l71Var.r;
            if (ywVar != null) {
                vuVar = ywVar.g;
            } else {
                vuVar = null;
            }
            if (vuVar == null) {
                kb0.O("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                zw2 zw2Var = wt2.a;
                nw2 nw2Var = vuVar.d;
                int size = nw2Var.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        Object obj = nw2Var.get(i9);
                        i9++;
                        Integer num = (Integer) obj;
                        i = num.intValue();
                        if (wt2.a.contains(num)) {
                            break;
                        }
                    } else {
                        i = 0;
                        break;
                    }
                }
                if (i != 0) {
                    i2 = i;
                } else {
                    nw2 nw2Var2 = vuVar.c;
                    int size2 = nw2Var2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size2) {
                            break;
                        }
                        Object obj2 = nw2Var2.get(i10);
                        i10++;
                        Integer num2 = (Integer) obj2;
                        int intValue = num2.intValue();
                        if (wt2.a.contains(num2)) {
                            i5 = intValue;
                            break;
                        }
                    }
                    if (i5 != 0) {
                        i2 = i5;
                    } else {
                        i2 = 12;
                    }
                }
                int bitCount = Integer.bitCount(i2);
                mediaFormat.setInteger("channel-mask", i2);
                mediaFormat.setInteger("max-output-channel-count", bitCount);
            }
        }
        H(mediaFormat);
        if ("audio/raw".equals(mp3Var.b) && !"audio/raw".equals(str2)) {
            ea2Var4 = ea2Var;
        }
        this.m1 = ea2Var4;
        return new tp(mp3Var, mediaFormat, ea2Var, null, mediaCrypto, this.h1);
    }

    @Override // defpackage.pp3
    public final void X(q61 q61Var) {
        j71 j71Var;
        ea2 ea2Var = q61Var.z;
        if (ea2Var != null && Objects.equals(ea2Var.p, "audio/opus") && this.B0) {
            ByteBuffer byteBuffer = q61Var.E;
            byteBuffer.getClass();
            ea2 ea2Var2 = q61Var.z;
            ea2Var2.getClass();
            int i = ea2Var2.N;
            if (byteBuffer.remaining() == 8) {
                int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                l71 l71Var = this.g1;
                ww wwVar = l71Var.t;
                if (wwVar != null && wwVar.a.isOffloadedPlayback() && (j71Var = l71Var.p) != null && j71Var.e.k) {
                    l71Var.t.a.setOffloadDelayPadding(i, i2);
                }
            }
        }
    }

    @Override // defpackage.fp3
    public final void b(rn4 rn4Var) {
        l71 l71Var = this.g1;
        if (l71Var.v()) {
            l71Var.x = rn4Var;
            l71Var.s();
            return;
        }
        rn4 rn4Var2 = new rn4(eq6.i(rn4Var.a, 0.1f, 8.0f), eq6.i(rn4Var.b, 0.1f, 8.0f));
        l71Var.x = rn4Var2;
        k71 k71Var = new k71(rn4Var2, -9223372036854775807L, -9223372036854775807L);
        if (l71Var.m()) {
            l71Var.v = k71Var;
        } else {
            l71Var.w = k71Var;
        }
    }

    @Override // defpackage.pp3, defpackage.w30, defpackage.kp4
    public final void c(int i, Object obj) {
        rn4 rn4Var;
        y23 y23Var;
        l71 l71Var = this.g1;
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    if (i != 12) {
                        boolean z = false;
                        if (i != 16) {
                            if (i != 9) {
                                if (i != 10) {
                                    if (i != 19) {
                                        if (i != 20) {
                                            super.c(i, obj);
                                            return;
                                        }
                                        obj.getClass();
                                        yw ywVar = (yw) obj;
                                        yw ywVar2 = l71Var.r;
                                        if (ywVar != ywVar2) {
                                            ywVar2.d();
                                            l71Var.r = ywVar;
                                            g71 g71Var = l71Var.s;
                                            if (g71Var != null) {
                                                ywVar.f();
                                                ui3 ui3Var = ywVar.e;
                                                if (ui3Var == null) {
                                                    ui3Var = new ui3(Thread.currentThread());
                                                    ywVar.e = ui3Var;
                                                }
                                                ui3Var.a(g71Var);
                                            }
                                            l71Var.q();
                                            return;
                                        }
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    if (intValue == 0 || intValue == -1) {
                                        intValue = -1;
                                    }
                                    if (l71Var.X != intValue) {
                                        l71Var.X = intValue;
                                        l71Var.q();
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue2 = ((Integer) obj).intValue();
                                if (l71Var.U) {
                                    if (l71Var.T == intValue2) {
                                        l71Var.U = false;
                                    }
                                    if (Build.VERSION.SDK_INT < 35 && (y23Var = this.h1) != null) {
                                        y23Var.b0(intValue2);
                                        return;
                                    }
                                    return;
                                }
                                if (l71Var.T != intValue2) {
                                    l71Var.T = intValue2;
                                    if (intValue2 != 0) {
                                        z = true;
                                    }
                                    l71Var.S = z;
                                    l71Var.q();
                                }
                                if (Build.VERSION.SDK_INT < 35) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            obj.getClass();
                            l71Var.y = ((Boolean) obj).booleanValue();
                            if (l71Var.v()) {
                                rn4Var = rn4.d;
                            } else {
                                rn4Var = l71Var.x;
                            }
                            k71 k71Var = new k71(rn4Var, -9223372036854775807L, -9223372036854775807L);
                            if (l71Var.m()) {
                                l71Var.v = k71Var;
                                return;
                            } else {
                                l71Var.w = k71Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.s1 = ((Integer) obj).intValue();
                        hp3 hp3Var = this.i0;
                        if (hp3Var != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.s1));
                            hp3Var.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    l71Var.W = audioDeviceInfo;
                    ww wwVar = l71Var.t;
                    if (wwVar != null) {
                        wwVar.a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                uy uyVar = (uy) obj;
                uyVar.getClass();
                if (!l71Var.V.equals(uyVar)) {
                    if (l71Var.t != null) {
                        l71Var.V.getClass();
                    }
                    l71Var.V = uyVar;
                    return;
                }
                return;
            }
            ru ruVar = (ru) obj;
            ruVar.getClass();
            if (!l71Var.u.equals(ruVar)) {
                l71Var.u = ruVar;
                if (!l71Var.Y) {
                    l71Var.q();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        if (l71Var.K != floatValue) {
            l71Var.K = floatValue;
            if (l71Var.m()) {
                l71Var.t.a.setVolume(l71Var.K);
            }
        }
    }

    @Override // defpackage.pp3
    public final void d0(Exception exc) {
        kb0.t("MediaCodecAudioRenderer", "Audio codec error", exc);
        pz2 pz2Var = this.f1;
        Handler handler = (Handler) pz2Var.y;
        if (handler != null) {
            handler.post(new gw(pz2Var, exc, (byte) 0));
        }
    }

    @Override // defpackage.fp3
    public final rn4 e() {
        return this.g1.x;
    }

    @Override // defpackage.pp3
    public final void e0(long j, String str, long j2) {
        pz2 pz2Var = this.f1;
        Handler handler = (Handler) pz2Var.y;
        if (handler != null) {
            handler.post(new hw(pz2Var, str, j, j2, (byte) 0));
        }
    }

    @Override // defpackage.pp3
    public final void f0(io0 io0Var) {
        pz2 pz2Var = this.f1;
        Handler handler = (Handler) pz2Var.y;
        if (handler != null) {
            handler.post(new gb(pz2Var, io0Var, (byte) 3));
        }
    }

    @Override // defpackage.pp3
    public final void g0(String str) {
        pz2 pz2Var = this.f1;
        Handler handler = (Handler) pz2Var.y;
        if (handler != null) {
            handler.post(new gb(pz2Var, str, (byte) 2));
        }
    }

    @Override // defpackage.pp3
    public final s61 h0(pz2 pz2Var) {
        ea2 ea2Var = (ea2) pz2Var.z;
        ea2Var.getClass();
        this.l1 = ea2Var;
        s61 h0 = super.h0(pz2Var);
        pz2 pz2Var2 = this.f1;
        Handler handler = (Handler) pz2Var2.y;
        if (handler != null) {
            handler.post(new ze((Object) pz2Var2, (Object) ea2Var, (Object) h0, (byte) 1));
        }
        return h0;
    }

    @Override // defpackage.w30
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00da A[Catch: lw -> 0x00ed, TRY_ENTER, TryCatch #0 {lw -> 0x00ed, blocks: (B:7:0x00d4, B:10:0x00da, B:12:0x00e3, B:13:0x00f1, B:15:0x0110, B:17:0x0116, B:20:0x0125, B:22:0x0128, B:27:0x00ef), top: B:6:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0110 A[Catch: lw -> 0x00ed, TryCatch #0 {lw -> 0x00ed, blocks: (B:7:0x00d4, B:10:0x00da, B:12:0x00e3, B:13:0x00f1, B:15:0x0110, B:17:0x0116, B:20:0x0125, B:22:0x0128, B:27:0x00ef), top: B:6:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, zp2] */
    @Override // defpackage.pp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(defpackage.ea2 r9, android.media.MediaFormat r10) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp3.i0(ea2, android.media.MediaFormat):void");
    }

    @Override // defpackage.pp3
    public final void j0(long j) {
        this.g1.J = j;
    }

    @Override // defpackage.w30
    public final boolean k() {
        if (this.O0) {
            l71 l71Var = this.g1;
            if (l71Var.m()) {
                if (l71Var.O && !l71Var.k()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.pp3
    public final void l0() {
        this.g1.G = true;
    }

    @Override // defpackage.fp3
    public final long m() {
        if (this.E == 2) {
            H0();
        }
        return this.n1;
    }

    @Override // defpackage.w30
    public final boolean n() {
        boolean isReady;
        if (this.g1.k()) {
            this.v1 = -9223372036854775807L;
            this.w1 = true;
            return true;
        }
        if (this.w1 && this.t1) {
            if (j()) {
                isReady = this.K;
            } else {
                g95 g95Var = this.F;
                g95Var.getClass();
                isReady = g95Var.isReady();
            }
            if (isReady && !j()) {
                this.D.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.v1;
                if (j == -9223372036854775807L) {
                    this.v1 = elapsedRealtime;
                    return true;
                }
                if (elapsedRealtime - j < 100) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.fp3
    public final boolean o() {
        boolean z = this.q1;
        this.q1 = false;
        return z;
    }

    @Override // defpackage.pp3
    public final boolean o0(long j, long j2, hp3 hp3Var, final ByteBuffer byteBuffer, int i, int i2, final int i3, final long j3, boolean z, boolean z2, ea2 ea2Var) {
        final jp3 jp3Var;
        int i4;
        int i5;
        byteBuffer.getClass();
        this.u1 = -9223372036854775807L;
        if (this.m1 != null && (i2 & 2) != 0) {
            hp3Var.getClass();
            hp3Var.f(i);
            return true;
        }
        if (z) {
            if (hp3Var != null) {
                hp3Var.f(i);
            }
            this.S0.f += i3;
            this.g1.G = true;
            return true;
        }
        try {
            try {
                jp3Var = this;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        } catch (mw e3) {
            e = e3;
            jp3Var = this;
        } catch (ow e4) {
            e = e4;
            jp3Var = this;
        }
        try {
            ve6 ve6Var = new ve6() { // from class: ip3
                /* JADX WARN: Code restructure failed: missing block: B:53:0x0111, code lost:
                
                    if (r3 == 0) goto L111;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:99:0x00a3, code lost:
                
                    if (r1.l() == false) goto L12;
                 */
                @Override // defpackage.ve6
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 538
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ip3.run():void");
                }
            };
            if (hp3Var != null) {
                hp3Var.y(ve6Var);
            } else {
                ve6Var.run();
            }
            if (jp3Var.i1.get()) {
                if (hp3Var != null) {
                    hp3Var.f(i);
                }
                jp3Var.S0.e += i3;
                return true;
            }
            jp3Var.u1 = j3;
            return false;
        } catch (mw e5) {
            e = e5;
            mw mwVar = e;
            ea2 ea2Var2 = jp3Var.l1;
            if (jp3Var.B0) {
                x25 x25Var = jp3Var.A;
                x25Var.getClass();
                if (x25Var.a != 0) {
                    i5 = 5004;
                    throw jp3Var.d(mwVar, ea2Var2, mwVar.x, i5);
                }
            }
            i5 = 5001;
            throw jp3Var.d(mwVar, ea2Var2, mwVar.x, i5);
        } catch (ow e6) {
            e = e6;
            ow owVar = e;
            if (jp3Var.B0) {
                x25 x25Var2 = jp3Var.A;
                x25Var2.getClass();
                if (x25Var2.a != 0) {
                    i4 = 5003;
                    throw jp3Var.d(owVar, ea2Var, owVar.y, i4);
                }
            }
            i4 = 5002;
            throw jp3Var.d(owVar, ea2Var, owVar.y, i4);
        }
    }

    @Override // defpackage.pp3, defpackage.w30
    public final void p() {
        pz2 pz2Var = this.f1;
        this.p1 = true;
        this.l1 = null;
        this.u1 = -9223372036854775807L;
        this.r1 = false;
        try {
            this.g1.f();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [n61, java.lang.Object] */
    @Override // defpackage.w30
    public final void q(boolean z, boolean z2) {
        ?? obj = new Object();
        this.S0 = obj;
        pz2 pz2Var = this.f1;
        Handler handler = (Handler) pz2Var.y;
        byte b = 1;
        if (handler != null) {
            handler.post(new bw(pz2Var, obj, b));
        }
        x25 x25Var = this.A;
        x25Var.getClass();
        boolean z3 = x25Var.b;
        l71 l71Var = this.g1;
        if (z3) {
            io3.B(l71Var.S);
            if (!l71Var.Y) {
                l71Var.Y = true;
                l71Var.q();
            }
        } else if (l71Var.Y) {
            l71Var.Y = false;
            l71Var.q();
        }
        cp4 cp4Var = this.C;
        cp4Var.getClass();
        l71Var.m = cp4Var;
        f46 f46Var = this.D;
        f46Var.getClass();
        l71Var.r.f = f46Var;
        l71Var.n = new af2((Object) this, (byte) 29);
    }

    @Override // defpackage.pp3, defpackage.w30
    public final void r(long j, boolean z, boolean z2) {
        super.r(j, z, z2);
        this.g1.f();
        this.n1 = j;
        this.u1 = -9223372036854775807L;
        this.v1 = -9223372036854775807L;
        this.w1 = false;
        this.q1 = false;
        this.r1 = false;
        this.o1 = true;
    }

    @Override // defpackage.pp3
    public final void r0() {
        int i;
        try {
            l71 l71Var = this.g1;
            if (!l71Var.O && l71Var.m() && l71Var.e()) {
                l71Var.o();
                l71Var.O = true;
            }
            long j = this.T0.h;
            if (j != -9223372036854775807L) {
                this.u1 = j;
            }
        } catch (ow e) {
            if (this.B0) {
                i = 5003;
            } else {
                i = 5002;
            }
            throw d(e, e.z, e.y, i);
        }
    }

    @Override // defpackage.w30
    public final void s() {
        y23 y23Var;
        this.g1.r.d();
        if (Build.VERSION.SDK_INT >= 35 && (y23Var = this.h1) != null) {
            ((HashSet) y23Var.y).clear();
            LoudnessCodecController loudnessCodecController = (LoudnessCodecController) y23Var.z;
            if (loudnessCodecController != null) {
                loudnessCodecController.close();
            }
        }
    }

    @Override // defpackage.w30
    public final void t() {
        l71 l71Var = this.g1;
        this.q1 = false;
        this.r1 = false;
        this.u1 = -9223372036854775807L;
        try {
            try {
                this.B0 = false;
                s0();
                q0();
                qp1 qp1Var = this.d0;
                if (qp1Var != null) {
                    qp1Var.c(null);
                }
                this.d0 = null;
            } catch (Throwable th) {
                qp1 qp1Var2 = this.d0;
                if (qp1Var2 != null) {
                    qp1Var2.c(null);
                }
                this.d0 = null;
                throw th;
            }
        } finally {
            if (this.p1) {
                this.p1 = false;
                l71Var.r();
            }
        }
    }

    @Override // defpackage.w30
    public final void u() {
        this.g1.n();
        this.t1 = true;
    }

    @Override // defpackage.w30
    public final void v() {
        H0();
        this.t1 = false;
        l71 l71Var = this.g1;
        l71Var.R = false;
        if (l71Var.m()) {
            ww wwVar = l71Var.t;
            AudioTrack audioTrack = wwVar.a;
            ax axVar = wwVar.e;
            axVar.e();
            if (axVar.u == -9223372036854775807L) {
                axVar.h.a(0);
            }
            axVar.w = axVar.a();
            if (!wwVar.j || audioTrack.isOffloadedPlayback()) {
                audioTrack.pause();
            }
        }
        this.r1 = false;
        this.v1 = -9223372036854775807L;
        this.w1 = false;
    }

    @Override // defpackage.w30
    public final fp3 h() {
        return this;
    }
}
