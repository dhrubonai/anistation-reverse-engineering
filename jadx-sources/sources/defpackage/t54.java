package defpackage;

import android.util.SparseArray;
import com.unity3d.services.core.device.MimeTypes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t54 {
    public static final long t = eq6.U(500);
    public final String a;
    public final cn7 b;
    public final r54 c;
    public final SparseArray d;
    public final ea2 e;
    public boolean f;
    public boolean g;
    public int h;
    public long i;
    public long j;
    public long k;
    public o54 l;
    public byte m;
    public boolean n;
    public boolean o;
    public long p;
    public long q;
    public volatile int r;
    public volatile int s;

    /* JADX WARN: Multi-variable type inference failed */
    public t54(String str, cn7 cn7Var, r54 r54Var, int i, ea2 ea2Var) {
        boolean z;
        this.a = str;
        this.b = cn7Var;
        this.c = r54Var;
        boolean z2 = false;
        if (i != 0 && i != 1) {
            z = false;
        } else {
            z = true;
        }
        io3.n(z);
        this.m = i;
        if ((i == 0 && ea2Var == null) || (i == 1 && ea2Var != null)) {
            z2 = true;
        }
        io3.m("appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.", z2);
        this.e = ea2Var;
        this.d = new SparseArray();
        this.h = -2;
        this.p = -9223372036854775807L;
        this.j = Long.MAX_VALUE;
    }

    public static s54 c(SparseArray sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        s54 s54Var = (s54) sparseArray.valueAt(0);
        for (int i = 1; i < sparseArray.size(); i++) {
            s54 s54Var2 = (s54) sparseArray.valueAt(i);
            if (s54Var2.f < s54Var.f) {
                s54Var = s54Var2;
            }
        }
        return s54Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ea2 ea2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        String str = ea2Var.p;
        int h = qy3.h(str);
        int i2 = 0;
        boolean z5 = false;
        boolean z6 = false;
        if (h != 1 && h != 2) {
            z = false;
        } else {
            z = true;
        }
        io3.p(z, "Unsupported track format: %s", str);
        if (h == 2) {
            da2 a = ea2Var.a();
            a.B = (ea2Var.C + this.r) % 360;
            ea2Var = new ea2(a);
            if (this.m == 1) {
                ea2 ea2Var2 = this.e;
                ea2Var2.getClass();
                boolean c = ea2Var.c(ea2Var2);
                List list = ea2Var.s;
                List list2 = ea2Var2.s;
                if (!c) {
                    if (Objects.equals(ea2Var2.p, MimeTypes.VIDEO_H264) && Objects.equals(ea2Var.p, MimeTypes.VIDEO_H264) && list2.size() == 2 && list.size() == 2 && Arrays.equals((byte[]) list2.get(1), (byte[]) list.get(1))) {
                        byte[] bArr = (byte[]) list2.get(0);
                        byte[] bArr2 = (byte[]) list.get(0);
                        if (7 < bArr.length && bArr.length == bArr2.length) {
                            int i3 = 0;
                            while (true) {
                                if (i3 < bArr.length) {
                                    if (i3 != 7 && bArr[i3] != bArr2[i3]) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                } else {
                                    int i4 = 0;
                                    while (true) {
                                        byte[] bArr3 = io3.d;
                                        if (i4 < 4) {
                                            if (bArr[i4] != bArr3[i4]) {
                                                break;
                                            } else {
                                                i4++;
                                            }
                                        } else if ((bArr[4] & 31) == 7 && bArr[5] != 0) {
                                            if (bArr2[7] < bArr[7]) {
                                                list = list2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    list = null;
                }
                if (list != null) {
                    da2 a2 = ea2Var.a();
                    a2.r = list;
                    ea2Var = new ea2(a2);
                } else {
                    throw new Exception("Switching to MUXER_MODE_APPEND will fail.");
                }
            }
        }
        if (this.m == 2) {
            if (h == 2) {
                if (this.d.indexOfKey(2) >= 0) {
                    z5 = true;
                }
                io3.B(z5);
                ea2 ea2Var3 = ((s54) this.d.get(2)).a;
                if (Objects.equals(ea2Var3.p, ea2Var.p)) {
                    if (ea2Var3.w == ea2Var.w) {
                        if (ea2Var3.x == ea2Var.x) {
                            if (ea2Var3.C == ea2Var.C) {
                                ea2 ea2Var4 = this.e;
                                ea2Var4.getClass();
                                if (!ea2Var.c(ea2Var4)) {
                                    throw new Exception("The initialization data of the newly added track format doesn't match appendVideoFormat.");
                                }
                                return;
                            }
                            throw new Exception("Video format mismatch - rotationDegrees: " + ea2Var3.C + " != " + ea2Var.C);
                        }
                        throw new Exception("Video format mismatch - height: " + ea2Var3.x + " != " + ea2Var.x);
                    }
                    throw new Exception("Video format mismatch - width: " + ea2Var3.w + " != " + ea2Var.w);
                }
                throw new Exception("Video format mismatch - sampleMimeType: " + ea2Var3.p + " != " + ea2Var.p);
            }
            if (h == 1) {
                if (this.d.indexOfKey(1) >= 0) {
                    z6 = true;
                }
                io3.B(z6);
                ea2 ea2Var5 = ((s54) this.d.get(1)).a;
                if (Objects.equals(ea2Var5.p, ea2Var.p)) {
                    if (ea2Var5.J == ea2Var.J) {
                        if (ea2Var5.L == ea2Var.L) {
                            if (!ea2Var5.c(ea2Var)) {
                                throw new Exception("Audio format mismatch - initializationData.");
                            }
                            return;
                        }
                        throw new Exception("Audio format mismatch - sampleRate: " + ea2Var5.L + " != " + ea2Var.L);
                    }
                    throw new Exception("Audio format mismatch - channelCount: " + ea2Var5.J + " != " + ea2Var.J);
                }
                throw new Exception("Audio format mismatch - sampleMimeType: " + ea2Var5.p + " != " + ea2Var.p);
            }
            return;
        }
        int i5 = this.s;
        if (i5 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.A("The track count should be set before the formats are added.", z2);
        if (this.d.size() < i5) {
            z3 = true;
        } else {
            z3 = false;
        }
        io3.A("All track formats have already been added.", z3);
        if (this.d.indexOfKey(h) >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        io3.z(h, "There is already a track of type %s", !z4);
        o54 o54Var = this.l;
        if (o54Var == null) {
            cn7 cn7Var = this.b;
            String str2 = this.a;
            Object obj = cn7Var.x;
            try {
                z91 z91Var = new z91(new mx2(new x14(new f22(new FileOutputStream(str2)))));
                this.l = z91Var;
                o54Var = z91Var;
            } catch (FileNotFoundException e) {
                throw new Exception("Error creating file output stream", e);
            }
        }
        s54 s54Var = new s54(o54Var.n0(ea2Var), ea2Var);
        if (h == 1 && (i = ea2Var.N) > 0) {
            this.q = eq6.e0(i, 1000000L, ea2Var.L, RoundingMode.FLOOR);
        }
        this.d.put(h, s54Var);
        eq6.J(h);
        LinkedHashMap linkedHashMap = a61.a;
        synchronized (a61.class) {
        }
        if (ea2Var.m != null) {
            while (true) {
                ey3[] ey3VarArr = ea2Var.m.a;
                if (i2 >= ey3VarArr.length) {
                    break;
                }
                this.l.N(ey3VarArr[i2]);
                i2++;
            }
        }
        if (this.d.size() == i5) {
            this.f = true;
        }
    }

    public final void b(int i) {
        if (i != 0 || this.m != 1) {
            this.f = false;
            o54 o54Var = this.l;
            if (o54Var != null) {
                try {
                    o54Var.close();
                } catch (p54 e) {
                    if (i == 1) {
                        String message = e.getMessage();
                        message.getClass();
                        if (message.equals("Failed to stop the MediaMuxer")) {
                            return;
                        }
                    }
                    throw e;
                }
            }
            if (i == 0) {
                long length = new File(this.a).length();
                if (length <= 0) {
                    length = -1;
                }
                this.c.d(length);
            }
        }
    }

    public final boolean d(String str) {
        return ((lx2) this.b.x).a(qy3.h(str)).contains(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0049, code lost:
    
        if (defpackage.qy3.h(r6.a.p) == r14) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0061, code lost:
    
        if ((r0 - r13.i) <= r8) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r14, java.nio.ByteBuffer r15, boolean r16, long r17) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t54.e(int, java.nio.ByteBuffer, boolean, long):boolean");
    }
}
