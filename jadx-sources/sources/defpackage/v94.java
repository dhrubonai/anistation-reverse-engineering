package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.ExtractedText;
import com.anistation.android.R;
import com.anistation.model.Relation;
import java.io.File;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class v94 {
    public static final nl a = new nl(Float.POSITIVE_INFINITY);
    public static final ol b = new ol(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final pl c = new pl(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ql d = new ql(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final nl e = new nl(Float.NEGATIVE_INFINITY);
    public static final ol f = new ol(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final pl g = new pl(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final ql h = new ql(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final Object[] i = new Object[0];
    public static final os0 j = new os0(1389223547, false, new ps0(18));
    public static final os0 k = new os0(1088198111, false, new ps0(19));
    public static final os0 l = new os0(-785038476, false, new ys0(7));
    public static final os0 m = new os0(-1637322001, false, new ys0(8));
    public static final char[] n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Object p = new Object();
    public static final Object q = new Object();
    public static final q12 r;
    public static final q12 s;
    public static final q12 t;
    public static final q12 u;
    public static final q12[] v;

    static {
        q12 q12Var = new q12("client_side_logging", -1, 1L, true);
        q12 q12Var2 = new q12("cxless_client_minimal", -1, 1L, true);
        r = q12Var2;
        q12 q12Var3 = new q12("cxless_caf_control", -1, 1L, true);
        q12 q12Var4 = new q12("module_flag_control", -1, 1L, true);
        s = q12Var4;
        q12 q12Var5 = new q12("discovery_hint_supply", -1, 1L, true);
        q12 q12Var6 = new q12("relay_casting_set_active_account", -1, 1L, true);
        q12 q12Var7 = new q12("analytics_proto_enum_translation", -1, 1L, true);
        t = q12Var7;
        q12 q12Var8 = new q12("integer_to_integer_map", -1, 1L, true);
        u = q12Var8;
        v = new q12[]{q12Var, q12Var2, q12Var3, q12Var4, q12Var5, q12Var6, q12Var7, q12Var8, new q12("relay_casting_set_remote_casting_mode", -1, 1L, true), new q12("get_relay_access_token", -1, 1L, true), new q12("get_cast_settings", -1, 1L, true), new q12("set_bundle_setting", -1, 1L, true), new q12("get_client_updated_info", -1, 1L, true), new q12("device_suggestions", -1, 1L, true)};
    }

    public static final boolean A(uh5 uh5Var, Resources resources) {
        if (!nx7.L(uh5Var)) {
            ph5 ph5Var = uh5Var.d;
            if (!ph5Var.z) {
                Object g2 = ph5Var.x.g(yh5.a);
                String str = null;
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null) {
                    str = (String) yo0.m0(list);
                }
                if ((str != null || w(uh5Var) != null || v(uh5Var, resources) != null || u(uh5Var)) && B(uh5Var)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean B(uh5 uh5Var) {
        boolean z = false;
        if (!uh5Var.n()) {
            List j2 = uh5.j(4, uh5Var);
            int size = j2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (q23.E((uh5) j2.get(i2))) {
                }
            }
            za3 v2 = uh5Var.c.v();
            while (true) {
                if (v2 != null) {
                    ph5 x = v2.x();
                    if (x != null && x.z) {
                        break;
                    }
                    v2 = v2.v();
                } else {
                    v2 = null;
                    break;
                }
            }
            if (v2 != null) {
                z = true;
            }
            return !z;
        }
        return false;
    }

    public static final yz3 C(yz3 yz3Var, d84 d84Var, g84 g84Var) {
        return yz3Var.w(new h84(d84Var, g84Var));
    }

    public static void D(k16 k16Var, int i2, ay0 ay0Var) {
        long e2 = k16Var.e(i2);
        List g2 = k16Var.g(e2);
        if (!g2.isEmpty()) {
            if (i2 != k16Var.h() - 1) {
                long e3 = k16Var.e(i2 + 1) - k16Var.e(i2);
                if (e3 > 0) {
                    ay0Var.accept(new e31(e2, e3, g2));
                    return;
                }
                return;
            }
            p65.l();
        }
    }

    public static final k31 E(h82 h82Var, int i2) {
        int ordinal = h82Var.f1().ordinal();
        k31 k31Var = k31.x;
        if (ordinal != 0) {
            k31 k31Var2 = null;
            k31 k31Var3 = k31.y;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        ze0.l();
                        return null;
                    }
                } else {
                    return k31Var3;
                }
            } else {
                h82 C = bb4.C(h82Var);
                if (C != null) {
                    k31 E = E(C, i2);
                    if (E != k31Var) {
                        k31Var2 = E;
                    }
                    if (k31Var2 == null) {
                        if (!h82Var.N) {
                            h82Var.N = true;
                            try {
                                u72 c1 = h82Var.c1();
                                mg0 mg0Var = new mg0(i2);
                                r72 r72Var = (r72) ((oa) wc7.P(h82Var)).getFocusOwner();
                                h82 g2 = r72Var.g();
                                c1.k.invoke(mg0Var);
                                h82 g3 = r72Var.g();
                                if (mg0Var.b) {
                                    w72 w72Var = w72.b;
                                    return k31Var3;
                                }
                                if (g2 != g3 && g3 != null) {
                                    if (w72.d == w72.c) {
                                        return k31Var3;
                                    }
                                    return k31.z;
                                }
                                return k31Var;
                            } finally {
                                h82Var.N = false;
                            }
                        }
                        return k31Var;
                    }
                    return k31Var2;
                }
                ze0.k("ActiveParent with no focused child");
                return null;
            }
        }
        return k31Var;
    }

    public static final k31 F(h82 h82Var, int i2) {
        if (!h82Var.O) {
            h82Var.O = true;
            try {
                u72 c1 = h82Var.c1();
                mg0 mg0Var = new mg0(i2);
                r72 r72Var = (r72) ((oa) wc7.P(h82Var)).getFocusOwner();
                h82 g2 = r72Var.g();
                c1.j.invoke(mg0Var);
                h82 g3 = r72Var.g();
                boolean z = mg0Var.b;
                k31 k31Var = k31.y;
                if (z) {
                    w72 w72Var = w72.b;
                    return k31Var;
                }
                if (g2 != g3 && g3 != null) {
                    if (w72.d == w72.c) {
                        return k31Var;
                    }
                    return k31.z;
                }
            } finally {
                h82Var.O = false;
            }
        }
        return k31.x;
    }

    public static final k31 G(h82 h82Var, int i2) {
        xz3 xz3Var;
        kf kfVar;
        int ordinal = h82Var.f1().ordinal();
        k31 k31Var = k31.x;
        if (ordinal != 0) {
            k31 k31Var2 = null;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!h82Var.x.K) {
                            ez2.b("visitAncestors called on an unattached node");
                        }
                        xz3 xz3Var2 = h82Var.x.B;
                        za3 O = wc7.O(h82Var);
                        loop0: while (true) {
                            if (O != null) {
                                if ((((xz3) O.c0.D).A & 1024) != 0) {
                                    while (xz3Var2 != null) {
                                        if ((xz3Var2.z & 1024) != 0) {
                                            xz3Var = xz3Var2;
                                            z44 z44Var = null;
                                            while (xz3Var != null) {
                                                if (xz3Var instanceof h82) {
                                                    break loop0;
                                                }
                                                if ((xz3Var.z & 1024) != 0 && (xz3Var instanceof zc1)) {
                                                    int i3 = 0;
                                                    for (xz3 xz3Var3 = ((zc1) xz3Var).M; xz3Var3 != null; xz3Var3 = xz3Var3.C) {
                                                        if ((xz3Var3.z & 1024) != 0) {
                                                            i3++;
                                                            if (i3 == 1) {
                                                                xz3Var = xz3Var3;
                                                            } else {
                                                                if (z44Var == null) {
                                                                    z44Var = new z44(new xz3[16], 0);
                                                                }
                                                                if (xz3Var != null) {
                                                                    z44Var.b(xz3Var);
                                                                    xz3Var = null;
                                                                }
                                                                z44Var.b(xz3Var3);
                                                            }
                                                        }
                                                    }
                                                    if (i3 == 1) {
                                                    }
                                                }
                                                xz3Var = wc7.J(z44Var);
                                            }
                                        }
                                        xz3Var2 = xz3Var2.B;
                                    }
                                }
                                O = O.v();
                                if (O != null && (kfVar = O.c0) != null) {
                                    xz3Var2 = (z66) kfVar.C;
                                } else {
                                    xz3Var2 = null;
                                }
                            } else {
                                xz3Var = null;
                                break;
                            }
                        }
                        h82 h82Var2 = (h82) xz3Var;
                        if (h82Var2 == null) {
                            return k31Var;
                        }
                        int ordinal2 = h82Var2.f1().ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 == 3) {
                                        k31 G = G(h82Var2, i2);
                                        if (G != k31Var) {
                                            k31Var2 = G;
                                        }
                                        if (k31Var2 == null) {
                                            return F(h82Var2, i2);
                                        }
                                        return k31Var2;
                                    }
                                    ze0.l();
                                    return null;
                                }
                                return k31.y;
                            }
                            return G(h82Var2, i2);
                        }
                        return F(h82Var2, i2);
                    }
                    ze0.l();
                    return null;
                }
            } else {
                h82 C = bb4.C(h82Var);
                if (C != null) {
                    return E(C, i2);
                }
                ze0.k("ActiveParent with no focused child");
                return null;
            }
        }
        return k31Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v9, types: [xz3] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [z44] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [xz3] */
    /* JADX WARN: Type inference failed for: r6v22, types: [xz3] */
    /* JADX WARN: Type inference failed for: r6v9, types: [xz3] */
    public static final boolean H(h82 h82Var) {
        z44 z44Var;
        d82 d82Var;
        kf kfVar;
        r72 r72Var;
        boolean z;
        ?? J;
        int i2;
        ?? r5;
        Boolean bool;
        int i3;
        int i4;
        kf kfVar2;
        r72 r72Var2 = (r72) ((oa) wc7.P(h82Var)).getFocusOwner();
        h82 g2 = r72Var2.g();
        d82 f1 = h82Var.f1();
        if (g2 == h82Var) {
            h82Var.b1(f1, f1);
            return true;
        }
        if ((g2 == null || g2.L) && !h82Var.L && !((r72) ((oa) wc7.P(h82Var)).getFocusOwner()).a.B()) {
            return false;
        }
        if (g2 != null) {
            z44Var = new z44(new h82[16], 0);
            if (!g2.x.K) {
                ez2.b("visitAncestors called on an unattached node");
            }
            xz3 xz3Var = g2.x.B;
            za3 O = wc7.O(g2);
            while (O != null) {
                if ((((xz3) O.c0.D).A & 1024) != 0) {
                    while (xz3Var != null) {
                        if ((xz3Var.z & 1024) != 0) {
                            xz3 xz3Var2 = xz3Var;
                            z44 z44Var2 = null;
                            while (xz3Var2 != null) {
                                if (xz3Var2 instanceof h82) {
                                    z44Var.b((h82) xz3Var2);
                                } else if ((xz3Var2.z & 1024) != 0 && (xz3Var2 instanceof zc1)) {
                                    int i5 = 0;
                                    for (xz3 xz3Var3 = ((zc1) xz3Var2).M; xz3Var3 != null; xz3Var3 = xz3Var3.C) {
                                        if ((xz3Var3.z & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                xz3Var2 = xz3Var3;
                                            } else {
                                                if (z44Var2 == null) {
                                                    z44Var2 = new z44(new xz3[16], 0);
                                                }
                                                if (xz3Var2 != null) {
                                                    z44Var2.b(xz3Var2);
                                                    xz3Var2 = null;
                                                }
                                                z44Var2.b(xz3Var3);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                xz3Var2 = wc7.J(z44Var2);
                            }
                        }
                        xz3Var = xz3Var.B;
                    }
                }
                O = O.v();
                if (O != null && (kfVar2 = O.c0) != null) {
                    xz3Var = (z66) kfVar2.C;
                } else {
                    xz3Var = null;
                }
            }
        } else {
            z44Var = null;
        }
        h82[] h82VarArr = new h82[16];
        h82[] h82VarArr2 = new h82[16];
        if (!h82Var.x.K) {
            ez2.b("visitAncestors called on an unattached node");
        }
        ?? r6 = h82Var.x.B;
        za3 O2 = wc7.O(h82Var);
        boolean z2 = true;
        int i6 = 0;
        int i7 = 0;
        while (O2 != null) {
            if ((((xz3) O2.c0.D).A & 1024) != 0) {
                while (r6 != null) {
                    if ((r6.z & 1024) != 0) {
                        h82 h82Var2 = r6;
                        z44 z44Var3 = null;
                        while (h82Var2 != null) {
                            if (h82Var2 instanceof h82) {
                                h82 h82Var3 = h82Var2;
                                if (z44Var != null) {
                                    bool = Boolean.valueOf(z44Var.k(h82Var3));
                                } else {
                                    bool = null;
                                }
                                if (a34.i(bool, Boolean.TRUE)) {
                                    int i8 = i6 + 1;
                                    if (h82VarArr.length < i8) {
                                        int length = h82VarArr.length;
                                        r72Var = r72Var2;
                                        ?? r1 = new Object[Math.max(i8, length * 2)];
                                        i4 = i8;
                                        System.arraycopy(h82VarArr, 0, r1, 0, length);
                                        h82VarArr = r1;
                                    } else {
                                        r72Var = r72Var2;
                                        i4 = i8;
                                    }
                                    h82VarArr[i6] = h82Var3;
                                    i6 = i4;
                                } else {
                                    r72Var = r72Var2;
                                    int i9 = i7 + 1;
                                    if (h82VarArr2.length < i9) {
                                        int length2 = h82VarArr2.length;
                                        ?? r52 = new Object[Math.max(i9, length2 * 2)];
                                        i3 = i9;
                                        System.arraycopy(h82VarArr2, 0, r52, 0, length2);
                                        h82VarArr2 = r52;
                                    } else {
                                        i3 = i9;
                                    }
                                    h82VarArr2[i7] = h82Var3;
                                    i7 = i3;
                                }
                                if (h82Var3 == g2) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                r72Var = r72Var2;
                                z = true;
                            }
                            if (z && (h82Var2.z & 1024) != 0 && (h82Var2 instanceof zc1)) {
                                xz3 xz3Var4 = ((zc1) h82Var2).M;
                                int i10 = 0;
                                J = h82Var2;
                                while (xz3Var4 != null) {
                                    if ((xz3Var4.z & 1024) != 0) {
                                        int i11 = i10 + 1;
                                        if (i11 == 1) {
                                            J = xz3Var4;
                                            i2 = i11;
                                        } else {
                                            if (z44Var3 == null) {
                                                i2 = i11;
                                                r5 = new z44(new xz3[16], 0);
                                            } else {
                                                i2 = i11;
                                                r5 = z44Var3;
                                            }
                                            if (J != 0) {
                                                r5.b(J);
                                                J = 0;
                                            }
                                            r5.b(xz3Var4);
                                            z44Var3 = r5;
                                            J = J;
                                        }
                                        i10 = i2;
                                    }
                                    xz3Var4 = xz3Var4.C;
                                    J = J;
                                }
                                if (i10 == 1) {
                                    r72Var2 = r72Var;
                                    h82Var2 = J;
                                }
                            }
                            J = wc7.J(z44Var3);
                            r72Var2 = r72Var;
                            h82Var2 = J;
                        }
                    }
                    r6 = r6.B;
                    r72Var2 = r72Var2;
                }
            }
            r72 r72Var3 = r72Var2;
            O2 = O2.v();
            if (O2 != null && (kfVar = O2.c0) != null) {
                r6 = (z66) kfVar.C;
            } else {
                r6 = null;
            }
            r72Var2 = r72Var3;
        }
        r72 r72Var4 = r72Var2;
        if (!z2 || g2 == null || I(g2, false)) {
            h98.I(h82Var, new vt0(h82Var, (byte) 9));
            int ordinal = h82Var.f1().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            ze0.l();
                            return false;
                        }
                    }
                }
                ((r72) ((oa) wc7.P(h82Var)).getFocusOwner()).j(h82Var);
            }
            d82 d82Var2 = d82.z;
            d82 d82Var3 = d82.x;
            if (z2 && g2 != null) {
                g2.b1(d82Var3, d82Var2);
            }
            d82 d82Var4 = d82.y;
            if (z44Var != null) {
                int i12 = z44Var.z - 1;
                Object[] objArr = z44Var.x;
                if (i12 < objArr.length) {
                    while (i12 >= 0) {
                        h82 h82Var4 = (h82) objArr[i12];
                        if (r72Var4.g() != h82Var) {
                            break;
                        }
                        h82Var4.b1(d82Var4, d82Var2);
                        i12--;
                    }
                }
            }
            int i13 = i7 - 1;
            if (i13 < h82VarArr2.length) {
                while (i13 >= 0) {
                    h82 h82Var5 = h82VarArr2[i13];
                    if (r72Var4.g() != h82Var) {
                        break;
                    }
                    if (h82Var5 == g2) {
                        d82Var = d82Var3;
                    } else {
                        d82Var = d82Var2;
                    }
                    h82Var5.b1(d82Var, d82Var4);
                    i13--;
                }
            }
            if (r72Var4.g() == h82Var) {
                h82Var.b1(f1, d82Var3);
                if (r72Var4.g() != h82Var) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean I(h82 h82Var, boolean z) {
        boolean z2;
        int ordinal = h82Var.f1().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        ze0.l();
                        return false;
                    }
                } else {
                    return z;
                }
            } else {
                h82 C = bb4.C(h82Var);
                if (C != null) {
                    z2 = I(C, z);
                } else {
                    z2 = true;
                }
                if (!z2) {
                    return false;
                }
                h82Var.b1(d82.y, d82.z);
                return true;
            }
        }
        return true;
    }

    public static final Object J(int i2, sb2 sb2Var, kd2 kd2Var, int i3) {
        return K(new i55(null, kd2Var.T, i2), sb2Var, kd2Var, i3 & 112);
    }

    public static final Object K(i55 i55Var, sb2 sb2Var, kd2 kd2Var, int i2) {
        boolean z;
        m55 m55Var = (m55) kd2Var.j(bk3.a);
        if ((((i2 & 14) ^ 6) > 4 && kd2Var.f(i55Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object Q = kd2Var.Q();
        Object obj = au0.a;
        if (z || Q == obj) {
            Object a2 = m55Var.a(i55Var);
            if (a2 != p) {
                Q = new l55(i55Var, a2, m55Var, false);
            } else {
                Q = new l55(i55Var, sb2Var.invoke(), m55Var, true);
            }
            kd2Var.n0(Q);
        }
        l55 l55Var = (l55) Q;
        if (l55Var.A != m55Var) {
            kd2Var.e0(-1614000612);
            boolean h2 = kd2Var.h(l55Var) | kd2Var.h(m55Var);
            Object Q2 = kd2Var.Q();
            if (h2 || Q2 == obj) {
                Q2 = new va1(l55Var, m55Var, (byte) 29);
                kd2Var.n0(Q2);
            }
            db.m((sb2) Q2, kd2Var);
            kd2Var.q(false);
        } else {
            kd2Var.e0(-1613932381);
            kd2Var.q(false);
        }
        return l55Var.y;
    }

    public static final void L(g4 g4Var, uh5 uh5Var) {
        int i2;
        int i3;
        Object g2 = uh5Var.k().x.g(yh5.g);
        Object obj = null;
        if (g2 == null) {
            g2 = null;
        }
        if (g2 == null) {
            uh5 l2 = uh5Var.l();
            if (l2 != null) {
                Object g3 = l2.k().x.g(yh5.e);
                if (g3 == null) {
                    g3 = null;
                }
                if (g3 != null) {
                    Object g4 = l2.k().x.g(yh5.f);
                    if (g4 != null) {
                        obj = g4;
                    }
                    wo0 wo0Var = (wo0) obj;
                    if (wo0Var == null || (wo0Var.a >= 0 && wo0Var.b >= 0)) {
                        if (uh5Var.k().x.c(yh5.K)) {
                            ArrayList arrayList = new ArrayList();
                            List j2 = uh5.j(4, l2);
                            int size = j2.size();
                            int i4 = 0;
                            for (int i5 = 0; i5 < size; i5++) {
                                uh5 uh5Var2 = (uh5) j2.get(i5);
                                if (uh5Var2.k().x.c(yh5.K)) {
                                    arrayList.add(uh5Var2);
                                    if (uh5Var2.c.w() < uh5Var.c.w()) {
                                        i4++;
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                boolean k2 = k(arrayList);
                                if (k2) {
                                    i2 = 0;
                                } else {
                                    i2 = i4;
                                }
                                if (k2) {
                                    i3 = i4;
                                } else {
                                    i3 = 0;
                                }
                                Object g5 = uh5Var.k().x.g(yh5.K);
                                if (g5 == null) {
                                    g5 = Boolean.FALSE;
                                }
                                g4Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, 1, i3, 1, false, ((Boolean) g5).booleanValue()));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ov3.d();
    }

    public static final Object[] M(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = i;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] N(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else {
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i3] = null;
                            return objArr;
                        }
                        return Arrays.copyOf(objArr2, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return objArr;
    }

    public static final long O(long j2) {
        return sx0.a(rx0.j(j2), rx0.h(j2), rx0.i(j2), rx0.g(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void P(defpackage.k16 r12, defpackage.x16 r13, defpackage.ay0 r14) {
        /*
            long r0 = r13.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.a(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.h()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.e(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.h()
            if (r4 >= r2) goto L51
            java.util.List r11 = r12.g(r0)
            long r2 = r12.e(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L51
            long r7 = r13.b
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            e31 r6 = new e31
            long r9 = r2 - r7
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.h()
            if (r3 >= r6) goto L5f
            D(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.a
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            D(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            e31 r6 = new e31
            java.util.List r11 = r12.g(r0)
            long r7 = r12.e(r4)
            long r12 = r12.e(r4)
            long r9 = r0 - r12
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v94.P(k16, x16, ay0):void");
    }

    public static final ExtractedText Q(mc6 mc6Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = mc6Var.a.y;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = mc6Var.b;
        extractedText.selectionStart = nd6.g(j2);
        extractedText.selectionEnd = nd6.f(j2);
        extractedText.flags = !uz5.N(mc6Var.a.y, '\n') ? 1 : 0;
        return extractedText;
    }

    public static void R(qz1 qz1Var, nw2 nw2Var, String str, String str2) {
        qz1Var.a.d(nw2Var);
        if (str != null) {
            qz1Var.g = str;
        }
        if (str2 != null) {
            qz1Var.n = str2;
        }
    }

    public static void S(qz1 qz1Var, int i2, ea2 ea2Var, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str = ea2Var.p;
        boolean z6 = false;
        if (i2 == 1) {
            qz1Var.h = str;
            int i5 = ea2Var.J;
            if (i5 <= 0 && i5 != -1) {
                z4 = false;
            } else {
                z4 = true;
            }
            io3.n(z4);
            qz1Var.e = i5;
            int i6 = ea2Var.L;
            if (i6 <= 0 && i6 != -2147483647) {
                z5 = false;
            } else {
                z5 = true;
            }
            io3.n(z5);
            qz1Var.f = i6;
            if (i3 > 0 || i3 == -2147483647) {
                z6 = true;
            }
            io3.n(z6);
            qz1Var.d = i3;
            return;
        }
        if (i2 == 2) {
            qz1Var.o = str;
            int i7 = ea2Var.w;
            if (i7 <= 0 && i7 != -1) {
                z = false;
            } else {
                z = true;
            }
            io3.n(z);
            qz1Var.l = i7;
            int i8 = ea2Var.x;
            if (i8 <= 0 && i8 != -1) {
                z2 = false;
            } else {
                z2 = true;
            }
            io3.n(z2);
            qz1Var.k = i8;
            qz1Var.j = ea2Var.H;
            if (i3 <= 0 && i3 != -2147483647) {
                z3 = false;
            } else {
                z3 = true;
            }
            io3.n(z3);
            qz1Var.i = i3;
            if (i4 >= 0) {
                z6 = true;
            }
            io3.n(z6);
            qz1Var.m = i4;
        }
    }

    public static wj a(float f2) {
        return new wj(Float.valueOf(f2), db.l, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r42, defpackage.yz3 r43, final defpackage.ic2 r44, final java.util.List r45, defpackage.th4 r46, final defpackage.ub2 r47, defpackage.kd2 r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v94.b(java.lang.String, yz3, ic2, java.util.List, th4, ub2, kd2, int, int):void");
    }

    public static final lb c(String str) {
        return new lb(te4.O(str));
    }

    public static final void d(af3 af3Var, List list, LocalDate localDate, ic2 ic2Var, kd2 kd2Var, int i2) {
        int i3;
        ic2 ic2Var2;
        boolean z;
        boolean z2;
        boolean z3;
        vr vrVar;
        int i4;
        int i5;
        boolean h2;
        int i6;
        int i7;
        af3Var.getClass();
        list.getClass();
        localDate.getClass();
        ic2Var.getClass();
        kd2Var.f0(246855177);
        if ((i2 & 6) == 0) {
            if (kd2Var.f(af3Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h2 = kd2Var.f(list);
            } else {
                h2 = kd2Var.h(list);
            }
            if (h2) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.h(localDate)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            ic2Var2 = ic2Var;
            if (kd2Var.h(ic2Var2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        } else {
            ic2Var2 = ic2Var;
        }
        int i8 = i3;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i8 & 1, z)) {
            Locale locale = Locale.ENGLISH;
            DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("EEE", locale);
            DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("MMM dd", locale);
            LocalDate now = LocalDate.now();
            vh4 j2 = n77.j(15.0f, 0.0f, 2);
            vr vrVar2 = new vr(12.0f, true, new ze0((byte) 6));
            yz3 T = n77.T(ar5.c(vz3.x, 1.0f), 0.0f, 8.0f, 1);
            if ((i8 & 112) != 32 && ((i8 & 64) == 0 || !kd2Var.h(list))) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean h3 = z2 | kd2Var.h(localDate) | kd2Var.h(now);
            if ((i8 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h4 = h3 | z3 | kd2Var.h(ofPattern2) | kd2Var.h(ofPattern);
            Object Q = kd2Var.Q();
            if (!h4 && Q != au0.a) {
                vrVar = vrVar2;
            } else {
                vrVar = vrVar2;
                Object d90Var = new d90(list, localDate, now, ic2Var2, ofPattern2, ofPattern);
                kd2Var.n0(d90Var);
                Q = d90Var;
            }
            n77.i(T, af3Var, j2, vrVar, null, null, false, null, (ub2) Q, kd2Var, ((i8 << 3) & 112) | 24966, 488);
        } else {
            kd2Var.Y();
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new c50(af3Var, list, localDate, ic2Var, i2, (byte) 2);
        }
    }

    public static final long e(float f2, boolean z, boolean z2) {
        long j2;
        long floatToRawIntBits = Float.floatToRawIntBits(f2);
        long j3 = 0;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        if (z2) {
            j3 = 2;
        }
        return ((j2 | j3) & 4294967295L) | (floatToRawIntBits << 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x04a7, code lost:
    
        if (r42.f(r5) == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x04ca, code lost:
    
        if (r42.f(r9) == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04e6, code lost:
    
        if (r42.f(r10) == false) goto L228;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0532 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0587 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04cd  */
    /* JADX WARN: Type inference failed for: r12v5, types: [a44, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v5, types: [vz0] */
    /* JADX WARN: Type inference failed for: r42v0, types: [kd2] */
    /* JADX WARN: Type inference failed for: r9v54, types: [kd2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.kb5 r35, final defpackage.w74 r36, final defpackage.yz3 r37, final defpackage.e7 r38, final defpackage.ub2 r39, final defpackage.ub2 r40, final defpackage.ic2 r41, defpackage.kd2 r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v94.f(kb5, w74, yz3, e7, ub2, ub2, ic2, kd2, int):void");
    }

    public static final void g(final ArrayList arrayList, final yz3 yz3Var, final e7 e7Var, final List list, final List list2, final ub2 ub2Var, final ub2 ub2Var2, final ic2 ic2Var, final sb2 sb2Var, kd2 kd2Var, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        List list3;
        w74 w74Var;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        kd2Var.f0(-1914095277);
        int i19 = 4;
        if ((i2 & 6) == 0) {
            if (kd2Var.h(arrayList)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i4 = i18 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i4 |= i17;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.f(e7Var)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i4 |= i16;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var.h(list)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i4 |= i15;
        }
        if ((i2 & 24576) == 0) {
            if (kd2Var.h(list2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i4 |= i14;
        }
        if ((196608 & i2) == 0) {
            if (kd2Var.f(null)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i4 |= i13;
        }
        if ((1572864 & i2) == 0) {
            if (kd2Var.h(null)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i4 |= i12;
        }
        if ((12582912 & i2) == 0) {
            if (kd2Var.h(ub2Var)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i4 |= i11;
        }
        if ((100663296 & i2) == 0) {
            if (kd2Var.h(ub2Var2)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i4 |= i10;
        }
        if ((805306368 & i2) == 0) {
            if (kd2Var.h(ic2Var)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i4 |= i9;
        }
        if ((i3 & 6) == 0) {
            if (!kd2Var.h(sb2Var)) {
                i19 = 2;
            }
            i5 = i3 | i19;
        } else {
            i5 = i3;
        }
        if ((306783379 & i4) == 306783378 && (i5 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (kd2Var.V(i4 & 1, z)) {
            kd2Var.a0();
            if ((i2 & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
            }
            kd2Var.r();
            if (!arrayList.isEmpty()) {
                int i20 = i4 >> 6;
                int i21 = (i20 & 896) | (i4 & 14) | (i20 & 112) | (i20 & 7168) | ((i5 << 12) & 57344);
                xt5.h(sb2Var, kd2Var);
                kd2Var.e0(-984503628);
                kd2Var.q(false);
                tq1 tq1Var = jb5.a;
                Object Q = kd2Var.Q();
                Object obj = au0.a;
                if (Q == obj) {
                    i6 = i4;
                    bu5 bu5Var = new bu5();
                    i7 = i5;
                    i8 = i21;
                    Q = new k74(new pz3((Object) bu5Var, (byte) 21), new os0(-1714993007, true, new fr5((Object) bu5Var, (byte) 17)));
                    kd2Var.n0(Q);
                } else {
                    i6 = i4;
                    i7 = i5;
                    i8 = i21;
                }
                ArrayList Q2 = w65.Q(arrayList, ms.H0(new k74[]{null, (ib5) Q, new k74(new p03((byte) 29), nx7.R(1077673004, new fr5((Object) xt5.h(arrayList, kd2Var), (byte) 3), kd2Var))}), kd2Var, i8 & 14);
                boolean f2 = kd2Var.f(yo0.I0(list)) | kd2Var.f(Q2);
                Object Q3 = kd2Var.Q();
                if (f2 || Q3 == obj) {
                    ArrayList J = te4.J(w65.O(Q2, list, list2));
                    yo0.r0(J);
                    List h0 = yo0.h0(J);
                    ArrayList arrayList2 = new ArrayList(h0.size());
                    if (h0.size() <= 0) {
                        wp5 wp5Var = (wp5) yo0.r0(J);
                        ArrayList J2 = te4.J(wp5Var);
                        do {
                            wp5 wp5Var2 = (wp5) yo0.m0(J2);
                            if (wp5Var2 != null) {
                                list3 = wp5Var2.c;
                            } else {
                                list3 = null;
                            }
                            if (list3 != null && !list3.isEmpty()) {
                                J2.add(0, w65.O(list3, list, list2));
                            }
                            if (list3 == null) {
                                break;
                            }
                        } while (!list3.isEmpty());
                        J2.remove(wp5Var);
                        Object kb5Var = new kb5(Q2, arrayList2, wp5Var, J2);
                        kd2Var.n0(kb5Var);
                        Q3 = kb5Var;
                    } else {
                        ((wp5) h0.get(0)).getClass();
                        ov3.d();
                        return;
                    }
                }
                kb5 kb5Var2 = (kb5) Q3;
                fb5 fb5Var = new fb5(kb5Var2.c);
                ArrayList arrayList3 = kb5Var2.d;
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size = arrayList3.size();
                int i22 = 0;
                while (i22 < size) {
                    arrayList4.add(new fb5((wp5) arrayList3.get(i22)));
                    i22++;
                    arrayList3 = arrayList3;
                }
                Object Q4 = kd2Var.Q();
                nt1 nt1Var = nt1.x;
                if (Q4 == obj) {
                    Q4 = new w74(fb5Var, arrayList4, nt1Var);
                    kd2Var.n0(Q4);
                }
                w74 w74Var2 = (w74) Q4;
                boolean h2 = kd2Var.h(fb5Var) | kd2Var.h(arrayList4) | kd2Var.h(nt1Var);
                Object Q5 = kd2Var.Q();
                if (!h2 && Q5 != obj) {
                    w74Var = w74Var2;
                } else {
                    Q5 = new wb(w74Var2, fb5Var, arrayList4, nt1Var, (byte) 7);
                    w74Var = w74Var2;
                    kd2Var.n0(Q5);
                }
                db.m((sb2) Q5, kd2Var);
                w65.i(kb5Var2, w74Var, null, sb2Var, kd2Var, (i7 << 9) & 7168);
                f(kb5Var2, w74Var, yz3Var, e7Var, ub2Var, ub2Var2, ic2Var, kd2Var, (i20 & 29360128) | ((i6 << 3) & 8064) | (i20 & 57344) | (458752 & i20) | (3670016 & i20));
            } else {
                ze0.k("NavDisplay entries cannot be empty");
                return;
            }
        } else {
            kd2Var.Y();
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new ic2() { // from class: z64
                @Override // defpackage.ic2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    v94.g(arrayList, yz3Var, e7Var, list, list2, ub2Var, ub2Var2, ic2Var, sb2Var, (kd2) obj2, kb0.N(i2 | 1), kb0.N(i3));
                    return pn6.a;
                }
            };
        }
    }

    public static final void h(final List list, final yz3 yz3Var, e7 e7Var, final sb2 sb2Var, final List list2, List list3, List list4, final ub2 ub2Var, final ub2 ub2Var2, ic2 ic2Var, final b0 b0Var, kd2 kd2Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        final e7 e7Var2;
        final List list5;
        final List list6;
        final ic2 ic2Var2;
        int i8;
        int i9;
        e7 e7Var3;
        ic2 wj3Var;
        List list7;
        List list8;
        ArrayList arrayList;
        kd2Var.f0(1398581072);
        if (kd2Var.h(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (kd2Var.f(yz3Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4 | 384;
        if (kd2Var.h(sb2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (kd2Var.h(list2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6 | 114884608;
        if (kd2Var.h(b0Var)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i14 = i7 | 22;
        if ((306783379 & i13) == 306783378 && (i14 & 147) == 146) {
            z = false;
        } else {
            z = true;
        }
        if (kd2Var.V(i13 & 1, z)) {
            kd2Var.a0();
            if ((i2 & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i8 = i13 & (-458753);
                i9 = i14 & (-113);
                e7Var3 = e7Var;
                list7 = list3;
                list8 = list4;
                wj3Var = ic2Var;
            } else {
                y50 y50Var = pk2.y;
                List H = te4.H(new Object());
                i8 = i13 & (-458753);
                i9 = i14 & (-113);
                e7Var3 = y50Var;
                wj3Var = new wj3((byte) 8);
                list7 = H;
                list8 = nt1.x;
            }
            kd2Var.r();
            if (!list.isEmpty()) {
                int i15 = i8 >> 9;
                int i16 = (i9 & 896) | (i8 & 14) | (i15 & 112);
                boolean f2 = kd2Var.f(yo0.I0(list));
                Object Q = kd2Var.Q();
                if (f2 || Q == au0.a) {
                    if (list instanceof RandomAccess) {
                        arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i17 = 0; i17 < size; i17++) {
                            arrayList.add((j74) b0Var.invoke(list.get(i17)));
                        }
                    } else {
                        arrayList = new ArrayList(zo0.V(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add((j74) b0Var.invoke(it.next()));
                        }
                    }
                    Q = arrayList;
                    kd2Var.n0(Q);
                }
                g(w65.Q((List) Q, list2, kd2Var, i16 & 112), yz3Var, e7Var3, list7, list8, ub2Var, ub2Var2, wj3Var, sb2Var, kd2Var, (i8 & 1008) | 115040256, i15 & 14);
                e7Var2 = e7Var3;
                list5 = list7;
                list6 = list8;
                ic2Var2 = wj3Var;
            } else {
                ze0.k("NavDisplay backstack cannot be empty");
                return;
            }
        } else {
            kd2Var.Y();
            e7Var2 = e7Var;
            list5 = list3;
            list6 = list4;
            ic2Var2 = ic2Var;
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new ic2(list, yz3Var, e7Var2, sb2Var, list2, list5, list6, ub2Var, ub2Var2, ic2Var2, b0Var, i2) { // from class: y64
                public final /* synthetic */ sb2 A;
                public final /* synthetic */ List B;
                public final /* synthetic */ List C;
                public final /* synthetic */ List D;
                public final /* synthetic */ ub2 E;
                public final /* synthetic */ ub2 F;
                public final /* synthetic */ ic2 G;
                public final /* synthetic */ b0 H;
                public final /* synthetic */ List x;
                public final /* synthetic */ yz3 y;
                public final /* synthetic */ e7 z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(805306369);
                    v94.h(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    public static final void i(Relation relation, yz3 yz3Var, ub2 ub2Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        relation.getClass();
        ub2Var.getClass();
        kd2Var.f0(1509052166);
        if (kd2Var.h(relation)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (kd2Var.f(yz3Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (kd2Var.h(ub2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        boolean z2 = false;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i8 & 1, z)) {
            bv2 bv2Var = new bv2((Context) kd2Var.j(eb.b));
            String extraLarge = relation.getCoverImage().getExtraLarge();
            if (extraLarge == null) {
                extraLarge = relation.getCoverImage().getLarge();
            }
            bv2Var.c = extraLarge;
            hv2.a(bv2Var, true);
            ev2 a2 = bv2Var.a();
            String b2 = e02.b(relation.getTitle());
            long j2 = ep0.b;
            yz3 e2 = ar5.e(ar5.n(yz3Var, 0.0f, 180.0f, 1), 275.0f);
            if ((i8 & 896) == 256) {
                z2 = true;
            }
            boolean h2 = kd2Var.h(relation) | z2;
            Object Q = kd2Var.Q();
            if (h2 || Q == au0.a) {
                Q = new va1(ub2Var, relation, (byte) 28);
                kd2Var.n0(Q);
            }
            l36.a(kb0.A(e2, false, null, null, false, (sb2) Q, kd2Var, 0, 31), ((cn5) kd2Var.j(dn5.a)).c, ((mp0) kd2Var.j(op0.a)).p, 0L, 0.0f, 0.0f, null, nx7.R(-1846711861, new fm(relation, a2, j2, b2, (byte) 2), kd2Var), kd2Var, 12582912, 120);
        } else {
            kd2Var.Y();
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new df((Object) relation, yz3Var, ub2Var, i2, (byte) 9);
        }
    }

    public static final vk6 j(vk6 vk6Var) {
        vk6Var.getClass();
        y73 y73Var = vk6Var.c;
        y73Var.getClass();
        boolean z = false;
        y73 y73Var2 = ((a83) y73Var.b().get(0)).b;
        y73Var2.getClass();
        g73 c2 = y73Var2.c();
        c2.getClass();
        e73 e73Var = (e73) c2;
        if (y73Var2.a()) {
            z = true;
        }
        return new vk6(e73Var, z, y73Var2);
    }

    public static final boolean k(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = nt1.x;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    uh5 uh5Var = (uh5) obj2;
                    uh5 uh5Var2 = (uh5) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (uh5Var2.g().d() >> 32)) - Float.intBitsToFloat((int) (uh5Var.g().d() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (uh5Var2.g().d() & 4294967295L)) - Float.intBitsToFloat((int) (uh5Var.g().d() & 4294967295L)));
                    arrayList2.add(new xc4((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((xc4) yo0.k0(list)).a;
            } else {
                if (list.isEmpty()) {
                    hi3.c("Empty collection can't be reduced.");
                }
                Object k0 = yo0.k0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        k0 = new xc4(xc4.f(((xc4) k0).a, ((xc4) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((xc4) k0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        qi2.m(str);
    }

    public static final Object m(zv5 zv5Var, int i2) {
        Object obj;
        zv5Var.getClass();
        int p2 = w65.p(zv5Var.z, i2, zv5Var.x);
        if (p2 >= 0 && (obj = zv5Var.y[p2]) != q) {
            return obj;
        }
        return null;
    }

    public static long n(long j2, nb3 nb3Var) {
        int i2;
        int g2;
        int j3;
        int h2;
        nb3 nb3Var2 = nb3.x;
        if (nb3Var == nb3Var2) {
            i2 = rx0.j(j2);
        } else {
            i2 = rx0.i(j2);
        }
        if (nb3Var == nb3Var2) {
            g2 = rx0.h(j2);
        } else {
            g2 = rx0.g(j2);
        }
        if (nb3Var == nb3Var2) {
            j3 = rx0.i(j2);
        } else {
            j3 = rx0.j(j2);
        }
        if (nb3Var == nb3Var2) {
            h2 = rx0.g(j2);
        } else {
            h2 = rx0.h(j2);
        }
        return sx0.a(i2, g2, j3, h2);
    }

    public static long o(int i2, long j2) {
        int i3;
        int h2 = rx0.h(j2);
        if ((i2 & 4) != 0) {
            i3 = rx0.i(j2);
        } else {
            i3 = 0;
        }
        return sx0.a(0, h2, i3, rx0.g(j2));
    }

    public static boolean p(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                if (p(file2) && z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    public static void q(dt2 dt2Var) {
        if (dt2Var != null) {
            try {
                ct2 ct2Var = (ct2) dt2Var;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(0);
                    ct2Var.e.transact(3006, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public static final boolean r(uh5 uh5Var) {
        ph5 k2 = uh5Var.k();
        return !k2.x.c(yh5.j);
    }

    public static final String[] s(kz0 kz0Var) {
        kz0Var.getClass();
        return (String[]) ((lb) kz0Var).b.toArray(new String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [wf0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [b45, java.lang.Object] */
    public static zf0 t(xf0 xf0Var) {
        ?? obj = new Object();
        obj.c = new Object();
        zf0 zf0Var = new zf0(obj);
        obj.b = zf0Var;
        obj.a = xf0Var.getClass();
        try {
            Object d2 = xf0Var.d(obj);
            if (d2 != null) {
                obj.a = d2;
                return zf0Var;
            }
            return zf0Var;
        } catch (Exception e2) {
            zf0Var.y.l(e2);
            return zf0Var;
        }
    }

    public static final boolean u(uh5 uh5Var) {
        boolean z;
        Object g2 = uh5Var.d.x.g(yh5.L);
        Object obj = null;
        if (g2 == null) {
            g2 = null;
        }
        cg6 cg6Var = (cg6) g2;
        p44 p44Var = uh5Var.d.x;
        Object g3 = p44Var.g(yh5.z);
        if (g3 == null) {
            g3 = null;
        }
        m65 m65Var = (m65) g3;
        if (cg6Var != null) {
            z = true;
        } else {
            z = false;
        }
        Object g4 = p44Var.g(yh5.K);
        if (g4 != null) {
            obj = g4;
        }
        if (((Boolean) obj) != null && (m65Var == null || m65Var.a != 4)) {
            return true;
        }
        return z;
    }

    public static final String v(uh5 uh5Var, Resources resources) {
        float f2;
        int C;
        ph5 ph5Var = uh5Var.d;
        ph5 ph5Var2 = uh5Var.d;
        Object g2 = ph5Var.x.g(yh5.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        p44 p44Var = ph5Var2.x;
        Object g3 = p44Var.g(yh5.L);
        if (g3 == null) {
            g3 = null;
        }
        cg6 cg6Var = (cg6) g3;
        Object g4 = p44Var.g(yh5.z);
        if (g4 == null) {
            g4 = null;
        }
        m65 m65Var = (m65) g4;
        if (cg6Var != null) {
            int ordinal = cg6Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (g2 == null) {
                            g2 = resources.getString(R.string.indeterminate);
                        }
                    } else {
                        ze0.l();
                        return null;
                    }
                } else if (m65Var != null && m65Var.a == 2 && g2 == null) {
                    g2 = resources.getString(R.string.state_off);
                }
            } else if (m65Var != null && m65Var.a == 2 && g2 == null) {
                g2 = resources.getString(R.string.state_on);
            }
        }
        Object g5 = p44Var.g(yh5.K);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((m65Var == null || m65Var.a != 4) && g2 == null) {
                if (booleanValue) {
                    g2 = resources.getString(R.string.selected);
                } else {
                    g2 = resources.getString(R.string.not_selected);
                }
            }
        }
        Object g6 = p44Var.g(yh5.c);
        if (g6 == null) {
            g6 = null;
        }
        zu4 zu4Var = (zu4) g6;
        if (zu4Var != null) {
            if (zu4Var != zu4.d) {
                if (g2 == null) {
                    do0 do0Var = zu4Var.b;
                    float f3 = do0Var.b;
                    float f4 = do0Var.a;
                    if (f3 - f4 == 0.0f) {
                        f2 = 0.0f;
                    } else {
                        f2 = (zu4Var.a - f4) / (f3 - f4);
                    }
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    if (f2 == 0.0f) {
                        C = 0;
                    } else if (f2 == 1.0f) {
                        C = 100;
                    } else {
                        C = db.C(Math.round(f2 * 100.0f), 1, 99);
                    }
                    g2 = resources.getString(R.string.template_percent, Integer.valueOf(C));
                }
            } else if (g2 == null) {
                g2 = resources.getString(R.string.in_progress);
            }
        }
        ai5 ai5Var = yh5.G;
        if (p44Var.c(ai5Var)) {
            p44 p44Var2 = new uh5(uh5Var.a, true, uh5Var.c, ph5Var2).k().x;
            Object g7 = p44Var2.g(yh5.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = p44Var2.g(yh5.C);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = p44Var2.g(ai5Var);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            g2 = str;
        }
        return (String) g2;
    }

    public static final ko w(uh5 uh5Var) {
        Object g2 = uh5Var.d.x.g(yh5.G);
        ko koVar = null;
        if (g2 == null) {
            g2 = null;
        }
        ko koVar2 = (ko) g2;
        Object g3 = uh5Var.d.x.g(yh5.C);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        if (list != null) {
            koVar = (ko) yo0.m0(list);
        }
        if (koVar2 == null) {
            return koVar;
        }
        return koVar2;
    }

    public static final Bundle x(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        ze0.k(qx1.m("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void y(zo1 zo1Var) {
        if (((xz3) zo1Var).x.K) {
            wc7.M(zo1Var, 1).g1();
        }
    }

    public static final boolean z(float[] fArr) {
        if (fArr.length < 16 || fArr[0] != 1.0f || fArr[1] != 0.0f || fArr[2] != 0.0f || fArr[3] != 0.0f || fArr[4] != 0.0f || fArr[5] != 1.0f || fArr[6] != 0.0f || fArr[7] != 0.0f || fArr[8] != 0.0f || fArr[9] != 0.0f || fArr[10] != 1.0f || fArr[11] != 0.0f || fArr[12] != 0.0f || fArr[13] != 0.0f || fArr[14] != 0.0f || fArr[15] != 1.0f) {
            return false;
        }
        return true;
    }
}
