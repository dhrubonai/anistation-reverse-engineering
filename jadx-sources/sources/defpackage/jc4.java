package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jc4 {
    public static final /* synthetic */ jc4[] A;
    public static final jc4 x;
    public static final jc4 y;
    public static final jc4 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jc4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jc4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jc4] */
    static {
        ?? r0 = new Enum("NO_OP", 0);
        x = r0;
        ?? r1 = new Enum("ADD", 1);
        y = r1;
        ?? r2 = new Enum("REMOVE", 2);
        z = r2;
        A = new jc4[]{r0, r1, r2};
    }

    public static jc4 valueOf(String str) {
        return (jc4) Enum.valueOf(jc4.class, str);
    }

    public static jc4[] values() {
        return (jc4[]) A.clone();
    }
}
