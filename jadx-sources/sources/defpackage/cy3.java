package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cy3 implements zb5 {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final h2 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final p94 j;
    public final di3 k;
    public final fo6 l;
    public final jn3 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new g1((byte) 2));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public cy3(int[] iArr, Object[] objArr, int i, int i2, h2 h2Var, int[] iArr2, int i3, int i4, p94 p94Var, di3 di3Var, fo6 fo6Var, zz1 zz1Var, jn3 jn3Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = h2Var instanceof vd2;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = p94Var;
        this.k = di3Var;
        this.l = fo6Var;
        this.e = h2Var;
        this.m = jn3Var;
    }

    public static Field F(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder n2 = h11.n("Field ", str, " for ");
            n2.append(cls.getName());
            n2.append(" not found. Known fields are ");
            n2.append(Arrays.toString(declaredFields));
            throw new RuntimeException(n2.toString());
        }
    }

    public static int I(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof vd2) {
            return ((vd2) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cy3 w(defpackage.ey4 r32, defpackage.p94 r33, defpackage.di3 r34, defpackage.fo6 r35, defpackage.zz1 r36, defpackage.jn3 r37) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy3.w(ey4, p94, di3, fo6, zz1, jn3):cy3");
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) so6.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) so6.h(j, obj)).longValue();
    }

    public final int A(int i) {
        if (i >= this.c && i <= this.d) {
            int[] iArr = this.a;
            int length = (iArr.length / 3) - 1;
            int i2 = 0;
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
        return -1;
    }

    public final void B(Object obj, long j, fm0 fm0Var, zb5 zb5Var, xz1 xz1Var) {
        int z;
        this.k.getClass();
        x13 a = di3.a(j, obj);
        po0 po0Var = (po0) fm0Var.B;
        int i = fm0Var.y;
        if ((i & 7) != 3) {
            throw b33.b();
        }
        do {
            vd2 d = zb5Var.d();
            fm0Var.j(d, zb5Var, xz1Var);
            zb5Var.b(d);
            ((fw4) a).add(d);
            if (!po0Var.c() && fm0Var.A == 0) {
                z = po0Var.z();
            } else {
                return;
            }
        } while (z == i);
        fm0Var.A = z;
    }

    public final void C(Object obj, int i, fm0 fm0Var, zb5 zb5Var, xz1 xz1Var) {
        int z;
        this.k.getClass();
        x13 a = di3.a(i & 1048575, obj);
        po0 po0Var = (po0) fm0Var.B;
        int i2 = fm0Var.y;
        if ((i2 & 7) != 2) {
            throw b33.b();
        }
        do {
            vd2 d = zb5Var.d();
            fm0Var.k(d, zb5Var, xz1Var);
            zb5Var.b(d);
            ((fw4) a).add(d);
            if (!po0Var.c() && fm0Var.A == 0) {
                z = po0Var.z();
            } else {
                return;
            }
        } while (z == i2);
        fm0Var.A = z;
    }

    public final void D(int i, fm0 fm0Var, Object obj) {
        if ((536870912 & i) != 0) {
            fm0Var.F(2);
            so6.o(i & 1048575, obj, ((po0) fm0Var.B).y());
        } else if (this.f) {
            fm0Var.F(2);
            so6.o(i & 1048575, obj, ((po0) fm0Var.B).x());
        } else {
            so6.o(i & 1048575, obj, fm0Var.m());
        }
    }

    public final void E(int i, fm0 fm0Var, Object obj) {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        di3 di3Var = this.k;
        if (z) {
            di3Var.getClass();
            fm0Var.B(di3.a(i & 1048575, obj), true);
        } else {
            di3Var.getClass();
            fm0Var.B(di3.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        so6.m(obj, j, (1 << (i2 >>> 20)) | so6.f(j, obj));
    }

    public final void H(int i, int i2, Object obj) {
        so6.m(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    @Override // defpackage.zb5
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (p(obj)) {
            obj2.getClass();
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    int J = J(i);
                    long j = 1048575 & J;
                    int i2 = iArr[i];
                    switch (I(J)) {
                        case 0:
                            if (n(i, obj2)) {
                                qo6 qo6Var = so6.c;
                                obj3 = obj;
                                qo6Var.l(obj3, j, qo6Var.f(j, obj2));
                                G(i, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (n(i, obj2)) {
                                qo6 qo6Var2 = so6.c;
                                qo6Var2.m(obj, j, qo6Var2.g(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (n(i, obj2)) {
                                so6.n(obj, j, so6.g(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (n(i, obj2)) {
                                so6.n(obj, j, so6.g(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (n(i, obj2)) {
                                so6.m(obj, j, so6.f(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (n(i, obj2)) {
                                so6.n(obj, j, so6.g(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (n(i, obj2)) {
                                so6.m(obj, j, so6.f(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (n(i, obj2)) {
                                qo6 qo6Var3 = so6.c;
                                qo6Var3.i(obj, j, qo6Var3.c(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (n(i, obj2)) {
                                so6.o(j, obj, so6.h(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 9:
                            s(i, obj, obj2);
                            break;
                        case 10:
                            if (n(i, obj2)) {
                                so6.o(j, obj, so6.h(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (n(i, obj2)) {
                                so6.m(obj, j, so6.f(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (n(i, obj2)) {
                                so6.m(obj, j, so6.f(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (n(i, obj2)) {
                                so6.m(obj, j, so6.f(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (n(i, obj2)) {
                                so6.n(obj, j, so6.g(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (n(i, obj2)) {
                                so6.m(obj, j, so6.f(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (n(i, obj2)) {
                                so6.n(obj, j, so6.g(j, obj2));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 17:
                            s(i, obj, obj2);
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
                            this.k.getClass();
                            x13 x13Var = (x13) so6.h(j, obj);
                            x13 x13Var2 = (x13) so6.h(j, obj2);
                            int i3 = ((fw4) x13Var).z;
                            int i4 = ((fw4) x13Var2).z;
                            if (i3 > 0 && i4 > 0) {
                                if (!((fw4) x13Var).x) {
                                    x13Var = ((fw4) x13Var).d(i4 + i3);
                                }
                                ((fw4) x13Var).addAll(x13Var2);
                            }
                            if (i3 > 0) {
                                x13Var2 = x13Var;
                            }
                            so6.o(j, obj, x13Var2);
                            break;
                        case 50:
                            Class cls = cc5.a;
                            Object h = so6.h(j, obj);
                            Object h2 = so6.h(j, obj2);
                            this.m.getClass();
                            so6.o(j, obj, jn3.a(h, h2));
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
                            if (q(i2, i, obj2)) {
                                so6.o(j, obj, so6.h(j, obj2));
                                H(i2, i, obj);
                                break;
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                            t(i, obj, obj2);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                        case 64:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE:
                            if (q(i2, i, obj2)) {
                                so6.o(j, obj, so6.h(j, obj2));
                                H(i2, i, obj);
                                break;
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS_VALUE:
                            t(i, obj, obj2);
                            break;
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                } else {
                    cc5.k(this.l, obj, obj2);
                    return;
                }
            }
        } else {
            ov3.f(obj, "Mutating immutable message: ");
        }
    }

    @Override // defpackage.zb5
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof vd2) {
                vd2 vd2Var = (vd2) obj;
                vd2Var.k(Integer.MAX_VALUE);
                vd2Var.memoizedHashCode = 0;
                vd2Var.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int J = J(i);
                long j = 1048575 & J;
                int I = I(J);
                Unsafe unsafe = o;
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
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
                                this.k.getClass();
                                fw4 fw4Var = (fw4) ((x13) so6.h(j, obj));
                                if (fw4Var.x) {
                                    fw4Var.x = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((hn3) object).x = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).b(unsafe.getObject(obj, j));
                    }
                }
                if (n(i, obj)) {
                    m(i).b(unsafe.getObject(obj, j));
                }
            }
            this.l.getClass();
            eo6 eo6Var = ((vd2) obj).unknownFields;
            if (eo6Var.e) {
                eo6Var.e = false;
            }
        }
    }

    @Override // defpackage.zb5
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h) {
            int i7 = this.g[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int J = J(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = o.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & J) == 0 || o(obj, i2, i, i3, i11)) {
                int I = I(J);
                if (I != 9 && I != 17) {
                    if (I != 27) {
                        if (I != 60 && I != 68) {
                            if (I != 49) {
                                if (I != 50) {
                                    continue;
                                } else {
                                    Object h = so6.h(J & 1048575, obj);
                                    this.m.getClass();
                                    hn3 hn3Var = (hn3) h;
                                    if (hn3Var.isEmpty()) {
                                        continue;
                                    } else {
                                        if (((v67) ((en3) this.b[(i2 / 3) * 2]).a.z).x != w67.F) {
                                            continue;
                                        } else {
                                            zb5 zb5Var = null;
                                            for (Object obj2 : hn3Var.values()) {
                                                if (zb5Var == null) {
                                                    zb5Var = ew4.c.a(obj2.getClass());
                                                }
                                                if (!zb5Var.c(obj2)) {
                                                }
                                            }
                                        }
                                    }
                                }
                                i6++;
                                i4 = i;
                                i5 = i3;
                            }
                        } else {
                            if (q(i8, i2, obj) && !m(i2).c(so6.h(J & 1048575, obj))) {
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) so6.h(J & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zb5 m = m(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (m.c(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (o(obj, i2, i, i3, i11) && !m(i2).c(so6.h(J & 1048575, obj))) {
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.zb5
    public final vd2 d() {
        this.j.getClass();
        return ((vd2) this.e).i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (defpackage.cc5.l(defpackage.so6.h(r7, r12), defpackage.so6.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (defpackage.so6.g(r7, r12) == defpackage.so6.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (defpackage.so6.f(r7, r12) == defpackage.so6.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (defpackage.so6.g(r7, r12) == defpackage.so6.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (defpackage.so6.f(r7, r12) == defpackage.so6.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (defpackage.so6.f(r7, r12) == defpackage.so6.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (defpackage.so6.f(r7, r12) == defpackage.so6.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (defpackage.cc5.l(defpackage.so6.h(r7, r12), defpackage.so6.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (defpackage.cc5.l(defpackage.so6.h(r7, r12), defpackage.so6.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (defpackage.cc5.l(defpackage.so6.h(r7, r12), defpackage.so6.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (defpackage.so6.f(r7, r12) == defpackage.so6.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (defpackage.so6.g(r7, r12) == defpackage.so6.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (defpackage.so6.f(r7, r12) == defpackage.so6.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (defpackage.so6.g(r7, r12) == defpackage.so6.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (defpackage.so6.g(r7, r12) == defpackage.so6.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.g(r7, r12)) == java.lang.Float.floatToIntBits(r5.g(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.f(r7, r12)) == java.lang.Double.doubleToLongBits(r5.f(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (defpackage.cc5.l(defpackage.so6.h(r7, r12), defpackage.so6.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // defpackage.zb5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.vd2 r12, defpackage.vd2 r13) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy3.e(vd2, vd2):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f0, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d8, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // defpackage.zb5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.vd2 r12) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy3.f(vd2):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0050. Please report as an issue. */
    @Override // defpackage.zb5
    public final void g(Object obj, i75 i75Var) {
        int i;
        int i2;
        int i3;
        boolean z;
        cy3 cy3Var = this;
        i75Var.getClass();
        to0 to0Var = (to0) i75Var.y;
        int[] iArr = cy3Var.a;
        int length = iArr.length;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int J = cy3Var.J(i6);
            int i8 = iArr[i6];
            int I = I(J);
            Unsafe unsafe = o;
            if (I <= 17) {
                int i9 = iArr[i6 + 2];
                i = 1;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    if (i10 == i4) {
                        i7 = 0;
                    } else {
                        i7 = unsafe.getInt(obj, i10);
                    }
                    i5 = i10;
                }
                int i11 = 1 << (i9 >>> 20);
                i2 = J;
                i3 = i11;
            } else {
                i = 1;
                i2 = J;
                i3 = 0;
            }
            long j = i2 & i4;
            switch (I) {
                case 0:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.t(i8, Double.doubleToRawLongBits(so6.c.f(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.r(i8, Float.floatToRawIntBits(so6.c.g(j, obj)));
                    }
                    cy3Var = this;
                    break;
                case 2:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.E(i8, unsafe.getLong(obj, j));
                    }
                    cy3Var = this;
                    break;
                case 3:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.E(i8, unsafe.getLong(obj, j));
                    }
                    cy3Var = this;
                    break;
                case 4:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.v(i8, unsafe.getInt(obj, j));
                    }
                    cy3Var = this;
                    break;
                case 5:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.t(i8, unsafe.getLong(obj, j));
                    }
                    cy3Var = this;
                    break;
                case 6:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.r(i8, unsafe.getInt(obj, j));
                    }
                    cy3Var = this;
                    break;
                case 7:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.o(i8, so6.c.c(j, obj));
                    }
                    cy3Var = this;
                    break;
                case 8:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            to0Var.z(i8, (String) object);
                        } else {
                            to0Var.p(i8, (xd0) object);
                        }
                    }
                    cy3Var = this;
                    break;
                case 9:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.y(i8, (h2) unsafe.getObject(obj, j), cy3Var.m(i6));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.p(i8, (xd0) unsafe.getObject(obj, j));
                    }
                    cy3Var = this;
                    break;
                case 11:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.C(i8, unsafe.getInt(obj, j));
                    }
                    cy3Var = this;
                    break;
                case 12:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.v(i8, unsafe.getInt(obj, j));
                    }
                    cy3Var = this;
                    break;
                case 13:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.r(i8, unsafe.getInt(obj, j));
                    }
                    cy3Var = this;
                    break;
                case 14:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        to0Var.t(i8, unsafe.getLong(obj, j));
                    }
                    cy3Var = this;
                    break;
                case 15:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        int i12 = unsafe.getInt(obj, j);
                        to0Var.C(i8, (i12 >> 31) ^ (i12 << 1));
                    }
                    cy3Var = this;
                    break;
                case 16:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        to0Var.E(i8, (j2 >> 63) ^ (j2 << 1));
                    }
                    cy3Var = this;
                    break;
                case 17:
                    if (cy3Var.o(obj, i6, i5, i7, i3)) {
                        i75Var.w(i8, unsafe.getObject(obj, j), cy3Var.m(i6));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    cc5.n(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 19:
                    cc5.r(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 20:
                    cc5.t(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 21:
                    cc5.z(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 22:
                    cc5.s(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 23:
                    cc5.q(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 24:
                    cc5.p(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 25:
                    cc5.m(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = cc5.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            to0Var.z(i13, (String) list.get(i14));
                        }
                    }
                    break;
                case 27:
                    int i15 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zb5 m = cy3Var.m(i6);
                    Class cls2 = cc5.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            to0Var.y(i15, (h2) list2.get(i16), m);
                        }
                    }
                    break;
                case 28:
                    int i17 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = cc5.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            to0Var.p(i17, (xd0) list3.get(i18));
                        }
                    }
                    break;
                case 29:
                    z = false;
                    cc5.y(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 30:
                    z = false;
                    cc5.o(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 31:
                    z = false;
                    cc5.u(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 32:
                    z = false;
                    cc5.v(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 33:
                    z = false;
                    cc5.w(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case 34:
                    z = false;
                    cc5.x(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, false);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    cc5.n(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                    cc5.r(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                    cc5.t(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    cc5.z(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                    cc5.s(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                    cc5.q(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                    cc5.p(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                    cc5.m(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    cc5.y(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                    cc5.o(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                    cc5.u(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    cc5.v(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    cc5.w(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, i == true ? 1 : 0);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    cc5.x(iArr[i6], (List) unsafe.getObject(obj, j), i75Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    int i19 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zb5 m2 = cy3Var.m(i6);
                    Class cls4 = cc5.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            i75Var.w(i19, list4.get(i20), m2);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i21 = 2;
                        Object obj2 = cy3Var.b[(i6 / 3) * 2];
                        cy3Var.m.getClass();
                        dn0 dn0Var = ((en3) obj2).a;
                        for (Map.Entry entry : ((hn3) object2).entrySet()) {
                            to0Var.B(i8, i21);
                            to0Var.D(en3.a(dn0Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            w12.b(to0Var, (v67) dn0Var.y, i, key);
                            i21 = 2;
                            w12.b(to0Var, (v67) dn0Var.z, 2, value);
                            i = 1;
                        }
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.t(i8, Double.doubleToRawLongBits(((Double) so6.h(j, obj)).doubleValue()));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.r(i8, Float.floatToRawIntBits(((Float) so6.h(j, obj)).floatValue()));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.E(i8, z(j, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.E(i8, z(j, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.v(i8, y(j, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.t(i8, z(j, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.r(i8, y(j, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.o(i8, ((Boolean) so6.h(j, obj)).booleanValue());
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            to0Var.z(i8, (String) object3);
                        } else {
                            to0Var.p(i8, (xd0) object3);
                        }
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.y(i8, (h2) unsafe.getObject(obj, j), cy3Var.m(i6));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.p(i8, (xd0) unsafe.getObject(obj, j));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.C(i8, y(j, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.v(i8, y(j, obj));
                    }
                    break;
                case 64:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.r(i8, y(j, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        to0Var.t(i8, z(j, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        int y = y(j, obj);
                        to0Var.C(i8, (y >> 31) ^ (y << 1));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        long z2 = z(j, obj);
                        to0Var.E(i8, (z2 << (i == true ? 1L : 0L)) ^ (z2 >> 63));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS_VALUE:
                    if (cy3Var.q(i8, i6, obj)) {
                        i75Var.w(i8, unsafe.getObject(obj, j), cy3Var.m(i6));
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        cy3Var.l.getClass();
        ((vd2) obj).unknownFields.d(i75Var);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0049. Please report as an issue. */
    @Override // defpackage.zb5
    public final int h(vd2 vd2Var) {
        int i;
        int h;
        int h2;
        int h3;
        int j;
        int h4;
        int j2;
        int h5;
        int h6;
        int g;
        int h7;
        int a;
        int i2;
        int f;
        int h8;
        int a2;
        int c;
        int h9;
        int size;
        int i3;
        int h10;
        int h11;
        int h12;
        int size2;
        int h13;
        int i4;
        int i5;
        int h14;
        int h15;
        int j3;
        int h16;
        int j4;
        int g2;
        int i6;
        cy3 cy3Var = this;
        vd2 vd2Var2 = vd2Var;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (true) {
            int[] iArr = cy3Var.a;
            if (i7 < iArr.length) {
                int J = cy3Var.J(i7);
                int I = I(J);
                int i11 = iArr[i7];
                int i12 = iArr[i7 + 2];
                int i13 = i12 & 1048575;
                Unsafe unsafe = o;
                if (I <= 17) {
                    if (i13 != i10) {
                        if (i13 == 1048575) {
                            i8 = 0;
                        } else {
                            i8 = unsafe.getInt(vd2Var2, i13);
                        }
                        i10 = i13;
                    }
                    i = 1 << (i12 >>> 20);
                } else {
                    i = 0;
                }
                long j5 = J & 1048575;
                if (I >= z12.y.x) {
                    byte b = z12.z.x;
                }
                switch (I) {
                    case 0:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            h = to0.h(i11);
                            c = h + 8;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            h2 = to0.h(i11);
                            h6 = h2 + 4;
                            i9 += h6;
                        }
                        cy3Var = this;
                        vd2Var2 = vd2Var;
                        break;
                    case 2:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            long j6 = unsafe.getLong(vd2Var2, j5);
                            h3 = to0.h(i11);
                            j = to0.j(j6);
                            i9 += j + h3;
                        }
                        cy3Var = this;
                        break;
                    case 3:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            long j7 = unsafe.getLong(vd2Var2, j5);
                            h3 = to0.h(i11);
                            j = to0.j(j7);
                            i9 += j + h3;
                        }
                        cy3Var = this;
                        break;
                    case 4:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            int i14 = unsafe.getInt(vd2Var2, j5);
                            h4 = to0.h(i11);
                            j2 = to0.j(i14);
                            f = j2 + h4;
                            i9 += f;
                        }
                        cy3Var = this;
                        break;
                    case 5:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            h5 = to0.h(i11);
                            h6 = h5 + 8;
                            i9 += h6;
                        }
                        cy3Var = this;
                        vd2Var2 = vd2Var;
                        break;
                    case 6:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            h2 = to0.h(i11);
                            h6 = h2 + 4;
                            i9 += h6;
                        }
                        cy3Var = this;
                        vd2Var2 = vd2Var;
                        break;
                    case 7:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            h6 = to0.h(i11) + 1;
                            i9 += h6;
                        }
                        cy3Var = this;
                        vd2Var2 = vd2Var;
                        break;
                    case 8:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            Object object = unsafe.getObject(vd2Var2, j5);
                            if (object instanceof xd0) {
                                g = to0.f(i11, (xd0) object);
                            } else {
                                g = to0.g((String) object) + to0.h(i11);
                            }
                            i9 = g + i9;
                        }
                        cy3Var = this;
                        break;
                    case 9:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            Object object2 = unsafe.getObject(vd2Var2, j5);
                            zb5 m = cy3Var.m(i7);
                            Class cls = cc5.a;
                            h7 = to0.h(i11);
                            a = ((h2) object2).a(m);
                            i2 = to0.i(a);
                            i6 = i2 + a + h7;
                            i9 += i6;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            f = to0.f(i11, (xd0) unsafe.getObject(vd2Var2, j5));
                            i9 += f;
                        }
                        cy3Var = this;
                        break;
                    case 11:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            int i15 = unsafe.getInt(vd2Var2, j5);
                            h4 = to0.h(i11);
                            j2 = to0.i(i15);
                            f = j2 + h4;
                            i9 += f;
                        }
                        cy3Var = this;
                        break;
                    case 12:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            int i16 = unsafe.getInt(vd2Var2, j5);
                            h4 = to0.h(i11);
                            j2 = to0.j(i16);
                            f = j2 + h4;
                            i9 += f;
                        }
                        cy3Var = this;
                        break;
                    case 13:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            h2 = to0.h(i11);
                            h6 = h2 + 4;
                            i9 += h6;
                        }
                        cy3Var = this;
                        vd2Var2 = vd2Var;
                        break;
                    case 14:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            h5 = to0.h(i11);
                            h6 = h5 + 8;
                            i9 += h6;
                        }
                        cy3Var = this;
                        vd2Var2 = vd2Var;
                        break;
                    case 15:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            int i17 = unsafe.getInt(vd2Var2, j5);
                            h4 = to0.h(i11);
                            j2 = to0.i((i17 >> 31) ^ (i17 << 1));
                            f = j2 + h4;
                            i9 += f;
                        }
                        cy3Var = this;
                        break;
                    case 16:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            long j8 = unsafe.getLong(vd2Var2, j5);
                            h3 = to0.h(i11);
                            j = to0.j((j8 << 1) ^ (j8 >> 63));
                            i9 += j + h3;
                        }
                        cy3Var = this;
                        break;
                    case 17:
                        if (cy3Var.o(vd2Var2, i7, i10, i8, i)) {
                            h2 h2Var = (h2) unsafe.getObject(vd2Var2, j5);
                            zb5 m2 = cy3Var.m(i7);
                            h8 = to0.h(i11) * 2;
                            a2 = h2Var.a(m2);
                            c = a2 + h8;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        c = cc5.c(i11, (List) unsafe.getObject(vd2Var2, j5));
                        i9 += c;
                        break;
                    case 19:
                        c = cc5.b(i11, (List) unsafe.getObject(vd2Var2, j5));
                        i9 += c;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls2 = cc5.a;
                        if (list.size() != 0) {
                            h9 = (to0.h(i11) * list.size()) + cc5.e(list);
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 21:
                        List list2 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls3 = cc5.a;
                        size = list2.size();
                        if (size != 0) {
                            i3 = cc5.i(list2);
                            h10 = to0.h(i11);
                            h9 = (h10 * size) + i3;
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 22:
                        List list3 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls4 = cc5.a;
                        size = list3.size();
                        if (size != 0) {
                            i3 = cc5.d(list3);
                            h10 = to0.h(i11);
                            h9 = (h10 * size) + i3;
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 23:
                        c = cc5.c(i11, (List) unsafe.getObject(vd2Var2, j5));
                        i9 += c;
                        break;
                    case 24:
                        c = cc5.b(i11, (List) unsafe.getObject(vd2Var2, j5));
                        i9 += c;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls5 = cc5.a;
                        int size3 = list4.size();
                        if (size3 == 0) {
                            h11 = 0;
                        } else {
                            h11 = (to0.h(i11) + 1) * size3;
                        }
                        i9 += h11;
                        break;
                    case 26:
                        List list5 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls6 = cc5.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            h9 = to0.h(i11) * size4;
                            for (int i18 = 0; i18 < size4; i18++) {
                                Object obj = list5.get(i18);
                                if (obj instanceof xd0) {
                                    int size5 = ((xd0) obj).size();
                                    h9 = to0.i(size5) + size5 + h9;
                                } else {
                                    h9 = to0.g((String) obj) + h9;
                                }
                            }
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 27:
                        List list6 = (List) unsafe.getObject(vd2Var2, j5);
                        zb5 m3 = cy3Var.m(i7);
                        Class cls7 = cc5.a;
                        int size6 = list6.size();
                        if (size6 == 0) {
                            h12 = 0;
                        } else {
                            h12 = to0.h(i11) * size6;
                            for (int i19 = 0; i19 < size6; i19++) {
                                int a3 = ((h2) list6.get(i19)).a(m3);
                                h12 += to0.i(a3) + a3;
                            }
                        }
                        i9 += h12;
                        break;
                    case 28:
                        List list7 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls8 = cc5.a;
                        int size7 = list7.size();
                        if (size7 != 0) {
                            h9 = to0.h(i11) * size7;
                            for (int i20 = 0; i20 < list7.size(); i20++) {
                                int size8 = ((xd0) list7.get(i20)).size();
                                h9 += to0.i(size8) + size8;
                            }
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 29:
                        List list8 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls9 = cc5.a;
                        size = list8.size();
                        if (size != 0) {
                            i3 = cc5.h(list8);
                            h10 = to0.h(i11);
                            h9 = (h10 * size) + i3;
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 30:
                        List list9 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls10 = cc5.a;
                        size = list9.size();
                        if (size != 0) {
                            i3 = cc5.a(list9);
                            h10 = to0.h(i11);
                            h9 = (h10 * size) + i3;
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 31:
                        c = cc5.b(i11, (List) unsafe.getObject(vd2Var2, j5));
                        i9 += c;
                        break;
                    case 32:
                        c = cc5.c(i11, (List) unsafe.getObject(vd2Var2, j5));
                        i9 += c;
                        break;
                    case 33:
                        List list10 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls11 = cc5.a;
                        size = list10.size();
                        if (size != 0) {
                            i3 = cc5.f(list10);
                            h10 = to0.h(i11);
                            h9 = (h10 * size) + i3;
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 34:
                        List list11 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls12 = cc5.a;
                        size = list11.size();
                        if (size != 0) {
                            i3 = cc5.g(list11);
                            h10 = to0.h(i11);
                            h9 = (h10 * size) + i3;
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        List list12 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls13 = cc5.a;
                        size2 = list12.size() * 8;
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                        List list13 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls14 = cc5.a;
                        size2 = list13.size() * 4;
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                        size2 = cc5.e((List) unsafe.getObject(vd2Var2, j5));
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        size2 = cc5.i((List) unsafe.getObject(vd2Var2, j5));
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                        size2 = cc5.d((List) unsafe.getObject(vd2Var2, j5));
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                        List list14 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls15 = cc5.a;
                        size2 = list14.size() * 8;
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                        List list15 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls16 = cc5.a;
                        size2 = list15.size() * 4;
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                        List list16 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls17 = cc5.a;
                        size2 = list16.size();
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                        size2 = cc5.h((List) unsafe.getObject(vd2Var2, j5));
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                        size2 = cc5.a((List) unsafe.getObject(vd2Var2, j5));
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                        List list17 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls18 = cc5.a;
                        size2 = list17.size() * 4;
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                        List list18 = (List) unsafe.getObject(vd2Var2, j5);
                        Class cls19 = cc5.a;
                        size2 = list18.size() * 8;
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                        size2 = cc5.f((List) unsafe.getObject(vd2Var2, j5));
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                        size2 = cc5.g((List) unsafe.getObject(vd2Var2, j5));
                        if (size2 > 0) {
                            h13 = to0.h(i11);
                            i4 = to0.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                        List list19 = (List) unsafe.getObject(vd2Var2, j5);
                        zb5 m4 = cy3Var.m(i7);
                        Class cls20 = cc5.a;
                        int size9 = list19.size();
                        if (size9 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            for (int i21 = 0; i21 < size9; i21++) {
                                i5 += ((h2) list19.get(i21)).a(m4) + (to0.h(i11) * 2);
                            }
                        }
                        i9 += i5;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(vd2Var2, j5);
                        Object obj2 = cy3Var.b[(i7 / 3) * 2];
                        cy3Var.m.getClass();
                        hn3 hn3Var = (hn3) object3;
                        en3 en3Var = (en3) obj2;
                        if (!hn3Var.isEmpty()) {
                            h9 = 0;
                            for (Map.Entry entry : hn3Var.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                en3Var.getClass();
                                int h17 = to0.h(i11);
                                int a4 = en3.a(en3Var.a, key, value);
                                h9 += to0.i(a4) + a4 + h17;
                            }
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            h = to0.h(i11);
                            c = h + 8;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            h14 = to0.h(i11);
                            c = h14 + 4;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            long z = z(j5, vd2Var2);
                            h15 = to0.h(i11);
                            j3 = to0.j(z);
                            i6 = j3 + h15;
                            i9 += i6;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            long z2 = z(j5, vd2Var2);
                            h15 = to0.h(i11);
                            j3 = to0.j(z2);
                            i6 = j3 + h15;
                            i9 += i6;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            int y = y(j5, vd2Var2);
                            h16 = to0.h(i11);
                            j4 = to0.j(y);
                            c = j4 + h16;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            h = to0.h(i11);
                            c = h + 8;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            h14 = to0.h(i11);
                            c = h14 + 4;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            c = to0.h(i11) + 1;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            Object object4 = unsafe.getObject(vd2Var2, j5);
                            if (object4 instanceof xd0) {
                                g2 = to0.f(i11, (xd0) object4);
                            } else {
                                g2 = to0.g((String) object4) + to0.h(i11);
                            }
                            i9 = g2 + i9;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            Object object5 = unsafe.getObject(vd2Var2, j5);
                            zb5 m5 = cy3Var.m(i7);
                            Class cls21 = cc5.a;
                            h7 = to0.h(i11);
                            a = ((h2) object5).a(m5);
                            i2 = to0.i(a);
                            i6 = i2 + a + h7;
                            i9 += i6;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            c = to0.f(i11, (xd0) unsafe.getObject(vd2Var2, j5));
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            int y2 = y(j5, vd2Var2);
                            h16 = to0.h(i11);
                            j4 = to0.i(y2);
                            c = j4 + h16;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            int y3 = y(j5, vd2Var2);
                            h16 = to0.h(i11);
                            j4 = to0.j(y3);
                            c = j4 + h16;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            h14 = to0.h(i11);
                            c = h14 + 4;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            h = to0.h(i11);
                            c = h + 8;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            int y4 = y(j5, vd2Var2);
                            h16 = to0.h(i11);
                            j4 = to0.i((y4 >> 31) ^ (y4 << 1));
                            c = j4 + h16;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            long z3 = z(j5, vd2Var2);
                            h15 = to0.h(i11);
                            j3 = to0.j((z3 << 1) ^ (z3 >> 63));
                            i6 = j3 + h15;
                            i9 += i6;
                            break;
                        } else {
                            break;
                        }
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS_VALUE:
                        if (cy3Var.q(i11, i7, vd2Var2)) {
                            h2 h2Var2 = (h2) unsafe.getObject(vd2Var2, j5);
                            zb5 m6 = cy3Var.m(i7);
                            h8 = to0.h(i11) * 2;
                            a2 = h2Var2.a(m6);
                            c = a2 + h8;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                }
                i7 += 3;
            } else {
                cy3Var.l.getClass();
                return vd2Var2.unknownFields.b() + i9;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0076. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:60:0x082a A[Catch: all -> 0x0500, TryCatch #0 {all -> 0x0500, blocks: (B:58:0x0825, B:60:0x082a, B:61:0x082f, B:126:0x04fb, B:129:0x0503, B:130:0x051b, B:131:0x0533, B:132:0x054b, B:133:0x0563, B:134:0x057b, B:135:0x0593, B:136:0x05ab, B:137:0x05c3, B:138:0x05eb, B:139:0x060b, B:140:0x062b, B:141:0x064c, B:142:0x066d, B:143:0x0690, B:144:0x06b0, B:145:0x06c9, B:146:0x06f1, B:147:0x0702, B:148:0x0724, B:149:0x0745, B:150:0x0766, B:151:0x0786, B:152:0x07a6, B:153:0x07c5, B:154:0x07e7, B:162:0x0809), top: B:57:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0835 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0850 A[LOOP:3: B:75:0x084e->B:76:0x0850, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x085a  */
    @Override // defpackage.zb5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r21, defpackage.fm0 r22, defpackage.xz1 r23) {
        /*
            Method dump skipped, instructions count: 2296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy3.i(java.lang.Object, fm0, xz1):void");
    }

    public final boolean j(vd2 vd2Var, vd2 vd2Var2, int i) {
        if (n(i, vd2Var) == n(i, vd2Var2)) {
            return true;
        }
        return false;
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (so6.h(J(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        ov3.d();
    }

    public final zb5 m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        zb5 zb5Var = (zb5) objArr[i2];
        if (zb5Var != null) {
            return zb5Var;
        }
        zb5 a = ew4.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy3.n(int, java.lang.Object):boolean");
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return n(i, obj);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(int i, int i2, Object obj) {
        if (so6.f(this.a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r10.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.Object r8, int r9, java.lang.Object r10, defpackage.xz1 r11, defpackage.fm0 r12) {
        /*
            r7 = this;
            int r9 = r7.J(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            java.lang.Object r9 = defpackage.so6.h(r0, r8)
            jn3 r7 = r7.m
            if (r9 != 0) goto L1e
            r7.getClass()
            hn3 r9 = defpackage.hn3.y
            hn3 r9 = r9.b()
            defpackage.so6.o(r0, r8, r9)
            goto L35
        L1e:
            r7.getClass()
            r2 = r9
            hn3 r2 = (defpackage.hn3) r2
            boolean r2 = r2.x
            if (r2 != 0) goto L35
            hn3 r2 = defpackage.hn3.y
            hn3 r2 = r2.b()
            defpackage.jn3.a(r2, r9)
            defpackage.so6.o(r0, r8, r2)
            r9 = r2
        L35:
            r7.getClass()
            hn3 r9 = (defpackage.hn3) r9
            en3 r10 = (defpackage.en3) r10
            dn0 r7 = r10.a
            r8 = 2
            r12.F(r8)
            java.lang.Object r10 = r12.B
            po0 r10 = (defpackage.po0) r10
            int r0 = r10.A()
            int r0 = r10.j(r0)
            java.lang.Object r1 = r7.A
            java.lang.String r2 = ""
            r3 = r1
        L53:
            int r4 = r12.e()     // Catch: java.lang.Throwable -> L77
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L9d
            boolean r5 = r10.c()     // Catch: java.lang.Throwable -> L77
            if (r5 == 0) goto L63
            goto L9d
        L63:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L86
            if (r4 == r8) goto L79
            boolean r4 = r12.H()     // Catch: java.lang.Throwable -> L77 defpackage.a33 -> L90
            if (r4 == 0) goto L71
            goto L53
        L71:
            b33 r4 = new b33     // Catch: java.lang.Throwable -> L77 defpackage.a33 -> L90
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L77 defpackage.a33 -> L90
            throw r4     // Catch: java.lang.Throwable -> L77 defpackage.a33 -> L90
        L77:
            r7 = move-exception
            goto La4
        L79:
            java.lang.Object r4 = r7.z     // Catch: java.lang.Throwable -> L77 defpackage.a33 -> L90
            v67 r4 = (defpackage.v67) r4     // Catch: java.lang.Throwable -> L77 defpackage.a33 -> L90
            java.lang.Class r5 = r1.getClass()     // Catch: java.lang.Throwable -> L77 defpackage.a33 -> L90
            java.lang.Object r3 = r12.r(r4, r5, r11)     // Catch: java.lang.Throwable -> L77 defpackage.a33 -> L90
            goto L53
        L86:
            java.lang.Object r4 = r7.y     // Catch: java.lang.Throwable -> L77 defpackage.a33 -> L90
            v67 r4 = (defpackage.v67) r4     // Catch: java.lang.Throwable -> L77 defpackage.a33 -> L90
            r5 = 0
            java.lang.Object r2 = r12.r(r4, r5, r5)     // Catch: java.lang.Throwable -> L77 defpackage.a33 -> L90
            goto L53
        L90:
            boolean r4 = r12.H()     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L97
            goto L53
        L97:
            b33 r7 = new b33     // Catch: java.lang.Throwable -> L77
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L77
            throw r7     // Catch: java.lang.Throwable -> L77
        L9d:
            r9.put(r2, r3)     // Catch: java.lang.Throwable -> L77
            r10.h(r0)
            return
        La4:
            r10.h(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy3.r(java.lang.Object, int, java.lang.Object, xz1, fm0):void");
    }

    public final void s(int i, Object obj, Object obj2) {
        if (!n(i, obj2)) {
            return;
        }
        long J = J(i) & 1048575;
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj2, J);
        if (object != null) {
            zb5 m = m(i);
            if (!n(i, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, J, object);
                } else {
                    vd2 d = m.d();
                    m.a(d, object);
                    unsafe.putObject(obj, J, d);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                vd2 d2 = m.d();
                m.a(d2, object2);
                unsafe.putObject(obj, J, d2);
                object2 = d2;
            }
            m.a(object2, object);
            return;
        }
        ov3.e(this.a[i], obj2);
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (!q(i2, i, obj2)) {
            return;
        }
        long J = J(i) & 1048575;
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj2, J);
        if (object != null) {
            zb5 m = m(i);
            if (!q(i2, i, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, J, object);
                } else {
                    vd2 d = m.d();
                    m.a(d, object);
                    unsafe.putObject(obj, J, d);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                vd2 d2 = m.d();
                m.a(d2, object2);
                unsafe.putObject(obj, J, d2);
                object2 = d2;
            }
            m.a(object2, object);
            return;
        }
        ov3.e(iArr[i], obj2);
    }

    public final Object u(int i, Object obj) {
        zb5 m = m(i);
        long J = J(i) & 1048575;
        if (!n(i, obj)) {
            return m.d();
        }
        Object object = o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        vd2 d = m.d();
        if (object != null) {
            m.a(d, object);
        }
        return d;
    }

    public final Object v(int i, int i2, Object obj) {
        zb5 m = m(i2);
        if (!q(i, i2, obj)) {
            return m.d();
        }
        Object object = o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        vd2 d = m.d();
        if (object != null) {
            m.a(d, object);
        }
        return d;
    }
}
