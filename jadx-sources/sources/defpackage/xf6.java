package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Parcel;
import android.util.TypedValue;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xf6 implements nw4, k16, g25, hs7 {
    public static Boolean B;
    public Object A;
    public final /* synthetic */ byte x;
    public Object y;
    public final Object z;

    public xf6(byte b) {
        this.x = b;
        switch (b) {
            case 4:
                this.z = new ArrayDeque();
                this.A = null;
                this.y = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                return;
            case 9:
                this.y = new HashMap();
                this.z = new HashMap();
                this.A = new HashMap();
                return;
            default:
                this.y = new WeakHashMap();
                this.z = new WeakHashMap();
                this.A = new WeakHashMap();
                return;
        }
    }

    @Override // defpackage.k16
    public int a(long j) {
        long[] jArr = (long[]) this.A;
        int b = eq6.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    @Override // defpackage.g25
    public void accept(Object obj, Object obj2) {
        boolean z = false;
        p76 p76Var = (p76) obj2;
        switch (this.x) {
            case 6:
                sm7 sm7Var = (sm7) this.y;
                s25 s25Var = (s25) this.z;
                String str = (String) this.A;
                t98 t98Var = (t98) obj;
                if (sm7Var.F != 1) {
                    z = true;
                }
                a34.A("Not active connection", z);
                if (s25Var != null) {
                    uh7 uh7Var = (uh7) t98Var.m();
                    lp i = rv5.i();
                    Parcel K = uh7Var.K();
                    K.writeString(str);
                    nn7.b(K, i);
                    uh7Var.O(K, 12);
                }
                p76Var.b(null);
                return;
            case 7:
            default:
                xw7 xw7Var = (xw7) ((yw7) obj).m();
                kw7 kw7Var = new kw7((ww7) this.y, (gs1) this.A);
                String str2 = (String) this.z;
                Parcel K2 = xw7Var.K();
                K2.writeString(str2);
                tm7.c(K2, kw7Var);
                xw7Var.M(K2, 28);
                return;
            case 8:
                sm7 sm7Var2 = (sm7) this.y;
                String str3 = (String) this.z;
                String str4 = (String) this.A;
                sm7Var2.j();
                uh7 uh7Var2 = (uh7) ((t98) obj).m();
                lp i2 = rv5.i();
                Parcel K3 = uh7Var2.K();
                K3.writeString(str3);
                K3.writeString(str4);
                int i3 = nn7.a;
                K3.writeInt(0);
                nn7.b(K3, i2);
                uh7Var2.O(K3, 14);
                synchronized (sm7Var2.r) {
                    try {
                        if (sm7Var2.o != null) {
                            sm7Var2.l(2477);
                        }
                        sm7Var2.o = p76Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // defpackage.hs7
    public void b(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((z18) this.A).z(true, i, th, bArr, (String) this.y, (ArrayList) this.z, map);
    }

    public Typeface c(int i, int i2, wp wpVar) {
        int resourceId = ((TypedArray) this.z).getResourceId(i, 0);
        if (resourceId != 0) {
            TypedValue typedValue = (TypedValue) this.A;
            if (typedValue == null) {
                typedValue = new TypedValue();
                this.A = typedValue;
            }
            TypedValue typedValue2 = typedValue;
            Context context = (Context) this.y;
            ThreadLocal threadLocal = m45.a;
            if (context.isRestricted()) {
                return null;
            }
            return m45.b(context, resourceId, typedValue2, i2, wpVar, true);
        }
        return null;
    }

    public void d() {
        ((TypedArray) this.z).recycle();
    }

    @Override // defpackage.k16
    public long e(int i) {
        boolean z;
        long[] jArr = (long[]) this.A;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        if (i < jArr.length) {
            z2 = true;
        }
        io3.n(z2);
        return jArr[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.qb0 f() {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf6.f():qb0");
    }

    @Override // defpackage.k16
    public List g(long j) {
        List list = (List) this.y;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.z;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                e47 e47Var = (e47) list.get(i);
                b31 b31Var = e47Var.a;
                if (b31Var.e == -3.4028235E38f) {
                    arrayList2.add(e47Var);
                } else {
                    arrayList.add(b31Var);
                }
            }
        }
        Collections.sort(arrayList2, new be((byte) 26));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            a31 a = ((e47) arrayList2.get(i3)).a.a();
            a.e = (-1) - i3;
            a.f = 1;
            arrayList.add(a.a());
        }
        return arrayList;
    }

    @Override // defpackage.nw4
    public Object get() {
        return new hj6(new xb5((byte) 8), new z95((byte) 7), (ka1) ((kz) this.y).get(), (kp6) ((ls0) this.z).get(), (zp2) ((zp2) this.A).get());
    }

    @Override // defpackage.k16
    public int h() {
        return ((long[]) this.A).length;
    }

    public File i() {
        String str = (String) ((r26) this.z).get();
        String str2 = (String) ((r26) this.A).get();
        return new File(h11.l(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }

    public void j(int i, String str, String str2) {
        ((HashMap) this.y).put(str, str2);
        ((HashMap) this.z).put(str2, str);
        ((HashMap) this.A).put(str, Integer.valueOf(i));
    }

    public boolean k() {
        xz7 c = ((sx7) this.y).g.c();
        if (c.t() && ((AbstractCollection) c.y()).contains(ke7.FILE)) {
            return true;
        }
        return false;
    }

    public xf6(s25 s25Var) {
        this.x = (byte) 7;
        this.A = s25Var;
        this.z = new AtomicLong((qi0.b.nextLong() & 65535) * 10000);
    }

    public xf6(final we7 we7Var, final String str) {
        this.x = (byte) 11;
        this.y = m30.d;
        final byte b = 1;
        this.z = mv5.e(new r26(this) { // from class: lz7
            public final /* synthetic */ xf6 y;

            {
                this.y = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0075. Please report as an issue. */
            @Override // defpackage.r26
            public final Object get() {
                long j;
                char c;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                byte b2 = b;
                Serializable serializable = we7Var;
                xf6 xf6Var = this.y;
                switch (b2) {
                    case 0:
                        int i = zj2.a;
                        int i2 = n34.E;
                        m34 c2 = new m34().c(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = c2.a;
                        byteBuffer.put((byte) 0);
                        if (byteBuffer.remaining() < 8) {
                            c2.a();
                        }
                        m34 c3 = c2.c("".getBytes());
                        c3.a();
                        ByteBuffer byteBuffer2 = c3.a;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            c3.d = byteBuffer2.remaining() + c3.d;
                            long j8 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c = '\b';
                                    j4 = 0;
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    c = '\b';
                                    j5 = 0;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    j6 = 0;
                                    c = '\b';
                                    j5 = ((byteBuffer2.get(5) & 255) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    j6 = (byteBuffer2.get(6) & 255) << 48;
                                    c = '\b';
                                    j5 = ((byteBuffer2.get(5) & 255) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 10:
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 11:
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 12:
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 13:
                                    j8 ^= (byteBuffer2.get(12) & 255) << 32;
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    j8 ^= (byteBuffer2.get(13) & 255) << 40;
                                    j8 ^= (byteBuffer2.get(12) & 255) << 32;
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j8 = (byteBuffer2.get(14) & 255) << 48;
                                    j8 ^= (byteBuffer2.get(13) & 255) << 40;
                                    j8 ^= (byteBuffer2.get(12) & 255) << 32;
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    throw new AssertionError("Should never get here.");
                            }
                        }
                        long j9 = c3.b;
                        long j10 = c3.d;
                        long j11 = j9 ^ j10;
                        long j12 = j10 ^ c3.c;
                        long j13 = j11 + j12;
                        long j14 = j12 + j13;
                        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                        long j19 = j18 ^ (j18 >>> 33);
                        long j20 = (j16 ^ (j16 >>> 33)) + j19;
                        c3.b = j20;
                        c3.c = j19 + j20;
                        byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(c3.b).putLong(c3.c).array();
                        array.getClass();
                        byte[] bArr = (byte[]) array.clone();
                        l30 l30Var = (l30) xf6Var.y;
                        l30Var.getClass();
                        return l30Var.a(bArr.length, bArr);
                    default:
                        l30 l30Var2 = (l30) xf6Var.y;
                        byte[] m = ((we7) serializable).m();
                        l30Var2.getClass();
                        return l30Var2.a(m.length, m);
                }
            }
        });
        final byte b2 = 0;
        this.A = mv5.e(new r26(this) { // from class: lz7
            public final /* synthetic */ xf6 y;

            {
                this.y = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0075. Please report as an issue. */
            @Override // defpackage.r26
            public final Object get() {
                long j;
                char c;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                byte b22 = b2;
                Serializable serializable = str;
                xf6 xf6Var = this.y;
                switch (b22) {
                    case 0:
                        int i = zj2.a;
                        int i2 = n34.E;
                        m34 c2 = new m34().c(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = c2.a;
                        byteBuffer.put((byte) 0);
                        if (byteBuffer.remaining() < 8) {
                            c2.a();
                        }
                        m34 c3 = c2.c("".getBytes());
                        c3.a();
                        ByteBuffer byteBuffer2 = c3.a;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            c3.d = byteBuffer2.remaining() + c3.d;
                            long j8 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c = '\b';
                                    j4 = 0;
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    c = '\b';
                                    j5 = 0;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    j6 = 0;
                                    c = '\b';
                                    j5 = ((byteBuffer2.get(5) & 255) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    j6 = (byteBuffer2.get(6) & 255) << 48;
                                    c = '\b';
                                    j5 = ((byteBuffer2.get(5) & 255) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 10:
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 11:
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 12:
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 13:
                                    j8 ^= (byteBuffer2.get(12) & 255) << 32;
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    j8 ^= (byteBuffer2.get(13) & 255) << 40;
                                    j8 ^= (byteBuffer2.get(12) & 255) << 32;
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j8 = (byteBuffer2.get(14) & 255) << 48;
                                    j8 ^= (byteBuffer2.get(13) & 255) << 40;
                                    j8 ^= (byteBuffer2.get(12) & 255) << 32;
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    c3.b = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.b;
                                    c3.c ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    throw new AssertionError("Should never get here.");
                            }
                        }
                        long j9 = c3.b;
                        long j10 = c3.d;
                        long j11 = j9 ^ j10;
                        long j12 = j10 ^ c3.c;
                        long j13 = j11 + j12;
                        long j14 = j12 + j13;
                        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                        long j19 = j18 ^ (j18 >>> 33);
                        long j20 = (j16 ^ (j16 >>> 33)) + j19;
                        c3.b = j20;
                        c3.c = j19 + j20;
                        byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(c3.b).putLong(c3.c).array();
                        array.getClass();
                        byte[] bArr = (byte[]) array.clone();
                        l30 l30Var = (l30) xf6Var.y;
                        l30Var.getClass();
                        return l30Var.a(bArr.length, bArr);
                    default:
                        l30 l30Var2 = (l30) xf6Var.y;
                        byte[] m = ((we7) serializable).m();
                        l30Var2.getClass();
                        return l30Var2.a(m.length, m);
                }
            }
        });
    }

    public xf6(sx7 sx7Var, String str) {
        this.x = (byte) 13;
        this.y = sx7Var;
        this.A = str;
        Context context = sx7Var.b;
        Pattern pattern = c58.a;
        tp tpVar = new tp(context, (byte) 13);
        tpVar.v("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        tpVar.w(sb.toString());
        this.z = tpVar.x();
    }

    public xf6(z18 z18Var, String str, ArrayList arrayList) {
        this.x = (byte) 12;
        this.y = str;
        this.z = arrayList;
        this.A = z18Var;
    }

    public xf6(ArrayList arrayList) {
        this.x = (byte) 3;
        this.y = Collections.unmodifiableList(new ArrayList(arrayList));
        this.z = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            e47 e47Var = (e47) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.z;
            jArr[i2] = e47Var.b;
            jArr[i2 + 1] = e47Var.c;
        }
        long[] jArr2 = (long[]) this.z;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.A = copyOf;
        Arrays.sort(copyOf);
    }

    public /* synthetic */ xf6(Object obj, Object obj2, Object obj3, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    public xf6(Context context, TypedArray typedArray) {
        this.x = (byte) 0;
        this.y = context;
        this.z = typedArray;
    }
}
