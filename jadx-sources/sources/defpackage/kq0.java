package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kq0 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final lk5 a;
    public final int b;
    public final int c;
    public final Bundle d;
    public final iw2 e;
    public final boolean f;
    public final Object g;

    static {
        String str = eq6.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        m = Integer.toString(8, 36);
        n = Integer.toString(9, 36);
    }

    public kq0(lk5 lk5Var, int i2, int i3, Bundle bundle, boolean z, iw2 iw2Var, Object obj) {
        this.a = lk5Var;
        this.b = i2;
        this.c = i3;
        this.d = new Bundle(bundle);
        this.f = z;
        this.e = iw2Var;
        this.g = obj;
    }

    public static boolean b(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((kq0) list.get(i3)).e.b(0) == i2) {
                return true;
            }
        }
        return false;
    }

    public static kq0 c(lk5 lk5Var) {
        int i2;
        String str = lk5Var.b;
        Bundle bundle = lk5Var.c;
        boolean z = true;
        int i3 = 0;
        if (str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int parseInt = Integer.parseInt(str.substring(39));
            Object g = g(h(parseInt), bundle);
            jq0 jq0Var = new jq0();
            if (jq0Var.a != null) {
                z = false;
            }
            io3.m("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", z);
            jq0Var.b = parseInt;
            jq0Var.g = k(h(parseInt), g);
            return jq0Var.a();
        }
        int parseInt2 = Integer.parseInt(str.substring(40));
        if (parseInt2 == 40010) {
            i2 = 5;
        } else {
            i2 = 0;
        }
        Object g2 = g(i2, bundle);
        jq0 jq0Var2 = new jq0();
        lk5 lk5Var2 = new lk5(parseInt2);
        if (jq0Var2.b != -1) {
            z = false;
        }
        io3.m("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", z);
        jq0Var2.a = lk5Var2;
        if (lk5Var2.a == 40010) {
            i3 = 5;
        }
        jq0Var2.g = k(i3, g2);
        return jq0Var2.a();
    }

    public static o15 f(List list) {
        int b;
        if (list.isEmpty()) {
            z62 z62Var = nw2.y;
            return o15.B;
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < list.size(); i4++) {
            kq0 kq0Var = (kq0) list.get(i4);
            boolean z = kq0Var.f;
            iw2 iw2Var = kq0Var.e;
            if (z && kq0Var.a()) {
                int i5 = 0;
                while (true) {
                    if (i5 < iw2Var.y && (b = iw2Var.b(i5)) != 6) {
                        if (i2 == -1 && b == 2) {
                            i2 = i4;
                            break;
                        }
                        if (i3 == -1 && b == 3) {
                            i3 = i4;
                            break;
                        }
                        i5++;
                    }
                }
            }
        }
        jw2 k2 = nw2.k();
        if (i2 != -1) {
            k2.c(((kq0) list.get(i2)).d(2));
        }
        if (i3 != -1) {
            k2.c(((kq0) list.get(i3)).d(3));
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            kq0 kq0Var2 = (kq0) list.get(i6);
            if (kq0Var2.f && kq0Var2.a() && i6 != i2 && i6 != i3 && kq0Var2.e.a(6)) {
                k2.c(kq0Var2.d(6));
            }
        }
        return k2.g();
    }

    public static Object g(int i2, Bundle bundle) {
        if (!bundle.containsKey("androidx.media3.session.CUSTOM_COMMAND_PARAMETER")) {
            return null;
        }
        switch (i2) {
            case 1:
                return Long.valueOf(bundle.getLong("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 2:
                return Integer.valueOf(bundle.getInt("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 3:
                return Boolean.valueOf(bundle.getBoolean("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 4:
                return Float.valueOf(bundle.getFloat("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 5:
                Bundle bundle2 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle2.getClass();
                return yx4.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle3.getClass();
                return ar3.b(10, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle4.getClass();
                return jr3.b(10, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle5.getClass();
                return hh6.b(bundle5);
            default:
                return null;
        }
    }

    public static int h(int i2) {
        if (i2 != 1) {
            if (i2 == 5) {
                return 1;
            }
            if (i2 != 10) {
                if (i2 != 19) {
                    if (i2 != 24) {
                        if (i2 != 29) {
                            if (i2 == 31) {
                                return 6;
                            }
                            switch (i2) {
                                case 13:
                                    return 4;
                                case 14:
                                    return 3;
                                case 15:
                                    return 2;
                                default:
                                    return 0;
                            }
                        }
                        return 8;
                    }
                    return 4;
                }
                return 7;
            }
            return 2;
        }
        return 3;
    }

    public static boolean i(String str) {
        if (!str.startsWith("androidx.media3.session.PLAYER_COMMAND_") && !str.startsWith("androidx.media3.session.SESSION_COMMAND_")) {
            return false;
        }
        return true;
    }

    public static Object k(int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i2) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                io3.m("Parameter has incorrect type.", obj instanceof Long);
                return obj;
            case 2:
                io3.m("Parameter has incorrect type.", obj instanceof Integer);
                return obj;
            case 3:
                io3.m("Parameter has incorrect type.", obj instanceof Boolean);
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                io3.m("Parameter has incorrect type.", obj instanceof Float);
                return obj;
            case 5:
                io3.m("Parameter has incorrect type.", obj instanceof yx4);
                return obj;
            case 6:
                io3.m("Parameter has incorrect type.", obj instanceof ar3);
                return obj;
            case 7:
                io3.m("Parameter has incorrect type.", obj instanceof jr3);
                return obj;
            case 8:
                io3.m("Parameter has incorrect type.", obj instanceof hh6);
                return obj;
            default:
                return null;
        }
    }

    public final boolean a() {
        Object obj = this.g;
        lk5 lk5Var = this.a;
        if (lk5Var != null) {
            int i2 = lk5Var.a;
            if (i2 == 0) {
                return true;
            }
            if (i2 == 40010 && obj != null) {
                return true;
            }
            return false;
        }
        int i3 = this.b;
        if (i3 != 19) {
            if (i3 != 24) {
                if (i3 != 29 && i3 != 31) {
                    switch (i3) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final kq0 d(int i2) {
        String str;
        Bundle bundle = this.d;
        lk5 lk5Var = this.a;
        if (lk5Var != null && lk5Var.a == 0) {
            iw2 iw2Var = new iw2(new int[]{i2}, 1);
            if (this.e.equals(iw2Var)) {
                return this;
            }
            return new kq0(this.a, this.b, this.c, new Bundle(bundle), this.f, iw2Var, this.g);
        }
        Bundle bundle2 = Bundle.EMPTY;
        if (this.g != null) {
            bundle2 = new Bundle();
            l(10, bundle2, "androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
        }
        if (lk5Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + lk5Var.a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.b;
        }
        return new kq0(new lk5(bundle2, str), -1, this.c, bundle, this.f, new iw2(new int[]{i2}, 1), null);
    }

    public final void e(ko4 ko4Var) {
        if (this.f) {
            Object obj = this.g;
            int i2 = this.b;
            if (i2 != 19) {
                if (i2 != 24) {
                    if (i2 != 29) {
                        if (i2 != 31) {
                            switch (i2) {
                                case 1:
                                    if (obj != null) {
                                        ko4Var.Y(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        ko4Var.Y(!ko4Var.n());
                                        return;
                                    }
                                case 2:
                                    ko4Var.a();
                                    return;
                                case 3:
                                    ko4Var.stop();
                                    return;
                                case 4:
                                    ko4Var.B();
                                    return;
                                case 5:
                                    if (obj != null) {
                                        ko4Var.Q(((Long) obj).longValue());
                                        return;
                                    }
                                    return;
                                case 6:
                                    ko4Var.A();
                                    return;
                                case 7:
                                    ko4Var.V();
                                    return;
                                case 8:
                                    ko4Var.g0();
                                    return;
                                case 9:
                                    ko4Var.S0();
                                    return;
                                case 10:
                                    if (obj != null) {
                                        ko4Var.Z(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                case 11:
                                    ko4Var.V0();
                                    return;
                                case 12:
                                    ko4Var.T0();
                                    return;
                                case 13:
                                    if (obj != null) {
                                        ko4Var.c(((Float) obj).floatValue());
                                        return;
                                    }
                                    return;
                                case 14:
                                    if (obj != null) {
                                        ko4Var.r(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        ko4Var.r(!ko4Var.O0());
                                        return;
                                    }
                                case 15:
                                    if (obj != null) {
                                        ko4Var.u0(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        }
                        if (obj != null) {
                            ko4Var.x0((ar3) obj);
                            return;
                        }
                        return;
                    }
                    if (obj != null) {
                        ko4Var.L((hh6) obj);
                        return;
                    }
                    return;
                }
                if (obj != null) {
                    ko4Var.U(((Float) obj).floatValue());
                    return;
                } else if (ko4Var.getVolume() == 0.0f) {
                    ko4Var.d0();
                    return;
                } else {
                    ko4Var.L0();
                    return;
                }
            }
            if (obj != null) {
                ko4Var.o0((jr3) obj);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kq0) {
                kq0 kq0Var = (kq0) obj;
                if (Objects.equals(this.a, kq0Var.a) && this.b == kq0Var.b && this.c == kq0Var.c && TextUtils.equals("", "") && this.f == kq0Var.f && this.e.equals(kq0Var.e) && Objects.equals(this.g, kq0Var.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), 0, Integer.valueOf(this.c), "", Boolean.valueOf(this.f), null, this.e, this.g);
    }

    public final Bundle j(int i2) {
        Bundle bundle = new Bundle();
        lk5 lk5Var = this.a;
        if (lk5Var != null) {
            bundle.putBundle(h, lk5Var.a());
        }
        int i3 = this.b;
        if (i3 != -1) {
            bundle.putInt(i, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            bundle.putInt(j, i4);
        }
        Bundle bundle2 = this.d;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(k, bundle2);
        }
        boolean z = this.f;
        if (!z) {
            bundle.putBoolean(l, z);
        }
        iw2 iw2Var = this.e;
        if (iw2Var.y != 1 || iw2Var.b(0) != 6) {
            bundle.putIntArray(m, Arrays.copyOfRange(iw2Var.x, 0, iw2Var.y));
        }
        if (this.g != null) {
            l(i2, bundle, n);
        }
        return bundle;
    }

    public final void l(int i2, Bundle bundle, String str) {
        int h2;
        lk5 lk5Var = this.a;
        if (lk5Var != null) {
            if (lk5Var.a == 40010) {
                h2 = 5;
            } else {
                h2 = 0;
            }
        } else {
            h2 = h(this.b);
        }
        Object obj = this.g;
        switch (h2) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                return;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                return;
            case 3:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                return;
            case 5:
                bundle.putBundle(str, ((yx4) obj).c());
                return;
            case 6:
                bundle.putBundle(str, ((ar3) obj).c(i2, false));
                return;
            case 7:
                bundle.putBundle(str, ((jr3) obj).c(i2));
                return;
            case 8:
                bundle.putBundle(str, ((hh6) obj).c());
                return;
            default:
                return;
        }
    }
}
