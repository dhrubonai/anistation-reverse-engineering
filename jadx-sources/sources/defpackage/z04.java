package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z04 {
    public static final z04 A;
    public static final /* synthetic */ z04[] B;
    public static final z04 x;
    public static final z04 y;
    public static final z04 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z04] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z04] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, z04] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, z04] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, z04] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, z04] */
    static {
        ?? r0 = new Enum("DefaultSpatial", 0);
        x = r0;
        ?? r1 = new Enum("FastSpatial", 1);
        y = r1;
        ?? r2 = new Enum("SlowSpatial", 2);
        ?? r3 = new Enum("DefaultEffects", 3);
        z = r3;
        ?? r4 = new Enum("FastEffects", 4);
        A = r4;
        B = new z04[]{r0, r1, r2, r3, r4, new Enum("SlowEffects", 5)};
    }

    public static z04 valueOf(String str) {
        return (z04) Enum.valueOf(z04.class, str);
    }

    public static z04[] values() {
        return (z04[]) B.clone();
    }
}
