package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w11 {
    public static final /* synthetic */ w11[] A;
    public static final w11 x;
    public static final w11 y;
    public static final w11 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, w11] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, w11] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, w11] */
    static {
        ?? r0 = new Enum("COROUTINE_SUSPENDED", 0);
        x = r0;
        ?? r1 = new Enum("UNDECIDED", 1);
        y = r1;
        ?? r2 = new Enum("RESUMED", 2);
        z = r2;
        A = new w11[]{r0, r1, r2};
    }

    public static w11 valueOf(String str) {
        return (w11) Enum.valueOf(w11.class, str);
    }

    public static w11[] values() {
        return (w11[]) A.clone();
    }
}
