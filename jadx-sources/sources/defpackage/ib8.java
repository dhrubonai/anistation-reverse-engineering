package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ib8 implements pb8 {
    public static final int[] g = new int[0];
    public static final Unsafe h = zc7.i();
    public final int[] a;
    public final Object[] b;
    public final w88 c;
    public final int[] d;
    public final int e;
    public final z95 f;

    public ib8(int[] iArr, Object[] objArr, w88 w88Var, int[] iArr2, int i, z95 z95Var, qp7 qp7Var) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i;
        this.f = z95Var;
        this.c = w88Var;
    }

    public static Field l(String str, Class cls) {
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

    public static int q(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ba8) {
            return ((ba8) obj).j();
        }
        return true;
    }

    public static int s(long j, Object obj) {
        return ((Integer) zc7.h(j, obj)).intValue();
    }

    public static long t(long j, Object obj) {
        return ((Long) zc7.h(j, obj)).longValue();
    }

    @Override // defpackage.pb8
    public final ba8 a() {
        return (ba8) ((ba8) this.c).i(4, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001f. Please report as an issue. */
    @Override // defpackage.pb8
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (r(obj)) {
            obj2.getClass();
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    int p = p(i);
                    int i2 = p & 1048575;
                    int q = q(p);
                    int i3 = iArr[i];
                    long j = i2;
                    switch (q) {
                        case 0:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                qo6 qo6Var = zc7.c;
                                qo6Var.v(obj3, j, qo6Var.u(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 1:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                qo6 qo6Var2 = zc7.c;
                                qo6Var2.t(obj3, j, qo6Var2.s(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 2:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                zc7.c.b.putLong(obj3, j, zc7.g(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 3:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                zc7.c.b.putLong(obj3, j, zc7.g(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 4:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                zc7.f(obj3, j, zc7.e(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 5:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                zc7.c.b.putLong(obj3, j, zc7.g(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 6:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                zc7.f(obj3, j, zc7.e(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 7:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                qo6 qo6Var3 = zc7.c;
                                qo6Var3.r(obj3, j, qo6Var3.q(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 8:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                zc7.c.b.putObject(obj3, j, zc7.h(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 9:
                            obj3 = obj;
                            m(i, obj3, obj2);
                            i += 3;
                            obj = obj3;
                        case 10:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                zc7.c.b.putObject(obj3, j, zc7.h(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 11:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                zc7.f(obj3, j, zc7.e(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 12:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                zc7.f(obj3, j, zc7.e(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 13:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                zc7.f(obj3, j, zc7.e(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 14:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                zc7.c.b.putLong(obj3, j, zc7.g(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 15:
                            obj3 = obj;
                            if (i(i, obj2)) {
                                zc7.f(obj3, j, zc7.e(j, obj2));
                                j(i, obj3);
                            }
                            i += 3;
                            obj = obj3;
                        case 16:
                            if (i(i, obj2)) {
                                obj3 = obj;
                                zc7.c.b.putLong(obj3, j, zc7.g(j, obj2));
                                j(i, obj3);
                                i += 3;
                                obj = obj3;
                            }
                            obj3 = obj;
                            i += 3;
                            obj = obj3;
                        case 17:
                            m(i, obj, obj2);
                            obj3 = obj;
                            i += 3;
                            obj = obj3;
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
                            ja8 ja8Var = (ja8) zc7.h(j, obj);
                            ja8 ja8Var2 = (ja8) zc7.h(j, obj2);
                            int size = ja8Var.size();
                            int size2 = ja8Var2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((a98) ja8Var).x) {
                                    ja8Var = ja8Var.e(size2 + size);
                                }
                                ja8Var.addAll(ja8Var2);
                            }
                            if (size > 0) {
                                ja8Var2 = ja8Var;
                            }
                            zc7.c.b.putObject(obj, j, ja8Var2);
                            obj3 = obj;
                            i += 3;
                            obj = obj3;
                        case 50:
                            z95 z95Var = rb8.a;
                            Object h2 = zc7.h(j, obj);
                            Object h3 = zc7.h(j, obj2);
                            if (h2 != null) {
                                ov3.d();
                                return;
                            }
                            throw h11.f(h3);
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                            if (k(i3, i, obj2)) {
                                zc7.c.b.putObject(obj, j, zc7.h(j, obj2));
                                zc7.f(obj, iArr[i + 2] & 1048575, i3);
                            }
                            obj3 = obj;
                            i += 3;
                            obj = obj3;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                            n(i, obj, obj2);
                            obj3 = obj;
                            i += 3;
                            obj = obj3;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                        case 64:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE:
                            if (k(i3, i, obj2)) {
                                zc7.c.b.putObject(obj, j, zc7.h(j, obj2));
                                zc7.f(obj, iArr[i + 2] & 1048575, i3);
                            }
                            obj3 = obj;
                            i += 3;
                            obj = obj3;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS_VALUE:
                            n(i, obj, obj2);
                            obj3 = obj;
                            i += 3;
                            obj = obj3;
                        default:
                            obj3 = obj;
                            i += 3;
                            obj = obj3;
                    }
                } else {
                    rb8.b(obj, obj2);
                    return;
                }
            }
        } else {
            ze0.k("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004c. Please report as an issue. */
    @Override // defpackage.pb8
    public final int c(w88 w88Var) {
        int i;
        int y;
        int z;
        int y2;
        int a;
        int y3;
        int b;
        int i2;
        int y4;
        int i3;
        int i4;
        int b2;
        int y5;
        int size;
        int r;
        int y6;
        int y7;
        int a2;
        int y8;
        int size2;
        int y9;
        int i5;
        int y10;
        int z2;
        int y11;
        int a3;
        int s;
        int y12;
        ib8 ib8Var = this;
        w88 w88Var2 = w88Var;
        int i6 = 0;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = ib8Var.a;
            if (i8 < iArr.length) {
                int p = ib8Var.p(i8);
                int q = q(p);
                int i12 = iArr[i8];
                int i13 = iArr[i8 + 2];
                int i14 = i13 & i7;
                Unsafe unsafe = h;
                if (q <= 17) {
                    if (i14 != i11) {
                        if (i14 == i7) {
                            i9 = 0;
                        } else {
                            i9 = unsafe.getInt(w88Var2, i14);
                        }
                        i11 = i14;
                    }
                    i = 1 << (i13 >>> 20);
                } else {
                    i = 0;
                }
                int i15 = p & i7;
                if (q >= q98.y.x) {
                    byte b3 = q98.z.x;
                }
                long j = i15;
                switch (q) {
                    case 0:
                        if (!ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        i10 = zo5.t(i12 << 3, 8, i10);
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 1:
                        if (!ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        i10 = zo5.t(i12 << 3, 4, i10);
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 2:
                        if (ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            long j2 = unsafe.getLong(w88Var2, j);
                            y = j98.y(i12 << 3);
                            z = j98.z(j2);
                            i3 = z + y;
                            i10 += i3;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case 3:
                        if (ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            long j3 = unsafe.getLong(w88Var2, j);
                            y = j98.y(i12 << 3);
                            z = j98.z(j3);
                            i3 = z + y;
                            i10 += i3;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case 4:
                        if (ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            long j4 = unsafe.getInt(w88Var2, j);
                            y = j98.y(i12 << 3);
                            z = j98.z(j4);
                            i3 = z + y;
                            i10 += i3;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case 5:
                        if (!ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        i10 = zo5.t(i12 << 3, 8, i10);
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 6:
                        if (!ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        i10 = zo5.t(i12 << 3, 4, i10);
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 7:
                        if (ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            i10 = zo5.t(i12 << 3, 1, i10);
                        }
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 8:
                        if (ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            int i16 = i12 << 3;
                            Object object = unsafe.getObject(w88Var2, j);
                            if (object instanceof d98) {
                                y2 = j98.y(i16);
                                a = ((d98) object).d();
                            } else {
                                y2 = j98.y(i16);
                                a = ed7.a((String) object);
                            }
                            i10 = zo5.u(a, a, y2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case 9:
                        if (ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            Object object2 = unsafe.getObject(w88Var2, j);
                            pb8 o = ib8Var.o(i8);
                            z95 z95Var = rb8.a;
                            y3 = j98.y(i12 << 3);
                            b = ((w88) object2).b(o);
                            i10 = zo5.u(b, b, y3, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case 10:
                        if (ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            d98 d98Var = (d98) unsafe.getObject(w88Var2, j);
                            y2 = j98.y(i12 << 3);
                            a = d98Var.d();
                            i10 = zo5.u(a, a, y2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case 11:
                        if (ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            i2 = unsafe.getInt(w88Var2, j);
                            y4 = j98.y(i12 << 3);
                            i10 = zo5.t(i2, y4, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case 12:
                        if (ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            long j5 = unsafe.getInt(w88Var2, j);
                            y = j98.y(i12 << 3);
                            z = j98.z(j5);
                            i3 = z + y;
                            i10 += i3;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case 13:
                        if (!ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        i10 = zo5.t(i12 << 3, 4, i10);
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 14:
                        if (!ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        i10 = zo5.t(i12 << 3, 8, i10);
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 15:
                        if (ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            int i17 = unsafe.getInt(w88Var2, j);
                            y4 = j98.y(i12 << 3);
                            i2 = (i17 >> 31) ^ (i17 + i17);
                            i10 = zo5.t(i2, y4, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case 16:
                        if (ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            long j6 = unsafe.getLong(w88Var2, j);
                            y = j98.y(i12 << 3);
                            z = j98.z((j6 >> 63) ^ (j6 + j6));
                            i3 = z + y;
                            i10 += i3;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case 17:
                        if (ib8Var.v(w88Var2, i8, i11, i9, i)) {
                            w88 w88Var3 = (w88) unsafe.getObject(w88Var2, j);
                            pb8 o2 = ib8Var.o(i8);
                            z95 z95Var2 = rb8.a;
                            int y13 = j98.y(i12 << 3);
                            i4 = y13 + y13;
                            b2 = w88Var3.b(o2);
                            i3 = b2 + i4;
                            i10 += i3;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case 18:
                        i3 = rb8.y(i12, (List) unsafe.getObject(w88Var2, j));
                        i10 += i3;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 19:
                        i3 = rb8.x(i12, (List) unsafe.getObject(w88Var2, j));
                        i10 += i3;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 20:
                        List list = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var3 = rb8.a;
                        if (list.size() != 0) {
                            y5 = (j98.y(i12 << 3) * list.size()) + rb8.q(list);
                            i10 += y5;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        y5 = 0;
                        i10 += y5;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 21:
                        List list2 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var4 = rb8.a;
                        size = list2.size();
                        if (size != 0) {
                            r = rb8.r(list2);
                            y6 = j98.y(i12 << 3);
                            y7 = (y6 * size) + r;
                            i10 += y7;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        y7 = 0;
                        i10 += y7;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 22:
                        List list3 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var5 = rb8.a;
                        size = list3.size();
                        if (size != 0) {
                            r = rb8.u(list3);
                            y6 = j98.y(i12 << 3);
                            y7 = (y6 * size) + r;
                            i10 += y7;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        y7 = 0;
                        i10 += y7;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 23:
                        i3 = rb8.y(i12, (List) unsafe.getObject(w88Var2, j));
                        i10 += i3;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 24:
                        i3 = rb8.x(i12, (List) unsafe.getObject(w88Var2, j));
                        i10 += i3;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 25:
                        List list4 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var6 = rb8.a;
                        int size3 = list4.size();
                        if (size3 != 0) {
                            y5 = (j98.y(i12 << 3) + 1) * size3;
                            i10 += y5;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        y5 = 0;
                        i10 += y5;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 26:
                        List list5 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var7 = rb8.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            y7 = j98.y(i12 << 3) * size4;
                            for (int i18 = 0; i18 < size4; i18++) {
                                Object obj = list5.get(i18);
                                if (obj instanceof d98) {
                                    a2 = ((d98) obj).d();
                                } else {
                                    a2 = ed7.a((String) obj);
                                }
                                y7 = zo5.t(a2, a2, y7);
                            }
                            i10 += y7;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        y7 = 0;
                        i10 += y7;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 27:
                        List list6 = (List) unsafe.getObject(w88Var2, j);
                        pb8 o3 = ib8Var.o(i8);
                        z95 z95Var8 = rb8.a;
                        int size5 = list6.size();
                        if (size5 == 0) {
                            y8 = 0;
                        } else {
                            y8 = j98.y(i12 << 3) * size5;
                            for (int i19 = 0; i19 < size5; i19++) {
                                int b4 = ((w88) list6.get(i19)).b(o3);
                                y8 = zo5.t(b4, b4, y8);
                            }
                        }
                        i10 += y8;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 28:
                        List list7 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var9 = rb8.a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            y7 = j98.y(i12 << 3) * size6;
                            for (int i20 = 0; i20 < list7.size(); i20++) {
                                int d = ((d98) list7.get(i20)).d();
                                y7 = zo5.t(d, d, y7);
                            }
                            i10 += y7;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        y7 = 0;
                        i10 += y7;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 29:
                        List list8 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var10 = rb8.a;
                        size = list8.size();
                        if (size != 0) {
                            r = rb8.v(list8);
                            y6 = j98.y(i12 << 3);
                            y7 = (y6 * size) + r;
                            i10 += y7;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        y7 = 0;
                        i10 += y7;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 30:
                        List list9 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var11 = rb8.a;
                        size = list9.size();
                        if (size != 0) {
                            r = rb8.t(list9);
                            y6 = j98.y(i12 << 3);
                            y7 = (y6 * size) + r;
                            i10 += y7;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        y7 = 0;
                        i10 += y7;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 31:
                        i3 = rb8.x(i12, (List) unsafe.getObject(w88Var2, j));
                        i10 += i3;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 32:
                        i3 = rb8.y(i12, (List) unsafe.getObject(w88Var2, j));
                        i10 += i3;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 33:
                        List list10 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var12 = rb8.a;
                        size = list10.size();
                        if (size != 0) {
                            r = rb8.w(list10);
                            y6 = j98.y(i12 << 3);
                            y7 = (y6 * size) + r;
                            i10 += y7;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        y7 = 0;
                        i10 += y7;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 34:
                        List list11 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var13 = rb8.a;
                        size = list11.size();
                        if (size != 0) {
                            r = rb8.s(list11);
                            y6 = j98.y(i12 << 3);
                            y7 = (y6 * size) + r;
                            i10 += y7;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        y7 = 0;
                        i10 += y7;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        List list12 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var14 = rb8.a;
                        size2 = list12.size() * 8;
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                        List list13 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var15 = rb8.a;
                        size2 = list13.size() * 4;
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                        size2 = rb8.q((List) unsafe.getObject(w88Var2, j));
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        size2 = rb8.r((List) unsafe.getObject(w88Var2, j));
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                        size2 = rb8.u((List) unsafe.getObject(w88Var2, j));
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                        List list14 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var16 = rb8.a;
                        size2 = list14.size() * 8;
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                        List list15 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var17 = rb8.a;
                        size2 = list15.size() * 4;
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                        List list16 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var18 = rb8.a;
                        size2 = list16.size();
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                        size2 = rb8.v((List) unsafe.getObject(w88Var2, j));
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                        size2 = rb8.t((List) unsafe.getObject(w88Var2, j));
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                        List list17 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var19 = rb8.a;
                        size2 = list17.size() * 4;
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                        List list18 = (List) unsafe.getObject(w88Var2, j);
                        z95 z95Var20 = rb8.a;
                        size2 = list18.size() * 8;
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                        size2 = rb8.w((List) unsafe.getObject(w88Var2, j));
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                        size2 = rb8.s((List) unsafe.getObject(w88Var2, j));
                        if (size2 > 0) {
                            y9 = j98.y(i12 << 3);
                            i10 = zo5.u(size2, y9, size2, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                        List list19 = (List) unsafe.getObject(w88Var2, j);
                        pb8 o4 = ib8Var.o(i8);
                        z95 z95Var21 = rb8.a;
                        int size7 = list19.size();
                        if (size7 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            for (int i21 = 0; i21 < size7; i21++) {
                                w88 w88Var4 = (w88) list19.get(i21);
                                int y14 = j98.y(i12 << 3);
                                i5 += w88Var4.b(o4) + y14 + y14;
                            }
                        }
                        i10 += i5;
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case 50:
                        Object object3 = unsafe.getObject(w88Var2, j);
                        int i22 = i8 / 3;
                        Object obj2 = ib8Var.b[i22 + i22];
                        if (object3 != null) {
                            ov3.d();
                            return 0;
                        }
                        throw h11.f(obj2);
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                        if (!ib8Var.k(i12, i8, w88Var2)) {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        i10 = zo5.t(i12 << 3, 8, i10);
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                        if (!ib8Var.k(i12, i8, w88Var2)) {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        i10 = zo5.t(i12 << 3, 4, i10);
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                        if (ib8Var.k(i12, i8, w88Var2)) {
                            long t = t(j, w88Var2);
                            y10 = j98.y(i12 << 3);
                            z2 = j98.z(t);
                            i10 += z2 + y10;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                        if (ib8Var.k(i12, i8, w88Var2)) {
                            long t2 = t(j, w88Var2);
                            y10 = j98.y(i12 << 3);
                            z2 = j98.z(t2);
                            i10 += z2 + y10;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                        if (ib8Var.k(i12, i8, w88Var2)) {
                            long s2 = s(j, w88Var2);
                            y10 = j98.y(i12 << 3);
                            z2 = j98.z(s2);
                            i10 += z2 + y10;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                        if (!ib8Var.k(i12, i8, w88Var2)) {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        i10 = zo5.t(i12 << 3, 8, i10);
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                        if (!ib8Var.k(i12, i8, w88Var2)) {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        i10 = zo5.t(i12 << 3, 4, i10);
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                        if (ib8Var.k(i12, i8, w88Var2)) {
                            i10 = zo5.t(i12 << 3, 1, i10);
                        }
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                        if (ib8Var.k(i12, i8, w88Var2)) {
                            int i23 = i12 << 3;
                            Object object4 = unsafe.getObject(w88Var2, j);
                            if (object4 instanceof d98) {
                                y11 = j98.y(i23);
                                a3 = ((d98) object4).d();
                            } else {
                                y11 = j98.y(i23);
                                a3 = ed7.a((String) object4);
                            }
                            i10 = zo5.u(a3, a3, y11, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                        if (ib8Var.k(i12, i8, w88Var2)) {
                            Object object5 = unsafe.getObject(w88Var2, j);
                            pb8 o5 = ib8Var.o(i8);
                            z95 z95Var22 = rb8.a;
                            y3 = j98.y(i12 << 3);
                            b = ((w88) object5).b(o5);
                            i10 = zo5.u(b, b, y3, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                        if (ib8Var.k(i12, i8, w88Var2)) {
                            d98 d98Var2 = (d98) unsafe.getObject(w88Var2, j);
                            y11 = j98.y(i12 << 3);
                            a3 = d98Var2.d();
                            i10 = zo5.u(a3, a3, y11, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE:
                        if (ib8Var.k(i12, i8, w88Var2)) {
                            s = s(j, w88Var2);
                            y12 = j98.y(i12 << 3);
                            i10 = zo5.t(s, y12, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                        if (ib8Var.k(i12, i8, w88Var2)) {
                            long s3 = s(j, w88Var2);
                            y10 = j98.y(i12 << 3);
                            z2 = j98.z(s3);
                            i10 += z2 + y10;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case 64:
                        if (!ib8Var.k(i12, i8, w88Var2)) {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        i10 = zo5.t(i12 << 3, 4, i10);
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME_VALUE:
                        if (!ib8Var.k(i12, i8, w88Var2)) {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                        i10 = zo5.t(i12 << 3, 8, i10);
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE:
                        if (ib8Var.k(i12, i8, w88Var2)) {
                            int s4 = s(j, w88Var2);
                            y12 = j98.y(i12 << 3);
                            s = (s4 >> 31) ^ (s4 + s4);
                            i10 = zo5.t(s, y12, i10);
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE:
                        if (ib8Var.k(i12, i8, w88Var2)) {
                            long t3 = t(j, w88Var2);
                            y10 = j98.y(i12 << 3);
                            z2 = j98.z((t3 >> 63) ^ (t3 + t3));
                            i10 += z2 + y10;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS_VALUE:
                        if (ib8Var.k(i12, i8, w88Var2)) {
                            w88 w88Var5 = (w88) unsafe.getObject(w88Var2, j);
                            pb8 o6 = ib8Var.o(i8);
                            z95 z95Var23 = rb8.a;
                            int y15 = j98.y(i12 << 3);
                            i4 = y15 + y15;
                            b2 = w88Var5.b(o6);
                            i3 = b2 + i4;
                            i10 += i3;
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        } else {
                            i8 += 3;
                            ib8Var = this;
                            w88Var2 = w88Var;
                            i7 = 1048575;
                        }
                    default:
                        i8 += 3;
                        ib8Var = this;
                        w88Var2 = w88Var;
                        i7 = 1048575;
                }
            } else {
                tc7 tc7Var = ((ba8) w88Var).zzc;
                int i24 = tc7Var.c;
                if (i24 == -1) {
                    tc7Var.c = 0;
                } else {
                    i6 = i24;
                }
                return i6 + i10;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // defpackage.pb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.ba8 r8, defpackage.ba8 r9) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib8.d(ba8, ba8):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001e. Please report as an issue. */
    @Override // defpackage.pb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.ba8 r11) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib8.e(ba8):int");
    }

    @Override // defpackage.pb8
    public final boolean f(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.e) {
            int i7 = this.d[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int p = p(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = h.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & p) == 0 || v(obj, i2, i, i3, i11)) {
                int q = q(p);
                if (q != 9 && q != 17) {
                    if (q != 27) {
                        if (q != 60 && q != 68) {
                            if (q != 49) {
                                if (q == 50) {
                                    zc7.h(p & 1048575, obj).getClass();
                                    ov3.d();
                                    return false;
                                }
                            }
                        } else if (k(i8, i2, obj) && !o(i2).f(zc7.h(p & 1048575, obj))) {
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) zc7.h(p & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        pb8 o = o(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (o.f(list.get(i13))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (v(obj, i2, i, i3, i11) && !o(i2).f(zc7.h(p & 1048575, obj))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        continue;
     */
    @Override // defpackage.pb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r(r9)
            if (r0 != 0) goto L8
            goto L8e
        L8:
            boolean r0 = r9 instanceof defpackage.ba8
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r9
            ba8 r0 = (defpackage.ba8) r0
            r0.e()
            r0.zza = r1
            r0.k()
        L18:
            r0 = r1
        L19:
            int[] r2 = r8.a
            int r3 = r2.length
            if (r0 >= r3) goto L7f
            int r3 = r8.p(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = q(r3)
            long r4 = (long) r4
            r6 = 9
            sun.misc.Unsafe r7 = defpackage.ib8.h
            if (r3 == r6) goto L6b
            r6 = 60
            if (r3 == r6) goto L57
            r6 = 68
            if (r3 == r6) goto L57
            switch(r3) {
                case 17: goto L6b;
                case 18: goto L48;
                case 19: goto L48;
                case 20: goto L48;
                case 21: goto L48;
                case 22: goto L48;
                case 23: goto L48;
                case 24: goto L48;
                case 25: goto L48;
                case 26: goto L48;
                case 27: goto L48;
                case 28: goto L48;
                case 29: goto L48;
                case 30: goto L48;
                case 31: goto L48;
                case 32: goto L48;
                case 33: goto L48;
                case 34: goto L48;
                case 35: goto L48;
                case 36: goto L48;
                case 37: goto L48;
                case 38: goto L48;
                case 39: goto L48;
                case 40: goto L48;
                case 41: goto L48;
                case 42: goto L48;
                case 43: goto L48;
                case 44: goto L48;
                case 45: goto L48;
                case 46: goto L48;
                case 47: goto L48;
                case 48: goto L48;
                case 49: goto L48;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L7c
        L3d:
            java.lang.Object r2 = r7.getObject(r9, r4)
            if (r2 != 0) goto L44
            goto L7c
        L44:
            defpackage.ov3.d()
            return
        L48:
            java.lang.Object r2 = defpackage.zc7.h(r4, r9)
            ja8 r2 = (defpackage.ja8) r2
            a98 r2 = (defpackage.a98) r2
            boolean r3 = r2.x
            if (r3 == 0) goto L7c
            r2.x = r1
            goto L7c
        L57:
            r2 = r2[r0]
            boolean r2 = r8.k(r2, r0, r9)
            if (r2 == 0) goto L7c
            pb8 r2 = r8.o(r0)
            java.lang.Object r3 = r7.getObject(r9, r4)
            r2.g(r3)
            goto L7c
        L6b:
            boolean r2 = r8.i(r0, r9)
            if (r2 == 0) goto L7c
            pb8 r2 = r8.o(r0)
            java.lang.Object r3 = r7.getObject(r9, r4)
            r2.g(r3)
        L7c:
            int r0 = r0 + 3
            goto L19
        L7f:
            z95 r8 = r8.f
            r8.getClass()
            ba8 r9 = (defpackage.ba8) r9
            tc7 r8 = r9.zzc
            boolean r9 = r8.d
            if (r9 == 0) goto L8e
            r8.d = r1
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib8.g(java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x004c. Please report as an issue. */
    @Override // defpackage.pb8
    public final void h(Object obj, qb7 qb7Var) {
        int[] iArr;
        int i;
        int i2;
        ib8 ib8Var = this;
        j98 j98Var = (j98) qb7Var.y;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr2 = ib8Var.a;
            if (i5 < iArr2.length) {
                int p = ib8Var.p(i5);
                int q = q(p);
                int i7 = iArr2[i5];
                Unsafe unsafe = h;
                if (q <= 17) {
                    int i8 = iArr2[i5 + 2];
                    int i9 = i8 & i3;
                    if (i9 != i4) {
                        if (i9 == i3) {
                            i6 = 0;
                        } else {
                            i6 = unsafe.getInt(obj, i9);
                        }
                        i4 = i9;
                    }
                    iArr = iArr2;
                    i = 1 << (i8 >>> 20);
                } else {
                    iArr = iArr2;
                    i = 0;
                }
                long j = p & i3;
                switch (q) {
                    case 0:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            j98Var.q(i7, Double.doubleToRawLongBits(zc7.c.u(j, obj)));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 1:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            j98Var.o(i7, Float.floatToRawIntBits(zc7.c.s(j, obj)));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 2:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            j98Var.p(i7, unsafe.getLong(obj, j));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 3:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            j98Var.p(i7, unsafe.getLong(obj, j));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 4:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            j98Var.m(i7, unsafe.getInt(obj, j));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 5:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            j98Var.q(i7, unsafe.getLong(obj, j));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 6:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            j98Var.o(i7, unsafe.getInt(obj, j));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 7:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            byte q2 = zc7.c.q(j, obj);
                            j98Var.t(i7 << 3);
                            int i10 = j98Var.d;
                            try {
                                int i11 = i10 + 1;
                                try {
                                    j98Var.b[i10] = q2;
                                    j98Var.d = i11;
                                } catch (IndexOutOfBoundsException e) {
                                    e = e;
                                    i10 = i11;
                                    throw new co0(i10, j98Var.c, 1, e, (byte) 14);
                                }
                            } catch (IndexOutOfBoundsException e2) {
                                e = e2;
                            }
                        } else {
                            continue;
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 8:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            Object object = unsafe.getObject(obj, j);
                            if (object instanceof String) {
                                j98Var.r(i7, (String) object);
                            } else {
                                d98 d98Var = (d98) object;
                                j98Var.t((i7 << 3) | 2);
                                j98Var.t(d98Var.d());
                                d98Var.g(j98Var);
                            }
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 9:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            qb7Var.g(i7, unsafe.getObject(obj, j), ib8Var.o(i5));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 10:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            d98 d98Var2 = (d98) unsafe.getObject(obj, j);
                            j98Var.t((i7 << 3) | 2);
                            j98Var.t(d98Var2.d());
                            d98Var2.g(j98Var);
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 11:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            j98Var.n(i7, unsafe.getInt(obj, j));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 12:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            j98Var.m(i7, unsafe.getInt(obj, j));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 13:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            j98Var.o(i7, unsafe.getInt(obj, j));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 14:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            j98Var.q(i7, unsafe.getLong(obj, j));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 15:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            int i12 = unsafe.getInt(obj, j);
                            j98Var.n(i7, (i12 >> 31) ^ (i12 + i12));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 16:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            long j2 = unsafe.getLong(obj, j);
                            j98Var.p(i7, (j2 >> 63) ^ (j2 + j2));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 17:
                        if (ib8Var.v(obj, i5, i4, i6, i)) {
                            Object object2 = unsafe.getObject(obj, j);
                            j98Var.l(i7, 3);
                            ib8Var.o(i5).h((w88) object2, qb7Var);
                            j98Var.l(i7, 4);
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 18:
                        rb8.c(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 19:
                        rb8.d(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 20:
                        rb8.e(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 21:
                        rb8.f(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 22:
                        rb8.j(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 23:
                        rb8.h(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 24:
                        rb8.m(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 25:
                        rb8.p(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 26:
                        int i13 = iArr[i5];
                        List list = (List) unsafe.getObject(obj, j);
                        z95 z95Var = rb8.a;
                        if (list != null && !list.isEmpty()) {
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                j98Var.r(i13, (String) list.get(i14));
                            }
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                        break;
                    case 27:
                        int i15 = iArr[i5];
                        List list2 = (List) unsafe.getObject(obj, j);
                        pb8 o = ib8Var.o(i5);
                        z95 z95Var2 = rb8.a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i16 = 0; i16 < list2.size(); i16++) {
                                qb7Var.g(i15, list2.get(i16), o);
                            }
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                        break;
                    case 28:
                        int i17 = iArr[i5];
                        List list3 = (List) unsafe.getObject(obj, j);
                        z95 z95Var3 = rb8.a;
                        if (list3 != null && !list3.isEmpty()) {
                            for (int i18 = 0; i18 < list3.size(); i18++) {
                                d98 d98Var3 = (d98) list3.get(i18);
                                j98Var.t((i17 << 3) | 2);
                                j98Var.t(d98Var3.d());
                                d98Var3.g(j98Var);
                            }
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                        break;
                    case 29:
                        rb8.k(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 30:
                        rb8.o(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 31:
                        rb8.n(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 32:
                        rb8.i(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 33:
                        rb8.l(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 34:
                        rb8.g(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, false);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        rb8.c(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                        rb8.d(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                        rb8.e(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        rb8.f(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                        rb8.j(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                        rb8.h(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                        rb8.m(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                        rb8.p(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                        rb8.k(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                        rb8.o(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                        rb8.n(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                        rb8.i(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                        rb8.l(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                        rb8.g(iArr[i5], (List) unsafe.getObject(obj, j), qb7Var, true);
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                        int i19 = iArr[i5];
                        List list4 = (List) unsafe.getObject(obj, j);
                        pb8 o2 = ib8Var.o(i5);
                        z95 z95Var4 = rb8.a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i20 = 0; i20 < list4.size(); i20++) {
                                w88 w88Var = (w88) list4.get(i20);
                                j98Var.l(i19, 3);
                                o2.h(w88Var, qb7Var);
                                j98Var.l(i19, 4);
                            }
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j) != null) {
                            int i21 = i5 / 3;
                            throw h11.f(ib8Var.b[i21 + i21]);
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            j98Var.q(i7, Double.doubleToRawLongBits(((Double) zc7.h(j, obj)).doubleValue()));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            j98Var.o(i7, Float.floatToRawIntBits(((Float) zc7.h(j, obj)).floatValue()));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            j98Var.p(i7, t(j, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            j98Var.p(i7, t(j, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            j98Var.m(i7, s(j, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            j98Var.q(i7, t(j, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            j98Var.o(i7, s(j, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            byte booleanValue = ((Boolean) zc7.h(j, obj)).booleanValue();
                            j98Var.t(i7 << 3);
                            int i22 = j98Var.d;
                            try {
                                i2 = i22 + 1;
                            } catch (IndexOutOfBoundsException e3) {
                                e = e3;
                            }
                            try {
                                j98Var.b[i22] = booleanValue;
                                j98Var.d = i2;
                            } catch (IndexOutOfBoundsException e4) {
                                e = e4;
                                i22 = i2;
                                throw new co0(i22, j98Var.c, 1, e, (byte) 14);
                            }
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            Object object3 = unsafe.getObject(obj, j);
                            if (object3 instanceof String) {
                                j98Var.r(i7, (String) object3);
                            } else {
                                d98 d98Var4 = (d98) object3;
                                j98Var.t((i7 << 3) | 2);
                                j98Var.t(d98Var4.d());
                                d98Var4.g(j98Var);
                            }
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            qb7Var.g(i7, unsafe.getObject(obj, j), ib8Var.o(i5));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            d98 d98Var5 = (d98) unsafe.getObject(obj, j);
                            j98Var.t((i7 << 3) | 2);
                            j98Var.t(d98Var5.d());
                            d98Var5.g(j98Var);
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            j98Var.n(i7, s(j, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            j98Var.m(i7, s(j, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case 64:
                        if (ib8Var.k(i7, i5, obj)) {
                            j98Var.o(i7, s(j, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            j98Var.q(i7, t(j, obj));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            int s = s(j, obj);
                            j98Var.n(i7, (s >> 31) ^ (s + s));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            long t = t(j, obj);
                            j98Var.p(i7, (t >> 63) ^ (t + t));
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS_VALUE:
                        if (ib8Var.k(i7, i5, obj)) {
                            Object object4 = unsafe.getObject(obj, j);
                            j98Var.l(i7, 3);
                            ib8Var.o(i5).h((w88) object4, qb7Var);
                            j98Var.l(i7, 4);
                        }
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                    default:
                        i5 += 3;
                        i3 = 1048575;
                        ib8Var = this;
                }
            } else {
                tc7 tc7Var = ((ba8) obj).zzc;
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib8.i(int, java.lang.Object):boolean");
    }

    public final void j(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        zc7.f(obj, j, (1 << (i2 >>> 20)) | zc7.e(j, obj));
    }

    public final boolean k(int i, int i2, Object obj) {
        if (zc7.e(this.a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final void m(int i, Object obj, Object obj2) {
        if (!i(i, obj2)) {
            return;
        }
        long p = p(i) & 1048575;
        Unsafe unsafe = h;
        Object object = unsafe.getObject(obj2, p);
        if (object != null) {
            pb8 o = o(i);
            if (!i(i, obj)) {
                if (!r(object)) {
                    unsafe.putObject(obj, p, object);
                } else {
                    ba8 a = o.a();
                    o.b(a, object);
                    unsafe.putObject(obj, p, a);
                }
                j(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, p);
            if (!r(object2)) {
                ba8 a2 = o.a();
                o.b(a2, object2);
                unsafe.putObject(obj, p, a2);
                object2 = a2;
            }
            o.b(object2, object);
            return;
        }
        int i2 = this.a[i];
        String obj3 = obj2.toString();
        jz7.c(String.valueOf(i2).length() + 38 + obj3.length(), i2, obj3);
    }

    public final void n(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (!k(i2, i, obj2)) {
            return;
        }
        long p = p(i) & 1048575;
        Unsafe unsafe = h;
        Object object = unsafe.getObject(obj2, p);
        if (object != null) {
            pb8 o = o(i);
            if (!k(i2, i, obj)) {
                if (!r(object)) {
                    unsafe.putObject(obj, p, object);
                } else {
                    ba8 a = o.a();
                    o.b(a, object);
                    unsafe.putObject(obj, p, a);
                }
                zc7.f(obj, iArr[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, p);
            if (!r(object2)) {
                ba8 a2 = o.a();
                o.b(a2, object2);
                unsafe.putObject(obj, p, a2);
                object2 = a2;
            }
            o.b(object2, object);
            return;
        }
        int i3 = iArr[i];
        String obj3 = obj2.toString();
        jz7.c(String.valueOf(i3).length() + 38 + obj3.length(), i3, obj3);
    }

    public final pb8 o(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        pb8 pb8Var = (pb8) objArr[i3];
        if (pb8Var != null) {
            return pb8Var;
        }
        pb8 a = mb8.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final int p(int i) {
        return this.a[i + 1];
    }

    public final boolean u(ba8 ba8Var, ba8 ba8Var2, int i) {
        if (i(i, ba8Var) == i(i, ba8Var2)) {
            return true;
        }
        return false;
    }

    public final boolean v(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return i(i, obj);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }
}
