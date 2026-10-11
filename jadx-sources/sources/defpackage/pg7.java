package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pg7 implements xg7 {
    public static final int[] k = new int[0];
    public static final Unsafe l = ih7.k();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final qe7 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final p7 j;

    public pg7(int[] iArr, Object[] objArr, int i, int i2, qe7 qe7Var, int[] iArr2, int i3, int i4, p7 p7Var, qc5 qc5Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = qe7Var instanceof mf7;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = p7Var;
        this.e = qe7Var;
    }

    public static int l(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof mf7) {
            return ((mf7) obj).e();
        }
        return true;
    }

    public static void n(Object obj) {
        if (m(obj)) {
            return;
        }
        ze0.k("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int o(long j, Object obj) {
        return ((Integer) ih7.h(j, obj)).intValue();
    }

    public static long p(long j, Object obj) {
        return ((Long) ih7.h(j, obj)).longValue();
    }

    public static final int x(byte[] bArr, int i, int i2, lh7 lh7Var, Class cls, m97 m97Var) {
        lh7 lh7Var2 = lh7.z;
        boolean z = false;
        switch (lh7Var.ordinal()) {
            case 0:
                int i3 = i + 8;
                m97Var.d = Double.valueOf(Double.longBitsToDouble(lt5.u(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                m97Var.d = Float.valueOf(Float.intBitsToFloat(lt5.t(i, bArr)));
                return i4;
            case 2:
            case 3:
                int s = lt5.s(bArr, i, m97Var);
                m97Var.d = Long.valueOf(m97Var.b);
                return s;
            case 4:
            case 12:
            case 13:
                int p = lt5.p(bArr, i, m97Var);
                m97Var.d = Integer.valueOf(m97Var.a);
                return p;
            case 5:
            case 15:
                int i5 = i + 8;
                m97Var.d = Long.valueOf(lt5.u(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                m97Var.d = Integer.valueOf(lt5.t(i, bArr));
                return i6;
            case 7:
                int s2 = lt5.s(bArr, i, m97Var);
                if (m97Var.b != 0) {
                    z = true;
                }
                m97Var.d = Boolean.valueOf(z);
                return s2;
            case 8:
                return lt5.v(bArr, i, m97Var);
            case 9:
            default:
                v71.i("unsupported field type.");
                return 0;
            case 10:
                xg7 a = ug7.c.a(cls);
                mf7 a2 = a.a();
                int x = lt5.x(a2, a, bArr, i, i2, m97Var);
                a.f(a2);
                m97Var.d = a2;
                return x;
            case 11:
                return lt5.w(bArr, i, m97Var);
            case 16:
                int p2 = lt5.p(bArr, i, m97Var);
                m97Var.d = Integer.valueOf(ze7.j(m97Var.a));
                return p2;
            case 17:
                int s3 = lt5.s(bArr, i, m97Var);
                m97Var.d = Long.valueOf(ze7.k(m97Var.b));
                return s3;
        }
    }

    public static Field z(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            qx1.x(sb, "Field ", str, " for ", name);
            ov3.k(h11.k(sb, " not found. Known fields are ", arrays), e);
            return null;
        }
    }

    public final void A(int i, Object obj, Object obj2) {
        if (!s(i, obj2)) {
            return;
        }
        long k2 = k(i) & 1048575;
        Unsafe unsafe = l;
        Object object = unsafe.getObject(obj2, k2);
        if (object != null) {
            xg7 C = C(i);
            if (!s(i, obj)) {
                if (!m(object)) {
                    unsafe.putObject(obj, k2, object);
                } else {
                    mf7 a = C.a();
                    C.b(a, object);
                    unsafe.putObject(obj, k2, a);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, k2);
            if (!m(object2)) {
                mf7 a2 = C.a();
                C.b(a2, object2);
                unsafe.putObject(obj, k2, a2);
                object2 = a2;
            }
            C.b(object2, object);
            return;
        }
        int i2 = this.a[i];
        String obj3 = obj2.toString();
        jz7.c(String.valueOf(i2).length() + 38 + obj3.length(), i2, obj3);
    }

    public final void B(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (!u(i2, i, obj2)) {
            return;
        }
        long k2 = k(i) & 1048575;
        Unsafe unsafe = l;
        Object object = unsafe.getObject(obj2, k2);
        if (object != null) {
            xg7 C = C(i);
            if (!u(i2, i, obj)) {
                if (!m(object)) {
                    unsafe.putObject(obj, k2, object);
                } else {
                    mf7 a = C.a();
                    C.b(a, object);
                    unsafe.putObject(obj, k2, a);
                }
                v(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, k2);
            if (!m(object2)) {
                mf7 a2 = C.a();
                C.b(a2, object2);
                unsafe.putObject(obj, k2, a2);
                object2 = a2;
            }
            C.b(object2, object);
            return;
        }
        int i3 = iArr[i];
        String obj3 = obj2.toString();
        jz7.c(String.valueOf(i3).length() + 38 + obj3.length(), i3, obj3);
    }

    public final xg7 C(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        xg7 xg7Var = (xg7) objArr[i3];
        if (xg7Var != null) {
            return xg7Var;
        }
        xg7 a = ug7.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final Object D(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final je7 E(int i) {
        int i2 = i / 3;
        return (je7) this.b[i2 + i2 + 1];
    }

    public final Object F(int i, Object obj) {
        xg7 C = C(i);
        int k2 = k(i) & 1048575;
        if (!s(i, obj)) {
            return C.a();
        }
        Object object = l.getObject(obj, k2);
        if (m(object)) {
            return object;
        }
        mf7 a = C.a();
        if (object != null) {
            C.b(a, object);
        }
        return a;
    }

    public final void G(int i, Object obj, Object obj2) {
        l.putObject(obj, k(i) & 1048575, obj2);
        t(i, obj);
    }

    public final Object H(int i, int i2, Object obj) {
        xg7 C = C(i2);
        if (!u(i, i2, obj)) {
            return C.a();
        }
        Object object = l.getObject(obj, k(i2) & 1048575);
        if (m(object)) {
            return object;
        }
        mf7 a = C.a();
        if (object != null) {
            C.b(a, object);
        }
        return a;
    }

    public final void I(int i, int i2, Object obj, Object obj2) {
        l.putObject(obj, k(i2) & 1048575, obj2);
        v(i, i2, obj);
    }

    public final Object J(Object obj, int i, Object obj2, p7 p7Var, Object obj3) {
        je7 E;
        int i2 = this.a[i];
        Object h = ih7.h(k(i) & 1048575, obj);
        if (h == null || (E = E(i)) == null) {
            return obj2;
        }
        xf6 xf6Var = ((fg7) D(i)).a;
        Iterator it = ((gg7) h).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!E.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    p7Var.getClass();
                    obj2 = p7.b(obj3);
                }
                int b = fg7.b(xf6Var, entry.getKey(), entry.getValue());
                ve7 ve7Var = we7.y;
                byte[] bArr = new byte[b];
                boolean z = ef7.b;
                af7 af7Var = new af7(b, bArr);
                try {
                    fg7.a(af7Var, xf6Var, entry.getKey(), entry.getValue());
                    if (af7Var.x() <= 0) {
                        if (af7Var.x() >= 0) {
                            ve7 ve7Var2 = new ve7(bArr);
                            p7Var.getClass();
                            ((gh7) obj2).d((i2 << 3) | 2, ve7Var2);
                            it.remove();
                        } else {
                            ze0.m("Wrote more data than expected.");
                            return null;
                        }
                    } else {
                        ze0.m("Did not write as much data as expected.");
                        return null;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    public final void K(int i, fm0 fm0Var, Object obj) {
        boolean z;
        ze7 ze7Var = (ze7) fm0Var.B;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j = i & 1048575;
        if (z) {
            fm0Var.Y(2);
            ih7.i(j, obj, ze7Var.x());
        } else if (this.f) {
            fm0Var.Y(2);
            ih7.i(j, obj, ze7Var.w());
        } else {
            ih7.i(j, obj, fm0Var.g0());
        }
    }

    @Override // defpackage.xg7
    public final mf7 a() {
        return ((mf7) this.e).g();
    }

    @Override // defpackage.xg7
    public final void b(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int k2 = k(i);
                int i2 = 1048575 & k2;
                int l2 = l(k2);
                int i3 = iArr[i];
                long j = i2;
                switch (l2) {
                    case 0:
                        if (s(i, obj2)) {
                            qo6 qo6Var = ih7.c;
                            obj3 = obj;
                            qo6Var.v(obj3, j, qo6Var.u(j, obj2));
                            t(i, obj3);
                            break;
                        }
                        break;
                    case 1:
                        if (s(i, obj2)) {
                            qo6 qo6Var2 = ih7.c;
                            qo6Var2.t(obj, j, qo6Var2.s(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 2:
                        if (s(i, obj2)) {
                            ih7.g(obj, j, ih7.f(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 3:
                        if (s(i, obj2)) {
                            ih7.g(obj, j, ih7.f(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 4:
                        if (s(i, obj2)) {
                            ih7.e(obj, j, ih7.d(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 5:
                        if (s(i, obj2)) {
                            ih7.g(obj, j, ih7.f(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 6:
                        if (s(i, obj2)) {
                            ih7.e(obj, j, ih7.d(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 7:
                        if (s(i, obj2)) {
                            qo6 qo6Var3 = ih7.c;
                            qo6Var3.r(obj, j, qo6Var3.q(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 8:
                        if (s(i, obj2)) {
                            ih7.i(j, obj, ih7.h(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 9:
                        A(i, obj, obj2);
                        break;
                    case 10:
                        if (s(i, obj2)) {
                            ih7.i(j, obj, ih7.h(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 11:
                        if (s(i, obj2)) {
                            ih7.e(obj, j, ih7.d(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 12:
                        if (s(i, obj2)) {
                            ih7.e(obj, j, ih7.d(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 13:
                        if (s(i, obj2)) {
                            ih7.e(obj, j, ih7.d(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 14:
                        if (s(i, obj2)) {
                            ih7.g(obj, j, ih7.f(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 15:
                        if (s(i, obj2)) {
                            ih7.e(obj, j, ih7.d(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 16:
                        if (s(i, obj2)) {
                            ih7.g(obj, j, ih7.f(j, obj2));
                            t(i, obj);
                            break;
                        }
                        break;
                    case 17:
                        A(i, obj, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                        yf7 yf7Var = (yf7) ih7.h(j, obj);
                        yf7 yf7Var2 = (yf7) ih7.h(j, obj2);
                        int size = yf7Var.size();
                        int size2 = yf7Var2.size();
                        if (size > 0 && size2 > 0) {
                            if (!((re7) yf7Var).x) {
                                yf7Var = yf7Var.l(size2 + size);
                            }
                            yf7Var.addAll(yf7Var2);
                        }
                        if (size > 0) {
                            yf7Var2 = yf7Var;
                        }
                        ih7.i(j, obj, yf7Var2);
                        break;
                    case 50:
                        p7 p7Var = yg7.a;
                        ih7.i(j, obj, xb5.b(ih7.h(j, obj), ih7.h(j, obj2)));
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                        if (u(i3, i, obj2)) {
                            ih7.i(j, obj, ih7.h(j, obj2));
                            v(i3, i, obj);
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                        B(i, obj, obj2);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    case 64:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE:
                        if (u(i3, i, obj2)) {
                            ih7.i(j, obj, ih7.h(j, obj2));
                            v(i3, i, obj);
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS_VALUE:
                        B(i, obj, obj2);
                        break;
                }
                obj3 = obj;
                i += 3;
                obj = obj3;
            } else {
                yg7.b(obj, obj2);
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004b. Please report as an issue. */
    @Override // defpackage.xg7
    public final int c(qe7 qe7Var) {
        int i;
        int a;
        int b;
        int a2;
        int b2;
        int a3;
        int b3;
        int i2;
        int a4;
        int i3;
        int i4;
        int b4;
        int a5;
        int size;
        int s;
        int a6;
        int a7;
        int b5;
        int a8;
        int size2;
        int a9;
        int i5;
        int a10;
        int b6;
        int a11;
        int b7;
        int o;
        int a12;
        pg7 pg7Var = this;
        qe7 qe7Var2 = qe7Var;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = pg7Var.a;
            if (i8 < iArr.length) {
                int k2 = pg7Var.k(i8);
                int l2 = l(k2);
                int i11 = iArr[i8];
                int i12 = iArr[i8 + 2];
                int i13 = i12 & i6;
                Unsafe unsafe = l;
                if (l2 <= 17) {
                    if (i13 != i7) {
                        if (i13 == i6) {
                            i9 = 0;
                        } else {
                            i9 = unsafe.getInt(qe7Var2, i13);
                        }
                        i7 = i13;
                    }
                    i = 1 << (i12 >>> 20);
                } else {
                    i = 0;
                }
                int i14 = k2 & i6;
                if (l2 >= if7.y.x) {
                    byte b8 = if7.z.x;
                }
                long j = i14;
                switch (l2) {
                    case 0:
                        if (!pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            break;
                        }
                        i10 = zo5.d(i11 << 3, 8, i10);
                        break;
                    case 1:
                        if (!pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            break;
                        }
                        i10 = zo5.d(i11 << 3, 4, i10);
                        break;
                    case 2:
                        if (pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            long j2 = unsafe.getLong(qe7Var2, j);
                            a = ef7.a(i11 << 3);
                            b = ef7.b(j2);
                            i3 = b + a;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            long j3 = unsafe.getLong(qe7Var2, j);
                            a = ef7.a(i11 << 3);
                            b = ef7.b(j3);
                            i3 = b + a;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            long j4 = unsafe.getInt(qe7Var2, j);
                            a = ef7.a(i11 << 3);
                            b = ef7.b(j4);
                            i3 = b + a;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (!pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            break;
                        }
                        i10 = zo5.d(i11 << 3, 8, i10);
                        break;
                    case 6:
                        if (!pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            break;
                        }
                        i10 = zo5.d(i11 << 3, 4, i10);
                        break;
                    case 7:
                        if (pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            i10 = zo5.d(i11 << 3, 1, i10);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            int i15 = i11 << 3;
                            Object object = unsafe.getObject(qe7Var2, j);
                            if (object instanceof we7) {
                                a2 = ef7.a(i15);
                                b2 = ((we7) object).c();
                            } else {
                                a2 = ef7.a(i15);
                                b2 = kh7.b((String) object);
                            }
                            i10 = zo5.e(b2, b2, a2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            Object object2 = unsafe.getObject(qe7Var2, j);
                            xg7 C = pg7Var.C(i8);
                            p7 p7Var = yg7.a;
                            a3 = ef7.a(i11 << 3);
                            b3 = ((qe7) object2).b(C);
                            i10 = zo5.e(b3, b3, a3, i10);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            we7 we7Var = (we7) unsafe.getObject(qe7Var2, j);
                            a2 = ef7.a(i11 << 3);
                            b2 = we7Var.c();
                            i10 = zo5.e(b2, b2, a2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            i2 = unsafe.getInt(qe7Var2, j);
                            a4 = ef7.a(i11 << 3);
                            i10 = zo5.d(i2, a4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            long j5 = unsafe.getInt(qe7Var2, j);
                            a = ef7.a(i11 << 3);
                            b = ef7.b(j5);
                            i3 = b + a;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (!pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            break;
                        }
                        i10 = zo5.d(i11 << 3, 4, i10);
                        break;
                    case 14:
                        if (!pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            break;
                        }
                        i10 = zo5.d(i11 << 3, 8, i10);
                        break;
                    case 15:
                        if (pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            int i16 = unsafe.getInt(qe7Var2, j);
                            a4 = ef7.a(i11 << 3);
                            i2 = (i16 >> 31) ^ (i16 + i16);
                            i10 = zo5.d(i2, a4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            long j6 = unsafe.getLong(qe7Var2, j);
                            a = ef7.a(i11 << 3);
                            b = ef7.b((j6 >> 63) ^ (j6 + j6));
                            i3 = b + a;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (pg7Var.r(qe7Var2, i8, i7, i9, i)) {
                            qe7 qe7Var3 = (qe7) unsafe.getObject(qe7Var2, j);
                            xg7 C2 = pg7Var.C(i8);
                            p7 p7Var2 = yg7.a;
                            int a13 = ef7.a(i11 << 3);
                            i4 = a13 + a13;
                            b4 = qe7Var3.b(C2);
                            i3 = b4 + i4;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i3 = yg7.z(i11, (List) unsafe.getObject(qe7Var2, j));
                        i10 += i3;
                        break;
                    case 19:
                        i3 = yg7.y(i11, (List) unsafe.getObject(qe7Var2, j));
                        i10 += i3;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var3 = yg7.a;
                        if (list.size() != 0) {
                            a5 = (ef7.a(i11 << 3) * list.size()) + yg7.r(list);
                            i10 += a5;
                            break;
                        }
                        a5 = 0;
                        i10 += a5;
                    case 21:
                        List list2 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var4 = yg7.a;
                        size = list2.size();
                        if (size != 0) {
                            s = yg7.s(list2);
                            a6 = ef7.a(i11 << 3);
                            a7 = (a6 * size) + s;
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 22:
                        List list3 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var5 = yg7.a;
                        size = list3.size();
                        if (size != 0) {
                            s = yg7.v(list3);
                            a6 = ef7.a(i11 << 3);
                            a7 = (a6 * size) + s;
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 23:
                        i3 = yg7.z(i11, (List) unsafe.getObject(qe7Var2, j));
                        i10 += i3;
                        break;
                    case 24:
                        i3 = yg7.y(i11, (List) unsafe.getObject(qe7Var2, j));
                        i10 += i3;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var6 = yg7.a;
                        int size3 = list4.size();
                        if (size3 != 0) {
                            a5 = (ef7.a(i11 << 3) + 1) * size3;
                            i10 += a5;
                            break;
                        }
                        a5 = 0;
                        i10 += a5;
                    case 26:
                        List list5 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var7 = yg7.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            a7 = ef7.a(i11 << 3) * size4;
                            for (int i17 = 0; i17 < size4; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof we7) {
                                    b5 = ((we7) obj).c();
                                } else {
                                    b5 = kh7.b((String) obj);
                                }
                                a7 = zo5.d(b5, b5, a7);
                            }
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 27:
                        List list6 = (List) unsafe.getObject(qe7Var2, j);
                        xg7 C3 = pg7Var.C(i8);
                        p7 p7Var8 = yg7.a;
                        int size5 = list6.size();
                        if (size5 == 0) {
                            a8 = 0;
                        } else {
                            a8 = ef7.a(i11 << 3) * size5;
                            for (int i18 = 0; i18 < size5; i18++) {
                                int b9 = ((qe7) list6.get(i18)).b(C3);
                                a8 = zo5.d(b9, b9, a8);
                            }
                        }
                        i10 += a8;
                        break;
                    case 28:
                        List list7 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var9 = yg7.a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            a7 = ef7.a(i11 << 3) * size6;
                            for (int i19 = 0; i19 < list7.size(); i19++) {
                                int c = ((we7) list7.get(i19)).c();
                                a7 = zo5.d(c, c, a7);
                            }
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 29:
                        List list8 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var10 = yg7.a;
                        size = list8.size();
                        if (size != 0) {
                            s = yg7.w(list8);
                            a6 = ef7.a(i11 << 3);
                            a7 = (a6 * size) + s;
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 30:
                        List list9 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var11 = yg7.a;
                        size = list9.size();
                        if (size != 0) {
                            s = yg7.u(list9);
                            a6 = ef7.a(i11 << 3);
                            a7 = (a6 * size) + s;
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 31:
                        i3 = yg7.y(i11, (List) unsafe.getObject(qe7Var2, j));
                        i10 += i3;
                        break;
                    case 32:
                        i3 = yg7.z(i11, (List) unsafe.getObject(qe7Var2, j));
                        i10 += i3;
                        break;
                    case 33:
                        List list10 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var12 = yg7.a;
                        size = list10.size();
                        if (size != 0) {
                            s = yg7.x(list10);
                            a6 = ef7.a(i11 << 3);
                            a7 = (a6 * size) + s;
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 34:
                        List list11 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var13 = yg7.a;
                        size = list11.size();
                        if (size != 0) {
                            s = yg7.t(list11);
                            a6 = ef7.a(i11 << 3);
                            a7 = (a6 * size) + s;
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        List list12 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var14 = yg7.a;
                        size2 = list12.size() * 8;
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                        List list13 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var15 = yg7.a;
                        size2 = list13.size() * 4;
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                        size2 = yg7.r((List) unsafe.getObject(qe7Var2, j));
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        size2 = yg7.s((List) unsafe.getObject(qe7Var2, j));
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                        size2 = yg7.v((List) unsafe.getObject(qe7Var2, j));
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                        List list14 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var16 = yg7.a;
                        size2 = list14.size() * 8;
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                        List list15 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var17 = yg7.a;
                        size2 = list15.size() * 4;
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                        List list16 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var18 = yg7.a;
                        size2 = list16.size();
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                        size2 = yg7.w((List) unsafe.getObject(qe7Var2, j));
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                        size2 = yg7.u((List) unsafe.getObject(qe7Var2, j));
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                        List list17 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var19 = yg7.a;
                        size2 = list17.size() * 4;
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                        List list18 = (List) unsafe.getObject(qe7Var2, j);
                        p7 p7Var20 = yg7.a;
                        size2 = list18.size() * 8;
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                        size2 = yg7.x((List) unsafe.getObject(qe7Var2, j));
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                        size2 = yg7.t((List) unsafe.getObject(qe7Var2, j));
                        if (size2 > 0) {
                            a9 = ef7.a(i11 << 3);
                            i10 = zo5.e(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                        List list19 = (List) unsafe.getObject(qe7Var2, j);
                        xg7 C4 = pg7Var.C(i8);
                        p7 p7Var21 = yg7.a;
                        int size7 = list19.size();
                        if (size7 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            for (int i20 = 0; i20 < size7; i20++) {
                                qe7 qe7Var4 = (qe7) list19.get(i20);
                                int a14 = ef7.a(i11 << 3);
                                i5 += qe7Var4.b(C4) + a14 + a14;
                            }
                        }
                        i10 += i5;
                        break;
                    case 50:
                        gg7 gg7Var = (gg7) unsafe.getObject(qe7Var2, j);
                        fg7 fg7Var = (fg7) pg7Var.D(i8);
                        if (!gg7Var.isEmpty()) {
                            a7 = 0;
                            for (Map.Entry entry : gg7Var.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                xf6 xf6Var = fg7Var.a;
                                int a15 = ef7.a(i11 << 3);
                                int b10 = fg7.b(xf6Var, key, value);
                                a7 = zo5.e(b10, b10, a15, a7);
                            }
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                        if (!pg7Var.u(i11, i8, qe7Var2)) {
                            break;
                        }
                        i10 = zo5.d(i11 << 3, 8, i10);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                        if (!pg7Var.u(i11, i8, qe7Var2)) {
                            break;
                        }
                        i10 = zo5.d(i11 << 3, 4, i10);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                        if (pg7Var.u(i11, i8, qe7Var2)) {
                            long p = p(j, qe7Var2);
                            a10 = ef7.a(i11 << 3);
                            b6 = ef7.b(p);
                            i10 += b6 + a10;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                        if (pg7Var.u(i11, i8, qe7Var2)) {
                            long p2 = p(j, qe7Var2);
                            a10 = ef7.a(i11 << 3);
                            b6 = ef7.b(p2);
                            i10 += b6 + a10;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                        if (pg7Var.u(i11, i8, qe7Var2)) {
                            long o2 = o(j, qe7Var2);
                            a10 = ef7.a(i11 << 3);
                            b6 = ef7.b(o2);
                            i10 += b6 + a10;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                        if (!pg7Var.u(i11, i8, qe7Var2)) {
                            break;
                        }
                        i10 = zo5.d(i11 << 3, 8, i10);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                        if (!pg7Var.u(i11, i8, qe7Var2)) {
                            break;
                        }
                        i10 = zo5.d(i11 << 3, 4, i10);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                        if (pg7Var.u(i11, i8, qe7Var2)) {
                            i10 = zo5.d(i11 << 3, 1, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                        if (pg7Var.u(i11, i8, qe7Var2)) {
                            int i21 = i11 << 3;
                            Object object3 = unsafe.getObject(qe7Var2, j);
                            if (object3 instanceof we7) {
                                a11 = ef7.a(i21);
                                b7 = ((we7) object3).c();
                            } else {
                                a11 = ef7.a(i21);
                                b7 = kh7.b((String) object3);
                            }
                            i10 = zo5.e(b7, b7, a11, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                        if (pg7Var.u(i11, i8, qe7Var2)) {
                            Object object4 = unsafe.getObject(qe7Var2, j);
                            xg7 C5 = pg7Var.C(i8);
                            p7 p7Var22 = yg7.a;
                            a3 = ef7.a(i11 << 3);
                            b3 = ((qe7) object4).b(C5);
                            i10 = zo5.e(b3, b3, a3, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                        if (pg7Var.u(i11, i8, qe7Var2)) {
                            we7 we7Var2 = (we7) unsafe.getObject(qe7Var2, j);
                            a11 = ef7.a(i11 << 3);
                            b7 = we7Var2.c();
                            i10 = zo5.e(b7, b7, a11, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE:
                        if (pg7Var.u(i11, i8, qe7Var2)) {
                            o = o(j, qe7Var2);
                            a12 = ef7.a(i11 << 3);
                            i10 = zo5.d(o, a12, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                        if (pg7Var.u(i11, i8, qe7Var2)) {
                            long o3 = o(j, qe7Var2);
                            a10 = ef7.a(i11 << 3);
                            b6 = ef7.b(o3);
                            i10 += b6 + a10;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (!pg7Var.u(i11, i8, qe7Var2)) {
                            break;
                        }
                        i10 = zo5.d(i11 << 3, 4, i10);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME_VALUE:
                        if (!pg7Var.u(i11, i8, qe7Var2)) {
                            break;
                        }
                        i10 = zo5.d(i11 << 3, 8, i10);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE:
                        if (pg7Var.u(i11, i8, qe7Var2)) {
                            int o4 = o(j, qe7Var2);
                            a12 = ef7.a(i11 << 3);
                            o = (o4 >> 31) ^ (o4 + o4);
                            i10 = zo5.d(o, a12, i10);
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE:
                        if (pg7Var.u(i11, i8, qe7Var2)) {
                            long p3 = p(j, qe7Var2);
                            a10 = ef7.a(i11 << 3);
                            b6 = ef7.b((p3 >> 63) ^ (p3 + p3));
                            i10 += b6 + a10;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS_VALUE:
                        if (pg7Var.u(i11, i8, qe7Var2)) {
                            qe7 qe7Var5 = (qe7) unsafe.getObject(qe7Var2, j);
                            xg7 C6 = pg7Var.C(i8);
                            p7 p7Var23 = yg7.a;
                            int a16 = ef7.a(i11 << 3);
                            i4 = a16 + a16;
                            b4 = qe7Var5.b(C6);
                            i3 = b4 + i4;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                }
                i8 += 3;
                pg7Var = this;
                qe7Var2 = qe7Var;
                i6 = 1048575;
            } else {
                return ((mf7) qe7Var).zzc.c() + i10;
            }
        }
    }

    @Override // defpackage.xg7
    public final boolean d(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.h) {
            int i6 = this.g[i3];
            int k2 = this.k(i6);
            int[] iArr = this.a;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = l.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            pg7 pg7Var = this;
            Object obj2 = obj;
            if ((268435456 & k2) == 0 || pg7Var.r(obj2, i6, i, i2, i9)) {
                int l2 = l(k2);
                if (l2 != 9 && l2 != 17) {
                    if (l2 != 27) {
                        if (l2 != 60 && l2 != 68) {
                            if (l2 != 49) {
                                if (l2 != 50) {
                                    continue;
                                } else {
                                    gg7 gg7Var = (gg7) ih7.h(k2 & 1048575, obj2);
                                    if (!gg7Var.isEmpty() && ((lh7) ((fg7) pg7Var.D(i6)).a.z).x == mh7.F) {
                                        xg7 xg7Var = null;
                                        for (Object obj3 : gg7Var.values()) {
                                            if (xg7Var == null) {
                                                xg7Var = ug7.c.a(obj3.getClass());
                                            }
                                            if (!xg7Var.d(obj3)) {
                                            }
                                        }
                                    }
                                }
                                i3++;
                                this = pg7Var;
                                obj = obj2;
                                i5 = i;
                                i4 = i2;
                            }
                        } else {
                            if (pg7Var.u(iArr[i6], i6, obj2) && !pg7Var.C(i6).d(ih7.h(k2 & 1048575, obj2))) {
                            }
                            i3++;
                            this = pg7Var;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) ih7.h(k2 & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        xg7 C = pg7Var.C(i6);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (C.d(list.get(i10))) {
                            }
                        }
                    }
                    i3++;
                    this = pg7Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else {
                    if (pg7Var.r(obj2, i6, i, i2, i9) && !pg7Var.C(i6).d(ih7.h(k2 & 1048575, obj2))) {
                    }
                    i3++;
                    this = pg7Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.xg7
    public final void e(Object obj, ub7 ub7Var) {
        int[] iArr;
        int i;
        pg7 pg7Var = this;
        ef7 ef7Var = (ef7) ub7Var.y;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = pg7Var.a;
            if (i4 < iArr2.length) {
                int k2 = pg7Var.k(i4);
                int l2 = l(k2);
                int i6 = iArr2[i4];
                Unsafe unsafe = l;
                if (l2 <= 17) {
                    int i7 = iArr2[i4 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i3) {
                        if (i8 == i2) {
                            i5 = 0;
                        } else {
                            i5 = unsafe.getInt(obj, i8);
                        }
                        i3 = i8;
                    }
                    iArr = iArr2;
                    i = 1 << (i7 >>> 20);
                } else {
                    iArr = iArr2;
                    i = 0;
                }
                long j = k2 & i2;
                switch (l2) {
                    case 0:
                        if (!pg7Var.r(obj, i4, i3, i5, i)) {
                            break;
                        } else {
                            ef7Var.i(i6, Double.doubleToRawLongBits(ih7.c.u(j, obj)));
                            continue;
                        }
                    case 1:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ef7Var.g(i6, Float.floatToRawIntBits(ih7.c.s(j, obj)));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ef7Var.h(i6, unsafe.getLong(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ef7Var.h(i6, unsafe.getLong(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ef7Var.e(i6, unsafe.getInt(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ef7Var.i(i6, unsafe.getLong(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ef7Var.g(i6, unsafe.getInt(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ef7Var.j(i6, ih7.c.q(j, obj));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            Object object = unsafe.getObject(obj, j);
                            if (object instanceof String) {
                                ef7Var.k(i6, (String) object);
                                break;
                            } else {
                                ef7Var.l(i6, (we7) object);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 9:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ub7Var.g(i6, unsafe.getObject(obj, j), pg7Var.C(i4));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ef7Var.l(i6, (we7) unsafe.getObject(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ef7Var.f(i6, unsafe.getInt(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ef7Var.e(i6, unsafe.getInt(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ef7Var.g(i6, unsafe.getInt(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            ef7Var.i(i6, unsafe.getLong(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            int i9 = unsafe.getInt(obj, j);
                            ef7Var.f(i6, (i9 >> 31) ^ (i9 + i9));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            long j2 = unsafe.getLong(obj, j);
                            ef7Var.h(i6, (j2 >> 63) ^ (j2 + j2));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if (pg7Var.r(obj, i4, i3, i5, i)) {
                            Object object2 = unsafe.getObject(obj, j);
                            ef7Var.d(i6, 3);
                            pg7Var.C(i4).e((qe7) object2, ub7Var);
                            ef7Var.d(i6, 4);
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        yg7.d(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 19:
                        yg7.e(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 20:
                        yg7.f(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 21:
                        yg7.g(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 22:
                        yg7.k(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 23:
                        yg7.i(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 24:
                        yg7.n(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 25:
                        yg7.q(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 26:
                        int i10 = iArr[i4];
                        List list = (List) unsafe.getObject(obj, j);
                        p7 p7Var = yg7.a;
                        if (list != null && !list.isEmpty()) {
                            for (int i11 = 0; i11 < list.size(); i11++) {
                                ef7Var.k(i10, (String) list.get(i11));
                            }
                            break;
                        }
                        break;
                    case 27:
                        int i12 = iArr[i4];
                        List list2 = (List) unsafe.getObject(obj, j);
                        xg7 C = pg7Var.C(i4);
                        p7 p7Var2 = yg7.a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i13 = 0; i13 < list2.size(); i13++) {
                                ub7Var.g(i12, list2.get(i13), C);
                            }
                            break;
                        }
                        break;
                    case 28:
                        int i14 = iArr[i4];
                        List list3 = (List) unsafe.getObject(obj, j);
                        p7 p7Var3 = yg7.a;
                        if (list3 != null && !list3.isEmpty()) {
                            for (int i15 = 0; i15 < list3.size(); i15++) {
                                ef7Var.l(i14, (we7) list3.get(i15));
                            }
                            break;
                        }
                        break;
                    case 29:
                        yg7.l(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 30:
                        yg7.p(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 31:
                        yg7.o(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 32:
                        yg7.j(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 33:
                        yg7.m(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case 34:
                        yg7.h(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, false);
                        continue;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        yg7.d(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                        yg7.e(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                        yg7.f(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        yg7.g(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                        yg7.k(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                        yg7.i(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                        yg7.n(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                        yg7.q(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                        yg7.l(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                        yg7.p(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                        yg7.o(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                        yg7.j(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                        yg7.m(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                        yg7.h(iArr[i4], (List) unsafe.getObject(obj, j), ub7Var, true);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                        int i16 = iArr[i4];
                        List list4 = (List) unsafe.getObject(obj, j);
                        xg7 C2 = pg7Var.C(i4);
                        p7 p7Var4 = yg7.a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i17 = 0; i17 < list4.size(); i17++) {
                                qe7 qe7Var = (qe7) list4.get(i17);
                                ef7Var.d(i16, 3);
                                C2.e(qe7Var, ub7Var);
                                ef7Var.d(i16, 4);
                            }
                            break;
                        }
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 != null) {
                            xf6 xf6Var = ((fg7) pg7Var.D(i4)).a;
                            for (Map.Entry entry : ((gg7) object3).entrySet()) {
                                ef7Var.d(i6, 2);
                                ef7Var.r(fg7.b(xf6Var, entry.getKey(), entry.getValue()));
                                fg7.a(ef7Var, xf6Var, entry.getKey(), entry.getValue());
                            }
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.i(i6, Double.doubleToRawLongBits(((Double) ih7.h(j, obj)).doubleValue()));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.g(i6, Float.floatToRawIntBits(((Float) ih7.h(j, obj)).floatValue()));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.h(i6, p(j, obj));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.h(i6, p(j, obj));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.e(i6, o(j, obj));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.i(i6, p(j, obj));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.g(i6, o(j, obj));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.j(i6, ((Boolean) ih7.h(j, obj)).booleanValue());
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            Object object4 = unsafe.getObject(obj, j);
                            if (object4 instanceof String) {
                                ef7Var.k(i6, (String) object4);
                                break;
                            } else {
                                ef7Var.l(i6, (we7) object4);
                                break;
                            }
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ub7Var.g(i6, unsafe.getObject(obj, j), pg7Var.C(i4));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.l(i6, (we7) unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.f(i6, o(j, obj));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.e(i6, o(j, obj));
                            break;
                        }
                        break;
                    case 64:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.g(i6, o(j, obj));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            ef7Var.i(i6, p(j, obj));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            int o = o(j, obj);
                            ef7Var.f(i6, (o >> 31) ^ (o + o));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            long p = p(j, obj);
                            ef7Var.h(i6, (p >> 63) ^ (p + p));
                            break;
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS_VALUE:
                        if (pg7Var.u(i6, i4, obj)) {
                            Object object5 = unsafe.getObject(obj, j);
                            ef7Var.d(i6, 3);
                            pg7Var.C(i4).e((qe7) object5, ub7Var);
                            ef7Var.d(i6, 4);
                            break;
                        }
                        break;
                }
                i4 += 3;
                i2 = 1048575;
                pg7Var = this;
            } else {
                ((mf7) obj).zzc.b(ub7Var);
                return;
            }
        }
    }

    @Override // defpackage.xg7
    public final void f(Object obj) {
        if (m(obj)) {
            if (obj instanceof mf7) {
                mf7 mf7Var = (mf7) obj;
                mf7Var.j();
                mf7Var.zza = 0;
                mf7Var.f();
            }
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    int k2 = k(i);
                    int i2 = 1048575 & k2;
                    int l2 = l(k2);
                    long j = i2;
                    Unsafe unsafe = l;
                    if (l2 != 9) {
                        if (l2 != 60 && l2 != 68) {
                            switch (l2) {
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                                    re7 re7Var = (re7) ((yf7) ih7.h(j, obj));
                                    if (!re7Var.x) {
                                        break;
                                    } else {
                                        re7Var.x = false;
                                        break;
                                    }
                                case 50:
                                    Object object = unsafe.getObject(obj, j);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((gg7) object).x = false;
                                        unsafe.putObject(obj, j, object);
                                        break;
                                    }
                            }
                        } else if (u(iArr[i], i, obj)) {
                            C(i).f(unsafe.getObject(obj, j));
                        }
                        i += 3;
                    }
                    if (s(i, obj)) {
                        C(i).f(unsafe.getObject(obj, j));
                    }
                    i += 3;
                } else {
                    this.j.getClass();
                    gh7 gh7Var = ((mf7) obj).zzc;
                    if (gh7Var.e) {
                        gh7Var.e = false;
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.xg7
    public final void g(Object obj, byte[] bArr, int i, int i2, m97 m97Var) {
        y(obj, bArr, i, i2, 0, m97Var);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0021. Please report as an issue. */
    @Override // defpackage.xg7
    public final int h(mf7 mf7Var) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < this.a.length; i6 += 3) {
            int k2 = k(i6);
            int l2 = l(k2);
            if (l2 <= 50 || l2 >= 69) {
                long j = k2 & 1048575;
                int i7 = 37;
                switch (l2) {
                    case 0:
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(ih7.c.u(j, mf7Var));
                        byte[] bArr = wf7.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 1:
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(ih7.c.s(j, mf7Var));
                        i5 = i2 + floatToIntBits;
                        break;
                    case 2:
                        i = i5 * 53;
                        doubleToLongBits = ih7.f(j, mf7Var);
                        byte[] bArr2 = wf7.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 3:
                        i = i5 * 53;
                        doubleToLongBits = ih7.f(j, mf7Var);
                        byte[] bArr3 = wf7.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 4:
                        i2 = i5 * 53;
                        floatToIntBits = ih7.d(j, mf7Var);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 5:
                        i = i5 * 53;
                        doubleToLongBits = ih7.f(j, mf7Var);
                        byte[] bArr4 = wf7.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 6:
                        i2 = i5 * 53;
                        floatToIntBits = ih7.d(j, mf7Var);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 7:
                        i = i5 * 53;
                        boolean q = ih7.c.q(j, mf7Var);
                        byte[] bArr5 = wf7.a;
                        if (q) {
                            i3 = 1231;
                        } else {
                            i3 = 1237;
                        }
                        i5 = i + i3;
                        break;
                    case 8:
                        i2 = i5 * 53;
                        floatToIntBits = ((String) ih7.h(j, mf7Var)).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 9:
                        i4 = i5 * 53;
                        Object h = ih7.h(j, mf7Var);
                        if (h != null) {
                            i7 = h.hashCode();
                        }
                        i5 = i4 + i7;
                        break;
                    case 10:
                        i2 = i5 * 53;
                        floatToIntBits = ih7.h(j, mf7Var).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 11:
                        i2 = i5 * 53;
                        floatToIntBits = ih7.d(j, mf7Var);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 12:
                        i2 = i5 * 53;
                        floatToIntBits = ih7.d(j, mf7Var);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 13:
                        i2 = i5 * 53;
                        floatToIntBits = ih7.d(j, mf7Var);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 14:
                        i = i5 * 53;
                        doubleToLongBits = ih7.f(j, mf7Var);
                        byte[] bArr6 = wf7.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 15:
                        i2 = i5 * 53;
                        floatToIntBits = ih7.d(j, mf7Var);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 16:
                        i = i5 * 53;
                        doubleToLongBits = ih7.f(j, mf7Var);
                        byte[] bArr7 = wf7.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 17:
                        i4 = i5 * 53;
                        Object h2 = ih7.h(j, mf7Var);
                        if (h2 != null) {
                            i7 = h2.hashCode();
                        }
                        i5 = i4 + i7;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                        i2 = i5 * 53;
                        floatToIntBits = ih7.h(j, mf7Var).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 50:
                        i2 = i5 * 53;
                        floatToIntBits = ih7.h(j, mf7Var).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                }
            }
        }
        int i8 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i8 < iArr.length) {
                if (!u(0, iArr[i8], mf7Var)) {
                    i5 = ih7.h(k(r3) & 1048575, mf7Var).hashCode() + (i5 * 53);
                }
                i8++;
            } else {
                return mf7Var.zzc.hashCode() + (i5 * 53);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.xg7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(defpackage.mf7 r9, defpackage.mf7 r10) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg7.i(mf7, mf7):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0088. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:167:0x07ed A[LOOP:1: B:166:0x07eb->B:167:0x07ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x07ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.xg7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.Object r22, defpackage.fm0 r23, defpackage.ff7 r24) {
        /*
            Method dump skipped, instructions count: 2200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg7.j(java.lang.Object, fm0, ff7):void");
    }

    public final int k(int i) {
        return this.a[i + 1];
    }

    public final boolean q(mf7 mf7Var, mf7 mf7Var2, int i) {
        if (s(i, mf7Var) == s(i, mf7Var2)) {
            return true;
        }
        return false;
    }

    public final boolean r(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return s(i, obj);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg7.s(int, java.lang.Object):boolean");
    }

    public final void t(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        ih7.e(obj, j, (1 << (i2 >>> 20)) | ih7.d(j, obj));
    }

    public final boolean u(int i, int i2, Object obj) {
        if (ih7.d(this.a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final void v(int i, int i2, Object obj) {
        ih7.e(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int w(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int y(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, defpackage.m97 r42) {
        /*
            Method dump skipped, instructions count: 3674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg7.y(java.lang.Object, byte[], int, int, int, m97):int");
    }
}
