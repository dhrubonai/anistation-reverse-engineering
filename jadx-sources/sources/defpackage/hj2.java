package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hj2 {
    public static final /* synthetic */ hj2[] A;
    public static final hj2 x;
    public static final hj2 y;
    public static final hj2 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [hj2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hj2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hj2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("None", 0);
        x = r0;
        ?? r1 = new Enum("Selection", 1);
        y = r1;
        ?? r2 = new Enum("Cursor", 2);
        z = r2;
        A = new hj2[]{r0, r1, r2};
    }

    public static hj2 valueOf(String str) {
        return (hj2) Enum.valueOf(hj2.class, str);
    }

    public static hj2[] values() {
        return (hj2[]) A.clone();
    }
}
