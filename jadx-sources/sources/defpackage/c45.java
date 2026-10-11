package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c45 {
    public static final c45 x;
    public static final c45 y;
    public static final /* synthetic */ c45[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c45] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c45] */
    static {
        ?? r0 = new Enum("Ltr", 0);
        x = r0;
        ?? r1 = new Enum("Rtl", 1);
        y = r1;
        z = new c45[]{r0, r1};
    }

    public static c45 valueOf(String str) {
        return (c45) Enum.valueOf(c45.class, str);
    }

    public static c45[] values() {
        return (c45[]) z.clone();
    }
}
