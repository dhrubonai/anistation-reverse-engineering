package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uy3 {
    public static final uy3 A;
    public static final /* synthetic */ uy3[] B;
    public static final uy3 x;
    public static final uy3 y;
    public static final uy3 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, uy3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, uy3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, uy3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, uy3] */
    static {
        ?? r0 = new Enum("TopLeft", 0);
        x = r0;
        ?? r1 = new Enum("TopRight", 1);
        y = r1;
        ?? r2 = new Enum("BottomLeft", 2);
        z = r2;
        ?? r3 = new Enum("BottomRight", 3);
        A = r3;
        B = new uy3[]{r0, r1, r2, r3};
    }

    public static uy3 valueOf(String str) {
        return (uy3) Enum.valueOf(uy3.class, str);
    }

    public static uy3[] values() {
        return (uy3[]) B.clone();
    }
}
