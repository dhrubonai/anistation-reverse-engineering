package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xa3 {
    public static final /* synthetic */ xa3[] A;
    public static final xa3 x;
    public static final xa3 y;
    public static final xa3 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xa3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xa3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xa3] */
    static {
        ?? r0 = new Enum("InMeasureBlock", 0);
        x = r0;
        ?? r1 = new Enum("InLayoutBlock", 1);
        y = r1;
        ?? r2 = new Enum("NotUsed", 2);
        z = r2;
        A = new xa3[]{r0, r1, r2};
    }

    public static xa3 valueOf(String str) {
        return (xa3) Enum.valueOf(xa3.class, str);
    }

    public static xa3[] values() {
        return (xa3[]) A.clone();
    }
}
