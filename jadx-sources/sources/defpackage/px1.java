package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class px1 {
    public static final px1 A;
    public static final /* synthetic */ px1[] B;
    public static final px1 x;
    public static final px1 y;
    public static final px1 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, px1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, px1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, px1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, px1] */
    static {
        ?? r0 = new Enum("REPLACE", 0);
        x = r0;
        ?? r1 = new Enum("KEEP", 1);
        y = r1;
        ?? r2 = new Enum("APPEND", 2);
        z = r2;
        ?? r3 = new Enum("APPEND_OR_REPLACE", 3);
        A = r3;
        B = new px1[]{r0, r1, r2, r3};
    }

    public static px1 valueOf(String str) {
        return (px1) Enum.valueOf(px1.class, str);
    }

    public static px1[] values() {
        return (px1[]) B.clone();
    }
}
