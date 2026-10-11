package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import com.google.protobuf.CodedOutputStream;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TreeMap;
import java.util.UUID;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class tl7 {
    public static ClassLoader a;
    public static Thread b;
    public static final byte[] c = {-75, 0, 60, 0, 1, 4};
    public static final os0 d = new os0(1596413272, false, new qs0(5));
    public static final os0 e = new os0(-1791137966, false, new qs0(6));
    public static final np0 f;
    public static final float g;
    public static final StackTraceElement[] h;
    public static final np0 i;
    public static final ka6 j;

    static {
        new os0(2012237887, false, new qs0((byte) 7));
        f = np0.D;
        g = 1.0f;
        h = new StackTraceElement[0];
        i = np0.B;
        j = new ka6((byte) 13);
    }

    public static final yz3 A(yz3 yz3Var, jc2 jc2Var) {
        return yz3Var.w(new ja3(jc2Var));
    }

    public static l11 B(j11 j11Var, k11 k11Var) {
        k11Var.getClass();
        if (a34.i(j11Var.getKey(), k11Var)) {
            return it1.x;
        }
        return j11Var;
    }

    public static mp E(zi4 zi4Var) {
        String str;
        int m = zi4Var.m();
        if (zi4Var.m() == 1684108385) {
            int m2 = zi4Var.m();
            byte[] bArr = l90.a;
            int i2 = m2 & 16777215;
            if (i2 == 13) {
                str = "image/jpeg";
            } else if (i2 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                h11.r(i2, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            zi4Var.O(4);
            int i3 = m - 16;
            byte[] bArr2 = new byte[i3];
            zi4Var.k(bArr2, 0, i3);
            return new mp(str, null, 3, bArr2);
        }
        kb0.O("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static rc6 F(int i2, zi4 zi4Var, String str) {
        int m = zi4Var.m();
        if (zi4Var.m() == 1684108385 && m >= 22) {
            zi4Var.O(10);
            int H = zi4Var.H();
            if (H > 0) {
                String h2 = qx1.h(H, "");
                int H2 = zi4Var.H();
                if (H2 > 0) {
                    h2 = h2 + "/" + H2;
                }
                return new rc6(nw2.s(h2), str, null);
            }
        }
        kb0.O("MetadataUtil", "Failed to parse index/count attribute: ".concat(qa0.c(i2)));
        return null;
    }

    public static int G(zi4 zi4Var) {
        int m = zi4Var.m();
        if (zi4Var.m() == 1684108385) {
            zi4Var.O(8);
            int i2 = m - 16;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4 && (zi4Var.j() & 128) == 0) {
                            return zi4Var.E();
                        }
                    } else {
                        return zi4Var.D();
                    }
                } else {
                    return zi4Var.H();
                }
            } else {
                return zi4Var.A();
            }
        }
        kb0.O("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static gu2 H(int i2, String str, zi4 zi4Var, boolean z, boolean z2) {
        int G = G(zi4Var);
        if (z2) {
            G = Math.min(1, G);
        }
        if (G >= 0) {
            if (z) {
                return new rc6(nw2.s(Integer.toString(G)), str, null);
            }
            return new lq0("und", str, Integer.toString(G));
        }
        kb0.O("MetadataUtil", "Failed to parse uint8 attribute: ".concat(qa0.c(i2)));
        return null;
    }

    public static uw4 I(byte[] bArr) {
        UUID[] uuidArr;
        zi4 zi4Var = new zi4(bArr);
        if (zi4Var.c < 32) {
            return null;
        }
        zi4Var.N(0);
        int a2 = zi4Var.a();
        int m = zi4Var.m();
        if (m != a2) {
            kb0.O("PsshAtomUtil", "Advertised atom size (" + m + ") does not match buffer size: " + a2);
            return null;
        }
        int m2 = zi4Var.m();
        if (m2 != 1886614376) {
            h11.r(m2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e2 = l90.e(zi4Var.m());
        if (e2 > 1) {
            h11.r(e2, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(zi4Var.u(), zi4Var.u());
        if (e2 == 1) {
            int E = zi4Var.E();
            uuidArr = new UUID[E];
            for (int i2 = 0; i2 < E; i2++) {
                uuidArr[i2] = new UUID(zi4Var.u(), zi4Var.u());
            }
        } else {
            uuidArr = null;
        }
        int E2 = zi4Var.E();
        int a3 = zi4Var.a();
        if (E2 != a3) {
            kb0.O("PsshAtomUtil", "Atom data size (" + E2 + ") does not match the bytes left: " + a3);
            return null;
        }
        byte[] bArr2 = new byte[E2];
        zi4Var.k(bArr2, 0, E2);
        return new uw4(uuid, e2, bArr2, uuidArr);
    }

    public static byte[] J(UUID uuid, byte[] bArr) {
        uw4 I = I(bArr);
        if (I == null) {
            return null;
        }
        UUID uuid2 = (UUID) I.y;
        if (!uuid.equals(uuid2)) {
            kb0.O("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return (byte[]) I.z;
    }

    public static rc6 K(int i2, zi4 zi4Var, String str) {
        int m = zi4Var.m();
        if (zi4Var.m() == 1684108385) {
            zi4Var.O(8);
            return new rc6(nw2.s(zi4Var.w(m - 16)), str, null);
        }
        kb0.O("MetadataUtil", "Failed to parse text attribute: ".concat(qa0.c(i2)));
        return null;
    }

    public static l11 L(j11 j11Var, l11 l11Var) {
        l11Var.getClass();
        if (l11Var == it1.x) {
            return j11Var;
        }
        return (l11) l11Var.fold(j11Var, new st0((byte) 4));
    }

    public static final xi6 M(qt0 qt0Var, String str, kd2 kd2Var, int i2) {
        boolean z;
        ub2 ub2Var;
        boolean z2;
        int i3 = (i2 & 14) ^ 6;
        boolean z3 = true;
        byte b2 = 0;
        if ((i3 > 4 && kd2Var.f(qt0Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object Q = kd2Var.Q();
        Object obj = au0.a;
        if (z || Q == obj) {
            ft5 b3 = et5.b();
            if (b3 != null) {
                ub2Var = b3.e();
            } else {
                ub2Var = null;
            }
            ft5 e2 = et5.e(b3);
            try {
                Object xi6Var = new xi6(qt0Var, null, str);
                et5.k(b3, e2, ub2Var);
                kd2Var.n0(xi6Var);
                Q = xi6Var;
            } catch (Throwable th) {
                et5.k(b3, e2, ub2Var);
                throw th;
            }
        }
        xi6 xi6Var2 = (xi6) Q;
        if (qt0Var instanceof sf5) {
            kd2Var.e0(-1357398105);
            Object Q2 = kd2Var.Q();
            if (Q2 == obj) {
                Q2 = db.L(kd2Var);
                kd2Var.n0(Q2);
            }
            Object obj2 = (v11) Q2;
            boolean h2 = kd2Var.h(obj2);
            if ((i3 > 4 && kd2Var.f(qt0Var)) || (i2 & 6) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = h2 | z2;
            Object Q3 = kd2Var.Q();
            if (z4 || Q3 == obj) {
                Q3 = new ll5((Object) qt0Var, obj2, (byte) 11);
                kd2Var.n0(Q3);
            }
            db.c(obj2, (ub2) Q3, kd2Var);
            sf5 sf5Var = (sf5) qt0Var;
            Object value = sf5Var.z.getValue();
            Object value2 = sf5Var.y.getValue();
            if ((i3 <= 4 || !kd2Var.f(qt0Var)) && (i2 & 6) != 4) {
                z3 = false;
            }
            Object Q4 = kd2Var.Q();
            if (z3 || Q4 == obj) {
                Q4 = new e05(qt0Var, null);
                kd2Var.n0(Q4);
            }
            db.g(value, value2, (ic2) Q4, kd2Var);
            kd2Var.q(false);
        } else {
            kd2Var.e0(-1356407283);
            xi6Var2.a(qt0Var.x(), kd2Var, 0);
            kd2Var.q(false);
        }
        boolean f2 = kd2Var.f(xi6Var2);
        Object Q5 = kd2Var.Q();
        if (f2 || Q5 == obj) {
            Q5 = new yi6(xi6Var2, b2);
            kd2Var.n0(Q5);
        }
        db.c(xi6Var2, (ub2) Q5, kd2Var);
        return xi6Var2;
    }

    public static List N(List list) {
        if (list instanceof nw2) {
            return ((nw2) list).v();
        }
        if (list instanceof xi3) {
            return ((xi3) list).x;
        }
        if (list instanceof RandomAccess) {
            return new xi3(list);
        }
        return new xi3(list);
    }

    public static final void O(TextPaint textPaint, float f2) {
        if (!Float.isNaN(f2)) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f2 * 255.0f));
        }
    }

    public static void P(int i2, fy3 fy3Var, da2 da2Var, fy3 fy3Var2, fy3... fy3VarArr) {
        if (fy3Var2 == null) {
            fy3Var2 = new fy3(new ey3[0]);
        }
        if (fy3Var != null) {
            jw2 k = nw2.k();
            for (ey3 ey3Var : fy3Var.a) {
                if (qo3.class.isAssignableFrom(ey3Var.getClass())) {
                    k.c((ey3) qo3.class.cast(ey3Var));
                }
            }
            z62 listIterator = k.g().listIterator(0);
            while (listIterator.hasNext()) {
                qo3 qo3Var = (qo3) listIterator.next();
                if (!qo3Var.a.equals("com.android.capture.fps") || i2 == 2) {
                    fy3Var2 = fy3Var2.a(qo3Var);
                }
            }
        }
        for (fy3 fy3Var3 : fy3VarArr) {
            fy3Var2 = fy3Var2.b(fy3Var3);
        }
        if (fy3Var2.a.length > 0) {
            da2Var.l = fy3Var2;
        }
    }

    public static void Q(ByteBuffer byteBuffer, boolean z) {
        boolean z2;
        ArrayList n0 = db.n0(byteBuffer.asReadOnlyBuffer());
        int size = n0.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = n0.get(i2);
            i2++;
            qc4 qc4Var = (qc4) obj;
            int i3 = qc4Var.a;
            ByteBuffer byteBuffer2 = qc4Var.b;
            if (i3 == 5) {
                if (i3 == 5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                try {
                    io3.n(z2);
                    ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                    if (db.b0(asReadOnlyBuffer) == 4) {
                        if (z && asReadOnlyBuffer.remaining() >= 6) {
                            int position = asReadOnlyBuffer.position();
                            for (int i4 = 0; i4 < 6; i4++) {
                                if (asReadOnlyBuffer.get(position + i4) == c[i4]) {
                                }
                            }
                        }
                        byteBuffer.put(byteBuffer2.position(), (byte) 31);
                        break;
                    }
                } catch (BufferUnderflowException unused) {
                }
            }
        }
    }

    public static final String R(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = db.a;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        return b06.x(cArr2, i3, 8);
    }

    public static AbstractList S(List list, qc2 qc2Var) {
        if (list instanceof RandomAccess) {
            return new zi3(list, qc2Var);
        }
        return new aj3(list, qc2Var);
    }

    public static final xi6 T(Boolean bool, String str, kd2 kd2Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        Object Q = kd2Var.Q();
        q18 q18Var = au0.a;
        if (Q == q18Var) {
            Q = new xi6(new y44(bool), null, str);
            kd2Var.n0(Q);
        }
        xi6 xi6Var = (xi6) Q;
        xi6Var.a(bool, kd2Var, (i2 & 8) | 48 | (i2 & 14));
        Object Q2 = kd2Var.Q();
        if (Q2 == q18Var) {
            Q2 = new yi6(xi6Var, (byte) 1);
            kd2Var.n0(Q2);
        }
        db.c(xi6Var, (ub2) Q2, kd2Var);
        return xi6Var;
    }

    public static void U() {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        bb4.s(null, z);
    }

    public static final Object V(l11 l11Var, ic2 ic2Var, vz0 vz0Var) {
        l11 s;
        Unsafe unsafe;
        long j2;
        l11 context = vz0Var.getContext();
        if (!((Boolean) l11Var.fold(Boolean.FALSE, new st0((byte) 5))).booleanValue()) {
            s = context.plus(l11Var);
        } else {
            s = bx7.s(context, l11Var, false);
        }
        h98.o(s);
        if (s == context) {
            ec5 ec5Var = new ec5(vz0Var, s);
            return lz5.e(ec5Var, true, ec5Var, ic2Var);
        }
        h95 h95Var = h95.B;
        if (a34.i(s.get(h95Var), context.get(h95Var))) {
            gn6 gn6Var = new gn6(vz0Var, s);
            l11 l11Var2 = gn6Var.A;
            Object c2 = ke6.c(l11Var2, null);
            try {
                return lz5.e(gn6Var, true, gn6Var, ic2Var);
            } finally {
                ke6.a(l11Var2, c2);
            }
        }
        ec5 ec5Var2 = new ec5(vz0Var, s);
        try {
            kh1.a(wc7.z(wc7.j(ec5Var2, ec5Var2, ic2Var)), pn6.a);
            do {
                unsafe = qs.a;
                j2 = lh1.C;
                int intVolatile = unsafe.getIntVolatile(ec5Var2, j2);
                if (intVolatile != 0) {
                    if (intVolatile == 2) {
                        Object a2 = u43.a(ec5Var2.K());
                        if (a2 instanceof dr0) {
                            throw ((dr0) a2).a;
                        }
                        return a2;
                    }
                    ze0.m("Already suspended");
                    return null;
                }
            } while (!unsafe.compareAndSwapInt(ec5Var2, j2, 0, 1));
            return w11.x;
        } catch (Throwable th) {
            oi4.n(ec5Var2, th);
            throw null;
        }
    }

    public static final void W(FileOutputStream fileOutputStream, String str, Charset charset) {
        boolean z;
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        onUnmappableCharacter.getClass();
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        allocate2.getClass();
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            int min = Math.min(8192 - i3, str.length() - i2);
            int i4 = i2 + min;
            char[] array = allocate.array();
            array.getClass();
            str.getChars(i2, i4, array, i3);
            allocate.limit(min + i3);
            i3 = 1;
            if (i4 == str.length()) {
                z = true;
            } else {
                z = false;
            }
            if (onUnmappableCharacter.encode(allocate, allocate2, z).isUnderflow()) {
                fileOutputStream.write(allocate2.array(), 0, allocate2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i3 = 0;
                }
                allocate.clear();
                allocate2.clear();
                i2 = i4;
            } else {
                ze0.m("Check failed.");
                return;
            }
        }
    }

    public static void X(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if (r2 == null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader Y() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl7.Y():java.lang.ClassLoader");
    }

    public static final void a(Object obj, String str, yz3 yz3Var, dz0 dz0Var, kd2 kd2Var, int i2) {
        y50 y50Var = pk2.C;
        kz4 a2 = lq5.a((Context) kd2Var.j(eb.b));
        int i3 = i2 << 3;
        int i4 = (i2 & 126) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192);
        int i5 = i4 >> 3;
        bx7.a(new ut(obj, (jt) kd2Var.j(tj3.a), a2), str, yz3Var, qt.R, null, y50Var, dz0Var, kd2Var, (i4 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | ((((i2 >> 27) & 14) << 27) & 1879048192), 0);
    }

    public static final void b(Object obj, String str, yz3 yz3Var, xh4 xh4Var, xh4 xh4Var2, kd2 kd2Var, int i2, int i3) {
        ub2 ll5Var;
        cz0 cz0Var = pk2.O;
        if ((i3 & 16) != 0) {
            xh4Var = null;
        }
        y50 y50Var = pk2.C;
        int i4 = i2 << 3;
        int i5 = (((i4 & 458752) | ((i4 & 7168) | 294912)) | 2097152) >> 3;
        ut utVar = new ut(obj, (jt) kd2Var.j(tj3.a), lq5.a((Context) kd2Var.j(eb.b)));
        int i6 = lq6.b;
        if (xh4Var == null && xh4Var2 == null) {
            ll5Var = qt.R;
        } else {
            ll5Var = new ll5((Object) xh4Var2, (Object) xh4Var, (byte) 18);
        }
        bx7.a(utVar, str, yz3Var, ll5Var, null, y50Var, cz0Var, kd2Var, (i5 & 896) | 1572864, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t43, zq0] */
    public static zq0 c() {
        ?? t43Var = new t43(true);
        t43Var.N(null);
        return t43Var;
    }

    public static xd1 d() {
        return new xd1(1.0f, 1.0f);
    }

    public static final long e(int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            hz2.a("The span value should be higher than 0");
        }
        return i2;
    }

    public static final void f(xi6 xi6Var, ui6 ui6Var, Object obj, Object obj2, j32 j32Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        boolean h2;
        int i4;
        boolean h3;
        int i5;
        boolean h4;
        int i6;
        int i7;
        int i8;
        kd2Var.f0(867041821);
        if ((i2 & 6) == 0) {
            if (kd2Var.f(xi6Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.f(ui6Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            if ((i2 & 512) == 0) {
                h4 = kd2Var.f(obj);
            } else {
                h4 = kd2Var.h(obj);
            }
            if (h4) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if ((i2 & CodedOutputStream.DEFAULT_BUFFER_SIZE) == 0) {
                h3 = kd2Var.f(obj2);
            } else {
                h3 = kd2Var.h(obj2);
            }
            if (h3) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                h2 = kd2Var.f(j32Var);
            } else {
                h2 = kd2Var.h(j32Var);
            }
            if (h2) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            if (xi6Var.h()) {
                ui6Var.g(obj, obj2, j32Var);
            } else {
                ui6Var.h(obj2, j32Var, null, null);
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ms0(xi6Var, ui6Var, obj, obj2, j32Var, i2);
        }
    }

    public static final boolean g(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final ed2 h(ed2 ed2Var) {
        if (ed2Var == null) {
            ed2Var = null;
        }
        if (ed2Var != null) {
            return ed2Var;
        }
        eu0.b("Inconsistent composition");
        v71.e();
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [oc1, s0] */
    public static oc1 i(v11 v11Var, l11 l11Var, ic2 ic2Var, int i2) {
        if ((i2 & 1) != 0) {
            l11Var = it1.x;
        }
        ?? s0Var = new s0(bx7.E(v11Var, l11Var), true, true);
        s0Var.i0(y11.x, s0Var, ic2Var);
        return s0Var;
    }

    public static cn7 j(List list, ub2 ub2Var, ic2 ic2Var) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) ub2Var.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) ub2Var.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
        }
        if (next != null) {
            ((Number) ub2Var.invoke(next)).intValue();
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((Number) ub2Var.invoke(it2.next())).intValue() == 0) {
                        ze0.k("There should be no empty entries");
                        return null;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            k(arrayList, list, 0, ub2Var, ic2Var);
            arrayList.trimToSize();
            return new cn7(new ts((char) 0, nt1.x, arrayList));
        }
        p65.h("Unable to build char tree from an empty list");
        return null;
    }

    public static void k(ArrayList arrayList, List list, int i2, ub2 ub2Var, ic2 ic2Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character ch = (Character) ic2Var.invoke(obj, Integer.valueOf(i2));
            ch.getClass();
            Object obj2 = linkedHashMap.get(ch);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(ch, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char charValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i3 = i2 + 1;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (((Number) ub2Var.invoke(obj3)).intValue() > i3) {
                    arrayList3.add(obj3);
                }
            }
            k(arrayList2, arrayList3, i3, ub2Var, ic2Var);
            arrayList2.trimToSize();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list2) {
                if (((Number) ub2Var.invoke(obj4)).intValue() == i3) {
                    arrayList4.add(obj4);
                }
            }
            arrayList.add(new ts(charValue, arrayList4, arrayList2));
        }
    }

    public static byte[] l(UUID uuid, byte[] bArr) {
        int i2;
        if (bArr != null) {
            i2 = bArr.length;
        } else {
            i2 = 0;
        }
        int i3 = i2 + 32;
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        allocate.putInt(i3);
        allocate.putInt(1886614376);
        allocate.putInt(0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        } else {
            allocate.putInt(0);
        }
        return allocate.array();
    }

    public static final void m(long j2, long j3, long j4) {
        if ((j3 | j4) >= 0 && j3 <= j2 && j2 - j3 >= j4) {
            return;
        }
        StringBuilder n = zo5.n(j2, "size=", " offset=");
        n.append(j3);
        n.append(" byteCount=");
        n.append(j4);
        throw new ArrayIndexOutOfBoundsException(n.toString());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:56|(1:(2:58|(1:111)(1:62))(2:113|114))|(5:106|107|(8:80|81|(1:(3:83|(1:101)(1:(1:89)(2:86|87))|88)(2:102|(1:104)))|90|(1:100)(1:94)|95|(1:97)|99)|68|(1:79)(4:70|(1:78)|76|77))|64|(1:66)|80|81|(2:(0)(0)|88)|90|(1:92)|100|95|(0)|99|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00fa, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00b4, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166 A[Catch: NoSuchFieldException -> 0x0195, TryCatch #1 {NoSuchFieldException -> 0x0195, blocks: (B:81:0x0159, B:83:0x0166, B:92:0x0182, B:94:0x0188, B:95:0x018e, B:97:0x0192, B:88:0x017a), top: B:80:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192 A[Catch: NoSuchFieldException -> 0x0195, TRY_LEAVE, TryCatch #1 {NoSuchFieldException -> 0x0195, blocks: (B:81:0x0159, B:83:0x0166, B:92:0x0182, B:94:0x0188, B:95:0x018e, B:97:0x0192, B:88:0x017a), top: B:80:0x0159 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.x73 n(defpackage.e73 r16, defpackage.x73... r17) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl7.n(e73, x73[]):x73");
    }

    public static c75 o(c36 c36Var) {
        c75 c75Var;
        String G = c36Var.G();
        int p = c36Var.p();
        G.getClass();
        TreeMap treeMap = c75.E;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(p));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                c75Var = (c75) ceilingEntry.getValue();
                c75Var.getClass();
                c75Var.x = G;
                c75Var.D = p;
            } else {
                c75Var = new c75(p);
                c75Var.x = G;
                c75Var.D = p;
            }
        }
        c36Var.I(new nb2(c75Var, (byte) 1));
        return c75Var;
    }

    public static final qi6 p(xi6 xi6Var, tk6 tk6Var, String str, kd2 kd2Var, int i2, int i3) {
        pi6 pi6Var;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f2 = kd2Var.f(xi6Var);
        Object Q = kd2Var.Q();
        Object obj = au0.a;
        if (f2 || Q == obj) {
            Q = new qi6(xi6Var, tk6Var, str);
            kd2Var.n0(Q);
        }
        qi6 qi6Var = (qi6) Q;
        boolean f3 = kd2Var.f(xi6Var) | kd2Var.h(qi6Var);
        Object Q2 = kd2Var.Q();
        if (f3 || Q2 == obj) {
            Q2 = new ll5((Object) xi6Var, (Object) qi6Var, (byte) 15);
            kd2Var.n0(Q2);
        }
        db.c(qi6Var, (ub2) Q2, kd2Var);
        if (xi6Var.h() && (pi6Var = (pi6) qi6Var.b.getValue()) != null) {
            xi6 xi6Var2 = qi6Var.c;
            pi6Var.x.g(pi6Var.z.invoke(xi6Var2.f().a()), pi6Var.z.invoke(xi6Var2.f().c()), (j32) pi6Var.y.invoke(xi6Var2.f()));
        }
        return qi6Var;
    }

    public static final ui6 q(xi6 xi6Var, Object obj, Object obj2, j32 j32Var, tk6 tk6Var, kd2 kd2Var, int i2) {
        ub2 ub2Var;
        boolean f2 = kd2Var.f(xi6Var);
        Object Q = kd2Var.Q();
        Object obj3 = au0.a;
        if (f2 || Q == obj3) {
            ft5 b2 = et5.b();
            if (b2 != null) {
                ub2Var = b2.e();
            } else {
                ub2Var = null;
            }
            ub2 ub2Var2 = ub2Var;
            ft5 e2 = et5.e(b2);
            try {
                rl rlVar = (rl) tk6Var.a.invoke(obj2);
                rlVar.d();
                Q = new ui6(xi6Var, obj, rlVar, tk6Var);
                et5.k(b2, e2, ub2Var2);
                kd2Var.n0(Q);
            } catch (Throwable th) {
                et5.k(b2, e2, ub2Var2);
                throw th;
            }
        }
        ui6 ui6Var = (ui6) Q;
        f(xi6Var, ui6Var, obj, obj2, j32Var, kd2Var, 0);
        boolean f3 = kd2Var.f(xi6Var) | kd2Var.f(ui6Var);
        Object Q2 = kd2Var.Q();
        if (f3 || Q2 == obj3) {
            Q2 = new ll5((Object) xi6Var, (Object) ui6Var, (byte) 13);
            kd2Var.n0(Q2);
        }
        db.c(ui6Var, (ub2) Q2, kd2Var);
        return ui6Var;
    }

    public static boolean r(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static s81 s(kd2 kd2Var) {
        float f2 = ow5.a;
        ud1 ud1Var = (ud1) kd2Var.j(bv0.h);
        boolean c2 = kd2Var.c(ud1Var.b());
        Object Q = kd2Var.Q();
        Object obj = au0.a;
        if (c2 || Q == obj) {
            Q = new f61(new eo3(ud1Var));
            kd2Var.n0(Q);
        }
        f61 f61Var = (f61) Q;
        boolean f3 = kd2Var.f(f61Var);
        Object Q2 = kd2Var.Q();
        if (f3 || Q2 == obj) {
            Q2 = new s81(f61Var);
            kd2Var.n0(Q2);
        }
        return (s81) Q2;
    }

    public static Object t(j11 j11Var, Object obj, ic2 ic2Var) {
        ic2Var.getClass();
        return ic2Var.invoke(obj, j11Var);
    }

    public static j11 u(j11 j11Var, k11 k11Var) {
        k11Var.getClass();
        if (a34.i(j11Var.getKey(), k11Var)) {
            return j11Var;
        }
        return null;
    }

    public static String v(int i2) {
        if (i2 != 0) {
            if (i2 != 2100) {
                if (i2 != 2103) {
                    if (i2 != 7) {
                        if (i2 != 8) {
                            if (i2 != 2200) {
                                if (i2 != 2201) {
                                    switch (i2) {
                                        case 13:
                                            return "An unknown, unexpected error has occurred.";
                                        case 14:
                                            return "A blocking call was interrupted while waiting and did not run to completion.";
                                        case 15:
                                            return "An operation has timed out.";
                                        default:
                                            switch (i2) {
                                                case 2000:
                                                    return "Authentication failure.";
                                                case 2001:
                                                    return "An invalid request was made.";
                                                case 2002:
                                                    return "An in-progress request has been canceled, most likely because another action has preempted it.";
                                                case 2003:
                                                    return "The request was disallowed and could not be completed.";
                                                case 2004:
                                                    return "A requested application could not be found.";
                                                case 2005:
                                                    return "A requested application is not currently running.";
                                                case 2006:
                                                    return "A message could not be sent because it is too large.";
                                                case 2007:
                                                    return "A message could not be sent because there is not enough room in the send buffer at this time.";
                                                default:
                                                    if (i2 >= -999 && i2 <= 999) {
                                                        if (i2 != 0) {
                                                            if (i2 != 7) {
                                                                if (i2 != 14) {
                                                                    if (i2 != 15) {
                                                                        return wc7.u(i2);
                                                                    }
                                                                    return "TIMEOUT";
                                                                }
                                                                return "INTERRUPTED";
                                                            }
                                                            return "NETWORK_ERROR";
                                                        }
                                                        return "SUCCESS";
                                                    }
                                                    if (i2 >= 2000 && i2 <= 2049) {
                                                        if (i2 != 2015) {
                                                            switch (i2) {
                                                                case 2000:
                                                                    return "AUTHENTICATION_FAILED";
                                                                case 2001:
                                                                    return "INVALID_REQUEST";
                                                                case 2002:
                                                                    return "CANCELED";
                                                                case 2003:
                                                                    return "NOT_ALLOWED";
                                                                case 2004:
                                                                    return "APPLICATION_NOT_FOUND";
                                                                case 2005:
                                                                    return "APPLICATION_NOT_RUNNING";
                                                                case 2006:
                                                                    return "MESSAGE_TOO_LARGE";
                                                                case 2007:
                                                                    return "MESSAGE_SEND_BUFFER_TOO_FULL";
                                                                default:
                                                                    Locale locale = Locale.ROOT;
                                                                    return qx1.h(i2, "Common cast status code ");
                                                            }
                                                        }
                                                        return "TCP_PROBER_FAIL_TO_VERIFY_DEVICE";
                                                    }
                                                    if (i2 >= 2050 && i2 <= 2059) {
                                                        Locale locale2 = Locale.ROOT;
                                                        return qx1.h(i2, "Cast controller status code ");
                                                    }
                                                    if (i2 >= 2100 && i2 <= 2109) {
                                                        Locale locale3 = Locale.ROOT;
                                                        return qx1.h(i2, "Media control channel status code ");
                                                    }
                                                    if (i2 >= 2150 && i2 <= 2169) {
                                                        Locale locale4 = Locale.ROOT;
                                                        return qx1.h(i2, "Cast session status code ");
                                                    }
                                                    if (i2 >= 2200 && i2 <= 2219) {
                                                        Locale locale5 = Locale.ROOT;
                                                        return qx1.h(i2, "Cast remote display status code ");
                                                    }
                                                    if (i2 >= 2250 && i2 <= 2299) {
                                                        Locale locale6 = Locale.ROOT;
                                                        return qx1.h(i2, "Cast socket status code ");
                                                    }
                                                    if (i2 >= 2300 && i2 <= 2309) {
                                                        Locale locale7 = Locale.ROOT;
                                                        return qx1.h(i2, "Cast service status code ");
                                                    }
                                                    if (i2 >= 2310 && i2 <= 2319) {
                                                        Locale locale8 = Locale.ROOT;
                                                        return qx1.h(i2, "Endpoint switch status code ");
                                                    }
                                                    if (i2 >= 2350 && i2 <= 2359) {
                                                        Locale locale9 = Locale.ROOT;
                                                        return qx1.h(i2, "Cast multizone device status code ");
                                                    }
                                                    if (i2 >= 2400 && i2 <= 2419) {
                                                        Locale locale10 = Locale.ROOT;
                                                        return qx1.h(i2, "Cast relay casting status code ");
                                                    }
                                                    if (i2 >= 2450 && i2 <= 2469) {
                                                        Locale locale11 = Locale.ROOT;
                                                        return qx1.h(i2, "Cast nearby casting status code ");
                                                    }
                                                    if (i2 >= 2420 && i2 <= 2439) {
                                                        Locale locale12 = Locale.ROOT;
                                                        return qx1.h(i2, "Remote connection status code ");
                                                    }
                                                    if (i2 >= 2470 && i2 <= 2479) {
                                                        Locale locale13 = Locale.ROOT;
                                                        return qx1.h(i2, "Cast application status code ");
                                                    }
                                                    if (i2 >= 2490 && i2 <= 2499) {
                                                        Locale locale14 = Locale.ROOT;
                                                        return qx1.h(i2, "Cast media loading status code ");
                                                    }
                                                    Locale locale15 = Locale.ROOT;
                                                    return qx1.h(i2, "Unknown cast status code ");
                                            }
                                    }
                                }
                                return "The Cast Remote Display service was disconnected.";
                            }
                            return "The Cast Remote Display service could not be created.";
                        }
                        return "An internal error has occurred.";
                    }
                    return "Network I/O error.";
                }
                return "The request's progress is no longer being tracked because another request of the same type has been made before the first request completed.";
            }
            return "The in-progress request failed.";
        }
        return "Success.";
    }

    public static final boolean w(float[] fArr, float[] fArr2) {
        boolean z;
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        if (f30 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final x73 x(Object obj, x73... x73VarArr) {
        Class[] clsArr;
        try {
            if (x73VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = x73VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i2 = 0; i2 < length; i2++) {
                    clsArr2[i2] = x73.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(x73VarArr, x73VarArr.length));
            if (invoke instanceof x73) {
                return (x73) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e2.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [s0, bx5] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final bx5 y(v11 v11Var, l11 l11Var, y11 y11Var, ic2 ic2Var) {
        ?? r2;
        l11 E = bx7.E(v11Var, l11Var);
        y11Var.getClass();
        if (y11Var == y11.y) {
            r2 = new gf3(E, ic2Var);
        } else {
            r2 = new s0(E, true, true);
        }
        r2.i0(y11Var, r2, ic2Var);
        return r2;
    }

    public static bx5 z(v11 v11Var, l11 l11Var, y11 y11Var, ic2 ic2Var, int i2) {
        if ((i2 & 1) != 0) {
            l11Var = it1.x;
        }
        if ((i2 & 2) != 0) {
            y11Var = y11.x;
        }
        return y(v11Var, l11Var, y11Var, ic2Var);
    }

    public abstract void C(Throwable th);

    public abstract void D(zp2 zp2Var);
}
