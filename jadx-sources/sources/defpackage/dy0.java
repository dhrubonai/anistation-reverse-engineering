package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dy0 {
    public static final dy0 x;
    public static final dy0 y;
    public static final /* synthetic */ dy0[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dy0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dy0] */
    static {
        ?? r0 = new Enum("VIEW_APPEAR", 0);
        x = r0;
        ?? r1 = new Enum("VIEW_DISAPPEAR", 1);
        y = r1;
        z = new dy0[]{r0, r1};
    }

    public static dy0 valueOf(String str) {
        return (dy0) Enum.valueOf(dy0.class, str);
    }

    public static dy0[] values() {
        return (dy0[]) z.clone();
    }
}
