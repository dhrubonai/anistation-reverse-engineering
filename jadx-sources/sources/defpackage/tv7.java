package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public enum tv7 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    public final String x;

    tv7(String str) {
        this.x = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.x;
    }
}
