package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lh6 {
    public static final lh6 x;
    public static final lh6 y;
    public static final /* synthetic */ lh6[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lh6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lh6] */
    static {
        ?? r0 = new Enum("IMPORT", 0);
        x = r0;
        ?? r1 = new Enum("EXPORT", 1);
        y = r1;
        z = new lh6[]{r0, r1};
    }

    public static lh6 valueOf(String str) {
        return (lh6) Enum.valueOf(lh6.class, str);
    }

    public static lh6[] values() {
        return (lh6[]) z.clone();
    }
}
