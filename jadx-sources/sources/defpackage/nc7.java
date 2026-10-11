package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nc7 {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ df7 h;
    public final mf7 i;

    public nc7(df7 df7Var, String str, int i, mf7 mf7Var, byte b) {
        this.g = b;
        this.h = df7Var;
        this.a = str;
        this.b = i;
        this.i = mf7Var;
    }

    public static Boolean c(Boolean bool, boolean z) {
        boolean z2;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, mq7 mq7Var, es7 es7Var) {
        String t;
        List w;
        String str2;
        int i;
        a34.x(mq7Var);
        if (str != null && mq7Var.r() && mq7Var.z() != 1 && (mq7Var.z() != 7 ? mq7Var.s() : mq7Var.x() != 0)) {
            int z = mq7Var.z();
            boolean v = mq7Var.v();
            if (!v && z != 2 && z != 7) {
                t = mq7Var.t().toUpperCase(Locale.ENGLISH);
            } else {
                t = mq7Var.t();
            }
            if (mq7Var.x() == 0) {
                w = null;
            } else {
                w = mq7Var.w();
                if (!v) {
                    ArrayList arrayList = new ArrayList(w.size());
                    Iterator it = w.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    w = Collections.unmodifiableList(arrayList);
                }
            }
            if (z == 2) {
                str2 = t;
            } else {
                str2 = null;
            }
            if (z != 7 ? t != null : w != null && !w.isEmpty()) {
                if (!v && z != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (z - 1) {
                    case 1:
                        if (str2 != null) {
                            if (true != v) {
                                i = 66;
                            } else {
                                i = 0;
                            }
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, i).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (es7Var != null) {
                                    es7Var.F.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(t));
                    case 3:
                        return Boolean.valueOf(str.endsWith(t));
                    case 4:
                        return Boolean.valueOf(str.contains(t));
                    case 5:
                        return Boolean.valueOf(str.equals(t));
                    case 6:
                        if (w != null) {
                            return Boolean.valueOf(w.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean e(BigDecimal bigDecimal, gq7 gq7Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        a34.x(gq7Var);
        if (gq7Var.r()) {
            boolean z = true;
            if (gq7Var.B() != 1 && (gq7Var.B() != 5 ? gq7Var.u() : gq7Var.w() && gq7Var.y())) {
                int B = gq7Var.B();
                try {
                    if (gq7Var.B() == 5) {
                        if (c28.p0(gq7Var.x()) && c28.p0(gq7Var.z())) {
                            BigDecimal bigDecimal5 = new BigDecimal(gq7Var.x());
                            bigDecimal4 = new BigDecimal(gq7Var.z());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (c28.p0(gq7Var.v())) {
                        bigDecimal2 = new BigDecimal(gq7Var.v());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (B != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i = B - 1;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4 && bigDecimal3 != null) {
                                        if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d != 0.0d) {
                                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                    if (bigDecimal.compareTo(bigDecimal2) != 0) {
                                        z = false;
                                    }
                                    return Boolean.valueOf(z);
                                }
                            } else if (bigDecimal2 != null) {
                                if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                        } else if (bigDecimal2 != null) {
                            if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c9 A[EDGE_INSN: B:160:0x03c9->B:52:0x03c9 BREAK  A[LOOP:3: B:132:0x0246->B:157:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Long r22, java.lang.Long r23, defpackage.mt7 r24, long r25, defpackage.dm7 r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc7.a(java.lang.Long, java.lang.Long, mt7, long, dm7, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.Long r16, java.lang.Long r17, defpackage.cv7 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc7.b(java.lang.Long, java.lang.Long, cv7, boolean):boolean");
    }
}
