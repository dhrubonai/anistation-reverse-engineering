package com.google.firebase.components;

/* loaded from: classes.dex */
public final class Preconditions {
    public static void checkArgument(boolean z9, String str) {
        if (z9) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t9) {
        t9.getClass();
        return t9;
    }

    public static void checkState(boolean z9, String str) {
        if (z9) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static <T> T checkNotNull(T t9, String str) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(str);
    }
}
