package dagger.hilt.internal;

/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z9, String str, Object... objArr) {
        if (z9) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t9) {
        t9.getClass();
        return t9;
    }

    public static void checkState(boolean z9, String str, Object... objArr) {
        if (z9) {
        } else {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t9, String str) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(str);
    }
}
