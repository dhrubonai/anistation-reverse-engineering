package o5;

import java.util.Locale;

/* loaded from: classes.dex */
public final class t extends Exception {
    public t(int i10) {
        super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i10)));
    }
}
