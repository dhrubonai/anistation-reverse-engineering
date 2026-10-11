package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ym0 {
    public static final ym0 x;
    public static final /* synthetic */ ym0[] y;

    /* JADX INFO: Fake field, exist only in values array */
    ym0 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ym0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ym0] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        ?? r1 = new Enum("ANDROID_FIREBASE", 1);
        x = r1;
        y = new ym0[]{r0, r1};
    }

    public static ym0 valueOf(String str) {
        return (ym0) Enum.valueOf(ym0.class, str);
    }

    public static ym0[] values() {
        return (ym0[]) y.clone();
    }
}
