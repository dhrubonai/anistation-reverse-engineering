package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class im6 {
    public static final List a = te4.H("");

    public static final int a(String str, int i, int i2) {
        boolean z = false;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != ':') {
                if (charAt != '[') {
                    if (charAt == ']') {
                        z = false;
                    }
                } else {
                    z = true;
                }
            } else if (!z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int b(hm6 hm6Var, String str, int i, int i2) {
        int i3 = i + 1;
        if (i3 == i2) {
            hm6Var.b = true;
            return i2;
        }
        int S = uz5.S(str, '#', i3, 4);
        Integer valueOf = Integer.valueOf(S);
        if (S <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i2 = valueOf.intValue();
        }
        h98.K(str.substring(i3, i2)).b(new cu5(hm6Var, (byte) 8));
        return i2;
    }

    public static final void c(hm6 hm6Var, String str) {
        hm6Var.getClass();
        str.getClass();
        if (uz5.V(str)) {
            return;
        }
        try {
            d(hm6Var, str);
        } catch (Throwable th) {
            throw new wm0("Fail to parse url: ".concat(str), th, (byte) 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0103, code lost:
    
        if (r14 >= 128) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010f A[LOOP:4: B:71:0x00f1->B:78:0x010f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0114 A[EDGE_INSN: B:79:0x0114->B:84:0x0114 BREAK  A[LOOP:4: B:71:0x00f1->B:78:0x010f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.hm6 r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im6.d(hm6, java.lang.String):void");
    }
}
