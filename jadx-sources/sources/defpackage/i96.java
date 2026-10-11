package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i96 {
    public static final i96 A;
    public static final /* synthetic */ i96[] B;
    public static final i96 x;
    public static final i96 y;
    public static final i96 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i96] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i96] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i96] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, i96] */
    static {
        ?? r0 = new Enum("Start", 0);
        x = r0;
        ?? r1 = new Enum("End", 1);
        y = r1;
        ?? r2 = new Enum("Inner", 2);
        z = r2;
        ?? r3 = new Enum("NotByUser", 3);
        A = r3;
        B = new i96[]{r0, r1, r2, r3};
    }

    public static i96 valueOf(String str) {
        return (i96) Enum.valueOf(i96.class, str);
    }

    public static i96[] values() {
        return (i96[]) B.clone();
    }
}
