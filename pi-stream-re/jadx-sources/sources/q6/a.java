package q6;

import r6.h0;

/* loaded from: classes.dex */
public abstract class a implements h {
    public int a(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        h0.v(i10, length);
        while (i10 < length) {
            if (!b(charSequence.charAt(i10))) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    @Override // q6.h
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c6);
}
