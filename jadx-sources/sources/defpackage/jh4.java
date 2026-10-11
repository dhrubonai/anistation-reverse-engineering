package defpackage;

/* loaded from: classes.dex */
public enum jh4 {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");

    public final String x;

    jh4(String str) {
        this.x = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.x;
    }
}
