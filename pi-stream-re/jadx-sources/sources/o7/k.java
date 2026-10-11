package o7;

import r6.h0;

/* loaded from: classes.dex */
public abstract class k extends j {
    public static final String H1(int i10, String str) {
        boolean z9;
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            int length = str.length();
            if (i10 > length) {
                i10 = length;
            }
            String substring = str.substring(0, i10);
            h0.s(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(a3.g.o("Requested character count ", i10, " is less than zero.").toString());
    }
}
