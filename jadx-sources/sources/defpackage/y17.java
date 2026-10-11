package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y17 {
    public static final /* synthetic */ y17[] A;
    public static final y17 x;
    public static final y17 y;
    public static final y17 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y17] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y17] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y17] */
    static {
        ?? r0 = new Enum("STANDARD", 0);
        x = r0;
        ?? r1 = new Enum("SHIRO_DIRECT", 1);
        y = r1;
        ?? r2 = new Enum("SHIRO_PROXY_FALLBACK", 2);
        z = r2;
        A = new y17[]{r0, r1, r2};
    }

    public static y17 valueOf(String str) {
        return (y17) Enum.valueOf(y17.class, str);
    }

    public static y17[] values() {
        return (y17[]) A.clone();
    }
}
