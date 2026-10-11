package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p41 {
    public static final p41 A;
    public static final /* synthetic */ p41[] B;
    public static final p41 x;
    public static final p41 y;
    public static final p41 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p41] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p41] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, p41] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, p41] */
    static {
        ?? r0 = new Enum("MEMORY_CACHE", 0);
        x = r0;
        ?? r1 = new Enum("MEMORY", 1);
        y = r1;
        ?? r2 = new Enum("DISK", 2);
        z = r2;
        ?? r3 = new Enum("NETWORK", 3);
        A = r3;
        B = new p41[]{r0, r1, r2, r3};
    }

    public static p41 valueOf(String str) {
        return (p41) Enum.valueOf(p41.class, str);
    }

    public static p41[] values() {
        return (p41[]) B.clone();
    }
}
