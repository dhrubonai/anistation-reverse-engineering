package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.view.View;
import com.anistation.android.R;
import com.anistation.model.settings.SubtitleArgbColor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.annotation.Annotation;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class z51 {
    public static final b3 a = new b3(4);
    public static final f61 b = new f61(new i18(5));
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final os0 g = new os0(1258147541, false, new ps0(15));
    public static final float h = 3.0f;
    public static final byte[] i = {112, 114, 111, 0};
    public static final byte[] j = {112, 114, 109, 0};
    public static final np0 k = np0.z;
    public static final np0 l = np0.A;
    public static final sm5 m = sm5.y;
    public static final np0 n;
    public static final np0 o;
    public static final dr6 p;
    public static final dr6 q;
    public static final int r = 9;
    public static final int s = 10;
    public static final int t = 12;

    static {
        np0 np0Var = np0.y;
        n = np0Var;
        o = np0Var;
        p = new dr6((byte) 22);
        q = new dr6((byte) 23);
    }

    public static bw0 A(kk0 kk0Var) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        bw0 bw0Var = null;
        if (kk0Var == null) {
            return null;
        }
        byte b2 = 3;
        List r2 = cn7.r(bw0.f, kk0Var, 0, 0, new st0(b2), 6);
        if (r2.size() == 1) {
            return (bw0) ((ai4) r2.get(0)).y;
        }
        int length = kk0Var.length();
        ArrayList arrayList = null;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            while (true) {
                char charAt = kk0Var.charAt(i3);
                if (charAt != ' ' && charAt != ',') {
                    i4 = i3;
                    i2 = i4;
                    break;
                }
                i3++;
                if (i3 >= length) {
                    i2 = i3;
                    break;
                }
            }
            while (i2 < length) {
                char charAt2 = kk0Var.charAt(i2);
                if (charAt2 == ' ' || charAt2 == ',') {
                    break;
                }
                i2++;
            }
            ai4 ai4Var = (ai4) yo0.A0(bw0.f.q(kk0Var, i4, i2, true, new st0(b2)));
            if (ai4Var == null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kk0Var.subSequence(i4, i2).toString());
            } else {
                Object obj = ai4Var.y;
                if (bw0Var == null) {
                    bw0Var = (bw0) obj;
                } else {
                    if (!bw0Var.a && !((bw0) obj).a) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!bw0Var.b && !((bw0) obj).b) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!bw0Var.c && !((bw0) obj).c) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    i3 = i2;
                    bw0Var = new bw0(z, z2, z3, nt1.x);
                }
            }
            i3 = i2;
        }
        if (bw0Var == null) {
            bw0Var = bw0.e;
        }
        if (arrayList == null) {
            return bw0Var;
        }
        return new bw0(bw0Var.a, bw0Var.b, bw0Var.c, arrayList);
    }

    public static final int B(String str) {
        if (b06.C(str, "Original", true)) {
            return Integer.MAX_VALUE;
        }
        Integer J = b06.J(10, uz5.d0(str, "p"));
        if (J != null) {
            return J.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public static int[] C(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) db.k0(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, u05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(defpackage.ae0 r7, java.nio.channels.ReadableByteChannel r8, defpackage.xz0 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ne0
            if (r0 == 0) goto L13
            r0 = r9
            ne0 r0 = (defpackage.ne0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ne0 r0 = new ne0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            u05 r7 = r0.x
            defpackage.m37.N(r9)
            goto L9c
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            r7 = 0
            return r7
        L2f:
            defpackage.m37.N(r9)
            u05 r9 = new u05
            r9.<init>()
            r0.x = r9
            r0.z = r2
            qq5 r1 = r7.e()
            oa0 r1 = (defpackage.oa0) r1
            r1.getClass()
            yf5 r3 = r1.T(r2)
            byte[] r4 = r3.a
            int r5 = r3.c
            int r6 = r4.length
            int r6 = r6 - r5
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4, r5, r6)
            r4.getClass()
            int r8 = r8.read(r4)
            r9.x = r8
            int r8 = r4.position()
            int r8 = r8 - r5
            if (r8 != r2) goto L6e
            int r2 = r3.c
            int r2 = r2 + r8
            r3.c = r2
            long r2 = r1.z
            long r4 = (long) r8
            long r2 = r2 + r4
            r1.z = r2
            goto L8d
        L6e:
            if (r8 < 0) goto La4
            int r2 = r3.a()
            if (r8 > r2) goto La4
            if (r8 == 0) goto L84
            int r2 = r3.c
            int r2 = r2 + r8
            r3.c = r2
            long r2 = r1.z
            long r4 = (long) r8
            long r2 = r2 + r4
            r1.z = r2
            goto L8d
        L84:
            boolean r8 = defpackage.db.Z(r3)
            if (r8 == 0) goto L8d
            r1.t()
        L8d:
            java.lang.Object r7 = r7.d(r0)
            w11 r8 = defpackage.w11.x
            if (r7 != r8) goto L96
            goto L98
        L96:
            pn6 r7 = defpackage.pn6.a
        L98:
            if (r7 != r8) goto L9b
            return r8
        L9b:
            r7 = r9
        L9c:
            int r7 = r7.x
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        La4:
            java.lang.String r7 = "Invalid number of bytes written: "
            java.lang.String r9 = ". Should be in 0.."
            java.lang.StringBuilder r7 = defpackage.qx1.s(r8, r7, r9)
            int r8 = r3.a()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z51.D(ae0, java.nio.channels.ReadableByteChannel, xz0):java.lang.Object");
    }

    public static uf1[] E(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, uf1[] uf1VarArr) {
        byte[] bArr3 = n03.s;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(n03.n, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int k0 = (int) db.k0(fileInputStream, 1);
                    byte[] j0 = db.j0(fileInputStream, (int) db.k0(fileInputStream, 4), (int) db.k0(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(j0);
                        try {
                            uf1[] F = F(byteArrayInputStream, k0, uf1VarArr);
                            byteArrayInputStream.close();
                            return F;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    ze0.m("Content found after the end of file");
                    return null;
                }
                ze0.m("Unsupported meta version");
                return null;
            }
            ze0.m("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (Arrays.equals(bArr, n03.t)) {
            int k02 = (int) db.k0(fileInputStream, 2);
            byte[] j02 = db.j0(fileInputStream, (int) db.k0(fileInputStream, 4), (int) db.k0(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(j02);
                try {
                    uf1[] G = G(byteArrayInputStream2, bArr2, k02, uf1VarArr);
                    byteArrayInputStream2.close();
                    return G;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            ze0.m("Content found after the end of file");
            return null;
        }
        ze0.m("Unsupported meta version");
        return null;
    }

    public static uf1[] F(ByteArrayInputStream byteArrayInputStream, int i2, uf1[] uf1VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new uf1[0];
        }
        if (i2 == uf1VarArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int k0 = (int) db.k0(byteArrayInputStream, 2);
                iArr[i3] = (int) db.k0(byteArrayInputStream, 2);
                strArr[i3] = new String(db.i0(byteArrayInputStream, k0), StandardCharsets.UTF_8);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                uf1 uf1Var = uf1VarArr[i4];
                if (uf1Var.b.equals(strArr[i4])) {
                    int i5 = iArr[i4];
                    uf1Var.e = i5;
                    uf1Var.h = C(byteArrayInputStream, i5);
                } else {
                    ze0.m("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return uf1VarArr;
        }
        ze0.m("Mismatched number of dex files found in metadata");
        return null;
    }

    public static uf1[] G(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, uf1[] uf1VarArr) {
        String str;
        uf1 uf1Var;
        if (byteArrayInputStream.available() == 0) {
            return new uf1[0];
        }
        if (i2 == uf1VarArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                db.k0(byteArrayInputStream, 2);
                String str2 = new String(db.i0(byteArrayInputStream, (int) db.k0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long k0 = db.k0(byteArrayInputStream, 4);
                int k02 = (int) db.k0(byteArrayInputStream, 2);
                if (uf1VarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i4 = 0; i4 < uf1VarArr.length; i4++) {
                        if (uf1VarArr[i4].b.equals(str)) {
                            uf1Var = uf1VarArr[i4];
                            break;
                        }
                    }
                }
                uf1Var = null;
                if (uf1Var != null) {
                    uf1Var.d = k0;
                    int[] C = C(byteArrayInputStream, k02);
                    if (Arrays.equals(bArr, n03.r)) {
                        uf1Var.e = k02;
                        uf1Var.h = C;
                    }
                } else {
                    ze0.m("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return uf1VarArr;
        }
        ze0.m("Mismatched number of dex files found in metadata");
        return null;
    }

    public static uf1[] H(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, n03.o)) {
            int k0 = (int) db.k0(fileInputStream, 1);
            byte[] j0 = db.j0(fileInputStream, (int) db.k0(fileInputStream, 4), (int) db.k0(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(j0);
                try {
                    uf1[] I = I(byteArrayInputStream, str, k0);
                    byteArrayInputStream.close();
                    return I;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            ze0.m("Content found after the end of file");
            return null;
        }
        ze0.m("Unsupported version");
        return null;
    }

    public static uf1[] I(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3;
        int i4 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new uf1[0];
        }
        uf1[] uf1VarArr = new uf1[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            int k0 = (int) db.k0(byteArrayInputStream, 2);
            int k02 = (int) db.k0(byteArrayInputStream, 2);
            uf1VarArr[i5] = new uf1(str, new String(db.i0(byteArrayInputStream, k0), StandardCharsets.UTF_8), db.k0(byteArrayInputStream, 4), k02, (int) db.k0(byteArrayInputStream, 4), (int) db.k0(byteArrayInputStream, 4), new int[k02], new TreeMap());
        }
        int i6 = 0;
        while (i6 < i2) {
            uf1 uf1Var = uf1VarArr[i6];
            int available = byteArrayInputStream.available();
            int i7 = uf1Var.f;
            int i8 = uf1Var.g;
            TreeMap treeMap = uf1Var.i;
            int i9 = available - i7;
            int i10 = i4;
            while (byteArrayInputStream.available() > i9) {
                i10 += (int) db.k0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i10), 1);
                int k03 = (int) db.k0(byteArrayInputStream, 2);
                while (k03 > 0) {
                    db.k0(byteArrayInputStream, 2);
                    int k04 = (int) db.k0(byteArrayInputStream, 1);
                    if (k04 != 6 && k04 != 7) {
                        while (k04 > 0) {
                            db.k0(byteArrayInputStream, 1);
                            int i11 = i4;
                            int i12 = i6;
                            for (int k05 = (int) db.k0(byteArrayInputStream, 1); k05 > 0; k05--) {
                                db.k0(byteArrayInputStream, 2);
                            }
                            k04--;
                            i4 = i11;
                            i6 = i12;
                        }
                    }
                    k03--;
                    i4 = i4;
                    i6 = i6;
                }
            }
            int i13 = i4;
            int i14 = i6;
            if (byteArrayInputStream.available() == i9) {
                uf1Var.h = C(byteArrayInputStream, uf1Var.e);
                BitSet valueOf = BitSet.valueOf(db.i0(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
                for (int i15 = i13; i15 < i8; i15++) {
                    if (valueOf.get(i15)) {
                        i3 = 2;
                    } else {
                        i3 = i13;
                    }
                    if (valueOf.get(i15 + i8)) {
                        i3 |= 4;
                    }
                    if (i3 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = Integer.valueOf(i13);
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i3 | num.intValue()));
                    }
                }
                i6 = i14 + 1;
                i4 = i13;
            } else {
                ze0.m("Read too much data during profile line parse");
                return null;
            }
        }
        return uf1VarArr;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J(defpackage.sb2 r4, defpackage.ic2 r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.f8
            if (r0 == 0) goto L13
            r0 = r6
            f8 r0 = (defpackage.f8) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            f8 r0 = new f8
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r6)     // Catch: defpackage.v7 -> L3f
            goto L3f
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2c:
            defpackage.m37.N(r6)
            k8 r6 = new k8     // Catch: defpackage.v7 -> L3f
            r6.<init>(r4, r5, r2, r3)     // Catch: defpackage.v7 -> L3f
            r0.y = r3     // Catch: defpackage.v7 -> L3f
            java.lang.Object r4 = defpackage.db.K(r6, r0)     // Catch: defpackage.v7 -> L3f
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L3f
            return r5
        L3f:
            pn6 r4 = defpackage.pn6.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z51.J(sb2, ic2, xz0):java.lang.Object");
    }

    public static final void K(hg4 hg4Var, int i2, Object obj) {
        hg4Var.C[(hg4Var.D - hg4Var.y[hg4Var.z - 1].b) + i2] = obj;
    }

    public static final void L(hg4 hg4Var, int i2, Object obj, int i3, Object obj2) {
        int i4 = hg4Var.D - hg4Var.y[hg4Var.z - 1].b;
        Object[] objArr = hg4Var.C;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    public static final void M(hg4 hg4Var, Object obj, Object obj2, Object obj3) {
        int i2 = hg4Var.D - hg4Var.y[hg4Var.z - 1].b;
        Object[] objArr = hg4Var.C;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        objArr[i2 + 2] = obj3;
    }

    public static String N(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (!str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (!str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -207262728:
                if (!str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (!str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (!str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (!str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (!str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (!str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (!str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return null;
                }
                return "Companion";
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static tw5 O(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new tw5(f2, f3, obj);
    }

    public static final BlendMode P(int i2) {
        if (i2 == 0) {
            return BlendMode.CLEAR;
        }
        if (i2 == 1) {
            return BlendMode.SRC;
        }
        if (i2 == 2) {
            return BlendMode.DST;
        }
        if (i2 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i2 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i2 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i2 == 6) {
            return BlendMode.DST_IN;
        }
        if (i2 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i2 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i2 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i2 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i2 == 11) {
            return BlendMode.XOR;
        }
        if (i2 == 12) {
            return BlendMode.PLUS;
        }
        if (i2 == 13) {
            return BlendMode.MODULATE;
        }
        if (i2 == 14) {
            return BlendMode.SCREEN;
        }
        if (i2 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i2 == 16) {
            return BlendMode.DARKEN;
        }
        if (i2 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i2 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i2 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i2 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i2 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i2 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i2 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i2 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i2 == 25) {
            return BlendMode.HUE;
        }
        if (i2 == 26) {
            return BlendMode.SATURATION;
        }
        if (i2 == 27) {
            return BlendMode.COLOR;
        }
        if (i2 == 28) {
            return BlendMode.LUMINOSITY;
        }
        return BlendMode.SRC_OVER;
    }

    public static final Rect Q(g13 g13Var) {
        return new Rect(g13Var.a, g13Var.b, g13Var.c, g13Var.d);
    }

    public static final RectF R(n05 n05Var) {
        return new RectF(n05Var.a, n05Var.b, n05Var.c, n05Var.d);
    }

    public static final n05 S(RectF rectF) {
        return new n05(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final String T(vz0 vz0Var) {
        Object y45Var;
        if (vz0Var instanceof jh1) {
            return ((jh1) vz0Var).toString();
        }
        try {
            y45Var = vz0Var + '@' + t(vz0Var);
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (z45.b(y45Var) != null) {
            y45Var = vz0Var.getClass().getName() + '@' + t(vz0Var);
        }
        return (String) y45Var;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean U(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, uf1[] uf1VarArr) {
        int i2;
        int i3;
        int length;
        byte[] bArr2 = n03.r;
        byte[] bArr3 = n03.q;
        byte[] bArr4 = n03.n;
        int i4 = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                db.y0(byteArrayOutputStream2, uf1VarArr.length);
                int i5 = 2;
                int i6 = 2;
                for (uf1 uf1Var : uf1VarArr) {
                    db.x0(byteArrayOutputStream2, uf1Var.c, 4);
                    db.x0(byteArrayOutputStream2, uf1Var.d, 4);
                    db.x0(byteArrayOutputStream2, uf1Var.g, 4);
                    String q2 = q(uf1Var.a, uf1Var.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = q2.getBytes(charset).length;
                    db.y0(byteArrayOutputStream2, length2);
                    i6 = i6 + 14 + length2;
                    byteArrayOutputStream2.write(q2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i6 == byteArray.length) {
                    h97 h97Var = new h97(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList.add(h97Var);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < uf1VarArr.length) {
                        try {
                            uf1 uf1Var2 = uf1VarArr[i7];
                            db.y0(byteArrayOutputStream3, i7);
                            db.y0(byteArrayOutputStream3, uf1Var2.e);
                            i8 = i8 + 4 + (uf1Var2.e * i5);
                            int[] iArr = uf1Var2.h;
                            int length3 = iArr.length;
                            int i9 = i4;
                            while (i4 < length3) {
                                int i10 = iArr[i4];
                                db.y0(byteArrayOutputStream3, i10 - i9);
                                i4++;
                                i5 = i5;
                                i9 = i10;
                            }
                            i7++;
                            i4 = 0;
                        } catch (Throwable th) {
                        }
                    }
                    int i11 = i5;
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i8 == byteArray2.length) {
                        h97 h97Var2 = new h97(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList.add(h97Var2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i12 = 0;
                        for (int i13 = 0; i13 < uf1VarArr.length; i13++) {
                            try {
                                uf1 uf1Var3 = uf1VarArr[i13];
                                Iterator it = uf1Var3.i.entrySet().iterator();
                                int i14 = 0;
                                while (it.hasNext()) {
                                    i14 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    j0(byteArrayOutputStream4, i14, uf1Var3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        k0(byteArrayOutputStream4, uf1Var3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        db.y0(byteArrayOutputStream3, i13);
                                        int length4 = byteArray3.length + 2 + byteArray4.length;
                                        int i15 = i12 + 6;
                                        db.x0(byteArrayOutputStream3, length4, 4);
                                        db.y0(byteArrayOutputStream3, i14);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i12 = i15 + length4;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i12 == byteArray5.length) {
                            h97 h97Var3 = new h97(4, true, byteArray5);
                            byteArrayOutputStream3.close();
                            arrayList.add(h97Var3);
                            long size = 12 + (arrayList.size() * 16);
                            db.x0(byteArrayOutputStream, arrayList.size(), 4);
                            int i16 = 0;
                            while (i16 < arrayList.size()) {
                                h97 h97Var4 = (h97) arrayList.get(i16);
                                int i17 = h97Var4.a;
                                byte[] bArr5 = h97Var4.b;
                                if (i17 != 1) {
                                    i2 = i11;
                                    if (i17 != i2) {
                                        if (i17 != 3) {
                                            if (i17 != 4) {
                                                if (i17 == 5) {
                                                    i3 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                i3 = 3;
                                            }
                                        } else {
                                            i3 = i2;
                                        }
                                    } else {
                                        i3 = 1;
                                    }
                                } else {
                                    i2 = i11;
                                    i3 = 0;
                                }
                                db.x0(byteArrayOutputStream, i3, 4);
                                db.x0(byteArrayOutputStream, size, 4);
                                if (h97Var4.c) {
                                    long length5 = bArr5.length;
                                    byte[] I = db.I(bArr5);
                                    arrayList2.add(I);
                                    db.x0(byteArrayOutputStream, I.length, 4);
                                    db.x0(byteArrayOutputStream, length5, 4);
                                    length = I.length;
                                } else {
                                    arrayList2.add(bArr5);
                                    db.x0(byteArrayOutputStream, bArr5.length, 4);
                                    db.x0(byteArrayOutputStream, 0L, 4);
                                    length = bArr5.length;
                                }
                                size += length;
                                i16++;
                                i11 = i2;
                            }
                            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        byte[] bArr6 = n03.o;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] k2 = k(uf1VarArr, bArr6);
            db.x0(byteArrayOutputStream, uf1VarArr.length, 1);
            db.x0(byteArrayOutputStream, k2.length, 4);
            byte[] I2 = db.I(k2);
            db.x0(byteArrayOutputStream, I2.length, 4);
            byteArrayOutputStream.write(I2);
            return true;
        }
        if (Arrays.equals(bArr, bArr3)) {
            db.x0(byteArrayOutputStream, uf1VarArr.length, 1);
            for (uf1 uf1Var4 : uf1VarArr) {
                int size2 = uf1Var4.i.size() * 4;
                String q3 = q(uf1Var4.a, uf1Var4.b, bArr3);
                Charset charset2 = StandardCharsets.UTF_8;
                db.y0(byteArrayOutputStream, q3.getBytes(charset2).length);
                db.y0(byteArrayOutputStream, uf1Var4.h.length);
                db.x0(byteArrayOutputStream, size2, 4);
                db.x0(byteArrayOutputStream, uf1Var4.c, 4);
                byteArrayOutputStream.write(q3.getBytes(charset2));
                Iterator it2 = uf1Var4.i.keySet().iterator();
                while (it2.hasNext()) {
                    db.y0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    db.y0(byteArrayOutputStream, 0);
                }
                for (int i19 : uf1Var4.h) {
                    db.y0(byteArrayOutputStream, i19);
                }
            }
            return true;
        }
        byte[] bArr7 = n03.p;
        if (Arrays.equals(bArr, bArr7)) {
            byte[] k3 = k(uf1VarArr, bArr7);
            db.x0(byteArrayOutputStream, uf1VarArr.length, 1);
            db.x0(byteArrayOutputStream, k3.length, 4);
            byte[] I3 = db.I(k3);
            db.x0(byteArrayOutputStream, I3.length, 4);
            byteArrayOutputStream.write(I3);
            return true;
        }
        if (Arrays.equals(bArr, bArr2)) {
            db.y0(byteArrayOutputStream, uf1VarArr.length);
            for (uf1 uf1Var5 : uf1VarArr) {
                String str = uf1Var5.a;
                TreeMap treeMap = uf1Var5.i;
                String q4 = q(str, uf1Var5.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                db.y0(byteArrayOutputStream, q4.getBytes(charset3).length);
                db.y0(byteArrayOutputStream, treeMap.size());
                db.y0(byteArrayOutputStream, uf1Var5.h.length);
                db.x0(byteArrayOutputStream, uf1Var5.c, 4);
                byteArrayOutputStream.write(q4.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    db.y0(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i20 : uf1Var5.h) {
                    db.y0(byteArrayOutputStream, i20);
                }
            }
            return true;
        }
        return false;
    }

    public static sk6 V(int i2, int i3, ar1 ar1Var) {
        int i4;
        if ((i3 & 1) != 0) {
            i2 = 300;
        }
        if ((i3 & 2) != 0) {
            i4 = 0;
        } else {
            i4 = 90;
        }
        if ((i3 & 4) != 0) {
            ar1Var = br1.a;
        }
        return new sk6(i2, i4, ar1Var);
    }

    public static final int W(ue3 ue3Var) {
        List list = ue3Var.l;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((ve3) list.get(i3)).p;
        }
        return (i2 / list.size()) + ue3Var.r;
    }

    public static final yz3 X(yz3 yz3Var, ub2 ub2Var) {
        return yz3Var.w(new n46(ub2Var));
    }

    public static void Y(Parcel parcel, int i2, Boolean bool) {
        if (bool == null) {
            return;
        }
        r0(parcel, i2, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void Z(Parcel parcel, int i2, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int s0 = s0(parcel, i2);
        parcel.writeBundle(bundle);
        t0(parcel, s0);
    }

    public static final void a(boolean z, final sb2 sb2Var, kd2 kd2Var, final int i2, final int i3) {
        final boolean z2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        n74 n74Var;
        m74 m74Var;
        xd4 xd4Var;
        boolean z5;
        boolean z6;
        Object obj;
        int i6;
        kd2Var.f0(-361453782);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            z2 = z;
        } else if ((i2 & 6) == 0) {
            z2 = z;
            if (kd2Var.g(z2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            z2 = z;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.h(sb2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i4 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i4 & 1, z3)) {
            if (i7 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            Object obj2 = (n74) kd2Var.j(zj3.a);
            wd4 wd4Var = null;
            if (obj2 == null) {
                kd2Var.e0(535274673);
                obj2 = (xd4) kd2Var.j(ak3.a);
                if (obj2 == null) {
                    kd2Var.e0(1208426157);
                    View view = (View) kd2Var.j(eb.f);
                    view.getClass();
                    while (true) {
                        if (view != null) {
                            Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                            if (tag instanceof xd4) {
                                obj = (xd4) tag;
                            } else {
                                obj = null;
                            }
                            if (obj != null) {
                                obj2 = obj;
                                break;
                            }
                            Object d2 = nz5.d(view);
                            if (d2 instanceof View) {
                                view = (View) d2;
                            } else {
                                view = null;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                } else {
                    kd2Var.e0(1208423708);
                }
                kd2Var.q(false);
                if (obj2 == null) {
                    kd2Var.e0(1208428160);
                    Object obj3 = (Context) kd2Var.j(eb.b);
                    while (true) {
                        if (obj3 instanceof ContextWrapper) {
                            if (obj3 instanceof xd4) {
                                break;
                            } else {
                                obj3 = ((ContextWrapper) obj3).getBaseContext();
                            }
                        } else {
                            obj3 = null;
                            break;
                        }
                    }
                    obj2 = (xd4) obj3;
                } else {
                    kd2Var.e0(1208423789);
                }
                kd2Var.q(false);
            } else {
                kd2Var.e0(535271790);
            }
            kd2Var.q(false);
            if (obj2 != null) {
                boolean f2 = kd2Var.f(obj2);
                Object Q = kd2Var.Q();
                Object obj4 = au0.a;
                if (f2 || Q == obj4) {
                    if (obj2 instanceof n74) {
                        n74Var = (n74) obj2;
                    } else {
                        n74Var = null;
                    }
                    if (n74Var != null) {
                        m74Var = n74Var.getNavigationEventDispatcher();
                    } else {
                        m74Var = null;
                    }
                    if (obj2 instanceof xd4) {
                        xd4Var = (xd4) obj2;
                    } else {
                        xd4Var = null;
                    }
                    if (xd4Var != null) {
                        wd4Var = xd4Var.getOnBackPressedDispatcher();
                    }
                    Q = new oz(m74Var, wd4Var);
                    kd2Var.n0(Q);
                }
                Object obj5 = (oz) Q;
                long j2 = kd2Var.T;
                boolean f3 = kd2Var.f(obj5) | kd2Var.e(j2);
                Object Q2 = kd2Var.Q();
                Object obj6 = Q2;
                if (f3 || Q2 == obj4) {
                    bt0 bt0Var = new bt0(new pz(j2, obj2));
                    bt0Var.c = new gr((byte) 23);
                    kd2Var.n0(bt0Var);
                    obj6 = bt0Var;
                }
                Object obj7 = (bt0) obj6;
                kd2Var.e0(-585307852);
                boolean h2 = kd2Var.h(obj7);
                if ((i4 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z7 = h2 | z5;
                Object Q3 = kd2Var.Q();
                byte b2 = 14;
                if (z7 || Q3 == obj4) {
                    Q3 = new n(obj7, sb2Var, b2);
                    kd2Var.n0(Q3);
                }
                db.m((sb2) Q3, kd2Var);
                Boolean valueOf = Boolean.valueOf(z4);
                boolean h3 = kd2Var.h(obj7);
                int i8 = i4 & 14;
                if (i8 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z8 = z6 | h3;
                Object Q4 = kd2Var.Q();
                if (z8 || Q4 == obj4) {
                    Q4 = new ej((byte) 1, obj7, z4);
                    kd2Var.n0(Q4);
                }
                te4.j(valueOf, obj7, null, (ub2) Q4, kd2Var, i8);
                boolean h4 = kd2Var.h(obj5) | kd2Var.h(obj7);
                Object Q5 = kd2Var.Q();
                if (h4 || Q5 == obj4) {
                    Q5 = new b0(obj5, obj7, b2);
                    kd2Var.n0(Q5);
                }
                db.d(obj5, obj7, (ub2) Q5, kd2Var);
                kd2Var.q(false);
                z2 = z4;
            } else {
                ze0.m("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: qz
                @Override // defpackage.ic2
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    int N = kb0.N(i2 | 1);
                    z51.a(z2, sb2Var, (kd2) obj8, N, i3 ? 1 : 0);
                    return pn6.a;
                }
            };
        }
    }

    public static void a0(Parcel parcel, int i2, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int s0 = s0(parcel, i2);
        parcel.writeByteArray(bArr);
        t0(parcel, s0);
    }

    public static final CancellationException b(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static void b0(Parcel parcel, int i2, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int s0 = s0(parcel, i2);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        t0(parcel, s0);
    }

    public static final y71 c(kz6 kz6Var) {
        lo1 lo1Var = new lo1();
        kz6Var.invoke(lo1Var);
        float[] fArr = lo1Var.b;
        ArrayList arrayList = lo1Var.a;
        int size = arrayList.size();
        n77.C(size, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, 0, size);
        copyOfRange.getClass();
        return new y71(arrayList, copyOfRange);
    }

    public static void c0(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int s0 = s0(parcel, i2);
        parcel.writeStrongBinder(iBinder);
        t0(parcel, s0);
    }

    public static yz3 d(yz3 yz3Var, e9 e9Var, boolean z, ys5 ys5Var) {
        return yz3Var.w(new x7(e9Var, z, ys5Var));
    }

    public static void d0(Parcel parcel, int i2, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int s0 = s0(parcel, i2);
        parcel.writeIntArray(iArr);
        t0(parcel, s0);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [t05, java.lang.Object] */
    public static final Object e(e9 e9Var, float f2, a9 a9Var, y71 y71Var, Object obj, ll llVar, t36 t36Var) {
        float h2;
        Object a2;
        float c2 = y71Var.c(obj);
        ?? obj2 = new Object();
        if (Float.isNaN(e9Var.f.h())) {
            h2 = 0.0f;
        } else {
            h2 = e9Var.f.h();
        }
        obj2.x = h2;
        if (!Float.isNaN(c2)) {
            float f3 = obj2.x;
            if (f3 != c2 && (a2 = nv5.a(f3, c2, f2, llVar, new q(a9Var, obj2, (byte) 2), t36Var)) == w11.x) {
                return a2;
            }
        }
        return pn6.a;
    }

    public static void e0(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int s0 = s0(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(((Integer) list.get(i3)).intValue());
        }
        t0(parcel, s0);
    }

    public static void f(String str) {
        if (str.length() > 0) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if ('!' > charAt || charAt >= 127) {
                    ze0.e(dq6.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                    return;
                }
            }
            return;
        }
        ze0.k("name is empty");
    }

    public static void f0(Parcel parcel, int i2, Integer num) {
        if (num == null) {
            return;
        }
        r0(parcel, i2, 4);
        parcel.writeInt(num.intValue());
    }

    public static void g(String str, String str2) {
        String concat;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                String h2 = dq6.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2);
                if (dq6.p(str2)) {
                    concat = "";
                } else {
                    concat = ": ".concat(str);
                }
                ze0.e(h2.concat(concat));
                return;
            }
        }
    }

    public static void g0(ByteArrayOutputStream byteArrayOutputStream, uf1 uf1Var) {
        k0(byteArrayOutputStream, uf1Var);
        int i2 = uf1Var.g;
        int[] iArr = uf1Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            db.y0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : uf1Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final String h(y43 y43Var, aj5 aj5Var) {
        aj5Var.getClass();
        y43Var.getClass();
        for (Annotation annotation : aj5Var.getAnnotations()) {
            if (annotation instanceof f53) {
                return ((f53) annotation).discriminator();
            }
        }
        return y43Var.a.h;
    }

    public static void h0(ByteArrayOutputStream byteArrayOutputStream, uf1 uf1Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        db.y0(byteArrayOutputStream, str.getBytes(charset).length);
        db.y0(byteArrayOutputStream, uf1Var.e);
        db.x0(byteArrayOutputStream, uf1Var.f, 4);
        db.x0(byteArrayOutputStream, uf1Var.c, 4);
        db.x0(byteArrayOutputStream, uf1Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static String i(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "kotlin.Double.Companion";
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static void i0(Parcel parcel, int i2, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int s0 = s0(parcel, i2);
        parcel.writeLongArray(jArr);
        t0(parcel, s0);
    }

    public static int j(long j2, long j3) {
        if (j2 > 0 && j3 > 0) {
            long e0 = eq6.e0(j2, 8000000L, j3, RoundingMode.HALF_UP);
            if (e0 > 0 && e0 <= 2147483647L) {
                return (int) e0;
            }
        }
        return -2147483647;
    }

    public static void j0(ByteArrayOutputStream byteArrayOutputStream, int i2, uf1 uf1Var) {
        int i3 = uf1Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : uf1Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static byte[] k(uf1[] uf1VarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (uf1 uf1Var : uf1VarArr) {
            i3 += ((((uf1Var.g * 2) + 7) & (-8)) / 8) + (uf1Var.e * 2) + q(uf1Var.a, uf1Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + uf1Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, n03.p)) {
            int length = uf1VarArr.length;
            while (i2 < length) {
                uf1 uf1Var2 = uf1VarArr[i2];
                h0(byteArrayOutputStream, uf1Var2, q(uf1Var2.a, uf1Var2.b, bArr));
                g0(byteArrayOutputStream, uf1Var2);
                i2++;
            }
        } else {
            for (uf1 uf1Var3 : uf1VarArr) {
                h0(byteArrayOutputStream, uf1Var3, q(uf1Var3.a, uf1Var3.b, bArr));
            }
            int length2 = uf1VarArr.length;
            while (i2 < length2) {
                g0(byteArrayOutputStream, uf1VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static void k0(ByteArrayOutputStream byteArrayOutputStream, uf1 uf1Var) {
        int i2 = 0;
        for (Map.Entry entry : uf1Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                db.y0(byteArrayOutputStream, intValue - i2);
                db.y0(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, wc7] */
    public static wc7 l(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static void l0(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int s0 = s0(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        t0(parcel, s0);
    }

    public static void m(ArrayList arrayList) {
        boolean z;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            kr0 kr0Var = (kr0) obj;
            r31 r31Var = new r31(kr0Var);
            for (px4 px4Var : kr0Var.b) {
                boolean z2 = kr0Var.e;
                s31 s31Var = new s31(px4Var, z2);
                if (!hashMap.containsKey(s31Var)) {
                    hashMap.put(s31Var, new HashSet());
                }
                Set set = (Set) hashMap.get(s31Var);
                if (!set.isEmpty() && !z2) {
                    p65.i("Multiple components provide ", px4Var, ".");
                    return;
                }
                set.add(r31Var);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (r31 r31Var2 : (Set) it.next()) {
                for (zd1 zd1Var : r31Var2.a.c) {
                    if (!zd1Var.c) {
                        px4 px4Var2 = zd1Var.a;
                        if (zd1Var.b == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Set<r31> set2 = (Set) hashMap.get(new s31(px4Var2, z));
                        if (set2 != null) {
                            for (r31 r31Var3 : set2) {
                                r31Var2.b.add(r31Var3);
                                r31Var3.c.add(r31Var2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            r31 r31Var4 = (r31) it3.next();
            if (r31Var4.c.isEmpty()) {
                hashSet2.add(r31Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            r31 r31Var5 = (r31) hashSet2.iterator().next();
            hashSet2.remove(r31Var5);
            i2++;
            Iterator it4 = r31Var5.b.iterator();
            while (it4.hasNext()) {
                r31 r31Var6 = (r31) it4.next();
                r31Var6.c.remove(r31Var5);
                if (r31Var6.c.isEmpty()) {
                    hashSet2.add(r31Var6);
                }
            }
        }
        if (i2 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            r31 r31Var7 = (r31) it5.next();
            if (!r31Var7.c.isEmpty() && !r31Var7.b.isEmpty()) {
                arrayList2.add(r31Var7.a);
            }
        }
        throw new er0("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), (byte) 1);
    }

    public static void m0(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int s0 = s0(parcel, i2);
        parcel.writeString(str);
        t0(parcel, s0);
    }

    public static final n05 n(xz3 xz3Var, boolean z, boolean z2) {
        if (!xz3Var.x.K) {
            return n05.e;
        }
        if (!z) {
            fa4 M = wc7.M(xz3Var, 8);
            return te4.B(M).G(M, z2);
        }
        return wc7.M(xz3Var, 8).v1();
    }

    public static void n0(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int s0 = s0(parcel, i2);
        parcel.writeStringList(list);
        t0(parcel, s0);
    }

    public static final ArrayList o(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!b06.C((String) obj, "Auto", true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void o0(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int s0 = s0(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        t0(parcel, s0);
    }

    public static final yz3 p(yz3 yz3Var, w72 w72Var) {
        return yz3Var.w(new x72(w72Var));
    }

    public static void p0(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int s0 = s0(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        t0(parcel, s0);
    }

    public static String q(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = n03.q;
        byte[] bArr3 = n03.r;
        String str3 = "!";
        if (!Arrays.equals(bArr, bArr3) && !Arrays.equals(bArr, bArr2)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    StringBuilder sb = new StringBuilder(str);
                    if (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) {
                        str3 = ":";
                    }
                    return h11.k(sb, str3, str2);
                }
            } else {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static float q0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final float r(Layout layout, int i2, Paint paint) {
        int i3;
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        ThreadLocal threadLocal = ed6.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if (paragraphAlignment == null) {
            i3 = -1;
        } else {
            i3 = sx2.a[paragraphAlignment.ordinal()];
        }
        if (i3 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static void r0(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static final float s(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = ed6.a;
        if (layout.getEllipsisCount(i2) > 0) {
            int i3 = -1;
            if (layout.getParagraphDirection(i2) == -1 && layout.getWidth() < layout.getLineRight(i2)) {
                float measureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
                if (paragraphAlignment != null) {
                    i3 = sx2.a[paragraphAlignment.ordinal()];
                }
                if (i3 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i2);
                    width2 = (layout.getWidth() - measureText) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i2);
                    width2 = layout.getWidth() - measureText;
                }
                return width - width2;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static int s0(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final String t(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static void t0(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static final String u(List list) {
        Object obj;
        list.getClass();
        Iterator it = o(list).iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                int B = B((String) next);
                do {
                    Object next2 = it.next();
                    int B2 = B((String) next2);
                    if (B < B2) {
                        next = next2;
                        B = B2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        String str = (String) obj;
        if (str == null) {
            return "Original";
        }
        return str;
    }

    public static int v(float f2) {
        float f3;
        boolean z;
        float f4;
        if (f2 < 1.0f) {
            return SubtitleArgbColor.BLACK;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = e;
        return up0.a(f4 * fArr[0], f3 * fArr[1], f6 * fArr[2]);
    }

    public static final void w(sh5 sh5Var) {
        wc7.O(sh5Var).G();
    }

    public static float x(int i2) {
        float pow;
        float f2 = i2 / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static ik2 y(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                String str = strArr2[i3];
                if (str != null) {
                    strArr2[i3] = uz5.w0(str).toString();
                } else {
                    ze0.k("Headers cannot be null");
                    return null;
                }
            }
            int E = x97.E(0, strArr2.length - 1, 2);
            if (E >= 0) {
                while (true) {
                    String str2 = strArr2[i2];
                    String str3 = strArr2[i2 + 1];
                    f(str2);
                    g(str3, str2);
                    if (i2 == E) {
                        break;
                    }
                    i2 += 2;
                }
            }
            return new ik2(strArr2);
        }
        ze0.k("Expected alternating header names and values");
        return null;
    }

    public static final k52 z(x44 x44Var, ic2 ic2Var) {
        return new k52(x44Var, ic2Var, (byte) 2);
    }
}
