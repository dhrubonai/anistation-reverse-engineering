package g3;

import c1.r0;
import f1.b0;
import f1.t;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f4388a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(t tVar) {
        String g10 = tVar.g();
        if (g10 != null && g10.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i10 = b0.f3799a;
        String[] split = str.split("\\.", 2);
        long j4 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j4 = (j4 * 60) + Long.parseLong(str2);
        }
        long j10 = j4 * 1000;
        if (split.length == 2) {
            j10 += Long.parseLong(split[1]);
        }
        return j10 * 1000;
    }

    public static void d(t tVar) {
        int i10 = tVar.f3859b;
        if (a(tVar)) {
            return;
        }
        tVar.G(i10);
        throw r0.a("Expected WEBVTT. Got " + tVar.g(), null);
    }
}
