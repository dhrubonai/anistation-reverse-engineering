package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ta0 {
    public static final /* synthetic */ ta0[] A;
    public static final ta0 x;
    public static final ta0 y;
    public static final ta0 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [ta0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ta0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ta0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("SUSPEND", 0);
        x = r0;
        ?? r1 = new Enum("DROP_OLDEST", 1);
        y = r1;
        ?? r2 = new Enum("DROP_LATEST", 2);
        z = r2;
        A = new ta0[]{r0, r1, r2};
    }

    public static ta0 valueOf(String str) {
        return (ta0) Enum.valueOf(ta0.class, str);
    }

    public static ta0[] values() {
        return (ta0[]) A.clone();
    }
}
