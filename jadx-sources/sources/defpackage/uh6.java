package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uh6 {
    public static final uh6 x;
    public static final uh6 y;
    public static final /* synthetic */ uh6[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [uh6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [uh6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [uh6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DEFERRED", 0);
        x = r0;
        ?? r1 = new Enum("IMMEDIATE", 1);
        y = r1;
        z = new uh6[]{r0, r1, new Enum("EXCLUSIVE", 2)};
    }

    public static uh6 valueOf(String str) {
        return (uh6) Enum.valueOf(uh6.class, str);
    }

    public static uh6[] values() {
        return (uh6[]) z.clone();
    }
}
