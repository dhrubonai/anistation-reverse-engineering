package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v51 {
    public Integer a;

    public final Integer a(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        Integer num = null;
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
            return null;
        }
        Integer num2 = this.a;
        if (num2 != null) {
            this.a = null;
            Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), unicodeChar));
            if (valueOf.intValue() != 0) {
                num = valueOf;
            }
            if (num != null) {
                unicodeChar = num.intValue();
            }
            return Integer.valueOf(unicodeChar);
        }
        return Integer.valueOf(unicodeChar);
    }
}
