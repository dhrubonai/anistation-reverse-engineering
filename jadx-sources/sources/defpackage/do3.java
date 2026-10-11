package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class do3 {
    public final Matcher a;
    public final CharSequence b;
    public final co3 c;
    public bo3 d;

    public do3(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new co3(this, (byte) 0);
    }

    public final List a() {
        bo3 bo3Var = this.d;
        if (bo3Var == null) {
            bo3 bo3Var2 = new bo3(this);
            this.d = bo3Var2;
            return bo3Var2;
        }
        return bo3Var;
    }

    public final f13 b() {
        Matcher matcher = this.a;
        return db.r0(matcher.start(), matcher.end());
    }

    public final do3 c() {
        int i;
        Matcher matcher = this.a;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        CharSequence charSequence = this.b;
        if (i2 > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (!matcher2.find(i2)) {
            return null;
        }
        return new do3(matcher2, charSequence);
    }
}
