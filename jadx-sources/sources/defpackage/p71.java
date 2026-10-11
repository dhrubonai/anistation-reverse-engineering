package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.protobuf.CodedOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p71 {
    public final MediaCodec.BufferInfo a;
    public final MediaFormat b;
    public final ea2 c;
    public final MediaCodec d;
    public final Surface e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final AtomicBoolean i;
    public ea2 j;
    public ByteBuffer k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(10:2b|16|17|(0)|(1:27)|28|29|(0)|32|33)|6|7|(1:9)|60|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0090, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0091, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[Catch: Exception -> 0x006c, TryCatch #1 {Exception -> 0x006c, blocks: (B:17:0x0048, B:19:0x0057, B:21:0x005d, B:24:0x0066, B:27:0x0072, B:28:0x0076), top: B:16:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p71(android.content.Context r10, defpackage.ea2 r11, android.media.MediaFormat r12, java.lang.String r13, boolean r14, android.view.Surface r15) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.<init>(android.content.Context, ea2, android.media.MediaFormat, java.lang.String, boolean, android.view.Surface):void");
    }

    public static ea2 a(MediaFormat mediaFormat, boolean z, fy3 fy3Var) {
        String string;
        int i;
        int i2;
        float integer;
        boolean z2;
        int i3;
        float integer2;
        float f;
        float f2;
        byte[] bArr;
        int i4;
        hp0 hp0Var;
        int i5;
        int i6;
        da2 da2Var = new da2();
        da2Var.o = qy3.n(mediaFormat.getString("mime"));
        da2Var.d = mediaFormat.getString("language");
        da2Var.j = mediaFormat.getInteger("max-bitrate", -1);
        da2Var.i = mediaFormat.getInteger("bitrate", -1);
        if (Objects.equals(mediaFormat.getString("mime"), "video/3gpp") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer3 = mediaFormat.getInteger("profile");
            byte[] bArr2 = ko0.a;
            if (integer3 != 1) {
                if (integer3 != 2) {
                    if (integer3 != 4) {
                        if (integer3 != 8) {
                            if (integer3 != 16) {
                                if (integer3 != 32) {
                                    if (integer3 != 64) {
                                        if (integer3 != 128) {
                                            if (integer3 != 256) {
                                                i5 = -1;
                                            } else {
                                                i5 = 8;
                                            }
                                        } else {
                                            i5 = 7;
                                        }
                                    } else {
                                        i5 = 6;
                                    }
                                } else {
                                    i5 = 5;
                                }
                            } else {
                                i5 = 4;
                            }
                        } else {
                            i5 = 3;
                        }
                    } else {
                        i5 = 2;
                    }
                } else {
                    i5 = 1;
                }
            } else {
                i5 = 0;
            }
            int integer4 = mediaFormat.getInteger("level");
            if (integer4 != 1) {
                if (integer4 != 2) {
                    if (integer4 != 4) {
                        if (integer4 != 8) {
                            if (integer4 != 16) {
                                if (integer4 != 32) {
                                    if (integer4 != 64) {
                                        if (integer4 != 128) {
                                            i6 = -1;
                                        } else {
                                            i6 = 70;
                                        }
                                    } else {
                                        i6 = 60;
                                    }
                                } else {
                                    i6 = 50;
                                }
                            } else {
                                i6 = 45;
                            }
                        } else {
                            i6 = 40;
                        }
                    } else {
                        i6 = 30;
                    }
                } else {
                    i6 = 20;
                }
            } else {
                i6 = 10;
            }
            String str = eq6.a;
            Locale locale = Locale.US;
            string = zo5.m("s263.", ".", i5, i6);
        } else if (Objects.equals(mediaFormat.getString("mime"), "video/dolby-vision") && mediaFormat.containsKey("profile")) {
            int integer5 = mediaFormat.getInteger("level", -1);
            if (integer5 == -1) {
                int integer6 = mediaFormat.getInteger("width", -1);
                int integer7 = mediaFormat.getInteger("height", -1);
                if (!mediaFormat.containsKey("frame-rate")) {
                    integer = -1.0f;
                } else if (mediaFormat.getValueTypeForKey("frame-rate") == 3) {
                    integer = mediaFormat.getFloat("frame-rate");
                } else {
                    integer = mediaFormat.getInteger("frame-rate");
                }
                byte[] bArr3 = ko0.a;
                int max = Math.max(integer6, integer7);
                if (max <= 7680) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                io3.B(z2);
                float f3 = integer6 * integer7 * integer;
                if (max <= 1280) {
                    if (f3 <= 2.21184E7f) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                } else if (max <= 1920 && f3 <= 4.97664E7f) {
                    i3 = 4;
                } else if (max <= 2560 && f3 <= 6.2208E7f) {
                    i3 = 8;
                } else if (max <= 3840) {
                    if (f3 <= 1.24416E8f) {
                        i3 = 16;
                    } else if (f3 <= 1.990656E8f) {
                        i3 = 32;
                    } else if (f3 <= 2.48832E8f) {
                        i3 = 64;
                    } else if (f3 <= 3.981312E8f) {
                        i3 = 128;
                    } else if (f3 <= 4.97664E8f) {
                        i3 = 256;
                    } else {
                        i3 = 512;
                    }
                } else if (max <= 7680) {
                    if (f3 <= 9.95328E8f) {
                        i3 = 1024;
                    } else {
                        i3 = 2048;
                    }
                } else {
                    i3 = -1;
                }
                integer5 = i3;
            }
            int integer8 = mediaFormat.getInteger("profile");
            byte[] bArr4 = ko0.a;
            if (integer8 != 1) {
                if (integer8 != 2) {
                    if (integer8 != 4) {
                        if (integer8 != 8) {
                            if (integer8 != 16) {
                                if (integer8 != 32) {
                                    if (integer8 != 64) {
                                        if (integer8 != 128) {
                                            if (integer8 != 256) {
                                                if (integer8 != 512) {
                                                    if (integer8 == 1024) {
                                                        i = 10;
                                                    } else {
                                                        ze0.k(qx1.h(integer8, "Unknown Dolby Vision profile: "));
                                                        return null;
                                                    }
                                                } else {
                                                    i = 9;
                                                }
                                            } else {
                                                i = 8;
                                            }
                                        } else {
                                            i = 7;
                                        }
                                    } else {
                                        i = 6;
                                    }
                                } else {
                                    i = 5;
                                }
                            } else {
                                i = 4;
                            }
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
            } else {
                i = 0;
            }
            if (integer5 != 1) {
                if (integer5 != 2) {
                    switch (integer5) {
                        case 4:
                            i2 = 3;
                            break;
                        case 8:
                            i2 = 4;
                            break;
                        case 16:
                            i2 = 5;
                            break;
                        case 32:
                            i2 = 6;
                            break;
                        case 64:
                            i2 = 7;
                            break;
                        case 128:
                            i2 = 8;
                            break;
                        case 256:
                            i2 = 9;
                            break;
                        case 512:
                            i2 = 10;
                            break;
                        case 1024:
                            i2 = 11;
                            break;
                        case 2048:
                            i2 = 12;
                            break;
                        case CodedOutputStream.DEFAULT_BUFFER_SIZE /* 4096 */:
                            i2 = 13;
                            break;
                        default:
                            ze0.k(qx1.h(integer5, "Unknown Dolby Vision level: "));
                            return null;
                    }
                } else {
                    i2 = 2;
                }
            } else {
                i2 = 1;
            }
            if (i > 9) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str2 = eq6.a;
                string = String.format(Locale.US, "dvh1.%02d.%02d", objArr);
            } else if (i > 8) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str3 = eq6.a;
                string = String.format(Locale.US, "dvav.%02d.%02d", objArr2);
            } else {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str4 = eq6.a;
                string = String.format(Locale.US, "dvhe.%02d.%02d", objArr3);
            }
        } else {
            string = mediaFormat.getString("codecs-string");
        }
        da2Var.k = string;
        if (!mediaFormat.containsKey("frame-rate")) {
            integer2 = -1.0f;
        } else if (mediaFormat.getValueTypeForKey("frame-rate") == 3) {
            integer2 = mediaFormat.getFloat("frame-rate");
        } else {
            integer2 = mediaFormat.getInteger("frame-rate");
        }
        if (integer2 <= 0.0f) {
            f = -1.0f;
        } else {
            f = integer2;
        }
        da2Var.a(f);
        da2Var.v = mediaFormat.getInteger("width", -1);
        da2Var.w = mediaFormat.getInteger("height", -1);
        if (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            f2 = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        } else {
            f2 = 1.0f;
        }
        da2Var.D = f2;
        da2Var.p = mediaFormat.getInteger("max-input-size", -1);
        int i7 = 0;
        da2Var.B = mediaFormat.getInteger("rotation-degrees", 0);
        int integer9 = mediaFormat.getInteger("color-standard", -1);
        int integer10 = mediaFormat.getInteger("color-range", -1);
        int integer11 = mediaFormat.getInteger("color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        if (byteBuffer != null) {
            byte[] bArr5 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr5);
            bArr = bArr5;
        } else {
            bArr = null;
        }
        if (integer9 != 2 && integer9 != 1 && integer9 != 6) {
            i4 = -1;
            if (integer9 != -1) {
                integer9 = -1;
            }
        } else {
            i4 = -1;
        }
        if (integer10 != 2 && integer10 != 1 && integer10 != i4) {
            integer10 = i4;
        }
        if (integer11 != 1 && integer11 != 3 && integer11 != 2 && integer11 != 6 && integer11 != 7 && integer11 != i4) {
            integer11 = i4;
        }
        if (integer9 == i4 && integer10 == i4 && integer11 == i4 && bArr == null) {
            hp0Var = null;
        } else {
            hp0Var = new hp0(integer9, integer10, integer11, bArr, -1, -1);
        }
        da2Var.G = hp0Var;
        da2Var.K = mediaFormat.getInteger("sample-rate", -1);
        int integer12 = mediaFormat.getInteger("exo-pcm-encoding-int", -1);
        if (integer12 == -1) {
            integer12 = mediaFormat.getInteger("pcm-encoding", -1);
        }
        da2Var.L = integer12;
        int integer13 = mediaFormat.getInteger("channel-count", -1);
        int integer14 = mediaFormat.getInteger("channel-mask", -1);
        if (integer13 != -1 && integer14 != -1 && Integer.bitCount(integer14) != integer13) {
            integer14 = -1;
        }
        da2Var.I = integer13;
        da2Var.J = integer14;
        io3.t(4, "initialCapacity");
        Object[] objArr4 = new Object[4];
        int i8 = 0;
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i8);
            if (byteBuffer2 == null) {
                da2Var.r = nw2.j(objArr4, i7);
                if (mediaFormat.containsKey("track-id")) {
                    da2Var.a = Integer.toString(mediaFormat.getInteger("track-id"));
                }
                ea2 ea2Var = new ea2(da2Var);
                da2 a = ea2Var.a();
                a.l = fy3Var;
                if (z && ea2Var.M == -1 && Objects.equals(ea2Var.p, "audio/raw")) {
                    a.L = 2;
                }
                return new ea2(a);
            }
            byte[] bArr6 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr6);
            byteBuffer2.rewind();
            int i9 = i7 + 1;
            int b = fw2.b(objArr4.length, i9);
            if (b > objArr4.length) {
                objArr4 = Arrays.copyOf(objArr4, b);
            }
            objArr4[i7] = bArr6;
            i8++;
            i7 = i9;
        }
    }

    public final oz1 b(RuntimeException runtimeException) {
        int i;
        boolean z = this.g;
        if (z) {
            i = 3002;
        } else {
            i = 4002;
        }
        return oz1.c(runtimeException, i, new pn0(this.b.toString(), this.h, z, this.d.getCanonicalName()));
    }

    public final ByteBuffer c() {
        if (!f(true)) {
            return null;
        }
        long j = this.a.presentationTimeUs;
        LinkedHashMap linkedHashMap = a61.a;
        synchronized (a61.class) {
            synchronized (a61.class) {
            }
            return this.k;
        }
        return this.k;
    }

    public final boolean d() {
        if (this.o && this.m == -1) {
            return true;
        }
        return false;
    }

    public final boolean e(q61 q61Var) {
        MediaCodec mediaCodec = this.d;
        if (!this.n) {
            if (this.l < 0) {
                try {
                    int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
                    this.l = dequeueInputBuffer;
                    if (dequeueInputBuffer < 0) {
                        return false;
                    }
                    try {
                        q61Var.B = mediaCodec.getInputBuffer(dequeueInputBuffer);
                        q61Var.f();
                    } catch (RuntimeException e) {
                        kb0.r("DefaultCodec", "MediaCodec error", e);
                        throw b(e);
                    }
                } catch (RuntimeException e2) {
                    kb0.r("DefaultCodec", "MediaCodec error", e2);
                    throw b(e2);
                }
            }
            q61Var.B.getClass();
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(boolean r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.f(boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.q61 r9) {
        /*
            r8 = this;
            boolean r0 = r8.n
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Input buffer can not be queued after the input stream has ended."
            defpackage.io3.A(r2, r0)
            java.nio.ByteBuffer r0 = r9.B
            r2 = 0
            if (r0 == 0) goto L21
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L21
            java.nio.ByteBuffer r0 = r9.B
            int r0 = r0.position()
            java.nio.ByteBuffer r3 = r9.B
            int r3 = r3.remaining()
            goto L23
        L21:
            r0 = r2
            r3 = r0
        L23:
            long r4 = r9.D
            r6 = 4
            boolean r7 = r9.d(r6)
            if (r7 == 0) goto L54
            r8.n = r1
            java.util.LinkedHashMap r7 = defpackage.a61.a
            java.lang.Class<a61> r7 = defpackage.a61.class
            monitor-enter(r7)
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r7)
            boolean r7 = r8.g
            if (r7 == 0) goto L4d
            java.nio.ByteBuffer r0 = r9.B
            if (r0 == 0) goto L46
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L45
            goto L46
        L45:
            r1 = r2
        L46:
            defpackage.io3.B(r1)
            r4 = 0
            r3 = r2
            goto L56
        L4d:
            r2 = r0
            goto L56
        L4f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L51
            throw r8
        L51:
            r0 = move-exception
            r8 = r0
            goto L4f
        L54:
            r6 = r2
            goto L4d
        L56:
            android.media.MediaCodec r0 = r8.d     // Catch: java.lang.RuntimeException -> L71
            int r1 = r8.l     // Catch: java.lang.RuntimeException -> L71
            r0.queueInputBuffer(r1, r2, r3, r4, r6)     // Catch: java.lang.RuntimeException -> L71
            java.util.LinkedHashMap r0 = defpackage.a61.a
            java.lang.Class<a61> r1 = defpackage.a61.class
            monitor-enter(r1)
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r1)
            r0 = -1
            r8.l = r0
            r8 = 0
            r9.B = r8
            return
        L6c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6e
            throw r8
        L6e:
            r0 = move-exception
            r8 = r0
            goto L6c
        L71:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "DefaultCodec"
            java.lang.String r1 = "MediaCodec error"
            defpackage.kb0.r(r0, r1, r9)
            oz1 r8 = r8.b(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.g(q61):void");
    }

    public final void h() {
        this.k = null;
        Surface surface = this.e;
        if (surface != null) {
            surface.release();
        }
        this.d.release();
    }

    public final void i() {
        MediaCodec.BufferInfo bufferInfo = this.a;
        bufferInfo.getClass();
        j(bufferInfo.presentationTimeUs, false);
    }

    public final void j(long j, boolean z) {
        this.k = null;
        MediaCodec mediaCodec = this.d;
        int i = this.m;
        try {
            if (z) {
                mediaCodec.releaseOutputBuffer(i, j * 1000);
                LinkedHashMap linkedHashMap = a61.a;
                synchronized (a61.class) {
                    try {
                        synchronized (a61.class) {
                        }
                    } finally {
                    }
                }
            } else {
                mediaCodec.releaseOutputBuffer(i, false);
            }
            this.m = -1;
        } catch (RuntimeException e) {
            kb0.r("DefaultCodec", "MediaCodec error", e);
            throw b(e);
        }
    }
}
