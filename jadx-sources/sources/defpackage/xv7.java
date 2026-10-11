package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xv7 {
    public static final xv7 c = new xv7(100);
    public final EnumMap a;
    public final int b;

    public xv7(int i) {
        EnumMap enumMap = new EnumMap(wv7.class);
        this.a = enumMap;
        wv7 wv7Var = wv7.AD_STORAGE;
        tv7 tv7Var = tv7.UNINITIALIZED;
        enumMap.put((EnumMap) wv7Var, (wv7) tv7Var);
        enumMap.put((EnumMap) wv7.ANALYTICS_STORAGE, (wv7) tv7Var);
        this.b = i;
    }

    public static String a(int i) {
        if (i != -30) {
            if (i != -20) {
                if (i != -10) {
                    if (i != 0) {
                        if (i != 30) {
                            if (i != 90) {
                                if (i != 100) {
                                    return "OTHER";
                                }
                                return "UNKNOWN";
                            }
                            return "REMOTE_CONFIG";
                        }
                        return "1P_INIT";
                    }
                    return "1P_API";
                }
                return "MANIFEST";
            }
            return "API";
        }
        return "TCF";
    }

    public static xv7 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new xv7(i);
        }
        EnumMap enumMap = new EnumMap(wv7.class);
        for (wv7 wv7Var : uv7.STORAGE.x) {
            enumMap.put((EnumMap) wv7Var, (wv7) d(bundle.getString(wv7Var.x)));
        }
        return new xv7(enumMap, i);
    }

    public static xv7 c(int i, String str) {
        String str2;
        EnumMap enumMap = new EnumMap(wv7.class);
        wv7[] wv7VarArr = uv7.STORAGE.x;
        for (int i2 = 0; i2 < wv7VarArr.length; i2++) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            wv7 wv7Var = wv7VarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) wv7Var, (wv7) e(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) wv7Var, (wv7) tv7.UNINITIALIZED);
            }
        }
        return new xv7(enumMap, i);
    }

    public static tv7 d(String str) {
        tv7 tv7Var = tv7.UNINITIALIZED;
        if (str == null) {
            return tv7Var;
        }
        if (str.equals("granted")) {
            return tv7.GRANTED;
        }
        if (str.equals("denied")) {
            return tv7.DENIED;
        }
        return tv7Var;
    }

    public static tv7 e(char c2) {
        if (c2 != '+') {
            if (c2 != '0') {
                if (c2 != '1') {
                    return tv7.UNINITIALIZED;
                }
                return tv7.GRANTED;
            }
            return tv7.DENIED;
        }
        return tv7.POLICY;
    }

    public static char h(tv7 tv7Var) {
        if (tv7Var != null) {
            int ordinal = tv7Var.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return '1';
                    }
                    return '-';
                }
                return '0';
            }
            return '+';
        }
        return '-';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 != -30) {
                i = -20;
            } else {
                return true;
            }
        }
        if (i == -30) {
            if (i2 == -20) {
                return true;
            }
        } else {
            i3 = i;
        }
        if (i3 != i2 && i >= i2) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xv7) {
            xv7 xv7Var = (xv7) obj;
            wv7[] wv7VarArr = uv7.STORAGE.x;
            int length = wv7VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    wv7 wv7Var = wv7VarArr[i];
                    if (this.a.get(wv7Var) != xv7Var.a.get(wv7Var)) {
                        break;
                    }
                    i++;
                } else if (this.b == xv7Var.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (wv7 wv7Var : uv7.STORAGE.x) {
            tv7 tv7Var = (tv7) this.a.get(wv7Var);
            char c2 = '-';
            if (tv7Var != null && (ordinal = tv7Var.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        c2 = '0';
                    }
                }
                c2 = '1';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (wv7 wv7Var : uv7.STORAGE.x) {
            sb.append(h((tv7) this.a.get(wv7Var)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int i = this.b * 17;
        while (it.hasNext()) {
            i = (i * 31) + ((tv7) it.next()).hashCode();
        }
        return i;
    }

    public final boolean i(wv7 wv7Var) {
        if (((tv7) this.a.get(wv7Var)) == tv7.DENIED) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xv7 j(defpackage.xv7 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<wv7> r1 = defpackage.wv7.class
            r0.<init>(r1)
            uv7 r1 = defpackage.uv7.STORAGE
            wv7[] r1 = r1.x
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.a
            java.lang.Object r5 = r5.get(r4)
            tv7 r5 = (defpackage.tv7) r5
            java.util.EnumMap r6 = r9.a
            java.lang.Object r6 = r6.get(r4)
            tv7 r6 = (defpackage.tv7) r6
            if (r5 != 0) goto L24
            goto L31
        L24:
            if (r6 == 0) goto L40
            tv7 r7 = defpackage.tv7.UNINITIALIZED
            if (r5 != r7) goto L2b
            goto L31
        L2b:
            if (r6 == r7) goto L40
            tv7 r7 = defpackage.tv7.POLICY
            if (r5 != r7) goto L33
        L31:
            r5 = r6
            goto L40
        L33:
            if (r6 == r7) goto L40
            tv7 r7 = defpackage.tv7.DENIED
            if (r5 == r7) goto L3f
            if (r6 != r7) goto L3c
            goto L3f
        L3c:
            tv7 r5 = defpackage.tv7.GRANTED
            goto L40
        L3f:
            r5 = r7
        L40:
            if (r5 == 0) goto L45
            r0.put(r4, r5)
        L45:
            int r3 = r3 + 1
            goto Ld
        L48:
            xv7 r8 = new xv7
            r9 = 100
            r8.<init>(r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv7.j(xv7):xv7");
    }

    public final xv7 k(xv7 xv7Var) {
        EnumMap enumMap = new EnumMap(wv7.class);
        for (wv7 wv7Var : uv7.STORAGE.x) {
            tv7 tv7Var = (tv7) this.a.get(wv7Var);
            if (tv7Var == tv7.UNINITIALIZED) {
                tv7Var = (tv7) xv7Var.a.get(wv7Var);
            }
            if (tv7Var != null) {
                enumMap.put((EnumMap) wv7Var, (wv7) tv7Var);
            }
        }
        return new xv7(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (wv7 wv7Var : uv7.STORAGE.x) {
            sb.append(",");
            sb.append(wv7Var.x);
            sb.append("=");
            tv7 tv7Var = (tv7) this.a.get(wv7Var);
            if (tv7Var == null) {
                tv7Var = tv7.UNINITIALIZED;
            }
            sb.append(tv7Var);
        }
        return sb.toString();
    }

    public xv7(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(wv7.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
