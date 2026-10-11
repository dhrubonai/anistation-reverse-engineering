package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xa5 {
    public static final xa5 x;
    public static final xa5 y;
    public static final /* synthetic */ xa5[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xa5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xa5] */
    static {
        ?? r0 = new Enum("FILL", 0);
        x = r0;
        ?? r1 = new Enum("FIT", 1);
        y = r1;
        z = new xa5[]{r0, r1};
    }

    public static xa5 valueOf(String str) {
        return (xa5) Enum.valueOf(xa5.class, str);
    }

    public static xa5[] values() {
        return (xa5[]) z.clone();
    }
}
