package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ey2 {
    public static final /* synthetic */ ey2[] A;
    public static final ey2 x;
    public static final ey2 y;
    public static final ey2 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ey2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ey2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ey2] */
    static {
        ?? r0 = new Enum("Yes", 0);
        x = r0;
        ?? r1 = new Enum("No", 1);
        y = r1;
        ?? r2 = new Enum("NotInitialized", 2);
        z = r2;
        A = new ey2[]{r0, r1, r2};
    }

    public static ey2 valueOf(String str) {
        return (ey2) Enum.valueOf(ey2.class, str);
    }

    public static ey2[] values() {
        return (ey2[]) A.clone();
    }
}
