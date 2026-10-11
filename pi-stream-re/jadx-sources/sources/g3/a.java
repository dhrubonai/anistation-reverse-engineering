package g3;

import f1.t;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4341c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f4342d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final t f4343a = new t();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f4344b = new StringBuilder();

    public static String a(t tVar, StringBuilder sb) {
        boolean z9 = false;
        sb.setLength(0);
        int i10 = tVar.f3859b;
        int i11 = tVar.f3860c;
        while (i10 < i11 && !z9) {
            char c6 = (char) tVar.f3858a[i10];
            if ((c6 < 'A' || c6 > 'Z') && ((c6 < 'a' || c6 > 'z') && ((c6 < '0' || c6 > '9') && c6 != '#' && c6 != '-' && c6 != '.' && c6 != '_'))) {
                z9 = true;
            } else {
                i10++;
                sb.append(c6);
            }
        }
        tVar.H(i10 - tVar.f3859b);
        return sb.toString();
    }

    public static String b(t tVar, StringBuilder sb) {
        c(tVar);
        if (tVar.f3860c - tVar.f3859b == 0) {
            return null;
        }
        String a10 = a(tVar, sb);
        if (!"".equals(a10)) {
            return a10;
        }
        return "" + ((char) tVar.v());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0067 A[LOOP:1: B:3:0x0002->B:41:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(f1.t r8) {
        /*
            r0 = 1
        L1:
            r1 = r0
        L2:
            int r2 = r8.f3860c
            int r3 = r8.f3859b
            int r2 = r2 - r3
            if (r2 <= 0) goto L69
            if (r1 == 0) goto L69
            byte[] r1 = r8.f3858a
            r1 = r1[r3]
            char r1 = (char) r1
            r2 = 9
            r3 = 0
            if (r1 == r2) goto L27
            r2 = 10
            if (r1 == r2) goto L27
            r2 = 12
            if (r1 == r2) goto L27
            r2 = 13
            if (r1 == r2) goto L27
            r2 = 32
            if (r1 == r2) goto L27
            r1 = r3
            goto L2b
        L27:
            r8.H(r0)
            r1 = r0
        L2b:
            if (r1 != 0) goto L1
            int r1 = r8.f3859b
            int r2 = r8.f3860c
            byte[] r4 = r8.f3858a
            int r5 = r1 + 2
            if (r5 > r2) goto L63
            int r5 = r1 + 1
            r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L63
            int r1 = r5 + 1
            r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L63
        L47:
            int r5 = r1 + 1
            if (r5 >= r2) goto L5b
            r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L59
            r1 = r4[r5]
            char r1 = (char) r1
            if (r1 != r6) goto L59
            int r2 = r5 + 1
            r1 = r2
            goto L47
        L59:
            r1 = r5
            goto L47
        L5b:
            int r1 = r8.f3859b
            int r2 = r2 - r1
            r8.H(r2)
            r1 = r0
            goto L64
        L63:
            r1 = r3
        L64:
            if (r1 == 0) goto L67
            goto L1
        L67:
            r1 = r3
            goto L2
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.a.c(f1.t):void");
    }
}
