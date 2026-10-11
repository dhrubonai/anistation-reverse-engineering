package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tg1 {
    public static final /* synthetic */ tg1[] A;
    public static final tg1 x;
    public static final tg1 y;
    public static final tg1 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tg1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tg1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tg1] */
    static {
        ?? r0 = new Enum("Vertical", 0);
        x = r0;
        ?? r1 = new Enum("Horizontal", 1);
        y = r1;
        ?? r2 = new Enum("Both", 2);
        z = r2;
        A = new tg1[]{r0, r1, r2};
    }

    public static tg1 valueOf(String str) {
        return (tg1) Enum.valueOf(tg1.class, str);
    }

    public static tg1[] values() {
        return (tg1[]) A.clone();
    }
}
