package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ij6 {
    public static final /* synthetic */ ij6[] A;
    public static final ij6 x;
    public static final ij6 y;
    public static final ij6 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ij6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ij6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ij6] */
    static {
        ?? r0 = new Enum("ContinueTraversal", 0);
        x = r0;
        ?? r1 = new Enum("SkipSubtreeAndContinueTraversal", 1);
        y = r1;
        ?? r2 = new Enum("CancelTraversal", 2);
        z = r2;
        A = new ij6[]{r0, r1, r2};
    }

    public static ij6 valueOf(String str) {
        return (ij6) Enum.valueOf(ij6.class, str);
    }

    public static ij6[] values() {
        return (ij6[]) A.clone();
    }
}
