package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rb6 {
    public static final /* synthetic */ rb6[] A;
    public static final rb6 x;
    public static final rb6 y;
    public static final rb6 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rb6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, rb6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, rb6] */
    static {
        ?? r0 = new Enum("None", 0);
        x = r0;
        ?? r1 = new Enum("Touch", 1);
        y = r1;
        ?? r2 = new Enum("Mouse", 2);
        z = r2;
        A = new rb6[]{r0, r1, r2};
    }

    public static rb6 valueOf(String str) {
        return (rb6) Enum.valueOf(rb6.class, str);
    }

    public static rb6[] values() {
        return (rb6[]) A.clone();
    }
}
