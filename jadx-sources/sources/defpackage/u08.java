package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u08 {
    public static final u08 x;
    public static final u08 y;
    public static final /* synthetic */ u08[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u08] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u08] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u08] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, u08] */
    static {
        ?? r0 = new Enum("CONSENT", 0);
        x = r0;
        ?? r1 = new Enum("LEGITIMATE_INTEREST", 1);
        ?? r2 = new Enum("FLEXIBLE_CONSENT", 2);
        ?? r3 = new Enum("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        y = r3;
        z = new u08[]{r0, r1, r2, r3};
    }

    public static u08[] values() {
        return (u08[]) z.clone();
    }
}
