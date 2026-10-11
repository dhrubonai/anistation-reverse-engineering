package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gh5 {
    public static final /* synthetic */ gh5[] A;
    public static final gh5 x;
    public static final gh5 y;
    public static final gh5 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gh5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gh5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, gh5] */
    static {
        ?? r0 = new Enum("Left", 0);
        x = r0;
        ?? r1 = new Enum("Middle", 1);
        y = r1;
        ?? r2 = new Enum("Right", 2);
        z = r2;
        A = new gh5[]{r0, r1, r2};
    }

    public static gh5 valueOf(String str) {
        return (gh5) Enum.valueOf(gh5.class, str);
    }

    public static gh5[] values() {
        return (gh5[]) A.clone();
    }
}
