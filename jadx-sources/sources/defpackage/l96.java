package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l96 {
    public static final /* synthetic */ l96[] A;
    public static final l96 x;
    public static final l96 y;
    public static final l96 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l96] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l96] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l96] */
    static {
        ?? r0 = new Enum("Insert", 0);
        x = r0;
        ?? r1 = new Enum("Delete", 1);
        y = r1;
        ?? r2 = new Enum("Replace", 2);
        z = r2;
        A = new l96[]{r0, r1, r2};
    }

    public static l96 valueOf(String str) {
        return (l96) Enum.valueOf(l96.class, str);
    }

    public static l96[] values() {
        return (l96[]) A.clone();
    }
}
