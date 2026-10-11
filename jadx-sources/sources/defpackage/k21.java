package defpackage;

/* loaded from: classes.dex */
public enum k21 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");

    public final String x;

    k21(String str) {
        this.x = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.x;
    }
}
