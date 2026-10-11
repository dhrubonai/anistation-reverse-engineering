package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cj2 {
    public static final /* synthetic */ cj2[] A;
    public static final cj2 x;
    public static final cj2 y;
    public static final cj2 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cj2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cj2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, cj2] */
    static {
        ?? r0 = new Enum("Cursor", 0);
        x = r0;
        ?? r1 = new Enum("SelectionStart", 1);
        y = r1;
        ?? r2 = new Enum("SelectionEnd", 2);
        z = r2;
        A = new cj2[]{r0, r1, r2};
    }

    public static cj2 valueOf(String str) {
        return (cj2) Enum.valueOf(cj2.class, str);
    }

    public static cj2[] values() {
        return (cj2[]) A.clone();
    }
}
