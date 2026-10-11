package com.google.firebase.platforminfo;

/* loaded from: classes.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            return w6.a.f11010b.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
