package o7;

import java.io.Serializable;
import java.util.regex.Pattern;
import r6.h0;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f8324a;

    public d(String str) {
        Pattern compile = Pattern.compile(str);
        h0.s(compile, "compile(...)");
        this.f8324a = compile;
    }

    public final String toString() {
        String pattern = this.f8324a.toString();
        h0.s(pattern, "toString(...)");
        return pattern;
    }
}
