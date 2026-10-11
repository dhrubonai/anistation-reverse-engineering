package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xg1 {
    public static final /* synthetic */ xg1[] A;
    public static final xg1 x;
    public static final xg1 y;
    public static final xg1 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [xg1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xg1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [xg1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("BUFFERING", 0);
        x = r0;
        ?? r1 = new Enum("PLAYING", 1);
        y = r1;
        ?? r2 = new Enum("PAUSED", 2);
        z = r2;
        A = new xg1[]{r0, r1, r2};
    }

    public static xg1 valueOf(String str) {
        return (xg1) Enum.valueOf(xg1.class, str);
    }

    public static xg1[] values() {
        return (xg1[]) A.clone();
    }
}
