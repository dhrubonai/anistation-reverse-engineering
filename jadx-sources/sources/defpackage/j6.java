package defpackage;

/* loaded from: classes.dex */
public enum j6 {
    HTML("html"),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE("native"),
    JAVASCRIPT("javascript");

    public final String x;

    j6(String str) {
        this.x = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.x;
    }
}
