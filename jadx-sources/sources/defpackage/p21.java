package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p21 {
    public static final /* synthetic */ p21[] A;
    public static final p21 x;
    public static final p21 y;
    public static final p21 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p21] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p21] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, p21] */
    static {
        ?? r0 = new Enum("CROSSED", 0);
        x = r0;
        ?? r1 = new Enum("NOT_CROSSED", 1);
        y = r1;
        ?? r2 = new Enum("COLLAPSED", 2);
        z = r2;
        A = new p21[]{r0, r1, r2};
    }

    public static p21 valueOf(String str) {
        return (p21) Enum.valueOf(p21.class, str);
    }

    public static p21[] values() {
        return (p21[]) A.clone();
    }
}
