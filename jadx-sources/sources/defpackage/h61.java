package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class h61 {
    public static final /* synthetic */ h61[] A;
    public static final h61 x;
    public static final h61 y;
    public static final h61 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [h61, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h61, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h61, java.lang.Enum] */
    static {
        ?? r0 = new Enum("WHITESPACE_SEPARATED", 0);
        x = r0;
        ?? r1 = new Enum("ARRAY_WRAPPED", 1);
        y = r1;
        ?? r2 = new Enum("AUTO_DETECT", 2);
        z = r2;
        A = new h61[]{r0, r1, r2};
    }

    public static h61 valueOf(String str) {
        return (h61) Enum.valueOf(h61.class, str);
    }

    public static h61[] values() {
        return (h61[]) A.clone();
    }
}
