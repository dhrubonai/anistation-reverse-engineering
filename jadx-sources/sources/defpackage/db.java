package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.google.protobuf.CodedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class db {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ol6 b = ol6.A;
    public static final sm5 c;
    public static final float d;
    public static final sm5 e;
    public static final float f;
    public static final os0 g;
    public static final ci1 h;
    public static final be i;
    public static final aj5[] j;
    public static final ij5 k;
    public static final tk6 l;
    public static final tk6 m;
    public static final tk6 n;
    public static final tk6 o;
    public static final tk6 p;
    public static final tk6 q;
    public static final tk6 r;
    public static final tk6 s;
    public static final tk6 t;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, ci1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [ij5, java.lang.Object] */
    static {
        sm5 sm5Var = sm5.z;
        c = sm5Var;
        d = 16.0f;
        e = sm5Var;
        f = 6.0f;
        g = new os0(1634408285, false, new ps0((byte) 11));
        h = new Object();
        i = new be((byte) 17);
        j = new aj5[0];
        k = new Object();
        l = new tk6(new ka6((byte) 20), new dr6((byte) 7));
        m = new tk6(new ka6((byte) 21), new ka6((byte) 22));
        n = new tk6(new ka6((byte) 23), new ka6((byte) 24));
        o = new tk6(new ka6((byte) 25), new ka6((byte) 26));
        p = new tk6(new ka6((byte) 27), new ka6((byte) 28));
        q = new tk6(new ka6((byte) 29), new dr6((byte) 0));
        r = new tk6(new dr6((byte) 1), new dr6((byte) 2));
        s = new tk6(new dr6((byte) 3), new dr6((byte) 4));
        t = new tk6(new dr6((byte) 5), new dr6((byte) 6));
    }

    public static double A(double d2, double d3, double d4) {
        if (d3 <= d4) {
            if (d2 < d3) {
                return d3;
            }
            if (d2 > d4) {
                return d4;
            }
            return d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float B(float f2, float f3, float f4) {
        if (f3 <= f4) {
            if (f2 < f3) {
                return f3;
            }
            if (f2 > f4) {
                return f4;
            }
            return f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static int C(int i2, int i3, int i4) {
        if (i3 <= i4) {
            if (i2 < i3) {
                return i3;
            }
            if (i2 > i4) {
                return i4;
            }
            return i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static long D(long j2, long j3, long j4) {
        if (j3 <= j4) {
            if (j2 < j3) {
                return j3;
            }
            if (j2 > j4) {
                return j4;
            }
            return j2;
        }
        StringBuilder n2 = zo5.n(j4, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        n2.append(j3);
        n2.append('.');
        throw new IllegalArgumentException(n2.toString());
    }

    public static long E(long j2, pl3 pl3Var) {
        long j3 = pl3Var.y;
        long j4 = pl3Var.x;
        if (!pl3Var.isEmpty()) {
            if (j2 < Long.valueOf(j4).longValue()) {
                return Long.valueOf(j4).longValue();
            }
            if (j2 > Long.valueOf(j3).longValue()) {
                return Long.valueOf(j3).longValue();
            }
            return j2;
        }
        ov3.o(pl3Var, "Cannot coerce value to an empty range: ");
        return 0L;
    }

    public static Comparable F(vm1 vm1Var, vm1 vm1Var2, vm1 vm1Var3) {
        if (vm1Var2.compareTo(vm1Var3) <= 0) {
            if (vm1Var.compareTo(vm1Var2) < 0) {
                return vm1Var2;
            }
            if (vm1Var.compareTo(vm1Var3) > 0) {
                return vm1Var3;
            }
            return vm1Var;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + vm1Var3 + " is less than minimum " + vm1Var2 + '.');
    }

    public static Comparable G(Comparable comparable, do0 do0Var) {
        do0Var.getClass();
        float f2 = do0Var.b;
        float f3 = do0Var.a;
        if (!do0Var.a()) {
            if (do0.b(comparable, Float.valueOf(f3)) && !do0.b(Float.valueOf(f3), comparable)) {
                return Float.valueOf(f3);
            }
            if (do0.b(Float.valueOf(f2), comparable) && !do0.b(comparable, Float.valueOf(f2))) {
                return Float.valueOf(f2);
            }
            return comparable;
        }
        ov3.o(do0Var, "Cannot coerce value to an empty range: ");
        return null;
    }

    public static final aj5[] H(List list) {
        aj5[] aj5VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list != null && (aj5VarArr = (aj5[]) list.toArray(new aj5[0])) != null) {
            return aj5VarArr;
        }
        return j;
    }

    public static byte[] I(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final boolean J(View view, View view2) {
        if (!view2.equals(view)) {
            for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final Object K(ic2 ic2Var, vz0 vz0Var) {
        ec5 ec5Var = new ec5(vz0Var, vz0Var.getContext());
        return lz5.e(ec5Var, true, ec5Var, ic2Var);
    }

    public static final v11 L(kd2 kd2Var) {
        return new f25(kd2Var.R);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001f. Please report as an issue. */
    public static long M(long j2, long j3, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j4 = j2 / j3;
        long j5 = j2 - (j3 * j4);
        if (j5 == 0) {
            return j4;
        }
        boolean z = true;
        int i2 = ((int) ((j2 ^ j3) >> 63)) | 1;
        switch (fl3.a[roundingMode.ordinal()]) {
            case 1:
                if (j5 != 0) {
                    z = false;
                }
                a34.z(z);
                return j4;
            case 2:
                return j4;
            case 3:
                if (i2 >= 0) {
                    return j4;
                }
                return j4 + i2;
            case 4:
                return j4 + i2;
            case 5:
                if (i2 <= 0) {
                    return j4;
                }
                return j4 + i2;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j5);
                long abs2 = abs - (Math.abs(j3) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j4) == 0)) {
                        return j4;
                    }
                } else if (abs2 <= 0) {
                    return j4;
                }
                return j4 + i2;
            default:
                p65.o();
                return 0L;
        }
    }

    public static final float N(int i2, int i3, float[] fArr, float[] fArr2) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O(defpackage.bp1 r22, defpackage.di2 r23) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.O(bp1, di2):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r10 == r5) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0054, B:20:0x0069, B:22:0x0071, B:32:0x0045, B:35:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(defpackage.x42 r7, defpackage.vz4 r8, boolean r9, defpackage.vz0 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.b52
            if (r0 == 0) goto L13
            r0 = r10
            b52 r0 = (defpackage.b52) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            b52 r0 = new b52
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.B
            int r1 = r0.C
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            boolean r9 = r0.A
            ua0 r7 = r0.z
            vz4 r8 = r0.y
            x42 r1 = r0.x
            defpackage.m37.N(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r4
        L3d:
            boolean r9 = r0.A
            ua0 r7 = r0.z
            vz4 r8 = r0.y
            x42 r1 = r0.x
            defpackage.m37.N(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.m37.N(r10)
            boolean r10 = r7 instanceof defpackage.ue6
            if (r10 != 0) goto L96
            ua0 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.x = r7     // Catch: java.lang.Throwable -> L35
            r0.y = r8     // Catch: java.lang.Throwable -> L35
            r0.z = r10     // Catch: java.lang.Throwable -> L35
            r0.A = r9     // Catch: java.lang.Throwable -> L35
            r0.C = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.x = r1     // Catch: java.lang.Throwable -> L35
            r0.y = r8     // Catch: java.lang.Throwable -> L35
            r0.z = r7     // Catch: java.lang.Throwable -> L35
            r0.A = r9     // Catch: java.lang.Throwable -> L35
            r0.C = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.emit(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.l(r4)
        L8b:
            pn6 r7 = defpackage.pn6.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto L95
            defpackage.o80.p(r8, r7)
        L95:
            throw r10
        L96:
            ue6 r7 = (defpackage.ue6) r7
            java.lang.Throwable r7 = r7.x
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.P(x42, vz4, boolean, vz0):java.lang.Object");
    }

    public static final Integer Q(xr5 xr5Var, qu0 qu0Var, int i2, int i3) {
        Integer Q;
        od2 od2Var;
        Object obj;
        int[] iArr = xr5Var.b;
        while (true) {
            hd2 hd2Var = null;
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (xr5Var.j(i2) && xr5Var.i(i2) == 206 && a34.i(xr5Var.p(iArr, i2), eu0.e)) {
                Object h2 = xr5Var.h(i2, 0);
                if (h2 instanceof od2) {
                    od2Var = (od2) h2;
                } else {
                    od2Var = null;
                }
                if (od2Var != null) {
                    obj = od2Var.a;
                } else {
                    obj = null;
                }
                if (obj instanceof hd2) {
                    hd2Var = (hd2) obj;
                }
                if (hd2Var != null && hd2Var.x == qu0Var) {
                    return Integer.valueOf(i2);
                }
            }
            if (xr5Var.d(i2) && (Q = Q(xr5Var, qu0Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(Q.intValue());
            }
            i2 = i4;
        }
    }

    public static long R(long j2, long j3) {
        a34.t(j2, "a");
        a34.t(j3, "b");
        if (j2 == 0) {
            return j3;
        }
        if (j3 == 0) {
            return j2;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
        long j5 = j3 >> numberOfTrailingZeros2;
        while (j4 != j5) {
            long j6 = j4 - j5;
            long j7 = (j6 >> 63) & j6;
            long j8 = (j6 - j7) - j7;
            j5 += j7;
            j4 = j8 >> Long.numberOfTrailingZeros(j8);
        }
        return j4 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static final int V(yf5 yf5Var, byte b2, int i2, int i3) {
        if (i2 >= 0 && i2 < yf5Var.b()) {
            if (i2 <= i3 && i3 <= yf5Var.b()) {
                int i4 = yf5Var.b;
                byte[] bArr = yf5Var.a;
                while (i2 < i3) {
                    if (bArr[i4 + i2] == b2) {
                        return i2;
                    }
                    i2++;
                }
                return -1;
            }
            ze0.e(String.valueOf(i3));
            return 0;
        }
        ze0.e(String.valueOf(i2));
        return 0;
    }

    public static final boolean W(v11 v11Var) {
        h43 h43Var = (h43) v11Var.getCoroutineContext().get(h95.F);
        if (h43Var != null) {
            return h43Var.isActive();
        }
        return true;
    }

    public static boolean X(int i2) {
        if (i2 == 8 || i2 == 7) {
            return true;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 && (i2 == 26 || i2 == 27)) {
            return true;
        }
        if (i3 >= 33 && i2 == 30) {
            return true;
        }
        return false;
    }

    public static final boolean Y(long j2) {
        if (!cm6.a(j2, ep0.h)) {
            pp0 e2 = ep0.e(j2);
            if (!wk6.n(e2.b, 12884901888L)) {
                dz2.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(wk6.K(e2.b)));
            }
            x55 x55Var = ((b65) e2).p;
            double b2 = x55Var.b(ep0.g(j2));
            float b3 = (float) ((x55Var.b(ep0.d(j2)) * 0.0722d) + (x55Var.b(ep0.f(j2)) * 0.7152d) + (b2 * 0.2126d));
            if (b3 < 0.0f) {
                b3 = 0.0f;
            }
            if (b3 > 1.0f) {
                b3 = 1.0f;
            }
            if (b3 <= 0.5d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean Z(yf5 yf5Var) {
        yf5Var.getClass();
        if (yf5Var.b() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r21, defpackage.yz3 r22, final defpackage.ic2 r23, final defpackage.sb2 r24, long r25, long r27, defpackage.om5 r29, boolean r30, defpackage.kd2 r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.a(java.lang.String, yz3, ic2, sb2, long, long, om5, boolean, kd2, int, int):void");
    }

    public static final e73 a0(y73 y73Var) {
        y73Var.getClass();
        g73 c2 = y73Var.c();
        if (c2 instanceof e73) {
            return (e73) c2;
        }
        if (!(c2 instanceof yk6)) {
            ov3.f(c2, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + c2 + " from generic non-reified function. Such functionality cannot be supported because " + c2 + " is erased, either specify serializer explicitly or make calling function inline with reified " + c2 + '.');
    }

    public static final ke0 b(l11 l11Var) {
        if (l11Var.get(h95.F) == null) {
            l11Var = l11Var.plus(h98.e());
        }
        return new ke0(l11Var);
    }

    public static int b0(ByteBuffer byteBuffer) {
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            byte b2 = byteBuffer.get();
            i2 |= (b2 & Byte.MAX_VALUE) << (i3 * 7);
            if ((b2 & 128) == 0) {
                return i2;
            }
        }
        return i2;
    }

    public static final void c(Object obj, ub2 ub2Var, kd2 kd2Var) {
        boolean f2 = kd2Var.f(obj);
        Object Q = kd2Var.Q();
        if (f2 || Q == au0.a) {
            Q = new ai1(ub2Var);
            kd2Var.n0(Q);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c0(defpackage.ko4 r5, defpackage.q r6, defpackage.xz0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.to4
            if (r0 == 0) goto L13
            r0 = r7
            to4 r0 = (defpackage.to4) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            to4 r0 = new to4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.x
            int r1 = r0.y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L2e
            if (r1 == r2) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return
        L2a:
            defpackage.m37.N(r7)
            goto L72
        L2e:
            defpackage.m37.N(r7)
            defpackage.v71.e()
            return
        L35:
            defpackage.m37.N(r7)
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r1 = r5.J0()
            boolean r7 = defpackage.a34.i(r7, r1)
            if (r7 == 0) goto L4c
            r0.y = r3
            d0(r5, r6, r0)
            return
        L4c:
            android.os.Looper r7 = r5.J0()
            android.os.Handler r7 = android.os.Handler.createAsync(r7)
            r7.getClass()
            int r1 = defpackage.kj2.a
            jj2 r1 = new jj2
            r3 = 0
            r4 = 0
            r1.<init>(r7, r4, r3)
            e52 r7 = new e52
            r3 = 15
            r7.<init>(r5, r6, r4, r3)
            r0.y = r2
            java.lang.Object r5 = defpackage.tl7.V(r1, r7, r0)
            w11 r6 = defpackage.w11.x
            if (r5 != r6) goto L72
            return
        L72:
            defpackage.v71.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.c0(ko4, q, xz0):void");
    }

    public static final void d(Object obj, Object obj2, ub2 ub2Var, kd2 kd2Var) {
        boolean f2 = kd2Var.f(obj) | kd2Var.f(obj2);
        Object Q = kd2Var.Q();
        if (f2 || Q == au0.a) {
            Q = new ai1(ub2Var);
            kd2Var.n0(Q);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d0(defpackage.ko4 r7, defpackage.ic2 r8, defpackage.xz0 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.uo4
            if (r0 == 0) goto L13
            r0 = r9
            uo4 r0 = (defpackage.uo4) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            uo4 r0 = new uo4
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.A
            int r1 = r0.B
            r2 = 3
            r3 = 0
            java.lang.String r4 = "listener"
            r5 = 1
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L2b
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return
        L2b:
            w05 r7 = r0.z
            ko4 r8 = r0.x
            defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> L35
            r9 = r7
            r7 = r8
            goto L78
        L35:
            r9 = move-exception
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L84
        L3b:
            defpackage.m37.N(r9)
            w05 r9 = new w05
            r9.<init>()
            r0.x = r7     // Catch: java.lang.Throwable -> L7e
            r0.y = r8     // Catch: java.lang.Throwable -> L7e
            r0.z = r9     // Catch: java.lang.Throwable -> L7e
            r0.B = r5     // Catch: java.lang.Throwable -> L7e
            qg0 r1 = new qg0     // Catch: java.lang.Throwable -> L7e
            vz0 r0 = defpackage.wc7.z(r0)     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L7e
            r1.t()     // Catch: java.lang.Throwable -> L7e
            fp4 r0 = new fp4     // Catch: java.lang.Throwable -> L7e
            r0.<init>(r8, r1)     // Catch: java.lang.Throwable -> L7e
            r9.x = r0     // Catch: java.lang.Throwable -> L7e
            yd r8 = new yd     // Catch: java.lang.Throwable -> L7e
            r8.<init>(r9, r2)     // Catch: java.lang.Throwable -> L7e
            r1.v(r8)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r8 = r9.x     // Catch: java.lang.Throwable -> L7e
            if (r8 == 0) goto L80
            fp4 r8 = (defpackage.fp4) r8     // Catch: java.lang.Throwable -> L7e
            r7.v(r8)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r8 = r1.r()     // Catch: java.lang.Throwable -> L7e
            w11 r0 = defpackage.w11.x
            if (r8 != r0) goto L78
            return
        L78:
            er0 r8 = new er0     // Catch: java.lang.Throwable -> L7e
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L7e
            throw r8     // Catch: java.lang.Throwable -> L7e
        L7e:
            r8 = move-exception
            goto L84
        L80:
            defpackage.a34.s0(r4)     // Catch: java.lang.Throwable -> L7e
            throw r3     // Catch: java.lang.Throwable -> L7e
        L84:
            java.lang.Object r9 = r9.x
            if (r9 != 0) goto L8c
            defpackage.a34.s0(r4)
            throw r3
        L8c:
            fp4 r9 = (defpackage.fp4) r9
            r7.w0(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.d0(ko4, ic2, xz0):void");
    }

    public static final void e(Object[] objArr, ub2 ub2Var, kd2 kd2Var) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean d2 = kd2Var.d(copyOf.length);
        for (Object obj : copyOf) {
            d2 |= kd2Var.f(obj);
        }
        Object Q = kd2Var.Q();
        if (!d2 && Q != au0.a) {
            return;
        }
        kd2Var.n0(new ai1(ub2Var));
    }

    public static final int e0(vd3 vd3Var, boolean z) {
        int i2;
        int a2;
        if (z) {
            i2 = vd3Var.c();
            a2 = vd3Var.f();
        } else {
            i2 = vd3Var.i();
            a2 = vd3Var.a();
        }
        return a2 + i2;
    }

    public static final void f(ic2 ic2Var, kd2 kd2Var, Object obj) {
        l11 l11Var = kd2Var.R;
        boolean f2 = kd2Var.f(obj);
        Object Q = kd2Var.Q();
        if (f2 || Q == au0.a) {
            Q = new ba3(l11Var, ic2Var);
            kd2Var.n0(Q);
        }
    }

    public static final float f0(dm4 dm4Var, boolean z, yn2[] yn2VarArr, float f2) {
        boolean z2;
        float f3 = Float.NaN;
        for (yn2 yn2Var : yn2VarArr) {
            float a2 = dm4Var.a(yn2Var);
            if (!Float.isNaN(f3)) {
                if (a2 > f3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                }
            }
            f3 = a2;
        }
        if (Float.isNaN(f3)) {
            return f2;
        }
        return f3;
    }

    public static final void g(Object obj, Object obj2, ic2 ic2Var, kd2 kd2Var) {
        l11 l11Var = kd2Var.R;
        boolean f2 = kd2Var.f(obj) | kd2Var.f(obj2);
        Object Q = kd2Var.Q();
        if (f2 || Q == au0.a) {
            Q = new ba3(l11Var, ic2Var);
            kd2Var.n0(Q);
        }
    }

    public static final ke0 g0(v11 v11Var, l11 l11Var) {
        return new ke0(v11Var.getCoroutineContext().plus(l11Var));
    }

    public static final void h(Object obj, Object obj2, Object obj3, ic2 ic2Var, kd2 kd2Var) {
        l11 l11Var = kd2Var.R;
        boolean f2 = kd2Var.f(obj) | kd2Var.f(obj2) | kd2Var.f(obj3);
        Object Q = kd2Var.Q();
        if (f2 || Q == au0.a) {
            Q = new ba3(l11Var, ic2Var);
            kd2Var.n0(Q);
        }
    }

    public static final void h0(mv0 mv0Var, mv0 mv0Var2) {
        for (ou ouVar : yo0.I0(mv0Var2.c().keySet())) {
            ouVar.getClass();
            mv0Var.e(ouVar, mv0Var2.b(ouVar));
        }
    }

    public static final void i(Object[] objArr, ic2 ic2Var, kd2 kd2Var) {
        l11 l11Var = kd2Var.R;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean d2 = kd2Var.d(copyOf.length);
        for (Object obj : copyOf) {
            d2 |= kd2Var.f(obj);
        }
        Object Q = kd2Var.Q();
        if (!d2 && Q != au0.a) {
            return;
        }
        kd2Var.n0(new ba3(l11Var, ic2Var));
    }

    public static byte[] i0(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            } else {
                ze0.m(qx1.h(i2, "Not enough bytes to read: "));
                return null;
            }
        }
        return bArr;
    }

    public static final ke0 j() {
        q26 a2 = iv5.a();
        ja1 ja1Var = rh1.a;
        return new ke0(tl7.L(a2, qm3.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] j0(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.j0(java.io.FileInputStream, int, int):byte[]");
    }

    public static final void k(final sb2 sb2Var, final long j2, final sz3 sz3Var, final wj wjVar, final os0 os0Var, kd2 kd2Var, final int i2) {
        int i3;
        long j3;
        sz3 sz3Var2;
        boolean z;
        int i4;
        Object obj;
        ia3 ia3Var;
        int i5;
        byte b2;
        Object obj2;
        byte b3;
        byte b4;
        byte b5;
        int i6;
        boolean h2;
        int i7;
        int i8;
        int i9;
        int i10;
        kd2Var.f0(766784632);
        if ((i2 & 6) == 0) {
            if (kd2Var.h(sb2Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j2;
            if (kd2Var.e(j3)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        } else {
            j3 = j2;
        }
        if ((i2 & 384) == 0) {
            sz3Var2 = sz3Var;
            if (kd2Var.f(sz3Var2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        } else {
            sz3Var2 = sz3Var;
        }
        if ((i2 & 3072) == 0) {
            if ((i2 & CodedOutputStream.DEFAULT_BUFFER_SIZE) == 0) {
                h2 = kd2Var.f(wjVar);
            } else {
                h2 = kd2Var.h(wjVar);
            }
            if (h2) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (kd2Var.h(os0Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            View view = (View) kd2Var.j(eb.f);
            ud1 ud1Var = (ud1) kd2Var.j(bv0.h);
            ia3 ia3Var2 = (ia3) kd2Var.j(bv0.n);
            id2 O = h98.O(kd2Var);
            w44 h3 = xt5.h(os0Var, kd2Var);
            Object[] objArr = new Object[0];
            Object Q = kd2Var.Q();
            Object obj3 = au0.a;
            if (Q == obj3) {
                i4 = i3;
                Object t53Var = new t53((byte) 23);
                kd2Var.n0(t53Var);
                obj = t53Var;
            } else {
                i4 = i3;
                obj = Q;
            }
            UUID uuid = (UUID) oi4.B(objArr, (sb2) obj, kd2Var);
            Object Q2 = kd2Var.Q();
            Object obj4 = Q2;
            if (Q2 == obj3) {
                Object L = L(kd2Var);
                kd2Var.n0(L);
                obj4 = L;
            }
            v11 v11Var = (v11) obj4;
            boolean f2 = kd2Var.f(view) | kd2Var.f(ud1Var);
            Object Q3 = kd2Var.Q();
            if (!f2 && Q3 != obj3) {
                ia3Var = ia3Var2;
                i5 = i4;
                b2 = 1;
                obj2 = Q3;
            } else {
                ia3Var = ia3Var2;
                i5 = i4;
                b2 = 1;
                dz3 dz3Var = new dz3(sb2Var, sz3Var2, j3, view, ia3Var, ud1Var, uuid, wjVar, v11Var);
                os0 os0Var2 = new os0(-1051373467, true, new fa(h3, (byte) 2));
                az3 az3Var = dz3Var.F;
                az3Var.setParentCompositionContext(O);
                az3Var.H.setValue(os0Var2);
                az3Var.I = true;
                az3Var.d();
                kd2Var.n0(dz3Var);
                obj2 = dz3Var;
            }
            final dz3 dz3Var2 = (dz3) obj2;
            boolean h4 = kd2Var.h(dz3Var2);
            Object Q4 = kd2Var.Q();
            Object obj5 = Q4;
            if (h4 || Q4 == obj3) {
                Object pz3Var = new pz3(dz3Var2, b2);
                kd2Var.n0(pz3Var);
                obj5 = pz3Var;
            }
            c(dz3Var2, (ub2) obj5, kd2Var);
            boolean h5 = kd2Var.h(dz3Var2);
            int i11 = i5;
            if ((i11 & 14) == 4) {
                b3 = b2;
            } else {
                b3 = 0;
            }
            int i12 = (h5 ? 1 : 0) | b3;
            if ((i11 & 896) == 256) {
                b4 = b2;
            } else {
                b4 = 0;
            }
            int i13 = i12 | b4;
            if ((i11 & 112) == 32) {
                b5 = b2;
            } else {
                b5 = 0;
            }
            int i14 = i13 | b5 | (kd2Var.d(ia3Var.ordinal()) ? 1 : 0);
            Object Q5 = kd2Var.Q();
            Object obj6 = Q5;
            if (i14 != 0 || Q5 == obj3) {
                final ia3 ia3Var3 = ia3Var;
                Object obj7 = new sb2() { // from class: tz3
                    @Override // defpackage.sb2
                    public final Object invoke() {
                        dz3.this.d(sb2Var, sz3Var, j2, ia3Var3);
                        return pn6.a;
                    }
                };
                kd2Var.n0(obj7);
                obj6 = obj7;
            }
            m((sb2) obj6, kd2Var);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: uz3
                @Override // defpackage.ic2
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    db.k(sb2.this, j2, sz3Var, wjVar, os0Var, (kd2) obj8, kb0.N(i2 | 1));
                    return pn6.a;
                }
            };
        }
    }

    public static long k0(InputStream inputStream, int i2) {
        byte[] i0 = i0(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (i0[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final java.lang.String r23, final boolean r24, final defpackage.ub2 r25, defpackage.yz3 r26, defpackage.th4 r27, defpackage.om5 r28, long r29, long r31, boolean r33, defpackage.kd2 r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.l(java.lang.String, boolean, ub2, yz3, th4, om5, long, long, boolean, kd2, int, int):void");
    }

    public static long l0(long j2, long j3) {
        boolean z;
        boolean z2;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (numberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        long j4 = ((j2 ^ j3) >>> 63) + Long.MAX_VALUE;
        boolean z3 = false;
        if (numberOfLeadingZeros < 64) {
            z = true;
        } else {
            z = false;
        }
        if (j2 < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j3 == Long.MIN_VALUE) {
            z3 = true;
        }
        if (!(z | (z3 & z2))) {
            long j5 = j2 * j3;
            if (j2 == 0 || j5 / j2 == j3) {
                return j5;
            }
        }
        return j4;
    }

    public static final void m(sb2 sb2Var, kd2 kd2Var) {
        hg4 hg4Var = kd2Var.M.b.O;
        hg4Var.O(uf4.c);
        z51.K(hg4Var, 0, sb2Var);
    }

    public static final void m0(e73 e73Var) {
        String f2 = ((im0) e73Var).f();
        if (f2 == null) {
            f2 = "<local class name not available>";
        }
        throw new IllegalArgumentException(qx1.m("Serializer for class '", f2, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void n(yz3 yz3Var, ic2 ic2Var, boolean z, ub2 ub2Var, om5 om5Var, boolean z2, th4 th4Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        boolean z3;
        yz3 yz3Var2;
        om5 om5Var2;
        boolean z4;
        th4 th4Var2;
        om5 om5Var3;
        yz3 yz3Var3;
        int i5;
        th4 th4Var3;
        boolean z5;
        long j2;
        boolean z6;
        boolean z7;
        long j3;
        float f2;
        ub2Var.getClass();
        kd2Var.f0(2138600148);
        int i6 = i2 | 54;
        if (kd2Var.g(z)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i7 = i6 | i3;
        if (kd2Var.h(ub2Var)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i8 = i7 | i4 | 14221312;
        byte b2 = 0;
        if ((4793491 & i8) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i8 & 1, z3)) {
            kd2Var.a0();
            if ((i2 & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                yz3Var3 = yz3Var;
                om5Var3 = om5Var;
                z5 = z2;
                i5 = i8 & (-458753);
                th4Var3 = th4Var;
            } else {
                om5Var3 = tm5.b;
                vh4 vh4Var = new vh4(14.0f, 8.0f, 14.0f, 8.0f);
                yz3Var3 = vz3.x;
                i5 = i8 & (-458753);
                th4Var3 = vh4Var;
                z5 = true;
            }
            kd2Var.r();
            if (z) {
                kd2Var.e0(-2094579874);
                j2 = n03.r(kd2Var).n;
                kd2Var.q(false);
            } else {
                kd2Var.e0(-2094578400);
                j2 = n03.r(kd2Var).o;
                kd2Var.q(false);
            }
            if ((57344 & i5) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i5 & 7168) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z8 = z7 | z6;
            Object Q = kd2Var.Q();
            if (z8 || Q == au0.a) {
                Q = new ch((byte) 1, ub2Var, z);
                kd2Var.n0(Q);
            }
            sb2 sb2Var = (sb2) Q;
            long j4 = j2;
            yz3 yz3Var4 = yz3Var3;
            yz3 A = kb0.A(yz3Var4, z5, null, null, false, sb2Var, kd2Var, 54, 30);
            boolean z9 = z5;
            if (z) {
                kd2Var.e0(-2094571296);
                j3 = n03.r(kd2Var).o;
                kd2Var.q(false);
            } else {
                kd2Var.e0(-2094569637);
                j3 = n03.r(kd2Var).p;
                kd2Var.q(false);
            }
            long j5 = j3;
            if (!z9) {
                f2 = 0.6f;
            } else {
                f2 = 1.0f;
            }
            om5 om5Var4 = om5Var3;
            l36.a(A, om5Var4, j5, ep0.b(f2, j4), 0.0f, 0.0f, null, nx7.R(1807853529, new ih(th4Var3, ic2Var, b2), kd2Var), kd2Var, 12582912, 112);
            th4Var2 = th4Var3;
            om5Var2 = om5Var4;
            yz3Var2 = yz3Var4;
            z4 = z9;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
            om5Var2 = om5Var;
            z4 = z2;
            th4Var2 = th4Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new jh(yz3Var2, ic2Var, z, ub2Var, om5Var2, z4, th4Var2, i2);
        }
    }

    public static ArrayList n0(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            try {
                byte b2 = asReadOnlyBuffer.get();
                int i2 = (b2 >> 3) & 15;
                if (((b2 >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b2 >> 1) & 1) != 0) {
                    remaining = b0(asReadOnlyBuffer);
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                duplicate.limit(asReadOnlyBuffer.position());
                ByteBuffer duplicate2 = asReadOnlyBuffer.duplicate();
                duplicate2.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new qc4(i2, duplicate2));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static void o(oa0 oa0Var, CharSequence charSequence) {
        et5.m(oa0Var, charSequence, charSequence.length(), 8);
    }

    public static d13 o0(f13 f13Var, int i2) {
        boolean z;
        f13Var.getClass();
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (z) {
            int i3 = f13Var.x;
            int i4 = f13Var.y;
            if (f13Var.z <= 0) {
                i2 = -i2;
            }
            return new d13(i3, i4, i2);
        }
        ov3.o(valueOf, "Step must be positive, was: ");
        return null;
    }

    public static final m53 p(l61 l61Var) {
        m53 m53Var;
        l61Var.getClass();
        if (l61Var instanceof m53) {
            m53Var = (m53) l61Var;
        } else {
            m53Var = null;
        }
        if (m53Var != null) {
            return m53Var;
        }
        ze0.f(z05.a(l61Var.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Icon p0(androidx.core.graphics.drawable.IconCompat r5, android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.p0(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }

    public static final void q(wt1 wt1Var) {
        az5 az5Var;
        wt1Var.getClass();
        if (wt1Var instanceof az5) {
            az5Var = (az5) wt1Var;
        } else {
            az5Var = null;
        }
        if (az5Var != null) {
            return;
        }
        ze0.f(z05.a(wt1Var.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [qt0, sy4] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList q0(xr5 xr5Var, int i2, Integer num) {
        Object obj;
        ?? sy4Var = new sy4(xr5Var);
        int q2 = xr5Var.q(i2);
        ed2 a2 = xr5Var.a(i2);
        while (i2 >= 0) {
            if (xr5Var.k(i2)) {
                obj = xr5Var.p(xr5Var.b, i2);
            } else {
                obj = au0.a;
            }
            sy4Var.y(xr5Var.i(i2), obj, xr5Var.a.j(i2), num);
            if (q2 >= 0) {
                ed2 ed2Var = a2;
                a2 = xr5Var.a(q2);
                i2 = q2;
                q2 = xr5Var.q(q2);
                num = ed2Var;
            } else {
                i2 = q2;
                num = a2;
            }
        }
        return (ArrayList) sy4Var.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [qt0, sy4] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ed2] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List r(bs5 bs5Var, Integer num, int i2, Integer num2) {
        int i3;
        int i4;
        int r2;
        Object obj;
        int i5;
        f44 f44Var;
        if (!bs5Var.w && bs5Var.o() != 0) {
            ?? sy4Var = new sy4(bs5Var);
            if (num2 != null) {
                i3 = num2.intValue();
            } else {
                i3 = bs5Var.v;
                if (i3 < 0) {
                    i3 = bs5Var.F(bs5Var.b, i2);
                }
            }
            if (num == 0) {
                int O = bs5Var.i - bs5Var.O(bs5Var.b, bs5Var.q(i2));
                s34 s34Var = bs5Var.s;
                if (s34Var != null && (f44Var = (f44) s34Var.b(i2)) != null) {
                    i5 = f44Var.b;
                } else {
                    i5 = 0;
                }
                num = Integer.valueOf(O + i5);
            }
            int q2 = bs5Var.q(i2) * 5;
            int[] iArr = bs5Var.b;
            if (q2 < iArr.length) {
                r2 = bs5Var.r(i2);
            } else {
                if (i3 >= 0) {
                    i4 = bs5Var.F(iArr, i3);
                } else {
                    i4 = i3;
                }
                r2 = bs5Var.r(i3);
                int i6 = i3;
                i3 = i4;
                i2 = i6;
            }
            while (i2 >= 0) {
                if ((bs5Var.b[(bs5Var.q(i2) * 5) + 1] & 536870912) != 0) {
                    obj = bs5Var.s(i2);
                } else {
                    obj = au0.a;
                }
                sy4Var.y(r2, obj, bs5Var.P(i2), num);
                num = bs5Var.b(i2);
                if (i3 >= 0) {
                    int F = bs5Var.F(bs5Var.b, i3);
                    r2 = bs5Var.r(i3);
                    int i7 = i3;
                    i3 = F;
                    i2 = i7;
                } else {
                    i2 = i3;
                }
            }
            return (ArrayList) sy4Var.x;
        }
        return nt1.x;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d13, f13] */
    public static f13 r0(int i2, int i3) {
        if (i3 <= Integer.MIN_VALUE) {
            f13 f13Var = f13.A;
            return f13.A;
        }
        return new d13(i2, i3 - 1, 1);
    }

    public static final Set s(aj5 aj5Var) {
        aj5Var.getClass();
        if (aj5Var instanceof kf0) {
            return ((kf0) aj5Var).b();
        }
        HashSet hashSet = new HashSet(aj5Var.e());
        int e2 = aj5Var.e();
        for (int i2 = 0; i2 < e2; i2++) {
            hashSet.add(aj5Var.f(i2));
        }
        return hashSet;
    }

    public static final List s0(int i2, int i3, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return nt1.x;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            vd3 vd3Var = (vd3) arrayList.get(i4);
            int index = vd3Var.getIndex();
            if (i2 <= index && index <= i3) {
                arrayList2.add(vd3Var);
            }
        }
        cp0.X(arrayList2, i);
        return arrayList2;
    }

    public static final void t(v11 v11Var, CancellationException cancellationException) {
        h43 h43Var = (h43) v11Var.getCoroutineContext().get(h95.F);
        if (h43Var != null) {
            h43Var.l(cancellationException);
        } else {
            v71.g(v11Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t0(defpackage.l11 r5, java.lang.Object r6, java.lang.Object r7, defpackage.ic2 r8, defpackage.vz0 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.qj0
            if (r0 == 0) goto L13
            r0 = r9
            qj0 r0 = (defpackage.qj0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            qj0 r0 = new qj0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.A
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.z
            l11 r6 = r0.y
            defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> L2b
            r7 = r5
            r5 = r6
            goto L64
        L2b:
            r7 = move-exception
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L68
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L38:
            defpackage.m37.N(r9)
            java.lang.Object r7 = defpackage.ke6.c(r5, r7)
            r0.x = r6     // Catch: java.lang.Throwable -> L54
            r0.y = r5     // Catch: java.lang.Throwable -> L54
            r0.z = r7     // Catch: java.lang.Throwable -> L54
            r0.B = r2     // Catch: java.lang.Throwable -> L54
            yw5 r9 = new yw5     // Catch: java.lang.Throwable -> L54
            r9.<init>(r0, r5)     // Catch: java.lang.Throwable -> L54
            if (r8 != 0) goto L56
            java.lang.Object r6 = defpackage.wc7.X(r8, r6, r9)     // Catch: java.lang.Throwable -> L54
        L52:
            r9 = r6
            goto L5f
        L54:
            r6 = move-exception
            goto L68
        L56:
            r0 = 2
            defpackage.wk6.j(r0, r8)     // Catch: java.lang.Throwable -> L54
            java.lang.Object r6 = r8.invoke(r6, r9)     // Catch: java.lang.Throwable -> L54
            goto L52
        L5f:
            w11 r6 = defpackage.w11.x
            if (r9 != r6) goto L64
            return r6
        L64:
            defpackage.ke6.a(r5, r7)
            return r9
        L68:
            defpackage.ke6.a(r5, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.t0(l11, java.lang.Object, java.lang.Object, ic2, vz0):java.lang.Object");
    }

    public static void u(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            ze0.k(zo5.m("startIndex: ", " > endIndex: ", i2, i3));
            return;
        }
        p65.k(qx1.u("startIndex: ", i2, ", endIndex: ", i3, ", size: "), i4);
    }

    public static final void u0(qq5 qq5Var, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        ((oa0) qq5Var).write(bArr, i2, i3 + i2);
    }

    public static void v(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            ze0.k(zo5.m("fromIndex: ", " > toIndex: ", i2, i3));
            return;
        }
        p65.k(qx1.u("fromIndex: ", i2, ", toIndex: ", i3, ", size: "), i4);
    }

    public static long w(long j2, long j3) {
        boolean z;
        long j4 = j2 + j3;
        boolean z2 = false;
        if ((j2 ^ j3) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j2 ^ j4) >= 0) {
            z2 = true;
        }
        if (z | z2) {
            return j4;
        }
        throw new ArithmeticException(qx1.k(j3, ")", zo5.n(j2, "overflow: checkedAdd(", ", ")));
    }

    public static final void w0(qq5 qq5Var, cv5 cv5Var) {
        qq5Var.getClass();
        cv5Var.getClass();
        ((oa0) qq5Var).G(cv5Var);
    }

    public static float x(float f2, float f3) {
        if (f2 < f3) {
            return f3;
        }
        return f2;
    }

    public static void x0(OutputStream outputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static Comparable y(vm1 vm1Var, vm1 vm1Var2) {
        if (vm1Var.compareTo(vm1Var2) < 0) {
            return vm1Var2;
        }
        return vm1Var;
    }

    public static void y0(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        x0(byteArrayOutputStream, i2, 2);
    }

    public static Comparable z(vm1 vm1Var, vm1 vm1Var2) {
        if (vm1Var.compareTo(vm1Var2) > 0) {
            return vm1Var2;
        }
        return vm1Var;
    }

    public Object S(int i2) {
        g23 i3 = T().i(i2);
        return i3.c.getType().invoke(Integer.valueOf(i2 - i3.a));
    }

    public abstract eb2 T();

    public Object U(int i2) {
        Object invoke;
        g23 i3 = T().i(i2);
        int i4 = i2 - i3.a;
        ub2 key = i3.c.getKey();
        if (key != null && (invoke = key.invoke(Integer.valueOf(i4))) != null) {
            return invoke;
        }
        return new l91(i2);
    }
}
