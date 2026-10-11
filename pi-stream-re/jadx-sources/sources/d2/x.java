package d2;

import c1.o0;
import c1.p0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3208c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f3209a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f3210b = -1;

    public final boolean a(String str) {
        Matcher matcher = f3208c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = f1.b0.f3799a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f3209a = parseInt;
                    this.f3210b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(p0 p0Var) {
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.f1876a;
            if (i10 < o0VarArr.length) {
                o0 o0Var = o0VarArr[i10];
                if (o0Var instanceof q2.f) {
                    q2.f fVar = (q2.f) o0Var;
                    if ("iTunSMPB".equals(fVar.f9095c) && a(fVar.f9096d)) {
                        return;
                    }
                } else if (o0Var instanceof q2.l) {
                    q2.l lVar = (q2.l) o0Var;
                    if ("com.apple.iTunes".equals(lVar.f9107b) && "iTunSMPB".equals(lVar.f9108c) && a(lVar.f9109d)) {
                        return;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
