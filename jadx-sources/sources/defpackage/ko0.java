package defpackage;

import android.util.Pair;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ko0 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");
    public static final byte[] d = {-75, 0, -112, 0, 1};

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        char c2;
        String str = b[i];
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        if (z) {
            c2 = 'H';
        } else {
            c2 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c2), Integer.valueOf(i4)};
        String str2 = eq6.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
    
        if (r3 == 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(java.nio.ByteBuffer r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko0.b(java.nio.ByteBuffer):byte[]");
    }

    public static Pair c(ea2 ea2Var) {
        boolean z;
        jo0 e = e(ea2Var);
        if (e != null && (z = e.c)) {
            io3.B(z);
            Integer valueOf = Integer.valueOf(e.a);
            io3.B(z);
            return new Pair(valueOf, Integer.valueOf(e.b));
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x015d, code lost:
    
        if (r13.equals("L60") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jo0 d(java.lang.String r12, java.lang.String[] r13, defpackage.hp0 r14) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko0.d(java.lang.String, java.lang.String[], hp0):jo0");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0435, code lost:
    
        if (r1.equals("H83") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x06b9, code lost:
    
        if (r1.equals("mp4a") == false) goto L509;
     */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0679 A[Catch: NumberFormatException -> 0x0691, TryCatch #2 {NumberFormatException -> 0x0691, blocks: (B:380:0x062c, B:382:0x0640, B:393:0x065e, B:396:0x0679, B:398:0x0689), top: B:379:0x062c }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0689 A[Catch: NumberFormatException -> 0x0691, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0691, blocks: (B:380:0x062c, B:382:0x0640, B:393:0x065e, B:396:0x0679, B:398:0x0689), top: B:379:0x062c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jo0 e(defpackage.ea2 r33) {
        /*
            Method dump skipped, instructions count: 3602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko0.e(ea2):jo0");
    }

    public static boolean f(ea2 ea2Var) {
        if (Objects.equals(ea2Var.p, "application/x-itut-t35")) {
            for (byte[] bArr : ea2Var.s) {
                int length = bArr.length;
                byte[] bArr2 = d;
                if (length >= bArr2.length) {
                    for (int i = 0; i < bArr2.length; i++) {
                        if (bArr[i] != bArr2[i]) {
                            break;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
