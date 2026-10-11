package defpackage;

import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class iv5 {
    /* JADX WARN: Type inference failed for: r0v0, types: [q26, j43] */
    public static q26 a() {
        return new j43(null);
    }

    public static String b(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte byteAt = byteString.byteAt(i);
            if (byteAt != 34) {
                if (byteAt != 39) {
                    if (byteAt != 92) {
                        switch (byteAt) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (byteAt >= 32 && byteAt <= 126) {
                                    sb.append((char) byteAt);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((byteAt >>> 6) & 3) + 48));
                                    sb.append((char) (((byteAt >>> 3) & 7) + 48));
                                    sb.append((char) ((byteAt & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r5v3, types: [cb0, java.lang.Object, pa0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.lv5 r4, defpackage.xz0 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.hq6
            if (r0 == 0) goto L13
            r0 = r5
            hq6 r0 = (defpackage.hq6) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            hq6 r0 = new hq6
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.z
            int r1 = r0.A
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            pa0 r4 = r0.y
            lv5 r0 = r0.x
            defpackage.m37.N(r5)     // Catch: java.lang.Throwable -> L2a
            goto L4e
        L2a:
            r4 = move-exception
            goto L57
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r3
        L32:
            defpackage.m37.N(r5)
            pa0 r5 = new pa0     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            r0.x = r4     // Catch: java.lang.Throwable -> L55
            r0.y = r5     // Catch: java.lang.Throwable -> L55
            r0.A = r2     // Catch: java.lang.Throwable -> L55
            db0 r0 = r4.x     // Catch: java.lang.Throwable -> L55
            r0.S(r5)     // Catch: java.lang.Throwable -> L55
            pn6 r0 = defpackage.pn6.a     // Catch: java.lang.Throwable -> L55
            w11 r1 = defpackage.w11.x
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r4
            r4 = r5
        L4e:
            defpackage.o80.r(r0, r3)
            return r4
        L52:
            r0 = r4
            r4 = r5
            goto L57
        L55:
            r5 = move-exception
            goto L52
        L57:
            throw r4     // Catch: java.lang.Throwable -> L58
        L58:
            r5 = move-exception
            defpackage.o80.r(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv5.d(lv5, xz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ub2] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [xz3] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [xz3] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void i(yc1 yc1Var, Object obj, ub2 ub2Var) {
        kf kfVar;
        if (!((xz3) yc1Var).x.K) {
            ez2.b("visitAncestors called on an unattached node");
        }
        xz3 xz3Var = ((xz3) yc1Var).x.B;
        za3 O = wc7.O(yc1Var);
        while (O != null) {
            if ((((xz3) O.c0.D).A & 262144) != 0) {
                while (xz3Var != null) {
                    if ((xz3Var.z & 262144) != 0) {
                        zc1 zc1Var = xz3Var;
                        ?? r4 = 0;
                        while (zc1Var != 0) {
                            boolean z = true;
                            if (zc1Var instanceof jj6) {
                                jj6 jj6Var = (jj6) zc1Var;
                                if (obj.equals(jj6Var.p())) {
                                    z = ((Boolean) ub2Var.invoke(jj6Var)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((zc1Var.z & 262144) != 0 && (zc1Var instanceof zc1)) {
                                xz3 xz3Var2 = zc1Var.M;
                                int i = 0;
                                zc1Var = zc1Var;
                                r4 = r4;
                                while (xz3Var2 != null) {
                                    if ((xz3Var2.z & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            zc1Var = xz3Var2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new z44(new xz3[16], 0);
                                            }
                                            if (zc1Var != 0) {
                                                r4.b(zc1Var);
                                                zc1Var = 0;
                                            }
                                            r4.b(xz3Var2);
                                        }
                                    }
                                    xz3Var2 = xz3Var2.C;
                                    zc1Var = zc1Var;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            zc1Var = wc7.J(r4);
                        }
                    }
                    xz3Var = xz3Var.B;
                }
            }
            O = O.v();
            if (O != null && (kfVar = O.c0) != null) {
                xz3Var = (z66) kfVar.C;
            } else {
                xz3Var = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [yc1, jj6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [ub2] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [xz3] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [xz3] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void j(jj6 jj6Var, ub2 ub2Var) {
        kf kfVar;
        xz3 xz3Var = (xz3) jj6Var;
        if (!xz3Var.x.K) {
            ez2.b("visitAncestors called on an unattached node");
        }
        xz3 xz3Var2 = xz3Var.x.B;
        za3 O = wc7.O(jj6Var);
        while (O != null) {
            if ((((xz3) O.c0.D).A & 262144) != 0) {
                while (xz3Var2 != null) {
                    if ((xz3Var2.z & 262144) != 0) {
                        zc1 zc1Var = xz3Var2;
                        ?? r5 = 0;
                        while (zc1Var != 0) {
                            boolean z = true;
                            if (zc1Var instanceof jj6) {
                                jj6 jj6Var2 = (jj6) zc1Var;
                                if (a34.i(jj6Var.p(), jj6Var2.p()) && jj6Var.getClass() == jj6Var2.getClass()) {
                                    z = ((Boolean) ub2Var.invoke(jj6Var2)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((zc1Var.z & 262144) != 0 && (zc1Var instanceof zc1)) {
                                xz3 xz3Var3 = zc1Var.M;
                                int i = 0;
                                zc1Var = zc1Var;
                                r5 = r5;
                                while (xz3Var3 != null) {
                                    if ((xz3Var3.z & 262144) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            zc1Var = xz3Var3;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new z44(new xz3[16], 0);
                                            }
                                            if (zc1Var != 0) {
                                                r5.b(zc1Var);
                                                zc1Var = 0;
                                            }
                                            r5.b(xz3Var3);
                                        }
                                    }
                                    xz3Var3 = xz3Var3.C;
                                    zc1Var = zc1Var;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            zc1Var = wc7.J(r5);
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [ub2] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [xz3] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void k(xz3 xz3Var, String str, ub2 ub2Var) {
        ij6 ij6Var;
        if (!xz3Var.x.K) {
            ez2.b("visitSubtreeIf called on an unattached node");
        }
        z44 z44Var = new z44(new xz3[16], 0);
        xz3 xz3Var2 = xz3Var.x;
        xz3 xz3Var3 = xz3Var2.C;
        if (xz3Var3 == null) {
            wc7.f(z44Var, xz3Var2);
        } else {
            z44Var.b(xz3Var3);
        }
        while (true) {
            int i = z44Var.z;
            if (i != 0) {
                xz3 xz3Var4 = (xz3) z44Var.m(i - 1);
                if ((xz3Var4.A & 262144) != 0) {
                    for (xz3 xz3Var5 = xz3Var4; xz3Var5 != null && xz3Var5.K; xz3Var5 = xz3Var5.C) {
                        if ((xz3Var5.z & 262144) != 0) {
                            zc1 zc1Var = xz3Var5;
                            ?? r7 = 0;
                            while (zc1Var != 0) {
                                if (zc1Var instanceof jj6) {
                                    jj6 jj6Var = (jj6) zc1Var;
                                    if (str.equals(jj6Var.p())) {
                                        ij6Var = (ij6) ub2Var.invoke(jj6Var);
                                    } else {
                                        ij6Var = ij6.x;
                                    }
                                    if (ij6Var != ij6.z) {
                                        if (ij6Var == ij6.y) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((zc1Var.z & 262144) != 0 && (zc1Var instanceof zc1)) {
                                    xz3 xz3Var6 = zc1Var.M;
                                    int i2 = 0;
                                    zc1Var = zc1Var;
                                    r7 = r7;
                                    while (xz3Var6 != null) {
                                        if ((xz3Var6.z & 262144) != 0) {
                                            i2++;
                                            r7 = r7;
                                            if (i2 == 1) {
                                                zc1Var = xz3Var6;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new z44(new xz3[16], 0);
                                                }
                                                if (zc1Var != 0) {
                                                    r7.b(zc1Var);
                                                    zc1Var = 0;
                                                }
                                                r7.b(xz3Var6);
                                            }
                                        }
                                        xz3Var6 = xz3Var6.C;
                                        zc1Var = zc1Var;
                                        r7 = r7;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                zc1Var = wc7.J(r7);
                            }
                        }
                    }
                }
                wc7.f(z44Var, xz3Var4);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [jj6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [ub2] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [xz3] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void l(jj6 jj6Var, ub2 ub2Var) {
        ij6 ij6Var;
        xz3 xz3Var = (xz3) jj6Var;
        if (!xz3Var.x.K) {
            ez2.b("visitSubtreeIf called on an unattached node");
        }
        z44 z44Var = new z44(new xz3[16], 0);
        xz3 xz3Var2 = xz3Var.x;
        xz3 xz3Var3 = xz3Var2.C;
        if (xz3Var3 == null) {
            wc7.f(z44Var, xz3Var2);
        } else {
            z44Var.b(xz3Var3);
        }
        while (true) {
            int i = z44Var.z;
            if (i != 0) {
                xz3 xz3Var4 = (xz3) z44Var.m(i - 1);
                if ((xz3Var4.A & 262144) != 0) {
                    for (xz3 xz3Var5 = xz3Var4; xz3Var5 != null && xz3Var5.K; xz3Var5 = xz3Var5.C) {
                        if ((xz3Var5.z & 262144) != 0) {
                            zc1 zc1Var = xz3Var5;
                            ?? r8 = 0;
                            while (zc1Var != 0) {
                                if (zc1Var instanceof jj6) {
                                    jj6 jj6Var2 = (jj6) zc1Var;
                                    if (a34.i(jj6Var.p(), jj6Var2.p()) && jj6Var.getClass() == jj6Var2.getClass()) {
                                        ij6Var = (ij6) ub2Var.invoke(jj6Var2);
                                    } else {
                                        ij6Var = ij6.x;
                                    }
                                    if (ij6Var != ij6.z) {
                                        if (ij6Var == ij6.y) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((zc1Var.z & 262144) != 0 && (zc1Var instanceof zc1)) {
                                    xz3 xz3Var6 = zc1Var.M;
                                    int i2 = 0;
                                    zc1Var = zc1Var;
                                    r8 = r8;
                                    while (xz3Var6 != null) {
                                        if ((xz3Var6.z & 262144) != 0) {
                                            i2++;
                                            r8 = r8;
                                            if (i2 == 1) {
                                                zc1Var = xz3Var6;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new z44(new xz3[16], 0);
                                                }
                                                if (zc1Var != 0) {
                                                    r8.b(zc1Var);
                                                    zc1Var = 0;
                                                }
                                                r8.b(xz3Var6);
                                            }
                                        }
                                        xz3Var6 = xz3Var6.C;
                                        zc1Var = zc1Var;
                                        r8 = r8;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                zc1Var = wc7.J(r8);
                            }
                        }
                    }
                }
                wc7.f(z44Var, xz3Var4);
            } else {
                return;
            }
        }
    }

    public static String m(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(n(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(n(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String n(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String q = qx1.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(q), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(q.length() + 8 + name2.length() + 1);
            qx1.x(sb, "<", q, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static ik7 o(rf7 rf7Var, vs7 vs7Var, ArrayList arrayList, boolean z) {
        ik7 ik7Var;
        int i;
        int i2;
        fy5.l("reduce", 1, arrayList);
        fy5.m("reduce", 2, arrayList);
        ik7 f0 = ((y23) vs7Var.b).f0(vs7Var, (ik7) arrayList.get(0));
        if (f0 instanceof ti7) {
            if (arrayList.size() == 2) {
                ik7Var = ((y23) vs7Var.b).f0(vs7Var, (ik7) arrayList.get(1));
                if (ik7Var instanceof eh7) {
                    ze0.k("Failed to parse initial value");
                    return null;
                }
            } else if (rf7Var.p() != 0) {
                ik7Var = null;
            } else {
                ze0.m("Empty array with no initial value error");
                return null;
            }
            ti7 ti7Var = (ti7) f0;
            int p = rf7Var.p();
            if (z) {
                i = 0;
            } else {
                i = p - 1;
            }
            int i3 = -1;
            if (z) {
                i2 = p - 1;
            } else {
                i2 = 0;
            }
            if (true == z) {
                i3 = 1;
            }
            if (ik7Var == null) {
                ik7Var = rf7Var.q(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (!rf7Var.s(i)) {
                    i += i3;
                } else {
                    ik7Var = ti7Var.a(vs7Var, Arrays.asList(ik7Var, rf7Var.q(i), new xh7(Double.valueOf(i)), rf7Var));
                    if (!(ik7Var instanceof eh7)) {
                        i += i3;
                    } else {
                        ze0.m("Reduce operation failed");
                        return null;
                    }
                }
            }
            return ik7Var;
        }
        ze0.k("Callback should be a method");
        return null;
    }

    public static rf7 p(rf7 rf7Var, vs7 vs7Var, gk7 gk7Var, Boolean bool, Boolean bool2) {
        rf7 rf7Var2 = new rf7();
        Iterator o = rf7Var.o();
        while (o.hasNext()) {
            int intValue = ((Integer) o.next()).intValue();
            if (rf7Var.s(intValue)) {
                ik7 a = gk7Var.a(vs7Var, Arrays.asList(rf7Var.q(intValue), new xh7(Double.valueOf(intValue)), rf7Var));
                if (a.c().equals(bool)) {
                    break;
                }
                if (bool2 == null || a.c().equals(bool2)) {
                    rf7Var2.r(intValue, a);
                }
            }
        }
        return rf7Var2;
    }

    public abstract void c(int i);

    public abstract void e(boolean z);

    public abstract void f(boolean z);

    public abstract void g();

    public abstract void h();
}
