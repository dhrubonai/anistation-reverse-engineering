package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class be6 {
    public static final /* synthetic */ be6[] A;
    public static final be6 x;
    public static final be6 y;
    public static final be6 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [be6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [be6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [be6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("None", 0);
        x = r0;
        ?? r1 = new Enum("Cursor", 1);
        y = r1;
        ?? r2 = new Enum("Selection", 2);
        z = r2;
        A = new be6[]{r0, r1, r2};
    }

    public static be6 valueOf(String str) {
        return (be6) Enum.valueOf(be6.class, str);
    }

    public static be6[] values() {
        return (be6[]) A.clone();
    }
}
