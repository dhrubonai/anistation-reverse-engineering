package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xx6 {
    public static final /* synthetic */ xx6[] A;
    public static final xx6 x;
    public static final xx6 y;
    public static final xx6 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xx6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xx6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xx6] */
    static {
        ?? r0 = new Enum("Fullscreen", 0);
        x = r0;
        ?? r1 = new Enum("Expanded", 1);
        y = r1;
        ?? r2 = new Enum("Minimized", 2);
        z = r2;
        A = new xx6[]{r0, r1, r2};
    }

    public static xx6 valueOf(String str) {
        return (xx6) Enum.valueOf(xx6.class, str);
    }

    public static xx6[] values() {
        return (xx6[]) A.clone();
    }
}
