package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jf3 {
    public static final /* synthetic */ jf3[] A;
    public static final jf3 x;
    public static final jf3 y;
    public static final jf3 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jf3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jf3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jf3] */
    static {
        ?? r0 = new Enum("SYNCHRONIZED", 0);
        x = r0;
        ?? r1 = new Enum("PUBLICATION", 1);
        y = r1;
        ?? r2 = new Enum("NONE", 2);
        z = r2;
        A = new jf3[]{r0, r1, r2};
    }

    public static jf3 valueOf(String str) {
        return (jf3) Enum.valueOf(jf3.class, str);
    }

    public static jf3[] values() {
        return (jf3[]) A.clone();
    }
}
