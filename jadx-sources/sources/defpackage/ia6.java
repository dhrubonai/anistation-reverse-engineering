package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ia6 {
    public static final ia6 x;
    public static final ia6 y;
    public static final /* synthetic */ ia6[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ia6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ia6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ia6] */
    static {
        ?? r0 = new Enum("MergeIfPossible", 0);
        x = r0;
        ?? r1 = new Enum("ClearHistory", 1);
        ?? r2 = new Enum("NeverMerge", 2);
        y = r2;
        z = new ia6[]{r0, r1, r2};
    }

    public static ia6 valueOf(String str) {
        return (ia6) Enum.valueOf(ia6.class, str);
    }

    public static ia6[] values() {
        return (ia6[]) z.clone();
    }
}
