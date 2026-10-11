package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eo5 {
    public static final /* synthetic */ eo5[] A;
    public static final eo5 x;
    public static final eo5 y;
    public static final eo5 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eo5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eo5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, eo5] */
    static {
        ?? r0 = new Enum("Hidden", 0);
        x = r0;
        ?? r1 = new Enum("Expanded", 1);
        y = r1;
        ?? r2 = new Enum("PartiallyExpanded", 2);
        z = r2;
        A = new eo5[]{r0, r1, r2};
    }

    public static eo5 valueOf(String str) {
        return (eo5) Enum.valueOf(eo5.class, str);
    }

    public static eo5[] values() {
        return (eo5[]) A.clone();
    }
}
