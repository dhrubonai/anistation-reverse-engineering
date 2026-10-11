package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zf3 {
    public static final zf3 A;
    public static final zf3 B;
    public static final /* synthetic */ zf3[] C;
    public static final zf3 x;
    public static final zf3 y;
    public static final zf3 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zf3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zf3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zf3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, zf3] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, zf3] */
    static {
        ?? r0 = new Enum("DEBUG", 0);
        x = r0;
        ?? r1 = new Enum("INFO", 1);
        y = r1;
        ?? r2 = new Enum("WARNING", 2);
        z = r2;
        ?? r3 = new Enum("ERROR", 3);
        A = r3;
        ?? r4 = new Enum("NONE", 4);
        B = r4;
        C = new zf3[]{r0, r1, r2, r3, r4};
    }

    public static zf3 valueOf(String str) {
        return (zf3) Enum.valueOf(zf3.class, str);
    }

    public static zf3[] values() {
        return (zf3[]) C.clone();
    }
}
